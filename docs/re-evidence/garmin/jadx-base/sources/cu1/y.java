package cu1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcu1/y;", "Lcu1/x;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class y extends x {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f55721d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ViewGroup f55722e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ImageView f55723f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageView f55724g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f55725h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f55726i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(View view2) {
        super(view2);
        view2.getClass();
        this.f55721d = view2;
        this.f55722e = (ViewGroup) view2.findViewById(R.id.card_root_layout);
        this.f55723f = (ImageView) view2.findViewById(R.id.feed_item_image);
        this.f55724g = (ImageView) view2.findViewById(R.id.feed_item_video_button);
        this.f55725h = (TextView) view2.findViewById(R.id.feed_item_title);
        this.f55726i = (TextView) view2.findViewById(R.id.feed_item_info);
    }

    public final void d() {
        Context context = this.f55721d.getContext();
        context.getClass();
        zp0.c cVar = new zp0.c(context);
        cVar.f206567g = R.drawable.round_image_bkg_black;
        ImageView imageView = this.f55723f;
        imageView.getClass();
        cVar.h(imageView);
        this.f55722e.setOnClickListener(null);
        this.f55725h.setText("");
        ImageView imageView2 = this.f55724g;
        imageView2.getClass();
        imageView2.setVisibility(8);
    }
}
