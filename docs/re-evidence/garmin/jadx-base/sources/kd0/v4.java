package kd0;

import android.content.Context;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkd0/v4;", "Lp01/a;", "Loy/a;", "caloriesRepository", "<init>", "(Loy/a;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class v4 implements p01.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oy.a f104396a;

    public v4(oy.a aVar) {
        aVar.getClass();
        this.f104396a = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p01.a
    public final Object a(DateTime dateTime, DateTime dateTime2, v13.c cVar) {
        u4 u4Var;
        if (cVar instanceof u4) {
            u4Var = (u4) cVar;
            int i14 = u4Var.f104388c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                u4Var.f104388c = i14 - Integer.MIN_VALUE;
            } else {
                u4Var = new u4(this, cVar);
            }
        } else {
            u4Var = new u4(this, cVar);
        }
        Object objA = u4Var.f104386a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = u4Var.f104388c;
        if (i15 == 0) {
            o13.r.b(objA);
            u4Var.f104388c = 1;
            objA = this.f104396a.a(dateTime, dateTime2, u4Var);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objA);
        }
        com.garmin.android.apps.connectmobile.v2 v2Var = (com.garmin.android.apps.connectmobile.v2) objA;
        if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.b)) {
            if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.a) {
                com.garmin.android.apps.connectmobile.v2.a aVar2 = (com.garmin.android.apps.connectmobile.v2.a) v2Var;
                return new com.garmin.android.apps.connectmobile.v2.a(aVar2.f47383a, aVar2.f47384b, aVar2.f47385c);
            }
            lc.u0.r();
            return null;
        }
        com.garmin.android.apps.connectmobile.v2.b bVar = (com.garmin.android.apps.connectmobile.v2.b) v2Var;
        ny.b bVar2 = (ny.b) bVar.f47386a;
        q01.a aVar3 = null;
        if (bVar2 != null) {
            ny.b.C2462b aggregations = bVar2.getAggregations();
            aVar3 = new q01.a(aggregations != null ? aggregations.getActiveCaloriesAverage() : null, bVar2.d().size());
        }
        return new com.garmin.android.apps.connectmobile.v2.b(aVar3, bVar.f47387b, bVar.f47388c, bVar.f47389d);
    }

    @Override // p01.a
    public final Object b(i21.f fVar) {
        com.garmin.android.apps.connectmobile.pregnancytracking.network.d.f40430a.getClass();
        return com.garmin.android.apps.connectmobile.pregnancytracking.network.d.b.i(fVar);
    }

    @Override // p01.a
    public final void c(Context context, boolean z14, int i14, int i15, int i16, int i17, int i18) {
        context.getClass();
        Bundle bundle = new Bundle();
        bundle.putParcelable("EXTRA_DATA", new com.garmin.android.apps.connectmobile.calories.presentation.a.b(com.garmin.android.apps.connectmobile.calories.presentation.a.c.MFP_VERSION, z14, i14, 0, 0, i15, i16, i18, i17, false, 536, (p005kotlin.jvm.internal.j) null));
        HelpActivity.a.e(HelpActivity.f36653a, context, ro0.l.CALORIE, null, bundle, 4);
    }
}
