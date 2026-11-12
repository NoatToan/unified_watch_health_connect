package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.multisimsdk.multidevicemanager.R;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes12.dex */
public class ocm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static HashMap<String, String> f44128a = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static ArrayList<String> f44129c = new ArrayList<>();

    static class b {
        private static final ocm d = new ocm();
    }

    public static ocm c() {
        return b.d;
    }

    private ocm() {
    }

    public void d(Context context) {
        if (context == null) {
            return;
        }
        String[] stringArray = context.getResources().getStringArray(R.array.MMS_AUTH_SUPPORT_OPERATOR);
        String[] stringArray2 = context.getResources().getStringArray(R.array.MMS_AUTH_SUPPORT_NUMBER);
        if (stringArray2.length != stringArray.length) {
            return;
        }
        int length = stringArray2.length;
        for (int i = 0; i < length; i++) {
            String str = stringArray2[i];
            if (!f44129c.contains(str)) {
                f44129c.add(str);
            }
            if (!f44128a.containsKey(str)) {
                f44128a.put(str, stringArray[i]);
            }
        }
    }

    public String b(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String strC = c(context, str);
        return !TextUtils.isEmpty(str) ? f44128a.get(strC) : strC;
    }

    private String c(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (f44129c.isEmpty()) {
            d(context);
        }
        int size = f44129c.size();
        for (int i = 0; i < size; i++) {
            String str2 = f44129c.get(i);
            if (str.matches(str2)) {
                return str2;
            }
        }
        return null;
    }
}
