package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.wisesecurity.ucs.credential.nativelib.UcsLib;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes20.dex */
public class yrr {
    public static void c(Context context, String str) throws yqj {
        try {
            yrs yrsVar = new yrs(str);
            yqy.b(context, yrsVar);
            UcsLib.ucsUpdateRootKey(yqo.a(yrsVar.f53786c.f53788a, 0), 32);
            yqk.e("Local-C1-Version", yrsVar.f53786c.f53789b, context);
        } catch (Throwable th) {
            String strE = yqk.e("ucscomponent.jws", (String) null, context);
            if (TextUtils.isEmpty(strE) || !new File(strE).exists()) {
                yqi.a("KeyComponentLocalHandler", "tryToDeleteFile failed, file not exists.", new Object[0]);
            } else {
                try {
                    boolean zDelete = new File(strE).delete();
                    yqi.a("KeyComponentLocalHandler", zDelete ? "deleteFile success." : "deleteFile failed.", new Object[0]);
                    if (zDelete) {
                        yqk.c("Last-Query-Time_ucscomponent_ucscomponent.jws", 0L, context);
                        yqk.b("ucscomponent.jws", "", context);
                        yqk.b("ETag_ucscomponent", "", context);
                        yqk.b("Last-Modified_ucscomponent", "", context);
                    }
                } catch (Throwable th2) {
                    yqi.e("KeyComponentLocalHandler", "deleteFile failed, {0}", th2.getMessage());
                }
            }
            StringBuilder sbB = yql.b("verify jws error, ");
            sbB.append(th.getMessage());
            String string = sbB.toString();
            throw yra.e("KeyComponentLocalHandler", string, new Object[0], 1012L, string);
        }
    }

    public static void d(Context context, yqw yqwVar) throws yqj {
        String strE = yqk.e("ucscomponent.jws", (String) null, context);
        if (strE == null || !new File(strE).exists()) {
            throw new yqj(1009L, "Init component from local failed, file error");
        }
        yqi.a("KeyComponentLocalHandler", "Start init data =  component through local file", new Object[0]);
        try {
            FileInputStream fileInputStream = new FileInputStream(strE);
            try {
                c(context, yqn.c(fileInputStream, "UTF-8"));
                fileInputStream.close();
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            StringBuilder sbB = yql.b("Init data failed, msg = ");
            sbB.append(e.getMessage());
            String string = sbB.toString();
            throw yra.e("KeyComponentLocalHandler", string, new Object[0], 1009L, string);
        }
    }
}
