package ya0;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.b2;
import r53.k2;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0012BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lya0/i0;", "Landroidx/lifecycle/u1;", "Lq90/c;", "pairedDevice", "Lp90/p;", "getPrimaryWearableAndTrainingInfoUseCase", "Ly80/w;", "deviceSettingsRepository", "Lrd2/j;", "deviceSelectQuery", "Lrd2/i;", "deviceSaveQuery", "Lf90/j;", "getRequiredConsentsUseCase", "Lo53/z;", "ioDispatcher", "<init>", "(Lq90/c;Lp90/p;Ly80/w;Lrd2/j;Lrd2/i;Lf90/j;Lo53/z;)V", "a", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i0 extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q90.c f195447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p90.p f195448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y80.w f195449c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final rd2.j f195450d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final rd2.i f195451e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f90.j f195452f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o53.z f195453g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p2 f195454h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b2 f195455i;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lq90/g;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.pairing.PairingSuccessViewModel$pairedDeviceInfo$1", f = "PairingSuccessViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<r53.j<? super q90.g>, t13.d<? super Unit>, Object> {
        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return i0.this.new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super q90.g> jVar, t13.d<? super Unit> dVar) {
            return ((b) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            i0 i0Var = i0.this;
            ge1.b.T(v1.a(i0Var), null, null, new j0(i0Var.f195447a.f143493a, i0Var, null), 3);
            x53.c cVar = s0.f129406a;
            ge1.b.T(o53.c0.a(x53.b.f189152a), null, null, new k0(i0Var, null), 3);
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    public i0(q90.c cVar, p90.p pVar, y80.w wVar, rd2.j jVar, rd2.i iVar, f90.j jVar2, o53.z zVar) {
        cVar.getClass();
        pVar.getClass();
        wVar.getClass();
        jVar.getClass();
        iVar.getClass();
        jVar2.getClass();
        zVar.getClass();
        this.f195447a = cVar;
        this.f195448b = pVar;
        this.f195449c = wVar;
        this.f195450d = jVar;
        this.f195451e = iVar;
        this.f195452f = jVar2;
        this.f195453g = zVar;
        p2 p2VarA = q2.a(null);
        this.f195454h = p2VarA;
        this.f195455i = r53.s.K(new r53.v(new b(null), p2VarA), v1.a(this), k2.a.a(k2.f150703a, 2), null);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lya0/i0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "CONNECTION_MODE_SETUP_CAPABILITY", "I", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public i0(q90.c cVar, p90.p pVar, y80.w wVar, rd2.j jVar, rd2.i iVar, f90.j jVar2, o53.z zVar, int i14, p005kotlin.jvm.internal.j jVar3) {
        o53.z zVar2;
        if ((i14 & 64) != 0) {
            x53.c cVar2 = s0.f129406a;
            zVar2 = x53.b.f189152a;
        } else {
            zVar2 = zVar;
        }
        this(cVar, pVar, wVar, jVar, iVar, jVar2, zVar2);
    }
}
