package defpackage;

import android.os.Build;
import android.text.TextUtils;
import com.amap.api.col.p0003sl.jq;
import com.xiaomi.onetrack.util.z;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class i2t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile jq f20720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Properties f20721b;

    public static jq a() {
        if (f20720a == null) {
            synchronized (i2t.class) {
                try {
                    if (f20720a == null) {
                        try {
                            jq jqVarB = b(Build.MANUFACTURER);
                            if ("".equals(jqVarB.a())) {
                                Iterator it = Arrays.asList(jq.MIUI.a(), jq.Flyme.a(), jq.RH.a(), jq.ColorOS.a(), jq.FuntouchOS.a(), jq.SmartisanOS.a(), jq.AmigoOS.a(), jq.Sense.a(), jq.LG.a(), jq.Google.a(), jq.NubiaUI.a()).iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        jqVarB = jq.Other;
                                        break;
                                    }
                                    jq jqVarB2 = b((String) it.next());
                                    if (!"".equals(jqVarB2.a())) {
                                        jqVarB = jqVarB2;
                                        break;
                                    }
                                }
                            }
                            f20720a = jqVarB;
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f20720a;
    }

    public static jq b(String str) {
        if (str == null || str.length() <= 0) {
            return jq.Other;
        }
        jq jqVar = jq.MIUI;
        if (!str.equalsIgnoreCase(jqVar.a())) {
            jq jqVar2 = jq.Flyme;
            if (!str.equalsIgnoreCase(jqVar2.a())) {
                jq jqVar3 = jq.RH;
                if (!str.equalsIgnoreCase(jqVar3.a())) {
                    jq jqVar4 = jq.ColorOS;
                    if (!str.equalsIgnoreCase(jqVar4.a())) {
                        jq jqVar5 = jq.FuntouchOS;
                        if (!str.equalsIgnoreCase(jqVar5.a())) {
                            jq jqVar6 = jq.SmartisanOS;
                            if (!str.equalsIgnoreCase(jqVar6.a())) {
                                jq jqVar7 = jq.AmigoOS;
                                if (!str.equalsIgnoreCase(jqVar7.a())) {
                                    jq jqVar8 = jq.EUI;
                                    if (!str.equalsIgnoreCase(jqVar8.a())) {
                                        jq jqVar9 = jq.Sense;
                                        if (!str.equalsIgnoreCase(jqVar9.a())) {
                                            jq jqVar10 = jq.LG;
                                            if (!str.equalsIgnoreCase(jqVar10.a())) {
                                                jq jqVar11 = jq.Google;
                                                if (!str.equalsIgnoreCase(jqVar11.a())) {
                                                    jq jqVar12 = jq.NubiaUI;
                                                    if (str.equalsIgnoreCase(jqVar12.a()) && q(jqVar12)) {
                                                        return jqVar12;
                                                    }
                                                } else if (p(jqVar11)) {
                                                    return jqVar11;
                                                }
                                            } else if (o(jqVar10)) {
                                                return jqVar10;
                                            }
                                        } else if (n(jqVar9)) {
                                            return jqVar9;
                                        }
                                    } else if (m(jqVar8)) {
                                        return jqVar8;
                                    }
                                } else if (l(jqVar7)) {
                                    return jqVar7;
                                }
                            } else if (k(jqVar6)) {
                                return jqVar6;
                            }
                        } else if (j(jqVar5)) {
                            return jqVar5;
                        }
                    } else if (i(jqVar4)) {
                        return jqVar4;
                    }
                } else if (h(jqVar3)) {
                    return jqVar3;
                }
            } else if (f(jqVar2)) {
                return jqVar2;
            }
        } else if (d(jqVar)) {
            return jqVar;
        }
        return jq.Other;
    }

    public static void c(jq jqVar, String str) {
        Matcher matcher = Pattern.compile("([\\d.]+)[^\\d]*").matcher(str);
        if (matcher.find()) {
            try {
                String strGroup = matcher.group(1);
                jqVar.a(strGroup);
                jqVar.a(Integer.parseInt(strGroup.split(z.f14007a)[0]));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static boolean d(jq jqVar) {
        if (TextUtils.isEmpty(e("ro.miui.ui.version.name"))) {
            return false;
        }
        String strE = e("ro.build.version.incremental");
        c(jqVar, strE);
        jqVar.b(strE);
        return true;
    }

    public static String e(String str) {
        Properties properties = f20721b;
        String property = null;
        if (properties != null) {
            property = properties.getProperty("[" + str + "]", null);
        }
        return TextUtils.isEmpty(property) ? g(str) : property.replace("[", "").replace("]", "");
    }

    public static boolean f(jq jqVar) {
        String strE = e("ro.flyme.published");
        String strE2 = e("ro.meizu.setupwizard.flyme");
        if (TextUtils.isEmpty(strE) && TextUtils.isEmpty(strE2)) {
            return false;
        }
        String strE3 = e("ro.build.display.id");
        c(jqVar, strE3);
        jqVar.b(strE3);
        return true;
    }

    public static String g(String str) throws Throwable {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("getprop ".concat(String.valueOf(str))).getInputStream()), 1024);
            try {
                String line = bufferedReader.readLine();
                bufferedReader.close();
                try {
                    bufferedReader.close();
                } catch (IOException unused) {
                }
                return line;
            } catch (IOException unused2) {
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException unused3) {
                    }
                }
                return null;
            } catch (Throwable th) {
                th = th;
                bufferedReader2 = bufferedReader;
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (IOException unused5) {
            bufferedReader = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static boolean h(jq jqVar) {
        String strE = e("ro.build.version.emui");
        if (TextUtils.isEmpty(strE)) {
            return false;
        }
        c(jqVar, strE);
        jqVar.b(strE);
        return true;
    }

    public static boolean i(jq jqVar) {
        String strE = e("ro.build.version.opporom");
        if (TextUtils.isEmpty(strE)) {
            return false;
        }
        c(jqVar, strE);
        jqVar.b(strE);
        return true;
    }

    public static boolean j(jq jqVar) {
        String strE = e("ro.vivo.os.build.display.id");
        if (TextUtils.isEmpty(strE)) {
            return false;
        }
        c(jqVar, strE);
        jqVar.b(strE);
        return true;
    }

    public static boolean k(jq jqVar) {
        String strE = e("ro.smartisan.version");
        if (TextUtils.isEmpty(strE)) {
            return false;
        }
        c(jqVar, strE);
        jqVar.b(strE);
        return true;
    }

    public static boolean l(jq jqVar) {
        String strE = e("ro.build.display.id");
        if (TextUtils.isEmpty(strE) || !strE.matches("amigo([\\d.]+)[a-zA-Z]*")) {
            return false;
        }
        c(jqVar, strE);
        jqVar.b(strE);
        return true;
    }

    public static boolean m(jq jqVar) {
        String strE = e("ro.letv.release.version");
        if (TextUtils.isEmpty(strE)) {
            return false;
        }
        c(jqVar, strE);
        jqVar.b(strE);
        return true;
    }

    public static boolean n(jq jqVar) {
        String strE = e("ro.build.sense.version");
        if (TextUtils.isEmpty(strE)) {
            return false;
        }
        c(jqVar, strE);
        jqVar.b(strE);
        return true;
    }

    public static boolean o(jq jqVar) {
        String strE = e("sys.lge.lgmdm_version");
        if (TextUtils.isEmpty(strE)) {
            return false;
        }
        c(jqVar, strE);
        jqVar.b(strE);
        return true;
    }

    public static boolean p(jq jqVar) {
        if (!"android-google".equals(e("ro.com.google.clientidbase"))) {
            return false;
        }
        String strE = e("ro.build.version.release");
        jqVar.a(Build.VERSION.SDK_INT);
        jqVar.b(strE);
        return true;
    }

    public static boolean q(jq jqVar) {
        String strE = e("ro.build.nubia.rom.code");
        if (TextUtils.isEmpty(strE)) {
            return false;
        }
        c(jqVar, strE);
        jqVar.b(strE);
        return true;
    }
}
