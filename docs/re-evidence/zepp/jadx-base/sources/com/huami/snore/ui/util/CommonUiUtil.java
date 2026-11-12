package com.huami.snore.ui.util;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import androidx.fragment.app.FragmentManager;
import com.google.firebase.crashlytics.internal.settings.network.DefaultSettingsSpiCall;
import com.huami.snore.core.R;
import com.huami.snore.core.util.DateParseUtilKt;
import com.huami.snore.ui.dialog.Builder;
import com.huami.snore.ui.dialog.SnoreFinishDialogDialog;
import com.huami.snore.ui.dialog.SnoreNormalDialog;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.Constant;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0002\u0013\u0014B\t\b\u0012¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u001e\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nJ\u0016\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e¨\u0006\u0015"}, d2 = {"Lcom/huami/snore/ui/util/CommonUiUtil;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", Constant.PAI_KEY_DAILY_PAI, "", "dip2px", "Landroidx/fragment/app/FragmentManager;", "manager", "", "monitorTime", "", "showSnoreMonitorFinishDialog", "", "name", "getImageByName", "<init>", "()V", "Companion", "a", "snore_release"}, k = 1, mv = {1, 5, 1})
public final class CommonUiUtil {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final CommonUiUtil a = a.a.a();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/huami/snore/ui/util/CommonUiUtil$Companion;", "", "Lcom/huami/snore/ui/util/CommonUiUtil;", DefaultSettingsSpiCall.n, "Lcom/huami/snore/ui/util/CommonUiUtil;", "getInstance", "()Lcom/huami/snore/ui/util/CommonUiUtil;", "<init>", "()V", "snore_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CommonUiUtil getInstance() {
            return CommonUiUtil.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"com/huami/snore/ui/util/CommonUiUtil$a", "", "Lcom/huami/snore/ui/util/CommonUiUtil;", "b", "Lcom/huami/snore/ui/util/CommonUiUtil;", "a", "()Lcom/huami/snore/ui/util/CommonUiUtil;", "holder", "<init>", "()V", "snore_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {

        @NotNull
        public static final a a = new a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private static final CommonUiUtil holder = new CommonUiUtil(null);

        private a() {
        }

        @NotNull
        public final CommonUiUtil a() {
            return holder;
        }
    }

    private CommonUiUtil() {
    }

    public /* synthetic */ CommonUiUtil(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final int dip2px(@Nullable Context context, float dp) {
        Resources resources;
        DisplayMetrics displayMetrics;
        float f = 0.0f;
        if (context != null && (resources = context.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            f = displayMetrics.density;
        }
        return (int) (dp * f);
    }

    public final int getImageByName(@NotNull Context context, @NotNull String name) {
        return context.getResources().getIdentifier(name, "drawable", context.getPackageName());
    }

    public final void showSnoreMonitorFinishDialog(@NotNull Context context, @NotNull FragmentManager manager, long monitorTime) {
        if (monitorTime >= 600000) {
            SnoreFinishDialogDialog.INSTANCE.newInstance(context.getResources().getString(R.string.snore_report_ok), DateParseUtilKt.timeParseHMS(monitorTime)).show(manager);
            return;
        }
        Builder builder = new Builder();
        builder.setOkText(context.getResources().getString(R.string.snore_got_it));
        builder.setDescStr(context.getResources().getString(R.string.snore_monitor_time_short));
        builder.setTitleStyle(SnoreNormalDialog.TileStyle.NO_TITLE);
        builder.setButtonStyle(SnoreNormalDialog.ButtonStyle.ONE);
        builder.build().show(manager);
    }
}
