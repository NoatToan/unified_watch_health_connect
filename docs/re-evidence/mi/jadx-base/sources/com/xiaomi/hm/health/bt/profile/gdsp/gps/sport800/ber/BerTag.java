package com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.ber;

import com.xiaomi.fit.fitness.persist.db.FitnessDBConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005J\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\u000eJ\u0006\u0010\u0010\u001a\u00020\tR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/sport800/ber/BerTag;", "", "()V", "byteArray", "", "", "getByteArray", "()Ljava/util/List;", "feed", "", "byte", "getNumber", "", FitnessDBConstants.COL_IS_SLEEP_COMPLETE, "", "needContinue", "reset", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class BerTag {

    @NotNull
    private final List<Byte> byteArray = new ArrayList();

    public final void feed(byte b2) {
        this.byteArray.add(Byte.valueOf(b2));
    }

    @NotNull
    public final List<Byte> getByteArray() {
        return this.byteArray;
    }

    public final int getNumber() throws BerTagException {
        if (needContinue()) {
            throw new BerTagException("Tag not complete while extract number");
        }
        if (this.byteArray.size() == 1) {
            return ((Number) CollectionsKt___CollectionsKt.first((List) this.byteArray)).byteValue() & 31;
        }
        int size = this.byteArray.size();
        int iByteValue = 0;
        for (int i = 1; i < size; i++) {
            iByteValue = (iByteValue << ((i - 1) * 7)) | (this.byteArray.get(i).byteValue() & 127);
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
            return (((Number) CollectionsKt___CollectionsKt.first((List) this.byteArray)).byteValue() & 31) == 31;
        }
        return (((Number) CollectionsKt___CollectionsKt.last((List) this.byteArray)).byteValue() & 128) == 128;
    }

    public final void reset() {
        this.byteArray.clear();
    }
}
