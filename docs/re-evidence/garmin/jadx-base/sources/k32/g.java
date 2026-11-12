package k32;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lk32/g;", "", "Landroid/view/View;", "itemView", "Lk32/g$a;", "connectivityType", "<init>", "(Landroid/view/View;Lk32/g$a;)V", "a", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f102685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f102686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f102687c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lk32/g$a;", "", "<init>", "(Ljava/lang/String;I)V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum a {
        BLUETOOTH,
        WIFI
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f102691a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.BLUETOOTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.WIFI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f102691a = iArr;
        }
    }

    public g(View view2, a aVar) {
        view2.getClass();
        aVar.getClass();
        this.f102685a = view2;
        View viewFindViewById = view2.findViewById(R.id.card_system_icon);
        viewFindViewById.getClass();
        this.f102686b = (ImageView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.card_system_message);
        viewFindViewById2.getClass();
        TextView textView = (TextView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.card_system_container);
        viewFindViewById3.getClass();
        this.f102687c = viewFindViewById3;
        int[] iArr = {a7.b.getColor(view2.getContext(), R.color.palette_ruby_1), a7.b.getColor(view2.getContext(), R.color.palette_ruby_2)};
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TL_BR;
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, iArr);
        Drawable background = viewFindViewById3.getBackground();
        GradientDrawable gradientDrawable2 = background instanceof GradientDrawable ? (GradientDrawable) background : null;
        if (gradientDrawable2 == null) {
            viewFindViewById3.setBackground(gradientDrawable);
        } else {
            gradientDrawable2.mutate();
            gradientDrawable2.setOrientation(orientation);
            gradientDrawable2.setColors(iArr);
        }
        int i14 = b.f102691a[aVar.ordinal()];
        if (i14 == 1) {
            a(R.drawable.bluetooth_controls_off);
            textView.setText(R.string.card_bluetooth_turned_off);
        } else {
            if (i14 != 2) {
                u0.r();
                throw null;
            }
            a(R.drawable.wifi);
            textView.setText(R.string.common_network_reachability_error);
        }
    }

    public final void a(int i14) {
        ImageView imageView = this.f102686b;
        imageView.setVisibility(0);
        imageView.setImageResource(i14);
        imageView.setImageTintList(ColorStateList.valueOf(a7.b.getColor(imageView.getContext(), R.color.gcm_icon_on_color)));
        float fApplyDimension = TypedValue.applyDimension(1, 20.0f, this.f102685a.getResources().getDisplayMetrics());
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = (int) fApplyDimension;
        }
        ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.height = (int) fApplyDimension;
        }
    }
}
