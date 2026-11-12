package com.huawei.hms.support.hwid.common.e;

import android.content.Context;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes34.dex */
public class f {
    public static int a(Context context, String str, String str2) {
        try {
            int identifier = context.getResources().getIdentifier(str2, str, context.getPackageName());
            if (identifier != 0) {
                return identifier;
            }
            Field field = Class.forName(context.getPackageName() + ".R$" + str).getField(str2);
            int i = Integer.parseInt(field.get(field.getName()).toString());
            if (i == 0) {
                e.a("ResourceLoader", "resourceId == 0");
            }
            return i;
        } catch (ClassNotFoundException unused) {
            e.b("ResourceLoader", "!!!! ResourceLoader: reflect resource ClassNotFoundException");
            return 0;
        } catch (IllegalAccessException unused2) {
            e.b("ResourceLoader", "!!!! ResourceLoader: reflect resource IllegalAccessException");
            return 0;
        } catch (IllegalArgumentException unused3) {
            e.b("ResourceLoader", "!!!! ResourceLoader: reflect resource IllegalArgumentException");
            return 0;
        } catch (RuntimeException unused4) {
            e.b("ResourceLoader", "!!!! ResourceLoader: reflect resource RuntimeException");
            return 0;
        } catch (Exception unused5) {
            e.b("ResourceLoader", "!!!! ResourceLoader: reflect resource Exception");
            return 0;
        } catch (LinkageError unused6) {
            e.b("ResourceLoader", "!!!! ResourceLoader: reflect resource LinkageError");
            return 0;
        } catch (NumberFormatException unused7) {
            e.b("ResourceLoader", "!!!! ResourceLoader: reflect resource NumberFormatException");
            return 0;
        }
    }

    public static int a(Context context, String str) {
        return a(context, "xml", str);
    }
}
