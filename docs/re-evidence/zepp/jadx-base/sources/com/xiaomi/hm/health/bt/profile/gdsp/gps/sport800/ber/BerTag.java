package com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.ber;

import com.huami.passport.Configs;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\n\u001a\u00020\u0006J\u0006\u0010\u000b\u001a\u00020\u0004R\u001f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\f8\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/ber/BerTag;", "", "", "byte", "", "feed", "", "needContinue", "", "getNumber", "isComplete", Configs.Params.RESET, "", "a", "Ljava/util/List;", "getByteArray", "()Ljava/util/List;", "byteArray", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class BerTag {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final List<Byte> byteArray = new ArrayList();

    public final void feed(byte b) {
        this.byteArray.add(Byte.valueOf(b));
    }

    @NotNull
    public final List<Byte> getByteArray() {
        return this.byteArray;
    }

    public final int getNumber() throws BerTagException {
        if (needContinue()) {
            throw new BerTagException("Tag not complete while extract number");
        }
        int i = 1;
        if (this.byteArray.size() == 1) {
            return ((Number) CollectionsKt.first((List) this.byteArray)).byteValue() & 31;
        }
        int iByteValue = 0;
        int size = this.byteArray.size();
        if (1 < size) {
            while (true) {
                int i2 = i + 1;
                iByteValue = (iByteValue << ((i - 1) * 7)) | (this.byteArray.get(i).byteValue() & 127);
                if (i2 >= size) {
                    break;
                }
                i = i2;
            }
        }
        return iByteValue;
    }

    public final boolean isComplete() {
        return !needContinue();
    }

    public final boolean needContinue() {
        if (this.byteArray.isEmpty()) {
            return true;
        }
        if (this.byteArray.size() == 1) {
            return (((Number) CollectionsKt.first((List) this.byteArray)).byteValue() & 31) == 31;
        }
        return (((Number) CollectionsKt.last((List) this.byteArray)).byteValue() & 128) == 128;
    }

    public final void reset() {
        this.byteArray.clear();
    }
}
