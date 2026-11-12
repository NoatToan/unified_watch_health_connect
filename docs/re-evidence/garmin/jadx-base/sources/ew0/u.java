package ew0;

import c2.x2;
import com.garmin.android.apps.connectmobile.onboarding.education.VoiceAssistantEducationalActivity;
import i3.i7;
import kotlin.t1;
import kotlin.t3;
import l72.v2;
import p005kotlin.Unit;
import p3.p0;
import p3.x1;
import v62.e1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class u implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f66280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f66281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f66282c;

    public /* synthetic */ u(int i14, int i15, boolean z14, boolean z15) {
        this.f66280a = i15;
        this.f66281b = z14;
        this.f66282c = z15;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f66280a;
        boolean z14 = this.f66282c;
        boolean z15 = this.f66281b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    if (z15 && z14) {
                        mVar.C(33099894);
                        s62.a.f157643a.getClass();
                        u4.d dVarA = e1.a(t62.b.f162798a);
                        long jG = fb1.c.g(d92.b.f58623a, mVar);
                        h4.r.a aVar = h4.r.S;
                        d92.b.f58625c.getClass();
                        i7.b(dVarA, null, x2.q(aVar, j92.b.f97901d.f97903b), jG, mVar, 48, 0);
                        mVar.f();
                    } else {
                        mVar.C(33348266);
                        mVar.f();
                    }
                } else {
                    mVar.e();
                }
                break;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                VoiceAssistantEducationalActivity.a aVar2 = VoiceAssistantEducationalActivity.f39694a;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-843899237, new a11.u(z15, z14, (t3) mVar2.A(t1.f91501s), 4), mVar2), mVar2, 196608, 31);
                } else {
                    mVar2.e();
                }
                break;
            case 2:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA2 = e1.a(t62.b.f162798a);
                    long jG2 = fb1.c.g(d92.b.f58623a, mVar3);
                    h4.r rVarA = v2.a(h4.r.S, (z15 && z14) ? false : true, new c02.d(z14, 3), mVar3, 6);
                    d92.b.f58625c.getClass();
                    i7.b(dVarA2, null, x2.q(rVarA, j92.b.f97901d.f97905d), jG2, mVar3, 48, 0);
                } else {
                    mVar3.e();
                }
                break;
            case 3:
                ((Integer) obj2).getClass();
                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.h.i(z15, z14, (p3.m) obj, p0.t(1));
                break;
            default:
                ((Integer) obj2).getClass();
                y01.p.b(z15, z14, (p3.m) obj, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ u(int i14, boolean z14, boolean z15) {
        this.f66280a = i14;
        this.f66281b = z14;
        this.f66282c = z15;
    }
}
