package com.xiaomi.fitness.rn.share.bean;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/rn/share/bean/UserListRequestBean;", "", "<init>", "()V", "list", "Ljava/util/ArrayList;", "Lcom/xiaomi/fitness/rn/share/bean/UserBean;", "getList", "()Ljava/util/ArrayList;", "setList", "(Ljava/util/ArrayList;)V", "share_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UserListRequestBean {

    @NotNull
    private ArrayList<UserBean> list = new ArrayList<>();

    @NotNull
    public final ArrayList<UserBean> getList() {
        return this.list;
    }

    public final void setList(@NotNull ArrayList<UserBean> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.list = arrayList;
    }
}
