package s80;

import androidx.room.a0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import e23.p;
import o13.r;
import o53.b0;
import o53.s0;
import o53.z;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Ls80/i;", "Ly92/f;", "", "deviceUnitId", "Ly92/a;", "devicePasscodeCallback", "Ll80/a;", "deviceDelegate", "Lo53/z;", "ioDispatcher", "<init>", "(JLy92/a;Ll80/a;Lo53/z;)V", "a", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i extends y92.f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f157940j = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l80.a f157941h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final z f157942i;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.passcode.DevicePasscodeRepositoryImpl", f = "DevicePasscodeRepositoryImpl.kt", l = {20, 32}, m = "resetPasscode", v = 2)
    public static final class b extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f157943a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f157945c;

        public b(t13.d<? super b> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f157943a = obj;
            this.f157945c |= Integer.MIN_VALUE;
            return i.this.d(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Z"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.passcode.DevicePasscodeRepositoryImpl$resetPasscode$success$1", f = "DevicePasscodeRepositoryImpl.kt", l = {21}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements p<b0, t13.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f157946a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f157947b;

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            c cVar = i.this.new c(dVar);
            cVar.f157947b = obj;
            return cVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Boolean> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            y92.a aVar;
            b0 b0Var = (b0) this.f157947b;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f157946a;
            i iVar = i.this;
            if (i14 == 0) {
                r.b(obj);
                l80.a aVar3 = iVar.f157941h;
                long j8 = iVar.f195306a;
                this.f157947b = b0Var;
                this.f157946a = 1;
                obj = aVar3.D(j8, this);
                if (obj == aVar2) {
                    return aVar2;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            int i15 = i.f157940j;
            String str = "Reset wallet for device unit id: " + iVar.f195306a + " complete success[" + zBooleanValue + "]";
            i2.a aVar4 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar4.getClass();
            i2.a.b(a2Var, "DevicePasscodeRepository", str);
            if (zBooleanValue && (aVar = iVar.f195307b) != null) {
                aVar.e(iVar.f195306a);
            }
            return obj;
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(long j8, y92.a aVar, l80.a aVar2, z zVar) {
        super(j8, aVar, null, null, 12, null);
        aVar.getClass();
        aVar2.getClass();
        zVar.getClass();
        this.f157941h = aVar2;
        this.f157942i = zVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0088, code lost:
    
        if (r10 == r1) goto L25;
     */
    @Override // y92.f, y92.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(t13.d<? super Boolean> dVar) throws Throwable {
        b bVar;
        y92.a aVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i14 = bVar.f157945c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f157945c = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object objE0 = bVar.f157943a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f157945c;
        long j8 = this.f195306a;
        if (i15 == 0) {
            r.b(objE0);
            i2.a aVar3 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar3.getClass();
            i2.a.b(a2Var, "DevicePasscodeRepository", "Resetting passcode for device unit id: " + j8);
            c cVar = new c(null);
            bVar.f157945c = 1;
            objE0 = ge1.b.e0(this.f157942i, cVar, bVar);
            if (objE0 != aVar2) {
            }
            return aVar2;
        }
        if (i15 == 1) {
            r.b(objE0);
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objE0);
        }
        boolean zBooleanValue = ((Boolean) objE0).booleanValue();
        i2.a aVar4 = i2.f36769a;
        a2 a2Var2 = a2.GENERAL;
        aVar4.getClass();
        i2.a.b(a2Var2, "DevicePasscodeRepository", "Retry reset passcode for device unit id: " + j8 + " complete success[" + zBooleanValue + "]");
        if (zBooleanValue && (aVar = this.f195307b) != null) {
            aVar.e(j8);
        }
        return objE0;
        if (((Boolean) objE0).booleanValue()) {
            return Boolean.TRUE;
        }
        String strF = a0.f(j8, "Failed to reset passcode for device unit id: ", ", retrying");
        i2.a aVar5 = i2.f36769a;
        a2 a2Var3 = a2.GENERAL;
        aVar5.getClass();
        i2.a.b(a2Var3, "DevicePasscodeRepository", strF);
        bVar.f157945c = 2;
        objE0 = y92.f.l(this, bVar);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ls80/i$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public i(long j8, y92.a aVar, l80.a aVar2, z zVar, int i14, j jVar) {
        if ((i14 & 8) != 0) {
            x53.c cVar = s0.f129406a;
            zVar = x53.b.f189152a;
        }
        this(j8, aVar, aVar2, zVar);
    }
}
