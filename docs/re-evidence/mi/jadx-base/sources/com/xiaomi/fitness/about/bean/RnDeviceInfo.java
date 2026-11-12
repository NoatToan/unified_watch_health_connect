package com.xiaomi.fitness.about.bean;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/about/bean/RnDeviceInfo;", "", "<init>", "()V", "bigPreview", "", "getBigPreview", "()Ljava/lang/String;", "setBigPreview", "(Ljava/lang/String;)V", "name", "getName", "setName", "about_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class RnDeviceInfo {

    @Nullable
    private String bigPreview;

    @NotNull
    private String name = "";

    @Nullable
    public final String getBigPreview() {
        return this.bigPreview;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final void setBigPreview(@Nullable String str) {
        this.bigPreview = str;
    }

    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }
}
