package com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy;

import e23.p;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/settings/developersettings/itemstrategy/DeviceFeatureUiState;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.DeviceFeaturesViewModel$uiState$1", f = "DeviceFeaturesActivity.kt", l = {}, m = "invokeSuspend", v = 2)
public final class DeviceFeaturesViewModel$uiState$1 extends v13.i implements p<r53.j<? super DeviceFeatureUiState>, t13.d<? super Unit>, Object> {
    int label;
    final /* synthetic */ DeviceFeaturesViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceFeaturesViewModel$uiState$1(DeviceFeaturesViewModel deviceFeaturesViewModel, t13.d<? super DeviceFeaturesViewModel$uiState$1> dVar) {
        super(2, dVar);
        this.this$0 = deviceFeaturesViewModel;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new DeviceFeaturesViewModel$uiState$1(this.this$0, dVar);
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super DeviceFeatureUiState> jVar, t13.d<? super Unit> dVar) {
        return ((DeviceFeaturesViewModel$uiState$1) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        this.this$0.isAllPairedDevicesForActivityRecordingEnabled();
        this.this$0.updateForceBasicFlowForLiveActivity();
        return Unit.INSTANCE;
    }
}
