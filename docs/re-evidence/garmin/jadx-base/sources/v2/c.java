package v2;

import android.view.InputDevice;
import android.view.KeyEvent;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import kotlin.m3;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lv2/c;", "Lv2/b2;", "<init>", "()V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c extends b2 {
    @Override // v2.b2
    public final boolean a(KeyEvent keyEvent, h2 h2Var, g2 g2Var, w2.n nVar, e23.l lVar, m3 m3Var, boolean z14, boolean z15, u1 u1Var) {
        int iB = z4.d.b(keyEvent);
        z4.c.f202307b.getClass();
        if (iB == z4.c.f202309d && keyEvent.isFromSource(TsExtractor.TS_STREAM_TYPE_AIT) && (!i.f(keyEvent) || !gl.b.H(keyEvent))) {
            nVar.f181378n.setValue(Boolean.FALSE);
        }
        return super.a(keyEvent, h2Var, g2Var, nVar, lVar, m3Var, z14, z15, u1Var);
    }

    @Override // v2.b2
    public final boolean b(KeyEvent keyEvent, h2 h2Var, w2.n nVar, m4.q qVar, m3 m3Var) {
        boolean zB = super.b(keyEvent, h2Var, nVar, qVar, m3Var);
        if (u1.g0.f167499f) {
            return zB;
        }
        if (zB) {
            return true;
        }
        InputDevice device = keyEvent.getDevice();
        if (device == null || !device.supportsSource(513) || device.isVirtual()) {
            return false;
        }
        int iB = z4.d.b(keyEvent);
        z4.c.f202307b.getClass();
        if (iB != z4.c.f202309d || keyEvent.getSource() == 257) {
            return false;
        }
        if (i.a(19, keyEvent)) {
            m4.g.f116466b.getClass();
            return qVar.l(m4.g.f116471g);
        }
        if (i.a(20, keyEvent)) {
            m4.g.f116466b.getClass();
            return qVar.l(m4.g.f116472h);
        }
        if (i.a(21, keyEvent)) {
            m4.g.f116466b.getClass();
            return qVar.l(m4.g.f116469e);
        }
        if (i.a(22, keyEvent)) {
            m4.g.f116466b.getClass();
            return qVar.l(m4.g.f116470f);
        }
        if (!i.a(23, keyEvent)) {
            return false;
        }
        m3Var.show();
        return true;
    }
}
