package com.xiaomi.push;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.material.datepicker.UtcDates;
import com.xiaomi.mipush.sdk.Constants;
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

/* JADX INFO: loaded from: classes22.dex */
public abstract class cj {

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public static final DateFormat f61a;
    private static String l;
    private static long m;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private List<cg> h;
    private final Map<String, Object> i;
    private cn j;
    public static final String a = Locale.getDefault().getLanguage().toLowerCase();
    private static String k = null;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        f61a = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(UtcDates.UTC));
        l = cu.a(5) + Constants.ACCEPT_TIME_SEPARATOR_SERVER;
        m = 0L;
    }

    public cj() {
        this.b = k;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = new CopyOnWriteArrayList();
        this.i = new HashMap();
        this.j = null;
    }

    public cj(Bundle bundle) {
        this.b = k;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = new CopyOnWriteArrayList();
        this.i = new HashMap();
        this.j = null;
        this.d = bundle.getString("ext_to");
        this.e = bundle.getString("ext_from");
        this.f = bundle.getString("ext_chid");
        this.c = bundle.getString("ext_pkt_id");
        Parcelable[] parcelableArray = bundle.getParcelableArray("ext_exts");
        if (parcelableArray != null) {
            this.h = new ArrayList(parcelableArray.length);
            for (Parcelable parcelable : parcelableArray) {
                cg cgVarA = cg.a((Bundle) parcelable);
                if (cgVarA != null) {
                    this.h.add(cgVarA);
                }
            }
        }
        Bundle bundle2 = bundle.getBundle("ext_ERROR");
        if (bundle2 != null) {
            this.j = new cn(bundle2);
        }
    }

    public static synchronized String i() {
        StringBuilder sb;
        sb = new StringBuilder();
        sb.append(l);
        long j = m;
        m = 1 + j;
        sb.append(Long.toString(j));
        return sb.toString();
    }

    public static String q() {
        return a;
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        if (!TextUtils.isEmpty(this.b)) {
            bundle.putString("ext_ns", this.b);
        }
        if (!TextUtils.isEmpty(this.e)) {
            bundle.putString("ext_from", this.e);
        }
        if (!TextUtils.isEmpty(this.d)) {
            bundle.putString("ext_to", this.d);
        }
        if (!TextUtils.isEmpty(this.c)) {
            bundle.putString("ext_pkt_id", this.c);
        }
        if (!TextUtils.isEmpty(this.f)) {
            bundle.putString("ext_chid", this.f);
        }
        cn cnVar = this.j;
        if (cnVar != null) {
            bundle.putBundle("ext_ERROR", cnVar.a());
        }
        List<cg> list = this.h;
        if (list != null) {
            Bundle[] bundleArr = new Bundle[list.size()];
            int i = 0;
            Iterator<cg> it2 = this.h.iterator();
            while (it2.hasNext()) {
                Bundle bundleA = it2.next().a();
                if (bundleA != null) {
                    bundleArr[i] = bundleA;
                    i++;
                }
            }
            bundle.putParcelableArray("ext_exts", bundleArr);
        }
        return bundle;
    }

    public cg a(String str) {
        return a(str, null);
    }

    public cg a(String str, String str2) {
        for (cg cgVar : this.h) {
            if (str2 == null || str2.equals(cgVar.b())) {
                if (str.equals(cgVar.m3636a())) {
                    return cgVar;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public cn m3640a() {
        return this.j;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public synchronized Object m3641a(String str) {
        Map<String, Object> map = this.i;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    /* JADX INFO: renamed from: a */
    public abstract String mo3639a();

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public synchronized Collection<cg> m3642a() {
        if (this.h == null) {
            return Collections.emptyList();
        }
        return Collections.unmodifiableList(new ArrayList(this.h));
    }

    public void a(cg cgVar) {
        this.h.add(cgVar);
    }

    public void a(cn cnVar) {
        this.j = cnVar;
    }

    public synchronized Collection<String> b() {
        if (this.i == null) {
            return Collections.emptySet();
        }
        return Collections.unmodifiableSet(new HashSet(this.i.keySet()));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        cj cjVar = (cj) obj;
        cn cnVar = this.j;
        if (cnVar == null ? cjVar.j != null : !cnVar.equals(cjVar.j)) {
            return false;
        }
        String str = this.e;
        if (str == null ? cjVar.e != null : !str.equals(cjVar.e)) {
            return false;
        }
        if (!this.h.equals(cjVar.h)) {
            return false;
        }
        String str2 = this.c;
        if (str2 == null ? cjVar.c != null : !str2.equals(cjVar.c)) {
            return false;
        }
        String str3 = this.f;
        if (str3 == null ? cjVar.f != null : !str3.equals(cjVar.f)) {
            return false;
        }
        Map<String, Object> map = this.i;
        if (map == null ? cjVar.i != null : !map.equals(cjVar.i)) {
            return false;
        }
        String str4 = this.d;
        if (str4 == null ? cjVar.d != null : !str4.equals(cjVar.d)) {
            return false;
        }
        String str5 = this.b;
        String str6 = cjVar.b;
        if (str5 != null) {
            if (str5.equals(str6)) {
                return true;
            }
        } else if (str6 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.b;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.d;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.e;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f;
        int iHashCode5 = (((((iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31;
        cn cnVar = this.j;
        return iHashCode5 + (cnVar != null ? cnVar.hashCode() : 0);
    }

    public String j() {
        if ("ID_NOT_AVAILABLE".equals(this.c)) {
            return null;
        }
        if (this.c == null) {
            this.c = i();
        }
        return this.c;
    }

    public String k() {
        return this.f;
    }

    public void k(String str) {
        this.c = str;
    }

    public String l() {
        return this.d;
    }

    public void l(String str) {
        this.f = str;
    }

    public String m() {
        return this.e;
    }

    public void m(String str) {
        this.d = str;
    }

    public String n() {
        return this.g;
    }

    public void n(String str) {
        this.e = str;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0111 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x0109 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public synchronized String o() {
        StringBuilder sb;
        ByteArrayOutputStream byteArrayOutputStream;
        ObjectOutputStream objectOutputStream;
        Exception e;
        String str;
        sb = new StringBuilder();
        Iterator<cg> it2 = m3642a().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next().d());
        }
        Map<String, Object> map = this.i;
        if (map != null && !map.isEmpty()) {
            sb.append(aa.a("PHByb3BlcnRpZXMgeG1sbnM9Imh0dHA6Ly93d3cuaml2ZXNvZnR3YXJlLmNvbS94bWxucy94bXBwL3Byb3BlcnRpZXMiPg=="));
            for (String str2 : b()) {
                Object objM3641a = m3641a(str2);
                sb.append("<property>");
                sb.append("<name>");
                sb.append(cu.a(str2));
                sb.append("</name>");
                sb.append("<value type=\"");
                if (objM3641a instanceof Integer) {
                    sb.append("integer\">");
                    sb.append(objM3641a);
                    str = "</value>";
                } else if (objM3641a instanceof Long) {
                    sb.append("long\">");
                    sb.append(objM3641a);
                    str = "</value>";
                } else if (objM3641a instanceof Float) {
                    sb.append("float\">");
                    sb.append(objM3641a);
                    str = "</value>";
                } else if (objM3641a instanceof Double) {
                    sb.append("double\">");
                    sb.append(objM3641a);
                    str = "</value>";
                } else if (objM3641a instanceof Boolean) {
                    sb.append("boolean\">");
                    sb.append(objM3641a);
                    str = "</value>";
                } else {
                    if (objM3641a instanceof String) {
                        sb.append("string\">");
                        sb.append(cu.a((String) objM3641a));
                        str = "</value>";
                    } else {
                        ObjectOutputStream objectOutputStream2 = null;
                        try {
                            try {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                                    try {
                                        try {
                                            objectOutputStream.writeObject(objM3641a);
                                            sb.append("java-object\">");
                                            sb.append(cu.a(byteArrayOutputStream.toByteArray()));
                                            sb.append("</value>");
                                            try {
                                                objectOutputStream.close();
                                            } catch (Exception unused) {
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            objectOutputStream2 = objectOutputStream;
                                            if (objectOutputStream2 != null) {
                                                try {
                                                    objectOutputStream2.close();
                                                } catch (Exception unused2) {
                                                }
                                            }
                                            if (byteArrayOutputStream == null) {
                                                throw th;
                                            }
                                            try {
                                                byteArrayOutputStream.close();
                                                throw th;
                                            } catch (Exception unused3) {
                                                throw th;
                                            }
                                        }
                                    } catch (Exception e2) {
                                        e = e2;
                                        e.printStackTrace();
                                        if (objectOutputStream != null) {
                                            try {
                                                objectOutputStream.close();
                                            } catch (Exception unused4) {
                                            }
                                        }
                                        if (byteArrayOutputStream != null) {
                                        }
                                        sb.append("</property>");
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
                            byteArrayOutputStream.close();
                        } catch (Exception unused5) {
                        }
                    }
                    sb.append("</property>");
                }
                sb.append(str);
                sb.append("</property>");
            }
            sb.append("</properties>");
        }
        return sb.toString();
    }

    public void o(String str) {
        this.g = str;
    }

    public String p() {
        return this.b;
    }
}
