package eq;

import android.view.View;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Leq/b;", "", "Landroid/view/View;", "rootView", "<init>", "(Landroid/view/View;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f65016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f65017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f65018c;

    public b(View view2) {
        view2.getClass();
        this.f65016a = view2;
        View viewFindViewById = view2.findViewById(R.id.label);
        viewFindViewById.getClass();
        this.f65017b = (TextView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.value);
        viewFindViewById2.getClass();
        this.f65018c = (TextView) viewFindViewById2;
    }

    public final void a(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f65017b.setText(str);
        this.f65018c.setText(str2);
    }
}
