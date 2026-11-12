package s91;

import com.garmin.android.apps.connectmobile.personalrecords.presentation.activity.PersonalRecordsActivity;
import e23.p;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.m;
import p3.n;
import p3.v;
import p3.x1;
import q91.d;
import q91.g;
import w91.x;
import z02.b;
import z3.f;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f158035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PersonalRecordsActivity f158036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f158037c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f158038d;

    public /* synthetic */ a(PersonalRecordsActivity personalRecordsActivity, g gVar, d dVar, int i14) {
        this.f158035a = i14;
        this.f158036b = personalRecordsActivity;
        this.f158037c = gVar;
        this.f158038d = dVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f158035a;
        d dVar = this.f158038d;
        g gVar = this.f158037c;
        PersonalRecordsActivity personalRecordsActivity = this.f158036b;
        int i15 = 2;
        int i16 = 1;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                PersonalRecordsActivity.a aVar = PersonalRecordsActivity.f40337b;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    b.a(false, null, null, null, false, f.c(556144055, new a(personalRecordsActivity, gVar, dVar, i16), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                PersonalRecordsActivity.a aVar2 = PersonalRecordsActivity.f40337b;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    v.a(g02.d.f74342a.c(personalRecordsActivity.getOnBackPressedDispatcher()), f.c(-1825564041, new a(personalRecordsActivity, gVar, dVar, i15), mVar2), mVar2, 56);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            default:
                m mVar3 = (m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                PersonalRecordsActivity.a aVar3 = PersonalRecordsActivity.f40337b;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = n.f135158a;
                    ba1.d dVar2 = personalRecordsActivity.f40338a;
                    if (dVar2 == null) {
                        s.m("personalRecordsViewModel");
                        throw null;
                    }
                    x.a(dVar2, this.f158037c, this.f158038d, null, mVar3, 0);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
        }
    }
}
