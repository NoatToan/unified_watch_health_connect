package com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.ber;

import com.huami.passport.Configs;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\n\u001a\u00020\u0006J\u0006\u0010\u000b\u001a\u00020\u0002R\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/ber/BerLength;", "", "", "a", "", "byte", "", "feed", "", "needContinue", Configs.Params.RESET, "getLength", "", "Ljava/util/List;", "getByteArray", "()Ljava/util/List;", "byteArray", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class BerLength {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final List<Byte> byteArray = new ArrayList();

    private final int a() {
        int iByteValue = ((Number) CollectionsKt.first((List) this.byteArray)).byteValue() & 255;
        if ((iByteValue & 128) == 128) {
            return 1 + (iByteValue & 127);
        }
        return 1;
    }

    public final void feed(byte b) {
        this.byteArray.add(Byte.valueOf(b));
    }

    @NotNull
    public final List<Byte> getByteArray() {
        return this.byteArray;
    }

    public final int getLength() throws BerTagException {
        if (needContinue()) {
            throw new BerTagException("Tag not complete while extract number");
        }
        int iByteValue = ((Number) CollectionsKt.first((List) this.byteArray)).byteValue() & 255;
        int iByteValue2 = 0;
        if ((iByteValue & 128) != 128) {
            return iByteValue;
        }
        int i = iByteValue & 127;
        int i2 = 1;
        if (!(i <= 3)) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            throw new IllegalStateException(String.format("the len is more then 3 [%d]", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1)).toString());
        }
        int i3 = i + 1;
        if (1 >= i3) {
            return 0;
        }
        while (true) {
            int i4 = i2 + 1;
            iByteValue2 = (iByteValue2 << 8) | (this.byteArray.get(i2).byteValue() & 255);
            if (i4 >= i3) {
                return iByteValue2;
            }
            i2 = i4;
        }
    }

    public final boolean needContinue() {
        return this.byteArray.isEmpty() || a() > this.byteArray.size();
    }

    public final void reset() {
        this.byteArray.clear();
    }
}
