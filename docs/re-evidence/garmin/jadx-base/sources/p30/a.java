package p30;

import android.view.View;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lp30/a;", "Lu20/a;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends u20.a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TextView f135395o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TextView f135396p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final TextView f135397q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(View view2) {
        super(view2);
        view2.getClass();
        TextView textView = (TextView) view2.findViewById(R.id.avg_grade_value);
        this.f135395o = textView;
        this.f135396p = (TextView) view2.findViewById(R.id.avg_grade_label);
        this.f135397q = (TextView) view2.findViewById(R.id.avg_grade_percent);
        this.f167874k = this.f167874k && textView != null;
    }
}
