package p006l2;

import android.view.InputDevice;
import android.view.KeyEvent;
import e23.l;
import kotlin.m3;
import m4.g;
import m4.q;
import p005kotlin.Metadata;
import z4.b;
import z4.c;
import z4.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class v2 implements l<b, Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f108829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b2 f108830b;

    public v2(q qVar, b2 b2Var) {
        this.f108829a = qVar;
        this.f108830b = b2Var;
    }

    @Override // e23.l
    public final Boolean invoke(b bVar) {
        KeyEvent keyEvent = bVar.f202306a;
        InputDevice device = keyEvent.getDevice();
        boolean zL = false;
        if (device != null && device.supportsSource(513) && (!device.isVirtual() || keyEvent.getSource() == 33554433)) {
            int iB = d.b(keyEvent);
            c.f202307b.getClass();
            if (iB == c.f202309d && keyEvent.getSource() != 257) {
                boolean zM = gg.b.m(19, keyEvent);
                q qVar = this.f108829a;
                if (zM) {
                    g.f116466b.getClass();
                    zL = qVar.l(g.f116471g);
                } else if (gg.b.m(20, keyEvent)) {
                    g.f116466b.getClass();
                    zL = qVar.l(g.f116472h);
                } else if (gg.b.m(21, keyEvent)) {
                    g.f116466b.getClass();
                    zL = qVar.l(g.f116469e);
                } else if (gg.b.m(22, keyEvent)) {
                    g.f116466b.getClass();
                    zL = qVar.l(g.f116470f);
                } else if (gg.b.m(23, keyEvent)) {
                    m3 m3Var = this.f108830b.f108393c;
                    if (m3Var != null) {
                        m3Var.show();
                    }
                    zL = true;
                }
            }
        }
        return Boolean.valueOf(zL);
    }
}
