package com.huami.femalehealth.uilib.helper;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.util.TypedValue;
import android.view.Display;
import android.view.WindowManager;
import com.xiaomi.hm.health.Constant;
import java.util.Objects;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004J\b\u0010\f\u001a\u0004\u0018\u00010\u000bJ\u000e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006J\u000e\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006J\u0006\u0010\u0012\u001a\u00020\u0011R\u0019\u0010\u0017\u001a\u00020\u00138\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/huami/femalehealth/uilib/helper/ContextHolder;", "", "Landroid/content/Context;", "a", "", "dimenId", "", "getDimen", "stringId", "", "getString", "Landroid/content/res/Resources;", "getResources", Constant.PAI_KEY_DAILY_PAI, "dp2px", "sp", "spToPx", "Landroid/graphics/Point;", "findScreenWH", "Landroid/app/Application;", "Landroid/app/Application;", "getApp", "()Landroid/app/Application;", "app", "<init>", "(Landroid/app/Application;)V", "uilib_release"}, k = 1, mv = {1, 5, 1})
public final class ContextHolder {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Application app;

    public ContextHolder(@NotNull Application application) {
        this.app = application;
    }

    private final Context a() {
        return this.app;
    }

    public final float dp2px(float dp) {
        Resources resources = a().getResources();
        return TypedValue.applyDimension(1, dp, resources == null ? null : resources.getDisplayMetrics());
    }

    @NotNull
    public final Point findScreenWH() {
        Object systemService = a().getSystemService("window");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return point;
    }

    @NotNull
    public final Application getApp() {
        return this.app;
    }

    public final float getDimen(int dimenId) {
        Resources resources = a().getResources();
        if (resources == null) {
            return 0.0f;
        }
        return resources.getDimension(dimenId);
    }

    @Nullable
    public final Resources getResources() {
        return a().getResources();
    }

    @NotNull
    public final String getString(int stringId) {
        String string;
        Resources resources = a().getResources();
        return (resources == null || (string = resources.getString(stringId)) == null) ? "" : string;
    }

    public final float spToPx(float sp) {
        Resources resources = a().getResources();
        return TypedValue.applyDimension(2, sp, resources == null ? null : resources.getDisplayMetrics());
    }
}
