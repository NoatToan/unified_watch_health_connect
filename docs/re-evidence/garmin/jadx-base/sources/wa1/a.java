package wa1;

import am.j;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import vg1.z0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lwa1/a;", "", "Landroid/view/View;", "rootView", "Lkotlin/Function1;", "", "", "weightChangeListener", "<init>", "(Landroid/view/View;Le23/l;)V", "gcm-power-guide_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f183783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l<Double, Unit> f183784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f183785c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f183786d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f183787e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f183788f;

    /* JADX WARN: Multi-variable type inference failed */
    public a(View view2, l<? super Double, Unit> lVar) {
        view2.getClass();
        this.f183783a = view2;
        this.f183784b = lVar;
        this.f183785c = view2.getContext();
        TextView textView = (TextView) view2.findViewById(R.id.label_top);
        this.f183786d = textView;
        this.f183787e = (TextView) view2.findViewById(R.id.label_bottom);
        textView.setText(R.string.lbl_custom_weight);
        a(0.0d);
        view2.setOnClickListener(new z0(this, 11));
    }

    public final void a(double d14) {
        double d15;
        this.f183788f = d14;
        TextView textView = this.f183787e;
        if (d14 > 0.0d) {
            boolean z14 = j.z(f12.l.f68084a);
            l3.a aVar = l3.f23124b;
            aVar.getClass();
            d15 = d14;
            textView.setText(l3.a.C1(aVar, this.f183785c, d15, z14, true, l3.f23130h, 32));
        } else {
            d15 = d14;
            textView.setText(R.string.custom_weight_hint);
        }
        l<Double, Unit> lVar = this.f183784b;
        if (lVar != null) {
            lVar.invoke(Double.valueOf(d15));
        }
    }
}
