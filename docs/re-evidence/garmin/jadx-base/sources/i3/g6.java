package i3;

import android.view.KeyEvent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class g6 implements e23.l<z4.b, Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f88189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f88190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f88191c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3.p1<Boolean> f88192d;

    public g6(String str, e23.a<Unit> aVar, boolean z14, p3.p1<Boolean> p1Var) {
        this.f88189a = str;
        this.f88190b = aVar;
        this.f88191c = z14;
        this.f88192d = p1Var;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003f  */
    /* JADX WARN: Code duplicated, block: B:11:0x0043  */
    /* JADX WARN: Code duplicated, block: B:13:0x0049  */
    /* JADX WARN: Code duplicated, block: B:8:0x0030  */
    @Override // e23.l
    public final Boolean invoke(z4.b bVar) {
        boolean zG;
        e23.a<Unit> aVar;
        KeyEvent keyEvent = bVar.f202306a;
        int i14 = h6.f88295a;
        int iB = z4.d.b(keyEvent);
        z4.c.f202307b.getClass();
        int i15 = z4.c.f202308c;
        String str = this.f88189a;
        if (iB == i15) {
            if (h6.c(keyEvent)) {
                y5.f90403b.getClass();
                zG = p005kotlin.jvm.internal.s.g(str, y5.f90405d);
                aVar = this.f88190b;
                if (!zG) {
                    aVar.invoke();
                } else if (h6.c(keyEvent)) {
                    aVar.invoke();
                    return Boolean.TRUE;
                }
            } else {
                long jA = z4.f.a(keyEvent.getKeyCode());
                z4.a.f202280b.getClass();
                if (z4.a.a(jA, z4.a.f202297s)) {
                    y5.f90403b.getClass();
                    zG = p005kotlin.jvm.internal.s.g(str, y5.f90405d);
                    aVar = this.f88190b;
                    if (!zG) {
                        aVar.invoke();
                    } else if (h6.c(keyEvent)) {
                        aVar.invoke();
                        return Boolean.TRUE;
                    }
                }
            }
        }
        y5.f90403b.getClass();
        boolean zG2 = p005kotlin.jvm.internal.s.g(str, y5.f90405d);
        p3.p1<Boolean> p1Var = this.f88192d;
        if (zG2 && this.f88191c) {
            long jA2 = z4.f.a(keyEvent.getKeyCode());
            z4.a.f202280b.getClass();
            if (z4.a.a(jA2, z4.a.f202296r) || z4.a.a(z4.f.a(keyEvent.getKeyCode()), z4.a.f202285g) || z4.a.a(z4.f.a(keyEvent.getKeyCode()), z4.a.f202284f)) {
                Boolean bool = Boolean.TRUE;
                p1Var.setValue(bool);
                return bool;
            }
        }
        Boolean bool2 = Boolean.FALSE;
        p1Var.setValue(bool2);
        return bool2;
    }
}
