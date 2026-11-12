package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class mtj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List<String> f42405a;

    static {
        ArrayList arrayList = new ArrayList();
        f42405a = arrayList;
        arrayList.add("com.tencent.mm.account");
        arrayList.add("com.tencent.mobileqq.account");
        arrayList.add("com.whatsapp");
        arrayList.add("com.gbox.com.whatsapp");
        arrayList.add("com.tencent.mobileqq.account");
    }

    public static String d() {
        return mts.d();
    }

    public static String c() {
        return mtz.a(f42405a, ",", "'");
    }
}
