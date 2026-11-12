package oe;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import p005kotlin.Metadata;
import p006l2.v0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Loe/f;", "", "Ljava/lang/ClassLoader;", "loader", "Lme/d;", "consumerAdapter", "<init>", "(Ljava/lang/ClassLoader;Lme/d;)V", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClassLoader f131217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final me.d f131218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final le.b f131219c;

    public f(ClassLoader classLoader, me.d dVar) {
        classLoader.getClass();
        dVar.getClass();
        this.f131217a = classLoader;
        this.f131218b = dVar;
        this.f131219c = new le.b(classLoader);
    }

    public static final boolean d(f fVar) throws NoSuchMethodException, ClassNotFoundException {
        Class<?> clsLoadClass = fVar.f131217a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
        clsLoadClass.getClass();
        Method method = clsLoadClass.getMethod("addWindowLayoutInfoListener", Context.class, Consumer.class);
        Method method2 = clsLoadClass.getMethod("removeWindowLayoutInfoListener", Consumer.class);
        te.a aVar = te.a.f163908a;
        method.getClass();
        aVar.getClass();
        if (!Modifier.isPublic(method.getModifiers())) {
            return false;
        }
        method2.getClass();
        return Modifier.isPublic(method2.getModifiers());
    }

    public final WindowLayoutComponent a() {
        le.b bVar = this.f131219c;
        bVar.getClass();
        te.a.f163908a.getClass();
        boolean zC = false;
        try {
            bVar.f112032a.loadClass("androidx.window.extensions.WindowExtensionsProvider").getClass();
            if (te.a.a("WindowExtensionsProvider#getWindowExtensions is not valid", new v0(bVar, 6)) && te.a.a("WindowExtensions#getWindowLayoutComponent is not valid", new e(this, 0)) && te.a.a("FoldingFeature class is not valid", new e(this, 1))) {
                me.f.f117961a.getClass();
                int iA = me.f.a();
                if (iA >= 1) {
                    if (iA == 1) {
                        zC = b();
                    } else if (iA < 5) {
                        zC = c();
                    } else if (c() && te.a.a("DisplayFoldFeature is not valid", new e(this, 3)) && te.a.a("SupportedWindowFeatures is not valid", new e(this, 2)) && te.a.a("WindowLayoutComponent#getSupportedWindowFeatures is not valid", new e(this, 4))) {
                        zC = true;
                    }
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        if (!zC) {
            return null;
        }
        try {
            return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
        } catch (UnsupportedOperationException unused2) {
            return null;
        }
    }

    public final boolean b() {
        return te.a.a("WindowLayoutComponent#addWindowLayoutInfoListener(" + Activity.class.getName() + ", java.util.function.Consumer) is not valid", new e(this, 5));
    }

    public final boolean c() {
        if (!b()) {
            return false;
        }
        StringBuilder sb3 = new StringBuilder("WindowLayoutComponent#addWindowLayoutInfoListener(");
        sb3.append(Context.class.getName());
        sb3.append(", androidx.window.extensions.core.util.function.Consumer) is not valid");
        return te.a.a(sb3.toString(), new e(this, 6));
    }
}
