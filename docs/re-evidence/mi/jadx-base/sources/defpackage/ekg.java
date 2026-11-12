package defpackage;

import defpackage.yk9;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public interface ekg<FETCH_STATE extends yk9> {

    public interface a {
        void a();

        void b(InputStream inputStream, int i) throws IOException;

        void onFailure(Throwable th);
    }

    boolean a(FETCH_STATE fetch_state);

    FETCH_STATE b(cg4<o98> cg4Var, ebi ebiVar);

    Map<String, String> c(FETCH_STATE fetch_state, int i);

    void d(FETCH_STATE fetch_state, int i);

    void e(FETCH_STATE fetch_state, a aVar);
}
