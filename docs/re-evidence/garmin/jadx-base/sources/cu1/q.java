package cu1;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.HorseshoePieChart;
import com.garmin.android.apps.connectmobile.view.UserLevelImageView;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcu1/q;", "Lcu1/o;", "Landroid/view/LayoutInflater;", "inflater", "<init>", "(Landroid/view/LayoutInflater;)V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q extends o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f55694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HorseshoePieChart f55695c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final UserLevelImageView f55696d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HorseshoePieChart f55697e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f55698f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f55699g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f55700h;

    static {
        new a(null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public q(LayoutInflater layoutInflater) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.gcm4_training_feed_overview, (ViewGroup) null);
        viewInflate.getClass();
        super(viewInflate);
        this.f55694b = (TextView) this.f55688a.findViewById(R.id.plan_title);
        this.f55695c = (HorseshoePieChart) this.f55688a.findViewById(R.id.plan_progress_chart_view);
        this.f55696d = (UserLevelImageView) this.f55688a.findViewById(R.id.plan_coach);
        this.f55697e = (HorseshoePieChart) this.f55688a.findViewById(R.id.plan_confidence_chart_view);
        this.f55698f = (TextView) this.f55688a.findViewById(R.id.plan_label_progress);
        this.f55699g = (TextView) this.f55688a.findViewById(R.id.plan_label_coach);
        this.f55700h = (TextView) this.f55688a.findViewById(R.id.plan_label_confidence);
    }

    public final void c(int i14) {
        float fN;
        View view2 = this.f55688a;
        Resources resources = view2.getContext().getResources();
        resources.getClass();
        float fN2 = xy2.b.n(resources, 24.0f) * 2;
        if (i14 == 3) {
            Resources resources2 = view2.getContext().getResources();
            resources2.getClass();
            fN = xy2.b.n(resources2, 96.0f);
        } else {
            Resources resources3 = view2.getContext().getResources();
            resources3.getClass();
            fN = xy2.b.n(resources3, 48.0f);
        }
        int i15 = (int) (((Resources.getSystem().getDisplayMetrics().widthPixels - fN2) - fN) / i14);
        if (i15 < view2.getResources().getDimensionPixelSize(R.dimen.gauge_chart_size_xsmall)) {
            HorseshoePieChart horseshoePieChart = this.f55695c;
            horseshoePieChart.getLayoutParams().width = i15;
            horseshoePieChart.getLayoutParams().height = i15;
            UserLevelImageView userLevelImageView = this.f55696d;
            userLevelImageView.getLayoutParams().width = i15;
            userLevelImageView.getLayoutParams().height = i15;
            HorseshoePieChart horseshoePieChart2 = this.f55697e;
            horseshoePieChart2.getLayoutParams().width = i15;
            horseshoePieChart2.getLayoutParams().height = i15;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcu1/q$a;", "", "<init>", "()V", "", "LABEL_MAX_WIDTH_DIP", "I", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
