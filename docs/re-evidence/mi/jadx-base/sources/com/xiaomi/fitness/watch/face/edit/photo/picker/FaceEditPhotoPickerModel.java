package com.xiaomi.fitness.watch.face.edit.photo.picker;

import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableInt;
import com.xiaomi.fitness.baseui.BaseModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/watch/face/edit/photo/picker/FaceEditPhotoPickerModel;", "Lcom/xiaomi/fitness/baseui/BaseModel;", "<init>", "()V", "editMode", "Landroidx/databinding/ObservableBoolean;", "getEditMode", "()Landroidx/databinding/ObservableBoolean;", "setEditMode", "(Landroidx/databinding/ObservableBoolean;)V", "intentDeleteSize", "Landroidx/databinding/ObservableInt;", "getIntentDeleteSize", "()Landroidx/databinding/ObservableInt;", "setIntentDeleteSize", "(Landroidx/databinding/ObservableInt;)V", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FaceEditPhotoPickerModel extends BaseModel {

    @NotNull
    private ObservableBoolean editMode = new ObservableBoolean(false);

    @NotNull
    private ObservableInt intentDeleteSize = new ObservableInt(0);

    @NotNull
    public final ObservableBoolean getEditMode() {
        return this.editMode;
    }

    @NotNull
    public final ObservableInt getIntentDeleteSize() {
        return this.intentDeleteSize;
    }

    public final void setEditMode(@NotNull ObservableBoolean observableBoolean) {
        Intrinsics.checkNotNullParameter(observableBoolean, "<set-?>");
        this.editMode = observableBoolean;
    }

    public final void setIntentDeleteSize(@NotNull ObservableInt observableInt) {
        Intrinsics.checkNotNullParameter(observableInt, "<set-?>");
        this.intentDeleteSize = observableInt;
    }
}
