package com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy;

import android.content.Context;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import java.util.List;
import lc.u0;
import o13.r;
import o53.b0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.j0;
import r53.k2;
import r53.o2;
import r53.p2;
import r53.q2;
import r53.s;
import r53.v;
import r53.z1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u0006J\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u0003J\u0015\u0010\u000f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\r¢\u0006\u0004\b\u001a\u0010\u0003J\r\u0010\u001b\u001a\u00020\r¢\u0006\u0004\b\u001b\u0010\u0003J\u0015\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001e0!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R \u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0&0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010 R#\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0&0!8\u0006¢\u0006\f\n\u0004\b)\u0010#\u001a\u0004\b*\u0010%R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00040\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010 R\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00040!8\u0006¢\u0006\f\n\u0004\b,\u0010#\u001a\u0004\b-\u0010%R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00040\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010 R\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00040!8\u0006¢\u0006\f\n\u0004\b/\u0010#\u001a\u0004\b0\u0010%R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\u00040\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010 R\u001d\u00102\u001a\b\u0012\u0004\u0012\u00020\u00040!8\u0006¢\u0006\f\n\u0004\b2\u0010#\u001a\u0004\b3\u0010%R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\u00040\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010 R\u001d\u00105\u001a\b\u0012\u0004\u0012\u00020\u00040!8\u0006¢\u0006\f\n\u0004\b5\u0010#\u001a\u0004\b6\u0010%R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010A\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010B¨\u0006C"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/developersettings/itemstrategy/DeviceFeaturesViewModel;", "Landroidx/lifecycle/u1;", "<init>", "()V", "", "isLocationAvailable", "()Z", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "isPreciseLocationAllowed", "(Landroid/content/Context;)Z", "isBackgroundLocationAllowed", "isLocationServiceEnabled", "", "getSupportedPairedDevices", "updateLocationStates", "(Landroid/content/Context;)V", "", "deviceId", "Lkotlin/Function1;", "callback", "resetOnboardingForDevice", "(JLe23/l;)V", "enabled", "enableAllPairedDevicesForActivityRecording", "(Z)V", "isAllPairedDevicesForActivityRecordingEnabled", "updateForceBasicFlowForLiveActivity", "setForceBasicFlowEnabled", "Lr53/z1;", "Lcom/garmin/android/apps/connectmobile/settings/developersettings/itemstrategy/DeviceFeatureUiState;", "_uiState", "Lr53/z1;", "Lr53/o2;", "uiState", "Lr53/o2;", "getUiState", "()Lr53/o2;", "", "Lsd2/f;", "_devices", "devices", "getDevices", "_locationAvailableState", "locationAvailableState", "getLocationAvailableState", "_backgroundLocationAllowedState", "backgroundLocationAllowedState", "getBackgroundLocationAllowedState", "_preciseLocationAllowedState", "preciseLocationAllowedState", "getPreciseLocationAllowedState", "_locationServiceEnabledState", "locationServiceEnabledState", "getLocationServiceEnabledState", "Llc0/h;", "isScreenlessDeviceUseCase", "Llc0/h;", "Lji1/a;", "checkLocationStatus", "Lji1/a;", "Ldl1/a;", "recordActivityRepository", "Ldl1/a;", "Lkg1/a;", "developerSettings", "Lkg1/a;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class DeviceFeaturesViewModel extends u1 {
    public static final int $stable = 8;
    private final z1<Boolean> _backgroundLocationAllowedState;
    private final z1<List<sd2.f>> _devices;
    private final z1<Boolean> _locationAvailableState;
    private final z1<Boolean> _locationServiceEnabledState;
    private final z1<Boolean> _preciseLocationAllowedState;
    private final z1<DeviceFeatureUiState> _uiState;
    private final o2<Boolean> backgroundLocationAllowedState;
    private final ji1.a checkLocationStatus;
    private final kg1.a developerSettings;
    private final o2<List<sd2.f>> devices;
    private final lc0.h isScreenlessDeviceUseCase;
    private final o2<Boolean> locationAvailableState;
    private final o2<Boolean> locationServiceEnabledState;
    private final o2<Boolean> preciseLocationAllowedState;
    private final dl1.a recordActivityRepository;
    private final o2<DeviceFeatureUiState> uiState;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.DeviceFeaturesViewModel$resetOnboardingForDevice$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.DeviceFeaturesViewModel$resetOnboardingForDevice$1", f = "DeviceFeaturesActivity.kt", l = {233}, m = "invokeSuspend", v = 2)
    public static final class AnonymousClass1 extends v13.i implements p<b0, t13.d<? super Unit>, Object> {
        final /* synthetic */ e23.l<Boolean, Unit> $callback;
        final /* synthetic */ long $deviceId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(long j8, e23.l<? super Boolean, Unit> lVar, t13.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$deviceId = j8;
            this.$callback = lVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return DeviceFeaturesViewModel.this.new AnonymousClass1(this.$deviceId, this.$callback, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((AnonymousClass1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.label;
            if (i14 == 0) {
                r.b(obj);
                dl1.a aVar2 = DeviceFeaturesViewModel.this.recordActivityRepository;
                long j8 = this.$deviceId;
                this.label = 1;
                obj = aVar2.c(j8, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            v2 v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                this.$callback.invoke(Boolean.TRUE);
            } else {
                if (!(v2Var instanceof v2.a)) {
                    u0.r();
                    return null;
                }
                this.$callback.invoke(Boolean.FALSE);
            }
            return Unit.INSTANCE;
        }
    }

    public DeviceFeaturesViewModel() {
        p2 p2VarA = q2.a(new DeviceFeatureUiState(false, false, 3, null));
        this._uiState = p2VarA;
        v vVar = new v(new DeviceFeaturesViewModel$uiState$1(this, null), p2VarA);
        w9.a aVarA = v1.a(this);
        k2.f150703a.getClass();
        this.uiState = s.K(vVar, aVarA, k2.a.f150706c, p2VarA.getValue());
        p2 p2VarA2 = q2.a(j0.f134944a);
        this._devices = p2VarA2;
        this.devices = s.d(p2VarA2);
        Boolean bool = Boolean.FALSE;
        p2 p2VarA3 = q2.a(bool);
        this._locationAvailableState = p2VarA3;
        this.locationAvailableState = s.d(p2VarA3);
        p2 p2VarA4 = q2.a(bool);
        this._backgroundLocationAllowedState = p2VarA4;
        this.backgroundLocationAllowedState = s.d(p2VarA4);
        p2 p2VarA5 = q2.a(bool);
        this._preciseLocationAllowedState = p2VarA5;
        this.preciseLocationAllowedState = s.d(p2VarA5);
        p2 p2VarA6 = q2.a(bool);
        this._locationServiceEnabledState = p2VarA6;
        this.locationServiceEnabledState = s.d(p2VarA6);
        this.isScreenlessDeviceUseCase = (lc0.h) KoinJavaComponent.get$default(lc0.h.class, null, null, 6, null);
        this.checkLocationStatus = (ji1.a) KoinJavaComponent.get$default(ji1.a.class, null, null, 6, null);
        this.recordActivityRepository = (dl1.a) KoinJavaComponent.get$default(dl1.a.class, null, null, 6, null);
        this.developerSettings = (kg1.a) KoinJavaComponent.get$default(kg1.a.class, null, null, 6, null);
        getSupportedPairedDevices();
    }

    private final boolean isBackgroundLocationAllowed(Context context) {
        j22.b.f96736a.getClass();
        if (j22.b.t()) {
            return j22.b.o(context, j22.a.f96720i.f96735b);
        }
        return true;
    }

    private final boolean isLocationAvailable() {
        return p005kotlin.jvm.internal.s.g(this.checkLocationStatus.a(), ji1.f.a.f98824a);
    }

    private final boolean isLocationServiceEnabled() {
        return ((mv0.e) KoinJavaComponent.get$default(mv0.e.class, null, null, 6, null)).a("DeviceFeaturesViewModel");
    }

    private final boolean isPreciseLocationAllowed(Context context) {
        j22.b bVar = j22.b.f96736a;
        String str = j22.a.f96719h.f96735b;
        bVar.getClass();
        return j22.b.o(context, str);
    }

    public final void enableAllPairedDevicesForActivityRecording(boolean enabled) {
        DeviceFeatureUiState value;
        this.developerSettings.q(enabled);
        z1<DeviceFeatureUiState> z1Var = this._uiState;
        do {
            value = z1Var.getValue();
        } while (!z1Var.b(value, DeviceFeatureUiState.copy$default(value, enabled, false, 2, null)));
    }

    public final o2<Boolean> getBackgroundLocationAllowedState() {
        return this.backgroundLocationAllowedState;
    }

    public final o2<List<sd2.f>> getDevices() {
        return this.devices;
    }

    public final o2<Boolean> getLocationAvailableState() {
        return this.locationAvailableState;
    }

    public final o2<Boolean> getLocationServiceEnabledState() {
        return this.locationServiceEnabledState;
    }

    public final o2<Boolean> getPreciseLocationAllowedState() {
        return this.preciseLocationAllowedState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: JadxRuntimeException in pass: FinishTypeInference
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r1v2 boolean
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
        */
    public final void getSupportedPairedDevices() {
        /*
            r7 = this;
            r53.z1<java.util.List<sd2.f>> r0 = r7._devices
        L2:
            java.lang.Object r1 = r0.getValue()
            r2 = r1
            java.util.List r2 = (java.util.List) r2
            rd2.f r2 = rd2.f.a()
            rd2.j r2 = r2.f152045a
            r2.getClass()
            java.util.ArrayList r2 = rd2.j.e()
            if (r2 == 0) goto L3a
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L21:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L3c
            java.lang.Object r4 = r2.next()
            r5 = r4
            sd2.f r5 = (sd2.f) r5
            lc0.h r6 = r7.isScreenlessDeviceUseCase
            boolean r5 = r6.a(r5)
            if (r5 == 0) goto L21
            r3.add(r4)
            goto L21
        L3a:
            p13.j0 r3 = p13.j0.f134944a
        L3c:
            boolean r1 = r0.b(r1, r3)
            if (r1 == 0) goto L2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.DeviceFeaturesViewModel.getSupportedPairedDevices():void");
    }

    public final o2<DeviceFeatureUiState> getUiState() {
        return this.uiState;
    }

    public final void isAllPairedDevicesForActivityRecordingEnabled() {
        DeviceFeatureUiState value;
        boolean zN = this.developerSettings.N();
        z1<DeviceFeatureUiState> z1Var = this._uiState;
        do {
            value = z1Var.getValue();
        } while (!z1Var.b(value, DeviceFeatureUiState.copy$default(value, zN, false, 2, null)));
    }

    public final void resetOnboardingForDevice(long deviceId, e23.l<? super Boolean, Unit> callback) {
        callback.getClass();
        ge1.b.T(v1.a(this), null, null, new AnonymousClass1(deviceId, callback, null), 3);
    }

    public final void setForceBasicFlowEnabled(boolean enabled) {
        DeviceFeatureUiState value;
        this.developerSettings.w(enabled);
        z1<DeviceFeatureUiState> z1Var = this._uiState;
        do {
            value = z1Var.getValue();
        } while (!z1Var.b(value, DeviceFeatureUiState.copy$default(value, false, enabled, 1, null)));
    }

    public final void updateForceBasicFlowForLiveActivity() {
        DeviceFeatureUiState value;
        boolean zH = this.developerSettings.H();
        z1<DeviceFeatureUiState> z1Var = this._uiState;
        do {
            value = z1Var.getValue();
        } while (!z1Var.b(value, DeviceFeatureUiState.copy$default(value, false, zH, 1, null)));
    }

    public final void updateLocationStates(Context context) {
        Boolean value;
        Boolean value2;
        Boolean value3;
        Boolean value4;
        context.getClass();
        z1<Boolean> z1Var = this._locationAvailableState;
        do {
            value = z1Var.getValue();
            value.getClass();
        } while (!z1Var.b(value, Boolean.valueOf(isLocationAvailable())));
        z1<Boolean> z1Var2 = this._preciseLocationAllowedState;
        do {
            value2 = z1Var2.getValue();
            value2.getClass();
        } while (!z1Var2.b(value2, Boolean.valueOf(isPreciseLocationAllowed(context))));
        z1<Boolean> z1Var3 = this._backgroundLocationAllowedState;
        do {
            value3 = z1Var3.getValue();
            value3.getClass();
        } while (!z1Var3.b(value3, Boolean.valueOf(isBackgroundLocationAllowed(context))));
        z1<Boolean> z1Var4 = this._locationServiceEnabledState;
        do {
            value4 = z1Var4.getValue();
            value4.getClass();
        } while (!z1Var4.b(value4, Boolean.valueOf(isLocationServiceEnabled())));
    }
}
