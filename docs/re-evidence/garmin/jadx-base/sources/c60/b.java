package c60;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import p005kotlin.Unit;
import p40.h0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f24615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f24616c;

    public /* synthetic */ b(v vVar, e23.a aVar, int i14) {
        this.f24614a = i14;
        this.f24615b = vVar;
        this.f24616c = aVar;
    }

    @Override // e23.a
    public final Object invoke() {
        View view2;
        switch (this.f24614a) {
            case 0:
                e.d(this.f24615b, "CoursePointBottomSheetFragment");
                this.f24616c.invoke();
                break;
            case 1:
                v vVar = this.f24615b;
                e.d(vVar, "UpdateCoursePointLocationSheetFragment");
                Fragment fragmentG = vVar.G("EditCoursePointBottomSheetFrag");
                h0 h0Var = fragmentG instanceof h0 ? (h0) fragmentG : null;
                if (h0Var != null && (view2 = h0Var.getView()) != null) {
                    view2.setImportantForAccessibility(1);
                }
                this.f24616c.invoke();
                break;
            case 2:
                e.d(this.f24615b, "CoursePointDetailsBottomSheet");
                this.f24616c.invoke();
                break;
            case 3:
                e.d(this.f24615b, "CourseClimbsBottomSheet");
                this.f24616c.invoke();
                break;
            default:
                e.d(this.f24615b, "ClimbSystemBottomSheet");
                this.f24616c.invoke();
                break;
        }
        return Unit.INSTANCE;
    }
}
