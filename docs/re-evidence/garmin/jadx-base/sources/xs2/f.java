package xs2;

import e23.p;
import java.io.IOException;
import o13.r;
import o53.b0;
import o53.l1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import rs2.x;
import rs2.y;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lo53/l1;", "<anonymous>", "(Lo53/b0;)Lo53/l1;"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.gfdi.file.read.ReadFileFromDeviceTask$awaitIncomingData$3", f = "ReadFileFromDeviceTask.kt", l = {}, m = "invokeSuspend")
public final class f extends v13.i implements p<b0, t13.d<? super l1>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f192108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f192109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ byte[] f192110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f192111d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.gfdi.file.read.ReadFileFromDeviceTask$awaitIncomingData$3$1", f = "ReadFileFromDeviceTask.kt", l = {132}, m = "invokeSuspend")
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f192112a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x f192113b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ byte[] f192114c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ c f192115d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(x xVar, byte[] bArr, c cVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f192113b = xVar;
            this.f192114c = bArr;
            this.f192115d = cVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f192113b, this.f192114c, this.f192115d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f192112a;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    x xVar = this.f192113b;
                    y yVar = y.ACK;
                    byte[] bArr = this.f192114c;
                    this.f192112a = 1;
                    if (xVar.a(yVar, bArr, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
            } catch (IOException e4) {
                this.f192115d.f192097f.warn("Failed to send response", (Throwable) e4);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(x xVar, byte[] bArr, c cVar, t13.d<? super f> dVar) {
        super(2, dVar);
        this.f192109b = xVar;
        this.f192110c = bArr;
        this.f192111d = cVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        f fVar = new f(this.f192109b, this.f192110c, this.f192111d, dVar);
        fVar.f192108a = obj;
        return fVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super l1> dVar) {
        return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        return ge1.b.T((b0) this.f192108a, null, null, new a(this.f192109b, this.f192110c, this.f192111d, null), 3);
    }
}
