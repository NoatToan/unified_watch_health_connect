package ct2;

import ds.e0;
import e23.l;
import e23.p;
import o13.r;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.gfdi.messages.MessageWriter$enqueue$2", f = "MessageWriter.kt", l = {130}, m = "invokeSuspend")
public final class g extends i implements l<t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f55548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f55549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f55550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ byte[] f55551d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.gfdi.messages.MessageWriter$enqueue$2$1", f = "MessageWriter.kt", l = {}, m = "invokeSuspend")
    public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f55552a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f55553b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ byte[] f55554c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f fVar, String str, byte[] bArr, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f55552a = fVar;
            this.f55553b = str;
            this.f55554c = bArr;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f55552a, this.f55553b, this.f55554c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Exception {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            try {
                this.f55552a.f55544c.debug(this.f55553b);
                it2.e eVar = this.f55552a.f55545d;
                byte[] bArr = this.f55554c;
                eVar.a(bArr.length, bArr);
                rs2.p pVar = this.f55552a.f55543b;
                if (pVar != null) {
                    pVar.b();
                }
                return Unit.INSTANCE;
            } catch (Exception e4) {
                ft2.c cVar = this.f55552a.f55546e;
                synchronized (cVar.f73455b) {
                    boolean z14 = cVar.f73456c;
                    f fVar = this.f55552a;
                    if (z14) {
                        rs2.p pVar2 = fVar.f55543b;
                        if (pVar2 != null) {
                            pVar2.a();
                        }
                        this.f55552a.f55544c.error("Sending message failed", (Throwable) e4);
                    } else {
                        e0.v("Sending message failed. Device disconnected: ", e4.getMessage(), fVar.f55544c);
                    }
                    throw e4;
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(f fVar, String str, byte[] bArr, t13.d<? super g> dVar) {
        super(1, dVar);
        this.f55549b = fVar;
        this.f55550c = str;
        this.f55551d = bArr;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new g(this.f55549b, this.f55550c, this.f55551d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super Unit> dVar) {
        return ((g) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f55548a;
        if (i14 == 0) {
            r.b(obj);
            x53.c cVar = s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            a aVar2 = new a(this.f55549b, this.f55550c, this.f55551d, null);
            this.f55548a = 1;
            if (ge1.b.e0(bVar, aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
