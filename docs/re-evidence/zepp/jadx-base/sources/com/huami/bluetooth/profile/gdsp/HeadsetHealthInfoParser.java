package com.huami.bluetooth.profile.gdsp;

import com.huami.bluetooth.profile.data.MultiPacketDataParser;
import com.huami.bluetooth.utils.ByteUtilsKt;
import com.xiaomi.hm.health.bt.debug.Debug;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \r2\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¨\u0006\u000e"}, d2 = {"Lcom/huami/bluetooth/profile/gdsp/HeadsetHealthInfoParser;", "Lcom/huami/bluetooth/profile/data/MultiPacketDataParser;", "", "Lcom/huami/bluetooth/profile/gdsp/HearingHealthDayData;", "", "rawData", "a", "Ljava/nio/ByteBuffer;", "byteBuffer", "b", "get", "<init>", "()V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class HeadsetHealthInfoParser extends MultiPacketDataParser<List<? extends HearingHealthDayData>> {

    @NotNull
    private static final String b = "HeadsetHealthInfoParser";

    private final List<HearingHealthDayData> a(byte[] rawData) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(rawData);
        ArrayList arrayList = new ArrayList();
        while (byteBufferWrap.position() < byteBufferWrap.limit()) {
            HearingHealthDayData hearingHealthDayDataB = b(byteBufferWrap);
            if (hearingHealthDayDataB != null) {
                arrayList.add(hearingHealthDayDataB);
            }
        }
        return arrayList;
    }

    private final HearingHealthDayData b(ByteBuffer byteBuffer) {
        try {
            byte[] bArr = new byte[4];
            byteBuffer.get(bArr);
            int int$default = ByteUtilsKt.toInt$default(bArr, 0, 0, 3, null);
            int i = byteBuffer.get() & 255;
            ArrayList arrayList = new ArrayList();
            if (i > 0 && i > 0) {
                int i2 = 0;
                do {
                    i2++;
                    byte b2 = byteBuffer.get();
                    byte[] bArr2 = new byte[4];
                    byteBuffer.get(bArr2);
                    arrayList.add(new HeadsetHealthMetadata(b2, ByteUtilsKt.toInt$default(bArr2, 0, 0, 3, null)));
                } while (i2 < i);
            }
            return new HearingHealthDayData(int$default, arrayList);
        } catch (Exception e) {
            Debug.fi(b, Intrinsics.stringPlus("parseHearingHealthDayData Exception: ", e.getMessage()));
            return null;
        }
    }

    @Override // com.huami.bluetooth.profile.data.MultiPacketDataParser, com.huami.bluetooth.profile.data.DataParser
    @Nullable
    public List<HearingHealthDayData> get() {
        byte[] byteArray = getData().toByteArray();
        if (byteArray.length == 0) {
            return null;
        }
        return a(byteArray);
    }
}
