package ft2;

import e23.p;
import java.io.IOException;
import o13.r;
import o53.b0;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import rs2.x;
import rs2.y;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
public final class d {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @e(c = "com.garmin.gfdi.util.UtilCoroutineKt$launchAndRespond$1", f = "UtilCoroutine.kt", l = {30}, m = "invokeSuspend")
    public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f73471a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f73472b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x f73473c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ y f73474d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ byte[] f73475e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(x xVar, y yVar, byte[] bArr, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f73473c = xVar;
            this.f73474d = yVar;
            this.f73475e = bArr;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f73473c, this.f73474d, this.f73475e, dVar);
            aVar.f73472b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            b0 b0Var;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f73471a;
            if (i14 == 0) {
                r.b(obj);
                b0 b0Var2 = (b0) this.f73472b;
                try {
                    x xVar = this.f73473c;
                    y yVar = this.f73474d;
                    byte[] bArr = this.f73475e;
                    this.f73472b = b0Var2;
                    this.f73471a = 1;
                    if (xVar.a(yVar, bArr, this) == aVar) {
                        return aVar;
                    }
                } catch (IOException unused) {
                    b0Var = b0Var2;
                    rs2.d.f154380a.getClass();
                    b0Var.getClass();
                    LoggerFactory.getLogger(rs2.d.a("Responder", -1L, b0Var, null)).warn("Failed to send response");
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b0Var = (b0) this.f73472b;
                try {
                    r.b(obj);
                } catch (IOException unused2) {
                    rs2.d.f154380a.getClass();
                    b0Var.getClass();
                    LoggerFactory.getLogger(rs2.d.a("Responder", -1L, b0Var, null)).warn("Failed to send response");
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @e(c = "com.garmin.gfdi.util.UtilCoroutineKt$launchSupervised$1", f = "UtilCoroutine.kt", l = {19}, m = "invokeSuspend")
    public static final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f73476a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p<b0, t13.d<? super Unit>, Object> f73477b;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
        @e(c = "com.garmin.gfdi.util.UtilCoroutineKt$launchSupervised$1$1", f = "UtilCoroutine.kt", l = {20}, m = "invokeSuspend")
        public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f73478a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f73479b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ p<b0, t13.d<? super Unit>, Object> f73480c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(p<? super b0, ? super t13.d<? super Unit>, ? extends Object> pVar, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f73480c = pVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                a aVar = new a(this.f73480c, dVar);
                aVar.f73479b = obj;
                return aVar;
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f73478a;
                if (i14 == 0) {
                    r.b(obj);
                    b0 b0Var = (b0) this.f73479b;
                    this.f73478a = 1;
                    if (this.f73480c.invoke(b0Var, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(p<? super b0, ? super t13.d<? super Unit>, ? extends Object> pVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f73477b = pVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f73477b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f73476a;
            if (i14 == 0) {
                r.b(obj);
                a aVar2 = new a(this.f73477b, null);
                this.f73476a = 1;
                if (ge1.b.Y(aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final void a(x xVar, b0 b0Var, y yVar, byte[] bArr) {
        xVar.getClass();
        b0Var.getClass();
        yVar.getClass();
        bArr.getClass();
        b(b0Var, new a(xVar, yVar, bArr, null));
    }

    public static final void b(b0 b0Var, p<? super b0, ? super t13.d<? super Unit>, ? extends Object> pVar) {
        b0Var.getClass();
        ge1.b.T(b0Var, null, null, new b(pVar, null), 3);
    }
}
