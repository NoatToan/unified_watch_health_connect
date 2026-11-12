package zq2;

import com.garmin.feature.garminpay.ui.addcard.SelectCategoryActivity;
import l72.i3;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class j implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f206694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SelectCategoryActivity f206695b;

    public /* synthetic */ j(SelectCategoryActivity selectCategoryActivity, int i14) {
        this.f206694a = i14;
        this.f206695b = selectCategoryActivity;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, o13.l] */
    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f206694a;
        SelectCategoryActivity selectCategoryActivity = this.f206695b;
        switch (i14) {
            case 0:
                com.garmin.feature.garminpay.ui.addcard.b.c cVar = (com.garmin.feature.garminpay.ui.addcard.b.c) obj;
                SelectCategoryActivity.a aVar = SelectCategoryActivity.f51799i;
                cVar.getClass();
                ((ar2.b) selectCategoryActivity.f51800g.getValue()).z4(cVar);
                break;
            default:
                i3 i3Var = (i3) obj;
                SelectCategoryActivity.a aVar2 = SelectCategoryActivity.f51799i;
                i3Var.getClass();
                if (s.g(i3Var.f111063a, "HELP")) {
                    or2.b.f133424a.getClass();
                    selectCategoryActivity.startActivity(or2.b.a());
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
