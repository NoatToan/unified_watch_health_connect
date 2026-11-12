package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.ui.commonui.recycleview.HealthLinearLayoutManager;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class dkf {
    public static HashMap<String, Object> d(int i, String str, int i2, FitWorkout fitWorkout) {
        HashMap map = new HashMap(i);
        map.put("entrance", str);
        map.put("position", 0);
        map.put("type", Integer.valueOf(i2));
        map.put(HwExerciseConstants.METHOD_PARAM_WORKOUT_ID, TextUtils.isEmpty(fitWorkout.acquireId()) ? "" : fitWorkout.acquireId());
        HashMap<String, Object> map2 = new HashMap<>();
        map2.put("fitWorkout", fitWorkout);
        map2.put("biMap", map);
        return map2;
    }

    public static void c(HealthSubHeader healthSubHeader) {
        healthSubHeader.setMoreTextVisibility(4);
        healthSubHeader.setMoreLayoutVisibility(4);
    }

    public static void a(HealthRecycleView healthRecycleView, Context context) {
        healthRecycleView.setHasFixedSize(true);
        healthRecycleView.setNestedScrollingEnabled(false);
        healthRecycleView.b(false);
        healthRecycleView.e(false);
        fts.d(context, healthRecycleView, new HealthLinearLayoutManager(context), false, 0);
    }

    public static void e(HealthSubHeader healthSubHeader, HashMap<String, Object> map) {
        healthSubHeader.setHeadTitleText(qqw.d((Map) map, "TITLE", ""));
        ezi.c(map, healthSubHeader);
    }

    public static void d(HealthRecycleView healthRecycleView) {
        healthRecycleView.setHasFixedSize(true);
        healthRecycleView.setNestedScrollingEnabled(false);
        healthRecycleView.b(false);
        healthRecycleView.e(false);
    }

    public static void e(Object obj, HealthSubHeader healthSubHeader, String str, int i, String str2) {
        if (healthSubHeader != null) {
            if (fts.j(obj)) {
                LogUtil.a(str, "subtitle is set");
                healthSubHeader.setMoreTextVisibility(0);
                healthSubHeader.setMoreText((String) obj);
            } else {
                LogUtil.a(str, "subtitle is " + str2);
                healthSubHeader.setMoreTextVisibility(i);
            }
        }
    }

    public static void b(HealthViewPager healthViewPager, int i, String str, int i2, int i3, int i4) {
        try {
            healthViewPager.setPageMargin(i);
            healthViewPager.setPadding(i2, i4, i3, i4);
        } catch (IllegalStateException unused) {
            LogUtil.e(str, "AdViewPager setPageMargin llegalStateException.");
        }
    }

    public static void d(int i, HealthViewPager healthViewPager, int i2) {
        if (i > i2) {
            healthViewPager.setIsScroll(true);
        } else {
            healthViewPager.setIsScroll(false);
        }
    }

    public static int a(Map<String, List<Object>> map, String str) {
        int size = 0;
        if (map == null) {
            LogUtil.j(str, "getMaxListItem sectionDataList is null.");
            return 0;
        }
        Iterator<Map.Entry<String, List<Object>>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            List<Object> value = it.next().getValue();
            if (value.size() > size) {
                size = value.size();
            }
        }
        return size;
    }

    public static void b(Rect rect, View view, RecyclerView recyclerView, int i, Context context, int i2, int i3, int i4, boolean z) {
        int iD;
        int iD2;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition % i != 0) {
            iD2 = qrs.d(context, i2 / i4);
            iD = 0;
        } else {
            iD = qrs.d(context, i2 / i4);
            iD2 = 0;
        }
        if (z) {
            rect.set(iD2, childAdapterPosition == 0 ? 0 : qrs.d(context, i3), iD, 0);
        } else {
            float f = i3 / i4;
            rect.set(iD2, qrs.d(context, f), iD, qrs.d(context, f));
        }
    }
}
