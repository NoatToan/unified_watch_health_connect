package com.xiaomi.fitness.rn.share.bean;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/rn/share/bean/UserListDataBean;", "", "<init>", "()V", "uids", "Ljava/util/ArrayList;", "", "getUids", "()Ljava/util/ArrayList;", "setUids", "(Ljava/util/ArrayList;)V", "share_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UserListDataBean {

    @NotNull
    private ArrayList<String> uids = new ArrayList<>();

    @NotNull
    public final ArrayList<String> getUids() {
        return this.uids;
    }

    public final void setUids(@NotNull ArrayList<String> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.uids = arrayList;
    }
}
