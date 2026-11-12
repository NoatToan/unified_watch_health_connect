package ms0;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.view_3_0.StyledInlineTextFieldViewDark;
import k32.l;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lms0/e;", "", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f120465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StyledInlineTextFieldViewDark f120466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ViewGroup f120467c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RecyclerView f120468d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h f120469e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f120470f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l f120471g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l f120472h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f120473i;

    public e(View view2) {
        view2.getClass();
        View viewFindViewById = view2.findViewById(R.id.flight_label);
        viewFindViewById.getClass();
        this.f120465a = (TextView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.flight_location);
        viewFindViewById2.getClass();
        this.f120466b = (StyledInlineTextFieldViewDark) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.flight_location_suggestions_container);
        viewFindViewById3.getClass();
        ViewGroup viewGroup = (ViewGroup) viewFindViewById3;
        this.f120467c = viewGroup;
        View viewFindViewById4 = viewGroup.findViewById(R.id.flight_location_suggestions);
        viewFindViewById4.getClass();
        this.f120468d = (RecyclerView) viewFindViewById4;
        View viewFindViewById5 = view2.findViewById(R.id.flight_location_suggestions_search_status);
        viewFindViewById5.getClass();
        this.f120469e = new h(viewFindViewById5);
        View viewFindViewById6 = view2.findViewById(R.id.flight_use_current_location);
        viewFindViewById6.getClass();
        this.f120470f = (TextView) viewFindViewById6;
        View viewFindViewById7 = view2.findViewById(R.id.flight_date);
        viewFindViewById7.getClass();
        this.f120471g = new l(viewFindViewById7);
        View viewFindViewById8 = view2.findViewById(R.id.flight_time);
        viewFindViewById8.getClass();
        this.f120472h = new l(viewFindViewById8);
        View viewFindViewById9 = view2.findViewById(R.id.error_message);
        viewFindViewById9.getClass();
        this.f120473i = (TextView) viewFindViewById9;
    }
}
