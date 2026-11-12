package com.amap.api.col.p0003sl;

import android.content.Context;
import defpackage.e0t;
import defpackage.f7t;
import defpackage.gv5;
import defpackage.i4t;
import defpackage.o0t;
import defpackage.p0t;
import defpackage.u3t;
import defpackage.v5t;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import miuix.preference.flexible.PreferenceMarkLevel;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class iu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile b f6156a = b.Unknow;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile d f6157b = d.Unknow;
    public static volatile String c = "";
    public static volatile String d = "";
    public static volatile long e = -1;
    public static volatile a f = a.Unknow;
    public static volatile long g = -1;
    public static volatile String h = "";
    public static volatile String i = "";
    public static volatile long j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static volatile long f6158k = 0;
    public static volatile boolean l = false;
    public static volatile boolean m = true;

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

    public enum c {
        SuccessCode(0),
        ShowUnknowCode(555570),
        ShowNoShowCode(555571),
        InfoUnknowCode(555572),
        InfoNotContainCode(555573),
        AgreeUnknowCode(555574),
        AgreeNotAgreeCode(555575),
        InvaildUserKeyCode(10001),
        IllegalArgument(PreferenceMarkLevel.LEVEL_LARGE_ONLY_TITLE);

        private final int j;

        c(int i) {
            this.j = i;
        }

        public final int a() {
            return this.j;
        }
    }

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

    public class e extends f7t {
        public final /* synthetic */ Context d;

        public e(Context context) {
            this.d = context;
        }

        @Override // defpackage.f7t
        public final void runTask() {
            Iterator it = iu.m(iu.t(this.d)).iterator();
            while (it.hasNext()) {
                iu.g(this.d, ((File) it.next()).getName());
            }
            iu.n(this.d);
        }
    }

    public class f extends f7t {
        public final /* synthetic */ boolean d;
        public final /* synthetic */ Context e;
        public final /* synthetic */ long g;
        public final /* synthetic */ JSONObject h;

        public f(boolean z, Context context, long j, JSONObject jSONObject) {
            this.d = z;
            this.e = context;
            this.g = j;
            this.h = jSONObject;
        }

        @Override // defpackage.f7t
        public final void runTask() {
            if (this.d) {
                Iterator it = iu.m(iu.t(this.e)).iterator();
                while (it.hasNext()) {
                    iu.g(this.e, ((File) it.next()).getName());
                }
            }
            iu.r(this.e);
            iu.h(this.e, this.h, this.g);
            boolean zP = iu.p(this.e, this.h);
            if (zP) {
                iu.o(this.e, iu.l(this.g));
            }
            if (this.d) {
                iu.n(this.e);
            }
            if (zP) {
                return;
            }
            iu.g(this.e, iu.l(this.g));
        }
    }

    public static synchronized y0 a(Context context, o0t o0tVar) {
        boolean z;
        try {
            if (context == null || o0tVar == null) {
                return new y0(c.IllegalArgument, o0tVar);
            }
            if (!l) {
                s(context);
                l = true;
            }
            y0 y0Var = null;
            if (f6157b != d.DidShow) {
                if (f6157b == d.Unknow) {
                    y0Var = new y0(c.ShowUnknowCode, o0tVar);
                } else if (f6157b == d.NotShow) {
                    y0Var = new y0(c.ShowNoShowCode, o0tVar);
                }
                z = false;
            } else {
                z = true;
            }
            if (z && f6156a != b.DidContain) {
                if (f6156a == b.Unknow) {
                    y0Var = new y0(c.InfoUnknowCode, o0tVar);
                } else if (f6156a == b.NotContain) {
                    y0Var = new y0(c.InfoNotContainCode, o0tVar);
                }
                z = false;
            }
            if (z && f != a.DidAgree) {
                if (f == a.Unknow) {
                    y0Var = new y0(c.AgreeUnknowCode, o0tVar);
                } else if (f == a.NotAgree) {
                    y0Var = new y0(c.AgreeNotAgreeCode, o0tVar);
                }
                z = false;
            }
            if (f6158k != j) {
                long j2 = j;
                f6158k = j;
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("privacyInfo", f6156a.a());
                    jSONObject.put("privacyShow", f6157b.a());
                    jSONObject.put("showTime", e);
                    jSONObject.put("show2SDK", c);
                    jSONObject.put("show2SDKVer", d);
                    jSONObject.put("privacyAgree", f.a());
                    jSONObject.put("agreeTime", g);
                    jSONObject.put("agree2SDK", h);
                    jSONObject.put("agree2SDKVer", i);
                    j1.h().b(new f(m, context, j2, jSONObject));
                } catch (Throwable unused) {
                }
            } else if (m) {
                j1.h().b(new e(context));
            }
            m = false;
            String strK = e0t.k(context);
            if (strK == null || strK.length() <= 0) {
                y0Var = new y0(c.InvaildUserKeyCode, o0tVar);
                o0tVar.a();
                String.format("获取apikey失败：\nerrorCode : %d\n原因：%s", Integer.valueOf(y0Var.f6352a.a()), y0Var.f6353b);
            }
            if (z) {
                y0Var = new y0(c.SuccessCode, o0tVar);
            } else {
                o0tVar.a();
                String.format("隐私合规校验失败：\nerrorCode : %d\n原因：%s", Integer.valueOf(y0Var.f6352a.a()), y0Var.f6353b);
            }
            return y0Var;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static synchronized void e(Context context, a aVar, o0t o0tVar) {
        if (context == null || o0tVar == null) {
            return;
        }
        try {
            if (!l) {
                s(context);
                l = true;
            }
            if (aVar != f) {
                f = aVar;
                h = o0tVar.a();
                i = o0tVar.e();
                long jCurrentTimeMillis = System.currentTimeMillis();
                g = jCurrentTimeMillis;
                j = jCurrentTimeMillis;
                r(context);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static synchronized void f(Context context, d dVar, b bVar, o0t o0tVar) {
        if (context == null || o0tVar == null) {
            return;
        }
        try {
            if (!l) {
                s(context);
                l = true;
            }
            Boolean bool = Boolean.FALSE;
            if (dVar != f6157b) {
                bool = Boolean.TRUE;
                f6157b = dVar;
            }
            if (bVar != f6156a) {
                bool = Boolean.TRUE;
                f6156a = bVar;
            }
            if (bool.booleanValue()) {
                c = o0tVar.a();
                d = o0tVar.e();
                long jCurrentTimeMillis = System.currentTimeMillis();
                e = jCurrentTimeMillis;
                j = jCurrentTimeMillis;
                r(context);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static /* synthetic */ void g(Context context, String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        try {
            File file = new File(t(context) + "/" + str);
            if (file.exists()) {
                File file2 = new File(u(context) + "/" + str);
                if (!file2.getParentFile().exists()) {
                    file2.getParentFile().mkdirs();
                }
                file.renameTo(file2);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static /* synthetic */ void h(Context context, JSONObject jSONObject, long j2) {
        FileOutputStream fileOutputStream = null;
        try {
            byte[] bArrN = i4t.n(context, jSONObject.toString().getBytes());
            String strL = l(j2);
            File file = new File(t(context) + "/" + strL);
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                fileOutputStream2.write(bArrN);
                try {
                    fileOutputStream2.close();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                fileOutputStream = fileOutputStream2;
                th = th2;
                try {
                    th.printStackTrace();
                } finally {
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th3) {
                            th3.printStackTrace();
                        }
                    }
                }
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public static void i(Context context, boolean z, o0t o0tVar) {
        e(context, z ? a.DidAgree : a.NotAgree, o0tVar);
    }

    public static void j(Context context, boolean z, boolean z2, o0t o0tVar) {
        f(context, z2 ? d.DidShow : d.NotShow, z ? b.DidContain : b.NotContain, o0tVar);
    }

    public static String l(long j2) {
        return String.format("%d-%s", Long.valueOf(j2), "privacy.data");
    }

    public static ArrayList<File> m(String str) {
        ArrayList<File> arrayList = new ArrayList<>();
        if (str != null && str.length() != 0) {
            File file = new File(str);
            if (!file.exists()) {
                return arrayList;
            }
            File[] fileArrListFiles = file.listFiles();
            for (File file2 : fileArrListFiles) {
                if (file2.isFile()) {
                    arrayList.add(file2);
                }
            }
        }
        return arrayList;
    }

    public static /* synthetic */ void n(Context context) {
        try {
            for (File file : m(u(context))) {
                try {
                    String name = file.getName();
                    if (name.endsWith("-privacy.data")) {
                        String[] strArrSplit = name.split("-");
                        if (strArrSplit == null && strArrSplit.length != 2) {
                            file.delete();
                        } else if (Long.parseLong(strArrSplit[0]) <= 0) {
                            file.delete();
                        } else {
                            FileInputStream fileInputStream = new FileInputStream(file);
                            byte[] bArr = new byte[fileInputStream.available()];
                            fileInputStream.read(bArr);
                            if (p(context, new JSONObject(new String(i4t.q(context, bArr))))) {
                                file.delete();
                            }
                        }
                    } else {
                        file.delete();
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public static /* synthetic */ void o(Context context, String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        try {
            File file = new File(t(context) + "/" + str);
            if (file.exists()) {
                file.delete();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static boolean p(Context context, JSONObject jSONObject) {
        try {
            u3t u3tVar = new u3t();
            u3tVar.s = context;
            u3tVar.f35349r = jSONObject;
            new b1();
            v5t v5tVarD = b1.d(u3tVar);
            if (v5tVarD == null) {
                return false;
            }
            JSONObject jSONObject2 = new JSONObject(p0t.g(v5tVarD.f36513a));
            return jSONObject2.has("status") && jSONObject2.getInt("status") == 1;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public static synchronized void r(Context context) {
        if (context == null) {
            return;
        }
        if (!l) {
            s(context);
            l = true;
        }
        try {
            i4t.e(context, "AMap.privacy.data", "AMap.privacy.data", String.format("%d&%d&%d&%s&%s&%d&%d&%s&%s&%d&%d", Integer.valueOf(f6156a.a()), Integer.valueOf(f6157b.a()), Long.valueOf(e), c, d, Integer.valueOf(f.a()), Long.valueOf(g), h, i, Long.valueOf(j), Long.valueOf(f6158k)));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void s(Context context) {
        String strD;
        if (context == null) {
            return;
        }
        try {
            strD = i4t.d(context, "AMap.privacy.data", "AMap.privacy.data");
        } catch (Throwable th) {
            th.printStackTrace();
            strD = null;
        }
        if (strD == null) {
            return;
        }
        String[] strArrSplit = strD.split(gv5.CONNECT_STR);
        if (strArrSplit.length != 11) {
            return;
        }
        try {
            f6156a = b.a(Integer.parseInt(strArrSplit[0]));
            f6157b = d.a(Integer.parseInt(strArrSplit[1]));
            e = Long.parseLong(strArrSplit[2]);
            d = strArrSplit[3];
            d = strArrSplit[4];
            f = a.a(Integer.parseInt(strArrSplit[5]));
            g = Long.parseLong(strArrSplit[6]);
            h = strArrSplit[7];
            i = strArrSplit[8];
            j = Long.parseLong(strArrSplit[9]);
            f6158k = Long.parseLong(strArrSplit[10]);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public static String t(Context context) {
        return context.getFilesDir().getAbsolutePath() + "/AMap/Privacy/Upload";
    }

    public static String u(Context context) {
        return context.getFilesDir().getAbsolutePath() + "/AMap/Privacy/Reload";
    }
}
