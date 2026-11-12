package vg1;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes10.dex */
public class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f178208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f178209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f178210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f178211d;

    public x(View view2) {
        this.f178208a = view2;
        if (view2 != null) {
            this.f178210c = (ImageView) view2.findViewById(R.id.settings_icon);
            this.f178209b = (TextView) view2.findViewById(R.id.settings_label);
            this.f178211d = view2.findViewById(R.id.bottom_divider);
        }
    }

    public final void a(int i14, int i15) {
        ImageView imageView = this.f178210c;
        if (imageView != null && i14 != -1) {
            imageView.setImageResource(i14);
        }
        TextView textView = this.f178209b;
        if (textView != null) {
            textView.setText(i15);
        }
    }

    public final void b(int i14, String str) {
        ImageView imageView = this.f178210c;
        if (imageView != null && i14 != -1) {
            imageView.setImageResource(i14);
        }
        TextView textView = this.f178209b;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public final void c(View.OnClickListener onClickListener) {
        View view2 = this.f178208a;
        if (view2 != null) {
            view2.setOnClickListener(onClickListener);
        }
    }

    public final void d() {
        View view2 = this.f178208a;
        if (view2 != null) {
            view2.setVisibility(0);
        }
    }
}
