package us2;

import e23.p;
import java.io.IOException;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import rs2.w;
import rs2.x;
import rs2.y;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.gfdi.core.Dispatcher$onRequestRead$2", f = "Dispatcher.kt", l = {}, m = "invokeSuspend")
public final class e extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f172485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f172486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ byte[] f172487c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b f172488d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ct2.h f172489e;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"us2/e$a", "Lrs2/x;", "gfdi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f172490a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ct2.h f172491b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f172492c;

        public a(b bVar, ct2.h hVar, int i14) {
            this.f172490a = bVar;
            this.f172491b = hVar;
            this.f172492c = i14;
        }

        @Override // rs2.x
        public final Object a(y yVar, byte[] bArr, t13.d<? super Unit> dVar) throws IOException {
            Object objB = this.f172490a.f172459b.b(this.f172491b, this.f172492c, yVar, bArr, dVar);
            return objB == u13.a.COROUTINE_SUSPENDED ? objB : Unit.INSTANCE;
        }

        @Override // rs2.x
        public final Object b(y yVar, t13.d<? super Unit> dVar) throws IOException {
            Object objA = a(yVar, new byte[0], dVar);
            return objA == u13.a.COROUTINE_SUSPENDED ? objA : Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(w wVar, int i14, byte[] bArr, b bVar, ct2.h hVar, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f172485a = wVar;
        this.f172486b = i14;
        this.f172487c = bArr;
        this.f172488d = bVar;
        this.f172489e = hVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e(this.f172485a, this.f172486b, this.f172487c, this.f172488d, this.f172489e, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        b bVar = this.f172488d;
        ct2.h hVar = this.f172489e;
        int i14 = this.f172486b;
        try {
            this.f172485a.onMessageReceived(i14, this.f172487c, new a(bVar, hVar, i14));
        } catch (Exception e4) {
            bVar.f172463f.error("RequestListener threw exception processing message", (Throwable) e4);
        }
        return Unit.INSTANCE;
    }
}
