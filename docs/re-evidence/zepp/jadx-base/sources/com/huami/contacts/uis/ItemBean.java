package com.huami.contacts.uis;

import androidx.exifinterface.media.ExifInterface;
import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0080\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0007\u001a\u00028\u0000\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0003\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J*\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0007\u001a\u00028\u00002\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\r\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÖ\u0003R\u0019\u0010\u0007\u001a\u00028\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0004R\u0019\u0010\b\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/huami/contacts/uis/ItemBean;", ExifInterface.GPS_DIRECTION_TRUE, "", "component1", "()Ljava/lang/Object;", "", "component2", "t", "type", "copy", "(Ljava/lang/Object;I)Lcom/huami/contacts/uis/ItemBean;", "", "toString", "hashCode", "other", "", "equals", "a", "Ljava/lang/Object;", "getT", "b", LogUtil.I, "getType", "()I", "<init>", "(Ljava/lang/Object;I)V", "contacts_release"}, k = 1, mv = {1, 4, 1})
public final /* data */ class ItemBean<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final T t;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int type;

    public ItemBean(T t, int i) {
        this.t = t;
        this.type = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ItemBean copy$default(ItemBean itemBean, Object obj, int i, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            obj = itemBean.t;
        }
        if ((i2 & 2) != 0) {
            i = itemBean.type;
        }
        return itemBean.copy(obj, i);
    }

    public final T component1() {
        return this.t;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @NotNull
    public final ItemBean<T> copy(T t, int type) {
        return new ItemBean<>(t, type);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ItemBean)) {
            return false;
        }
        ItemBean itemBean = (ItemBean) other;
        return Intrinsics.areEqual(this.t, itemBean.t) && this.type == itemBean.type;
    }

    public final T getT() {
        return this.t;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        T t = this.t;
        return ((t != null ? t.hashCode() : 0) * 31) + this.type;
    }

    @NotNull
    public String toString() {
        return "ItemBean(t=" + this.t + ", type=" + this.type + ")";
    }
}
