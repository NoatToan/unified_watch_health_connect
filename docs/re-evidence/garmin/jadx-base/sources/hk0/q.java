package hk0;

import com.garmin.android.gfdi.configuration.SupportedCapability;
import com.google.protobuf.ExtensionRegistryLite;
import java.util.Set;
import o53.a0;
import o53.c0;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p13.a1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lhk0/q;", "Ldt2/a;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q implements dt2.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Logger f84084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public dt2.g f84085c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public u53.d f84086d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set<Integer> f84087e = a1.b(Integer.valueOf(SupportedCapability.GROUP_LIVETRACK.ordinal()));

    static {
        new a(null);
    }

    @Override // dt2.a
    public final void close(String str) {
        str.getClass();
        u53.d dVar = this.f84086d;
        if (dVar != null) {
            c0.d(dVar, "LivetrackConsentProtobufHandler closed");
        } else {
            p005kotlin.jvm.internal.s.m("coroutineScope");
            throw null;
        }
    }

    @Override // dt2.a
    public final Set<Integer> getConfiguration() {
        return this.f84087e;
    }

    @Override // dt2.a
    public final void start(rs2.c cVar, dt2.g gVar, ExtensionRegistryLite extensionRegistryLite) {
        cVar.getClass();
        gVar.getClass();
        this.f84086d = c0.a(new a0("LivetrackConsentProtobufHandler"));
        Logger logger = LoggerFactory.getLogger("LivetrackConsentProtobufHandler");
        logger.getClass();
        this.f84084b = logger;
        this.f84085c = gVar;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lhk0/q$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
