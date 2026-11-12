package wr2;

import android.view.View;
import android.widget.TextView;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lwr2/x;", "Lwr2/v;", "Landroid/widget/TextView;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class x implements v<TextView> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f186893a;

    public x(int i14) {
        this.f186893a = i14;
    }

    @Override // wr2.v
    public final void x0(View view2) {
        TextView textView = (TextView) view2;
        textView.getClass();
        textView.setVisibility(0);
        textView.setText(this.f186893a);
    }
}
