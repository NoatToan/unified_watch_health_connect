package com.huami.contacts.indexbar;

import androidx.core.graphics.drawable.IconCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÆ\u0003J)\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\t\u001a\u0004\u0018\u00010\u00018\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/huami/contacts/indexbar/IndexBean;", "", "", "component1", "", "component2", "component3", "str", "valid", IconCompat.EXTRA_OBJ, "copy", "toString", "", "hashCode", "other", "equals", "a", "Ljava/lang/String;", "getStr", "()Ljava/lang/String;", "b", "Z", "getValid", "()Z", "c", "Ljava/lang/Object;", "getObj", "()Ljava/lang/Object;", "<init>", "(Ljava/lang/String;ZLjava/lang/Object;)V", "contacts_release"}, k = 1, mv = {1, 4, 1})
public final /* data */ class IndexBean {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String str;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final boolean valid;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final Object obj;

    public IndexBean(@NotNull String str, boolean z, @Nullable Object obj) {
        this.str = str;
        this.valid = z;
        this.obj = obj;
    }

    public static /* synthetic */ IndexBean copy$default(IndexBean indexBean, String str, boolean z, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = indexBean.str;
        }
        if ((i & 2) != 0) {
            z = indexBean.valid;
        }
        if ((i & 4) != 0) {
            obj = indexBean.obj;
        }
        return indexBean.copy(str, z, obj);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStr() {
        return this.str;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getValid() {
        return this.valid;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Object getObj() {
        return this.obj;
    }

    @NotNull
    public final IndexBean copy(@NotNull String str, boolean valid, @Nullable Object obj) {
        return new IndexBean(str, valid, obj);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IndexBean)) {
            return false;
        }
        IndexBean indexBean = (IndexBean) other;
        return Intrinsics.areEqual(this.str, indexBean.str) && this.valid == indexBean.valid && Intrinsics.areEqual(this.obj, indexBean.obj);
    }

    @Nullable
    public final Object getObj() {
        return this.obj;
    }

    @NotNull
    public final String getStr() {
        return this.str;
    }

    public final boolean getValid() {
        return this.valid;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public int hashCode() {
        String str = this.str;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.valid;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        int i = (iHashCode + r2) * 31;
        Object obj = this.obj;
        return i + (obj != null ? obj.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "IndexBean(str=" + this.str + ", valid=" + this.valid + ", obj=" + this.obj + ")";
    }
}
