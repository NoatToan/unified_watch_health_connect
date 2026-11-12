package com.xmlywind.devicehelper.oaId.helpers;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.xiaomi.hm.health.training.utils.AndroidManufacturerUtils;
import com.xmlywind.logger.SigmobLog;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* JADX INFO: loaded from: classes22.dex */
public class DevicesIDsHelper {
    private static AppIdsUpdater a = null;
    private static int c = -1;
    private static int d;
    private AppIdsUpdater b;

    public interface AppIdsUpdater {
        void OnIdsAvalid(String str);
    }

    public static class IdentifyListenerHandler implements InvocationHandler {
        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            Class<?> cls;
            try {
                if (!"OnSupport".equals(method.getName()) || !((Boolean) objArr[0]).booleanValue()) {
                    return null;
                }
                try {
                    try {
                        cls = Class.forName("com.bun.miitmdid.supplier.IdSupplier");
                    } catch (ClassNotFoundException unused) {
                        cls = Class.forName("com.bun.miitmdid.interfaces.IdSupplier");
                    }
                } catch (ClassNotFoundException unused2) {
                    cls = Class.forName("com.bun.supplier.IdSupplier");
                }
                String str = (String) cls.getDeclaredMethod("getOAID", new Class[0]).invoke(objArr[1], new Object[0]);
                if (DevicesIDsHelper.a != null && !TextUtils.isEmpty(str)) {
                    DevicesIDsHelper.a.OnIdsAvalid(str);
                }
                SigmobLog.e("oaid:" + str);
                return null;
            } catch (Exception unused3) {
                return null;
            }
        }
    }

    private static String a(String str) {
        if (str == null) {
            return null;
        }
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, "unknown");
        } catch (Exception unused) {
            return null;
        }
    }

    private static void a(Context context) throws ClassNotFoundException {
        Class<?> cls;
        StringBuilder sb;
        String str;
        try {
            Class<?> cls2 = Class.forName("com.bun.miitmdid.core.JLibrary");
            Field field = cls2.getField("classLoader");
            if (field.get(cls2) == null) {
                cls2.getMethod("InitEntry", Context.class).invoke(cls2, context);
                SigmobLog.e("field:" + field);
            }
        } catch (Exception unused) {
        }
        try {
            try {
                cls = Class.forName("com.bun.miitmdid.core.IIdentifierListener");
            } catch (ClassNotFoundException unused2) {
                cls = Class.forName("com.bun.miitmdid.interfaces.IIdentifierListener");
            }
        } catch (ClassNotFoundException unused3) {
            cls = Class.forName("com.bun.supplier.IIdentifierListener");
        }
        int iIntValue = ((Integer) Class.forName("com.bun.miitmdid.core.MdidSdkHelper").getDeclaredMethod("InitSdk", Context.class, Boolean.TYPE, cls).invoke(null, context, Boolean.TRUE, Proxy.newProxyInstance(context.getClassLoader(), new Class[]{cls}, new IdentifyListenerHandler()))).intValue();
        c = iIntValue;
        if (iIntValue != 0) {
            String strValueOf = String.valueOf(iIntValue);
            if (strValueOf.equals("1008614")) {
                sb = new StringBuilder();
                str = "msa sdk error: ";
            } else {
                sb = new StringBuilder();
                str = "无法获取OAID,请确保应用正确集成OAID: ";
            }
            sb.append(str);
            sb.append(strValueOf);
            SigmobLog.e(sb.toString());
        }
    }

    private void a(final Context context, final String str) {
        new Thread(new Runnable() { // from class: com.xmlywind.devicehelper.oaId.helpers.DevicesIDsHelper.1
            @Override // java.lang.Runnable
            public void run() {
                if ("ASUS".equals(str)) {
                    new a(context).a(DevicesIDsHelper.this.b);
                    return;
                }
                if (AndroidManufacturerUtils.MANUFACTURE_HUAWEI.equals(str)) {
                    new b(context).a(DevicesIDsHelper.this.b);
                    return;
                }
                if ("OPPO".equals(str)) {
                    new g(context).a(DevicesIDsHelper.this.b);
                    return;
                }
                if ("LENOVO".equals(str) || "MOTOLORA".equals(str)) {
                    c cVar = new c(context);
                    cVar.a(DevicesIDsHelper.this.b);
                    return;
                }
                if ("MEIZU".equals(str)) {
                    new d(context).a(DevicesIDsHelper.this.b);
                    return;
                }
                if (AndroidManufacturerUtils.MANUFACTURE_SAMSUNG.equals(str)) {
                    new h(context).a(DevicesIDsHelper.this.b);
                } else if ("ONEPLUS".equals(str)) {
                    new f(context).a(DevicesIDsHelper.this.b);
                } else {
                    k kVar = ("ZTE".equals(str) || "FERRMEOS".equals(str) || DevicesIDsHelper.a() || "SSUI".equals(str) || !DevicesIDsHelper.b()) ? new k(context) : new k(context);
                    kVar.a(DevicesIDsHelper.this.b);
                }
            }
        }).start();
    }

    public static boolean a() {
        String strA = a("ro.build.freeme.label");
        return !TextUtils.isEmpty(strA) && strA.equalsIgnoreCase("FREEMEOS");
    }

    public static void b(Context context, AppIdsUpdater appIdsUpdater) {
        try {
            a = appIdsUpdater;
            try {
                a(context);
            } catch (Throwable th) {
                SigmobLog.e("getOAID error " + th.getMessage());
            }
        } catch (Exception e) {
            SigmobLog.e(e.getMessage());
        }
    }

    public static boolean b() {
        String strA = a("ro.ssui.product");
        return (TextUtils.isEmpty(strA) || strA.equalsIgnoreCase("unknown")) ? false : true;
    }

    private static String d() {
        return Build.MANUFACTURER.toUpperCase();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0036  */
    public void a(Context context, AppIdsUpdater appIdsUpdater) {
        String strA;
        int i = d;
        if (i > 10) {
            return;
        }
        d = i + 1;
        this.b = appIdsUpdater;
        SigmobLog.d("getManufacturer ===> " + d());
        String upperCase = d().toUpperCase();
        if ("ASUS".equals(upperCase) || AndroidManufacturerUtils.MANUFACTURE_HUAWEI.equals(upperCase) || "LENOVO".equals(upperCase) || "MOTOLORA".equals(upperCase) || "MEIZU".equals(upperCase)) {
            a(context, upperCase);
            strA = null;
        } else if ("NUBIA".equals(upperCase)) {
            strA = new e(context).a();
        } else if ("OPPO".equals(upperCase) || AndroidManufacturerUtils.MANUFACTURE_SAMSUNG.equals(upperCase)) {
            a(context, upperCase);
            strA = null;
        } else if ("VIVO".equals(upperCase)) {
            strA = new i(context).a();
        } else if (AndroidManufacturerUtils.MANUFACTURE_XIAOMI.equals(upperCase) || "BLACKSHARK".equals(upperCase)) {
            j jVar = new j(context);
            strA = jVar.a();
        } else {
            if (!"ONEPLUS".equals(upperCase) && !"ZTE".equals(upperCase) && !"FERRMEOS".equals(upperCase) && !a() && !"SSUI".equals(upperCase)) {
                b();
            }
            a(context, upperCase);
            strA = null;
        }
        AppIdsUpdater appIdsUpdater2 = this.b;
        if (appIdsUpdater2 != null) {
            appIdsUpdater2.OnIdsAvalid(strA);
        }
    }
}
