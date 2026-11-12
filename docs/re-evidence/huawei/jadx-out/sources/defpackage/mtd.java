package defpackage;

import health.compact.a.CommonUtil;
import java.util.Arrays;

/* JADX INFO: loaded from: classes11.dex */
public final class mtd {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f42392b = {"_id", "version", "starred", "times_contacted", "account_type", "account_name", "sort_key"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f42393c;
    private static final String[] e;

    static {
        if (CommonUtil.bb()) {
            e = new String[]{"_id", "version", "starred", "times_contacted", "account_type", "account_name", "starred_order", "is_private"};
        } else {
            e = new String[]{"_id", "version", "starred", "times_contacted", "account_type", "account_name"};
        }
        f42393c = new String[]{"raw_contact_id", "_id", "mimetype", "data1", "data2", "data3", "data4", "data5", "data6", "data7", "data8", "data9", "data10", "data11", "data12", "data13", "data14", "data15", "data_sync1", "data_sync2"};
    }

    public static String[] c() {
        String[] strArr = e;
        return (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    public static String[] e() {
        String[] strArr = f42392b;
        return (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    public static String[] b() {
        String[] strArr = f42393c;
        return (String[]) Arrays.copyOf(strArr, strArr.length);
    }
}
