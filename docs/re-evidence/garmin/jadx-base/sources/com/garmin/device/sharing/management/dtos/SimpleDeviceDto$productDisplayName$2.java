package com.garmin.device.sharing.management.dtos;

import d53.u;
import e23.a;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class SimpleDeviceDto$productDisplayName$2 extends w implements a<String> {
    final /* synthetic */ SimpleDeviceDto this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleDeviceDto$productDisplayName$2(SimpleDeviceDto simpleDeviceDto) {
        super(0);
        this.this$0 = simpleDeviceDto;
    }

    @Override // e23.a
    public final String invoke() {
        String strOptString = this.this$0.getJson().optString("productDisplayName");
        if (strOptString == null || strOptString.length() == 0) {
            return null;
        }
        if (!u.y(strOptString, "Garmin ", false) && !u.y(strOptString, "GARMIN ", false)) {
            return strOptString;
        }
        String strSubstring = strOptString.substring(7, strOptString.length());
        int length = strSubstring.length() - 1;
        int i14 = 0;
        boolean z14 = false;
        while (i14 <= length) {
            boolean z15 = s.h(strSubstring.charAt(!z14 ? i14 : length), 32) <= 0;
            if (z14) {
                if (!z15) {
                    break;
                }
                length--;
            } else if (z15) {
                i14++;
            } else {
                z14 = true;
            }
        }
        return strSubstring.subSequence(i14, length + 1).toString();
    }
}
