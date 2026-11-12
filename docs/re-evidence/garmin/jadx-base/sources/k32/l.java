package k32;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lk32/l;", "", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f102706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f102707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f102708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f102709d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ImageView f102710e;

    public l(View view2) {
        view2.getClass();
        this.f102706a = view2;
        this.f102707b = view2;
        View viewFindViewById = view2.findViewById(R.id.icon_leading);
        viewFindViewById.getClass();
        View viewFindViewById2 = view2.findViewById(R.id.text1);
        viewFindViewById2.getClass();
        TextView textView = (TextView) viewFindViewById2;
        this.f102708c = textView;
        View viewFindViewById3 = view2.findViewById(R.id.text2);
        viewFindViewById3.getClass();
        TextView textView2 = (TextView) viewFindViewById3;
        this.f102709d = textView2;
        View viewFindViewById4 = view2.findViewById(R.id.icon_end);
        viewFindViewById4.getClass();
        ImageView imageView = (ImageView) viewFindViewById4;
        this.f102710e = imageView;
        ((ComposeView) viewFindViewById).setVisibility(8);
        textView.setVisibility(8);
        textView2.setVisibility(8);
        imageView.setVisibility(8);
    }

    public static /* synthetic */ void d(l lVar, int i14, Integer num, Integer num2, int i15) {
        if ((i15 & 2) != 0) {
            num = null;
        }
        if ((i15 & 4) != 0) {
            num2 = null;
        }
        lVar.c(i14, num, num2, null);
    }

    public final void a(int i14, Integer num) {
        TextView textView = this.f102708c;
        textView.setText(i14);
        v22.e.q(textView);
        TextView textView2 = this.f102709d;
        if (num != null) {
            textView2.setText(num.intValue());
        }
        v22.e.v(textView2, num != null);
    }

    public final void b(String str, String str2) {
        str.getClass();
        TextView textView = this.f102708c;
        textView.setText(str);
        v22.e.q(textView);
        h(str2);
    }

    public final void c(int i14, Integer num, Integer num2, String str) {
        ImageView imageView = this.f102710e;
        imageView.setImageResource(i14);
        imageView.setVisibility(0);
        if (str != null) {
            imageView.setContentDescription(str);
        }
        if (num != null) {
            e(num);
        }
        if (num2 != null) {
            int iApplyDimension = (int) TypedValue.applyDimension(1, num2.intValue(), imageView.getContext().getResources().getDisplayMetrics());
            imageView.getLayoutParams().width = iApplyDimension;
            imageView.getLayoutParams().height = iApplyDimension;
            imageView.requestLayout();
        }
    }

    public final void e(Integer num) {
        ImageView imageView = this.f102710e;
        if (num == null) {
            imageView.setColorFilter((ColorFilter) null);
            imageView.setImageTintList(null);
            return;
        }
        View view2 = this.f102706a;
        ColorStateList colorStateList = a7.b.getColorStateList(view2.getContext(), num.intValue());
        if (colorStateList == null) {
            imageView.setColorFilter(new PorterDuffColorFilter(a7.b.getColor(view2.getContext(), num.intValue()), PorterDuff.Mode.SRC_ATOP));
        } else {
            imageView.setImageTintList(colorStateList);
        }
    }

    public final void f(boolean z14) {
        v22.e.v(this.f102710e, z14);
    }

    public final void g() {
        View view2 = this.f102706a;
        Context context = view2.getContext();
        context.getClass();
        if (c22.b.e(context)) {
            Context context2 = view2.getContext();
            context2.getClass();
            int iC = (int) c22.b.c(context2, view2.getContext().getResources().getDimension(R.dimen.icon_small), 1.5f);
            ImageView imageView = this.f102710e;
            imageView.getLayoutParams().width = iC;
            imageView.getLayoutParams().height = iC;
        }
    }

    public final void h(String str) {
        TextView textView = this.f102709d;
        if (str != null) {
            textView.setText(str);
        }
        v22.e.v(textView, str != null);
    }
}
