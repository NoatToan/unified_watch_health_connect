package k32;

import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lk32/q;", "", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f102720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f102721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h32.n.b f102722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h32.n.b f102723d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h32.n.b f102724e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h32.n.b f102725f;

    public q(View view2) {
        view2.getClass();
        View viewFindViewById = view2.findViewById(R.id.gcm_stats_row_1);
        this.f102720a = viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.gcm_stats_row_2);
        this.f102721b = viewFindViewById2;
        this.f102722c = new h32.n.b(viewFindViewById != null ? viewFindViewById.findViewById(R.id.stats_holder_start) : null);
        this.f102723d = new h32.n.b(viewFindViewById != null ? viewFindViewById.findViewById(R.id.stats_holder_end) : null);
        this.f102724e = new h32.n.b(viewFindViewById2 != null ? viewFindViewById2.findViewById(R.id.stats_holder_start) : null);
        this.f102725f = new h32.n.b(viewFindViewById2 != null ? viewFindViewById2.findViewById(R.id.stats_holder_end) : null);
        g22.p.b(viewFindViewById, this);
        g22.p.b(viewFindViewById2, this);
    }
}
