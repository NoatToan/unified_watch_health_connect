package lz2;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import lz2.c.a;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import w63.g;

/* JADX INFO: loaded from: classes2.dex */
public class b implements Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f115410a;

    public b(c cVar) {
        this.f115410a = cVar;
    }

    @Override // okhttp3.Callback
    public final void onFailure(Call call, IOException iOException) {
        c.a(this.f115410a, iOException, null);
    }

    @Override // okhttp3.Callback
    public final void onResponse(Call call, Response response) {
        boolean zIsSuccessful = response.isSuccessful();
        c cVar = this.f115410a;
        if (!zIsSuccessful) {
            c.a(cVar, new IOException(response.message()), response);
            return;
        }
        cVar.getClass();
        c.a aVar = cVar.new a(response.body().getBodySource());
        cVar.f115415e = aVar;
        g gVar = aVar.f115418b;
        if (gVar != null) {
            gVar.getF183401b().timeout(0L, TimeUnit.MILLISECONDS);
        }
        cVar.f115411a.d(cVar);
        while (true) {
            Call call2 = cVar.f115414d;
            if (call2 == null || call2.getCanceled()) {
                return;
            }
            c.a aVar2 = cVar.f115415e;
            aVar2.getClass();
            try {
                aVar2.b(aVar2.f115418b.s1());
            } catch (IOException e4) {
                c.a(c.this, e4, null);
                return;
            }
        }
    }
}
