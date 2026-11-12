package vg;

import android.content.Context;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes7.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f178061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class<?> f178062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Method f178063c;

    static {
        try {
            Class<?> cls = Class.forName("com.android.id.impl.IdProviderImpl");
            f178062b = cls;
            f178061a = cls.newInstance();
            cls.getMethod("getUDID", Context.class);
            f178063c = cls.getMethod("getOAID", Context.class);
            cls.getMethod("getVAID", Context.class);
            cls.getMethod("getAAID", Context.class);
        } catch (Exception unused) {
        }
    }
}
