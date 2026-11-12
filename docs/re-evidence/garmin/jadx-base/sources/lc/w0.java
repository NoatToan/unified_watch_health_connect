package lc;

import android.annotation.SuppressLint;
import java.util.LinkedHashMap;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Llc/w0;", "", "<init>", "()V", "a", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"TypeParameterUnusedInFormals"})
public class w0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f111892b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final LinkedHashMap f111893c = new LinkedHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f111894a = new LinkedHashMap();

    public final void a(v0 v0Var) {
        v0Var.getClass();
        Class<?> cls = v0Var.getClass();
        f111892b.getClass();
        String strA = a.a(cls);
        if (strA.length() <= 0) {
            vb.h.s("navigator name cannot be an empty string");
            return;
        }
        LinkedHashMap linkedHashMap = this.f111894a;
        v0 v0Var2 = (v0) linkedHashMap.get(strA);
        if (p005kotlin.jvm.internal.s.g(v0Var2, v0Var)) {
            return;
        }
        if (v0Var2 != null && v0Var2.f111891b) {
            u0.u("Navigator ", v0Var, " is replacing an already attached ", v0Var2);
        } else if (v0Var.f111891b) {
            n23.j.t("Navigator ", v0Var, " is already attached to another NavController");
        }
    }

    public final <T extends v0<?>> T b(Class<T> cls) {
        f111892b.getClass();
        return (T) c(a.a(cls));
    }

    public final <T extends v0<?>> T c(String str) {
        str.getClass();
        f111892b.getClass();
        if (str.length() <= 0) {
            vb.h.s("navigator name cannot be an empty string");
            return null;
        }
        T t7 = (T) this.f111894a.get(str);
        if (t7 != null) {
            return t7;
        }
        vb.h.z(am.j.m("Could not find Navigator with name \"", str, "\". You must call NavController.addNavigator() for each navigation type."));
        return null;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0007\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Llc/w0$a;", "", "<init>", "()V", "", "Ljava/lang/Class;", "", "annotationNames", "Ljava/util/Map;", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static String a(Class cls) {
            LinkedHashMap linkedHashMap = w0.f111893c;
            String strValue = (String) linkedHashMap.get(cls);
            if (strValue == null) {
                v0.a aVar = (v0.a) cls.getAnnotation(v0.a.class);
                strValue = aVar != null ? aVar.value() : null;
                if (strValue == null || strValue.length() <= 0) {
                    vb.h.x("No @Navigator.Name annotation found for ".concat(cls.getSimpleName()));
                    return null;
                }
                linkedHashMap.put(cls, strValue);
            }
            strValue.getClass();
            return strValue;
        }

        private a() {
        }
    }
}
