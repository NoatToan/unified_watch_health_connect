package defpackage;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
public final class r70 extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f32272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m80 f32273b;
    public final int c;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public r70(int i, m80 m80Var, int i2) {
        this.f32272a = i;
        this.f32273b = m80Var;
        this.c = i2;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f32272a);
        this.f32273b.Y(this.c, bundle);
    }
}
