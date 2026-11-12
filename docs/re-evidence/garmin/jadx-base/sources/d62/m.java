package d62;

import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.workouts.presentation.details.doworkout.WorkoutActivityProfileSelectionActivity;
import gl1.y;
import l72.f0;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class m implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f58040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f58041c;

    public /* synthetic */ m(i iVar, e23.a aVar, int i14) {
        this.f58039a = i14;
        this.f58040b = iVar;
        this.f58041c = aVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14;
        int i15;
        String strH;
        int i16 = this.f58039a;
        i iVar = this.f58040b;
        switch (i16) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                WorkoutActivityProfileSelectionActivity.b bVar = WorkoutActivityProfileSelectionActivity.f48559a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    j jVar = iVar.f58016a;
                    jVar.getClass();
                    int i17 = k.a.f58035b[jVar.f58024a.ordinal()];
                    if (i17 != 1) {
                        if (i17 != 2) {
                            mVar.C(1334573761);
                            mVar.f();
                            strH = jVar.name();
                        } else {
                            i14 = 1334571565;
                            i15 = R.string.lbl_select_cycling_type;
                        }
                        z02.f.c(0, 54, null, this.f58041c, null, strH, mVar, null);
                    } else {
                        i14 = 1334569197;
                        i15 = R.string.lbl_select_running_type;
                    }
                    strH = sn.a.h(mVar, i14, i15, mVar);
                    z02.f.c(0, 54, null, this.f58041c, null, strH, mVar, null);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    f0.f110999a.d(384, 1, this.f58041c, x2.f(h4.r.S, 1.0f), y.Q(mVar2, R.string.lbl_next), mVar2, null, iVar != null);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
