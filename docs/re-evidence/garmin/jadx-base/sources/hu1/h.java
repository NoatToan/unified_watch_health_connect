package hu1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.a0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.m0;
import d62.s;
import fu1.u;
import h62.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p13.h0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lhu1/h;", "Lcom/garmin/android/apps/connectmobile/m0;", "<init>", "()V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h extends m0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f85722o = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public DateTime f85723h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public DateTime f85724i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public RecyclerView f85725j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c f85726k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public i f85727l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public wt1.b f85728m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final b f85729n = new b();

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"hu1/h$b", "Lcom/garmin/android/library/backgroundtaskmanagement/b$b;", "", "Lfu1/u;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<List<? extends u>> {
        public b() {
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            cVar.getClass();
            h hVar = h.this;
            hVar.w6();
            if (cVar == com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS) {
                wt1.b bVar = hVar.f85728m;
                if (bVar != null) {
                    bVar.e();
                    return;
                }
                return;
            }
            wt1.b bVar2 = hVar.f85728m;
            if (bVar2 != null) {
                bVar2.g();
            }
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, List<? extends u> list) {
            List<? extends u> list2 = list;
            eVar.getClass();
            list2.getClass();
            h hVar = h.this;
            s sVar = new s(hVar, list2, j8, 2);
            if (eVar == com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE) {
                sVar.invoke();
            }
            c cVar = hVar.f85726k;
            if (cVar == null) {
                p005kotlin.jvm.internal.s.m("adapter");
                throw null;
            }
            i iVar = hVar.f85727l;
            Long lValueOf = iVar != null ? Long.valueOf(iVar.f85736f) : null;
            i iVar2 = hVar.f85727l;
            ww1.h athleteRace = iVar2 != null ? iVar2.f85731a.getAthleteRace() : null;
            ArrayList arrayList = cVar.f85714d;
            cVar.f85715e = lValueOf != null ? lValueOf.longValue() : 0L;
            cVar.f85716f = athleteRace;
            arrayList.clear();
            arrayList.addAll(h0.N0(list2, new e(new d())));
            cVar.notifyDataSetChanged();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.m0
    public final void E6() {
        i iVar = this.f85727l;
        if (iVar != null) {
            DateTime dateTime = this.f85723h;
            if (dateTime == null) {
                p005kotlin.jvm.internal.s.m("startDate");
                throw null;
            }
            DateTime dateTime2 = this.f85724i;
            if (dateTime2 == null) {
                p005kotlin.jvm.internal.s.m("endDate");
                throw null;
            }
            b bVar = this.f85729n;
            bVar.getClass();
            HashMap map = iVar.f85734d;
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, "WorkoutSchedulePresenter", "refresh workout schedule");
            map.remove(new hu1.b(dateTime, dateTime2));
            iVar.c(dateTime, dateTime2, bVar);
        }
    }

    public final void I6() {
        G6();
        i iVar = this.f85727l;
        if (iVar != null) {
            DateTime dateTime = this.f85723h;
            if (dateTime == null) {
                p005kotlin.jvm.internal.s.m("startDate");
                throw null;
            }
            DateTime dateTime2 = this.f85724i;
            if (dateTime2 == null) {
                p005kotlin.jvm.internal.s.m("endDate");
                throw null;
            }
            iVar.c(dateTime, dateTime2, this.f85729n);
        }
        DateTime dateTime3 = this.f85723h;
        if (dateTime3 == null) {
            p005kotlin.jvm.internal.s.m("startDate");
            throw null;
        }
        String string = dateTime3.toString("yyyy-MM-dd");
        DateTime dateTime4 = this.f85724i;
        if (dateTime4 == null) {
            p005kotlin.jvm.internal.s.m("endDate");
            throw null;
        }
        String strJ = a0.j("refreshFragmentData: ", string, " - ", dateTime4.toString("yyyy-MM-dd"));
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "WorkoutScheduleFragment", strJ);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        c cVar = new c(this.f85727l);
        this.f85726k = cVar;
        RecyclerView recyclerView = this.f85725j;
        if (recyclerView == null) {
            p005kotlin.jvm.internal.s.m("recyclerView");
            throw null;
        }
        recyclerView.setAdapter(cVar);
        I6();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            return;
        }
        this.f85723h = new DateTime(arguments.getLong("GCM_extra_start_date"));
        this.f85724i = new DateTime(arguments.getLong("GCM_extra_end_date"));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return A6(viewGroup, layoutInflater, R.layout.gcm4_training_recycler_view_and_error_layout);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        wt1.b bVar = new wt1.b(view2.findViewById(R.id.training_error_layout));
        this.f85728m = bVar;
        bVar.b();
        wt1.b bVar2 = this.f85728m;
        if (bVar2 != null) {
            bVar2.c(new j(this, 16));
        }
        wt1.b bVar3 = this.f85728m;
        if (bVar3 != null) {
            bVar3.a();
        }
        wt1.b bVar4 = this.f85728m;
        if (bVar4 != null) {
            bVar4.e();
        }
        View viewFindViewById = view2.findViewById(R.id.simple_recycler_view);
        viewFindViewById.getClass();
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f85725j = recyclerView;
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lhu1/h$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
