package k32;

import android.view.View;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lk32/h;", "", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f102692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f102693b;

    public h(View view2) {
        view2.getClass();
        TextView textView = (TextView) view2.findViewById(R.id.group_header_text);
        this.f102692a = textView;
        TextView textView2 = (TextView) view2.findViewById(R.id.group_header_action);
        this.f102693b = textView2;
        if (textView != null) {
            textView.setVisibility(0);
        }
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
    }
}
