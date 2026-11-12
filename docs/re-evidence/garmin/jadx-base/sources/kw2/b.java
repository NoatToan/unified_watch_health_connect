package kw2;

import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.garmin.proto.generated.GDIRealtimeSettingsExtension;
import com.garmin.proto.generated.GDIRealtimeSettingsProto;
import com.garmin.proto.generated.GDISmartProto;
import dt2.g;
import e23.p;
import java.util.Objects;
import o13.r;
import o53.b0;
import o53.m0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 2, 0})
@v13.e(c = "com.garmin.realtimesettings.app.datahandler.servicecalls.base.DeviceServiceCalls$getRealtimeSettingsNotificationService$2", f = "DeviceServiceCalls.kt", l = {97}, m = "invokeSuspend", v = 1)
public final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f106987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f106988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f106989c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ GDIRealtimeSettingsProto.RealtimeSettingsService.Builder f106990d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 2, 0})
    @v13.e(c = "com.garmin.realtimesettings.app.datahandler.servicecalls.base.DeviceServiceCalls$getRealtimeSettingsNotificationService$2$1", f = "DeviceServiceCalls.kt", l = {104}, m = "invokeSuspend", v = 1)
    public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f106991a;

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return new a(dVar).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f106991a;
            if (i14 == 0) {
                r.b(obj);
                this.f106991a = 1;
                if (m0.b(AbstractComponentTracker.LINGERING_TIMEOUT, this) == aVar) {
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
    public b(d dVar, GDIRealtimeSettingsProto.RealtimeSettingsService.Builder builder, t13.d<? super b> dVar2) {
        super(2, dVar2);
        this.f106989c = dVar;
        this.f106990d = builder;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        b bVar = new b(this.f106989c, this.f106990d, dVar);
        bVar.f106988b = obj;
        return bVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        b0 b0Var = (b0) this.f106988b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f106987a;
        d dVar = this.f106989c;
        if (i14 == 0) {
            r.b(obj);
            dVar.getF115128g().getClass();
            dVar.f106998d = null;
            g gVar = dVar.f106995a;
            GDIRealtimeSettingsProto.RealtimeSettingsService realtimeSettingsServiceBuild = this.f106990d.build();
            GDISmartProto.Smart.Builder builderNewBuilder = GDISmartProto.Smart.newBuilder();
            builderNewBuilder.setExtension(GDIRealtimeSettingsExtension.realtimeSettingsService, realtimeSettingsServiceBuild);
            GDISmartProto.Smart smartBuild = builderNewBuilder.build();
            smartBuild.getClass();
            this.f106988b = b0Var;
            this.f106987a = 1;
            if (gVar.c(smartBuild, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        dVar.getF115128g().getClass();
        dVar.f106997c = ge1.b.T(b0Var, null, null, new a(null), 3);
        cx2.h f134312g = dVar.getF115128g();
        Objects.toString(dVar.f106997c);
        f134312g.getClass();
        return Unit.INSTANCE;
    }
}
