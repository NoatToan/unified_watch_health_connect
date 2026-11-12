package x01;

import com.garmin.android.apps.connectmobile.nutrition.presentation.NutritionActivity;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f188238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f188239b;

    public /* synthetic */ a(k kVar, int i14) {
        this.f188238a = i14;
        this.f188239b = kVar;
    }

    @Override // e23.a
    public final Object invoke() {
        Object value;
        int i14 = this.f188238a;
        k kVar = this.f188239b;
        switch (i14) {
            case 0:
                NutritionActivity.a aVar = NutritionActivity.f39581f;
                kVar.z4(false);
                break;
            case 1:
                NutritionActivity.a aVar2 = NutritionActivity.f39581f;
                p2 p2Var = kVar.f188299m;
                do {
                    value = p2Var.getValue();
                    ((Boolean) value).getClass();
                } while (!p2Var.b(value, Boolean.FALSE));
                break;
            default:
                NutritionActivity.a aVar3 = NutritionActivity.f39581f;
                kVar.z4(true);
                break;
        }
        return Unit.INSTANCE;
    }
}
