package com.weibo.ssosdk.oaid.helpers;

import android.content.Context;
import com.weibo.ssosdk.AppUtils;
import com.xiaomi.hm.health.training.utils.AndroidManufacturerUtils;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes18.dex */
public class XiaomiDeviceIDHelper {
    private Context a;
    private Class b;
    private Object c;
    private Method d;
    private Method e;
    private Method f;
    private Method g;

    public XiaomiDeviceIDHelper(Context context) {
        this.a = context;
        try {
            Class<?> cls = Class.forName("com.android.id.impl.IdProviderImpl");
            this.b = cls;
            this.c = cls.newInstance();
        } catch (Exception unused) {
        }
        try {
            this.d = this.b.getMethod("getDefaultUDID", Context.class);
        } catch (Exception unused2) {
        }
        try {
            this.e = this.b.getMethod("getOAID", Context.class);
        } catch (Exception unused3) {
        }
        try {
            this.f = this.b.getMethod("getVAID", Context.class);
        } catch (Exception unused4) {
        }
        try {
            this.g = this.b.getMethod("getAAID", Context.class);
        } catch (Exception unused5) {
        }
    }

    private String a(Context context, Method method) {
        Object obj = this.c;
        if (obj == null || method == null) {
            return "";
        }
        try {
            String str = (String) method.invoke(obj, context);
            return str == null ? "" : str;
        } catch (Exception unused) {
            return "";
        }
    }

    public String getAAID() {
        try {
            String strA = a(this.a, this.g);
            AppUtils.saveOadi(this.a, AndroidManufacturerUtils.MANUFACTURE_XIAOMI, "aaid", strA);
            return strA;
        } catch (Exception unused) {
            return "";
        }
    }

    public String getOAID() {
        try {
            String strA = a(this.a, this.e);
            AppUtils.saveOadi(this.a, AndroidManufacturerUtils.MANUFACTURE_XIAOMI, "oaid", strA);
            return strA;
        } catch (Exception unused) {
            return "";
        }
    }

    public String getUDID() {
        try {
            String strA = a(this.a, this.d);
            AppUtils.saveOadi(this.a, AndroidManufacturerUtils.MANUFACTURE_XIAOMI, "udid", strA);
            return strA;
        } catch (Exception unused) {
            return "";
        }
    }

    public String getVAID() {
        try {
            String strA = a(this.a, this.f);
            AppUtils.saveOadi(this.a, AndroidManufacturerUtils.MANUFACTURE_XIAOMI, "vaid", strA);
            return strA;
        } catch (Exception unused) {
            return "";
        }
    }
}
