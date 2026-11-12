package com.xiaomi.wearable.yrn.internal;

import android.app.Application;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/wearable/yrn/internal/Utils;", "", "<init>", "()V", "getApp", "Landroid/app/Application;", "sdk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Utils {

    @NotNull
    public static final Utils INSTANCE = new Utils();

    private Utils() {
    }

    @NotNull
    public final Application getApp() {
        return ApplicationExtKt.getApplication();
    }
}
