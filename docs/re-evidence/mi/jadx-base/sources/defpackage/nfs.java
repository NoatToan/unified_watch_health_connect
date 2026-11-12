package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.push.Cif;
import com.xiaomi.push.i;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes11.dex */
public class nfs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f27894a = new Object();

    public static void a(Context context, Cif cif) {
        if (jfs.f(cif.e())) {
            k5s.a(context).g(new qfs(context, cif));
        }
    }

    public static byte[] b(Context context) {
        String strC = u8t.d(context).c("mipush", "td_key", "");
        if (TextUtils.isEmpty(strC)) {
            strC = qcs.a(20);
            u8t.d(context).e("mipush", "td_key", strC);
        }
        return c(strC);
    }

    public static byte[] c(String str) {
        byte[] bArrCopyOf = Arrays.copyOf(ecs.b(str), 16);
        bArrCopyOf[0] = 68;
        bArrCopyOf[15] = 84;
        return bArrCopyOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.io.Closeable] */
    public static void e(Context context, Cif cif) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        BufferedOutputStream bufferedOutputStream2;
        ?? B = b(context);
        try {
            try {
                byte[] bArrC = hxs.c(B, i.e(cif));
                if (bArrC == null || bArrC.length < 1) {
                    x9s.o("TinyData write to cache file failed case encryption fail item:" + cif.d() + "  ts:" + System.currentTimeMillis());
                } else {
                    if (bArrC.length <= 30720) {
                        BufferedOutputStream bufferedOutputStream3 = new BufferedOutputStream(new FileOutputStream(new File(context.getFilesDir(), "tiny_data.data"), true));
                        try {
                            bufferedOutputStream3.write(j4s.b(bArrC.length));
                            bufferedOutputStream3.write(bArrC);
                            bufferedOutputStream3.flush();
                            mgt.b(null);
                            mgt.b(bufferedOutputStream3);
                            return;
                        } catch (IOException e) {
                            bufferedOutputStream2 = bufferedOutputStream3;
                            e = e;
                            x9s.q("TinyData write to cache file failed cause io exception item:" + cif.d(), e);
                            B = bufferedOutputStream2;
                            mgt.b(null);
                            mgt.b(B);
                            return;
                        } catch (Exception e2) {
                            bufferedOutputStream = bufferedOutputStream3;
                            e = e2;
                            x9s.q("TinyData write to cache file  failed item:" + cif.d(), e);
                            B = bufferedOutputStream;
                            mgt.b(null);
                            mgt.b(B);
                            return;
                        } catch (Throwable th) {
                            B = bufferedOutputStream3;
                            th = th;
                            mgt.b(null);
                            mgt.b(B);
                            throw th;
                        }
                    }
                    x9s.o("TinyData write to cache file failed case too much data content item:" + cif.d() + "  ts:" + System.currentTimeMillis());
                }
                mgt.b(null);
                mgt.b(null);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e3) {
            e = e3;
            bufferedOutputStream2 = null;
        } catch (Exception e4) {
            e = e4;
            bufferedOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            B = 0;
        }
    }
}
