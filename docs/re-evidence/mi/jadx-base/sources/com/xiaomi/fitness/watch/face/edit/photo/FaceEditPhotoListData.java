package com.xiaomi.fitness.watch.face.edit.photo;

import com.xiaomi.fitness.watch.face.edit.FaceEditPickerBaseData;
import com.xiaomi.fitness.watch.face.export.data.FaceEditPhotoBean;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/watch/face/edit/photo/FaceEditPhotoListData;", "Lcom/xiaomi/fitness/watch/face/edit/FaceEditPickerBaseData;", "type", "", "title", "<init>", "(II)V", "getTitle", "()I", "photoId", "", "getPhotoId", "()Ljava/lang/String;", "setPhotoId", "(Ljava/lang/String;)V", "photoBeanList", "", "Lcom/xiaomi/fitness/watch/face/export/data/FaceEditPhotoBean;", "getPhotoBeanList", "()Ljava/util/List;", "setPhotoBeanList", "(Ljava/util/List;)V", "needMergeLocalList", "", "getNeedMergeLocalList", "()Z", "setNeedMergeLocalList", "(Z)V", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FaceEditPhotoListData extends FaceEditPickerBaseData {
    private boolean needMergeLocalList;

    @Nullable
    private List<FaceEditPhotoBean> photoBeanList;

    @NotNull
    private String photoId;
    private final int title;

    public FaceEditPhotoListData(int i, int i2) {
        super(i, i2);
        this.title = i2;
        this.photoId = "";
    }

    public final boolean getNeedMergeLocalList() {
        return this.needMergeLocalList;
    }

    @Nullable
    public final List<FaceEditPhotoBean> getPhotoBeanList() {
        return this.photoBeanList;
    }

    @NotNull
    public final String getPhotoId() {
        return this.photoId;
    }

    public final int getTitle() {
        return this.title;
    }

    public final void setNeedMergeLocalList(boolean z) {
        this.needMergeLocalList = z;
    }

    public final void setPhotoBeanList(@Nullable List<FaceEditPhotoBean> list) {
        this.photoBeanList = list;
    }

    public final void setPhotoId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.photoId = str;
    }
}
