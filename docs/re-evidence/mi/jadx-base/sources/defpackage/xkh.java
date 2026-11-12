package defpackage;

import java.io.IOException;
import org.json.JSONException;

/* JADX INFO: loaded from: classes11.dex */
public abstract class xkh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public xkh f39215a;

    public abstract ork a(int i, String str) throws JSONException, IOException;

    public void b(xkh xkhVar) {
        xkh xkhVar2 = this.f39215a;
        if (xkhVar2 == null) {
            this.f39215a = xkhVar;
        } else {
            xkhVar2.b(xkhVar);
        }
    }
}
