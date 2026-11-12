package androidx.core.view;

import android.text.TextUtils;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class p0 extends s0.b<CharSequence> {
    public p0(int i14, Class cls, int i15, int i16) {
        super(i14, cls, i15, i16);
    }

    @Override // androidx.core.view.s0.b
    public final CharSequence a(View view2) {
        return s0.h.a(view2);
    }

    @Override // androidx.core.view.s0.b
    public final void b(View view2, CharSequence charSequence) {
        s0.h.e(view2, charSequence);
    }

    @Override // androidx.core.view.s0.b
    public final boolean e(CharSequence charSequence, CharSequence charSequence2) {
        return !TextUtils.equals(charSequence, charSequence2);
    }
}
