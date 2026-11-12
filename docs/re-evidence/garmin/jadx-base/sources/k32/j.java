package k32;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lk32/j;", "", "Landroid/view/View;", "view", "", "backgroundResourceId", "<init>", "(Landroid/view/View;I)V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f102696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f102697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f102698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f102699d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ImageView f102700e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ImageView f102701f;

    public j(View view2, int i14) {
        view2.getClass();
        this.f102696a = view2;
        View viewFindViewById = view2.findViewById(R.id.text1);
        viewFindViewById.getClass();
        TextView textView = (TextView) viewFindViewById;
        this.f102697b = textView;
        View viewFindViewById2 = view2.findViewById(R.id.text2);
        viewFindViewById2.getClass();
        TextView textView2 = (TextView) viewFindViewById2;
        this.f102698c = textView2;
        View viewFindViewById3 = view2.findViewById(R.id.text3);
        viewFindViewById3.getClass();
        TextView textView3 = (TextView) viewFindViewById3;
        this.f102699d = textView3;
        View viewFindViewById4 = view2.findViewById(R.id.icon_start);
        viewFindViewById4.getClass();
        ImageView imageView = (ImageView) viewFindViewById4;
        this.f102700e = imageView;
        View viewFindViewById5 = view2.findViewById(R.id.icon_end);
        viewFindViewById5.getClass();
        ImageView imageView2 = (ImageView) viewFindViewById5;
        this.f102701f = imageView2;
        view2.setBackground(a7.b.getDrawable(view2.getContext(), i14));
        v22.e.j(imageView);
        v22.e.j(textView);
        v22.e.j(textView2);
        v22.e.j(textView3);
        v22.e.j(imageView2);
    }

    public /* synthetic */ j(View view2, int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        this(view2, (i15 & 2) != 0 ? R.drawable.gcm_surface_1_selector_background : i14);
    }
}
