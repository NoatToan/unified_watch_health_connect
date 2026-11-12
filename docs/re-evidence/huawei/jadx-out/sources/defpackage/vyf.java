package defpackage;

import com.huawei.healthcloud.plugintrack.R;
import java.util.HashMap;

/* JADX INFO: loaded from: classes19.dex */
public class vyf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final HashMap<Integer, Integer> f51692a;
    private static final HashMap<Integer, Integer> d;

    static {
        HashMap<Integer, Integer> map = new HashMap<>();
        f51692a = map;
        HashMap<Integer, Integer> map2 = new HashMap<>();
        d = map2;
        map.put(1000, 20210605);
        map.put(1001, 20210606);
        map.put(1002, 20210606);
        map.put(1003, 20210606);
        map.put(1004, 20210606);
        map.put(1005, 20210606);
        map.put(1006, 20210606);
        map.put(1007, 20210606);
        map2.put(0, Integer.valueOf(R.string.IDS_track_remind_dialog_tip1));
        map2.put(1, Integer.valueOf(R.string.IDS_track_remind_dialog_tip2));
        map2.put(2, Integer.valueOf(R.string.IDS_track_remind_dialog_tip3));
        map2.put(3, Integer.valueOf(R.string.IDS_track_remind_dialog_tip4));
    }

    public static HashMap<Integer, Integer> e() {
        return f51692a;
    }

    public static HashMap<Integer, Integer> b() {
        return d;
    }
}
