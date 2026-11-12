package il2;

import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.device.filetransfer.legacy.SyncDataQueryCallbackShim$refreshShouldUploadFiles$1$1", f = "SyncDataQueryCallbackShim.kt", l = {97}, m = "invokeSuspend")
public final class f extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f94045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f94046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ dl2.b f94047c;

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @v13.e(c = "com.garmin.device.filetransfer.legacy.SyncDataQueryCallbackShim$refreshShouldUploadFiles$1$1$1", f = "SyncDataQueryCallbackShim.kt", l = {97}, m = "invokeSuspend")
    public static final class a extends v13.i implements e23.l<t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f94048a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ dl2.b f94049b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(dl2.b bVar, t13.d<? super a> dVar) {
            super(1, dVar);
            this.f94049b = bVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new a(this.f94049b, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super Unit> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f94048a;
            if (i14 == 0) {
                r.b(obj);
                this.f94048a = 1;
                if (hl2.b.c(this.f94049b, this, 3) == aVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e eVar, dl2.b bVar, t13.d<? super f> dVar) {
        super(2, dVar);
        this.f94046b = eVar;
        this.f94047c = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new f(this.f94046b, this.f94047c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f94045a;
        if (i14 == 0) {
            r.b(obj);
            cz2.c<Unit> cVar = this.f94046b.f94042d;
            a aVar2 = new a(this.f94047c, null);
            this.f94045a = 1;
            if (cVar.a(aVar2, this) == aVar) {
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
