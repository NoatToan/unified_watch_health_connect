package com.xiaomi.fitness.watch.face.model;

import androidx.databinding.ObservableBoolean;
import com.xiaomi.fitness.baseui.BaseModel;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/watch/face/model/FaceDetailModel;", "Lcom/xiaomi/fitness/baseui/BaseModel;", "<init>", "()V", "hasAod", "Landroidx/databinding/ObservableBoolean;", "getHasAod", "()Landroidx/databinding/ObservableBoolean;", "hasRecommend", "getHasRecommend", "hasDescription", "getHasDescription", "hasLabelList", "getHasLabelList", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FaceDetailModel extends BaseModel {

    @NotNull
    private final ObservableBoolean hasAod = new ObservableBoolean(false);

    @NotNull
    private final ObservableBoolean hasRecommend = new ObservableBoolean(false);

    @NotNull
    private final ObservableBoolean hasDescription = new ObservableBoolean(false);

    @NotNull
    private final ObservableBoolean hasLabelList = new ObservableBoolean(false);

    @NotNull
    public final ObservableBoolean getHasAod() {
        return this.hasAod;
    }

    @NotNull
    public final ObservableBoolean getHasDescription() {
        return this.hasDescription;
    }

    @NotNull
    public final ObservableBoolean getHasLabelList() {
        return this.hasLabelList;
    }

    @NotNull
    public final ObservableBoolean getHasRecommend() {
        return this.hasRecommend;
    }
}
