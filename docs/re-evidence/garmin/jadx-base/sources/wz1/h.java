package wz1;

import android.view.KeyEvent;
import e23.l;
import h2.j0;
import o53.b0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class h implements l<z4.b, Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b0 f188195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0 f188196b;

    public h(b0 b0Var, j0 j0Var) {
        this.f188195a = b0Var;
        this.f188196b = j0Var;
    }

    @Override // e23.l
    public final Boolean invoke(z4.b bVar) {
        KeyEvent keyEvent = bVar.f202306a;
        keyEvent.getClass();
        int iB = z4.d.b(keyEvent);
        z4.c.f202307b.getClass();
        boolean z14 = false;
        if (iB == z4.c.f202309d) {
            long jA = z4.f.a(keyEvent.getKeyCode());
            z4.a.f202280b.getClass();
            boolean zA = z4.a.a(jA, z4.a.f202287i);
            b0 b0Var = this.f188195a;
            j0 j0Var = this.f188196b;
            if (zA) {
                ge1.b.T(b0Var, null, null, new f(j0Var, null), 3);
            } else if (z4.a.a(jA, z4.a.f202286h)) {
                ge1.b.T(b0Var, null, null, new g(j0Var, null), 3);
            }
            z14 = true;
        }
        return Boolean.valueOf(z14);
    }
}
