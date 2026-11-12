package vg1;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes10.dex */
public class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f178080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f178081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f178082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f178083d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ProgressBar f178084e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View f178085f;

    public c0(View view2) {
        this.f178080a = view2;
        if (view2 != null) {
            this.f178082c = (ImageView) view2.findViewById(R.id.settings_icon);
            this.f178081b = (TextView) view2.findViewById(R.id.settings_label);
            TextView textView = (TextView) view2.findViewById(R.id.settings_badge);
            this.f178083d = textView;
            this.f178084e = (ProgressBar) view2.findViewById(R.id.settings_badge_async_progress);
            this.f178085f = view2.findViewById(R.id.bottom_divider);
            if (c22.b.a(view2.getContext()) >= 1.3f) {
                int iC = (int) c22.b.c(view2.getContext(), view2.getResources().getDimensionPixelSize(R.dimen.icon_default), 1.5f);
                textView.getLayoutParams().width = iC;
                textView.getLayoutParams().height = iC;
            }
        }
    }

    public final void a(String str) {
        TextView textView = this.f178083d;
        if (textView != null) {
            ProgressBar progressBar = this.f178084e;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
            if (TextUtils.isEmpty(str)) {
                textView.setVisibility(8);
                return;
            }
            textView.setVisibility(0);
            textView.setBackgroundResource(R.drawable.gcm3_blue_circle);
            textView.setText(str);
        }
    }
}
