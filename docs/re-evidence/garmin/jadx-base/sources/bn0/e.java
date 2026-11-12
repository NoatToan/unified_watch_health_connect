package bn0;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lbn0/e;", "", "Landroid/view/View;", "view", "Lcom/garmin/android/apps/connectmobile/groupride/a;", "formatter", "<init>", "(Landroid/view/View;Lcom/garmin/android/apps/connectmobile/groupride/a;)V", "gcm-group-ride_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.groupride.a f18978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f18979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f18980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ViewGroup f18981d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ViewGroup f18982e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f18983f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f18984g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f18985h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ViewGroup f18986i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f18987j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final TextView f18988k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Button f18989l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Button f18990m;

    public e(View view2, com.garmin.android.apps.connectmobile.groupride.a aVar) {
        view2.getClass();
        aVar.getClass();
        this.f18978a = aVar;
        this.f18979b = (TextView) view2.findViewById(R.id.code);
        this.f18980c = (TextView) view2.findViewById(R.id.details_section_header);
        this.f18981d = (ViewGroup) view2.findViewById(R.id.ride_section);
        this.f18982e = (ViewGroup) view2.findViewById(R.id.ride_date_time_section);
        this.f18983f = (TextView) view2.findViewById(R.id.ride_name_detail);
        this.f18984g = (TextView) view2.findViewById(R.id.ride_date_time_detail);
        this.f18985h = (TextView) view2.findViewById(R.id.course_section_header);
        this.f18986i = (ViewGroup) view2.findViewById(R.id.course_section);
        this.f18987j = (TextView) view2.findViewById(R.id.ride_course);
        this.f18988k = (TextView) view2.findViewById(R.id.ride_course_detail);
        this.f18989l = (Button) view2.findViewById(R.id.share_button);
        this.f18990m = (Button) view2.findViewById(R.id.send_to_device_button);
    }

    public final void a(String str) {
        this.f18979b.setText(str);
        TextView textView = this.f18980c;
        textView.getClass();
        textView.setVisibility(8);
        ViewGroup viewGroup = this.f18981d;
        viewGroup.getClass();
        viewGroup.setVisibility(8);
        ViewGroup viewGroup2 = this.f18982e;
        viewGroup2.getClass();
        viewGroup2.setVisibility(8);
        TextView textView2 = this.f18985h;
        textView2.getClass();
        textView2.setVisibility(8);
        ViewGroup viewGroup3 = this.f18986i;
        viewGroup3.getClass();
        viewGroup3.setVisibility(8);
        Button button = this.f18990m;
        button.getClass();
        button.setVisibility(8);
        Button button2 = this.f18989l;
        button2.getClass();
        button2.setVisibility(8);
    }
}
