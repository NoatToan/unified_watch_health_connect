package com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.ber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005J\u0006\u0010\u000b\u001a\u00020\fJ\b\u0010\r\u001a\u00020\fH\u0002J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\tR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/ber/BerLength;", "", "()V", "byteArray", "", "", "getByteArray", "()Ljava/util/List;", "feed", "", "byte", "getLength", "", "getLengthBytesCount", "needContinue", "", "reset", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class BerLength {

    @NotNull
    private final List<Byte> byteArray = new ArrayList();

    private final int getLengthBytesCount() {
        byte bByteValue = ((Number) CollectionsKt___CollectionsKt.first((List) this.byteArray)).byteValue();
        if ((bByteValue & 128) == 128) {
            return 1 + (bByteValue & 127);
        }
        return 1;
    }

    public final void feed(byte b2) {
        this.byteArray.add(Byte.valueOf(b2));
    }

    @NotNull
    public final List<Byte> getByteArray() {
        return this.byteArray;
    }

    public final int getLength() throws BerTagException {
        if (needContinue()) {
            throw new BerTagException("Tag not complete while extract number");
        }
        byte bByteValue = ((Number) CollectionsKt___CollectionsKt.first((List) this.byteArray)).byteValue();
        int iByteValue = bByteValue & 255;
        if ((bByteValue & 128) == 128) {
            int i = bByteValue & 127;
            if (i > 3) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str = String.format("the len is more then 3 [%d]", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
                throw new IllegalStateException(str.toString());
            }
            int i2 = i + 1;
            iByteValue = 0;
            for (int i3 = 1; i3 < i2; i3++) {
                iByteValue = (iByteValue << 8) | (this.byteArray.get(i3).byteValue() & 255);
            }
        }
        return iByteValue;
    }

    public final boolean needContinue() {
        return this.byteArray.isEmpty() || getLengthBytesCount() > this.byteArray.size();
    }

    public final void reset() {
        this.byteArray.clear();
    }
}
