package p006l2;

import android.view.KeyEvent;
import e23.l;
import p005kotlin.Metadata;
import z4.a;
import z4.b;
import z4.d;
import z4.f;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ll2/u1;", "Ll2/t1;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class u1 implements t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l<b, Boolean> f108805a;

    /* JADX WARN: Multi-variable type inference failed */
    public u1(l<? super b, Boolean> lVar) {
        this.f108805a = lVar;
    }

    @Override // p006l2.t1
    public final s1 a(KeyEvent keyEvent) {
        b bVarA = b.a(keyEvent);
        l<b, Boolean> lVar = this.f108805a;
        if (lVar.invoke(bVarA).booleanValue() && keyEvent.isShiftPressed()) {
            long jA = f.a(keyEvent.getKeyCode());
            a.f202280b.getClass();
            if (a.a(jA, a.f202295q)) {
                return s1.REDO;
            }
            return null;
        }
        if (lVar.invoke(b.a(keyEvent)).booleanValue()) {
            long jA2 = d.a(keyEvent);
            a.C3769a c3769a = a.f202280b;
            c3769a.getClass();
            if (!a.a(jA2, a.f202290l)) {
                c3769a.getClass();
                if (!a.a(jA2, a.f202304z)) {
                    c3769a.getClass();
                    if (a.a(jA2, a.f202292n)) {
                        return s1.PASTE;
                    }
                    c3769a.getClass();
                    if (a.a(jA2, a.f202293o)) {
                        return s1.CUT;
                    }
                    c3769a.getClass();
                    if (a.a(jA2, a.f202289k)) {
                        return s1.SELECT_ALL;
                    }
                    c3769a.getClass();
                    if (a.a(jA2, a.f202294p)) {
                        return s1.REDO;
                    }
                    c3769a.getClass();
                    if (a.a(jA2, a.f202295q)) {
                        return s1.UNDO;
                    }
                    return null;
                }
            }
            return s1.COPY;
        }
        if (keyEvent.isCtrlPressed()) {
            return null;
        }
        if (keyEvent.isShiftPressed()) {
            long jA3 = f.a(keyEvent.getKeyCode());
            a.C3769a c3769a2 = a.f202280b;
            c3769a2.getClass();
            if (a.a(jA3, a.f202286h)) {
                return s1.SELECT_LEFT_CHAR;
            }
            c3769a2.getClass();
            if (a.a(jA3, a.f202287i)) {
                return s1.SELECT_RIGHT_CHAR;
            }
            c3769a2.getClass();
            if (a.a(jA3, a.f202284f)) {
                return s1.SELECT_UP;
            }
            c3769a2.getClass();
            if (a.a(jA3, a.f202285g)) {
                return s1.SELECT_DOWN;
            }
            c3769a2.getClass();
            if (a.a(jA3, a.E)) {
                return s1.SELECT_PAGE_UP;
            }
            c3769a2.getClass();
            if (a.a(jA3, a.F)) {
                return s1.SELECT_PAGE_DOWN;
            }
            c3769a2.getClass();
            if (a.a(jA3, a.f202302x)) {
                return s1.SELECT_LINE_START;
            }
            c3769a2.getClass();
            if (a.a(jA3, a.f202303y)) {
                return s1.SELECT_LINE_END;
            }
            c3769a2.getClass();
            if (a.a(jA3, a.f202304z)) {
                return s1.PASTE;
            }
            return null;
        }
        long jA4 = f.a(keyEvent.getKeyCode());
        a.C3769a c3769a3 = a.f202280b;
        c3769a3.getClass();
        if (a.a(jA4, a.f202286h)) {
            return s1.LEFT_CHAR;
        }
        c3769a3.getClass();
        if (a.a(jA4, a.f202287i)) {
            return s1.RIGHT_CHAR;
        }
        c3769a3.getClass();
        if (a.a(jA4, a.f202284f)) {
            return s1.UP;
        }
        c3769a3.getClass();
        if (a.a(jA4, a.f202285g)) {
            return s1.DOWN;
        }
        c3769a3.getClass();
        if (a.a(jA4, a.f202288j)) {
            return s1.CENTER;
        }
        c3769a3.getClass();
        if (a.a(jA4, a.E)) {
            return s1.PAGE_UP;
        }
        c3769a3.getClass();
        if (a.a(jA4, a.F)) {
            return s1.PAGE_DOWN;
        }
        c3769a3.getClass();
        if (a.a(jA4, a.f202302x)) {
            return s1.LINE_START;
        }
        c3769a3.getClass();
        if (a.a(jA4, a.f202303y)) {
            return s1.LINE_END;
        }
        c3769a3.getClass();
        if (!a.a(jA4, a.f202298t)) {
            c3769a3.getClass();
            if (!a.a(jA4, a.G)) {
                c3769a3.getClass();
                if (a.a(jA4, a.f202299u)) {
                    return s1.DELETE_PREV_CHAR;
                }
                c3769a3.getClass();
                if (a.a(jA4, a.f202300v)) {
                    return s1.DELETE_NEXT_CHAR;
                }
                c3769a3.getClass();
                if (a.a(jA4, a.C)) {
                    return s1.PASTE;
                }
                c3769a3.getClass();
                if (a.a(jA4, a.A)) {
                    return s1.CUT;
                }
                c3769a3.getClass();
                if (a.a(jA4, a.B)) {
                    return s1.COPY;
                }
                c3769a3.getClass();
                if (a.a(jA4, a.f202296r)) {
                    return s1.TAB;
                }
                return null;
            }
        }
        return s1.NEW_LINE;
    }
}
