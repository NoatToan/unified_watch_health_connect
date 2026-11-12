package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.yrn.manager.YRNOptionsConfig;
import com.learnium.RNDeviceInfo.RNDeviceModule;
import java.lang.reflect.InvocationTargetException;
import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
public class s56 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f33312a;

    public s56(Context context) {
        this.f33312a = context;
    }

    public String a() throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        Object objInvoke = Class.forName("com.google.firebase.iid.FirebaseInstanceId").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        return (String) objInvoke.getClass().getMethod("getId", new Class[0]).invoke(objInvoke, new Object[0]);
    }

    public String b() throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        Object objInvoke = Class.forName("com.google.android.gms.iid.InstanceID").getDeclaredMethod("getInstance", Context.class).invoke(null, this.f33312a.getApplicationContext());
        return (String) objInvoke.getClass().getMethod("getId", new Class[0]).invoke(objInvoke, new Object[0]);
    }

    public String c() {
        return RNDeviceModule.getRNDISharedPreferences(this.f33312a).getString(YRNOptionsConfig.INSTANCE_ID, "unknown");
    }

    public String d() {
        String strC = c();
        if (strC != "unknown") {
            return strC;
        }
        try {
            String strA = a();
            f(strA);
            return strA;
        } catch (ClassNotFoundException unused) {
            try {
                String strB = b();
                f(strB);
                return strB;
            } catch (ClassNotFoundException unused2) {
                String strE = e();
                f(strE);
                return strE;
            } catch (IllegalAccessException | NoSuchMethodException | SecurityException | InvocationTargetException unused3) {
                System.err.println("N/A: Unsupported version of com.google.android.gms.iid in your project.");
                String strE2 = e();
                f(strE2);
                return strE2;
            }
        } catch (IllegalAccessException | NoSuchMethodException | SecurityException | InvocationTargetException unused4) {
            System.err.println("N/A: Unsupported version of com.google.firebase:firebase-iid in your project.");
            String strB2 = b();
            f(strB2);
            return strB2;
        }
    }

    public String e() {
        return UUID.randomUUID().toString();
    }

    public void f(String str) {
        SharedPreferences.Editor editorEdit = RNDeviceModule.getRNDISharedPreferences(this.f33312a).edit();
        editorEdit.putString(YRNOptionsConfig.INSTANCE_ID, str);
        editorEdit.apply();
    }
}
