package um;

import android.view.View;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lum/c;", "", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f171987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f171988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f171989c;

    public c(View view2) {
        this.f171987a = view2 != null ? (TextView) view2.findViewById(R.id.time_label) : null;
        this.f171988b = view2 != null ? (TextView) view2.findViewById(R.id.value_label) : null;
        TextView textView = view2 != null ? (TextView) view2.findViewById(R.id.overlay_value_label) : null;
        this.f171989c = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    public final void a(String str, String str2, String str3) {
        TextView textView;
        if (str != null && (textView = this.f171988b) != null) {
            textView.setText(str);
        }
        if (str2 != null) {
            TextView textView2 = this.f171989c;
            if (textView2 != null) {
                textView2.setText(str2);
            }
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
        }
        TextView textView3 = this.f171987a;
        if (textView3 != null) {
            textView3.setText(str3);
        }
    }
}
