package defpackage;

import org.eclipse.californium.core.config.CoapConfig;
import org.eclipse.californium.elements.Connector;
import org.eclipse.californium.elements.EndpointContextMatcher;
import org.eclipse.californium.elements.config.Configuration;

/* JADX INFO: loaded from: classes20.dex */
public class zvq {
    public static EndpointContextMatcher c(Connector connector, Configuration configuration) {
        String protocol;
        if (connector != null) {
            protocol = connector.getProtocol();
            if ("TCP".equalsIgnoreCase(protocol)) {
                return new zyb();
            }
            if ("TLS".equalsIgnoreCase(protocol)) {
                return new zyc();
            }
        } else {
            protocol = null;
        }
        int i = AnonymousClass3.f54624c[((CoapConfig.MatcherMode) configuration.c(CoapConfig.ar)).ordinal()];
        if (i == 1) {
            if ("UDP".equalsIgnoreCase(protocol)) {
                return new zyh(false);
            }
            return new zxy();
        }
        if (i == 2) {
            if ("UDP".equalsIgnoreCase(protocol)) {
                return new zyh(true);
            }
            return new zxz();
        }
        if (i == 3) {
            if ("UDP".equalsIgnoreCase(protocol)) {
                return new zyh(true);
            }
            return new zxz(true);
        }
        if ("UDP".equalsIgnoreCase(protocol)) {
            return new zyh(true);
        }
        return new zxw();
    }

    /* JADX INFO: renamed from: zvq$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f54624c;

        static {
            int[] iArr = new int[CoapConfig.MatcherMode.values().length];
            f54624c = iArr;
            try {
                iArr[CoapConfig.MatcherMode.RELAXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f54624c[CoapConfig.MatcherMode.PRINCIPAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f54624c[CoapConfig.MatcherMode.PRINCIPAL_IDENTITY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f54624c[CoapConfig.MatcherMode.STRICT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }
}
