package com.amap.api.mapcore.util;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class be {
    private Context a;

    public be(Context context) {
        this.a = context;
    }

    private static boolean a(String str, Context context, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String strB = er.b(context);
        try {
            File file = new File(strB + str2 + str + ".dat");
            if (file.exists() && !bv.b(file)) {
                return false;
            }
            try {
                bv.a(strB + str2);
                bv.a(str, context);
                return true;
            } catch (IOException e) {
                e.printStackTrace();
                return false;
            } catch (Exception e2) {
                e2.printStackTrace();
                return false;
            }
        } catch (IOException e3) {
            e3.printStackTrace();
            return false;
        } catch (Exception e4) {
            e4.printStackTrace();
            return false;
        }
    }

    private static boolean b(String str, Context context, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String strA = er.a(context);
        try {
            File file = new File(strA + str2 + str);
            if (file.exists() && !bv.b(file)) {
                return false;
            }
            try {
                bv.a(strA + str2);
                bv.a(str, context);
                return true;
            } catch (IOException e) {
                e.printStackTrace();
                return false;
            } catch (Exception e2) {
                e2.printStackTrace();
                return false;
            }
        } catch (IOException e3) {
            e3.printStackTrace();
            return false;
        } catch (Exception e4) {
            e4.printStackTrace();
            return false;
        }
    }

    public final void a(ax axVar) {
        if (axVar != null) {
            String pinyin = axVar.getPinyin();
            boolean zA = a(pinyin, this.a, "vmap/");
            if (pinyin.equals("quanguogaiyaotu")) {
                pinyin = "quanguo";
            }
            boolean z = true;
            boolean z2 = a(pinyin, this.a, "map/") || zA;
            if (!b(bv.b(axVar.getUrl()), this.a, "map/") && !z2) {
                z = false;
            }
            if (z) {
                axVar.l.a();
                if (axVar.n) {
                    axVar.l.h();
                }
                axVar.n = false;
                return;
            }
            axVar.l.a(axVar.k.b());
        }
    }
}
