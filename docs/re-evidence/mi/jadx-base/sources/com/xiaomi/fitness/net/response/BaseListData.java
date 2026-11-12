package com.xiaomi.fitness.net.response;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R&\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/net/response/BaseListData;", "T", "", "<init>", "()V", "dataList", "", "getDataList", "()Ljava/util/List;", "setDataList", "(Ljava/util/List;)V", "net_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class BaseListData<T> {

    @SerializedName("list")
    @Nullable
    private List<? extends T> dataList = CollectionsKt__CollectionsKt.emptyList();

    @Nullable
    public final List<T> getDataList() {
        return this.dataList;
    }

    public final void setDataList(@Nullable List<? extends T> list) {
        this.dataList = list;
    }
}
