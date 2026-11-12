package com.amap.api.col.p0003sl;

import android.content.Context;
import android.util.Log;
import com.huawei.hwsmartinteractmgr.data.SmartMsgConstant;
import com.huawei.openalliance.ad.constant.Constants;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class iu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile b f2816a = b.Unknow;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile d f2817b = d.Unknow;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile String f2818c = "";
    private static volatile String d = "";
    private static volatile long e = -1;
    private static volatile a f = a.Unknow;
    private static volatile long g = -1;
    private static volatile String h = "";
    private static volatile String i = "";
    private static volatile long j = 0;
    private static volatile long k = 0;
    private static volatile boolean l = false;
    private static volatile boolean m = true;

    public enum d {
        Unknow(-1),
        NotShow(0),
        DidShow(1);

        private int d;

        d(int i) {
            this.d = i;
        }

        public final int a() {
            return this.d;
        }

        public static d a(int i) {
            d dVar = NotShow;
            if (i == dVar.a()) {
                return dVar;
            }
            d dVar2 = DidShow;
            return i == dVar2.a() ? dVar2 : Unknow;
        }
    }

    public enum b {
        Unknow(-1),
        NotContain(0),
        DidContain(1);

        private int d;

        b(int i) {
            this.d = i;
        }

        public final int a() {
            return this.d;
        }

        public static b a(int i) {
            b bVar = NotContain;
            if (i == bVar.a()) {
                return bVar;
            }
            b bVar2 = DidContain;
            return i == bVar2.a() ? bVar2 : Unknow;
        }
    }

    public enum a {
        Unknow(-1),
        NotAgree(0),
        DidAgree(1);

        private int d;

        a(int i) {
            this.d = i;
        }

        public final int a() {
            return this.d;
        }

        public static a a(int i) {
            a aVar = NotAgree;
            if (i == aVar.a()) {
                return aVar;
            }
            a aVar2 = DidAgree;
            return i == aVar2.a() ? aVar2 : Unknow;
        }
    }

    public enum c {
        SuccessCode(0),
        ShowUnknowCode(555570),
        ShowNoShowCode(555571),
        InfoUnknowCode(555572),
        InfoNotContainCode(555573),
        AgreeUnknowCode(555574),
        AgreeNotAgreeCode(555575),
        InvaildUserKeyCode(10001),
        IllegalArgument(20001);

        private final int j;

        c(int i) {
            this.j = i;
        }

        public final int a() {
            return this.j;
        }
    }

    public static void a(Context context, boolean z, boolean z2, ix ixVar) {
        d dVar;
        b bVar;
        if (z2) {
            dVar = d.DidShow;
        } else {
            dVar = d.NotShow;
        }
        if (z) {
            bVar = b.DidContain;
        } else {
            bVar = b.NotContain;
        }
        a(context, dVar, bVar, ixVar);
    }

    private static void a(Context context, d dVar, b bVar, ix ixVar) {
        synchronized (iu.class) {
            if (context == null || ixVar == null) {
                return;
            }
            if (!l) {
                e(context);
                l = true;
            }
            Boolean bool = Boolean.FALSE;
            if (dVar != f2817b) {
                bool = Boolean.TRUE;
                f2817b = dVar;
            }
            if (bVar != f2816a) {
                bool = Boolean.TRUE;
                f2816a = bVar;
            }
            if (bool.booleanValue()) {
                f2818c = ixVar.a();
                d = ixVar.b();
                long jCurrentTimeMillis = System.currentTimeMillis();
                e = jCurrentTimeMillis;
                j = jCurrentTimeMillis;
                d(context);
            }
        }
    }

    public static void a(Context context, boolean z, ix ixVar) {
        a aVar;
        if (z) {
            aVar = a.DidAgree;
        } else {
            aVar = a.NotAgree;
        }
        a(context, aVar, ixVar);
    }

    private static void a(Context context, a aVar, ix ixVar) {
        synchronized (iu.class) {
            if (context == null || ixVar == null) {
                return;
            }
            if (!l) {
                e(context);
                l = true;
            }
            Boolean bool = Boolean.FALSE;
            if (aVar != f) {
                Boolean bool2 = Boolean.TRUE;
                f = aVar;
                h = ixVar.a();
                i = ixVar.b();
                long jCurrentTimeMillis = System.currentTimeMillis();
                g = jCurrentTimeMillis;
                j = jCurrentTimeMillis;
                d(context);
            }
        }
    }

    public static iv a(final Context context, ix ixVar) {
        boolean z;
        iv ivVar;
        iv ivVar2;
        synchronized (iu.class) {
            try {
                if (context == null || ixVar == null) {
                    return new iv(c.IllegalArgument, ixVar);
                }
                if (!l) {
                    e(context);
                    l = true;
                }
                iv ivVar3 = null;
                if (f2817b != d.DidShow) {
                    if (f2817b == d.Unknow) {
                        ivVar2 = new iv(c.ShowUnknowCode, ixVar);
                    } else {
                        if (f2817b == d.NotShow) {
                            ivVar2 = new iv(c.ShowNoShowCode, ixVar);
                        }
                        z = false;
                    }
                    ivVar3 = ivVar2;
                    z = false;
                } else {
                    z = true;
                }
                if (z && f2816a != b.DidContain) {
                    if (f2816a == b.Unknow) {
                        ivVar = new iv(c.InfoUnknowCode, ixVar);
                    } else {
                        if (f2816a == b.NotContain) {
                            ivVar = new iv(c.InfoNotContainCode, ixVar);
                        }
                        z = false;
                    }
                    ivVar3 = ivVar;
                    z = false;
                }
                if (z && f != a.DidAgree) {
                    if (f == a.Unknow) {
                        ivVar3 = new iv(c.AgreeUnknowCode, ixVar);
                    } else if (f == a.NotAgree) {
                        ivVar3 = new iv(c.AgreeNotAgreeCode, ixVar);
                    }
                    z = false;
                }
                if (k != j) {
                    final long j2 = j;
                    k = j;
                    try {
                        final JSONObject jSONObject = new JSONObject();
                        jSONObject.put("privacyInfo", f2816a.a());
                        jSONObject.put("privacyShow", f2817b.a());
                        jSONObject.put(SmartMsgConstant.MSG_SHOW_TIME, e);
                        jSONObject.put("show2SDK", f2818c);
                        jSONObject.put("show2SDKVer", d);
                        jSONObject.put("privacyAgree", f.a());
                        jSONObject.put("agreeTime", g);
                        jSONObject.put("agree2SDK", h);
                        jSONObject.put("agree2SDKVer", i);
                        final boolean z2 = m;
                        ma.a().a(new mb() { // from class: com.amap.api.col.3sl.iu.2
                            @Override // com.amap.api.col.p0003sl.mb
                            public final void runTask() {
                                if (z2) {
                                    Iterator it = iu.b(iu.f(context)).iterator();
                                    while (it.hasNext()) {
                                        iu.a(context, ((File) it.next()).getName());
                                    }
                                }
                                iu.d(context);
                                iu.a(context, jSONObject, j2);
                                boolean zB = iu.b(context, jSONObject);
                                if (zB) {
                                    iu.b(context, iu.b(j2));
                                }
                                if (z2) {
                                    iu.b(context);
                                }
                                if (zB) {
                                    return;
                                }
                                iu.a(context, iu.b(j2));
                            }
                        });
                    } catch (Throwable unused) {
                    }
                } else if (m) {
                    ma.a().a(new mb() { // from class: com.amap.api.col.3sl.iu.1
                        @Override // com.amap.api.col.p0003sl.mb
                        public final void runTask() {
                            Iterator it = iu.b(iu.f(context)).iterator();
                            while (it.hasNext()) {
                                iu.a(context, ((File) it.next()).getName());
                            }
                            iu.b(context);
                        }
                    });
                }
                m = false;
                String strF = il.f(context);
                if (strF == null || strF.length() <= 0) {
                    ivVar3 = new iv(c.InvaildUserKeyCode, ixVar);
                    Log.e(ixVar.a(), String.format("获取apikey失败：\nerrorCode : %d\n原因：%s", Integer.valueOf(ivVar3.f2835a.a()), ivVar3.f2836b));
                }
                if (z) {
                    ivVar3 = new iv(c.SuccessCode, ixVar);
                } else {
                    Log.e(ixVar.a(), String.format("隐私合规校验失败：\nerrorCode : %d\n原因：%s", Integer.valueOf(ivVar3.f2835a.a()), ivVar3.f2836b));
                }
                return ivVar3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(Context context) {
        synchronized (iu.class) {
            if (context == null) {
                return;
            }
            if (!l) {
                e(context);
                l = true;
            }
            try {
                int iA = f2816a.a();
                int iA2 = f2817b.a();
                long j2 = e;
                ki.a(context, "AMap.privacy.data", "AMap.privacy.data", String.format("%d&%d&%d&%s&%s&%d&%d&%s&%s&%d&%d", Integer.valueOf(iA), Integer.valueOf(iA2), Long.valueOf(j2), f2818c, d, Integer.valueOf(f.a()), Long.valueOf(g), h, i, Long.valueOf(j), Long.valueOf(k)));
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private static void e(Context context) {
        String strA;
        if (context == null) {
            return;
        }
        try {
            strA = ki.a(context, "AMap.privacy.data", "AMap.privacy.data");
        } catch (Throwable th) {
            th.printStackTrace();
            strA = null;
        }
        if (strA == null) {
            return;
        }
        String[] strArrSplit = strA.split("&");
        if (strArrSplit.length != 11) {
            return;
        }
        try {
            f2816a = b.a(Integer.parseInt(strArrSplit[0]));
            f2817b = d.a(Integer.parseInt(strArrSplit[1]));
            e = Long.parseLong(strArrSplit[2]);
            d = strArrSplit[3];
            d = strArrSplit[4];
            f = a.a(Integer.parseInt(strArrSplit[5]));
            g = Long.parseLong(strArrSplit[6]);
            h = strArrSplit[7];
            i = strArrSplit[8];
            j = Long.parseLong(strArrSplit[9]);
            k = Long.parseLong(strArrSplit[10]);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(Context context, JSONObject jSONObject) {
        try {
            kc kcVar = new kc();
            kcVar.f2950b = context;
            kcVar.f2949a = jSONObject;
            new kt();
            lb lbVarA = kt.a(kcVar);
            if (lbVarA == null) {
                return false;
            }
            JSONObject jSONObject2 = new JSONObject(iy.a(lbVarA.f3037a));
            return jSONObject2.has("status") && jSONObject2.getInt("status") == 1;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(long j2) {
        return String.format("%d-%s", Long.valueOf(j2), "privacy.data");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String f(Context context) {
        return context.getFilesDir().getAbsolutePath() + "/AMap/Privacy/Upload";
    }

    private static String g(Context context) {
        return context.getFilesDir().getAbsolutePath() + "/AMap/Privacy/Reload";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ArrayList<File> b(String str) {
        ArrayList<File> arrayList = new ArrayList<>();
        if (str != null && str.length() != 0) {
            File file = new File(str);
            if (file.exists()) {
                File[] fileArrListFiles = file.listFiles();
                for (File file2 : fileArrListFiles) {
                    if (file2.isFile()) {
                        arrayList.add(file2);
                    }
                }
            }
        }
        return arrayList;
    }

    static /* synthetic */ void a(Context context, String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        try {
            File file = new File(f(context) + "/" + str);
            if (file.exists()) {
                File file2 = new File(g(context) + "/" + str);
                if (!file2.getParentFile().exists()) {
                    file2.getParentFile().mkdirs();
                }
                file.renameTo(file2);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    static /* synthetic */ void b(Context context) {
        try {
            for (File file : b(g(context))) {
                try {
                    String name = file.getName();
                    if (!name.endsWith("-privacy.data")) {
                        file.delete();
                    } else {
                        String[] strArrSplit = name.split(Constants.LINK);
                        if (strArrSplit == null && strArrSplit.length != 2) {
                            file.delete();
                        } else if (Long.parseLong(strArrSplit[0]) <= 0) {
                            file.delete();
                        } else {
                            FileInputStream fileInputStream = new FileInputStream(file);
                            byte[] bArr = new byte[fileInputStream.available()];
                            fileInputStream.read(bArr);
                            if (b(context, new JSONObject(new String(ki.b(context, bArr))))) {
                                file.delete();
                            }
                        }
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    static /* synthetic */ void a(Context context, JSONObject jSONObject, long j2) {
        Throwable th;
        FileOutputStream fileOutputStream;
        try {
            byte[] bArrA = ki.a(context, jSONObject.toString().getBytes());
            String strB = b(j2);
            File file = new File(f(context) + "/" + strB);
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            fileOutputStream = new FileOutputStream(file);
            try {
                fileOutputStream.write(bArrA);
                try {
                    fileOutputStream.close();
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
            } catch (Throwable th3) {
                th = th3;
                try {
                    th.printStackTrace();
                } finally {
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th4) {
                            th4.printStackTrace();
                        }
                    }
                }
            }
        } catch (Throwable th5) {
            th = th5;
            fileOutputStream = null;
        }
    }

    static /* synthetic */ void b(Context context, String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        try {
            File file = new File(f(context) + "/" + str);
            if (file.exists()) {
                file.delete();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
