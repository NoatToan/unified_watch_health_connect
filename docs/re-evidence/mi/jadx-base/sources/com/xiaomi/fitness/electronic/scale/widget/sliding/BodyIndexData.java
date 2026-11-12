package com.xiaomi.fitness.electronic.scale.widget.sliding;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/widget/sliding/BodyIndexData;", "Ljava/io/Serializable;", "name", "", "index", "", "<init>", "(Ljava/lang/String;I)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getIndex", "()I", "setIndex", "(I)V", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BodyIndexData implements Serializable {
    private int index;

    @NotNull
    private String name;

    /* JADX WARN: Multi-variable type inference failed */
    public BodyIndexData() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    public final int getIndex() {
        return this.index;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final void setIndex(int i) {
        this.index = i;
    }

    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public BodyIndexData(@NotNull String name, int i) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.index = i;
    }

    public /* synthetic */ BodyIndexData(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i);
    }
}
