package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.xiaomi.fit.fitness.parser.sport.track.parser.ParserHelper;
import com.xiaomi.push.f;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes11.dex */
public abstract class fys {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f18382k = Locale.getDefault().getLanguage().toLowerCase();
    public static String l = null;
    public static final DateFormat m;
    public static String n;
    public static long o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f18383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f18384b;
    public String c;
    public String d;
    public String e;
    public String f;
    public List<vxs> g;
    public final Map<String, Object> h;
    public f i;
    public long j;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(ParserHelper.DATA_FORMAT);
        m = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        n = uys.a(5) + "-";
        o = 0L;
    }

    public fys() {
        this.f18383a = l;
        this.f18384b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = new CopyOnWriteArrayList();
        this.h = new HashMap();
        this.i = null;
    }

    public static synchronized String k() {
        StringBuilder sb;
        sb = new StringBuilder();
        sb.append(n);
        long j = o;
        o = 1 + j;
        sb.append(Long.toString(j));
        return sb.toString();
    }

    public static String x() {
        return f18382k;
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        if (!TextUtils.isEmpty(this.f18383a)) {
            bundle.putString("ext_ns", this.f18383a);
        }
        if (!TextUtils.isEmpty(this.d)) {
            bundle.putString("ext_from", this.d);
        }
        if (!TextUtils.isEmpty(this.c)) {
            bundle.putString("ext_to", this.c);
        }
        if (!TextUtils.isEmpty(this.f18384b)) {
            bundle.putString("ext_pkt_id", this.f18384b);
        }
        if (!TextUtils.isEmpty(this.e)) {
            bundle.putString("ext_chid", this.e);
        }
        f fVar = this.i;
        if (fVar != null) {
            bundle.putBundle("ext_ERROR", fVar.a());
        }
        List<vxs> list = this.g;
        if (list != null) {
            Bundle[] bundleArr = new Bundle[list.size()];
            Iterator<vxs> it = this.g.iterator();
            int i = 0;
            while (it.hasNext()) {
                Bundle bundleA = it.next().a();
                if (bundleA != null) {
                    bundleArr[i] = bundleA;
                    i++;
                }
            }
            bundle.putParcelableArray("ext_exts", bundleArr);
        }
        return bundle;
    }

    public f b() {
        return this.i;
    }

    public vxs c(String str) {
        return d(str, null);
    }

    public vxs d(String str, String str2) {
        for (vxs vxsVar : this.g) {
            if (str2 == null || str2.equals(vxsVar.j())) {
                if (str.equals(vxsVar.e())) {
                    return vxsVar;
                }
            }
        }
        return null;
    }

    public synchronized Object e(String str) {
        Map<String, Object> map = this.h;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        fys fysVar = (fys) obj;
        f fVar = this.i;
        if (fVar == null ? fysVar.i != null : !fVar.equals(fysVar.i)) {
            return false;
        }
        String str = this.d;
        if (str == null ? fysVar.d != null : !str.equals(fysVar.d)) {
            return false;
        }
        if (!this.g.equals(fysVar.g)) {
            return false;
        }
        String str2 = this.f18384b;
        if (str2 == null ? fysVar.f18384b != null : !str2.equals(fysVar.f18384b)) {
            return false;
        }
        String str3 = this.e;
        if (str3 == null ? fysVar.e != null : !str3.equals(fysVar.e)) {
            return false;
        }
        Map<String, Object> map = this.h;
        if (map == null ? fysVar.h != null : !map.equals(fysVar.h)) {
            return false;
        }
        String str4 = this.c;
        if (str4 == null ? fysVar.c != null : !str4.equals(fysVar.c)) {
            return false;
        }
        String str5 = this.f18383a;
        String str6 = fysVar.f18383a;
        if (str5 != null) {
            if (str5.equals(str6)) {
                return true;
            }
        } else if (str6 == null) {
            return true;
        }
        return false;
    }

    public abstract String f();

    public synchronized Collection<vxs> g() {
        if (this.g == null) {
            return Collections.emptyList();
        }
        return Collections.unmodifiableList(new ArrayList(this.g));
    }

    public void h(f fVar) {
        this.i = fVar;
    }

    public int hashCode() {
        String str = this.f18383a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f18384b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.e;
        int iHashCode5 = (((((iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31;
        f fVar = this.i;
        return iHashCode5 + (fVar != null ? fVar.hashCode() : 0);
    }

    public void i(vxs vxsVar) {
        this.g.add(vxsVar);
    }

    public synchronized Collection<String> j() {
        if (this.h == null) {
            return Collections.emptySet();
        }
        return Collections.unmodifiableSet(new HashSet(this.h.keySet()));
    }

    public String l() {
        if ("ID_NOT_AVAILABLE".equals(this.f18384b)) {
            return null;
        }
        if (this.f18384b == null) {
            this.f18384b = k();
        }
        return this.f18384b;
    }

    public String m() {
        return this.e;
    }

    public void n(String str) {
        this.f18384b = str;
    }

    public String o() {
        return this.c;
    }

    public void p(String str) {
        this.e = str;
    }

    public String q() {
        return this.d;
    }

    public void r(String str) {
        this.c = str;
    }

    public String s() {
        return this.f;
    }

    public void t(String str) {
        this.d = str;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0129 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x0123 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public synchronized String u() {
        StringBuilder sb;
        ByteArrayOutputStream byteArrayOutputStream;
        ObjectOutputStream objectOutputStream;
        Exception e;
        try {
            sb = new StringBuilder();
            Iterator<vxs> it = g().iterator();
            while (it.hasNext()) {
                sb.append(it.next().d());
            }
            Map<String, Object> map = this.h;
            if (map != null && !map.isEmpty()) {
                sb.append(ecs.g("PHByb3BlcnRpZXMgeG1sbnM9Imh0dHA6Ly93d3cuaml2ZXNvZnR3YXJlLmNvbS94bWxucy94bXBwL3Byb3BlcnRpZXMiPg=="));
                for (String str : j()) {
                    Object objE = e(str);
                    sb.append("<property>");
                    sb.append("<name>");
                    sb.append(uys.b(str));
                    sb.append("</name>");
                    sb.append("<value type=\"");
                    if (objE instanceof Integer) {
                        sb.append("integer\">");
                        sb.append(objE);
                        sb.append("</value>");
                    } else if (objE instanceof Long) {
                        sb.append("long\">");
                        sb.append(objE);
                        sb.append("</value>");
                    } else if (objE instanceof Float) {
                        sb.append("float\">");
                        sb.append(objE);
                        sb.append("</value>");
                    } else if (objE instanceof Double) {
                        sb.append("double\">");
                        sb.append(objE);
                        sb.append("</value>");
                    } else if (objE instanceof Boolean) {
                        sb.append("boolean\">");
                        sb.append(objE);
                        sb.append("</value>");
                    } else if (objE instanceof String) {
                        sb.append("string\">");
                        sb.append(uys.b((String) objE));
                        sb.append("</value>");
                    } else {
                        ObjectOutputStream objectOutputStream2 = null;
                        try {
                            byteArrayOutputStream = new ByteArrayOutputStream();
                            try {
                                objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                                try {
                                    try {
                                        objectOutputStream.writeObject(objE);
                                        sb.append("java-object\">");
                                        sb.append(uys.d(byteArrayOutputStream.toByteArray()));
                                        sb.append("</value>");
                                        try {
                                            objectOutputStream.close();
                                        } catch (Exception unused) {
                                        }
                                    } catch (Exception e2) {
                                        e = e2;
                                        e.printStackTrace();
                                        if (objectOutputStream != null) {
                                            try {
                                                objectOutputStream.close();
                                            } catch (Exception unused2) {
                                            }
                                        }
                                        if (byteArrayOutputStream != null) {
                                        }
                                        sb.append("</property>");
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    objectOutputStream2 = objectOutputStream;
                                    if (objectOutputStream2 != null) {
                                        try {
                                            objectOutputStream2.close();
                                        } catch (Exception unused3) {
                                        }
                                    }
                                    if (byteArrayOutputStream == null) {
                                        throw th;
                                    }
                                    try {
                                        byteArrayOutputStream.close();
                                        throw th;
                                    } catch (Exception unused4) {
                                        throw th;
                                    }
                                }
                            } catch (Exception e3) {
                                e = e3;
                                objectOutputStream = null;
                                e = e;
                                e.printStackTrace();
                                if (objectOutputStream != null) {
                                    objectOutputStream.close();
                                }
                                if (byteArrayOutputStream != null) {
                                    byteArrayOutputStream.close();
                                }
                                sb.append("</property>");
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } catch (Exception e4) {
                            e = e4;
                            byteArrayOutputStream = null;
                            objectOutputStream = null;
                        } catch (Throwable th3) {
                            th = th3;
                            byteArrayOutputStream = null;
                        }
                        try {
                            byteArrayOutputStream.close();
                        } catch (Exception unused5) {
                        }
                    }
                    sb.append("</property>");
                }
                sb.append("</properties>");
            }
        } catch (Throwable th4) {
            throw th4;
        }
        return sb.toString();
    }

    public void v(String str) {
        this.f = str;
    }

    public String w() {
        return this.f18383a;
    }

    public fys(Bundle bundle) {
        this.f18383a = l;
        this.f18384b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = new CopyOnWriteArrayList();
        this.h = new HashMap();
        this.i = null;
        this.c = bundle.getString("ext_to");
        this.d = bundle.getString("ext_from");
        this.e = bundle.getString("ext_chid");
        this.f18384b = bundle.getString("ext_pkt_id");
        Parcelable[] parcelableArray = bundle.getParcelableArray("ext_exts");
        if (parcelableArray != null) {
            this.g = new ArrayList(parcelableArray.length);
            for (Parcelable parcelable : parcelableArray) {
                vxs vxsVarC = vxs.c((Bundle) parcelable);
                if (vxsVarC != null) {
                    this.g.add(vxsVarC);
                }
            }
        }
        Bundle bundle2 = bundle.getBundle("ext_ERROR");
        if (bundle2 != null) {
            this.i = new f(bundle2);
        }
    }
}
