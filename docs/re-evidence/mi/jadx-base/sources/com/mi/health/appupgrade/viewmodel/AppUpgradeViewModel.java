package com.mi.health.appupgrade.viewmodel;

import androidx.lifecycle.MutableLiveData;
import com.mi.health.appupgrade.AppDownloadHelper;
import com.mi.health.appupgrade.AppUpgradeUtil;
import com.mi.health.appupgrade.model.AppUpgradeResult;
import com.mi.health.appupgrade.net.AppUpgradeRequest;
import com.mi.health.appupgrade.viewmodel.AppUpgradeViewModel;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.utils.AppVersionUtil;
import com.xiaomi.fitness.net.response.ApiException;
import defpackage.bzi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0015J\b\u0010\u0017\u001a\u00020\u0015H\u0002J\b\u0010\u0018\u001a\u00020\u0015H\u0002J\u0006\u0010\u0019\u001a\u00020\fJ\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bJ\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bJ\b\u0010\u001d\u001a\u0004\u0018\u00010\u001bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/mi/health/appupgrade/viewmodel/AppUpgradeViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "detailRequest", "Lcom/mi/health/appupgrade/net/AppUpgradeRequest;", "appDownloadHelper", "Lcom/mi/health/appupgrade/AppDownloadHelper;", "upgradeDetails", "Lcom/mi/health/appupgrade/model/AppUpgradeResult;", "showDetail", "Landroidx/lifecycle/MutableLiveData;", "", "getShowDetail", "()Landroidx/lifecycle/MutableLiveData;", "setShowDetail", "(Landroidx/lifecycle/MutableLiveData;)V", "showError", "getShowError", "setShowError", "enterView", "", "actionButtonClicked", "checkUpgrade", "startUpgrade", "haveUpdateVersion", "getNewVersionName", "", "getNewVersionDownloadUrl", "getChangeLog", "appupgrade_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAppUpgradeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppUpgradeViewModel.kt\ncom/mi/health/appupgrade/viewmodel/AppUpgradeViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,81:1\n1#2:82\n*E\n"})
public final class AppUpgradeViewModel extends AbsViewModel {

    @NotNull
    private MutableLiveData<Boolean> showDetail;

    @NotNull
    private MutableLiveData<Boolean> showError;

    @Nullable
    private AppUpgradeResult upgradeDetails;

    @NotNull
    private final AppUpgradeRequest detailRequest = new AppUpgradeRequest();

    @NotNull
    private final AppDownloadHelper appDownloadHelper = new AppDownloadHelper();

    public AppUpgradeViewModel() {
        Boolean bool = Boolean.FALSE;
        this.showDetail = new MutableLiveData<>(bool);
        this.showError = new MutableLiveData<>(bool);
    }

    private final void checkUpgrade() {
        AppUpgradeRequest appUpgradeRequest = this.detailRequest;
        String packageName = ApplicationExtKt.getApplication().getApplicationInfo().packageName;
        Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
        AppVersionUtil appVersionUtil = AppVersionUtil.INSTANCE;
        appUpgradeRequest.getAppUpgradeDetails(packageName, appVersionUtil.getAppVersionName(), appVersionUtil.getAppVersionCode(), new Function1() { // from class: hi1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AppUpgradeViewModel.checkUpgrade$lambda$0(this.f20086a, (AppUpgradeResult) obj);
            }
        }, new Function1() { // from class: ii1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AppUpgradeViewModel.checkUpgrade$lambda$1(this.f21163a, (ApiException) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkUpgrade$lambda$0(AppUpgradeViewModel this$0, AppUpgradeResult it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.getNew_version() == -1) {
            ToastExtKt.toastShort(ApplicationExtKt.getApplication(), bzi.h);
        }
        AppUpgradeUtil.INSTANCE.setHasNewVersion(it.getNew_version() >= 0);
        this$0.upgradeDetails = it;
        this$0.showDetail.setValue(Boolean.TRUE);
        this$0.showError.setValue(Boolean.FALSE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkUpgrade$lambda$1(AppUpgradeViewModel this$0, ApiException it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.showDetail.setValue(Boolean.FALSE);
        this$0.showError.setValue(Boolean.TRUE);
        return Unit.INSTANCE;
    }

    private final void startUpgrade() {
        AppUpgradeResult appUpgradeResult = this.upgradeDetails;
        if (appUpgradeResult != null) {
            this.appDownloadHelper.startDownload(appUpgradeResult);
        }
    }

    public final void actionButtonClicked() {
        if (haveUpdateVersion()) {
            startUpgrade();
        } else {
            checkUpgrade();
        }
    }

    public final void enterView() {
        this.upgradeDetails = AppUpgradeUtil.INSTANCE.getAppUpgradeResult();
        this.showDetail.setValue(Boolean.TRUE);
        this.showError.setValue(Boolean.FALSE);
    }

    @Nullable
    public final String getChangeLog() {
        AppUpgradeResult appUpgradeResult = this.upgradeDetails;
        if (appUpgradeResult != null) {
            return appUpgradeResult.getChange_log();
        }
        return null;
    }

    @Nullable
    public final String getNewVersionDownloadUrl() {
        AppUpgradeResult appUpgradeResult = this.upgradeDetails;
        if (appUpgradeResult != null) {
            return appUpgradeResult.getDownload_url();
        }
        return null;
    }

    @Nullable
    public final String getNewVersionName() {
        AppUpgradeResult appUpgradeResult = this.upgradeDetails;
        if (appUpgradeResult != null) {
            return appUpgradeResult.getNew_version_name();
        }
        return null;
    }

    @NotNull
    public final MutableLiveData<Boolean> getShowDetail() {
        return this.showDetail;
    }

    @NotNull
    public final MutableLiveData<Boolean> getShowError() {
        return this.showError;
    }

    public final boolean haveUpdateVersion() {
        AppUpgradeResult appUpgradeResult = this.upgradeDetails;
        return appUpgradeResult != null && appUpgradeResult.getNew_version() >= 0;
    }

    public final void setShowDetail(@NotNull MutableLiveData<Boolean> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.showDetail = mutableLiveData;
    }

    public final void setShowError(@NotNull MutableLiveData<Boolean> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.showError = mutableLiveData;
    }
}
