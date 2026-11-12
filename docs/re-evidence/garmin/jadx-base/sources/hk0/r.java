package hk0;

import com.garmin.proto.generated.GDISmartProto;
import o53.b0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.gdiadapter.LivetrackConsentProtobufHandler$sendNotification$1", f = "LivetrackConsentProtobufHandler.kt", l = {73}, m = "invokeSuspend", v = 2)
public final class r extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f84088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f84089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ GDISmartProto.Smart f84090c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.gdiadapter.LivetrackConsentProtobufHandler$sendNotification$1$1", f = "LivetrackConsentProtobufHandler.kt", l = {75}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f84091a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ q f84092b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ GDISmartProto.Smart f84093c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(q qVar, GDISmartProto.Smart smart, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f84092b = qVar;
            this.f84093c = smart;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f84092b, this.f84093c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f84091a;
            q qVar = this.f84092b;
            try {
                if (i14 == 0) {
                    o13.r.b(obj);
                    dt2.g gVar = qVar.f84085c;
                    if (gVar == null) {
                        p005kotlin.jvm.internal.s.m("messenger");
                        throw null;
                    }
                    GDISmartProto.Smart smart = this.f84093c;
                    this.f84091a = 1;
                    if (gVar.c(smart, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
            } catch (Exception e4) {
                Logger logger = qVar.f84084b;
                if (logger == null) {
                    p005kotlin.jvm.internal.s.m("logger");
                    throw null;
                }
                logger.error("Failed to send message to the device", (Throwable) e4);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(q qVar, GDISmartProto.Smart smart, t13.d<? super r> dVar) {
        super(2, dVar);
        this.f84089b = qVar;
        this.f84090c = smart;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new r(this.f84089b, this.f84090c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((r) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f84088a;
        if (i14 == 0) {
            o13.r.b(obj);
            a aVar2 = new a(this.f84089b, this.f84090c, null);
            this.f84088a = 1;
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
