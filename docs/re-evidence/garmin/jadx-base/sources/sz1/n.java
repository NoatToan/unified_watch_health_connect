package sz1;

import com.garmin.android.apps.connectmobile.trainingrediness.presentation.TrainingReadinessFeedBackPhraseTest;
import p005kotlin.Unit;
import p3.x1;
import rk0.a1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class n implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f161560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f161561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TrainingReadinessFeedBackPhraseTest f161562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f161563d;

    public /* synthetic */ n(String str, TrainingReadinessFeedBackPhraseTest trainingReadinessFeedBackPhraseTest, boolean z14, int i14) {
        this.f161560a = i14;
        this.f161561b = str;
        this.f161562c = trainingReadinessFeedBackPhraseTest;
        this.f161563d = z14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f161560a;
        boolean z14 = this.f161563d;
        TrainingReadinessFeedBackPhraseTest trainingReadinessFeedBackPhraseTest = this.f161562c;
        String str = this.f161561b;
        int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i16 = TrainingReadinessFeedBackPhraseTest.f46487a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-1677378273, new n(str, trainingReadinessFeedBackPhraseTest, z14, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i17 = TrainingReadinessFeedBackPhraseTest.f46487a;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    z02.d.a(false, z3.f.c(835539130, new a1(28, str, trainingReadinessFeedBackPhraseTest), mVar2), null, null, null, z3.f.c(567296822, new ap2.f(z14, trainingReadinessFeedBackPhraseTest, 19), mVar2), mVar2, 196656, 29);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
