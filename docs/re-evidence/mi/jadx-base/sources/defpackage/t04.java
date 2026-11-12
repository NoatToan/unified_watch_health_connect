package defpackage;

import android.content.Context;
import android.view.View;
import androidx.core.view.a;

/* JADX INFO: loaded from: classes5.dex */
public class t04 extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m80.a f34161a;

    public t04(Context context, int i) {
        this.f34161a = new m80.a(16, context.getString(i));
    }

    @Override // androidx.core.view.a
    public void onInitializeAccessibilityNodeInfo(View view, m80 m80Var) {
        super.onInitializeAccessibilityNodeInfo(view, m80Var);
        m80Var.b(this.f34161a);
    }
}
