package uo;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.daasuu.bl.BubbleLayout;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Luo/b;", "", "Landroid/view/View;", "rootView", "", "isLegEdit", "<init>", "(Landroid/view/View;Z)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f172069i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f172070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f172071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f172072c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f172073d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f172074e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f172075f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageView f172076g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public BubbleLayout f172077h;

    static {
        new a(null);
    }

    public b(View view2, boolean z14) {
        view2.getClass();
        this.f172070a = view2;
        this.f172071b = z14;
        this.f172072c = (ImageView) view2.findViewById(R.id.multisport_leg_icon);
        this.f172073d = (TextView) view2.findViewById(R.id.multisport_leg_name);
        this.f172074e = (TextView) view2.findViewById(R.id.multisport_leg_distance);
        this.f172075f = (TextView) view2.findViewById(R.id.multisport_leg_time_and_metric);
        this.f172076g = (ImageView) view2.findViewById(R.id.multisport_leg_personal_record_icon);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Luo/b$a;", "", "<init>", "()V", "", "TOOLTIP_START_MARGIN_DP", "F", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(View view2) {
        this(view2, false, 2, null);
        view2.getClass();
    }

    public /* synthetic */ b(View view2, boolean z14, int i14, j jVar) {
        this(view2, (i14 & 2) != 0 ? false : z14);
    }
}
