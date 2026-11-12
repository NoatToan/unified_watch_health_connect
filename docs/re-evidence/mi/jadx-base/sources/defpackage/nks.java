package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.miui.tsmclient.util.Constants;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public abstract class nks {

    public static class a extends jks {
        public a() {
            super(1);
        }

        @Override // defpackage.jks
        public String b(Context context, String str, List<kbs> list) {
            if (list == null) {
                return obs.k(context, new URL(str));
            }
            Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
            for (kbs kbsVar : list) {
                builderBuildUpon.appendQueryParameter(kbsVar.a(), kbsVar.b());
            }
            return obs.k(context, new URL(builderBuildUpon.toString()));
        }
    }

    public static int a(int i, int i2) {
        return (((i2 + 243) / 1448) * 132) + Constants.FHD_WIDTH + i + i2;
    }

    public static int b(int i, int i2, int i3) {
        return (((i2 + 200) / 1448) * 132) + 1011 + i2 + i + i3;
    }

    public static int c(jks jksVar, String str, List<kbs> list, String str2) {
        if (jksVar.a() == 1) {
            return a(str.length(), d(str2));
        }
        if (jksVar.a() != 2) {
            return -1;
        }
        return b(str.length(), e(list), d(str2));
    }

    public static int d(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            return str.getBytes("UTF-8").length;
        } catch (UnsupportedEncodingException unused) {
            return 0;
        }
    }

    public static int e(List<kbs> list) {
        int length = 0;
        for (kbs kbsVar : list) {
            if (!TextUtils.isEmpty(kbsVar.a())) {
                length += kbsVar.a().length();
            }
            if (!TextUtils.isEmpty(kbsVar.b())) {
                length += kbsVar.b().length();
            }
        }
        return length * 2;
    }

    public static String f(Context context, String str, List<kbs> list) {
        return g(context, str, list, new a(), true);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00ad A[Catch: MalformedURLException -> 0x0026, TRY_ENTER, TryCatch #3 {MalformedURLException -> 0x0026, blocks: (B:4:0x000f, B:6:0x0016, B:8:0x0020, B:13:0x002a, B:15:0x0030, B:16:0x0033, B:17:0x0038, B:19:0x003e, B:21:0x0047, B:23:0x004f, B:50:0x00ad, B:51:0x00bf), top: B:62:0x000f }] */
    public static String g(Context context, String str, List<kbs> list, jks jksVar, boolean z) {
        mis misVar;
        IOException iOException;
        String str2;
        String str3;
        if (obs.v(context)) {
            try {
                ArrayList<String> arrayList = new ArrayList<>();
                if (z) {
                    mis misVarA = wjs.c().a(str);
                    if (misVarA != null) {
                        arrayList = misVarA.d(str);
                    }
                    misVar = misVarA;
                } else {
                    misVar = null;
                }
                if (!arrayList.contains(str)) {
                    arrayList.add(str);
                }
                String str4 = null;
                for (String str5 : arrayList) {
                    ArrayList arrayList2 = list != null ? new ArrayList(list) : null;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    try {
                        if (!jksVar.c(context, str5, arrayList2)) {
                            return str4;
                        }
                        String strB = jksVar.b(context, str5, arrayList2);
                        try {
                            if (!TextUtils.isEmpty(strB)) {
                                if (misVar != null) {
                                    try {
                                        misVar.l(str5, System.currentTimeMillis() - jCurrentTimeMillis, c(jksVar, str5, arrayList2, strB));
                                    } catch (IOException e) {
                                        iOException = e;
                                        str2 = strB;
                                    }
                                }
                                return strB;
                            }
                            if (misVar != null) {
                                str3 = strB;
                                try {
                                    misVar.m(str5, System.currentTimeMillis() - jCurrentTimeMillis, c(jksVar, str5, arrayList2, strB), null);
                                } catch (IOException e2) {
                                    e = e2;
                                    String str6 = str3;
                                    iOException = e;
                                    str2 = str6;
                                    if (misVar != null) {
                                        misVar.m(str5, System.currentTimeMillis() - jCurrentTimeMillis, c(jksVar, str5, arrayList2, str2), iOException);
                                    }
                                    iOException.printStackTrace();
                                    str4 = str2;
                                }
                            } else {
                                str3 = strB;
                            }
                            str4 = str3;
                        } catch (IOException e3) {
                            e = e3;
                            str3 = strB;
                        }
                        String str7 = str3;
                        iOException = e;
                        str2 = str7;
                    } catch (IOException e4) {
                        iOException = e4;
                        str2 = str4;
                    }
                    if (misVar != null) {
                        misVar.m(str5, System.currentTimeMillis() - jCurrentTimeMillis, c(jksVar, str5, arrayList2, str2), iOException);
                    }
                    iOException.printStackTrace();
                    str4 = str2;
                }
                return str4;
            } catch (MalformedURLException e5) {
                e5.printStackTrace();
            }
        }
        return null;
    }
}
