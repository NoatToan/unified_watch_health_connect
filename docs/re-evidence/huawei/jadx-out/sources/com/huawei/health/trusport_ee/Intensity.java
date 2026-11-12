package com.huawei.health.trusport_ee;

import defpackage.enumEntries;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes32.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/huawei/health/trusport_ee/Intensity;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "LOW", "MEDIUM", "HIGH", "trusport_ee_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum Intensity {
    LOW(0),
    MEDIUM(1),
    HIGH(2);

    private static final /* synthetic */ EnumEntries $ENTRIES = enumEntries.c(values());
    private final int value;

    Intensity(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }

    public static EnumEntries<Intensity> getEntries() {
        return $ENTRIES;
    }
}
