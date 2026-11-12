package po;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lpo/j0;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/view/View;", "parentView", "<init>", "(Landroid/content/Context;Landroid/view/View;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f138901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f138902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f138903c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f138904d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f138905e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f138906f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f138907g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f138908h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f138909i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final View f138910j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final TextView f138911k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TextView f138912l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final View f138913m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TextView f138914n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TextView f138915o;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f138916a;

        static {
            int[] iArr = new int[qs.x.values().length];
            try {
                iArr[qs.x.OBSTACLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[qs.x.TRANSITION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f138916a = iArr;
        }
    }

    public j0(Context context, View view2) {
        context.getClass();
        view2.getClass();
        this.f138901a = context;
        this.f138902b = view2;
        View viewFindViewById = view2.findViewById(R.id.lap_title);
        viewFindViewById.getClass();
        this.f138903c = (TextView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.lap_field_1_label);
        viewFindViewById2.getClass();
        this.f138904d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.lap_field_1_value);
        viewFindViewById3.getClass();
        this.f138905e = (TextView) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.lap_field_2_label);
        viewFindViewById4.getClass();
        this.f138906f = (TextView) viewFindViewById4;
        View viewFindViewById5 = view2.findViewById(R.id.lap_field_2_value);
        viewFindViewById5.getClass();
        this.f138907g = (TextView) viewFindViewById5;
        View viewFindViewById6 = view2.findViewById(R.id.lap_field_3_label);
        viewFindViewById6.getClass();
        this.f138908h = (TextView) viewFindViewById6;
        View viewFindViewById7 = view2.findViewById(R.id.lap_field_3_value);
        viewFindViewById7.getClass();
        this.f138909i = (TextView) viewFindViewById7;
        View viewFindViewById8 = view2.findViewById(R.id.field4);
        viewFindViewById8.getClass();
        this.f138910j = viewFindViewById8;
        View viewFindViewById9 = view2.findViewById(R.id.lap_field_4_label);
        viewFindViewById9.getClass();
        this.f138911k = (TextView) viewFindViewById9;
        View viewFindViewById10 = view2.findViewById(R.id.lap_field_4_value);
        viewFindViewById10.getClass();
        this.f138912l = (TextView) viewFindViewById10;
        View viewFindViewById11 = view2.findViewById(R.id.field5);
        viewFindViewById11.getClass();
        this.f138913m = viewFindViewById11;
        View viewFindViewById12 = view2.findViewById(R.id.lap_field_5_label);
        viewFindViewById12.getClass();
        this.f138914n = (TextView) viewFindViewById12;
        View viewFindViewById13 = view2.findViewById(R.id.lap_field_5_value);
        viewFindViewById13.getClass();
        this.f138915o = (TextView) viewFindViewById13;
    }
}
