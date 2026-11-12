package com.xiaomi.fitness.trail.data;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b6\u0018\u00002\u00020\u0001B\u001b\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/trail/data/RecordType;", "", "key", "", "name", "", "<init>", "(Ljava/lang/String;I)V", "getKey", "()Ljava/lang/String;", "getName", "()I", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class RecordType {

    @NotNull
    private final String key;
    private final int name;

    public /* synthetic */ RecordType(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    public final int getName() {
        return this.name;
    }

    private RecordType(String str, int i) {
        this.key = str;
        this.name = i;
    }
}
