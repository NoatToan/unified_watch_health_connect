package defpackage;

import java.util.concurrent.TimeUnit;
import org.eclipse.californium.elements.config.Configuration;

/* JADX INFO: loaded from: classes20.dex */
public final class zyq {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zyy f54785b = new zyy("SYS.HEALTH_STATUS_INTERVAL", "Health status interval. 0 to disable the health status.", 0, TimeUnit.SECONDS);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Configuration.ModuleDefinitionsProvider f54786c;

    static {
        Configuration.ModuleDefinitionsProvider moduleDefinitionsProvider = new Configuration.ModuleDefinitionsProvider() { // from class: zyq.3
            @Override // org.eclipse.californium.elements.config.Configuration.ModuleDefinitionsProvider
            public String getModule() {
                return "SYS.";
            }

            @Override // org.eclipse.californium.elements.config.Configuration.DefinitionsProvider
            public void applyDefinitions(Configuration configuration) {
                configuration.a(zyq.f54785b, 0, TimeUnit.SECONDS);
                zyn.e((Class<?>) zyq.class, configuration);
            }
        };
        f54786c = moduleDefinitionsProvider;
        Configuration.e(moduleDefinitionsProvider);
    }
}
