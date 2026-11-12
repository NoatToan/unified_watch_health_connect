package defpackage;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes5.dex */
public final class yk1 extends j1s {
    public final Context d;
    public final String e;

    public yk1(Context context, String str) {
        this.d = context;
        this.e = str;
    }

    @Override // defpackage.j1s
    public void b() {
        InputStream inputStreamOpen = null;
        try {
            try {
                inputStreamOpen = this.d.getAssets().open(this.e);
                d6q d6qVar = new d6q(inputStreamOpen);
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (IOException unused) {
                    }
                }
                k1s.f(d6qVar);
            } catch (IOException e) {
                throw new IllegalStateException(this.e + " missing from assets", e);
            }
        } catch (Throwable th) {
            if (inputStreamOpen != null) {
                try {
                    inputStreamOpen.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }
}
