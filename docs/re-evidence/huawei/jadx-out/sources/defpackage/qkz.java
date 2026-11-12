package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.floatview.HealthFloatingView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class qkz {
    private static List<Integer> e = new ArrayList();
    private static List<Integer> d = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Map<Integer, WeakReference<HealthFloatingView>> f46415b = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f46414a = 3001;

    public static void a(int i) {
        f46414a = i;
    }

    public static void d(List<Integer> list) {
        e = list;
    }

    public static List<Integer> b() {
        return e;
    }

    public static void e(List<Integer> list) {
        d = list;
    }

    public static void c(int i, HealthFloatingView healthFloatingView) {
        if (healthFloatingView == null) {
            return;
        }
        LogUtil.a("FloatingViewMgr", "mTabList: ", d);
        if (!d.contains(Integer.valueOf(i))) {
            LogUtil.a("FloatingViewMgr", "not in mSportsTabList, not add.");
            return;
        }
        LogUtil.a("FloatingViewMgr", "addView");
        f46415b.put(Integer.valueOf(i), new WeakReference<>(healthFloatingView));
        LogUtil.a("FloatingViewMgr", "mViewMap.size(): ", Integer.valueOf(f46415b.size()));
    }

    public static void b(int i) {
        if ((f46415b.get(Integer.valueOf(i)) != null ? f46415b.get(Integer.valueOf(i)).get() : null) == null) {
            return;
        }
        if (!d.contains(Integer.valueOf(i))) {
            LogUtil.a("FloatingViewMgr", "not in mSportsTabList, not add.");
        } else {
            LogUtil.a("FloatingViewMgr", "removeView");
            f46415b.put(Integer.valueOf(i), null);
        }
    }

    public static void c(int i) {
        LogUtil.a("FloatingViewMgr", "setView, mViewPositionId: ", Integer.valueOf(f46414a), " positionId: ", Integer.valueOf(i));
        if ((f46415b.get(Integer.valueOf(i)) != null ? f46415b.get(Integer.valueOf(i)).get() : null) == null) {
            LogUtil.a("FloatingViewMgr", "view is null");
            return;
        }
        int i2 = f46414a;
        if (i2 == i) {
            if (e.contains(Integer.valueOf(i))) {
                LogUtil.a("FloatingViewMgr", "is sportTab, set fulls.");
                e(i);
                return;
            } else {
                LogUtil.a("FloatingViewMgr", "not sportTab.");
                d(i);
                return;
            }
        }
        if (e.contains(Integer.valueOf(i2)) && e.contains(Integer.valueOf(i))) {
            e(i);
            return;
        }
        HealthFloatingView healthFloatingView = f46415b.get(Integer.valueOf(i)) != null ? f46415b.get(Integer.valueOf(i)).get() : null;
        if (healthFloatingView != null) {
            healthFloatingView.c();
        }
    }

    private static void e(int i) {
        LogUtil.a("FloatingViewMgr", "setSportTabFloatingBoxVisible, positionId: ", Integer.valueOf(i));
        if ((f46415b.get(3044) != null ? f46415b.get(3044).get() : null) != null) {
            d(3044);
        } else {
            d(i);
        }
    }

    private static void d(int i) {
        LogUtil.a("FloatingViewMgr", "setOtherViewInvisible, positionId: ", Integer.valueOf(i));
        for (Map.Entry<Integer, WeakReference<HealthFloatingView>> entry : f46415b.entrySet()) {
            HealthFloatingView healthFloatingView = entry.getValue() != null ? entry.getValue().get() : null;
            if (healthFloatingView != null && entry.getKey().intValue() != i) {
                healthFloatingView.c();
            } else {
                f(i);
            }
        }
    }

    public static void d(HealthFloatingView healthFloatingView) {
        LogUtil.a("FloatingViewMgr", "setOtherViewInvisible floatingView");
        for (Map.Entry<Integer, WeakReference<HealthFloatingView>> entry : f46415b.entrySet()) {
            HealthFloatingView healthFloatingView2 = entry.getValue() != null ? entry.getValue().get() : null;
            if (healthFloatingView2 != null && healthFloatingView2 != healthFloatingView && !healthFloatingView2.f()) {
                LogUtil.a("FloatingViewMgr", "hide other floating view, positionId: ", entry.getKey());
                healthFloatingView2.c();
            }
        }
    }

    private static void f(int i) {
        LogUtil.a("FloatingViewMgr", "setViewShow");
        HealthFloatingView healthFloatingView = f46415b.get(Integer.valueOf(i)) != null ? f46415b.get(Integer.valueOf(i)).get() : null;
        if (healthFloatingView != null) {
            healthFloatingView.h();
        }
    }
}
