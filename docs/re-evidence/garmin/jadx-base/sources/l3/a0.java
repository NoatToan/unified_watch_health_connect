package l3;

import android.view.KeyEvent;
import i3.ij;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class a0 implements e23.l<z4.b, Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ij f109170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3.p1<Boolean> f109171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f109172c;

    public a0(ij ijVar, p3.p1<Boolean> p1Var, boolean z14) {
        this.f109170a = ijVar;
        this.f109171b = p1Var;
        this.f109172c = z14;
    }

    @Override // e23.l
    public final Boolean invoke(z4.b bVar) {
        KeyEvent keyEvent = bVar.f202306a;
        ij ijVar = this.f109170a;
        boolean zIsVisible = ijVar.isVisible();
        p3.p1<Boolean> p1Var = this.f109171b;
        if (!zIsVisible) {
            p1Var.setValue(Boolean.FALSE);
        }
        if (this.f109172c) {
            int iB = z4.d.b(keyEvent);
            z4.c.f202307b.getClass();
            if (iB == z4.c.f202309d) {
                long jA = z4.f.a(keyEvent.getKeyCode());
                z4.a.f202280b.getClass();
                if (z4.a.a(jA, z4.a.f202296r) && ijVar.isVisible()) {
                    Boolean bool = Boolean.TRUE;
                    p1Var.setValue(bool);
                    return bool;
                }
            }
        }
        return Boolean.FALSE;
    }
}
