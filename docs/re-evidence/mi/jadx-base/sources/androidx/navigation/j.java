package androidx.navigation;

import android.annotation.SuppressLint;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"TypeParameterUnusedInFormals"})
public class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap<Class<?>, String> f2699b = new HashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap<String, i<? extends d>> f2700a = new HashMap<>();

    public static String c(Class<? extends i> cls) {
        HashMap<Class<?>, String> map = f2699b;
        String strValue = map.get(cls);
        if (strValue == null) {
            i.b bVar = (i.b) cls.getAnnotation(i.b.class);
            strValue = bVar != null ? bVar.value() : null;
            if (!g(strValue)) {
                throw new IllegalArgumentException("No @Navigator.Name annotation found for " + cls.getSimpleName());
            }
            map.put(cls, strValue);
        }
        return strValue;
    }

    public static boolean g(String str) {
        return (str == null || str.isEmpty()) ? false : true;
    }

    public final i<? extends d> a(i<? extends d> iVar) {
        return b(c(iVar.getClass()), iVar);
    }

    public i<? extends d> b(String str, i<? extends d> iVar) {
        if (g(str)) {
            return this.f2700a.put(str, iVar);
        }
        throw new IllegalArgumentException("navigator name cannot be an empty string");
    }

    public final <T extends i<?>> T d(Class<T> cls) {
        return (T) e(c(cls));
    }

    public <T extends i<?>> T e(String str) {
        if (!g(str)) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        i<? extends d> iVar = this.f2700a.get(str);
        if (iVar != null) {
            return iVar;
        }
        throw new IllegalStateException("Could not find Navigator with name \"" + str + "\". You must call NavController.addNavigator() for each navigation type.");
    }

    public Map<String, i<? extends d>> f() {
        return this.f2700a;
    }
}
