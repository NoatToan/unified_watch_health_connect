package u21;

import androidx.lifecycle.u1;
import p005kotlin.Metadata;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lu21/m0;", "Landroidx/lifecycle/u1;", "", "dailyCalorieGoal", "Ls21/g;", "dailyMacroGoals", "<init>", "(Ljava/lang/Integer;Ls21/g;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m0 extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p2 f168041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p2 f168042b;

    public m0(Integer num, s21.g gVar) {
        s21.f fVar;
        s21.f fVar2;
        s21.f fVar3;
        s21.f fVar4;
        s21.f fVar5;
        s21.f fVar6;
        int iIntValue = num != null ? num.intValue() : 0;
        double d14 = 0.0d;
        double d15 = (gVar == null || (fVar6 = gVar.f156115a) == null) ? 0.0d : fVar6.f156104a;
        int i14 = 30;
        int i15 = (gVar == null || (fVar5 = gVar.f156115a) == null) ? 30 : fVar5.f156105b;
        double d16 = (gVar == null || (fVar4 = gVar.f156116b) == null) ? 0.0d : fVar4.f156104a;
        if (gVar != null && (fVar3 = gVar.f156116b) != null) {
            i14 = fVar3.f156105b;
        }
        if (gVar != null && (fVar2 = gVar.f156117c) != null) {
            d14 = fVar2.f156104a;
        }
        p2 p2VarA = q2.a(new l0(iIntValue, d15, i15, d16, i14, d14, (gVar == null || (fVar = gVar.f156117c) == null) ? 40 : fVar.f156105b));
        this.f168041a = p2VarA;
        this.f168042b = p2VarA;
    }
}
