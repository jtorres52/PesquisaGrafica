package pesquisa;

import java.util.List;

public class AStar implements Algoritmo {
	@Override
	public void insere(List<No> lista, No no) {
			for (int i=0; i< lista.size(); i++) {
				No n = lista.get(i);
				if (n.f() >= no.f()) {
					lista.add( i, no);
					return;
				}
			}
			lista.add( no);
		}
	public boolean espera() {
		return true;
	}


}
