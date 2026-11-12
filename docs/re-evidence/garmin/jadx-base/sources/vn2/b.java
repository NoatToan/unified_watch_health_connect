package vn2;

import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import sy2.d;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\u0010\b\u0000\u0010\u0002*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001b\u0010\u000f\u001a\u00020\n8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u00108DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lvn2/b;", "Lsy2/d;", "PresenterType", "Lsy2/a;", "", "deviceUnitId", "<init>", "(J)V", "c", "J", "Ltn2/w;", "d", "Lo13/l;", "P0", "()Ltn2/w;", "deviceService", "Ltn2/r0;", JWKParameterNames.RSA_EXPONENT, "R0", "()Ltn2/r0;", "felicaService", "Ltn2/d0;", "Q0", "()Ltn2/d0;", "felicaDeviceServiceProvider", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class b<PresenterType extends sy2.d<?, ?>> extends sy2.a<PresenterType> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f178860f = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long deviceUnitId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final o13.l deviceService;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final o13.l felicaService;

    public b(long j8) {
        this.deviceUnitId = j8;
        final int i14 = 0;
        this.deviceService = o13.m.b(new e23.a(this) { // from class: vn2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f178857b;

            {
                this.f178857b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return b.N0(this.f178857b);
                    default:
                        return b.O0(this.f178857b);
                }
            }
        });
        final int i15 = 1;
        this.felicaService = o13.m.b(new e23.a(this) { // from class: vn2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f178857b;

            {
                this.f178857b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        return b.N0(this.f178857b);
                    default:
                        return b.O0(this.f178857b);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final tn2.w N0(b bVar) {
        return bVar.Q0().f165544e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final tn2.r0 O0(b bVar) {
        return bVar.Q0().f165543d;
    }

    private final tn2.d0 Q0() {
        ps2.w wVar = ps2.w.f140538a;
        long j8 = this.deviceUnitId;
        is2.b bVar = is2.b.FELICA;
        wVar.getClass();
        ps2.n nVarI = ps2.w.i(j8);
        ms2.d dVar = null;
        if (nVarI != null) {
            ms2.d dVarG = nVarI.g(bVar);
            if (dVarG instanceof tn2.d0) {
                dVar = dVarG;
            }
        }
        dVar.getClass();
        return (tn2.d0) dVar;
    }

    public final tn2.w P0() {
        return (tn2.w) this.deviceService.getValue();
    }

    public final tn2.r0 R0() {
        return (tn2.r0) this.felicaService.getValue();
    }
}
