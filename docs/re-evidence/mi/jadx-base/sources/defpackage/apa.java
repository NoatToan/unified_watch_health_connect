package defpackage;

import android.content.Context;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.soloader.SoLoader;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class apa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class<?> f3323a = apa.class;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static cxh f3324b = null;
    public static volatile boolean c = false;

    public static j5d a() {
        return b().i();
    }

    public static m5d b() {
        return m5d.k();
    }

    public static void c(Context context, k5d k5dVar) {
        d(context, k5dVar, null);
    }

    public static void d(Context context, k5d k5dVar, f57 f57Var) {
        if (epa.d()) {
            epa.a("Fresco#initialize");
        }
        if (c) {
            cm8.y(f3323a, "Fresco has already been initialized! `Fresco.initialize(...)` should only be called 1 single time to avoid memory leaks!");
        } else {
            c = true;
        }
        try {
            if (epa.d()) {
                epa.a("Fresco.initialize->SoLoader.init");
            }
            SoLoader.k(context, 0);
            if (epa.d()) {
                epa.b();
            }
            Context applicationContext = context.getApplicationContext();
            if (k5dVar == null) {
                m5d.u(applicationContext);
            } else {
                m5d.t(k5dVar);
            }
            e(applicationContext, f57Var);
            if (epa.d()) {
                epa.b();
            }
        } catch (IOException e) {
            if (epa.d()) {
                epa.b();
            }
            throw new RuntimeException("Could not initialize SoLoader", e);
        }
    }

    public static void e(Context context, f57 f57Var) {
        if (epa.d()) {
            epa.a("Fresco.initializeDrawee");
        }
        cxh cxhVar = new cxh(context, f57Var);
        f3324b = cxhVar;
        SimpleDraweeView.i(cxhVar);
        if (epa.d()) {
            epa.b();
        }
    }

    public static bxh f() {
        return f3324b.get();
    }
}
