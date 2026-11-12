package uf2;

import com.garmin.proto.generated.GDILiveSessionProto;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.livesessionview.communication.protobuf.LiveActivityProtobufDataHandler$liveSessionServiceRequestHandler$1$1", f = "LiveActivityProtobufDataHandler.kt", l = {303}, m = "invokeSuspend", v = 2)
public final class u0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f170509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r0 f170510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ rs2.c f170511c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ GDILiveSessionProto.LiveSessionService f170512d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.livesessionview.communication.protobuf.LiveActivityProtobufDataHandler$liveSessionServiceRequestHandler$1$1$1", f = "LiveActivityProtobufDataHandler.kt", l = {305}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public dt2.g f170513a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f170514b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ r0 f170515c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ rs2.c f170516d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ GDILiveSessionProto.LiveSessionService f170517e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(r0 r0Var, rs2.c cVar, GDILiveSessionProto.LiveSessionService liveSessionService, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f170515c = r0Var;
            this.f170516d = cVar;
            this.f170517e = liveSessionService;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f170515c, this.f170516d, this.f170517e, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f170514b;
            if (i14 == 0) {
                o13.r.b(obj);
                r0 r0Var = this.f170515c;
                dt2.g gVar = r0Var.f170476g;
                if (gVar != null) {
                    r0.b bVar = r0Var.f170473d;
                    this.f170513a = gVar;
                    this.f170514b = 1;
                    if (bVar.d(this.f170516d, gVar, this.f170517e, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(r0 r0Var, rs2.c cVar, GDILiveSessionProto.LiveSessionService liveSessionService, t13.d<? super u0> dVar) {
        super(2, dVar);
        this.f170510b = r0Var;
        this.f170511c = cVar;
        this.f170512d = liveSessionService;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new u0(this.f170510b, this.f170511c, this.f170512d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((u0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f170509a;
        if (i14 == 0) {
            o13.r.b(obj);
            a aVar2 = new a(this.f170510b, this.f170511c, this.f170512d, null);
            this.f170509a = 1;
            if (ge1.b.Y(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
