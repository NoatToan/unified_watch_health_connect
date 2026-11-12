package com.huami.femalehealth.logiclib.calculation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/huami/femalehealth/logiclib/calculation/Milli;", "", "", "toString", "", "a", "J", "getValue", "()J", "value", "<init>", "(J)V", "logiclib_release"}, k = 1, mv = {1, 5, 1})
public final class Milli {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long value;

    public Milli(long j) {
        this.value = j;
    }

    public final long getValue() {
        return this.value;
    }

    @NotNull
    public String toString() {
        return Intrinsics.stringPlus("Milli -> ", Long.valueOf(this.value));
    }
}
