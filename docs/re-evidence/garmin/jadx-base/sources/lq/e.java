package lq;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ViewSwitcher;
import androidx.constraintlayout.widget.ConstraintLayout;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.stats.intervals.IntervalsExpandableListView;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import ps.p;
import ps.q1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Llq/e;", "Llq/c$a;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/garmin/android/apps/connectmobile/activities/stats/intervals/IntervalsExpandableListView;", "mExpandableListView", "Landroid/widget/LinearLayout;", "stickyHeaderContainer", "<init>", "(Landroid/content/Context;Lcom/garmin/android/apps/connectmobile/activities/stats/intervals/IntervalsExpandableListView;Landroid/widget/LinearLayout;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e implements c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f114283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IntervalsExpandableListView f114284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinearLayout f114285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h f114286d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p f114287e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ar.c f114288f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public q1 f114289g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ViewSwitcher f114290h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c f114291i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final View f114292j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final View f114293k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final View f114294l;

    public e(Context context, IntervalsExpandableListView intervalsExpandableListView, LinearLayout linearLayout) {
        context.getClass();
        intervalsExpandableListView.getClass();
        linearLayout.getClass();
        this.f114283a = context;
        this.f114284b = intervalsExpandableListView;
        this.f114285c = linearLayout;
        this.f114286d = h.ALL;
        View viewInflate = View.inflate(context, R.layout.list_group_header, null);
        this.f114292j = viewInflate;
        View viewInflate2 = View.inflate(context, R.layout.list_group, null);
        viewInflate2.getClass();
        this.f114293k = viewInflate2;
        View viewInflate3 = View.inflate(context, R.layout.orientation_hint, null);
        viewInflate3.getClass();
        this.f114294l = viewInflate3;
        ((ConstraintLayout) viewInflate.findViewById(R.id.header_container)).setBackgroundColor(a7.b.getColor(context, R.color.gcm_surface_1));
    }

    @Override // lq.c.a
    public final void a() {
        ViewSwitcher viewSwitcher = this.f114290h;
        if (viewSwitcher == null) {
            s.m("mExpandCollapseBtn");
            throw null;
        }
        if (viewSwitcher.getDisplayedChild() == 0) {
            ViewSwitcher viewSwitcher2 = this.f114290h;
            if (viewSwitcher2 != null) {
                viewSwitcher2.showNext();
            } else {
                s.m("mExpandCollapseBtn");
                throw null;
            }
        }
    }

    @Override // lq.c.a
    public final void b() {
        ViewSwitcher viewSwitcher = this.f114290h;
        if (viewSwitcher == null) {
            s.m("mExpandCollapseBtn");
            throw null;
        }
        if (viewSwitcher.getDisplayedChild() == 1) {
            ViewSwitcher viewSwitcher2 = this.f114290h;
            if (viewSwitcher2 != null) {
                viewSwitcher2.showNext();
            } else {
                s.m("mExpandCollapseBtn");
                throw null;
            }
        }
    }
}
