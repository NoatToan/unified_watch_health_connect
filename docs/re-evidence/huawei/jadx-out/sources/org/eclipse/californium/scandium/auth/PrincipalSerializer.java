package org.eclipse.californium.scandium.auth;

import defpackage.zyg;
import defpackage.zyk;
import defpackage.zyo;
import defpackage.zza;
import defpackage.zzf;
import defpackage.zzl;
import defpackage.zzs;
import java.security.GeneralSecurityException;
import java.security.Principal;

/* JADX INFO: loaded from: classes46.dex */
public final class PrincipalSerializer {
    public static void c(Principal principal, zzl zzlVar) {
        if (zzlVar == null) {
            throw new NullPointerException("Writer must not be null");
        }
        if (principal != null) {
            if (principal instanceof zyk) {
                c((zyk) principal, zzlVar);
                return;
            }
            if (principal instanceof zyg) {
                b((zyg) principal, zzlVar);
                return;
            } else if (principal instanceof zyo) {
                d((zyo) principal, zzlVar);
                return;
            } else {
                throw new IllegalArgumentException("unsupported principal type: " + principal.getClass().getName());
            }
        }
        zzlVar.d(ClientAuthenticationType.ANONYMOUS.code);
    }

    private static void c(zyk zykVar, zzl zzlVar) {
        zzlVar.d(ClientAuthenticationType.PSK.code);
        if (zykVar.a()) {
            zzlVar.d((byte) 1);
            zzs.a(zzlVar, zykVar.d(), 16);
            zzs.a(zzlVar, zykVar.e(), 16);
        } else {
            zzlVar.d((byte) 0);
            zzs.a(zzlVar, zykVar.e(), 16);
        }
    }

    private static void b(zyg zygVar, zzl zzlVar) {
        zzlVar.d(ClientAuthenticationType.RPK.code);
        zzlVar.a(zygVar.d());
    }

    private static void d(zyo zyoVar, zzl zzlVar) {
        zzlVar.d(ClientAuthenticationType.CERT.code);
        zzlVar.a(zyoVar.d());
    }

    public static Principal e(zzf zzfVar) throws GeneralSecurityException {
        if (zzfVar == null) {
            throw new NullPointerException("reader must not be null");
        }
        int i = AnonymousClass3.d[ClientAuthenticationType.fromCode(zzfVar.e()).ordinal()];
        if (i == 1) {
            return a(zzfVar);
        }
        if (i == 2) {
            return b(zzfVar);
        }
        if (i != 3) {
            return null;
        }
        return c(zzfVar);
    }

    /* JADX INFO: renamed from: org.eclipse.californium.scandium.auth.PrincipalSerializer$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[ClientAuthenticationType.values().length];
            d = iArr;
            try {
                iArr[ClientAuthenticationType.CERT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                d[ClientAuthenticationType.PSK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                d[ClientAuthenticationType.RPK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static zyo a(zzf zzfVar) {
        return zyo.e(zza.b(zzfVar));
    }

    private static zyk b(zzf zzfVar) {
        if (zzfVar.e() == 1) {
            return new zyk(zzs.e(zzfVar, 16), zzs.e(zzfVar, 16));
        }
        return new zyk(zzs.e(zzfVar, 16));
    }

    private static zyg c(zzf zzfVar) throws GeneralSecurityException {
        return new zyg(zza.b(zzfVar));
    }

    enum ClientAuthenticationType {
        ANONYMOUS((byte) 0),
        CERT((byte) 1),
        PSK((byte) 2),
        RPK((byte) -1);

        private byte code;

        ClientAuthenticationType(byte b2) {
            this.code = b2;
        }

        static ClientAuthenticationType fromCode(byte b2) {
            for (ClientAuthenticationType clientAuthenticationType : values()) {
                if (clientAuthenticationType.code == b2) {
                    return clientAuthenticationType;
                }
            }
            throw new IllegalArgumentException("unknown ClientAuthenticationType: " + ((int) b2));
        }
    }
}
