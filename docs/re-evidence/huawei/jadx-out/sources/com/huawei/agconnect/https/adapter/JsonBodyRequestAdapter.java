package com.huawei.agconnect.https.adapter;

import com.huawei.agconnect.https.Adapter;
import com.huawei.agconnect.https.annotation.Body;
import java.io.IOException;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedAction;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import org.json.JSONException;

/* JADX INFO: loaded from: classes22.dex */
public class JsonBodyRequestAdapter<Request> implements Adapter<Request, RequestBody> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final MediaType f5031a = MediaType.parse("application/json; charset=UTF-8");

    /* JADX WARN: Code duplicated, block: B:13:0x0028 A[Catch: JSONException -> 0x003b, IllegalAccessException -> 0x0054, PHI: r2 r3
      0x0028: PHI (r2v2 java.lang.String) = (r2v1 java.lang.String), (r2v6 java.lang.String) binds: [B:4:0x000c, B:11:0x0025] A[DONT_GENERATE, DONT_INLINE]
      0x0028: PHI (r3v2 boolean) = (r3v1 boolean), (r3v3 boolean) binds: [B:4:0x000c, B:11:0x0025] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #2 {IllegalAccessException -> 0x0054, JSONException -> 0x003b, blocks: (B:2:0x0000, B:3:0x0007, B:5:0x000e, B:7:0x0012, B:9:0x001c, B:10:0x0022, B:13:0x0028), top: B:27:0x0000 }] */
    @Override // com.huawei.agconnect.https.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public RequestBody adapter(Request request) throws IOException {
        try {
            Class<?> superclass = request.getClass();
            String strA = null;
            boolean z = false;
            do {
                Field[] declaredFields = superclass.getDeclaredFields();
                if (declaredFields.length > 0) {
                    for (Field field : declaredFields) {
                        if (field.isAnnotationPresent(Body.class)) {
                            strA = a(field, request);
                            z = true;
                            break;
                        }
                    }
                    if (z) {
                        break;
                    }
                    superclass = superclass.getSuperclass();
                } else {
                    superclass = superclass.getSuperclass();
                }
            } while (superclass != Object.class);
            MediaType mediaType = f5031a;
            if (strA == null) {
                strA = "{}";
            }
            return RequestBody.create(mediaType, strA);
        } catch (IllegalAccessException e) {
            throw new IOException("catch IllegalAccessException:" + e.getMessage());
        } catch (JSONException e2) {
            throw new IOException("catch JSONException:" + e2.getMessage());
        }
    }

    public final String a(final Field field, Request request) throws IllegalAccessException, JSONException {
        if (!field.isAccessible()) {
            AccessController.doPrivileged(new PrivilegedAction() { // from class: com.huawei.agconnect.https.adapter.JsonBodyRequestAdapter.1
                @Override // java.security.PrivilegedAction
                public Object run() {
                    field.setAccessible(true);
                    return null;
                }
            });
        }
        Object obj = field.get(request);
        if (obj == null) {
            return null;
        }
        return new JSONEncodeUtil(false).toJson(obj);
    }
}
