package defpackage;

import android.content.Context;
import android.util.Log;
import android.view.ViewGroup;
import com.huawei.uikit.hwbottomsheet.widget.HwViewDragHelper;

/* JADX INFO: loaded from: classes43.dex */
public class xdw extends HwViewDragHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final xea.b f52758a;

    private xdw(Context context, ViewGroup viewGroup, HwViewDragHelper.Callback callback) {
        super(context, viewGroup, callback);
        this.f52758a = f().e();
    }

    public static xdw e(ViewGroup viewGroup, float f, HwViewDragHelper.Callback callback) {
        xdw xdwVarC = c(viewGroup, callback);
        xdwVarC.b((int) (xdwVarC.h() * (Float.compare(f, 0.0f) != 0 ? 1.0f / f : 1.0f)));
        return xdwVarC;
    }

    @Override // com.huawei.uikit.hwbottomsheet.widget.HwViewDragHelper
    public boolean b(int i, int i2, int i3, int i4) {
        if (e() == null) {
            Log.w("HwSoftLightAnimViewDragHelper", "slideViewAt: mCapturedView is null!");
            return false;
        }
        int left = e().getLeft();
        int top = e().getTop();
        int i5 = i2 - top;
        if (i - left == 0 && i5 == 0) {
            d(0);
            j().c();
            f().c();
            return false;
        }
        if (i5 != 0) {
            this.f52758a.a(null, top, i2);
        }
        d(2);
        return true;
    }

    @Override // com.huawei.uikit.hwbottomsheet.widget.HwViewDragHelper
    public boolean i() {
        return this.f52758a.a();
    }

    public static xdw c(ViewGroup viewGroup, HwViewDragHelper.Callback callback) {
        return new xdw(viewGroup.getContext(), viewGroup, callback);
    }

    @Override // com.huawei.uikit.hwbottomsheet.widget.HwViewDragHelper
    public float b() {
        return this.f52758a.c();
    }
}
