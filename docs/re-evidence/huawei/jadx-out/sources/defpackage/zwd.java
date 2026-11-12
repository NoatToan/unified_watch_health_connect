package defpackage;

import org.eclipse.californium.core.config.CoapConfig;
import org.eclipse.californium.core.network.deduplication.Deduplicator;
import org.eclipse.californium.elements.config.Configuration;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes20.dex */
public class zwd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f54671a = aaex.a((Class<?>) zwd.class);
    private static zwd e;

    public static zwd e() {
        zwd zwdVar;
        synchronized (zwd.class) {
            if (e == null) {
                e = new zwd();
            }
            zwdVar = e;
        }
        return zwdVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x0042  */
    public Deduplicator c(Configuration configuration) {
        byte b2;
        String str = (String) configuration.c(CoapConfig.l);
        str.hashCode();
        switch (str) {
            case "NO_DEDUPLICATOR":
                b2 = 0;
                break;
            case "MARK_AND_SWEEP":
                b2 = 1;
                break;
            case "PEERS_MARK_AND_SWEEP":
                b2 = 2;
                break;
            case "CROP_ROTATION":
                b2 = 3;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            return new zwe();
        }
        if (b2 == 1) {
            return new zwh(configuration);
        }
        if (b2 == 2) {
            return new zwf(configuration);
        }
        if (b2 == 3) {
            return new zwg(configuration);
        }
        f54671a.warn("configuration contains unsupported deduplicator type, duplicate detection will be turned off");
        return new zwe();
    }
}
