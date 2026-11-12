package com.huami.treadmill.util;

import android.app.Activity;
import android.content.Context;
import android.provider.Settings;
import android.view.Window;
import android.view.WindowManager;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0004J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tJ\u0016\u0010\u000e\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0004J\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tR\u0016\u0010\u0011\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/huami/treadmill/util/LightHelper;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "a", "stepValue", "", "setStepLight100", "Landroid/app/Activity;", "activity", "addLight100", "subLight100", "paramInt", "setAppLight100", "getAppLight100", LogUtil.I, "STEP_LIGHT_100", "<init>", "()V", "Companion", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public final class LightHelper {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private static LightHelper b;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int STEP_LIGHT_100 = 2;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u0003\u001a\u00020\u0002R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/huami/treadmill/util/LightHelper$Companion;", "", "Lcom/huami/treadmill/util/LightHelper;", "getInstance", "singleton", "Lcom/huami/treadmill/util/LightHelper;", "<init>", "()V", "treadmill_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final LightHelper getInstance() {
            if (LightHelper.b == null) {
                synchronized (LightHelper.class) {
                    if (LightHelper.b == null) {
                        Companion companion = LightHelper.INSTANCE;
                        LightHelper.b = new LightHelper();
                    }
                    Unit unit = Unit.INSTANCE;
                }
            }
            return LightHelper.b;
        }
    }

    private final int a(Context context) {
        int i;
        try {
            i = Settings.System.getInt(context.getContentResolver(), "screen_brightness");
        } catch (Exception e) {
            e.printStackTrace();
            i = 0;
        }
        return (int) ((((double) i) * 1.0d) / 2.25d);
    }

    public final int addLight100(@NotNull Activity activity) {
        int appLight100 = getAppLight100(activity) + this.STEP_LIGHT_100;
        if (appLight100 >= 100) {
            appLight100 = 100;
        }
        return setAppLight100(activity, appLight100);
    }

    public final int getAppLight100(@NotNull Activity activity) {
        int i = (int) (activity.getWindow().getAttributes().screenBrightness * 100);
        return i < 0 ? a(activity) : i;
    }

    public final int setAppLight100(@NotNull Activity activity, int paramInt) {
        Window window = activity.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.screenBrightness = paramInt * 0.01f;
        window.setAttributes(attributes);
        return paramInt;
    }

    public final void setStepLight100(int stepValue) {
        this.STEP_LIGHT_100 = stepValue;
    }

    public final int subLight100(@NotNull Activity activity) {
        int appLight100 = getAppLight100(activity) - this.STEP_LIGHT_100;
        if (appLight100 <= 0) {
            appLight100 = 0;
        }
        return setAppLight100(activity, appLight100);
    }
}
