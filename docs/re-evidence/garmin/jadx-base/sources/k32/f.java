package k32;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import aq.q1;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lk32/f;", "", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f102680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f102681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f102682c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f102683d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final View f102684e;

    public f(View view2) {
        view2.getClass();
        Context context = view2.getContext();
        context.getClass();
        this.f102680a = context;
        this.f102681b = (ImageView) view2.findViewById(R.id.bottom_sheet_pull_tab);
        this.f102682c = (TextView) view2.findViewById(R.id.bottom_sheet_header_tv);
        this.f102683d = (TextView) view2.findViewById(R.id.bottom_sheet_subhead_tv);
        this.f102684e = view2.findViewById(R.id.bottom_sheet_close_iv);
    }

    public final void a(String str, String str2, e23.a<Unit> aVar, boolean z14) {
        str.getClass();
        ImageView imageView = this.f102681b;
        if (imageView != null) {
            v22.e.v(imageView, z14);
        }
        TextView textView = this.f102682c;
        if (textView != null) {
            textView.setText(str);
        }
        TextView textView2 = this.f102683d;
        if (textView2 != null) {
            v22.e.v(textView2, true ^ (str2 == null || str2.length() == 0));
        }
        if (textView2 != null) {
            if (str2 == null) {
                str2 = "";
            }
            textView2.setText(str2);
        }
        View view2 = this.f102684e;
        if (view2 != null) {
            view2.setOnClickListener(new q1(aVar, 10));
        }
        if (!c22.b.e(this.f102680a) || view2 == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        Context context = view2.getContext();
        context.getClass();
        layoutParams.width = MathKt.c(c22.b.c(context, view2.getResources().getDimension(R.dimen.icon_default), 1.5f));
        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        Context context2 = view2.getContext();
        context2.getClass();
        layoutParams2.height = MathKt.c(c22.b.c(context2, view2.getResources().getDimension(R.dimen.icon_default), 1.5f));
    }
}
