package com.xiaomi.fitness.watch.face.debug.designer;

import androidx.databinding.ObservableBoolean;
import com.xiaomi.fitness.baseui.BaseModel;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/watch/face/debug/designer/FaceDesignerModel;", "Lcom/xiaomi/fitness/baseui/BaseModel;", "<init>", "()V", "verifySign", "Landroidx/databinding/ObservableBoolean;", "getVerifySign", "()Landroidx/databinding/ObservableBoolean;", "verifyCapability", "getVerifyCapability", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FaceDesignerModel extends BaseModel {

    @NotNull
    private final ObservableBoolean verifySign = new ObservableBoolean(true);

    @NotNull
    private final ObservableBoolean verifyCapability = new ObservableBoolean(true);

    @NotNull
    public final ObservableBoolean getVerifyCapability() {
        return this.verifyCapability;
    }

    @NotNull
    public final ObservableBoolean getVerifySign() {
        return this.verifySign;
    }
}
