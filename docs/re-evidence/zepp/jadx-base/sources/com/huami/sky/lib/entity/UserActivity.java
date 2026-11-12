package com.huami.sky.lib.entity;

import com.baidu.ocr.sdk.utils.LogUtil;
import defpackage.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\t\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/huami/sky/lib/entity/UserActivity;", "", "", "toString", "", "component1", "", "component2", "time", "activity", "copy", "hashCode", "other", "", "equals", "J", "getTime", "()J", LogUtil.I, "getActivity", "()I", "<init>", "(JI)V", "sky-lib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class UserActivity {
    private final int activity;
    private final long time;

    public UserActivity(long j, int i) {
        this.time = j;
        this.activity = i;
    }

    public static /* synthetic */ UserActivity copy$default(UserActivity userActivity, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = userActivity.time;
        }
        if ((i2 & 2) != 0) {
            i = userActivity.activity;
        }
        return userActivity.copy(j, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getActivity() {
        return this.activity;
    }

    @NotNull
    public final UserActivity copy(long time, int activity) {
        return new UserActivity(time, activity);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserActivity)) {
            return false;
        }
        UserActivity userActivity = (UserActivity) other;
        return this.time == userActivity.time && this.activity == userActivity.activity;
    }

    public final int getActivity() {
        return this.activity;
    }

    public final long getTime() {
        return this.time;
    }

    public int hashCode() {
        return (b.a(this.time) * 31) + this.activity;
    }

    @NotNull
    public String toString() {
        return "time=" + this.time + ",activity=" + this.activity;
    }
}
