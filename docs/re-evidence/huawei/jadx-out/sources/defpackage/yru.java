package defpackage;

import android.content.Context;
import com.huawei.wisesecurity.ucs.credential.outer.NetworkCapability;
import com.huawei.wisesecurity.ucs.credential.outer.NetworkRequest;
import com.huawei.wisesecurity.ucs.credential.outer.NetworkResponse;
import com.huawei.wisesecurity.ucs_credential.o;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes20.dex */
public class yru {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f53790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o f53791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public NetworkCapability f53792c;

    public final void d(NetworkResponse networkResponse, yqw yqwVar) throws yqj {
        if (!networkResponse.isSuccessful()) {
            if (networkResponse.getCode() != 304) {
                yqi.a("KeyComponentManger", "file data update failed And statusCode = {0}", Integer.valueOf(networkResponse.getCode()));
                return;
            }
            yqi.a("KeyComponentManger", "file data has not modified!", new Object[0]);
            yqk.c(yqwVar.b(), System.currentTimeMillis(), this.f53790a);
            yrr.d(this.f53790a, yqwVar);
            return;
        }
        yrr.c(this.f53790a, networkResponse.getBody());
        Context context = this.f53790a;
        Map<String, List<String>> headers = networkResponse.getHeaders();
        yqi.c("LocalCDNFile", "Update local meta data : ucscomponent", new Object[0]);
        if (headers.containsKey("etag")) {
            yqi.c("LocalCDNFile", "Update local meta data -etag: ucscomponent", new Object[0]);
            yqk.b("ETag_ucscomponent", headers.get("etag").get(0), context);
        }
        if (headers.containsKey("last-modified")) {
            yqi.c("LocalCDNFile", "Update local meta data -last-modified: ucscomponent", new Object[0]);
            yqk.b("Last-Modified_ucscomponent", headers.get("last-modified").get(0), context);
        }
        yqk.c(yqwVar.b(), System.currentTimeMillis(), this.f53790a);
        String str = this.f53790a.createDeviceProtectedStorageContext().getFilesDir() + "/ucscomponent.jws";
        yqk.b("ucscomponent.jws", str, this.f53790a);
        String body = networkResponse.getBody();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(str));
            try {
                fileOutputStream.write(body.getBytes(StandardCharsets.UTF_8));
                fileOutputStream.close();
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            StringBuilder sbB = yql.b("Write file data failed : ");
            sbB.append(e.getMessage());
            yqi.e("KeyComponentLocalHandler", sbB.toString(), new Object[0]);
            StringBuilder sbB2 = yql.b("Write file data failed : ");
            sbB2.append(e.getMessage());
            throw new yqj(1011L, sbB2.toString());
        }
    }

    public void e(boolean z, yqw yqwVar) throws yqj {
        synchronized (this) {
            yqi.a("KeyComponentManger", "start download C1 file from Service", new Object[0]);
            try {
                Map map = new HashMap();
                if (!z) {
                    map = yqwVar.c(this.f53790a);
                }
                String strA = this.f53791b.a("ucscomponent", "ucscomponent.jws");
                yqi.a("KeyComponentManger", "updateFileFromCDN domain is {0}", strA);
                d(this.f53792c.get(new NetworkRequest(strA, map)), yqwVar);
                yqi.a("KeyComponentManger", "updateFileFromCDN OK", new Object[0]);
            } catch (IOException e) {
                StringBuilder sbB = yql.b("Update file data get IOException，exception: ");
                sbB.append(e.getMessage());
                String string = sbB.toString();
                throw yra.e("KeyComponentManger", string, new Object[0], 1010L, string);
            }
        }
    }

    public yru(Context context, o oVar, NetworkCapability networkCapability) {
        this.f53790a = context;
        this.f53792c = networkCapability;
        this.f53791b = oVar;
    }
}
