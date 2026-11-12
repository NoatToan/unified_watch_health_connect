package com.xiaomi.fitness.about.utils;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fit.fitness.export.api.FitnessServerSyncer;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fitness.about.utils.MainCommonAppUrlsKt;
import com.xiaomi.fitness.account.region.RegionPreference;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.extension.ActivityExtKt;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.mine.export.IWebSync;
import defpackage.av6;
import defpackage.h0j;
import defpackage.nui;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0017\u0010\u0004\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f\u001a\u001d\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010\"\u0014\u0010\u0011\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0013\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"", "getHost", "()Ljava/lang/String;", "locale", "getSelectCommonApplicationUrl", "(Ljava/lang/String;)Ljava/lang/String;", "Landroidx/fragment/app/FragmentActivity;", LifecycleConstantKt.TYPE_ACTIVITY, "Lav6;", "dialogCallback", "", "showSyncWebCommonDialog", "(Landroidx/fragment/app/FragmentActivity;Lav6;)V", "Lcom/xiaomi/fitness/mine/export/IWebSync;", "webSync", "showSportHealthDialogIfNeed", "(Landroidx/fragment/app/FragmentActivity;Lcom/xiaomi/fitness/mine/export/IWebSync;)V", "HOST_OPERATION", "Ljava/lang/String;", "TAG", "main_chinaProductRelease"}, k = 2, mv = {2, 0, 0})
public final class MainCommonAppUrlsKt {

    @NotNull
    private static final String HOST_OPERATION = "https://%swatch.iot.mi.com";

    @NotNull
    private static final String TAG = "DeviceWebUrls";

    private static final String getHost() {
        String lowerCase = RegionExtKt.getInstance(RegionManager.INSTANCE).getCurrentRegion().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        Logger.i(TAG, "getHost: region = " + lowerCase);
        if (Intrinsics.areEqual(lowerCase, "cn")) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format(HOST_OPERATION, Arrays.copyOf(new Object[]{""}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return str;
        }
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        String str2 = String.format(HOST_OPERATION, Arrays.copyOf(new Object[]{lowerCase + "."}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        return str2;
    }

    @Nullable
    public static final String getSelectCommonApplicationUrl(@NotNull String locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%s/html/app_select_explain/index.html?locale=%s", Arrays.copyOf(new Object[]{getHost(), locale}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    public static final void showSportHealthDialogIfNeed(@NotNull FragmentActivity activity, @NotNull final IWebSync webSync) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(webSync, "webSync");
        RegionPreference regionPreference = RegionPreference.INSTANCE;
        if (!regionPreference.getPRIVACY_AGREE()) {
            webSync.onPrivacyNotAgree();
        } else if (regionPreference.getSyncWeb()) {
            webSync.onWebSyncAccepted();
        } else {
            showSyncWebCommonDialog(activity, new av6() { // from class: com.xiaomi.fitness.about.utils.MainCommonAppUrlsKt.showSportHealthDialogIfNeed.1
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    super.onDialogClick(dialogName, dialog, which);
                    if (which == -2) {
                        RegionPreference regionPreference2 = RegionPreference.INSTANCE;
                        regionPreference2.setSyncWeb(false);
                        regionPreference2.setSettingSyncWeb(true);
                        webSync.onWebSyncDenied();
                        return;
                    }
                    if (which != -1) {
                        return;
                    }
                    RegionPreference regionPreference3 = RegionPreference.INSTANCE;
                    regionPreference3.setSyncWeb(true);
                    regionPreference3.setSettingSyncWeb(true);
                    FitnessServerSyncer.DefaultImpls.syncWithServer$default(FitnessDataExtKt.getInstance(FitnessServerSyncer.INSTANCE), true, "cloud_sync_switch", null, 4, null);
                    webSync.onWebSyncAccepted();
                }
            });
        }
    }

    public static final void showSyncWebCommonDialog(@NotNull FragmentActivity activity, @NotNull av6 dialogCallback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(dialogCallback, "dialogCallback");
        ActivityExtKt.scopeDialogShow$default(activity, "syncweb", false, null, dialogCallback, new Function1() { // from class: q1f
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MainCommonAppUrlsKt.showSyncWebCommonDialog$lambda$0((String) obj);
            }
        }, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CommonDialog showSyncWebCommonDialog$lambda$0(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        CommonDialog.c cVar = new CommonDialog.c(name);
        if (AppUtil.INSTANCE.isPlayChannel() || !RegionExtKt.isInland(RegionExtKt.getInstance(RegionManager.INSTANCE))) {
            cVar.setDialogTitle(h0j.n).setDialogDescription(h0j.o).setNegativeText(h0j.f19541a).setPositiveText(h0j.j);
        } else {
            cVar.setCustomLayoutId(nui.d).setNegativeText(h0j.f19541a).setPositiveText(h0j.j);
        }
        CommonDialog commonDialogCreate = cVar.create();
        Intrinsics.checkNotNullExpressionValue(commonDialogCreate, "create(...)");
        return commonDialogCreate;
    }
}
