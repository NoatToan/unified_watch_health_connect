package com.garmin.device.sharing.management.dtos;

import e23.a;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class SimpleDeviceDto$partNumberPartial$2 extends w implements a<String> {
    final /* synthetic */ SimpleDeviceDto this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleDeviceDto$partNumberPartial$2(SimpleDeviceDto simpleDeviceDto) {
        super(0);
        this.this$0 = simpleDeviceDto;
    }

    @Override // e23.a
    public final String invoke() {
        String partNumber = this.this$0.getPartNumber();
        if (partNumber == null || partNumber.length() == 0 || partNumber.length() == 4) {
            return partNumber;
        }
        try {
            int iH = d53.w.H(partNumber, "-", 0, false, 4);
            return partNumber.substring(iH + 2, iH + 6);
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }
}
