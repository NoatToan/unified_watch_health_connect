package pe2;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.garmin.android.apps.connectmobile.R;
import j20.x;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f137462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f137463b;

    private a(ConstraintLayout constraintLayout, TextView textView, TextView textView2) {
        this.f137462a = textView;
        this.f137463b = textView2;
    }

    public static a a(View view2) {
        int i14 = R.id.snippet;
        TextView textView = (TextView) ee.a.a(R.id.snippet, view2);
        if (textView != null) {
            i14 = R.id.title;
            TextView textView2 = (TextView) ee.a.a(R.id.title, view2);
            if (textView2 != null) {
                return new a((ConstraintLayout) view2, textView, textView2);
            }
        }
        x.l("Missing required view with ID: ".concat(view2.getResources().getResourceName(i14)));
        return null;
    }
}
