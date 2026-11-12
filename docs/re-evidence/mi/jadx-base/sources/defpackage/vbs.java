package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.amap.api.col.p0003sl.bb;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class vbs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f36724a;

    public vbs(Context context) {
        this.f36724a = context;
    }

    public static boolean b(String str, Context context, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String strY = zns.Y(context);
        try {
            File file = new File(strY + str2 + str + ".dat");
            if (file.exists() && !bes.l(file)) {
                return false;
            }
            try {
                bes.h(strY + str2);
                bes.k(str, context);
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

    public static boolean d(String str, Context context, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String strV = zns.v(context);
        try {
            File file = new File(strV + str2 + str);
            if (file.exists() && !bes.l(file)) {
                return false;
            }
            try {
                bes.h(strV + str2);
                bes.k(str, context);
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

    public final void a(bb bbVar) {
        c(bbVar);
    }

    public final boolean c(bb bbVar) {
        if (bbVar != null) {
            String pinyin = bbVar.getPinyin();
            boolean zB = b(pinyin, this.f36724a, "vmap/");
            if (pinyin.equals("quanguogaiyaotu")) {
                pinyin = "quanguo";
            }
            boolean z = true;
            boolean z2 = b(pinyin, this.f36724a, "map/") || zB;
            if (!d(bes.i(bbVar.getUrl()), this.f36724a, "map/") && !z2) {
                z = false;
            }
            if (z) {
                bbVar.I();
                return z;
            }
            bbVar.H();
        }
        return false;
    }
}
