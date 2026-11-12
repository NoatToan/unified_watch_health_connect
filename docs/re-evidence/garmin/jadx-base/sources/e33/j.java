package e33;

import java.util.List;
import java.util.ServiceLoader;
import p13.h0;

/* JADX INFO: loaded from: classes3.dex */
public class j implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f62826a = new j();

    @Override // e23.a
    public final Object invoke() {
        k.a aVar = k.a.f62828a;
        ServiceLoader serviceLoaderLoad = ServiceLoader.load(k.class, k.class.getClassLoader());
        serviceLoaderLoad.getClass();
        List listB1 = h0.b1(serviceLoaderLoad);
        if (!listB1.isEmpty()) {
            return listB1;
        }
        vb.h.z("No MetadataExtensions instances found in the classpath. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
        return null;
    }
}
