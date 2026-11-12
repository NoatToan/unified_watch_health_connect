package lf2;

import android.content.Intent;
import com.garmin.android.livesessionview.LiveActivityActivity;
import com.garmin.android.livesessionview.LiveActivityActivity.b;
import e23.l;
import e23.p;
import kh0.d;
import p005kotlin.Unit;
import p3.l0;
import p3.m;
import p3.n;
import p3.v;
import p3.x1;
import r53.i;
import ug2.q0;
import z3.e;
import z3.f;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f112136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LiveActivityActivity f112137b;

    public /* synthetic */ a(LiveActivityActivity liveActivityActivity, int i14) {
        this.f112136a = i14;
        this.f112137b = liveActivityActivity;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0045  */
    /* JADX WARN: Code duplicated, block: B:19:0x0060  */
    /* JADX WARN: Code duplicated, block: B:33:0x00bf  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, o13.l] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.Object, o13.l] */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f112136a;
        m.a aVar = m.f135153a;
        final LiveActivityActivity liveActivityActivity = this.f112137b;
        Object[] objArr = 0;
        final int i15 = 1;
        m mVar = (m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i14) {
            case 0:
                LiveActivityActivity.a aVar2 = LiveActivityActivity.f50544d;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    v.a(kg2.c.f104706a.c((kg2.b) liveActivityActivity.f50547c.getValue()), f.c(188953561, new a(liveActivityActivity, i15), mVar), mVar, 56);
                    i<com.garmin.android.livesessionview.c> iVar = ((com.garmin.android.livesessionview.a) liveActivityActivity.f50545a.getValue()).f50570d;
                    boolean zR = mVar.r(liveActivityActivity);
                    Object objQ = mVar.q();
                    if (zR) {
                        objQ = liveActivityActivity.new b(null);
                        mVar.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = liveActivityActivity.new b(null);
                            mVar.K(objQ);
                        }
                    }
                    l0.e((p) objQ, iVar, mVar);
                } else {
                    mVar.e();
                }
                break;
            default:
                LiveActivityActivity.a aVar3 = LiveActivityActivity.f50544d;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    e eVarC = f.c(-1967000499, new d(liveActivityActivity, 23), mVar);
                    boolean zR2 = mVar.r(liveActivityActivity);
                    Object objQ2 = mVar.q();
                    if (zR2) {
                        final Object[] objArr2 = objArr == true ? 1 : 0;
                        objQ2 = new l() { // from class: lf2.b
                            @Override // e23.l
                            public final Object invoke(Object obj3) {
                                int i16 = objArr2;
                                LiveActivityActivity liveActivityActivity2 = liveActivityActivity;
                                switch (i16) {
                                    case 0:
                                        Intent intent = (Intent) obj3;
                                        LiveActivityActivity.a aVar4 = LiveActivityActivity.f50544d;
                                        intent.getClass();
                                        liveActivityActivity2.startActivity(intent);
                                        break;
                                    default:
                                        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                                        LiveActivityActivity.a aVar5 = LiveActivityActivity.f50544d;
                                        liveActivityActivity2.setResult(zBooleanValue ? -1 : 0);
                                        liveActivityActivity2.finish();
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == m.a.f135155b) {
                            final int objArr3 = objArr == true ? 1 : 0;
                            objQ2 = new l() { // from class: lf2.b
                                @Override // e23.l
                                public final Object invoke(Object obj3) {
                                    int i16 = objArr3;
                                    LiveActivityActivity liveActivityActivity2 = liveActivityActivity;
                                    switch (i16) {
                                        case 0:
                                            Intent intent = (Intent) obj3;
                                            LiveActivityActivity.a aVar4 = LiveActivityActivity.f50544d;
                                            intent.getClass();
                                            liveActivityActivity2.startActivity(intent);
                                            break;
                                        default:
                                            boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                                            LiveActivityActivity.a aVar5 = LiveActivityActivity.f50544d;
                                            liveActivityActivity2.setResult(zBooleanValue ? -1 : 0);
                                            liveActivityActivity2.finish();
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar.K(objQ2);
                        }
                    }
                    l lVar = (l) objQ2;
                    boolean zR3 = mVar.r(liveActivityActivity);
                    Object objQ3 = mVar.q();
                    if (zR3) {
                        objQ3 = new l() { // from class: lf2.b
                            @Override // e23.l
                            public final Object invoke(Object obj3) {
                                int i16 = i15;
                                LiveActivityActivity liveActivityActivity2 = liveActivityActivity;
                                switch (i16) {
                                    case 0:
                                        Intent intent = (Intent) obj3;
                                        LiveActivityActivity.a aVar4 = LiveActivityActivity.f50544d;
                                        intent.getClass();
                                        liveActivityActivity2.startActivity(intent);
                                        break;
                                    default:
                                        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                                        LiveActivityActivity.a aVar5 = LiveActivityActivity.f50544d;
                                        liveActivityActivity2.setResult(zBooleanValue ? -1 : 0);
                                        liveActivityActivity2.finish();
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == m.a.f135155b) {
                            objQ3 = new l() { // from class: lf2.b
                                @Override // e23.l
                                public final Object invoke(Object obj3) {
                                    int i16 = i15;
                                    LiveActivityActivity liveActivityActivity2 = liveActivityActivity;
                                    switch (i16) {
                                        case 0:
                                            Intent intent = (Intent) obj3;
                                            LiveActivityActivity.a aVar4 = LiveActivityActivity.f50544d;
                                            intent.getClass();
                                            liveActivityActivity2.startActivity(intent);
                                            break;
                                        default:
                                            boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                                            LiveActivityActivity.a aVar5 = LiveActivityActivity.f50544d;
                                            liveActivityActivity2.setResult(zBooleanValue ? -1 : 0);
                                            liveActivityActivity2.finish();
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar.K(objQ3);
                        }
                    }
                    q0.c(eVarC, lVar, (l) objQ3, mVar, 6);
                } else {
                    mVar.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
