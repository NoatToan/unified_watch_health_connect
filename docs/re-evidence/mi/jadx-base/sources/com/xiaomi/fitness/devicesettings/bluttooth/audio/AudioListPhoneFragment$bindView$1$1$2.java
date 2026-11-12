package com.xiaomi.fitness.devicesettings.bluttooth.audio;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public /* synthetic */ class AudioListPhoneFragment$bindView$1$1$2 extends FunctionReferenceImpl implements Function2<Boolean, Integer, Unit> {
    public AudioListPhoneFragment$bindView$1$1$2(Object obj) {
        super(2, obj, AudioListPhoneFragment.class, "seekBarTouchListener", "seekBarTouchListener(ZLjava/lang/Integer;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Integer num) {
        invoke(bool.booleanValue(), num);
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z, Integer num) {
        ((AudioListPhoneFragment) this.receiver).seekBarTouchListener(z, num);
    }
}
