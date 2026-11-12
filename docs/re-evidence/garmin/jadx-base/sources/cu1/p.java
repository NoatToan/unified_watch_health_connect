package cu1;

import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcu1/p;", "", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f55689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f55690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f55691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f55692d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final View f55693e;

    public p(View view2) {
        view2.getClass();
        this.f55689a = view2;
        this.f55690b = (ImageView) view2.findViewById(R.id.list_item_icon_left);
        this.f55691c = (TextView) view2.findViewById(android.R.id.text1);
        this.f55692d = (TextView) view2.findViewById(android.R.id.text2);
        this.f55693e = view2.findViewById(R.id.list_item_bottom_divider);
    }

    public final void a(LayerDrawable layerDrawable, String str, String str2, View.OnClickListener onClickListener) {
        ImageView imageView = this.f55690b;
        if (imageView != null && layerDrawable != null) {
            imageView.setImageDrawable(layerDrawable);
            imageView.setVisibility(0);
        }
        TextView textView = this.f55691c;
        if (textView != null) {
            textView.setText(str);
        }
        TextView textView2 = this.f55692d;
        if (textView2 != null) {
            textView2.setText(str2);
        }
        View view2 = this.f55693e;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        this.f55689a.setOnClickListener(onClickListener);
    }
}
