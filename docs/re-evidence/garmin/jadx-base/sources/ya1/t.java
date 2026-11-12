package ya1;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lya1/t;", "", "Landroid/view/View;", "rootView", "", "currentWeight", "Lkotlin/Function1;", "", "weightChangeListener", "<init>", "(Landroid/view/View;DLe23/l;)V", "gcm-power-guide_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.l<Double, Unit> f195611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f195612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f195613c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f195614d;

    /* JADX WARN: Multi-variable type inference failed */
    public t(View view2, double d14, e23.l<? super Double, Unit> lVar) {
        view2.getClass();
        this.f195611a = lVar;
        Context context = view2.getContext();
        this.f195612b = context;
        TextView textView = (TextView) view2.findViewById(R.id.label_top);
        TextView textView2 = (TextView) view2.findViewById(R.id.label_bottom);
        this.f195613c = textView2;
        this.f195614d = d14;
        textView.setText(R.string.lbl_rider_weight);
        this.f195614d = d14;
        context.getClass();
        textView2.setText(xa1.h.a(context, this.f195614d));
        v22.d.d(textView2, new h(2));
        view2.setOnClickListener(new xp0.d(this, 12));
    }
}
