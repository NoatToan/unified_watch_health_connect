package com.xiaomi.fitness.watch.face.edit.entity;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/watch/face/edit/entity/ImageArrayWrapper;", "", "list", "", "Lcom/xiaomi/fitness/watch/face/edit/entity/ImageArray;", "<init>", "(Ljava/util/List;)V", "getList", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ImageArrayWrapper {

    @Nullable
    private final List<ImageArray> list;

    /* JADX WARN: Multi-variable type inference failed */
    public ImageArrayWrapper() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ImageArrayWrapper copy$default(ImageArrayWrapper imageArrayWrapper, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = imageArrayWrapper.list;
        }
        return imageArrayWrapper.copy(list);
    }

    @Nullable
    public final List<ImageArray> component1() {
        return this.list;
    }

    @NotNull
    public final ImageArrayWrapper copy(@Nullable List<ImageArray> list) {
        return new ImageArrayWrapper(list);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ImageArrayWrapper) && Intrinsics.areEqual(this.list, ((ImageArrayWrapper) other).list);
    }

    @Nullable
    public final List<ImageArray> getList() {
        return this.list;
    }

    public int hashCode() {
        List<ImageArray> list = this.list;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @NotNull
    public String toString() {
        return "ImageArrayWrapper(list=" + this.list + ")";
    }

    public ImageArrayWrapper(@Nullable List<ImageArray> list) {
        this.list = list;
    }

    public /* synthetic */ ImageArrayWrapper(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }
}
