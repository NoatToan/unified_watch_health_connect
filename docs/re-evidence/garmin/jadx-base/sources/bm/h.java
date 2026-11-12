package bm;

import am.x0;
import android.content.Intent;
import com.garmin.android.apps.connectmobile.activities.advancedactivityediting.ActivitiesTrimActivity;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.z1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.advancedactivityediting.ActivitiesTrimActivity$observeUploadStatus$1", f = "ActivitiesTrimActivity.kt", l = {480}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActivitiesTrimActivity f18806b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ActivitiesTrimActivity f18807a;

        public a(ActivitiesTrimActivity activitiesTrimActivity) {
            this.f18807a = activitiesTrimActivity;
        }

        /* JADX WARN: Code duplicated, block: B:28:0x008d  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            long jLongValue;
            List list;
            String str;
            int iIndexOf;
            o13.p pVar = (o13.p) obj;
            if (pVar != null) {
                A a14 = pVar.f128594a;
                int iIntValue = ((Number) pVar.f128595b).intValue();
                ActivitiesTrimActivity.a aVar = ActivitiesTrimActivity.f28809p;
                ActivitiesTrimActivity activitiesTrimActivity = this.f18807a;
                activitiesTrimActivity.getClass();
                if (iIntValue == 201 && activitiesTrimActivity.f28823n) {
                    activitiesTrimActivity.setResult(0);
                    activitiesTrimActivity.finish();
                    com.garmin.android.apps.connectmobile.activities.advancedactivityediting.d dVarGa = activitiesTrimActivity.ga();
                    dVarGa.getClass();
                    ((am.d) KoinJavaComponent.get$default(am.d.class, null, null, 6, null)).M();
                    com.garmin.android.apps.connectmobile.activities.newmodel.h hVar = dVarGa.f28869g;
                    if (a14 != 0) {
                        if (hVar != null) {
                            jLongValue = hVar.f29448a;
                        } else if (a14 instanceof TreeMap) {
                            TreeMap treeMap = (TreeMap) a14;
                            if (!treeMap.containsKey(FirebaseAnalytics.Param.LOCATION) || !(treeMap.get(FirebaseAnalytics.Param.LOCATION) instanceof List) || (list = (List) treeMap.get(FirebaseAnalytics.Param.LOCATION)) == null || list.isEmpty() || !(list.get(0) instanceof String) || (iIndexOf = (str = (String) list.get(0)).indexOf("activity/")) == -1) {
                                jLongValue = -1;
                            } else {
                                jLongValue = Long.valueOf(str.substring(iIndexOf + 9)).longValue();
                            }
                        } else {
                            jLongValue = -1;
                        }
                        x0 x0VarC = hVar != null ? hVar.C() : null;
                        if (x0VarC != null && jLongValue != -1) {
                            qd2.a aVarB = qd2.a.b();
                            if (aVarB != null) {
                                aVarB.i(qd2.a.b.ACTIVITY_LIST);
                                aVarB.h(qd2.a.EnumC2721a.ACTIVITY_DETAILS, jLongValue);
                                aVarB.h(qd2.a.EnumC2721a.ACTIVITY_CHARTS, jLongValue);
                            }
                            aq.b bVar = new aq.b();
                            bVar.f11823b = jLongValue;
                            bVar.f11827f = x0VarC.f4358a;
                            Intent intentA = bVar.a(activitiesTrimActivity);
                            intentA.putExtra("GCM_extra_get_from_cache", false);
                            activitiesTrimActivity.startActivity(intentA);
                        }
                    }
                } else if (a14 != 0 && (a14 instanceof Map) && iIntValue != 201) {
                    activitiesTrimActivity.ga().B4(p13.x.d("", a14));
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ActivitiesTrimActivity activitiesTrimActivity, t13.d<? super h> dVar) {
        super(2, dVar);
        this.f18806b = activitiesTrimActivity;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h(this.f18806b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f18805a;
        if (i14 == 0) {
            o13.r.b(obj);
            ActivitiesTrimActivity.a aVar2 = ActivitiesTrimActivity.f28809p;
            ActivitiesTrimActivity activitiesTrimActivity = this.f18806b;
            z1 z1Var = activitiesTrimActivity.ga().C;
            a aVar3 = new a(activitiesTrimActivity);
            this.f18805a = 1;
            if (z1Var.collect(aVar3, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        o2.c.f();
        return null;
    }
}
