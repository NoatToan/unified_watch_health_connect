package eg1;

import am.x0;
import am.z0;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.segments.data.model.SegmentLeaderboardRowDTO;
import com.garmin.android.apps.connectmobile.view.UserLevelImageView;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Leg1/b;", "", "Landroid/app/Activity;", "mActivity", "", "segmentActivityTypeId", "", "mSegmentDistance", "", "mPortrait", "<init>", "(Landroid/app/Activity;IDZ)V", "a", "gcm-segments_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f63974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f63975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f63976c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List<SegmentLeaderboardRowDTO> f63977d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x0 f63978e;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Leg1/b$a;", "", "", "dataFieldsCount", "<init>", "(I)V", "gcm-segments_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TextView f63979a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ImageView f63980b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public UserLevelImageView f63981c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public TextView f63982d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final TextView[] f63983e;

        public a(int i14) {
            this.f63983e = new TextView[i14];
        }
    }

    public b(Activity activity, int i14, double d14, boolean z14) {
        activity.getClass();
        this.f63974a = activity;
        this.f63975b = d14;
        this.f63976c = z14;
        this.f63978e = z0.k(i14, x0.f4346x);
    }

    public static int b(Activity activity, int i14) {
        return i14 % 2 == 0 ? a7.b.getColor(activity, R.color.gcm_table_row_even) : a7.b.getColor(activity, R.color.gcm_table_row_odd);
    }

    public final void a(LinearLayout linearLayout) {
        Object systemService = this.f63974a.getSystemService("layout_inflater");
        systemService.getClass();
        ((LayoutInflater) systemService).inflate(R.layout.gcm3_button_list_divider, (ViewGroup) linearLayout, true);
    }
}
