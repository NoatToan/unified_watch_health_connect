package org.eclipse.californium.core.config;

import defpackage.zyl;
import defpackage.zyn;
import defpackage.zyp;
import defpackage.zyr;
import defpackage.zys;
import defpackage.zyu;
import defpackage.zyy;
import java.util.concurrent.TimeUnit;
import org.eclipse.californium.elements.config.Configuration;

/* JADX INFO: loaded from: classes20.dex */
public final class CoapConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zys f44408a;
    public static final zyu aa;
    public static final zyu ab;
    public static final zyu ac;
    public static final zyp<TrackerMode> ae;
    public static final zyy af;
    public static final zyu ag;
    public static final zyy ah;
    public static final zyu ai;
    public static final zyu aj;
    public static final zyy ak;
    public static final zyy al;
    public static final zyu am;
    public static final zyy an;
    public static final zyu ao;
    public static final zyu ap;
    public static final zys aq;
    public static final zyp<MatcherMode> ar;
    public static final zyu as;
    public static final zyu at;
    public static final zyu au;
    public static final zyl av;
    public static final zyl aw;
    public static final zyl ax;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zyl f44409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zys f44410c;
    public static final zyl d;
    public static final zyl g;
    public static final zyy h;
    public static final zyl i;
    public static final zyy j;
    public static final zyr l;
    public static final zyl m;
    public static final zyy n;
    public static final zyp<CongestionControlMode> o;
    public static final Configuration.ModuleDefinitionsProvider r;
    public static final zyy s;
    public static final zyl t;
    public static final zyy u;
    public static final zyy v;
    public static final zyy w;
    public static final zyu z;
    public static final TrackerMode p = TrackerMode.GROUPED;
    public static final MatcherMode q = MatcherMode.STRICT;
    public static final zyu y = new zyu("COAP.MAX_ACTIVE_PEERS", "Maximum number of active peers.", 150000, 1);
    public static final zyy ad = new zyy("COAP.MAX_PEER_INACTIVITY_PERIOD", "Maximum inactive period of peer.", 600, TimeUnit.SECONDS);
    public static final zyu f = new zyu("COAP.COAP_PORT", "CoAP port.", 5683, 1);
    public static final zyu k = new zyu("COAP.COAP_SECURE_PORT", "CoAP DTLS port.", 5684, 1);
    public static final zyy e = new zyy("COAP.ACK_TIMEOUT", "Initial CoAP acknowledge timeout.", 2000, TimeUnit.MILLISECONDS);
    public static final zyy x = new zyy("COAP.MAX_ACK_TIMEOUT", "Maximum CoAP acknowledge timeout.", 60000, TimeUnit.MILLISECONDS);

    public enum CongestionControlMode {
        NULL,
        COCOA,
        COCOA_STRONG,
        BASIC_RTO,
        LINUX_RTO,
        PEAKHOPPER_RTO
    }

    public enum MatcherMode {
        STRICT,
        RELAXED,
        PRINCIPAL,
        PRINCIPAL_IDENTITY
    }

    public enum TrackerMode {
        NULL,
        GROUPED,
        MAPBASED
    }

    static {
        Float fValueOf = Float.valueOf(1.0f);
        f44408a = new zys("COAP.ACK_INIT_RANDOM", "Random factor for initial CoAP acknowledge timeout.", Float.valueOf(1.5f), fValueOf);
        f44410c = new zys("COAP.ACK_TIMEOUT_SCALE", "Scale factor for CoAP acknowledge backoff-timeout.", Float.valueOf(2.0f), fValueOf);
        ab = new zyu("COAP.MAX_RETRANSMIT", "Maximum number of CoAP retransmissions.", 4, 1);
        s = new zyy("COAP.EXCHANGE_LIFETIME", "CoAP maximum exchange lifetime for CON requests.", 247L, TimeUnit.SECONDS);
        an = new zyy("COAP.NON_LIFETIME", "CoAP maximum lifetime for NON requests.", 145L, TimeUnit.SECONDS);
        u = new zyy("COAP.MAX_LATENCY", "Maximum transmission latency for messages.", 100L, TimeUnit.SECONDS);
        af = new zyy("COAP.MAX_TRANSMIT_WAIT", "Maximum time to wait for ACK or RST after the first transmission of a CON message.", 93L, TimeUnit.SECONDS);
        ah = new zyy("COAP.MAX_SERVER_RESPONSE_DELAY", "Maximum server response delay.", 250L, TimeUnit.SECONDS);
        aj = new zyu("COAP.NSTART", "Maximum concurrent transmissions.", 1, 1);
        w = new zyy("COAP.LEISURE", "Timespan a multicast server may spread the response.", 5L, TimeUnit.SECONDS);
        aq = new zys("COAP.PROBING_RATE", "Probing rate to peers, which didn't response before. Currently not used.", fValueOf);
        ax = new zyl("COAP.USE_MESSAGE_OFFLOADING", "Use message off-loading, when data is not longer required.", false);
        aw = new zyl("COAP.USE_RANDOM_MID_START", "Use initially a random value for MID.", true);
        ae = new zyp<>("COAP.MID_TACKER", "MID tracker.", TrackerMode.GROUPED, TrackerMode.values());
        ai = new zyu("COAP.MID_TRACKER_GROUPS", "Number of MID tracker groups.", 16, 4);
        ag = new zyu("COAP.MULTICAST_BASE_MID", "Base MID for multicast requests.", 65000, 0);
        au = new zyu("COAP.TOKEN_SIZE_LIMIT", "Limit of token size.", 8, 1);
        ap = new zyu("COAP.PREFERRED_BLOCK_SIZE", "Preferred blocksize for blockwise transfer.", 512, 16);
        ac = new zyu("COAP.MAX_MESSAGE_SIZE", "Maximum payload size.", 1024, 16);
        aa = new zyu("COAP.MAX_RESOURCE_BODY_SIZE", "Maximum size of resource body. 0 to disable transparent blockwise mode.", 8192, 0);
        h = new zyy("COAP.BLOCKWISE_STATUS_LIFETIME", "Lifetime of blockwise status.", 300L, TimeUnit.SECONDS);
        j = new zyy("COAP.BLOCKWISE_STATUS_INTERVAL", "Interval to validate lifetime of blockwise status.", 5L, TimeUnit.SECONDS);
        at = new zyu("COAP.TCP_NUMBER_OF_BULK_BLOCKS", "Number of block per TCP-blockwise bulk transfer.", 1, 1);
        i = new zyl("COAP.BLOCKWISE_STRICT_BLOCK1_OPTION", "Use block1 option strictly, even for error-responses.", false);
        g = new zyl("COAP.BLOCKWISE_STRICT_BLOCK2_OPTION", "Use block2 option strictly, even if block2 is not required.", false);
        d = new zyl("COAP.BLOCKWISE_ENTITY_TOO_LARGE_AUTO_FAILOVER", "Enable automatic failover on \"entity too large\" response.", true);
        f44409b = new zyl("COAP.BLOCKWISE_REUSE_TOKEN", "Reuse token for blockwise requests. Ease traceability but may introduce vulnerability.", false);
        al = new zyy("COAP.NOTIFICATION_CHECK_INTERVAL", "Interval time to check notifications receiver using a CON message.", 120L, TimeUnit.SECONDS);
        am = new zyu("COAP.NOTIFICATION_CHECK_INTERVAL_COUNT", "Interval counter to check notifications receiver using a CON message.", 100);
        ak = new zyy("COAP.NOTIFICATION_REREGISTRATION_BACKOFF", "Additional time (backoff) to the max-age option\nfor waiting for the next notification before reregister.", 2000L, TimeUnit.MILLISECONDS);
        z = new zyu("COAP.MAX_SERVER_OBSERVES", "Maximum number of observes on server-side. 0 to disable this limitation.", 50000);
        o = new zyp<>("COAP.CONGESTION_CONTROL_ALGORITHM", "Congestion-Control algorithm (still experimental).", CongestionControlMode.NULL, CongestionControlMode.values());
        m = new zyl("COAP.CONGESTION_CONTROL_USE_INET_ADDRESS", "Use inet-address for congestion control, even if an other peer identity is used. Enable, if NAT changes are also changing the quality of the ip-route.", false);
        as = new zyu("COAP.PROTOCOL_STAGE_THREAD_COUNT", "Protocol stage thread count.", 1, 0);
        l = new zyr("COAP.DEDUPLICATOR", "Deduplicator algorithm.", "MARK_AND_SWEEP", "MARK_AND_SWEEP", "PEERS_MARK_AND_SWEEP", "CROP_ROTATION", "NO_DEDUPLICATOR");
        v = new zyy("COAP.MARK_AND_SWEEP_INTERVAL", "Mark and sweep interval.", 10L, TimeUnit.SECONDS);
        ao = new zyu("COAP.PEERS_MARK_AND_SWEEP_MESSAGES", "Maximum messages kept per peer for PEERS_MARK_AND_SWEEP.", 64, 4);
        n = new zyy("COAP.CROP_ROTATION_PERIOD", "Crop rotation period.", 247L, TimeUnit.SECONDS);
        t = new zyl("COAP.DEDUPLICATOR_AUTO_REPLACE", "Automatic replace entries in deduplicator.", true);
        ar = new zyp<>("COAP.RESPONSE_MATCHING", "Response matching mode.", MatcherMode.STRICT, MatcherMode.values());
        av = new zyl("COAP.STRICT_EMPTY_MESSAGE_FORMAT", "Process empty messages strictly according RFC7252, 4.1 as format error. Disable to ignore additional data as tokens or options.", true);
        Configuration.ModuleDefinitionsProvider moduleDefinitionsProvider = new Configuration.ModuleDefinitionsProvider() { // from class: org.eclipse.californium.core.config.CoapConfig.4
            @Override // org.eclipse.californium.elements.config.Configuration.ModuleDefinitionsProvider
            public String getModule() {
                return "COAP.";
            }

            @Override // org.eclipse.californium.elements.config.Configuration.DefinitionsProvider
            public void applyDefinitions(Configuration configuration) {
                int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
                configuration.e(CoapConfig.y, 150000);
                configuration.c(CoapConfig.ad, 600L, TimeUnit.SECONDS);
                configuration.e(CoapConfig.f, 5683);
                configuration.e(CoapConfig.k, 5684);
                configuration.a(CoapConfig.e, 2000, TimeUnit.MILLISECONDS);
                configuration.a(CoapConfig.x, 60000, TimeUnit.MILLISECONDS);
                configuration.e(CoapConfig.f44408a, Float.valueOf(1.5f));
                configuration.e(CoapConfig.f44410c, Float.valueOf(2.0f));
                configuration.e(CoapConfig.ab, 4);
                configuration.c(CoapConfig.s, 247L, TimeUnit.SECONDS);
                configuration.a(CoapConfig.an, 145, TimeUnit.SECONDS);
                configuration.e(CoapConfig.aj, 1);
                configuration.a(CoapConfig.w, 5, TimeUnit.SECONDS);
                configuration.e(CoapConfig.aq, Float.valueOf(1.0f));
                configuration.e(CoapConfig.ax, false);
                configuration.a(CoapConfig.u, 100, TimeUnit.SECONDS);
                configuration.a(CoapConfig.af, 93, TimeUnit.SECONDS);
                configuration.a(CoapConfig.ah, 250, TimeUnit.SECONDS);
                configuration.e(CoapConfig.aw, true);
                configuration.e(CoapConfig.ae, CoapConfig.p);
                configuration.e(CoapConfig.ai, 16);
                configuration.e(CoapConfig.au, 8);
                configuration.e(CoapConfig.ap, 512);
                configuration.e(CoapConfig.ac, 1024);
                configuration.e(CoapConfig.aa, 8192);
                configuration.a(CoapConfig.h, 300, TimeUnit.SECONDS);
                configuration.a(CoapConfig.j, 5, TimeUnit.SECONDS);
                configuration.e(CoapConfig.i, false);
                configuration.e(CoapConfig.g, false);
                configuration.e(CoapConfig.d, true);
                configuration.e(CoapConfig.f44409b, false);
                configuration.e(CoapConfig.at, 4);
                configuration.a(CoapConfig.al, 120, TimeUnit.SECONDS);
                configuration.e(CoapConfig.am, 100);
                configuration.a(CoapConfig.ak, 2000, TimeUnit.MILLISECONDS);
                configuration.e(CoapConfig.o, CongestionControlMode.NULL);
                configuration.e(CoapConfig.m, false);
                configuration.e(CoapConfig.as, Integer.valueOf(iAvailableProcessors));
                configuration.e(CoapConfig.l, "MARK_AND_SWEEP");
                configuration.c(CoapConfig.v, 10L, TimeUnit.SECONDS);
                configuration.e(CoapConfig.ao, 64);
                configuration.c(CoapConfig.n, 247L, TimeUnit.SECONDS);
                configuration.e(CoapConfig.t, true);
                configuration.e(CoapConfig.ar, CoapConfig.q);
                configuration.e(CoapConfig.ag, 65000);
                configuration.e(CoapConfig.av, true);
                configuration.e(CoapConfig.z, 50000);
                zyn.e((Class<?>) CoapConfig.class, configuration);
            }
        };
        r = moduleDefinitionsProvider;
        Configuration.e(moduleDefinitionsProvider);
    }
}
