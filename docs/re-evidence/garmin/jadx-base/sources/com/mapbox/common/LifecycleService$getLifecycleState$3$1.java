package com.mapbox.common;

import e23.l;
import java.util.ArrayList;
import java.util.Collection;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import p13.y;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "hasForegroundService", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
public final class LifecycleService$getLifecycleState$3$1 extends w implements l<Boolean, Unit> {
    final /* synthetic */ l<LifecycleState, Unit> $callback;
    final /* synthetic */ LifecycleService $this_runCatching;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LifecycleService$getLifecycleState$3$1(LifecycleService lifecycleService, l<? super LifecycleState, Unit> lVar) {
        super(1);
        this.$this_runCatching = lifecycleService;
        this.$callback = lVar;
    }

    public final void invoke(boolean z14) {
        LifecycleService lifecycleService = this.$this_runCatching;
        if (z14) {
            LifecycleState lifecycleState = LifecycleState.FOREGROUND;
            lifecycleService.updateLifecycleState(lifecycleState);
            this.$callback.invoke(lifecycleState);
            return;
        }
        Collection collectionValues = lifecycleService.registeredActivities.values();
        collectionValues.getClass();
        Collection<LifecycleService.ActivityState> collection = collectionValues;
        LifecycleService lifecycleService2 = this.$this_runCatching;
        ArrayList arrayList = new ArrayList(y.r(collection, 10));
        for (LifecycleService.ActivityState activityState : collection) {
            activityState.getClass();
            arrayList.add(lifecycleService2.toLifecycleState(activityState));
        }
        LifecycleState[] lifecycleStateArr = {LifecycleState.FOREGROUND, LifecycleState.MOVING_FOREGROUND, LifecycleState.INACTIVE, LifecycleState.MOVING_BACKGROUND};
        for (int i14 = 0; i14 < 4; i14++) {
            LifecycleState lifecycleState2 = lifecycleStateArr[i14];
            if (arrayList.contains(lifecycleState2)) {
                this.$this_runCatching.updateLifecycleState(lifecycleState2);
                this.$callback.invoke(lifecycleState2);
                return;
            }
        }
        LifecycleService lifecycleService3 = this.$this_runCatching;
        LifecycleState lifecycleState3 = LifecycleState.BACKGROUND;
        lifecycleService3.updateLifecycleState(lifecycleState3);
        this.$callback.invoke(lifecycleState3);
    }

    @Override // e23.l
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.INSTANCE;
    }
}
