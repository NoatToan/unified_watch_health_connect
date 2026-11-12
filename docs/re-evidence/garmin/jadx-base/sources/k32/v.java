package k32;

import android.view.View;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lk32/v;", "", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f102744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f102745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f102746c;

    public v(View view2) {
        view2.getClass();
        this.f102744a = view2;
        View viewFindViewById = view2.findViewById(R.id.label);
        viewFindViewById.getClass();
        this.f102745b = (TextView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.label_summary);
        viewFindViewById2.getClass();
        this.f102746c = (TextView) viewFindViewById2;
    }
}
