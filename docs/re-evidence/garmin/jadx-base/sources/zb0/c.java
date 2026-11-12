package zb0;

import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lzb0/c;", "", "<init>", "(Ljava/lang/String;I)V", "a", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum c {
    COMPATIBLE_WITH_CURRENT_GCM_VERSION,
    COMPATIBLE_WITH_UPGRADED_GCM_VERSION,
    NOT_COMPATIBLE;


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f203436a = new a(null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lzb0/c$a;", "", "<init>", "()V", "", "NO_GCM_SYNC_SUPPORT", "I", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static c a(int i14) {
            if (i14 == 99999) {
                return c.NOT_COMPATIBLE;
            }
            if (i14 == 99998) {
                return c.COMPATIBLE_WITH_CURRENT_GCM_VERSION;
            }
            ((l80.a) KoinJavaComponent.get$default(l80.a.class, null, null, 6, null)).getClass();
            return 11657 < i14 ? c.COMPATIBLE_WITH_UPGRADED_GCM_VERSION : c.COMPATIBLE_WITH_CURRENT_GCM_VERSION;
        }

        private a() {
        }
    }
}
