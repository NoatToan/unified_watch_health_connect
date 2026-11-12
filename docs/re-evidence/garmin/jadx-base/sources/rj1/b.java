package rj1;

import com.garmin.proto.generated.GDILTEProto;
import e23.p;
import o13.m;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p92.y;
import t13.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\tB\u001b\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lrj1/b;", "Lqi1/b;", "Lpj1/a;", "", "deviceId", "Lcom/garmin/proto/generated/GDILTEProto$LTEService;", "lteService", "<init>", "(Ljava/lang/Long;Lcom/garmin/proto/generated/GDILTEProto$LTEService;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends pj1.a implements qi1.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Long f152999d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final GDILTEProto.LTEService f153000e;

    /* JADX INFO: renamed from: rj1.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.settings.safetyfeatures.handlers.AssistancePlusValidationHandler$processDeviceRequest$1", f = "AssistancePlusValidationHandler.kt", l = {30, 31}, m = "invokeSuspend", v = 2)
    public static final class C2892b extends i implements p<b0, d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f153001a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f153002b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ GDILTEProto.AssistancePlusValidationNotification f153004d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2892b(GDILTEProto.AssistancePlusValidationNotification assistancePlusValidationNotification, d<? super C2892b> dVar) {
            super(2, dVar);
            this.f153004d = assistancePlusValidationNotification;
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            C2892b c2892b = b.this.new C2892b(this.f153004d, dVar);
            c2892b.f153002b = obj;
            return c2892b;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return ((C2892b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
        
            if (r0.b(r12, r3, r11) == r2) goto L24;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Exception exc;
            C2892b c2892b;
            Exception e4;
            GDILTEProto.AssistancePlusValidationNotification assistancePlusValidationNotification = this.f153004d;
            b0 b0Var = (b0) this.f153002b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f153001a;
            if (i14 != 0) {
                try {
                    if (i14 == 1) {
                        r.b(obj);
                        c2892b = this;
                    } else {
                        if (i14 != 2) {
                            h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        r.b(obj);
                    }
                } catch (Exception e14) {
                    exc = e14;
                    String strD = com.airbnb.lottie.animation.keyframe.a.d(exc, "processDeviceRequest :: Error occured while processing the request ");
                    y.f136664a.getClass();
                    y.a.c("AssistancePlusValidationHandler", strD);
                }
                return Unit.INSTANCE;
            }
            r.b(obj);
            try {
                b bVar = b.this;
                double dB = lb2.b.b(assistancePlusValidationNotification.getLocation().getLat());
                double dB2 = lb2.b.b(assistancePlusValidationNotification.getLocation().getLon());
                this.f153002b = b0Var;
                this.f153001a = 1;
                c2892b = this;
                try {
                    obj = bVar.c(dB, dB2, c2892b);
                    if (obj == aVar) {
                    }
                    return aVar;
                } catch (Exception e15) {
                    e4 = e15;
                    exc = e4;
                    String strD2 = com.airbnb.lottie.animation.keyframe.a.d(exc, "processDeviceRequest :: Error occured while processing the request ");
                    y.f136664a.getClass();
                    y.a.c("AssistancePlusValidationHandler", strD2);
                }
            } catch (Exception e16) {
                e4 = e16;
                exc = e4;
                String strD3 = com.airbnb.lottie.animation.keyframe.a.d(exc, "processDeviceRequest :: Error occured while processing the request ");
                y.f136664a.getClass();
                y.a.c("AssistancePlusValidationHandler", strD3);
            }
            String str = (String) obj;
            if (str != null) {
                b bVar2 = b.this;
                Long l14 = bVar2.f152999d;
                c2892b.f153002b = b0Var;
                c2892b.f153001a = 2;
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
        m.b(new ri1.b(8));
    }

    public b(Long l14, GDILTEProto.LTEService lTEService) {
        this.f152999d = l14;
        this.f153000e = lTEService;
    }

    @Override // qi1.b
    public final void a() {
        GDILTEProto.LTEService lTEService = this.f153000e;
        GDILTEProto.AssistancePlusValidationNotification apValidationNotification = lTEService != null ? lTEService.getApValidationNotification() : null;
        if (apValidationNotification == null || !apValidationNotification.hasLocation()) {
            return;
        }
        ge1.b.T(this.f137880a, null, null, new C2892b(apValidationNotification, null), 3);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lrj1/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
