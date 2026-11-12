package k32;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lk32/k;", "", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f102702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f102703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f102704c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f102705d;

    public k(View view2) {
        view2.getClass();
        this.f102702a = view2;
        View viewFindViewById = view2.findViewById(R.id.text1);
        viewFindViewById.getClass();
        TextView textView = (TextView) viewFindViewById;
        this.f102703b = textView;
        View viewFindViewById2 = view2.findViewById(R.id.text2);
        viewFindViewById2.getClass();
        TextView textView2 = (TextView) viewFindViewById2;
        this.f102704c = textView2;
        View viewFindViewById3 = view2.findViewById(R.id.icon_start);
        viewFindViewById3.getClass();
        ImageView imageView = (ImageView) viewFindViewById3;
        this.f102705d = imageView;
        v22.e.j(textView);
        v22.e.j(textView2);
        v22.e.j(imageView);
    }

    public static void a(k kVar, String str, String str2) {
        TextView textView = kVar.f102703b;
        ImageView imageView = kVar.f102705d;
        TextView textView2 = kVar.f102704c;
        str.getClass();
        v22.e.v(imageView, false);
        textView.setText(str);
        textView.setVisibility(0);
        if (str2 != null) {
            textView2.setText(str2);
        }
        v22.e.v(textView2, str2 != null);
    }
}
