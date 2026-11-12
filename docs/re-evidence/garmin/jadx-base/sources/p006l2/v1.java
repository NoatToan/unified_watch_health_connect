package p006l2;

import android.view.KeyEvent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.i0;
import z4.f;

/* JADX INFO: loaded from: classes.dex */
public final class v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f108826a = new b(new u1(new i0() { // from class: l2.v1.a
        @Override // p005kotlin.jvm.internal.i0, k23.n
        public final Object get(Object obj) {
            return Boolean.valueOf(((z4.b) obj).f202306a.isCtrlPressed());
        }
    }));

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"l2/v1$b", "Ll2/t1;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements t1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ t1 f108828a;

        public b(t1 t1Var) {
            this.f108828a = t1Var;
        }

        @Override // p006l2.t1
        public final s1 a(KeyEvent keyEvent) {
            s1 s1Var = null;
            if (keyEvent.isShiftPressed() && keyEvent.isCtrlPressed()) {
                long jA = f.a(keyEvent.getKeyCode());
                z4.a.f202280b.getClass();
                if (z4.a.a(jA, z4.a.f202286h)) {
                    s1Var = s1.SELECT_LEFT_WORD;
                } else if (z4.a.a(jA, z4.a.f202287i)) {
                    s1Var = s1.SELECT_RIGHT_WORD;
                } else if (z4.a.a(jA, z4.a.f202284f)) {
                    s1Var = s1.SELECT_PREV_PARAGRAPH;
                } else if (z4.a.a(jA, z4.a.f202285g)) {
                    s1Var = s1.SELECT_NEXT_PARAGRAPH;
                }
            } else if (keyEvent.isCtrlPressed()) {
                long jA2 = f.a(keyEvent.getKeyCode());
                z4.a.f202280b.getClass();
                if (z4.a.a(jA2, z4.a.f202286h)) {
                    s1Var = s1.LEFT_WORD;
                } else if (z4.a.a(jA2, z4.a.f202287i)) {
                    s1Var = s1.RIGHT_WORD;
                } else if (z4.a.a(jA2, z4.a.f202284f)) {
                    s1Var = s1.PREV_PARAGRAPH;
                } else if (z4.a.a(jA2, z4.a.f202285g)) {
                    s1Var = s1.NEXT_PARAGRAPH;
                } else if (z4.a.a(jA2, z4.a.f202291m)) {
                    s1Var = s1.DELETE_PREV_CHAR;
                } else if (z4.a.a(jA2, z4.a.f202300v)) {
                    s1Var = s1.DELETE_NEXT_WORD;
                } else if (z4.a.a(jA2, z4.a.f202299u)) {
                    s1Var = s1.DELETE_PREV_WORD;
                } else if (z4.a.a(jA2, z4.a.D)) {
                    s1Var = s1.DESELECT;
                }
            } else if (keyEvent.isShiftPressed()) {
                long jA3 = f.a(keyEvent.getKeyCode());
                z4.a.f202280b.getClass();
                if (z4.a.a(jA3, z4.a.f202302x)) {
                    s1Var = s1.SELECT_LINE_START;
                } else if (z4.a.a(jA3, z4.a.f202303y)) {
                    s1Var = s1.SELECT_LINE_END;
                }
            } else if (keyEvent.isAltPressed()) {
                long jA4 = f.a(keyEvent.getKeyCode());
                z4.a.f202280b.getClass();
                if (z4.a.a(jA4, z4.a.f202299u)) {
                    s1Var = s1.DELETE_FROM_LINE_START;
                } else if (z4.a.a(jA4, z4.a.f202300v)) {
                    s1Var = s1.DELETE_TO_LINE_END;
                }
            }
            return s1Var == null ? this.f108828a.a(keyEvent) : s1Var;
        }
    }
}
