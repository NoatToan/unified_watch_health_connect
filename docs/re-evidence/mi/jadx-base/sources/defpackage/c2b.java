package defpackage;

import com.xiaomi.fitness.baseui.dialog.PickerDialog;
import com.xiaomi.fitness.userinfo.utils.GuidePageUtil;

/* JADX INFO: loaded from: classes10.dex */
public class c2b implements PickerDialog.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f4856a;

    public c2b(int i) {
        GuidePageUtil guidePageUtil = GuidePageUtil.INSTANCE;
        if (i == guidePageUtil.getTYPE_GOAL_STEPS()) {
            this.f4856a = xg8.d();
            return;
        }
        if (i == guidePageUtil.getTYPE_GOAL_CALORIE()) {
            this.f4856a = xg8.a();
        } else if (i == guidePageUtil.getTYPE_STAND_COUNT()) {
            this.f4856a = xg8.c();
        } else if (i == guidePageUtil.getTYPE_GOAL_MHS()) {
            this.f4856a = xg8.b();
        }
    }

    @Override // com.xiaomi.fitness.baseui.dialog.PickerDialog.a
    public int getCount() {
        int[] iArr = this.f4856a;
        if (iArr != null) {
            return iArr.length;
        }
        return 0;
    }

    @Override // com.xiaomi.fitness.baseui.dialog.PickerDialog.a
    public int getValue(int i) {
        return this.f4856a[i];
    }
}
