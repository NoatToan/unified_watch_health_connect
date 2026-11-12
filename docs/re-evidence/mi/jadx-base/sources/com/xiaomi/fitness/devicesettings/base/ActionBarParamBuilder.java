package com.xiaomi.fitness.devicesettings.base;

import android.os.Bundle;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\u00002\b\b\u0001\u0010\t\u001a\u00020\u0005J\u0010\u0010\n\u001a\u00020\u00002\b\b\u0001\u0010\t\u001a\u00020\u0005J\u0006\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0004\n\u0002\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/base/ActionBarParamBuilder;", "", "<init>", "()V", "startViewDrawableRes", "", "Ljava/lang/Integer;", "endViewDrawableRes", "setStartView", "drawableRes", "setEndView", "create", "Landroid/os/Bundle;", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ActionBarParamBuilder {

    @Nullable
    private Integer endViewDrawableRes;

    @Nullable
    private Integer startViewDrawableRes;

    @NotNull
    public final Bundle create() {
        Bundle bundle = new Bundle();
        Integer num = this.startViewDrawableRes;
        if (num != null) {
            bundle.putInt("cancel_btn_res_id", num.intValue());
        }
        Integer num2 = this.endViewDrawableRes;
        if (num2 != null) {
            bundle.putInt("save_btn_res_id", num2.intValue());
        }
        return bundle;
    }

    @NotNull
    public final ActionBarParamBuilder setEndView(int drawableRes) {
        this.endViewDrawableRes = Integer.valueOf(drawableRes);
        return this;
    }

    @NotNull
    public final ActionBarParamBuilder setStartView(int drawableRes) {
        this.startViewDrawableRes = Integer.valueOf(drawableRes);
        return this;
    }
}
