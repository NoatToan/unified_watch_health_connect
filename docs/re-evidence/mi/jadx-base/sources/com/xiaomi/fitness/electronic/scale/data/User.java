package com.xiaomi.fitness.electronic.scale.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/data/User;", "", "icon", "", "userId", "", "isDel", "", "<init>", "(ILjava/lang/String;Z)V", "getIcon", "()I", "setIcon", "(I)V", "getUserId", "()Ljava/lang/String;", "setUserId", "(Ljava/lang/String;)V", "()Z", "setDel", "(Z)V", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class User {
    private int icon;
    private boolean isDel;

    @NotNull
    private String userId;

    public User(int i, @NotNull String userId, boolean z) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.icon = i;
        this.userId = userId;
        this.isDel = z;
    }

    public final int getIcon() {
        return this.icon;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: isDel, reason: from getter */
    public final boolean getIsDel() {
        return this.isDel;
    }

    public final void setDel(boolean z) {
        this.isDel = z;
    }

    public final void setIcon(int i) {
        this.icon = i;
    }

    public final void setUserId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userId = str;
    }
}
