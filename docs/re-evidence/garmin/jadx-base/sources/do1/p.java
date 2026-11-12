package do1;

import android.content.res.ColorStateList;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ldo1/p;", "", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f60610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f60611b;

    public p(View view2) {
        view2.getClass();
        View viewFindViewById = view2.findViewById(R.id.like_icon);
        viewFindViewById.getClass();
        this.f60611b = (ImageView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.like_count);
        viewFindViewById2.getClass();
        this.f60610a = (TextView) viewFindViewById2;
    }

    public final void a(int i14, boolean z14) {
        int i15 = i14 > 0 ? 0 : 8;
        ImageView imageView = this.f60611b;
        imageView.setVisibility(i15);
        TextView textView = this.f60610a;
        textView.setVisibility(i15);
        textView.setText(String.valueOf(i14));
        imageView.setImageResource(z14 ? R.drawable.favorite_fill : R.drawable.favorite_outline);
        imageView.setImageTintList(ColorStateList.valueOf(a7.b.getColor(imageView.getContext(), R.color.gcm_icon_primary_action)));
    }
}
