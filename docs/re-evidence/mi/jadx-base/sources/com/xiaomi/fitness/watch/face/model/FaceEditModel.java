package com.xiaomi.fitness.watch.face.model;

import androidx.databinding.ObservableBoolean;
import com.xiaomi.fitness.baseui.BaseModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/watch/face/model/FaceEditModel;", "Lcom/xiaomi/fitness/baseui/BaseModel;", "<init>", "()V", "initNameIdMapDone", "Landroidx/databinding/ObservableBoolean;", "getInitNameIdMapDone", "()Landroidx/databinding/ObservableBoolean;", "setInitNameIdMapDone", "(Landroidx/databinding/ObservableBoolean;)V", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FaceEditModel extends BaseModel {

    @NotNull
    private ObservableBoolean initNameIdMapDone = new ObservableBoolean(false);

    @NotNull
    public final ObservableBoolean getInitNameIdMapDone() {
        return this.initNameIdMapDone;
    }

    public final void setInitNameIdMapDone(@NotNull ObservableBoolean observableBoolean) {
        Intrinsics.checkNotNullParameter(observableBoolean, "<set-?>");
        this.initNameIdMapDone = observableBoolean;
    }
}
