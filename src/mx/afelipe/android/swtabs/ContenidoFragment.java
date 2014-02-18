package mx.afelipe.android.swtabs;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class ContenidoFragment extends Fragment implements OnClickListener{
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_contenido, container, false);
        
        Button okayButton = (Button) rootView.findViewById(R.id.okayButton);
        okayButton.setOnClickListener(this); //asociamos el manejador del evento para el boton
        //o aqui puede implementarse el evento click como regularmente se hace en un Activity 
        
        return rootView;
    }
	
	//AQUI manejamos los eventos con el apoyo de un Switch para identificar que elemento ha sido presionado
	@Override
    public void onClick(View v) {
        switch (v.getId()) {
        case R.id.okayButton:
        	Toast.makeText(getActivity().getApplicationContext(), "Manejando el evento desde el fragment", Toast.LENGTH_SHORT).show();
            break;
        }
    }
}
