package p006l2;

import android.view.KeyEvent;
import p005kotlin.Metadata;
import z4.f;

/* JADX INFO: loaded from: classes.dex */
public final class w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f108857a = new a();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"l2/w1$a", "Ll2/t1;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements t1 {
        @Override // p006l2.t1
        public final s1 a(KeyEvent keyEvent) {
            s1 s1Var = null;
            if (keyEvent.isShiftPressed() && keyEvent.isAltPressed()) {
                long jA = f.a(keyEvent.getKeyCode());
                z4.a.f202280b.getClass();
                if (z4.a.a(jA, z4.a.f202286h)) {
                    s1Var = s1.SELECT_LINE_LEFT;
                } else if (z4.a.a(jA, z4.a.f202287i)) {
                    s1Var = s1.SELECT_LINE_RIGHT;
                } else if (z4.a.a(jA, z4.a.f202284f)) {
                    s1Var = s1.SELECT_HOME;
                } else if (z4.a.a(jA, z4.a.f202285g)) {
                    s1Var = s1.SELECT_END;
                }
            } else if (keyEvent.isAltPressed()) {
                long jA2 = f.a(keyEvent.getKeyCode());
                z4.a.f202280b.getClass();
                if (z4.a.a(jA2, z4.a.f202286h)) {
                    s1Var = s1.LINE_LEFT;
                } else if (z4.a.a(jA2, z4.a.f202287i)) {
                    s1Var = s1.LINE_RIGHT;
                } else if (z4.a.a(jA2, z4.a.f202284f)) {
                    s1Var = s1.HOME;
                } else if (z4.a.a(jA2, z4.a.f202285g)) {
                    s1Var = s1.END;
                }
            }
            return s1Var == null ? v1.f108826a.a(keyEvent) : s1Var;
        }
    }
}
