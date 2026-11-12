package com.xiaomi.wearable.yrn.helper;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import com.xiaomi.wearable.yrn.views.WearableRNActivity;
import com.xiaomi.yrn.controller.ui.YRNCFragment;
import defpackage.lwr;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tJ\"\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000e\u001a\u00020\u000f¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/wearable/yrn/helper/WearableRNPageHelper;", "", "<init>", "()V", "newYRNFragment", "Landroidx/fragment/app/Fragment;", "url", "", PluginDeviceInfo.FDESC, "Landroid/os/Bundle;", "openRNPage", "", LifecycleConstantKt.TYPE_ACTIVITY, "Landroid/app/Activity;", AccountInteractActivity.KEY_REQUEST_CODE, "", "sdk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWearableRNPageHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WearableRNPageHelper.kt\ncom/xiaomi/wearable/yrn/helper/WearableRNPageHelper\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,76:1\n29#2:77\n*S KotlinDebug\n*F\n+ 1 WearableRNPageHelper.kt\ncom/xiaomi/wearable/yrn/helper/WearableRNPageHelper\n*L\n57#1:77\n*E\n"})
public final class WearableRNPageHelper {

    @NotNull
    public static final WearableRNPageHelper INSTANCE = new WearableRNPageHelper();

    private WearableRNPageHelper() {
    }

    @NotNull
    public final Fragment newYRNFragment(@NotNull String url, @Nullable Bundle b2) {
        Intrinsics.checkNotNullParameter(url, "url");
        YRNCFragment yRNCFragment = new YRNCFragment();
        if (b2 == null) {
            b2 = new Bundle();
        }
        String rNAppNameByUrl = lwr.b().getRNAppNameByUrl(url);
        String rNModuleByUrl = lwr.b().getRNModuleByUrl(url);
        b2.putString("appName", rNAppNameByUrl);
        b2.putString(RnReportConst.ApiReport.PARAM_MODULE, rNModuleByUrl);
        b2.putString(SportRecordBundleKey.BUNDLE_PARAM_URI, url);
        b2.putString("url", url);
        yRNCFragment.setArguments(b2);
        if (!TextUtils.isEmpty(rNAppNameByUrl) && !TextUtils.isEmpty(rNModuleByUrl) && !TextUtils.isEmpty(url)) {
            return yRNCFragment;
        }
        Logger.e("YRNCPageOpenHelper", "YRNCPageOpenHelper.newYRNFragment error! appName is " + rNAppNameByUrl + ",module is " + rNModuleByUrl + ",url is " + url);
        return new Fragment();
    }

    public final void openRNPage(@Nullable Activity activity, @Nullable String url, int requestCode) {
        Uri uri;
        if (TextUtils.isEmpty(url)) {
            return;
        }
        if (url != null) {
            try {
                uri = Uri.parse(url);
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        } else {
            uri = null;
        }
        if (activity != null) {
            Intent intent = new Intent(activity, (Class<?>) WearableRNActivity.class);
            intent.setData(uri);
            activity.startActivityForResult(intent, requestCode);
            return;
        }
        Context context = lwr.b().getContext();
        if (context != null) {
            Intent intent2 = new Intent(context, (Class<?>) WearableRNActivity.class);
            intent2.setFlags(268435456);
            intent2.setData(uri);
            context.startActivity(intent2);
        }
    }
}
