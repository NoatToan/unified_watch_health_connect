package d62;

import android.content.Context;
import android.content.Intent;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.workouts.presentation.details.doworkout.WorkoutActivityProfileSelectionActivity;
import com.garmin.android.apps.connectmobile.workouts.presentation.edit.WorkoutPreCreateActivity;
import com.garmin.android.apps.connectmobile.workouts.presentation.edit.j0;
import java.util.List;
import java.util.Set;
import o53.b0;
import o53.s0;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p3.p1;
import pt1.x;
import qt1.h0;
import qt1.y;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class r implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f58062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f58063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f58064d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f58065e;

    public /* synthetic */ r(WorkoutPreCreateActivity workoutPreCreateActivity, b0 b0Var, m52.k kVar, long j8) {
        this.f58061a = 1;
        this.f58063c = workoutPreCreateActivity;
        this.f58064d = b0Var;
        this.f58065e = kVar;
        this.f58062b = j8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, o13.l] */
    @Override // e23.a
    public final Object invoke() {
        Object value;
        int i14 = this.f58061a;
        long j8 = this.f58062b;
        ?? r14 = this.f58065e;
        Object obj = this.f58064d;
        Object obj2 = this.f58063c;
        switch (i14) {
            case 0:
                WorkoutActivityProfileSelectionActivity workoutActivityProfileSelectionActivity = (WorkoutActivityProfileSelectionActivity) obj2;
                WorkoutActivityProfileSelectionActivity.b bVar = WorkoutActivityProfileSelectionActivity.f48559a;
                i iVar = ((b) ((p1) obj).getF182175a()).f57999b;
                List<j> list = iVar != null ? iVar.f58017b : null;
                if (list == null || list.isEmpty()) {
                    j jVar = iVar != null ? iVar.f58016a : null;
                    Intent intent = new Intent();
                    intent.putExtra("extra_selected_device_unit_id", j8);
                    intent.putExtra("extra_selected_profile", jVar);
                    workoutActivityProfileSelectionActivity.setResult(-1, intent);
                    workoutActivityProfileSelectionActivity.finish();
                } else {
                    t tVar = (t) r14.getValue();
                    p2 p2Var = tVar.f58072c;
                    do {
                        value = p2Var.getValue();
                    } while (!p2Var.b(value, b.a((b) value, d.CHILD_PROFILE, null, null, tVar.f58070a, 6)));
                }
                break;
            case 1:
                WorkoutPreCreateActivity workoutPreCreateActivity = (WorkoutPreCreateActivity) obj2;
                WorkoutPreCreateActivity.a aVar = WorkoutPreCreateActivity.f48888d;
                workoutPreCreateActivity.showProgressOverlay();
                ge1.b.T((b0) obj, null, null, new j0(workoutPreCreateActivity, (m52.k) r14, this.f58062b, null), 3);
                break;
            case 2:
                ((ff2.c) obj2).c(kf2.a.DISMISSED, j8);
                ((jf2.a) obj).f98720b.a(o70.f.CAMPAIGN.f129989a);
                ((e23.a) r14).invoke();
                break;
            case 3:
                ((ff2.c) obj2).c(kf2.a.VIEW_DETAILS, j8);
                ((ff2.b) KoinJavaComponent.get$default(ff2.b.class, null, null, 6, null)).a((Context) obj);
                ((e23.a) r14).invoke();
                break;
            case 4:
                ep1.e eVar = (ep1.e) obj2;
                ge1.b.T(v1.a(eVar), null, null, new ep1.d(eVar, this.f58062b, (DateTime) obj, (DateTime) r14, null), 3);
                break;
            default:
                qt1.k kVar = (qt1.k) obj2;
                Context context = (Context) obj;
                x xVar = (x) r14;
                vs1.l lVar = kVar.f147683r;
                Set<Long> set = kVar.f147684t.f179847f;
                lVar.getClass();
                context.getClass();
                set.getClass();
                us1.e eVar2 = us1.e.CHRONOLOGICAL;
                eVar2.getClass();
                Context context2 = context;
                ge1.b.T(lVar.f179848a, null, null, new vs1.n(lVar, eVar2, context2, set, null), 3);
                x xVar2 = (x) kVar.f147677l.getValue();
                if (xVar2 != null) {
                    long j14 = xVar2.f141004a;
                    long j15 = this.f58062b;
                    if (j14 == j15) {
                        w9.a aVarA = v1.a(kVar);
                        x53.b bVar2 = x53.b.f189152a;
                        y yVar = new y(kVar, context2, j15, null);
                        context2 = context2;
                        ge1.b.T(aVarA, bVar2, null, yVar, 2);
                    }
                }
                i53.c<x> cVar = ((pt1.o) kVar.f147673h.getValue()).f140919q;
                if (cVar != null && !cVar.isEmpty()) {
                    for (x xVar3 : cVar) {
                        if (xVar != null && xVar3.f141004a == xVar.f141004a) {
                            w9.a aVarA2 = v1.a(kVar);
                            x53.c cVar2 = s0.f129406a;
                            ge1.b.T(aVarA2, x53.b.f189152a, null, new h0(kVar, context2, null), 2);
                        }
                    }
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ r(Object obj, long j8, Object obj2, Object obj3, int i14) {
        this.f58061a = i14;
        this.f58063c = obj;
        this.f58062b = j8;
        this.f58064d = obj2;
        this.f58065e = obj3;
    }

    public /* synthetic */ r(qt1.k kVar, Context context, long j8, x xVar) {
        this.f58061a = 5;
        this.f58063c = kVar;
        this.f58064d = context;
        this.f58062b = j8;
        this.f58065e = xVar;
    }
}
