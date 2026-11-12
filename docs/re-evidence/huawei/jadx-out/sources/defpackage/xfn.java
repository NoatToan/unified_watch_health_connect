package defpackage;

import android.view.View;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.uikit.hwrecyclerview.widget.HwLinearLayoutManagerEx;

/* JADX INFO: loaded from: classes44.dex */
public class xfn {
    public static int a(RecyclerView.State state, OrientationHelper orientationHelper, HwLinearLayoutManagerEx.e eVar, RecyclerView.LayoutManager layoutManager) {
        View view;
        if (state == null || state.getItemCount() == 0 || layoutManager == null || layoutManager.getChildCount() == 0 || orientationHelper == null || eVar == null || eVar.f29642b == null || (view = eVar.e) == null) {
            return 0;
        }
        return !eVar.f29641a ? state.getItemCount() : (int) (((orientationHelper.getDecoratedEnd(view) - orientationHelper.getDecoratedStart(eVar.f29642b)) / (Math.abs(layoutManager.getPosition(eVar.f29642b) - layoutManager.getPosition(eVar.e)) + 1)) * state.getItemCount());
    }

    public static int e(RecyclerView.State state, OrientationHelper orientationHelper, HwLinearLayoutManagerEx.e eVar, RecyclerView.LayoutManager layoutManager, boolean z) {
        View view;
        if (state == null || state.getItemCount() == 0 || layoutManager == null || layoutManager.getChildCount() == 0 || orientationHelper == null || eVar == null || (view = eVar.f29642b) == null || eVar.e == null) {
            return 0;
        }
        int iMax = z ? Math.max(0, (state.getItemCount() - Math.max(layoutManager.getPosition(eVar.f29642b), layoutManager.getPosition(eVar.e))) - 1) : Math.max(0, Math.min(layoutManager.getPosition(view), layoutManager.getPosition(eVar.e)));
        return !eVar.f29641a ? iMax : Math.round((iMax * (Math.abs(orientationHelper.getDecoratedEnd(eVar.e) - orientationHelper.getDecoratedStart(eVar.f29642b)) / (Math.abs(layoutManager.getPosition(eVar.f29642b) - layoutManager.getPosition(eVar.e)) + 1))) + (orientationHelper.getStartAfterPadding() - orientationHelper.getDecoratedStart(eVar.f29642b)));
    }

    public static int d(RecyclerView.State state, OrientationHelper orientationHelper, HwLinearLayoutManagerEx.e eVar, RecyclerView.LayoutManager layoutManager) {
        if (state == null || state.getItemCount() == 0 || layoutManager == null || layoutManager.getChildCount() == 0 || orientationHelper == null || eVar == null) {
            return 0;
        }
        if (!eVar.f29641a) {
            return Math.abs(layoutManager.getPosition(eVar.f29642b) - layoutManager.getPosition(eVar.e)) + 1;
        }
        return Math.min(orientationHelper.getTotalSpace(), orientationHelper.getDecoratedEnd(eVar.e) - orientationHelper.getDecoratedStart(eVar.f29642b));
    }
}
