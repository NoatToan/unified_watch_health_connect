package defpackage;

import android.os.Build;
import android.util.Size;
import androidx.annotation.RequiresApi;
import com.xiaomi.hm.health.bt.model.HMSedentaryConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class sf8 implements kgi {
    public static boolean e() {
        return "HUAWEI".equalsIgnoreCase(Build.BRAND) && "HWANE".equalsIgnoreCase(Build.DEVICE);
    }

    public static boolean f() {
        return "OnePlus".equalsIgnoreCase(Build.BRAND) && "OnePlus6".equalsIgnoreCase(Build.DEVICE);
    }

    public static boolean g() {
        return "OnePlus".equalsIgnoreCase(Build.BRAND) && "OnePlus6T".equalsIgnoreCase(Build.DEVICE);
    }

    public static boolean h() {
        return f() || g() || e();
    }

    public List<Size> a(String str, int i) {
        if (f()) {
            return c(str, i);
        }
        if (g()) {
            return d(str, i);
        }
        if (e()) {
            return b(str, i);
        }
        zpe.k("ExcludedSupportedSizesQuirk", "Cannot retrieve list of supported sizes to exclude on this device.");
        return Collections.emptyList();
    }

    public final List<Size> b(String str, int i) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("0") && (i == 34 || i == 35)) {
            arrayList.add(new Size(HMSedentaryConfig.INGORE_START_INDEX, HMSedentaryConfig.INGORE_START_INDEX));
            arrayList.add(new Size(400, 400));
        }
        return arrayList;
    }

    public final List<Size> c(String str, int i) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("0") && i == 256) {
            arrayList.add(new Size(4160, 3120));
            arrayList.add(new Size(4000, 3000));
        }
        return arrayList;
    }

    public final List<Size> d(String str, int i) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("0") && i == 256) {
            arrayList.add(new Size(4160, 3120));
            arrayList.add(new Size(4000, 3000));
        }
        return arrayList;
    }
}
