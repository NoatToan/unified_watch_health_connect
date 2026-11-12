package defpackage;

import org.eclipse.californium.elements.config.Configuration;

/* JADX INFO: loaded from: classes20.dex */
public final class zyv {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Configuration.ModuleDefinitionsProvider f54792b;
    public static final zyu d = new zyu("UDP.RECEIVER_THREAD_COUNT", "Number of UDP receiver threads.", 1, 0);
    public static final zyu g = new zyu("UDP.SENDER_THREAD_COUNT", "Number of UDP sender threads.", 1, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zyu f54791a = new zyu("UDP.DATAGRAM_SIZE", "Maxium size of UDP datagram.", 2048, 64);
    public static final zyu e = new zyu("UDP.RECEIVE_BUFFER_SIZE", "UDP receive-buffer size. Empty or 0 to use the OS default.", null, 64);
    public static final zyu f = new zyu("UDP.SEND_BUFFER_SIZE", "UDP send-buffer size. Empty or 0 to use the OS default.", null, 64);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zyu f54793c = new zyu("UDP.CONNECTOR_OUT_CAPACITY", "Maximum number of pending outgoing messages.", Integer.MAX_VALUE, 32);

    static {
        Configuration.ModuleDefinitionsProvider moduleDefinitionsProvider = new Configuration.ModuleDefinitionsProvider() { // from class: zyv.2
            @Override // org.eclipse.californium.elements.config.Configuration.ModuleDefinitionsProvider
            public String getModule() {
                return "UDP.";
            }

            @Override // org.eclipse.californium.elements.config.Configuration.DefinitionsProvider
            public void applyDefinitions(Configuration configuration) {
                int i = Runtime.getRuntime().availableProcessors() > 3 ? 2 : 1;
                configuration.e(zyv.d, Integer.valueOf(i));
                configuration.e(zyv.g, Integer.valueOf(i));
                configuration.e(zyv.f54791a, 2048);
                configuration.e(zyv.e, (Object) null);
                configuration.e(zyv.f, (Object) null);
                configuration.e(zyv.f54793c, Integer.MAX_VALUE);
                zyn.e((Class<?>) zyv.class, configuration);
            }
        };
        f54792b = moduleDefinitionsProvider;
        Configuration.e(moduleDefinitionsProvider);
    }
}
