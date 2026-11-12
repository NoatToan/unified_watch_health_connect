package c60;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import p005kotlin.Unit;
import t30.m;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f24613b;

    public /* synthetic */ a(v vVar, int i14) {
        this.f24612a = i14;
        this.f24613b = vVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f24612a) {
            case 0:
                e.d(this.f24613b, "ChooseCoursePointBottomSheet");
                break;
            case 1:
                e.d(this.f24613b, "EditCoursePointBottomSheetFrag");
                break;
            case 2:
                v vVar = this.f24613b;
                e.d(vVar, "ClimbDetailsBottomSheet");
                Fragment fragmentG = vVar.G("CourseClimbsBottomSheet");
                m mVar = fragmentG instanceof m ? (m) fragmentG : null;
                if (mVar != null) {
                    View view2 = mVar.getView();
                    if (view2 != null) {
                        view2.setImportantForAccessibility(1);
                    }
                    mVar.w6().setHideable(true);
                    mVar.w6().addBottomSheetCallback(mVar.f162196n);
                    mVar.C6();
                }
                break;
            case 3:
                e.d(this.f24613b, "ClimbDetailsBottomSheet");
                break;
            default:
                e.d(this.f24613b, "UpdateCoursePointMultipleSelectionFragment");
                break;
        }
        return Unit.INSTANCE;
    }
}
