package hq0;

import com.garmin.proto.generated.GDISmartProto;
import dt2.g;
import e23.p;
import o13.r;
import o53.b0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import t13.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.incidentdetection.data.gdi.WellnessIncidentDetectionDataHandler$respondToIncidentDetection$1", f = "WellnessIncidentDetectionDataHandler.kt", l = {209}, m = "invokeSuspend", v = 2)
public final class c extends i implements p<b0, d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f85224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f85225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ GDISmartProto.Smart f85226c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.incidentdetection.data.gdi.WellnessIncidentDetectionDataHandler$respondToIncidentDetection$1$1", f = "WellnessIncidentDetectionDataHandler.kt", l = {212}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f85227a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f85228b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ GDISmartProto.Smart f85229c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b bVar, GDISmartProto.Smart smart, d<? super a> dVar) {
            super(2, dVar);
            this.f85228b = bVar;
            this.f85229c = smart;
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new a(this.f85228b, this.f85229c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            GDISmartProto.Smart smart = this.f85229c;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f85227a;
            b bVar = this.f85228b;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    Logger logger = bVar.f85202c;
                    if (logger == null) {
                        s.m("logger");
                        throw null;
                    }
                    logger.debug("respondToIncidentDetection " + smart);
                    g gVar = bVar.f85206g;
                    if (gVar != null) {
                        this.f85227a = 1;
                        if (gVar.c(smart, this) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i14 != 1) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
            } catch (Exception e4) {
                Logger logger2 = bVar.f85202c;
                if (logger2 == null) {
                    s.m("logger");
                    throw null;
                }
                logger2.error("Failed to send message to the device", (Throwable) e4);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, GDISmartProto.Smart smart, d<? super c> dVar) {
        super(2, dVar);
        this.f85225b = bVar;
        this.f85226c = smart;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new c(this.f85225b, this.f85226c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f85224a;
        if (i14 == 0) {
            r.b(obj);
            a aVar2 = new a(this.f85225b, this.f85226c, null);
            this.f85224a = 1;
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
