package defpackage;

import com.huawei.haf.application.BaseApplication;
import com.huawei.health.servicesui.R;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.view.threeCircle.ThreeCircleView;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes7.dex */
public class ftz {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f34578b = 2;
    public static int d = 1;
    public static int e;

    public static int b(boolean z) {
        if (z) {
            return d;
        }
        return f34578b;
    }

    public static void d(int i, ThreeCircleView threeCircleView) {
        LinkedHashMap<String, qth> linkedHashMap = new LinkedHashMap<>();
        if (i == d) {
            b(linkedHashMap);
            threeCircleView.setIsShowTriangle(true);
        } else if (i == f34578b) {
            a(linkedHashMap);
        } else if (i == e) {
            c(linkedHashMap);
        }
        threeCircleView.setIsIconVisible(false);
        threeCircleView.e(linkedHashMap);
    }

    public static boolean b() {
        return ((Integer) BaseActivity.getSafeRegionWidth().first).intValue() > 0 || ((Integer) BaseActivity.getSafeRegionWidth().second).intValue() > 0;
    }

    private static void b(LinkedHashMap<String, qth> linkedHashMap) {
        linkedHashMap.put("thirdCircle", new qth.b().e(new int[]{BaseApplication.b().getColor(R.color.new_activity_circle_process_start_color), BaseApplication.b().getColor(com.huawei.ui.commonui.R.color.new_activity_circle_process_second_color), BaseApplication.b().getColor(com.huawei.ui.commonui.R.color.new_activity_circle_process_third_color), BaseApplication.b().getColor(R.color.new_activity_circle_process_end_color)}).d(new int[]{BaseApplication.b().getColor(R.color.third_bg_circle_bottom_start_color), BaseApplication.b().getColor(R.color.third_bg_circle_bottom_end_color)}).c());
        linkedHashMap.put("firstCircle", new qth.b().e(new int[]{BaseApplication.b().getColor(R.color.new_cal_circle_process_start_color), BaseApplication.b().getColor(com.huawei.ui.commonui.R.color.new_cal_circle_process_second_color), BaseApplication.b().getColor(com.huawei.ui.commonui.R.color.new_cal_circle_process_third_color), BaseApplication.b().getColor(R.color.new_cal_circle_process_end_color)}).d(new int[]{BaseApplication.b().getColor(R.color.first_bg_circle_bottom_start_color), BaseApplication.b().getColor(R.color.first_bg_circle_bottom_end_color)}).c());
        linkedHashMap.put("secondCircle", new qth.b().e(new int[]{BaseApplication.b().getColor(R.color.new_time_circle_process_start_color), BaseApplication.b().getColor(com.huawei.ui.commonui.R.color.new_time_circle_process_second_color), BaseApplication.b().getColor(com.huawei.ui.commonui.R.color.new_time_circle_process_third_color), BaseApplication.b().getColor(R.color.new_time_circle_process_end_color)}).d(new int[]{BaseApplication.b().getColor(R.color.second_bg_circle_bottom_start_color), BaseApplication.b().getColor(R.color.second_bg_circle_bottom_end_color)}).c());
    }

    private static void a(LinkedHashMap<String, qth> linkedHashMap) {
        linkedHashMap.put("firstCircle", new qth.b().e(new int[]{BaseApplication.b().getColor(R.color.step_circle_process_start_color), BaseApplication.b().getColor(R.color.step_circle_process_end_color)}).d(new int[]{BaseApplication.b().getColor(R.color.step_circle_bottom_start_color), BaseApplication.b().getColor(R.color.step_circle_bottom_end_color)}).c());
        linkedHashMap.put("secondCircle", new qth.b().e(new int[]{BaseApplication.b().getColor(R.color.new_time_circle_process_start_color), BaseApplication.b().getColor(R.color.new_time_circle_process_end_color)}).d(new int[]{BaseApplication.b().getColor(R.color.second_bg_circle_bottom_start_color), BaseApplication.b().getColor(R.color.second_bg_circle_bottom_end_color)}).c());
        linkedHashMap.put("thirdCircle", new qth.b().e(new int[]{BaseApplication.b().getColor(R.color.activity_circle_process_start_color), BaseApplication.b().getColor(R.color.activity_circle_process_end_color)}).d(new int[]{BaseApplication.b().getColor(R.color.activity_circle_bottom_start_color), BaseApplication.b().getColor(R.color.activity_circle_bottom_end_color)}).c());
    }

    private static void c(LinkedHashMap<String, qth> linkedHashMap) {
        qth qthVarC = new qth.b().e(new int[]{BaseApplication.b().getColor(R.color.transparent), BaseApplication.b().getColor(R.color.transparent)}).d(new int[]{BaseApplication.b().getColor(R.color.three_circle_empty_color), BaseApplication.b().getColor(R.color.three_circle_empty_color)}).c();
        linkedHashMap.put("firstCircle", qthVarC);
        linkedHashMap.put("secondCircle", qthVarC);
        linkedHashMap.put("thirdCircle", qthVarC);
    }
}
