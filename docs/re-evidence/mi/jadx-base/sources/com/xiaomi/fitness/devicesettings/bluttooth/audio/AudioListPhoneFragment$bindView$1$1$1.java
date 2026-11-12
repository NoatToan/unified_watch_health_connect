package com.xiaomi.fitness.devicesettings.bluttooth.audio;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public /* synthetic */ class AudioListPhoneFragment$bindView$1$1$1 extends FunctionReferenceImpl implements Function2<Integer, Integer, Unit> {
    public AudioListPhoneFragment$bindView$1$1$1(Object obj) {
        super(2, obj, AudioListPhoneFragment.class, "clickListener", "clickListener(ILjava/lang/Integer;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2) throws IOException {
        invoke(num.intValue(), num2);
        return Unit.INSTANCE;
    }

    public final void invoke(int i, Integer num) throws IOException {
        ((AudioListPhoneFragment) this.receiver).clickListener(i, num);
    }
}
