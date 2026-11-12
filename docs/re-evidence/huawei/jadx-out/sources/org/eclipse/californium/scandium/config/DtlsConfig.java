package org.eclipse.californium.scandium.config;

import androidx.media3.extractor.text.ttml.TtmlNode;
import defpackage.zyl;
import defpackage.zym;
import defpackage.zyn;
import defpackage.zyp;
import defpackage.zyr;
import defpackage.zys;
import defpackage.zyu;
import defpackage.zyw;
import defpackage.zyy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.eclipse.californium.elements.config.BasicListDefinition;
import org.eclipse.californium.elements.config.CertificateAuthenticationMode;
import org.eclipse.californium.elements.config.Configuration;
import org.eclipse.californium.scandium.dtls.CertificateType;
import org.eclipse.californium.scandium.dtls.ExtendedMasterSecretMode;
import org.eclipse.californium.scandium.dtls.MaxFragmentLengthExtension;
import org.eclipse.californium.scandium.dtls.SignatureAndHashAlgorithm;
import org.eclipse.californium.scandium.dtls.cipher.CipherSuite;
import org.eclipse.californium.scandium.dtls.cipher.XECDHECryptography;

/* JADX INFO: loaded from: classes20.dex */
public final class DtlsConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zym<CipherSuite.CertificateKeyAlgorithm> f44541a;
    public static final zyu aa;
    public static final zym<CipherSuite> ab;
    public static final zyu ac;
    public static final zyy ad;

    @Deprecated
    public static final zyl ae;
    public static final zyu af;
    public static final zyl ag;
    public static final zyu ah;
    public static final zyl ai;
    public static final zyu aj;
    public static final zyu ak;
    public static final zyl al;
    public static final zyl am;
    public static final zys an;
    public static final zyy ao;
    public static final zyp<DtlsRole> ap;
    public static final zys aq;
    public static final zyu ar;
    public static final zyp<DtlsSecureRenegotiation> as;
    public static final zyy at;
    public static final b au;
    public static final zyl av;

    @Deprecated
    public static final zyl aw;
    public static final zyy ax;
    public static final zyl ay;
    public static final zyl az;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Configuration.ModuleDefinitionsProvider f44542b;
    public static final zyl ba;
    public static final zyl bb;
    public static final zyl bc;
    public static final zyl bd;
    public static final zyl be;

    @Deprecated
    public static final zyu bf;
    public static final zyu bg;
    public static final zyl bh;
    public static final zyl bi;
    public static final zyl bj;
    public static final zyl bk;

    @Deprecated
    public static final zyl bl;
    public static final zyl bm;

    @Deprecated
    public static final zyu bn;

    @Deprecated
    private static final zyl bo;
    public static final zyl bp;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zyy f44543c;
    public static final zyy d;
    public static final DtlsSecureRenegotiation e;
    public static final zyu f;
    public static final zyu g;
    public static final zym<CertificateType> h;
    public static final zym<CipherSuite> i;
    public static final zyp<CertificateAuthenticationMode> j;
    public static final zyu k;
    public static final zyp<ExtendedMasterSecretMode> l;
    public static final zyr m;
    public static final zym<XECDHECryptography.SupportedGroup> n;
    public static final zyy o;
    public static final zyu p;
    public static final zyu q;
    public static final zyu r;
    public static final zyu s;
    public static final zyu t;
    public static final zyu u;
    public static final zyu v;
    public static final zyp<MaxFragmentLengthExtension.Length> w;
    public static final zyu x;
    public static final zyu y;

    @Deprecated
    public static final zyu z;

    public enum DtlsRole {
        CLIENT_ONLY,
        SERVER_ONLY,
        BOTH
    }

    public enum DtlsSecureRenegotiation {
        NONE,
        WANTED,
        NEEDED
    }

    public static class b extends BasicListDefinition<SignatureAndHashAlgorithm> {
        public b(String str, String str2) {
            super(str, str2, null);
        }

        @Override // org.eclipse.californium.elements.config.DocumentedDefinition
        public String getTypeName() {
            return "List<SignatureAndHashAlgorithm>";
        }

        @Override // org.eclipse.californium.elements.config.DocumentedDefinition
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public String writeValue(List<SignatureAndHashAlgorithm> list) {
            StringBuilder sb = new StringBuilder();
            Iterator<SignatureAndHashAlgorithm> it = list.iterator();
            while (it.hasNext()) {
                sb.append(it.next().e());
                sb.append(", ");
            }
            sb.setLength(sb.length() - 2);
            return sb.toString();
        }

        @Override // org.eclipse.californium.elements.config.BasicListDefinition, org.eclipse.californium.elements.config.DocumentedDefinition
        public List<SignatureAndHashAlgorithm> checkValue(List<SignatureAndHashAlgorithm> list) throws zyw {
            if (list != null) {
                for (SignatureAndHashAlgorithm signatureAndHashAlgorithm : list) {
                    if (!signatureAndHashAlgorithm.g()) {
                        throw new IllegalArgumentException(signatureAndHashAlgorithm + " is not supported by the JCE!");
                    }
                }
            }
            return super.checkValue((List) list);
        }

        @Override // org.eclipse.californium.elements.config.DocumentedDefinition
        public boolean isAssignableFrom(Object obj) {
            if (!(obj instanceof List)) {
                return false;
            }
            for (Object obj2 : (List) obj) {
                if (!(obj2 instanceof SignatureAndHashAlgorithm)) {
                    throw new IllegalArgumentException(obj2 + " is no SignatureAndHashAlgorithm");
                }
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.eclipse.californium.elements.config.DocumentedDefinition
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<SignatureAndHashAlgorithm> parseValue(String str) {
            String[] strArrSplit = str.split(",");
            ArrayList arrayList = new ArrayList(strArrSplit.length);
            for (String str2 : strArrSplit) {
                arrayList.add(SignatureAndHashAlgorithm.a(str2.trim()));
            }
            return arrayList;
        }
    }

    static {
        DtlsSecureRenegotiation dtlsSecureRenegotiation = DtlsSecureRenegotiation.WANTED;
        e = dtlsSecureRenegotiation;
        ax = new zyy("DTLS.SESSION_TIMEOUT", "DTLS session timeout. Currently not supported.", 1L, TimeUnit.HOURS);
        d = new zyy("DTLS.AUTO_HANDSHAKE_TIMEOUT", "DTLS auto-handshake timeout. After that period without exchanging messages, a new message will initiate a handshake. Must not be used with SERVER_ONLY! Common value will be \"30[s]\" in order to compensate assumed NAT timeouts. <blank>, disabled.");
        g = new zyu("DTLS.CONNECTION_ID_LENGTH", "DTLS connection ID length. <blank> disabled, 0 enables support without active use of CID.", null, 0);
        f = new zyu("DTLS.CONNECTION_ID_NODE_ID", "DTLS cluster-node ID used for connection ID. <blank> not used.", null, 0);
        ao = new zyy("DTLS.RETRANSMISSION_TIMEOUT", "DTLS initial retransmission timeout.", 2000L, TimeUnit.MILLISECONDS);
        ad = new zyy("DTLS.MAX_RETRANSMISSION_TIMEOUT", "DTLS maximum retransmission timeout.", 60000L, TimeUnit.MILLISECONDS);
        Float fValueOf = Float.valueOf(1.0f);
        an = new zys("DTLS.RETRANSMISSION_INIT_RANDOM", "DTLS random factor for initial retransmission timeout.", fValueOf, fValueOf);
        aq = new zys("DTLS.RETRANSMISSION_TIMEOUT_SCALE", "DTLS scale factor for retransmission backoff-timeout.", Float.valueOf(2.0f), fValueOf);
        f44543c = new zyy("DTLS.ADDITIONAL_ECC_TIMEOUT", "DTLS additional initial timeout for ECC related flights.", 0L, TimeUnit.MILLISECONDS);
        u = new zyu("DTLS.MAX_RETRANSMISSIONS", "DTLS maximum number of flight retransmissions.", 4, 0);
        aj = new zyu("DTLS.RETRANSMISSION_BACKOFF", "Number of flight-retransmissions before switching to backoff mode using single handshake messages in single record datagrams.", null, 0);
        av = new zyl("DTLS.SERVER_USE_SESSION_ID", "Enable server to use a session ID in order to support session resumption.", true);
        bd = new zyl("DTLS.USE_EARLY_STOP_RETRANSMISSION", "Stop retransmission on receiving the first message of the next flight, not waiting for the last message.", true);
        ak = new zyu("DTLS.RECORD_SIZE_LIMIT", "DTLS record size limit (RFC 8449). Between 64 and 16K.", null, 64);
        w = new zyp<>("DTLS.MAX_FRAGMENT_SIZE", "DTLS maximum fragment length (RFC 6066).", MaxFragmentLengthExtension.Length.values());
        r = new zyu("DTLS.MAX_FRAGMENTED_HANDSHAKE_MESSAGE_LENGTH", "DTLS maximum length of reassembled fragmented handshake message.\nMust be large enough for used certificates.", 8192, 64);
        bj = new zyl("DTLS.USE_MULTI_RECORD_MESSAGES", "Use multiple DTLS records in UDP messages.");
        bm = new zyl("DTLS.USE_MULTI_HANDSHAKE_MESSAGE_RECORDS", "Use multiple handshake messages in DTLS records.\nNot all libraries may have implemented this!");
        j = new zyp<>("DTLS.CLIENT_AUTHENTICATION_MODE", "DTLS client authentication mode for certificate based cipher suites.", CertificateAuthenticationMode.NEEDED, CertificateAuthenticationMode.values());
        bp = new zyl("DTLS.VERIFY_SERVER_CERTIFICATES_SUBJECT", "DTLS verifies the server certificate's subjects.", true);
        h = new zym<>("DTLS.CERTIFICATE_TYPES", "DTLS supported certificate types ordered by preference.", Arrays.asList(CertificateType.RAW_PUBLIC_KEY, CertificateType.X_509), new CertificateType[]{CertificateType.RAW_PUBLIC_KEY, CertificateType.X_509});
        ap = new zyp<>("DTLS.ROLE", "DTLS role.", DtlsRole.BOTH, DtlsRole.values());
        aa = new zyu("DTLS.MAX_TRANSMISSION_UNIT", "DTLS MTU (Maximum Transmission Unit).\nMust be used, if the MTU of the local network doesn't apply, e.g. if ip-tunnels are used.", null, 64);
        ac = new zyu("DTLS.MAX_TRANSMISSION_UNIT_LIMIT", "DTLS MTU (Maximum Transmission Unit) limit for local auto detection.", null, 64);
        m = new zyr("DTLS.DEFAULT_HANDSHAKE_MODE", "DTLS default handshake mode.", TtmlNode.TEXT_EMPHASIS_AUTO, "none", TtmlNode.TEXT_EMPHASIS_AUTO);
        s = new zyu("DTLS.MAX_CONNECTIONS", "DTLS maximum connections.", 150000, 1);
        at = new zyy("DTLS.STALE_CONNECTION_THRESHOLD", "DTLS threshold for stale connections. Connections will only get removed for new ones, if at least for that threshold no messages are exchanged using that connection.", 1800L, TimeUnit.SECONDS);
        z = new zyu("DTLS.OUTBOUND_MESSAGE_BUFFER_SIZE", "DTLS buffer size for outbound messages");
        y = new zyu("DTLS.MAX_PENDING_OUTBOUND_JOBS", "Maximum number of jobs for outbound DTLS messages.", 50000, 64);
        v = new zyu("DTLS.MAX_PENDING_INBOUND_JOBS", "Maximum number of jobs for inbound DTLS messages.", 50000, 64);
        x = new zyu("DTLS.MAX_PENDING_HANDSHAKE_RESULT_JOBS", "Maximum number of jobs for DTLS handshake results.", 5000, 64);
        q = new zyu("DTLS.MAX_DEFERRED_OUTBOUND_APPLICATION_MESSAGES", "DTLS maximum deferred outbound application messages.", 10, 0);
        p = new zyu("DTLS.MAX_DEFERRED_INBOUND_RECORDS", "DTLS maximum size of all deferred inbound messages.", 8192, 0);
        af = new zyu("DTLS.RECEIVER_THREAD_COUNT", "Number of DTLS receiver threads.", 1, 0);
        k = new zyu("DTLS.CONNECTOR_THREAD_COUNT", "Number of DTLS connector threads.", 1, 0);
        ah = new zyu("DTLS.RECEIVE_BUFFER_SIZE", "DTLS receive-buffer size. Empty or 0 to use the OS default.", null, 64);
        ar = new zyu("DTLS.SEND_BUFFER_SIZE", "DTLS send-buffer size. Empty or 0 to use the OS default.", null, 64);
        bi = new zyl("DTLS.USE_SERVER_NAME_INDICATION", "DTLS use server name indication.", false);
        l = new zyp<>("DTLS.EXTENDED_MASTER_SECRET_MODE", "DTLS extended master secret mode.", ExtendedMasterSecretMode.ENABLED, ExtendedMasterSecretMode.values());
        bn = new zyu("DTLS.VERIFY_PEERS_ON_RESUMPTION_THRESHOLD", "DTLS verify peers on resumption threshold in percent.", 30, 0);
        bl = new zyl("DTLS.USE_HELLO_VERIFY_REQUEST_FOR_PSK", "DTLS use a HELLO_VERIFY_REQUEST for PSK cipher suites to protect against spoofing.", true);
        be = new zyl("DTLS.USE_HELLO_VERIFY_REQUEST", "DTLS use a HELLO_VERIFY_REQUEST to protect against spoofing.", true);
        bb = new zyl("DTLS.USE_ANTI_REPLAY_FILTER", "DTLS use the anti-replay-filter.", true);
        bo = new zyl("DTLS.USE_USE_ANTI_REPLAY_FILTER", "DTLS use the anti-replay-filter.", true);
        bg = new zyu("DTLS.USE_DISABLED_WINDOW_FOR_ANTI_REPLAY_FILTER", "DTLS use a disabled window for the anti-replay-filter. -1 := extend the disabled window to start of session, 0 := normal window, <n> := disabled window of size <n>.", 0, -1);
        bc = new zyl("DTLS.UPDATE_ADDRESS_USING_CID_ON_NEWER_RECORDS", "DTLS update address using CID on newer records.", true);
        bk = new zyl("DTLS.USE_NEWER_FILTER", "DTLS use newer record filter.\nDrop reordered records in order to protect from delay attacks,\nif no other means, maybe on application level, are available.", false);
        az = new zyl("DTLS.TRUNCATE_CLIENT_CERTIFICATE_PATH", "DTLS truncate client certificate path.", true);
        ba = new zyl("DTLS.TRUNCATE_CERTIFICATE_PATH_FOR_VALIDATION", "DTLS certificate path for validation.", true);
        ai = new zyl("DTLS.RECOMMENDED_CIPHER_SUITES_ONLY", "DTLS recommended cipher-suites only.", true);
        ag = new zyl("DTLS.RECOMMENDED_CURVES_ONLY", "DTLS recommended ECC curves/groups only.", true);
        am = new zyl("DTLS.RECOMMENDED_SIGNATURE_AND_HASH_ALGORITHMS_ONLY", "DTLS recommended signature- and hash-algorithms only.", true);
        ab = new zym<>("DTLS.PRESELECTED_CIPHER_SUITES", "List of preselected DTLS cipher-suites.\nIf not recommended cipher suites are intended to be used, switch off DTLS_RECOMMENDED_CIPHER_SUITES_ONLY.\nThe supported cipher suites are evaluated at runtime and may differ from the ones when creating this properties file.", CipherSuite.getCipherSuites(false, false));
        i = new zym<>("DTLS.CIPHER_SUITES", "List of DTLS cipher-suites.\nIf not recommended cipher suites are intended to be used, switch off DTLS_RECOMMENDED_CIPHER_SUITES_ONLY.\nThe supported cipher suites are evaluated at runtime and may differ from the ones when creating this properties file.", null, 1, CipherSuite.getCipherSuites(false, true));
        n = new zym<>("DTLS.CURVES", "List of DTLS curves (supported groups).\nDefaults to all supported curves of the JCE at runtime.", XECDHECryptography.SupportedGroup.getUsableGroupsArray());
        au = new b("DTLS.SIGNATURE_AND_HASH_ALGORITHMS", "List of DTLS signature- and hash-algorithms.\nValues e.g SHA256withECDSA or ED25519.");
        f44541a = new zym<>("DTLS.CERTIFICATE_KEY_ALGORITHMS", "List of DTLS certificate key algorithms.\nOn the client side used to select the default cipher-suites, on the server side to negotiate the client's certificate.", new CipherSuite.CertificateKeyAlgorithm[]{CipherSuite.CertificateKeyAlgorithm.EC, CipherSuite.CertificateKeyAlgorithm.RSA});
        bf = new zyu("DTLS.USE_DEPRECATED_CID", "DTLS use deprecated CID extension code point for client (before version 09 of RFC-CID).", null, 53);
        aw = new zyl("DTLS.SUPPORT_DEPRECATED_CID", "DTLS support deprecated CID for server (before version 9).", false);
        bh = new zyl("DTLS.USE_DEFAULT_RECORD_FILTER", "Use default DTLS record filter.", true);
        al = new zyl("DTLS.REMOVE_STALE_DOUBLE_PRINCIPALS", "Remove stale double principals.\nRequires unique principals and a read-write-lock connection store.", false);
        ae = new zyl("DTLS.READ_WRITE_LOCK_CONNECTION_STORE", "Use read-write-lock connection store.", true);
        o = new zyy("DTLS.MAC_ERROR_FILTER_QUIET_TIME", "Quiet time to reset MAC error filter.\nThe MAC error filter blocks all traffic for an endpoint, if since the last quiet period the number of new MAC errors exceeds a threshold.\n0 to disable the MAC error filter.", 0L, TimeUnit.SECONDS);
        t = new zyu("DTLS.MAC_ERROR_FILTER_THRESHOLD", "Threshold of current MAC errors to block all traffic for an endpoint. 0 to disable the MAC error filter.", 0, 0);
        as = new zyp<>("DTLS.SECURE_RENEGOTIATION_MODE", "Use minimal version of RFC5746 to indicate secure renegotiation on initial handshake.\nRenegotation handshakes are always rejected by Californium.", dtlsSecureRenegotiation, DtlsSecureRenegotiation.values());
        ay = new zyl("DTLS.SUPPORT_KEY_MATERIAL_EXPORT", "Support key material export according RFC5705.", false);
        Configuration.ModuleDefinitionsProvider moduleDefinitionsProvider = new Configuration.ModuleDefinitionsProvider() { // from class: org.eclipse.californium.scandium.config.DtlsConfig.1
            @Override // org.eclipse.californium.elements.config.Configuration.ModuleDefinitionsProvider
            public String getModule() {
                return "DTLS.";
            }

            @Override // org.eclipse.californium.elements.config.Configuration.DefinitionsProvider
            public void applyDefinitions(Configuration configuration) {
                int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
                configuration.a(DtlsConfig.ax, 24, TimeUnit.HOURS);
                configuration.c(DtlsConfig.d, null, TimeUnit.SECONDS);
                configuration.a(DtlsConfig.ao, 2000, TimeUnit.MILLISECONDS);
                configuration.a(DtlsConfig.ad, 60000, TimeUnit.MILLISECONDS);
                configuration.a(DtlsConfig.f44543c, 0, TimeUnit.MILLISECONDS);
                configuration.e(DtlsConfig.u, 4);
                configuration.e(DtlsConfig.an, Float.valueOf(1.0f));
                configuration.e(DtlsConfig.aq, Float.valueOf(2.0f));
                configuration.e(DtlsConfig.aj, (Object) null);
                configuration.e(DtlsConfig.g, (Object) null);
                configuration.e(DtlsConfig.f, (Object) null);
                configuration.e(DtlsConfig.av, true);
                configuration.e(DtlsConfig.bd, true);
                configuration.e(DtlsConfig.ak, (Object) null);
                configuration.e(DtlsConfig.w, (Object) null);
                configuration.e(DtlsConfig.r, 8192);
                configuration.e(DtlsConfig.bj, (Object) null);
                configuration.e(DtlsConfig.bm, (Object) null);
                configuration.e(DtlsConfig.j, CertificateAuthenticationMode.NEEDED);
                configuration.e(DtlsConfig.bp, true);
                configuration.e(DtlsConfig.h, Arrays.asList(CertificateType.RAW_PUBLIC_KEY, CertificateType.X_509));
                configuration.e(DtlsConfig.ap, DtlsRole.BOTH);
                configuration.e(DtlsConfig.aa, (Object) null);
                configuration.e(DtlsConfig.ac, 1500);
                configuration.e(DtlsConfig.m, (Object) null);
                configuration.e(DtlsConfig.s, 150000);
                configuration.c(DtlsConfig.at, 1800L, TimeUnit.SECONDS);
                configuration.a(DtlsConfig.z, DtlsConfig.y);
                configuration.e(DtlsConfig.y, 50000);
                configuration.e(DtlsConfig.v, 50000);
                configuration.e(DtlsConfig.x, 5000);
                configuration.e(DtlsConfig.q, 10);
                configuration.e(DtlsConfig.p, 8192);
                configuration.e(DtlsConfig.af, Integer.valueOf(iAvailableProcessors > 3 ? 2 : 1));
                configuration.e(DtlsConfig.k, Integer.valueOf(iAvailableProcessors));
                configuration.e(DtlsConfig.ah, (Object) null);
                configuration.e(DtlsConfig.ar, (Object) null);
                configuration.e(DtlsConfig.bi, false);
                configuration.e(DtlsConfig.l, ExtendedMasterSecretMode.ENABLED);
                configuration.e(DtlsConfig.bn, 30);
                configuration.e(DtlsConfig.be, true);
                configuration.e(DtlsConfig.bl, true);
                configuration.a(DtlsConfig.bo, DtlsConfig.bb);
                configuration.e(DtlsConfig.bb, true);
                configuration.e(DtlsConfig.bg, 0);
                configuration.e(DtlsConfig.bc, true);
                configuration.e(DtlsConfig.bk, false);
                configuration.e(DtlsConfig.az, true);
                configuration.e(DtlsConfig.ba, true);
                configuration.e(DtlsConfig.ai, true);
                configuration.e(DtlsConfig.ag, true);
                configuration.e(DtlsConfig.am, true);
                configuration.e(DtlsConfig.ab, (Object) null);
                configuration.e(DtlsConfig.i, (Object) null);
                configuration.e(DtlsConfig.n, (Object) null);
                configuration.e(DtlsConfig.au, (Object) null);
                configuration.e(DtlsConfig.f44541a, (Object) null);
                configuration.e(DtlsConfig.bf, (Object) null);
                configuration.e(DtlsConfig.aw, false);
                configuration.e(DtlsConfig.bh, true);
                configuration.e(DtlsConfig.al, false);
                configuration.e(DtlsConfig.ae, true);
                configuration.a(DtlsConfig.o, 0, TimeUnit.SECONDS);
                configuration.e(DtlsConfig.t, 0);
                configuration.e(DtlsConfig.as, DtlsConfig.e);
                configuration.e(DtlsConfig.ay, false);
                zyn.e((Class<?>) DtlsConfig.class, configuration);
            }
        };
        f44542b = moduleDefinitionsProvider;
        Configuration.e(moduleDefinitionsProvider);
    }
}
