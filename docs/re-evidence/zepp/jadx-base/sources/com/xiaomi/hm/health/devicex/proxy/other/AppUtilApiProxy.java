package com.xiaomi.hm.health.devicex.proxy.other;

import android.content.Context;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.devicex.injection.other.AppUtilApi;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.speech.utils.CheckDeviceSupportAlexaKt;
import com.xiaomi.hm.health.utils.Utils;
import com.xmlywind.sdk.common.mta.PointCategory;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u001c\u0010\r\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J\u0012\u0010\u0011\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/hm/health/devicex/proxy/other/AppUtilApiProxy;", "Lcom/huami/devicex/injection/other/AppUtilApi;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", PointCategory.PERMISSION, "", "checkPermission", "Landroidx/appcompat/app/AppCompatActivity;", "activity", "", "showGotoLocationServerDialog", "msd", "showPermissionDenieDialog", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "isFastDoubleClick", "isLocationServerOpen", "needShowAlexa", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class AppUtilApiProxy implements AppUtilApi {
    @Override // com.huami.devicex.injection.other.AppUtilApi
    public boolean checkPermission(@Nullable Context context, @Nullable String permission) {
        return Utils.checkPermission(context, permission);
    }

    @Override // com.huami.devicex.injection.other.AppUtilApi
    public boolean isFastDoubleClick(@Nullable View view) {
        return Utils.isFastDoubleClick(view);
    }

    @Override // com.huami.devicex.injection.other.AppUtilApi
    public boolean isLocationServerOpen(@Nullable Context context) {
        return Utils.isLocationServerOpen(context);
    }

    @Override // com.huami.devicex.injection.other.AppUtilApi
    public boolean needShowAlexa(@NotNull Context context) {
        return CheckDeviceSupportAlexaKt.isLoginCountryAndDeviceSupportAlexa(context);
    }

    @Override // com.huami.devicex.injection.other.AppUtilApi
    public void showGotoLocationServerDialog(@Nullable AppCompatActivity activity) {
        Utils.showGotoLocationServerDialog(activity);
    }

    @Override // com.huami.devicex.injection.other.AppUtilApi
    public void showPermissionDenieDialog(@Nullable AppCompatActivity activity, @Nullable String msd) {
        Utils.showPermissionDenieDialog(activity, msd);
    }
}
