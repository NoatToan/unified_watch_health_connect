package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes11.dex */
public class jf4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f22727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f22728b;
    public static final String c;

    static {
        boolean zExists = new File("/data/system/xiaomi_account_preview").exists();
        f22727a = zExists;
        String str = zExists ? "http://act.preview.account.xiaomi.com/pass/activator" : "https://act.account.xiaomi.com/pass/activator";
        f22728b = str;
        c = str + "/getCloudControl";
    }
}
