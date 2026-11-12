package defpackage;

import android.view.View;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
public class b6l {
    public static jz6 b(View view, bg4<Object> bg4Var) {
        return c6l.a(view).X(500L, TimeUnit.MILLISECONDS).H(ua1.c()).N(bg4Var);
    }

    public static <T> w5h<T, T> c() {
        return new w5h() { // from class: y5l
            @Override // defpackage.w5h
            public final o5h a(o4h o4hVar) {
                return b6l.d(o4hVar);
            }
        };
    }

    public static /* synthetic */ o5h d(o4h o4hVar) {
        return o4hVar.S(ofl.c()).H(ua1.c());
    }
}
