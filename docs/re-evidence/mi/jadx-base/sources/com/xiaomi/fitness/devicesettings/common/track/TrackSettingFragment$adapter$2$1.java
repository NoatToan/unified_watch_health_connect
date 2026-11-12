package com.xiaomi.fitness.devicesettings.common.track;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public /* synthetic */ class TrackSettingFragment$adapter$2$1 extends FunctionReferenceImpl implements Function0<Unit> {
    public TrackSettingFragment$adapter$2$1(Object obj) {
        super(0, obj, TrackSettingFragment.class, "onSelectChange", "onSelectChange()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((TrackSettingFragment) this.receiver).onSelectChange();
    }
}
