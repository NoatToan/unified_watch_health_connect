package com.xmlywind.devicehelper.oaId.helpers;

import android.content.Context;
import com.xmlywind.logger.SigmobLog;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes22.dex */
public class j {
    private Context a;
    private Class b;
    private Object c;
    private Method d;

    public j(Context context) {
        try {
            Class<?> cls = Class.forName("com.android.id.impl.IdProviderImpl");
            this.b = cls;
            this.c = cls.newInstance();
            this.a = context;
            this.d = this.b.getMethod("getOAID", Context.class);
        } catch (Exception e) {
            SigmobLog.e(e.getMessage());
        }
    }

    private String a(Context context, Method method) {
        Object obj = this.c;
        if (obj != null && method != null) {
            try {
                return (String) method.invoke(obj, context);
            } catch (Exception e) {
                SigmobLog.e(e.getMessage());
            }
        }
        return null;
    }

    public String a() {
        return a(this.a, this.d);
    }
}
