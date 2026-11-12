package com.amap.api.col.p0003sl;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class bi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f2270a;

    public bi(Context context) {
        this.f2270a = context;
    }

    public final void a(bb bbVar) {
        b(bbVar);
    }

    private boolean b(bb bbVar) {
        if (bbVar != null) {
            String pinyin = bbVar.getPinyin();
            boolean zA = a(pinyin, this.f2270a, "vmap/");
            if (pinyin.equals("quanguogaiyaotu")) {
                pinyin = "quanguo";
            }
            boolean z = true;
            boolean z2 = a(pinyin, this.f2270a, "map/") || zA;
            if (!b(bz.b(bbVar.getUrl()), this.f2270a, "map/") && !z2) {
                z = false;
            }
            if (z) {
                bbVar.i();
                return z;
            }
            bbVar.h();
        }
        return false;
    }

    private static boolean a(String str, Context context, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String strB = eb.b(context);
        try {
            File file = new File(strB + str2 + str + ".dat");
            if (file.exists() && !bz.b(file)) {
                return false;
            }
            try {
                bz.a(strB + str2);
                bz.b(str, context);
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
        String strA = eb.a(context);
        try {
            File file = new File(strA + str2 + str);
            if (file.exists() && !bz.b(file)) {
                return false;
            }
            try {
                bz.a(strA + str2);
                bz.b(str, context);
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
}
