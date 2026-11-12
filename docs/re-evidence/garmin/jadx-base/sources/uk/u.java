package uk;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
@v13.e(c = "com.dsi.vivoki.antble.gfdi.VivokiGfdiEmulator$handleFileData$1", f = "VivokiGfdiEmulator.kt", l = {398, 417}, m = "invokeSuspend")
public final class u extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o53.b0 f171751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o53.b0 f171752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ByteArrayOutputStream f171753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k.c f171754d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f171755e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k f171756f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ byte[] f171757g;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003¸\u0006\u0000"}, d2 = {"com/dsi/vivoki/antble/gfdi/VivokiGfdiEmulator$handleFileData$1$1$1", "Ltk/g;", "", "vivoki_release"}, k = 1, mv = {1, 4, 0})
    public static final class a implements tk.g<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ t13.d f171758a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ u f171759b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ byte[] f171760c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ByteArrayOutputStream f171761d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ long f171762e;

        public a(t13.d dVar, u uVar, byte[] bArr, k.c cVar, ByteArrayOutputStream byteArrayOutputStream, long j8) {
            this.f171758a = dVar;
            this.f171759b = uVar;
            this.f171760c = bArr;
            this.f171761d = byteArrayOutputStream;
            this.f171762e = j8;
        }

        @Override // tk.g
        public final void a(Serializable serializable) {
            ((Boolean) serializable).getClass();
            ByteArrayOutputStream byteArrayOutputStream = this.f171761d;
            byteArrayOutputStream.write(0);
            o72.t.e0(byteArrayOutputStream, this.f171762e + ((long) this.f171760c.length));
            Unit unit = Unit.INSTANCE;
            int i14 = o13.q.f128596b;
            this.f171758a.resumeWith(unit);
        }

        @Override // tk.g
        public final void b(String str) {
            this.f171759b.f171756f.f171699l.error(str);
            this.f171761d.write(0);
            Unit unit = Unit.INSTANCE;
            int i14 = o13.q.f128596b;
            this.f171758a.resumeWith(unit);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(k kVar, byte[] bArr, t13.d dVar) {
        super(2, dVar);
        this.f171756f = kVar;
        this.f171757g = bArr;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        dVar.getClass();
        u uVar = new u(this.f171756f, this.f171757g, dVar);
        uVar.f171751a = (o53.b0) obj;
        return uVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((u) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x009b, code lost:
    
        if (r15.b(androidx.media3.common.PlaybackException.ERROR_CODE_AUDIO_TRACK_OFFLOAD_INIT_FAILED, r1, r2, r14) == r0) goto L23;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        o53.b0 b0Var;
        ByteArrayOutputStream byteArrayOutputStream;
        k.c cVar;
        u uVar;
        k.c cVar2;
        ByteArrayOutputStream byteArrayOutputStream2;
        IOException iOException;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f171755e;
        k kVar = this.f171756f;
        try {
            if (i14 != 0) {
                if (i14 == 1) {
                    cVar2 = this.f171754d;
                    byteArrayOutputStream2 = this.f171753c;
                    b0Var = this.f171752b;
                    o13.r.b(obj);
                    uVar = this;
                } else {
                    if (i14 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    try {
                        o13.r.b(obj);
                    } catch (IOException e4) {
                        iOException = e4;
                        kVar.f171699l.error("Failed to send file data response", (Throwable) iOException);
                    }
                }
                return Unit.INSTANCE;
            }
            o13.r.b(obj);
            b0Var = this.f171751a;
            byteArrayOutputStream = new ByteArrayOutputStream();
            cVar = kVar.f171694g;
            kVar.f171694g = null;
            if (cVar == null) {
                kVar.f171699l.error("Not ready for file data");
                byteArrayOutputStream.write(2);
                uVar = this;
                c0 c0Var = kVar.f171691d;
                h hVar = h.ACK;
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArray.getClass();
                uVar.f171752b = b0Var;
                uVar.f171753c = byteArrayOutputStream;
                uVar.f171754d = cVar;
                uVar.f171755e = 2;
            } else {
                kVar.f171694g = null;
                byte[] bArr = this.f171757g;
                long jV = o72.t.V(3, bArr);
                byte[] bArrK = p13.s.k(7, bArr.length, bArr);
                this.f171752b = b0Var;
                this.f171753c = byteArrayOutputStream;
                this.f171754d = cVar;
                this.f171755e = 1;
                t13.i iVar = new t13.i(u13.f.b(this));
                uVar = this;
                kVar.f171697j.i(bArrK, cVar.f171706a, cVar.f171707b, new a(iVar, uVar, bArrK, cVar, byteArrayOutputStream, jV));
                if (iVar.a() != aVar) {
                    cVar2 = cVar;
                    byteArrayOutputStream2 = byteArrayOutputStream;
                }
            }
            return aVar;
            c0 c0Var2 = kVar.f171691d;
            h hVar2 = h.ACK;
            byte[] byteArray2 = byteArrayOutputStream.toByteArray();
            byteArray2.getClass();
            uVar.f171752b = b0Var;
            uVar.f171753c = byteArrayOutputStream;
            uVar.f171754d = cVar;
            uVar.f171755e = 2;
        } catch (IOException e14) {
            iOException = e14;
            kVar.f171699l.error("Failed to send file data response", (Throwable) iOException);
        }
        cVar = cVar2;
        byteArrayOutputStream = byteArrayOutputStream2;
    }
}
