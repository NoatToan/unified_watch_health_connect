package defpackage;

import android.content.Context;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.device.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class rcx {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static rcx f47163c;
    private long e = 0;
    private HashMap<Integer, Integer> d = new HashMap(16) { // from class: rcx.2
        private static final long serialVersionUID = -4282859716577390994L;

        {
            put(1, Integer.valueOf(R.string.IDS_settings_one_level_menu_settings_item_text_id1));
            put(2, Integer.valueOf(R.string.IDS_settings_one_level_menu_settings_item_text_id2));
            put(3, Integer.valueOf(R.string.IDS_settings_one_level_menu_settings_item_text_id3));
            put(4, Integer.valueOf(R.string.IDS_settings_one_level_menu_settings_item_text_id4));
            put(5, Integer.valueOf(R.string.IDS_settings_one_level_menu_settings_item_text_id5));
            put(6, Integer.valueOf(R.string.IDS_settings_one_level_menu_settings_item_text_id6));
            put(7, Integer.valueOf(R.string.IDS_settings_one_level_menu_settings_item_text_id7));
            put(8, Integer.valueOf(R.string.IDS_settings_one_level_menu_settings_item_text_id8));
            put(9, Integer.valueOf(R.string.IDS_settings_one_level_menu_settings_item_text_id9));
            put(10, Integer.valueOf(R.string.IDS_settings_one_level_menu_settings_item_text_id10));
            put(11, Integer.valueOf(R.string.IDS_settings_one_level_menu_settings_item_text_id11));
            put(12, Integer.valueOf(R.string.IDS_settings_one_level_menu_settings_item_text_id12));
            put(13, Integer.valueOf(R.string.IDS_settings_one_level_menu_settings_item_text_id13));
            put(14, Integer.valueOf(R.string.IDS_settings_one_level_menu_settings_item_text_id14));
            put(15, Integer.valueOf(R.string.IDS_settings_one_level_menu_settings_item_text_id15));
            put(16, Integer.valueOf(R.string.IDS_settings_one_level_menu_settings_item_text_id16));
            put(17, Integer.valueOf(R.string.IDS_settings_one_level_menu_settings_item_text_id17));
            put(18, Integer.valueOf(R.string.IDS_settings_one_level_menu_settings_item_text_id18));
            put(19, Integer.valueOf(R.string.IDS_settings_one_level_menu_settings_item_text_id19));
            put(20, Integer.valueOf(R.string.IDS_settings_one_level_menu_settings_item_text_id20));
            put(21, Integer.valueOf(R.string.IDS_hwh_start_track_sport_type_outdoor_run));
            put(22, Integer.valueOf(R.string.IDS_hwh_start_track_sport_type_indoor_run));
            put(23, Integer.valueOf(R.string.IDS_hwh_start_track_sport_type_walk));
            put(24, Integer.valueOf(R.string.IDS_settings_one_level_menu_settings_item_text_id24));
            put(25, Integer.valueOf(R.string.IDS_main_discovery_tab_fitness_workout));
            put(26, Integer.valueOf(R.string.IDS_settings_one_level_menu_settings_item_text_id26));
            put(27, Integer.valueOf(R.string.IDS_settings_one_level_menu_settings_item_text_id27));
            put(28, Integer.valueOf(R.string.IDS_settings_steps));
            put(29, Integer.valueOf(R.string.IDS_sport_distance));
            put(30, Integer.valueOf(R.string.IDS_start_track_target_type_calorie));
            put(31, Integer.valueOf(R.string.IDS_hwh_home_step_strength));
            put(32, Integer.valueOf(R.string.IDS_aw_function_stand_count));
            put(33, Integer.valueOf(R.string.IDS_hwh_ali_sport_title));
            put(34, Integer.valueOf(R.string.IDS_hw_health_blood_oxygen));
            put(35, Integer.valueOf(R.string.IDS_settings_one_level_menu_settings_item_text_id21));
            put(36, Integer.valueOf(R.string.IDS_settings_one_level_menu_settings_item_text_id22));
        }
    };

    public int d(byte b2) {
        if ((b2 & 128) <= 0) {
            return b2;
        }
        int i = b2 - 128;
        return i < 0 ? b2 + 128 : i;
    }

    public static rcx c() {
        rcx rcxVar;
        synchronized (rcx.class) {
            if (f47163c == null) {
                f47163c = new rcx();
            }
            rcxVar = f47163c;
        }
        return rcxVar;
    }

    public String a(Context context, int i) {
        if (this.d.containsKey(Integer.valueOf(i))) {
            return context.getResources().getString(this.d.get(Integer.valueOf(i)).intValue());
        }
        return context.getResources().getString(R.string.IDS_settings_one_level_menu_settings_item_text_id1);
    }

    public boolean c(int i) {
        return this.d.containsKey(Integer.valueOf(i));
    }

    public ArrayList<Integer> b(ArrayList<Integer> arrayList, ArrayList<Integer> arrayList2) {
        HashMap map = new HashMap(arrayList.size() + arrayList2.size());
        ArrayList<Integer> arrayList3 = new ArrayList<>(16);
        if (arrayList2.size() > arrayList.size()) {
            arrayList2 = arrayList;
            arrayList = arrayList2;
        }
        Iterator<Integer> it = arrayList.iterator();
        while (it.hasNext()) {
            map.put(it.next(), 1);
        }
        for (Integer num : arrayList2) {
            Integer num2 = (Integer) map.get(num);
            if (num2 != null) {
                map.put(num, Integer.valueOf(num2.intValue() + 1));
            } else {
                map.put(num, 1);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            if (((Integer) entry.getValue()).intValue() == 1) {
                arrayList3.add((Integer) entry.getKey());
            }
        }
        return arrayList3;
    }

    public boolean a() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.e < 1000) {
            LogUtil.a("OneLevelMenuInteractor", "onClick", ">_< >_< click too much");
            this.e = jCurrentTimeMillis;
            return true;
        }
        this.e = jCurrentTimeMillis;
        return false;
    }
}
