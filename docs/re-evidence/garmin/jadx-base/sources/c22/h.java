package c22;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.common.net.HttpHeaders;
import i3.e5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes10.dex */
public final class h {
    private h() {
    }

    public static int a(String str, String str2) {
        ArrayList arrayList = new ArrayList(Arrays.asList(str.split("\\.")));
        ArrayList arrayList2 = new ArrayList(Arrays.asList(str2.split("\\.")));
        if (arrayList.size() < arrayList2.size()) {
            arrayList.addAll(new ArrayList(Collections.nCopies(arrayList2.size() - arrayList.size(), "0")));
        }
        if (arrayList.size() > arrayList2.size()) {
            arrayList2.addAll(new ArrayList(Collections.nCopies(arrayList.size() - arrayList2.size(), "0")));
        }
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            if (Integer.parseInt((String) arrayList.get(i14)) < Integer.parseInt((String) arrayList2.get(i14))) {
                return 1;
            }
            if (Integer.parseInt((String) arrayList.get(i14)) > Integer.parseInt((String) arrayList2.get(i14))) {
                return -1;
            }
        }
        return 0;
    }

    public static ArrayList b() {
        ArrayList arrayList = new ArrayList(22);
        jc2.e.f98177a.getClass();
        arrayList.add(new String[]{"OS", (String) jc2.e.f98178b.getValue()});
        arrayList.add(new String[]{"Ver. Release", jc2.e.a()});
        arrayList.add(new String[]{"Ver. SDK", String.valueOf(Build.VERSION.SDK_INT)});
        arrayList.add(new String[]{"Ver. Codename", Build.VERSION.CODENAME});
        arrayList.add(new String[]{"Locale", hb2.h.b()});
        arrayList.add(new String[]{"Manufacturer", String.valueOf(Build.MANUFACTURER)});
        arrayList.add(new String[]{"Brand", String.valueOf(Build.BRAND)});
        arrayList.add(new String[]{"Model", String.valueOf(Build.MODEL)});
        arrayList.add(new String[]{"Device", String.valueOf(Build.DEVICE)});
        arrayList.add(new String[]{"Display", String.valueOf(Build.DISPLAY)});
        arrayList.add(new String[]{"Hardware", String.valueOf(Build.HARDWARE)});
        arrayList.add(new String[]{HttpHeaders.HOST, String.valueOf(Build.HOST)});
        arrayList.add(new String[]{"ID", String.valueOf(Build.ID)});
        arrayList.add(new String[]{"Product", String.valueOf(Build.PRODUCT)});
        arrayList.add(new String[]{"Radio", Build.getRadioVersion()});
        arrayList.add(new String[]{"Serial", String.valueOf(Build.SERIAL)});
        arrayList.add(new String[]{"Tags", String.valueOf(Build.TAGS)});
        arrayList.add(new String[]{"Type", String.valueOf(Build.TYPE)});
        arrayList.add(new String[]{"User", String.valueOf(Build.USER)});
        arrayList.add(new String[]{"Board", String.valueOf(Build.BOARD)});
        arrayList.add(new String[]{"Bootloader", String.valueOf(Build.BOOTLOADER)});
        String strG = "";
        for (String str : Build.SUPPORTED_ABIS) {
            strG = e5.g(strG, str, "<br/>");
        }
        arrayList.add(new String[]{"Supported<br/>ABIs", strG});
        return arrayList;
    }

    public static boolean c(Context context) {
        return context != null && GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0;
    }
}
