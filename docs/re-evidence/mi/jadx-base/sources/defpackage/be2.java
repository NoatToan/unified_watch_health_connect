package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public abstract class be2 {
    public static boolean c = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rsk f4117a = new rsk();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public rsk f4118b;

    public static boolean e() {
        return c;
    }

    public rsk a() {
        return ssk.a(c(), tc8.i(c()));
    }

    public rsk b(Configuration configuration) {
        return ssk.b(c(), tc8.i(c()), configuration);
    }

    public abstract Context c();

    public boolean d(rsk rskVar, rsk rskVar2) {
        return Objects.equals(rskVar, rskVar2);
    }

    public void f(Configuration configuration) {
    }

    public void g(Configuration configuration) {
    }
}
