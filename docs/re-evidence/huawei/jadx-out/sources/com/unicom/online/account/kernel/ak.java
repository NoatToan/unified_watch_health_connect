package com.unicom.online.account.kernel;

import android.content.Context;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class ak {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f31167a = "123.125.99.31";
    public static List<d> o;
    public static int q;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f31168b = new String(o.b("MTAwMTAuY29t"));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f31169c = new String(o.b("aWQ2Lm1l"));
    public static final String d = new String(o.b("Y21wYXNzcG9ydC5jb20="));
    public static final String e = new String(o.b("bXN2Ni53b3Ntcy5jbg=="));
    public static final String f = new String(o.b("YWxpLndvc21zLmNu"));
    public static final String g = new String(o.b("bS56enguY25rbG9nLmNvbQ=="));
    public static final String h = new String(o.b("dGVzdC53b3Ntcy5jbg=="));
    public static final String i = new String(o.b("YXV0aC53b3Ntcy5jbg=="));
    public static final String j = new String(o.b("c2RrbG9nLndvc21zLmNu"));
    public static final String k = new String(o.b("L2Ryby92MS9yZXBvcnQ="));
    public static final String l = new String(o.b("L3VuaWNvbUF1dGgvYW5kcm9pZC92My4wL3Fj"));
    public static final String m = new String(o.b("L3VuaWNvbUF1dGgvYW5kcm9pZC92My4wL3Fj"));
    public static final String n = new String(o.b("L3VuaWNvbVVhaWQvYW5kcm9pZC92MS4wL3Fj"));
    public static Set<String> p = new HashSet();
    public static String r = "0";
    private static String s = "";
    private static String t = "";
    private static String u = "";
    private static int v = 5;
    private static int w = -1;
    private static String x = "";
    private static String y = "";
    private static String z = "";

    public static d i(String str) {
        for (int i2 = 0; i2 < o.size(); i2++) {
            d dVar = o.get(i2);
            if (dVar.f31181a.equalsIgnoreCase(str)) {
                return dVar;
            }
        }
        return null;
    }

    public static void h(String str) {
        z = str;
    }

    public static int h() {
        return w;
    }

    public static void g(String str) {
        y = str;
    }

    public static int g() {
        return v;
    }

    public static void f(String str) {
        x = str;
    }

    public static String f() {
        return u;
    }

    public static String e(String str) {
        if ("cmnet".equals(str) || "cmwap".equals(str)) {
            return "1";
        }
        if ("3gwap".equals(str) || "uniwap".equals(str) || "3gnet".equals(str) || "uninet".equals(str)) {
            return "3";
        }
        return ("ctnet".equals(str) || "ctwap".equals(str)) ? "2" : "0";
    }

    public static String e() {
        t = n.a();
        return d();
    }

    public static void d(String str) {
        aj.a("APN:".concat(String.valueOf(str)));
        u = str;
    }

    public static void d(int i2) {
        w = i2;
    }

    public static String d() {
        if (t.length() != 32) {
            e();
        }
        return t;
    }

    public static void c(String str) {
        s = str;
    }

    public static void c(int i2) {
        v = i2;
    }

    public static String c() {
        return s;
    }

    private static boolean b(String str, String str2) {
        return str.startsWith(str2) || str.endsWith(str2);
    }

    public static void b(String str) {
        r = str;
    }

    public static void b(Context context, String str) {
        d dVarI = i(str);
        if (dVarI != null) {
            dVarI.f31182b = "";
            dVarI.f31183c = 0L;
            am.a(context, "DNSCache", new ArrayList(o));
        }
    }

    public static String b(int i2) {
        StringBuilder sb;
        String str;
        if (ac.a(i2)) {
            sb = new StringBuilder("https://");
            sb.append(i.d());
            str = l;
        } else if (ac.b(i2)) {
            sb = new StringBuilder("https://");
            sb.append(i.d());
            str = n;
        } else {
            sb = new StringBuilder("https://");
            sb.append(i.d());
            str = m;
        }
        sb.append(str);
        sb.append("?");
        return sb.toString();
    }

    public static String b() {
        return r;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0087  */
    /* JADX WARN: Code duplicated, block: B:25:0x008f  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:31:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:37:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ff  */
    /* JADX WARN: Instruction removed from duplicated block: B:25:0x008f, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:29:0x00a9, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:33:0x00c3, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:37:0x00dd, please report this as an issue */
    public static boolean a(String str, String str2) {
        String str3;
        String str4;
        String str5;
        String str6;
        aj.a("\nhostname : " + str + "\nsubjectName : " + str2);
        if (ac.b() && str != null) {
            try {
                if (str.length() > 0) {
                    InetAddress byName = InetAddress.getByName(str.replaceFirst("^\\[", "").replaceAll("\\]$", ""));
                    Iterator<String> it = p.iterator();
                    while (it.hasNext()) {
                        if (byName.equals(InetAddress.getByName(it.next()))) {
                            return true;
                        }
                    }
                }
            } catch (UnknownHostException e2) {
                aj.a(e2);
            }
        }
        if (!str.endsWith(".10010.com") || !b(str2, "CN=10010.com")) {
            String str7 = i;
            if (str.equals(str7)) {
                if (!b(str2, "CN=" + str7)) {
                    str3 = e;
                    if (str.equals(str3)) {
                        if (!b(str2, "CN=" + str3)) {
                            str4 = f;
                            if (str.equals(str4)) {
                                if (!b(str2, "CN=" + str4)) {
                                    str5 = h;
                                    if (str.equals(str5)) {
                                        if (!b(str2, "CN=" + str5)) {
                                            str6 = g;
                                            if (str.equals(str6)) {
                                                return str.equals("id6.me") ? false : false;
                                            }
                                            if (!b(str2, "CN=" + str6)) {
                                                if ((str.equals("id6.me") || !b(str2, "CN=*.id6.me")) && (!str.equals("cert.cmpassport.com") || !b(str2, "CN=*.cmpassport.com"))) {
                                                    return false;
                                                }
                                            }
                                        }
                                    } else {
                                        str6 = g;
                                        if (str.equals(str6)) {
                                            if (str.equals("id6.me")) {
                                            }
                                        }
                                        if (!b(str2, "CN=" + str6)) {
                                            if (str.equals("id6.me")) {
                                            }
                                        }
                                    }
                                }
                            } else {
                                str5 = h;
                                if (str.equals(str5)) {
                                    if (!b(str2, "CN=" + str5)) {
                                        str6 = g;
                                        if (str.equals(str6)) {
                                            if (str.equals("id6.me")) {
                                            }
                                        }
                                        if (!b(str2, "CN=" + str6)) {
                                            if (str.equals("id6.me")) {
                                            }
                                        }
                                    }
                                } else {
                                    str6 = g;
                                    if (str.equals(str6)) {
                                        if (str.equals("id6.me")) {
                                        }
                                    }
                                    if (!b(str2, "CN=" + str6)) {
                                        if (str.equals("id6.me")) {
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        str4 = f;
                        if (str.equals(str4)) {
                            if (!b(str2, "CN=" + str4)) {
                                str5 = h;
                                if (str.equals(str5)) {
                                    if (!b(str2, "CN=" + str5)) {
                                        str6 = g;
                                        if (str.equals(str6)) {
                                            if (str.equals("id6.me")) {
                                            }
                                        }
                                        if (!b(str2, "CN=" + str6)) {
                                            if (str.equals("id6.me")) {
                                            }
                                        }
                                    }
                                } else {
                                    str6 = g;
                                    if (str.equals(str6)) {
                                        if (str.equals("id6.me")) {
                                        }
                                    }
                                    if (!b(str2, "CN=" + str6)) {
                                        if (str.equals("id6.me")) {
                                        }
                                    }
                                }
                            }
                        } else {
                            str5 = h;
                            if (str.equals(str5)) {
                                if (!b(str2, "CN=" + str5)) {
                                    str6 = g;
                                    if (str.equals(str6)) {
                                        if (str.equals("id6.me")) {
                                        }
                                    }
                                    if (!b(str2, "CN=" + str6)) {
                                        if (str.equals("id6.me")) {
                                        }
                                    }
                                }
                            } else {
                                str6 = g;
                                if (str.equals(str6)) {
                                    if (str.equals("id6.me")) {
                                    }
                                }
                                if (!b(str2, "CN=" + str6)) {
                                    if (str.equals("id6.me")) {
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                str3 = e;
                if (str.equals(str3)) {
                    if (!b(str2, "CN=" + str3)) {
                        str4 = f;
                        if (str.equals(str4)) {
                            if (!b(str2, "CN=" + str4)) {
                                str5 = h;
                                if (str.equals(str5)) {
                                    if (!b(str2, "CN=" + str5)) {
                                        str6 = g;
                                        if (str.equals(str6)) {
                                            if (str.equals("id6.me")) {
                                            }
                                        }
                                        if (!b(str2, "CN=" + str6)) {
                                            if (str.equals("id6.me")) {
                                            }
                                        }
                                    }
                                } else {
                                    str6 = g;
                                    if (str.equals(str6)) {
                                        if (str.equals("id6.me")) {
                                        }
                                    }
                                    if (!b(str2, "CN=" + str6)) {
                                        if (str.equals("id6.me")) {
                                        }
                                    }
                                }
                            }
                        } else {
                            str5 = h;
                            if (str.equals(str5)) {
                                if (!b(str2, "CN=" + str5)) {
                                    str6 = g;
                                    if (str.equals(str6)) {
                                        if (str.equals("id6.me")) {
                                        }
                                    }
                                    if (!b(str2, "CN=" + str6)) {
                                        if (str.equals("id6.me")) {
                                        }
                                    }
                                }
                            } else {
                                str6 = g;
                                if (str.equals(str6)) {
                                    if (str.equals("id6.me")) {
                                    }
                                }
                                if (!b(str2, "CN=" + str6)) {
                                    if (str.equals("id6.me")) {
                                    }
                                }
                            }
                        }
                    }
                } else {
                    str4 = f;
                    if (str.equals(str4)) {
                        if (!b(str2, "CN=" + str4)) {
                            str5 = h;
                            if (str.equals(str5)) {
                                if (!b(str2, "CN=" + str5)) {
                                    str6 = g;
                                    if (str.equals(str6)) {
                                        if (str.equals("id6.me")) {
                                        }
                                    }
                                    if (!b(str2, "CN=" + str6)) {
                                        if (str.equals("id6.me")) {
                                        }
                                    }
                                }
                            } else {
                                str6 = g;
                                if (str.equals(str6)) {
                                    if (str.equals("id6.me")) {
                                    }
                                }
                                if (!b(str2, "CN=" + str6)) {
                                    if (str.equals("id6.me")) {
                                    }
                                }
                            }
                        }
                    } else {
                        str5 = h;
                        if (str.equals(str5)) {
                            if (!b(str2, "CN=" + str5)) {
                                str6 = g;
                                if (str.equals(str6)) {
                                    if (str.equals("id6.me")) {
                                    }
                                }
                                if (!b(str2, "CN=" + str6)) {
                                    if (str.equals("id6.me")) {
                                    }
                                }
                            }
                        } else {
                            str6 = g;
                            if (str.equals(str6)) {
                                if (str.equals("id6.me")) {
                                }
                            }
                            if (!b(str2, "CN=" + str6)) {
                                if (str.equals("id6.me")) {
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    public static boolean a(String str) {
        return str.startsWith(i) || str.startsWith(e) || str.startsWith(g);
    }

    public static void a(Context context, String str) {
        d dVar = new d();
        dVar.f31181a = str;
        if (o.isEmpty()) {
            o.add(dVar);
        } else {
            o.add(1, dVar);
            if (o.size() > 4) {
                o.remove(4);
            }
        }
        am.a(context, "DNSCache", new ArrayList(o));
    }

    public static void a(int i2) {
        q = i2;
    }

    public static int a() {
        int i2 = q;
        if (i2 == 0) {
            return 1;
        }
        if (i2 != 1) {
            return i2 != 2 ? -1 : 0;
        }
        return 2;
    }
}
