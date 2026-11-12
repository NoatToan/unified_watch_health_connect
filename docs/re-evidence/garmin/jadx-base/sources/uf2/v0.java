package uf2;

import com.garmin.proto.generated.GDIEventSharingProto;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.livesessionview.communication.protobuf.LiveActivityProtobufDataHandler$subscribeEventSharing$1", f = "LiveActivityProtobufDataHandler.kt", l = {104}, m = "invokeSuspend", v = 2)
public final class v0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f170520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r0 f170521b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.livesessionview.communication.protobuf.LiveActivityProtobufDataHandler$subscribeEventSharing$1$1", f = "LiveActivityProtobufDataHandler.kt", l = {106}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f170522a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ r0 f170523b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(r0 r0Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f170523b = r0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f170523b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f170522a;
            try {
                if (i14 == 0) {
                    o13.r.b(obj);
                    r0 r0Var = this.f170523b;
                    kk2.a aVar2 = r0Var.f170472c;
                    GDIEventSharingProto.AlertType alertType = GDIEventSharingProto.AlertType.LIVE_SESSION;
                    this.f170522a = 1;
                    if (aVar2.c(alertType, r0Var, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                zg2.c.f204692a.getClass();
                zg2.c.a("LiveActivityProtobufDataHandler", "subscribeEventSharing status success");
            } catch (Exception e4) {
                zg2.c.f204692a.getClass();
                zg2.c.b("LiveActivityProtobufDataHandler", "subscribeEventSharing error " + e4);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(r0 r0Var, t13.d<? super v0> dVar) {
        super(2, dVar);
        this.f170521b = r0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new v0(this.f170521b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((v0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f170520a;
        if (i14 == 0) {
            o13.r.b(obj);
            a aVar2 = new a(this.f170521b, null);
            this.f170520a = 1;
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
