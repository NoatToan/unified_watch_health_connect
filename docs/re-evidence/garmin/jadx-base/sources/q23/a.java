package q23;

import java.util.ServiceLoader;
import p005kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader;
import p13.h0;

/* JADX INFO: loaded from: classes3.dex */
public class a implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f142316a = new a();

    @Override // e23.a
    public final Object invoke() {
        BuiltInsLoader.a aVar = BuiltInsLoader.a.f105826a;
        ServiceLoader serviceLoaderLoad = ServiceLoader.load(BuiltInsLoader.class, BuiltInsLoader.class.getClassLoader());
        serviceLoaderLoad.getClass();
        BuiltInsLoader builtInsLoader = (BuiltInsLoader) h0.c0(serviceLoaderLoad);
        if (builtInsLoader != null) {
            return builtInsLoader;
        }
        vb.h.z("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
        return null;
    }
}
