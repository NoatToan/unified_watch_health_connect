package com.huawei.agconnect.credential.internal;

import android.content.Context;
import com.huawei.agconnect.AGConnectInstance;

/* JADX INFO: loaded from: classes3.dex */
public class BaseContext {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f4974b = "4D5480E9";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final BaseContext f4975c = new BaseContext();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f4976a;

    public Context a() {
        if (this.f4976a == null) {
            this.f4976a = AGConnectInstance.getInstance().getContext();
        }
        return this.f4976a;
    }

    public static String d() {
        return "80fedfd8941a368fafdae46750a4d367";
    }

    public static String c() {
        return "1C4DE4EC";
    }

    public static BaseContext b() {
        return f4975c;
    }

    public static void a(Context context) {
        synchronized (BaseContext.class) {
            Context applicationContext = context.getApplicationContext();
            BaseContext baseContext = f4975c;
            if (applicationContext != null) {
                context = applicationContext;
            }
            baseContext.f4976a = context;
        }
    }

    private BaseContext() {
    }
}
