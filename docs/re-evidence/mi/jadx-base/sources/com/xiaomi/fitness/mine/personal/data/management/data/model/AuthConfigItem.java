package com.xiaomi.fitness.mine.personal.data.management.data.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/mine/personal/data/management/data/model/AuthConfigItem;", "", "authType", "", "appList", "", "Lcom/xiaomi/fitness/mine/personal/data/management/data/model/App;", "<init>", "(ILjava/util/List;)V", "getAuthType", "()I", "getAppList", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "mine_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AuthConfigItem {

    @SerializedName("app_list")
    @Nullable
    private final List<App> appList;

    @SerializedName("auth_type")
    private final int authType;

    public AuthConfigItem(int i, @Nullable List<App> list) {
        this.authType = i;
        this.appList = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AuthConfigItem copy$default(AuthConfigItem authConfigItem, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = authConfigItem.authType;
        }
        if ((i2 & 2) != 0) {
            list = authConfigItem.appList;
        }
        return authConfigItem.copy(i, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getAuthType() {
        return this.authType;
    }

    @Nullable
    public final List<App> component2() {
        return this.appList;
    }

    @NotNull
    public final AuthConfigItem copy(int authType, @Nullable List<App> appList) {
        return new AuthConfigItem(authType, appList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthConfigItem)) {
            return false;
        }
        AuthConfigItem authConfigItem = (AuthConfigItem) other;
        return this.authType == authConfigItem.authType && Intrinsics.areEqual(this.appList, authConfigItem.appList);
    }

    @Nullable
    public final List<App> getAppList() {
        return this.appList;
    }

    public final int getAuthType() {
        return this.authType;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.authType) * 31;
        List<App> list = this.appList;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        return "AuthConfigItem(authType=" + this.authType + ", appList=" + this.appList + ")";
    }

    public /* synthetic */ AuthConfigItem(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : list);
    }
}
