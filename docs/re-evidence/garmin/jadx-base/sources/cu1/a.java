package cu1;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import c22.j0;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.f1;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import java.util.ArrayList;
import java.util.HashMap;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\n\u000bB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcu1/a;", "Lcom/garmin/android/apps/connectmobile/f1;", "Landroid/app/Activity;", "activity", "Lcu1/l;", "dashboardListener", "Lcu1/g;", "coachActionListener", "<init>", "(Landroid/app/Activity;Lcu1/l;Lcu1/g;)V", "b", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends f1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f55611c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f55612d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f55613e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f55614f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f55615g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LayoutInflater f55616h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final q f55617i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final w f55618j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final i f55619k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final r f55620l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final v f55621m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final h f55622n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final View f55623o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f55624p;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcu1/a$b;", "Lcz/a;", "", ModelSourceWrapper.POSITION, "<init>", "(Lcu1/a;I)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class b implements cz.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f55625a;

        public b(int i14) {
            this.f55625a = i14;
        }

        @Override // cz.a
        public final void y1(int i14, Bundle bundle) {
            l lVar;
            a aVar = a.this;
            if (aVar.f55613e.get(Integer.valueOf(this.f55625a)) == null || (lVar = aVar.f55611c) == null) {
                return;
            }
            lVar.y1(i14, bundle);
        }
    }

    static {
        new C1203a(null);
    }

    public a(Activity activity, l lVar, g gVar) {
        activity.getClass();
        this.f55611c = lVar;
        this.f55612d = new ArrayList();
        this.f55613e = new HashMap();
        this.f55614f = new HashMap();
        this.f55615g = new HashMap();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(activity);
        this.f55616h = layoutInflaterFrom;
        layoutInflaterFrom.getClass();
        q qVar = new q(layoutInflaterFrom);
        this.f55617i = qVar;
        w wVar = new w(layoutInflaterFrom, lVar);
        this.f55618j = wVar;
        i iVar = new i(layoutInflaterFrom);
        this.f55619k = iVar;
        r rVar = new r(layoutInflaterFrom, lVar);
        this.f55620l = rVar;
        v vVar = new v(layoutInflaterFrom, lVar);
        this.f55621m = vVar;
        h hVar = new h(layoutInflaterFrom, gVar);
        this.f55622n = hVar;
        View viewInflate = layoutInflaterFrom.inflate(R.layout.gcm4_atp_dashboard_footer, (ViewGroup) null);
        this.f55623o = viewInflate;
        this.f55624p = wt1.r.a();
        qVar.b();
        wVar.b();
        iVar.b();
        rVar.b();
        vVar.b();
        hVar.b();
        viewInflate.getClass();
        viewInflate.setVisibility(8);
        t(qVar.f55688a);
        t(hVar.f55688a);
        t(wVar.f55688a);
        t(iVar.f55688a);
        t(rVar.f55688a);
        t(vVar.f55688a);
        r(viewInflate);
    }

    @Override // com.garmin.android.apps.connectmobile.f1, androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i14) {
        int itemViewType = super.getItemViewType(i14);
        if (itemViewType == 1) {
            return ((fu1.d) this.f55612d.get(i14 - this.f34942a.size())).getTip() != null ? 98 : 99;
        }
        return itemViewType;
    }

    @Override // com.garmin.android.apps.connectmobile.f1
    /* JADX INFO: renamed from: u */
    public final int getF187301i() {
        return this.f55612d.size();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002f  */
    @Override // com.garmin.android.apps.connectmobile.f1
    public final void x(int i14, RecyclerView.f0 f0Var) {
        boolean z14;
        ArrayList arrayList = this.f55612d;
        fu1.d dVar = (fu1.d) arrayList.get(i14);
        if (f0Var instanceof x) {
            if (i14 != 0) {
                j0 j0Var = j0.f23099a;
                DateTime dateTimeD = ((fu1.d) arrayList.get(i14 - 1)).d();
                DateTime dateTimeD2 = dVar.d();
                j0Var.getClass();
                if (j0.F(dateTimeD, dateTimeD2)) {
                    z14 = false;
                } else {
                    z14 = true;
                }
            } else {
                z14 = true;
            }
            x xVar = (x) f0Var;
            DateTime dateTimeD3 = dVar.d();
            View view2 = xVar.f55720c;
            TextView textView = xVar.f55719b;
            View view3 = xVar.f55718a;
            if (z14) {
                view3.getClass();
                view3.setVisibility(0);
                Context context = view3.getContext();
                context.getClass();
                textView.setText(wt1.r.c(new l22.a(context), new pi0.e(context), dateTimeD3));
                textView.setVisibility(0);
                if (i14 == 0) {
                    view2.getClass();
                    view2.setVisibility(4);
                } else {
                    view2.getClass();
                    view2.setVisibility(8);
                }
            } else {
                view3.getClass();
                view3.setVisibility(8);
                textView.getClass();
                textView.setVisibility(8);
                view2.getClass();
                view2.setVisibility(0);
            }
        }
        fu1.q gradedWorkout = dVar.getGradedWorkout();
        Long activityId = gradedWorkout != null ? gradedWorkout.getActivityId() : null;
        l lVar = this.f55611c;
        if (activityId != null && (f0Var instanceof h0)) {
            fu1.m mVar = (fu1.m) this.f55613e.get(Integer.valueOf(i14));
            if (mVar != null) {
                ((wt1.a) KoinJavaComponent.get$default(wt1.a.class, null, null, 6, null)).n(((h0) f0Var).f55680d, mVar, dVar, new b(i14));
            } else if (lVar != null) {
                lVar.a5(i14, activityId.longValue());
            }
        }
        xw1.i tip = dVar.getTip();
        if (tip == null || !(f0Var instanceof y)) {
            return;
        }
        String contentfulContentId = tip.getContentfulContentId();
        boolean zD = tip.d();
        String str = this.f55624p;
        if (zD && contentfulContentId != null) {
            fu1.n nVar = (fu1.n) this.f55615g.get(Integer.valueOf(i14));
            if (nVar != null) {
                fu1.h hVar = nVar.f73539b;
                if (hVar != null) {
                    y yVar = (y) f0Var;
                    a61.d0 d0Var = new a61.d0(26, this, hVar);
                    str.getClass();
                    Context context2 = yVar.f55721d.getContext();
                    yVar.f55722e.setOnClickListener(d0Var);
                    context2.getClass();
                    zp0.c cVar = new zp0.c(context2);
                    cVar.f206565e = tn.k.g(str, hVar.f73523g);
                    ImageView imageView = yVar.f55723f;
                    imageView.getClass();
                    cVar.h(imageView);
                    yVar.f55725h.setText(hVar.f73518b);
                    ImageView imageView2 = yVar.f55724g;
                    imageView2.getClass();
                    imageView2.setVisibility(8);
                    yVar.f55726i.setText(hVar.f73521e);
                } else {
                    ((y) f0Var).d();
                }
            } else if (lVar != null) {
                lVar.q6(i14, contentfulContentId);
            }
        }
        if (!tip.f() || contentfulContentId == null) {
            return;
        }
        fu1.p pVar = (fu1.p) this.f55614f.get(Integer.valueOf(i14));
        if (pVar == null) {
            if (lVar != null) {
                lVar.u3(i14, contentfulContentId);
                return;
            }
            return;
        }
        xw1.o oVar = pVar.f73541b;
        if (oVar == null) {
            ((y) f0Var).d();
            return;
        }
        y yVar2 = (y) f0Var;
        a61.d0 d0Var2 = new a61.d0(27, this, oVar);
        str.getClass();
        Context context3 = yVar2.f55721d.getContext();
        yVar2.f55722e.setOnClickListener(d0Var2);
        context3.getClass();
        zp0.c cVar2 = new zp0.c(context3);
        cVar2.f206565e = tn.k.g(str, oVar.getVideoThumbnailUrl());
        ImageView imageView3 = yVar2.f55723f;
        imageView3.getClass();
        cVar2.h(imageView3);
        yVar2.f55725h.setText(oVar.getVideoTitle());
        ImageView imageView4 = yVar2.f55724g;
        imageView4.getClass();
        imageView4.setVisibility(0);
        double videoDuration = oVar.getVideoDuration();
        if (videoDuration > 0.0d) {
            yVar2.f55726i.setText(l3.a.t1(l3.f23124b, videoDuration));
        }
    }

    @Override // com.garmin.android.apps.connectmobile.f1
    public final RecyclerView.f0 z(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        LayoutInflater layoutInflater = this.f55616h;
        if (i14 == 99) {
            View viewInflate = layoutInflater.inflate(R.layout.gcm4_training_feed_item_with_timeline, viewGroup, false);
            FrameLayout frameLayout = (FrameLayout) viewInflate.findViewById(R.id.timeline_card_container);
            frameLayout.addView(layoutInflater.inflate(R.layout.card_activity_view, (ViewGroup) frameLayout, false));
            return new h0(viewInflate, ((wt1.a) KoinJavaComponent.get$default(wt1.a.class, null, null, 6, null)).u(viewInflate));
        }
        View viewInflate2 = layoutInflater.inflate(R.layout.gcm4_training_feed_item_with_timeline, viewGroup, false);
        FrameLayout frameLayout2 = (FrameLayout) viewInflate2.findViewById(R.id.timeline_card_container);
        frameLayout2.addView(layoutInflater.inflate(R.layout.gcm4_training_feed_item, (ViewGroup) frameLayout2, false));
        return new y(viewInflate2);
    }

    /* JADX INFO: renamed from: cu1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcu1/a$a;", "", "<init>", "()V", "", "ACTIVITY", "I", "TIP", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1203a {
        public /* synthetic */ C1203a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C1203a() {
        }
    }
}
