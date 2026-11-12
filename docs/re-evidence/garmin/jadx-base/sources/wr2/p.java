package wr2;

import android.content.SharedPreferences;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import wn1.d0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwr2/p;", "", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f186870a = new p();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f186871b;

    static {
        o13.m.b(new d0(3));
        f186871b = "pref_";
    }

    private p() {
    }

    public static SharedPreferences a(String str) {
        return ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c().getSharedPreferences(f186871b + str, 0);
    }

    public static boolean b(String str, String str2, boolean z14) {
        str2.getClass();
        SharedPreferences sharedPreferencesA = a(str);
        return sharedPreferencesA != null ? sharedPreferencesA.getBoolean(str2, z14) : z14;
    }

    public static String c(String str, String str2) {
        str2.getClass();
        SharedPreferences sharedPreferencesA = a(str);
        if (sharedPreferencesA != null) {
            return sharedPreferencesA.getString(str2, null);
        }
        return null;
    }

    public static void d(String str) {
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorClear;
        SharedPreferences sharedPreferencesA = a(str);
        if (sharedPreferencesA == null || (editorEdit = sharedPreferencesA.edit()) == null || (editorClear = editorEdit.clear()) == null) {
            return;
        }
        editorClear.apply();
    }

    public static void e(String str, String str2, boolean z14) {
        SharedPreferences sharedPreferencesA = a(str);
        sharedPreferencesA.getClass();
        sharedPreferencesA.edit().putBoolean(str2, z14).apply();
    }

    public static void f(String str, String str2, String str3) {
        str2.getClass();
        SharedPreferences sharedPreferencesA = a(str);
        sharedPreferencesA.getClass();
        sharedPreferencesA.edit().putString(str2, str3).apply();
    }
}
