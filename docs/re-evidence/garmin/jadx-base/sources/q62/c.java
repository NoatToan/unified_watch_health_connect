package q62;

import android.view.View;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lq62/c;", "", "Landroid/view/View;", "rootView", "<init>", "(Landroid/view/View;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f143192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f143193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f143194c;

    public c(View view2) {
        view2.getClass();
        this.f143192a = view2;
        this.f143193b = (TextView) view2.findViewById(R.id.label_top);
        this.f143194c = (TextView) view2.findViewById(R.id.label_bottom);
    }

    public final void a(String str, String str2) {
        c(str);
        b(str2);
        this.f143192a.setContentDescription(str2 + ": " + str);
    }

    public final void b(String str) {
        TextView textView = this.f143194c;
        if (str == null || str.length() == 0) {
            textView.getClass();
            textView.setVisibility(8);
        } else {
            textView.getClass();
            textView.setVisibility(0);
            textView.setText(str);
        }
    }

    public final void c(String str) {
        TextView textView = this.f143193b;
        if (str == null || str.length() == 0) {
            textView.getClass();
            textView.setVisibility(8);
        } else {
            textView.getClass();
            textView.setVisibility(0);
            textView.setText(str);
        }
    }
}
