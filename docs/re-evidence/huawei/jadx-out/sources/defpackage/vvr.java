package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.R;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes43.dex */
public final class vvr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<Integer, Integer> f51634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Drawable f51635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f51636c;
    private String d;
    private int e;
    private int f;
    private boolean g;
    private int h;
    private boolean i;
    private boolean j;

    static {
        HashMap map = new HashMap();
        f51634a = map;
        map.put(10001, Integer.valueOf(R.string.IDS_hw_show_main_home_page_bloodsugar));
        map.put(10002, Integer.valueOf(R.string.IDS_hw_show_main_home_page_bloodpressure));
        map.put(101001, Integer.valueOf(R.string.IDS_hw_show_main_permission_user_profile_basic_info));
        map.put(101002, Integer.valueOf(R.string.IDS_hw_show_main_permission_user_profile_basic_feature));
        map.put(47201, Integer.valueOf(R.string.IDS_hw_show_main_permission_blood_oxygen));
        map.put(47202, Integer.valueOf(R.string.IDS_hw_show_main_permission_blood_oxygen));
        map.put(47203, Integer.valueOf(R.string.IDS_hw_show_main_permission_blood_oxygen));
        map.put(47204, Integer.valueOf(R.string.IDS_hw_show_main_permission_blood_oxygen));
        map.put(101201, Integer.valueOf(R.string.IDS_hw_show_main_permission_device_info));
        map.put(101003, Integer.valueOf(R.string.IDS_hw_show_main_permission_realtime_sport_data));
        map.put(101202, Integer.valueOf(R.string.IDS_hw_show_main_permission_device_data));
        map.put(101203, Integer.valueOf(R.string.IDS_hw_show_main_permission_device_basic_control));
        map.put(101204, Integer.valueOf(R.string.IDS_hw_show_main_permission_device_advanced_control));
        map.put(40002, Integer.valueOf(R.string.IDS_hw_show_main_permission_steps));
        map.put(40004, Integer.valueOf(R.string.IDS_hw_show_main_permission_distance));
        map.put(40003, Integer.valueOf(R.string.IDS_hw_show_main_permission_calorie));
        map.put(30005, Integer.valueOf(R.string.IDS_hw_show_main_permission_track_record));
        map.put(30006, Integer.valueOf(R.string.IDS_hw_show_main_permission_track_record));
        map.put(30007, Integer.valueOf(R.string.IDS_hw_show_main_permission_track_record));
        map.put(10008, Integer.valueOf(R.string.IDS_hw_show_main_permission_heart_statistic));
        map.put(50001, Integer.valueOf(R.string.IDS_hw_show_main_permission_heart_realtime_measure));
        map.put(10006, Integer.valueOf(R.string.IDS_hw_show_main_permission_weight));
        map.put(10007, Integer.valueOf(R.string.IDS_hw_show_main_permission_sleep));
        map.put(44000, Integer.valueOf(R.string.IDS_hw_show_main_permission_sleep));
        map.put(47101, Integer.valueOf(R.string.IDS_hw_show_main_permission_intensity));
        map.put(31001, Integer.valueOf(R.string.IDS_permission_heart_health));
        map.put(101000, Integer.valueOf(R.string.IDS_hw_show_main_permission_app_sync));
        map.put(10010, Integer.valueOf(R.string.IDS_hw_show_main_permission_menstruation));
        map.put(2104, Integer.valueOf(R.string.IDS_settings_health_temperature));
        map.put(2034, Integer.valueOf(R.string.IDS_settings_one_level_menu_settings_item_text_id14));
    }

    public vvr(int i, Drawable drawable, String str, boolean z, boolean z2) {
        this.h = i;
        this.f51635b = drawable;
        this.d = str;
        this.i = z;
        this.j = z2;
    }

    public vvr(int i, boolean z, boolean z2, boolean z3) {
        this.h = i;
        this.g = z;
        this.j = z3;
    }

    public vvr(int i, boolean z, boolean z2) {
        this.h = i;
        this.g = z;
        this.j = z2;
        a(BaseApplication.getContext().getString(R.string.IDS_hw_show_main_health_page_healthdata_bloodpresure_select));
    }

    public vvr(int i, boolean z, int i2, int i3, boolean z2) {
        this.h = i;
        this.g = z;
        this.f = i2;
        this.j = z2;
        b(i3);
    }

    public int e() {
        return this.h;
    }

    public boolean j() {
        return this.g;
    }

    public int g() {
        return this.f;
    }

    public int d() {
        return this.e;
    }

    public void b(int i) {
        String string;
        this.e = i;
        Context context = BaseApplication.getContext();
        Integer num = f51634a.get(Integer.valueOf(i));
        if (num != null) {
            try {
                string = context.getString(num.intValue());
            } catch (Resources.NotFoundException unused) {
                LogUtil.e("ThirdPartAuthBean", "setHealthTypeId default");
                string = "";
            }
        } else {
            string = "";
        }
        a(string);
    }

    public String c() {
        return this.f51636c;
    }

    public void a(String str) {
        this.f51636c = str;
    }

    public boolean i() {
        return this.j;
    }

    public void a(boolean z) {
        this.j = z;
    }

    public String a() {
        return this.d;
    }

    public boolean h() {
        return this.i;
    }

    public Drawable b() {
        return this.f51635b;
    }

    public void d(Drawable drawable) {
        this.f51635b = drawable;
    }

    public String toString() {
        return "ThirdPartAuthBean{itemViewType=" + this.h + ", itemTitleShow=" + this.g + ", operationType=" + this.f + ", healthTypeId=" + this.e + ", healthTypeName='" + this.f51636c + "', isOpen=" + this.j + '}';
    }
}
