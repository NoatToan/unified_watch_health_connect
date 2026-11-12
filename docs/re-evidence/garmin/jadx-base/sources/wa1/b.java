package wa1;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import aq.b0;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lwa1/b;", "", "Landroid/view/View;", "rootView", "", "defaultFTP", "Lkotlin/Function1;", "", "ftpChangeListener", "<init>", "(Landroid/view/View;ILe23/l;)V", "gcm-power-guide_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f183789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l<Integer, Unit> f183790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f183791c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f183792d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f183793e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f183794f;

    /* JADX WARN: Multi-variable type inference failed */
    public b(View view2, int i14, l<? super Integer, Unit> lVar) {
        view2.getClass();
        this.f183789a = view2;
        this.f183790b = lVar;
        this.f183791c = view2.getContext();
        TextView textView = (TextView) view2.findViewById(R.id.label_top);
        this.f183792d = textView;
        this.f183793e = (TextView) view2.findViewById(R.id.label_bottom);
        this.f183794f = -1;
        textView.setText(R.string.lbl_functional_threshold_power_short);
        a(-1);
        view2.setOnClickListener(new b0(this, i14, 21));
    }

    public final void a(int i14) {
        this.f183794f = i14;
        TextView textView = this.f183793e;
        if (i14 > 0) {
            textView.setText(this.f183791c.getString(R.string.devices_lbl_watts_with_format, String.valueOf(i14)));
        } else {
            textView.setText(R.string.power_guide_ftp_hint);
        }
        l<Integer, Unit> lVar = this.f183790b;
        if (lVar != null) {
            lVar.invoke(Integer.valueOf(i14));
        }
    }
}
