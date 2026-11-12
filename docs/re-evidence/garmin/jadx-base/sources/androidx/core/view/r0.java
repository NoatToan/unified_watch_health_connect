package androidx.core.view;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class r0 extends s0.b<Boolean> {
    public r0(int i14, Class cls, int i15) {
        super(i14, cls, i15);
    }

    @Override // androidx.core.view.s0.b
    public final Boolean a(View view2) {
        return Boolean.valueOf(s0.h.b(view2));
    }

    @Override // androidx.core.view.s0.b
    public final void b(View view2, Boolean bool) {
        s0.h.d(view2, bool.booleanValue());
    }

    @Override // androidx.core.view.s0.b
    public final boolean e(Boolean bool, Boolean bool2) {
        Boolean bool3 = bool;
        Boolean bool4 = bool2;
        return !((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue()));
    }
}
