package com.xiaomi.fitness.electronic.scale.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/data/AddUserIcon;", "Lcom/xiaomi/fitness/electronic/scale/data/Icon;", "did", "", "drawableId", "", "title", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AddUserIcon extends Icon {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddUserIcon(@NotNull String did, int i, @Nullable String str) {
        super(did, i, str);
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNull(str);
    }
}
