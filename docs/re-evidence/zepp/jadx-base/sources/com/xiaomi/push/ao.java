package com.xiaomi.push;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.huami.widget.wheelview.Constant;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public abstract class ao {

    public static class a extends an {
        public a() {
            super(1);
        }

        @Override // com.xiaomi.push.an
        public String a(Context context, String str, List<x> list) {
            URL url;
            if (list == null) {
                url = new URL(str);
            } else {
                Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
                for (x xVar : list) {
                    builderBuildUpon.appendQueryParameter(xVar.a(), xVar.b());
                }
                url = new URL(builderBuildUpon.toString());
            }
            return y.a(context, url);
        }
    }

    public static int a(int i, int i2) {
        return (((i2 + Constant.HEIGHT_MAX) / 1448) * 132) + 1080 + i + i2;
    }

    public static String a(Context context, String str, List<x> list) {
        return a(context, str, list, new a(), true);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00aa A[Catch: MalformedURLException -> 0x00c3, TRY_ENTER, TryCatch #4 {MalformedURLException -> 0x00c3, blocks: (B:4:0x000f, B:6:0x0016, B:8:0x0020, B:11:0x0027, B:13:0x002d, B:14:0x0030, B:15:0x0035, B:17:0x003b, B:19:0x0044, B:21:0x004c, B:49:0x00aa, B:50:0x00bc), top: B:64:0x000f }] */
    public static String a(Context context, String str, List<x> list, an anVar, boolean z) {
        ag agVar;
        IOException iOException;
        String str2;
        String str3;
        if (y.m3842a(context)) {
            try {
                ArrayList<String> arrayList = new ArrayList<>();
                if (z) {
                    ag agVarA = ak.a().a(str);
                    if (agVarA != null) {
                        arrayList = agVarA.a(str);
                    }
                    agVar = agVarA;
                } else {
                    agVar = null;
                }
                if (!arrayList.contains(str)) {
                    arrayList.add(str);
                }
                String str4 = null;
                for (String str5 : arrayList) {
                    ArrayList arrayList2 = list != null ? new ArrayList(list) : null;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    try {
                        if (!anVar.m3505a(context, str5, (List<x>) arrayList2)) {
                            return str4;
                        }
                        String strA = anVar.a(context, str5, (List<x>) arrayList2);
                        try {
                            if (!TextUtils.isEmpty(strA)) {
                                if (agVar != null) {
                                    try {
                                        agVar.a(str5, System.currentTimeMillis() - jCurrentTimeMillis, c(anVar, str5, arrayList2, strA));
                                    } catch (IOException e) {
                                        iOException = e;
                                        str2 = strA;
                                    }
                                }
                                return strA;
                            }
                            if (agVar != null) {
                                str3 = strA;
                                try {
                                    agVar.a(str5, System.currentTimeMillis() - jCurrentTimeMillis, c(anVar, str5, arrayList2, strA), null);
                                } catch (IOException e2) {
                                    e = e2;
                                    String str6 = str3;
                                    iOException = e;
                                    str2 = str6;
                                    if (agVar != null) {
                                        agVar.a(str5, System.currentTimeMillis() - jCurrentTimeMillis, c(anVar, str5, arrayList2, str2), iOException);
                                    }
                                    iOException.printStackTrace();
                                    str4 = str2;
                                }
                            } else {
                                str3 = strA;
                            }
                            str4 = str3;
                        } catch (IOException e3) {
                            e = e3;
                            str3 = strA;
                        }
                        String str7 = str3;
                        iOException = e;
                        str2 = str7;
                    } catch (IOException e4) {
                        iOException = e4;
                        str2 = str4;
                    }
                    if (agVar != null) {
                        agVar.a(str5, System.currentTimeMillis() - jCurrentTimeMillis, c(anVar, str5, arrayList2, str2), iOException);
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

    public static int b(int i, int i2, int i3) {
        return (((i2 + 200) / 1448) * 132) + 1011 + i2 + i + i3;
    }

    private static int c(an anVar, String str, List<x> list, String str2) {
        if (anVar.a() == 1) {
            return a(str.length(), d(str2));
        }
        if (anVar.a() != 2) {
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

    public static int e(List<x> list) {
        int length = 0;
        for (x xVar : list) {
            if (!TextUtils.isEmpty(xVar.a())) {
                length += xVar.a().length();
            }
            if (!TextUtils.isEmpty(xVar.b())) {
                length += xVar.b().length();
            }
        }
        return length * 2;
    }
}
