package com.huami.moving.ui.utils;

import android.content.Context;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.tools.analytics.DbUtils;
import com.xmlywind.sdk.common.mta.PointCategory;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/huami/moving/ui/utils/GpsUtilDelegate;", "", "<init>", "()V", "Companion", "GpsUtils", "moving_release"}, k = 1, mv = {1, 5, 1})
public final class GpsUtilDelegate {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private static GpsUtils a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/huami/moving/ui/utils/GpsUtilDelegate$Companion;", "", "Lcom/huami/moving/ui/utils/GpsUtilDelegate$GpsUtils;", "utils", "", PointCategory.INIT, "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/android/design/dialog/AlertDialogFragment;", "genOpenGpsDialog", "gpsUtils", "Lcom/huami/moving/ui/utils/GpsUtilDelegate$GpsUtils;", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final AlertDialogFragment genOpenGpsDialog(@NotNull Context context) {
            return GpsUtilDelegate.a.genOpenGpsDialog(context);
        }

        @JvmStatic
        public final void init(@NotNull GpsUtils utils) {
            GpsUtilDelegate.a = utils;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/huami/moving/ui/utils/GpsUtilDelegate$GpsUtils;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/android/design/dialog/AlertDialogFragment;", "genOpenGpsDialog", "moving_release"}, k = 1, mv = {1, 5, 1})
    public interface GpsUtils {
        @NotNull
        AlertDialogFragment genOpenGpsDialog(@NotNull Context context);
    }

    @JvmStatic
    @NotNull
    public static final AlertDialogFragment genOpenGpsDialog(@NotNull Context context) {
        return INSTANCE.genOpenGpsDialog(context);
    }

    @JvmStatic
    public static final void init(@NotNull GpsUtils gpsUtils) {
        INSTANCE.init(gpsUtils);
    }
}
