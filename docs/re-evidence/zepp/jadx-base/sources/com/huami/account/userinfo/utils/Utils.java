package com.huami.account.userinfo.utils;

import android.content.Context;
import android.os.Environment;
import android.widget.Toast;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.account.HMLoginManager;
import com.huami.account.userinfo.R;
import com.huami.account.userinfo.UserinfoExternalsKt;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.baseutil.FileUtils;
import com.xiaomi.hm.health.baseutil.Language;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.manager.UnitManager;
import io.netty.util.internal.StringUtil;
import java.io.File;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b \u0010!J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004J \u0010\f\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\u0007J \u0010\u0012\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004J\u000e\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0004J \u0010\u0017\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004R\u0016\u0010\u001a\u001a\u00020\u000e8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u000e8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0016\u0010\u001d\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001e¨\u0006\""}, d2 = {"Lcom/huami/account/userinfo/utils/Utils;", "", "", "shouldHideDiscovery", "", "height", "cm2inch", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "resId", "duration", "", "toast", "c", "", "getStoragePath", "minute", "type", "getCalculateTimeByMinute", "age", "calculateBirthdayByAge", "unit", "heightValue", "lengthToString", "a", "Ljava/lang/String;", "TAG", "b", "THIS_DIR", "TYPE_STRING", LogUtil.I, "TYPE_NUMBER", "<init>", "()V", "userinfo_release"}, k = 1, mv = {1, 5, 1})
public final class Utils {

    @NotNull
    public static final Utils INSTANCE = new Utils();
    public static final int TYPE_NUMBER = 18;
    public static final int TYPE_STRING = 17;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "Utils";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final String THIS_DIR = "Millelet";

    private Utils() {
    }

    @NotNull
    public final String calculateBirthdayByAge(int age) {
        Calendar calendar = Calendar.getInstance();
        int i = calendar.get(1) - age;
        int i2 = calendar.get(2) + 1;
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append('-');
        sb.append(i2);
        return sb.toString();
    }

    public final int cm2inch(int height) {
        return c.roundToInt(((double) height) * 0.394d);
    }

    @Nullable
    public final String getCalculateTimeByMinute(@NotNull Context context, int minute, int type) {
        int i = minute / 60;
        int i2 = minute % 60;
        if (type != 17) {
            return type != 18 ? "" : TimeUtils.formatTime(UserinfoExternalsKt.getAppContext(), minute);
        }
        if (i == 0) {
            return i2 + context.getString(R.string.user_info_unit_min_long);
        }
        if (Language.isChinese()) {
            return i + context.getString(R.string.user_info_unit_hour_long) + i2 + context.getString(R.string.unit_min);
        }
        return i + context.getString(R.string.user_info_unit_hour_long) + StringUtil.SPACE + i2 + context.getString(R.string.unit_min);
    }

    @Nullable
    public final String getStoragePath(@NotNull Context c) {
        String externalStorageState = Environment.getExternalStorageState();
        HMLog.d("Utils", Intrinsics.stringPlus("ext state =", externalStorageState), new Object[0]);
        File externalFilesDir = Intrinsics.areEqual("mounted", externalStorageState) ? c.getExternalFilesDir(THIS_DIR) : c.getFilesDir();
        if (externalFilesDir == null) {
            externalFilesDir = c.getFilesDir();
        }
        if (externalFilesDir != null) {
            String path = externalFilesDir.getPath();
            HMLog.d("Utils", Intrinsics.stringPlus("getStoragePath:", path), new Object[0]);
            return path;
        }
        return FileUtils.getExternalStorageDirectoryCompatible(c).getPath() + ((Object) File.separator) + THIS_DIR;
    }

    @NotNull
    public final String lengthToString(@NotNull Context context, @UnitManager.LENGTH int unit, int heightValue) {
        if (unit == 0) {
            return context.getString(R.string.user_info_person_info_key_height_unit_metric, String.valueOf(heightValue));
        }
        int iCm2inch = cm2inch(heightValue);
        int i = iCm2inch / 12;
        int i2 = iCm2inch % 12;
        return context.getResources().getQuantityString(R.plurals.user_info_numberFoot, i, Integer.valueOf(i)) + StringUtil.SPACE + context.getResources().getQuantityString(R.plurals.user_info_numberInch, i2, Integer.valueOf(i2));
    }

    public final boolean shouldHideDiscovery() {
        return (Language.isSimplifiedChinese() && HMLoginManager.isInChina()) ? false : true;
    }

    public final void toast(@Nullable Context context, int resId, int duration) {
        Toast.makeText(context, resId, duration).show();
    }
}
