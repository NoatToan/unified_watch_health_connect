package po;

import am.x0;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.activities.newmodel.ActivityDetailChartDTO;
import com.garmin.android.apps.connectmobile.r2;
import com.garmin.android.apps.connectmobile.view.GCMMapPreview;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.internal.Util;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes7.dex */
public class h0 extends z {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f138889m = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.activities.newmodel.a f138890h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ps.p f138891i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f138892j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public w0 f138893k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public d80.f<Object> f138894l;

    public class a implements z0<fw.m<ActivityDetailChartDTO>> {
        public a() {
        }

        @Override // androidx.lifecycle.z0
        public final void onChanged(fw.m<ActivityDetailChartDTO> mVar) {
            ActivityDetailChartDTO activityDetailChartDTO;
            fw.m<ActivityDetailChartDTO> mVar2 = mVar;
            h0 h0Var = h0.this;
            if (mVar2 == null) {
                r2 r2Var = h0Var.f139000g;
                int i14 = h0.f138889m;
                r2Var.t8();
                h0Var.f138892j--;
                g22.e.b(h0Var, lj0.b.f112956j);
                h0Var.A6();
                return;
            }
            fw.p pVar = mVar2.f73769b;
            if (pVar != fw.p.LOADING) {
                r2 r2Var2 = h0Var.f139000g;
                int i15 = h0.f138889m;
                r2Var2.t8();
                h0Var.f138892j--;
                h0Var.f138893k.k(this);
            }
            if (pVar == fw.p.SUCCESS && (activityDetailChartDTO = mVar2.f73770c) != null) {
                h0Var.f138890h = activityDetailChartDTO;
                h0Var.A6();
            } else if (pVar == fw.p.ERROR) {
                fw.c cVar = mVar2.f73771d;
                int i16 = h0.f138889m;
                h0Var.getClass();
                g22.e.a(h0Var, cVar);
                h0Var.A6();
            }
        }
    }

    public final void A6() {
        List immutableList;
        List immutableList2;
        if (this.f138892j != 0) {
            return;
        }
        uo.a aVarZ6 = z6();
        if (aVarZ6 == null) {
            GCMMapPreview gCMMapPreview = this.f41077c;
            if (gCMMapPreview != null) {
                gCMMapPreview.setVisibility(8);
            }
            this.f41077c.setMapPreviewVisibility(false);
            this.f47887b.setVisibility(8);
            return;
        }
        ArrayList arrayList = aVarZ6.f172067a;
        ArrayList arrayList2 = aVarZ6.f172068b;
        this.f41077c.getMapProxy().clear();
        GCMMapPreview gCMMapPreview2 = this.f41077c;
        if (gCMMapPreview2 != null) {
            gCMMapPreview2.setVisibility(0);
        }
        this.f41077c.setMapPreviewVisibility(true);
        this.f47887b.setVisibility(0);
        if (!Util.toImmutableList(arrayList2).isEmpty() && (immutableList2 = Util.toImmutableList(arrayList2)) != null) {
            Iterator it = immutableList2.iterator();
            while (it.hasNext()) {
                this.f41077c.g((com.garmin.android.library.mapsdkadapter.p) it.next());
            }
        }
        if (!Util.toImmutableList(arrayList).isEmpty() && (immutableList = Util.toImmutableList(arrayList)) != null) {
            Iterator it3 = immutableList.iterator();
            while (it3.hasNext()) {
                this.f41077c.h((com.garmin.android.library.mapsdkadapter.q) it3.next());
            }
        }
        this.f41077c.i();
        this.f41077c.b();
        this.f41077c.setInteractionsEnabled(false);
    }

    @Override // com.garmin.android.apps.connectmobile.r1, com.garmin.android.library.mapsdkadapter.i.l
    public void h1(com.garmin.android.library.mapsdkadapter.i iVar) {
        this.f41077c.setOnMarkerClickListener(new g0(this));
        this.f41077c.setOnMapClickListener(new g0(this));
    }

    @Override // com.garmin.android.apps.connectmobile.r1
    public final void v6() {
        d80.f<Object> fVar = this.f138894l;
        if (fVar != null && !fVar.c()) {
            this.f138894l.a();
            this.f139000g.t8();
            this.f138892j--;
        }
        if (this.f138892j > 0) {
            this.f138893k.l(this);
            this.f138892j = 0;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.r1
    public void w6() {
        y6();
        this.f138892j++;
        this.f139000g.U7();
        am.b bVarM = am.b.M();
        long j8 = this.f138999f;
        i0 i0Var = new i0(this);
        bVarM.getClass();
        d80.f.b bVar = new d80.f.b(new Object[]{Long.toString(j8)}, lj0.a.f112940m);
        bVar.f58274d = i0Var;
        bVar.f58275e = d80.g.STRING;
        bVar.f58277g = true;
        bVar.f58276f = new dm.a(j8, qd2.a.EnumC2721a.ACTIVITY_LAPS, DateTimeConstants.MINUTES_PER_DAY);
        d80.f<Object> fVarA = bVar.a();
        fVarA.b();
        this.f138894l = fVarA;
    }

    public final void y6() {
        this.f138892j++;
        this.f139000g.U7();
        cw.a aVarM = cw.a.M();
        long j8 = this.f138999f;
        x0 x0VarC = this.f138998e.C();
        aVarM.getClass();
        w0 w0VarK = new bm.i(j8, x0VarC, tq.k.i(x0VarC)).k();
        this.f138893k = w0VarK;
        w0VarK.f(this, new a());
    }

    public uo.a z6() {
        return null;
    }
}
