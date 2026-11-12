package ya1;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p008y1.y0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lya1/c;", "", "Landroid/view/View;", "rootView", "", "currentWeight", "Lkotlin/Function1;", "", "weightChangeListener", "<init>", "(Landroid/view/View;DLe23/l;)V", "gcm-power-guide_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.l<Double, Unit> f195538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f195539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f195540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f195541d;

    /* JADX WARN: Multi-variable type inference failed */
    public c(View view2, double d14, e23.l<? super Double, Unit> lVar) {
        view2.getClass();
        this.f195538a = lVar;
        this.f195539b = view2.getContext();
        TextView textView = (TextView) view2.findViewById(R.id.label_top);
        this.f195540c = (TextView) view2.findViewById(R.id.label_bottom);
        this.f195541d = d14;
        textView.setText(R.string.power_guide_title_select_bike_weight);
        a(d14);
        view2.setOnClickListener(new xp0.d(this, 8));
    }

    public final void a(double d14) {
        this.f195541d = d14;
        boolean z14 = am.j.z(f12.l.f68084a);
        l3.a aVar = l3.f23124b;
        aVar.getClass();
        String strC1 = l3.a.C1(aVar, this.f195539b, d14, z14, true, l3.f23130h, 32);
        TextView textView = this.f195540c;
        textView.setText(strC1);
        v22.d.d(textView, new y0(25));
    }
}
