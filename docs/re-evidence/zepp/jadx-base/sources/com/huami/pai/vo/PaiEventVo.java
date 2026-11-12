package com.huami.pai.vo;

import androidx.annotation.Keep;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eR)\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/huami/pai/vo/PaiEventVo;", "", "Ljava/util/ArrayList;", "Lcom/huami/pai/vo/PaiRemoteVo;", "Lkotlin/collections/ArrayList;", "items", "Ljava/util/ArrayList;", "getItems", "()Ljava/util/ArrayList;", "next", "Lcom/huami/pai/vo/PaiRemoteVo;", "getNext", "()Lcom/huami/pai/vo/PaiRemoteVo;", "<init>", "(Ljava/util/ArrayList;Lcom/huami/pai/vo/PaiRemoteVo;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class PaiEventVo {

    @NotNull
    private final ArrayList<PaiRemoteVo> items;

    @Nullable
    private final PaiRemoteVo next;

    public PaiEventVo(@NotNull ArrayList<PaiRemoteVo> arrayList, @Nullable PaiRemoteVo paiRemoteVo) {
        this.items = arrayList;
        this.next = paiRemoteVo;
    }

    @NotNull
    public final ArrayList<PaiRemoteVo> getItems() {
        return this.items;
    }

    @Nullable
    public final PaiRemoteVo getNext() {
        return this.next;
    }

    public /* synthetic */ PaiEventVo(ArrayList arrayList, PaiRemoteVo paiRemoteVo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(arrayList, (i & 2) != 0 ? null : paiRemoteVo);
    }
}
