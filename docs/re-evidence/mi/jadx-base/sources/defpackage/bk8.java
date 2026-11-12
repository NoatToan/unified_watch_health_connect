package defpackage;

import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class bk8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f4307a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @GuardedBy("LOCK")
    public static final Map<Object, yf3> f4308b = new HashMap();

    public static yf3 a(Object obj) {
        yf3 yf3Var;
        synchronized (f4307a) {
            yf3Var = f4308b.get(obj);
        }
        return yf3Var == null ? yf3.f40120a : yf3Var;
    }
}
