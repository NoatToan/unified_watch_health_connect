package fr1;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lfr1/j;", "", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "gcm-strava_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageView f73308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f73309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f73310c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f73311d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f73312e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final SwitchCompat f73313f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f73314g;

    public j(View view2) {
        if (view2 != null) {
            View viewFindViewById = view2.findViewById(R.id.icon_left);
            ImageView imageView = viewFindViewById instanceof ImageView ? (ImageView) viewFindViewById : null;
            this.f73308a = imageView;
            View viewFindViewById2 = view2.findViewById(R.id.label_left);
            TextView textView = viewFindViewById2 instanceof TextView ? (TextView) viewFindViewById2 : null;
            this.f73309b = textView;
            View viewFindViewById3 = view2.findViewById(R.id.label_hint);
            this.f73310c = viewFindViewById3 instanceof TextView ? (TextView) viewFindViewById3 : null;
            View viewFindViewById4 = view2.findViewById(R.id.label_action);
            this.f73311d = viewFindViewById4 instanceof TextView ? (TextView) viewFindViewById4 : null;
            View viewFindViewById5 = view2.findViewById(R.id.label_right);
            this.f73312e = viewFindViewById5 instanceof TextView ? (TextView) viewFindViewById5 : null;
            View viewFindViewById6 = view2.findViewById(R.id.switch_right);
            this.f73313f = viewFindViewById6 instanceof SwitchCompat ? (SwitchCompat) viewFindViewById6 : null;
            this.f73314g = view2.findViewById(R.id.divider);
            Context context = view2.getContext();
            context.getClass();
            if (c22.b.e(context)) {
                androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
                ViewParent parent = imageView != null ? imageView.getParent() : null;
                parent.getClass();
                dVar.f((ConstraintLayout) parent);
                dVar.e(imageView != null ? imageView.getId() : -1, 4);
                int id3 = imageView != null ? imageView.getId() : -1;
                textView.getClass();
                dVar.h(id3, 3, textView.getId(), 3);
                ViewParent parent2 = imageView != null ? imageView.getParent() : null;
                dVar.b(parent2 instanceof ConstraintLayout ? (ConstraintLayout) parent2 : null);
            }
        }
    }

    public static void c(TextView textView, String str, View.OnClickListener onClickListener) {
        if (textView != null) {
            if (TextUtils.isEmpty(str)) {
                textView.setVisibility(8);
                return;
            }
            textView.setText(str);
            if (onClickListener != null) {
                textView.setOnClickListener(onClickListener);
            }
            textView.setVisibility(0);
        }
    }

    public final void a(int i14, String str) {
        ImageView imageView = this.f73308a;
        if (imageView != null) {
            imageView.setImageResource(i14);
            imageView.setVisibility(0);
        }
        c(this.f73309b, str, null);
    }

    public final void b(int i14, String str, String str2) {
        ImageView imageView = this.f73308a;
        if (imageView != null) {
            imageView.setImageResource(i14);
            imageView.setVisibility(0);
        }
        c(this.f73309b, str, null);
        c(this.f73310c, str2, null);
    }
}
