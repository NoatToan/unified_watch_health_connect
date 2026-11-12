package qx2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kx2.d;
import o13.m;
import o13.t;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;
import p13.b1;
import p13.c1;
import p13.h0;
import p13.y;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqx2/a;", "", "<init>", "()V", "SaMD_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"ApplySharedPref"})
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f148445a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t f148446b = m.b(C2797a.f148447a);

    /* JADX INFO: renamed from: qx2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/content/SharedPreferences;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C2797a extends w implements e23.a<SharedPreferences> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C2797a f148447a = new C2797a();

        public C2797a() {
            super(0);
        }

        @Override // e23.a
        public final SharedPreferences invoke() {
            String strA = td.b.a(td.b.f163878a);
            gx2.b.f80060a.getClass();
            Context context = gx2.b.f80062c;
            context.getClass();
            return td.a.a("samd_sec", strA, context, td.a.d.AES256_SIV, td.a.e.AES256_GCM);
        }
    }

    private a() {
    }

    public static SharedPreferences f() {
        return (SharedPreferences) f148446b.getValue();
    }

    public static void g(d dVar, String str) throws JSONException {
        String string;
        SharedPreferences sharedPreferencesF = f();
        if (dVar != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isEmbeddedHealthTokenSupported", dVar.f107129a);
            jSONObject.put("isEcgSupported", dVar.f107130b);
            jSONObject.put("isFileTransferSupported", dVar.f107131c);
            string = jSONObject.toString();
        } else {
            string = null;
        }
        if (string != null) {
            sharedPreferencesF.edit().putString(str, string).commit();
        } else {
            sharedPreferencesF.edit().remove(str).commit();
        }
    }

    public final synchronized void a(b bVar, long j8, kx2.a aVar) {
        try {
            bVar.getClass();
            aVar.getClass();
            String strB = b(bVar, j8);
            Set<kx2.a> setC = c(bVar, j8);
            Iterable iterableI = setC != null ? c1.i(h0.f1(setC), aVar) : b1.c(aVar);
            SharedPreferences.Editor editorEdit = f().edit();
            ArrayList arrayList = new ArrayList(y.r(iterableI, 10));
            Iterator it = iterableI.iterator();
            while (it.hasNext()) {
                arrayList.add(((kx2.a) it.next()).name());
            }
            editorEdit.putStringSet(strB, h0.g1(arrayList)).commit();
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final synchronized String b(b bVar, long j8) {
        bVar.getClass();
        return bVar.name() + ":" + j8;
    }

    public final synchronized Set<kx2.a> c(b bVar, long j8) {
        Set<kx2.a> setG1;
        try {
            bVar.getClass();
            setG1 = null;
            Set<String> stringSet = f().getStringSet(b(bVar, j8), null);
            if (stringSet != null) {
                Set<String> set = stringSet;
                ArrayList arrayList = new ArrayList(y.r(set, 10));
                for (String str : set) {
                    str.getClass();
                    arrayList.add(kx2.a.valueOf(str));
                }
                setG1 = h0.g1(arrayList);
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return setG1;
    }

    public final synchronized Set<kx2.a> d(long j8) {
        Set<kx2.a> setG1;
        try {
            setG1 = null;
            Set<String> stringSet = f().getStringSet(b(b.DEVICE_FEATURES_THAT_SHOULD_BE_ENABLED, j8), null);
            if (stringSet != null) {
                Set<String> set = stringSet;
                ArrayList arrayList = new ArrayList(y.r(set, 10));
                for (String str : set) {
                    str.getClass();
                    arrayList.add(kx2.a.valueOf(str));
                }
                setG1 = h0.g1(arrayList);
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return setG1;
    }

    public final synchronized String e() {
        return f().getString("SAMD_ID", null);
    }

    public final synchronized void h(kx2.a aVar, boolean z14) {
        aVar.getClass();
        f().edit().putBoolean(aVar.f107121a, z14).commit();
    }

    public final synchronized void i(String str) {
        SharedPreferences sharedPreferencesF = f();
        if (str != null) {
            sharedPreferencesF.edit().putString("SAMD_ID", str).commit();
        } else {
            sharedPreferencesF.edit().remove("SAMD_ID").commit();
        }
    }
}
