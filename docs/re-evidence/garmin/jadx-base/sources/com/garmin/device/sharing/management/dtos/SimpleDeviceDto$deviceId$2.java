package com.garmin.device.sharing.management.dtos;

import e23.a;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Long;"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class SimpleDeviceDto$deviceId$2 extends w implements a<Long> {
    final /* synthetic */ SimpleDeviceDto this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleDeviceDto$deviceId$2(SimpleDeviceDto simpleDeviceDto) {
        super(0);
        this.this$0 = simpleDeviceDto;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // e23.a
    public final Long invoke() {
        return Long.valueOf(this.this$0.getJson().optLong("deviceId"));
    }
}
