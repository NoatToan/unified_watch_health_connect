package k90;

import java.util.concurrent.ConcurrentHashMap;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lk90/d;", "", "Ly80/e;", "bleDeviceScanRepository", "Lk90/d0;", "getDeviceInfoUseCase", "Lk90/a;", "bleDeviceDiscoveryFilter", "<init>", "(Ly80/e;Lk90/d0;Lk90/a;)V", "a", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y80.e f103443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f103444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k90.a f103445c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ConcurrentHashMap<String, o13.p<dk2.d, l90.b>> f103446d;

    static {
        new a(null);
    }

    public d(y80.e eVar, d0 d0Var, k90.a aVar) {
        eVar.getClass();
        d0Var.getClass();
        aVar.getClass();
        this.f103443a = eVar;
        this.f103444b = d0Var;
        this.f103445c = aVar;
        this.f103446d = new ConcurrentHashMap<>();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lk90/d$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "MILLIS_TO_SCAN_ON_DEVICE_DISCOVERY_SCREEN", "J", "MILLIS_MAX_SCAN_DEVICE_DETECTION", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
