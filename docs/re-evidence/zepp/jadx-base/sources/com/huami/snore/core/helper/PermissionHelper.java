package com.huami.snore.core.helper;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import androidx.core.content.ContextCompat;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.tools.analytics.DbUtils;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.ArrayList;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u001e\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u00040\tj\b\u0012\u0004\u0012\u00020\u0004`\n2\u0006\u0010\u0003\u001a\u00020\bJ\u0010\u0010\f\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rR\u0016\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/huami/snore/core/helper/PermissionHelper;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", PointCategory.PERMISSION, "", "a", "Landroid/app/Activity;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getNeedPermission", "checkPermissionExternalStorage", "", "grantResults", "requestPermissionResult", "", "PERMISSION_REQUEST_CODE", LogUtil.I, "<init>", "()V", "snore_release"}, k = 1, mv = {1, 5, 1})
public final class PermissionHelper {

    @NotNull
    public static final PermissionHelper INSTANCE = new PermissionHelper();
    public static final int PERMISSION_REQUEST_CODE = 100;

    private PermissionHelper() {
    }

    private final boolean a(Context context, String permission) {
        if (context == null) {
            return false;
        }
        return Build.VERSION.SDK_INT < 23 || ContextCompat.checkSelfPermission(context, permission) == 0;
    }

    public final boolean checkPermissionExternalStorage(@Nullable Context context) {
        return context != null && a(context, "android.permission.WRITE_EXTERNAL_STORAGE") && a(context, "android.permission.READ_EXTERNAL_STORAGE");
    }

    @NotNull
    public final ArrayList<String> getNeedPermission(@NotNull Activity context) {
        ArrayList<String> arrayList = new ArrayList<>();
        if (!a(context, "android.permission.WRITE_EXTERNAL_STORAGE")) {
            arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
        }
        if (!a(context, "android.permission.READ_EXTERNAL_STORAGE")) {
            arrayList.add("android.permission.READ_EXTERNAL_STORAGE");
        }
        if (!a(context, "android.permission.RECORD_AUDIO")) {
            arrayList.add("android.permission.RECORD_AUDIO");
        }
        return arrayList;
    }

    public final boolean requestPermissionResult(@NotNull int[] grantResults) {
        int length = grantResults.length - 1;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (grantResults[i] != 0) {
                return false;
            }
            if (i2 > length) {
                return true;
            }
            i = i2;
        }
    }
}
