package com.huawei.agconnect.https.adapter;

import com.huawei.agconnect.https.Adapter;
import com.huawei.operation.utils.Constants;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedAction;
import okhttp3.FormBody;
import okhttp3.RequestBody;
import org.json.JSONException;

/* JADX INFO: loaded from: classes3.dex */
public class StringRequestAdapter<HttpsRequest> implements Adapter<HttpsRequest, RequestBody> {
    public final void a(Field field, FormBody.Builder builder, HttpsRequest httpsrequest) {
        try {
            String strValue = ((com.huawei.agconnect.https.annotation.Field) field.getAnnotation(com.huawei.agconnect.https.annotation.Field.class)).value();
            if (strValue == null || strValue.isEmpty()) {
                strValue = field.getName();
            }
            builder.addEncoded(strValue, a(field, httpsrequest));
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (JSONException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // com.huawei.agconnect.https.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public RequestBody adapter(HttpsRequest httpsrequest) {
        FormBody.Builder builder = new FormBody.Builder();
        Class<?> superclass = httpsrequest.getClass();
        do {
            Field[] declaredFields = superclass.getDeclaredFields();
            if (declaredFields.length > 0) {
                for (Field field : declaredFields) {
                    if (field.isAnnotationPresent(com.huawei.agconnect.https.annotation.Field.class)) {
                        a(field, builder, httpsrequest);
                    }
                }
            }
            superclass = superclass.getSuperclass();
        } while (superclass != Object.class);
        return builder.build();
    }

    public final String a(final Field field, HttpsRequest httpsrequest) throws IllegalAccessException, JSONException {
        if (!field.isAccessible()) {
            AccessController.doPrivileged(new PrivilegedAction() { // from class: com.huawei.agconnect.https.adapter.StringRequestAdapter.1
                @Override // java.security.PrivilegedAction
                public Object run() {
                    field.setAccessible(true);
                    return null;
                }
            });
        }
        Class<?> type = field.getType();
        Object obj = field.get(httpsrequest);
        if (c(type)) {
            return obj == null ? "0" : String.valueOf(obj);
        }
        if (b(type)) {
            return obj == null ? "0" : String.valueOf(obj);
        }
        if (a((Class) type)) {
            return obj == null ? "false" : String.valueOf(obj);
        }
        if (d(type)) {
            return obj == null ? "0" : String.valueOf(obj);
        }
        if (type == String.class) {
            return obj == null ? Constants.NULL : String.valueOf(obj);
        }
        return new JSONEncodeUtil().toJson(field.get(httpsrequest));
    }

    public static boolean d(Class cls) {
        return cls == Long.TYPE || cls == Long.class;
    }

    public static boolean c(Class cls) {
        return cls == Integer.TYPE || cls == Integer.class;
    }

    public static boolean b(Class cls) {
        return cls == Double.TYPE || cls == Double.class || cls == Float.TYPE || cls == Float.class;
    }

    public static boolean a(Class cls) {
        return cls == Boolean.TYPE || cls == Boolean.class;
    }
}
