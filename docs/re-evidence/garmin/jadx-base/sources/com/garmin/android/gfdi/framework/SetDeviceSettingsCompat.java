package com.garmin.android.gfdi.framework;

import com.garmin.gfdi.GfdiException;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import e23.p;
import o13.r;
import o53.b0;
import o53.e1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import vb.h;
import wb2.v;
import wb2.z;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\rR\u001c\u0010\u0010\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/garmin/android/gfdi/framework/SetDeviceSettingsCompat;", "", "Lrs2/c;", "deviceInfo", "Lvs2/a;", "currentTimeManager", "<init>", "(Lrs2/c;Lvs2/a;)V", "Lea2/a$d;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "setCurrentTime", "(Lea2/a$d;)V", "Lvs2/a;", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "logger", "Lorg/slf4j/Logger;", "garmin-fitness-device-interface_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SetDeviceSettingsCompat {
    private final vs2.a currentTimeManager;
    private final Logger logger;

    /* JADX INFO: renamed from: com.garmin.android.gfdi.framework.SetDeviceSettingsCompat$setCurrentTime$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.android.gfdi.framework.SetDeviceSettingsCompat$setCurrentTime$1", f = "SetDeviceSettingsCompat.kt", l = {23}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends i implements p<b0, t13.d<? super Unit>, Object> {
        final /* synthetic */ ea2.a.d $listener;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ea2.a.d dVar, t13.d<? super AnonymousClass1> dVar2) {
            super(2, dVar2);
            this.$listener = dVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return SetDeviceSettingsCompat.this.new AnonymousClass1(this.$listener, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((AnonymousClass1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.label;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    vs2.a aVar2 = SetDeviceSettingsCompat.this.currentTimeManager;
                    if (aVar2 == null) {
                        return Unit.INSTANCE;
                    }
                    this.label = 1;
                    if (aVar2.b(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                ea2.a.d dVar = this.$listener;
                if (dVar != null) {
                    z zVar = z.this;
                    int i15 = z.f184219x;
                    zVar.getClass();
                    zVar.Q(v.c.SUCCESSFUL);
                    zVar.X(null);
                }
            } catch (GfdiException e4) {
                SetDeviceSettingsCompat.this.logger.warn("Sync time failed", (Throwable) e4);
                ea2.a.d dVar2 = this.$listener;
                if (dVar2 != null) {
                    z zVar2 = z.this;
                    zVar2.f184159a.warn("******************** SYNC NON-FATAL FAILURE: Time: " + v.a.TIMED_OUT_WAITING_FOR_RESPONSE.f184192a);
                    int i16 = z.f184219x;
                    zVar2.Q(v.c.SUCCESSFUL);
                    zVar2.X(null);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public SetDeviceSettingsCompat(rs2.c cVar, vs2.a aVar) {
        cVar.getClass();
        this.currentTimeManager = aVar;
        this.logger = LoggerFactory.getLogger(oa2.d.b("GDI#", "SetDeviceSettingsCompat", cVar.getF92741e(), -1L, this));
    }

    public final void setCurrentTime(ea2.a.d listener) {
        this.logger.debug("setCurrentTime");
        ge1.b.T(e1.f129333a, null, null, new AnonymousClass1(listener, null), 3);
    }
}
