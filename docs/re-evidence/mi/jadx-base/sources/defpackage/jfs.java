package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.miui.tsmclient.util.StringUtils;
import com.xiaomi.push.Cif;
import com.xiaomi.push.i;
import com.xiaomi.push.ie;
import com.xiaomi.push.il;
import com.xiaomi.push.ja;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes11.dex */
public class jfs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static AtomicLong f22750a = new AtomicLong(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static SimpleDateFormat f22751b;
    public static String c;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(StringUtils.EXPECT_DATE_FORMAT);
        f22751b = simpleDateFormat;
        c = simpleDateFormat.format(Long.valueOf(System.currentTimeMillis()));
    }

    public static ja a(String str, String str2, ie ieVar) {
        return new ja("-1", false).d(str).b(str2).a(mgt.h(i.e(ieVar))).c(il.UploadTinyData.f125a);
    }

    public static synchronized String b() {
        String str;
        try {
            str = f22751b.format(Long.valueOf(System.currentTimeMillis()));
            if (!TextUtils.equals(c, str)) {
                f22750a.set(0L);
                c = str;
            }
        } catch (Throwable th) {
            throw th;
        }
        return str + "-" + f22750a.incrementAndGet();
    }

    public static ArrayList<ja> c(List<Cif> list, String str, String str2, int i) {
        int length;
        if (list == null) {
            x9s.D("requests can not be null in TinyDataHelper.transToThriftObj().");
            return null;
        }
        if (list.size() == 0) {
            x9s.D("requests.length is 0 in TinyDataHelper.transToThriftObj().");
            return null;
        }
        ArrayList<ja> arrayList = new ArrayList<>();
        ie ieVar = new ie();
        int i2 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            Cif cif = list.get(i3);
            if (cif != null) {
                if (cif.m682a() == null || !cif.m682a().containsKey("item_size")) {
                    length = 0;
                } else {
                    String str3 = cif.m682a().get("item_size");
                    if (TextUtils.isEmpty(str3)) {
                        length = 0;
                    } else {
                        try {
                            length = Integer.parseInt(str3);
                        } catch (Exception unused) {
                            length = 0;
                        }
                    }
                    if (cif.m682a().size() == 1) {
                        cif.a((Map<String, String>) null);
                    } else {
                        cif.m682a().remove("item_size");
                    }
                }
                if (length <= 0) {
                    length = i.e(cif).length;
                }
                if (length > i) {
                    x9s.D("TinyData is too big, ignore upload request item:" + cif.d());
                } else {
                    if (i2 + length > i) {
                        arrayList.add(a(str, str2, ieVar));
                        ieVar = new ie();
                        i2 = 0;
                    }
                    ieVar.a(cif);
                    i2 += length;
                }
            }
        }
        if (ieVar.a() != 0) {
            arrayList.add(a(str, str2, ieVar));
        }
        return arrayList;
    }

    public static void d(Context context, String str, String str2, long j, String str3) {
        Cif cif = new Cif();
        cif.d(str);
        cif.c(str2);
        cif.a(j);
        cif.b(str3);
        cif.a("push_sdk_channel");
        cif.g(context.getPackageName());
        cif.e(context.getPackageName());
        cif.a(true);
        cif.b(System.currentTimeMillis());
        cif.f(b());
        nfs.a(context, cif);
    }

    public static boolean e(Cif cif, boolean z) {
        if (cif == null) {
            x9s.o("item is null, verfiy ClientUploadDataItem failed.");
            return true;
        }
        if (!z && TextUtils.isEmpty(cif.f97a)) {
            x9s.o("item.channel is null or empty, verfiy ClientUploadDataItem failed.");
            return true;
        }
        if (TextUtils.isEmpty(cif.f104d)) {
            x9s.o("item.category is null or empty, verfiy ClientUploadDataItem failed.");
            return true;
        }
        if (TextUtils.isEmpty(cif.f103c)) {
            x9s.o("item.name is null or empty, verfiy ClientUploadDataItem failed.");
            return true;
        }
        if (!qcs.i(cif.f104d)) {
            x9s.o("item.category can only contain ascii char, verfiy ClientUploadDataItem failed.");
            return true;
        }
        if (!qcs.i(cif.f103c)) {
            x9s.o("item.name can only contain ascii char, verfiy ClientUploadDataItem failed.");
            return true;
        }
        String str = cif.f102b;
        if (str == null || str.length() <= 30720) {
            return false;
        }
        x9s.o("item.data is too large(" + cif.f102b.length() + "), max size for data is 30720 , verfiy ClientUploadDataItem failed.");
        return true;
    }

    public static boolean f(String str) {
        return !odt.i() || "com.miui.hybrid".equals(str);
    }
}
