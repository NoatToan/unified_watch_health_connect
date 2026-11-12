package defpackage;

import com.huawei.haf.application.BaseApplication;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class esh {
    private static List<String> d = Arrays.asList("IndoorEquipDisplayActivity", "IndoorEquipLandDisplayActivity", "SportBaseActivity", "CoachActivity");

    public static String e() {
        return BaseApplication.j() == null ? "" : BaseApplication.j().getClass().getSimpleName();
    }

    public static boolean c() {
        return d.contains(e());
    }
}
