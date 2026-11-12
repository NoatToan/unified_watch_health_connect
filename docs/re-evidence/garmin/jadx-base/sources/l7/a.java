package l7;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f110559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f110560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f110561c;

    public a(int i14, f fVar, int i15) {
        this.f110559a = i14;
        this.f110560b = fVar;
        this.f110561c = i15;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view2) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f110559a);
        this.f110560b.f110563a.performAction(this.f110561c, bundle);
    }
}
