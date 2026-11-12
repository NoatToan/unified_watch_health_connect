package tn2;

import com.garmin.feature.garminpay.providers.felica.exception.server.FNValidateException;
import com.garmin.feature.garminpay.providers.felica.exception.server.NeedDeleteAndCallCenterException;
import com.garmin.feature.garminpay.providers.felica.exception.server.NeedDeleteException;
import com.garmin.feature.garminpay.providers.felica.exception.server.NeedRecoveryException;
import com.garmin.feature.garminpay.providers.felica.exception.server.NeedRefundAndCallCenterException;
import com.garmin.feature.garminpay.providers.felica.exception.server.ServerInUrgentMaintenanceException;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0007B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Ltn2/i;", "", "Lc83/a0;", "Lpn2/p;", "httpResponse", "<init>", "(Lc83/a0;)V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f165571e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c83.a0<? extends pn2.p<?>> f165572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o13.t f165573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o13.t f165574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o13.t f165575d;

    static {
        new a(null);
    }

    public i(c83.a0<? extends pn2.p<?>> a0Var) {
        a0Var.getClass();
        this.f165572a = a0Var;
        final int i14 = 0;
        this.f165573b = o13.m.b(new e23.a(this) { // from class: tn2.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f165567b;

            {
                this.f165567b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.a
            public final Object invoke() throws FNValidateException {
                int i15 = i14;
                i iVar = this.f165567b;
                switch (i15) {
                    case 0:
                        return (pn2.p) iVar.f165572a.f25746b;
                    case 1:
                        int i16 = i.f165571e;
                        pn2.p pVar = (pn2.p) iVar.f165573b.getValue();
                        if (pVar != null) {
                            return pVar.getHeader();
                        }
                        return null;
                    default:
                        int i17 = i.f165571e;
                        rn2.s sVarA = iVar.a();
                        if (sVarA != null) {
                            return sVarA;
                        }
                        throw new FNValidateException("No header");
                }
            }
        });
        final int i15 = 1;
        this.f165574c = o13.m.b(new e23.a(this) { // from class: tn2.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f165567b;

            {
                this.f165567b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.a
            public final Object invoke() throws FNValidateException {
                int i16 = i15;
                i iVar = this.f165567b;
                switch (i16) {
                    case 0:
                        return (pn2.p) iVar.f165572a.f25746b;
                    case 1:
                        int i17 = i.f165571e;
                        pn2.p pVar = (pn2.p) iVar.f165573b.getValue();
                        if (pVar != null) {
                            return pVar.getHeader();
                        }
                        return null;
                    default:
                        int i18 = i.f165571e;
                        rn2.s sVarA = iVar.a();
                        if (sVarA != null) {
                            return sVarA;
                        }
                        throw new FNValidateException("No header");
                }
            }
        });
        final int i16 = 2;
        this.f165575d = o13.m.b(new e23.a(this) { // from class: tn2.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f165567b;

            {
                this.f165567b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.a
            public final Object invoke() throws FNValidateException {
                int i17 = i16;
                i iVar = this.f165567b;
                switch (i17) {
                    case 0:
                        return (pn2.p) iVar.f165572a.f25746b;
                    case 1:
                        int i18 = i.f165571e;
                        pn2.p pVar = (pn2.p) iVar.f165573b.getValue();
                        if (pVar != null) {
                            return pVar.getHeader();
                        }
                        return null;
                    default:
                        int i19 = i.f165571e;
                        rn2.s sVarA = iVar.a();
                        if (sVarA != null) {
                            return sVarA;
                        }
                        throw new FNValidateException("No header");
                }
            }
        });
    }

    public static boolean b(c83.a0 a0Var) {
        int iCode = a0Var.f25745a.code();
        boolean z14 = false;
        if (100 <= iCode && iCode < 501) {
            z14 = true;
        }
        return !z14;
    }

    public final rn2.s a() {
        return (rn2.s) this.f165574c.getValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007b, code lost:
    
        if (r1.equals("6020") == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b2, code lost:
    
        if (r1.equals("5081") == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d1, code lost:
    
        return new com.garmin.feature.garminpay.providers.felica.exception.server.NeedCallCenterException(r0.getResultCode(), r0.getResultMessage());
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final FNValidateException c() {
        rn2.s sVar = (rn2.s) this.f165575d.getValue();
        String resultCode = sVar.getResultCode();
        switch (resultCode.hashCode()) {
            case 1626836:
                break;
            case 1656409:
                if (resultCode.equals("6010")) {
                    return new NeedRecoveryException(sVar.getResultCode(), sVar.getResultMessage());
                }
                return new FNValidateException("Other error in header", sVar.getResultCode(), sVar.getResultMessage());
            case 1656410:
                if (resultCode.equals("6011")) {
                    return new NeedDeleteException(sVar.getResultCode(), sVar.getResultMessage());
                }
                return new FNValidateException("Other error in header", sVar.getResultCode(), sVar.getResultMessage());
            case 1656440:
                break;
            case 1656441:
                if (resultCode.equals("6021")) {
                    return new NeedRefundAndCallCenterException(sVar.getResultCode(), sVar.getResultMessage());
                }
                return new FNValidateException("Other error in header", sVar.getResultCode(), sVar.getResultMessage());
            case 1656442:
                if (resultCode.equals("6022")) {
                    return new NeedDeleteAndCallCenterException(sVar.getResultCode(), sVar.getResultMessage());
                }
                return new FNValidateException("Other error in header", sVar.getResultCode(), sVar.getResultMessage());
            case 1745751:
                if (resultCode.equals("9000")) {
                    return new ServerInUrgentMaintenanceException("MFI server is unavailable. MFI server failed a process because it is under maintenance.", sVar.getResultCode(), sVar.getResultMessage());
                }
                return new FNValidateException("Other error in header", sVar.getResultCode(), sVar.getResultMessage());
            case 1754400:
                if (resultCode.equals("9900")) {
                    return new ServerInUrgentMaintenanceException("SP server is unavailable. MFI server failed a process because SP server is unavailable.", sVar.getResultCode(), sVar.getResultMessage());
                }
                return new FNValidateException("Other error in header", sVar.getResultCode(), sVar.getResultMessage());
            default:
                return new FNValidateException("Other error in header", sVar.getResultCode(), sVar.getResultMessage());
        }
    }

    public final boolean d() {
        rn2.s sVarA = a();
        return p005kotlin.jvm.internal.s.g(sVarA != null ? sVarA.getResultCode() : null, "0000");
    }

    public final boolean e() {
        rn2.s sVarA = a();
        if (p005kotlin.jvm.internal.s.g(sVarA != null ? sVarA.getResultCode() : null, "0030")) {
            return true;
        }
        rn2.s sVarA2 = a();
        return p005kotlin.jvm.internal.s.g(sVarA2 != null ? sVarA2.getResultCode() : null, "0032");
    }

    public final String toString() {
        return String.valueOf((pn2.p) this.f165573b.getValue());
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0006¨\u0006\u0016"}, d2 = {"Ltn2/i$a;", "", "<init>", "()V", "", "SUCCESS", "Ljava/lang/String;", "CONTINUE", "EXECUTE_COMMAND", "DEACTIVATE", "DO_END", "TIME_OUT_RETRY", "STATIC_RETRY", "RETRY", "IN_MAINTENANCE", "SP_SERVER_UNAVAILABLE", "INITIALIZE_CHIP_FAILED", "DO_RECOVER", "DO_DELETE", "CALL_CENTER", "CALL_CENTER_TO_REFUND", "CALL_CENTER_TO_DELETE", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
