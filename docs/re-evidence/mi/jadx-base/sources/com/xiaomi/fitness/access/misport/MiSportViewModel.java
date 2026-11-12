package com.xiaomi.fitness.access.misport;

import android.content.Intent;
import android.net.Uri;
import android.os.Message;
import android.text.TextUtils;
import androidx.lifecycle.MutableLiveData;
import com.mibi.sdk.component.params.SdkContants;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fitness.access.AccessModel;
import com.xiaomi.fitness.access.export.bean.MiSportData;
import com.xiaomi.fitness.access.misport.MiSportViewModel;
import com.xiaomi.fitness.access.request.AccessRequest;
import com.xiaomi.fitness.baseui.BaseViewModel;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.net.response.ApiException;
import defpackage.p6r;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\t\b\u0007¢\u0006\u0004\bJ\u0010\nJ\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\nJ\u0019\u0010\u0016\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\nR\"\u0010\u0019\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R(\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R(\u0010/\u001a\b\u0012\u0004\u0012\u00020.0&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010)\u001a\u0004\b0\u0010+\"\u0004\b1\u0010-R(\u00103\u001a\b\u0012\u0004\u0012\u0002020&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010)\u001a\u0004\b4\u0010+\"\u0004\b5\u0010-R(\u00107\u001a\b\u0012\u0004\u0012\u0002060&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u0010)\u001a\u0004\b8\u0010+\"\u0004\b9\u0010-R(\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00100&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010)\u001a\u0004\b;\u0010+\"\u0004\b<\u0010-R(\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00100&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010)\u001a\u0004\b>\u0010+\"\u0004\b?\u0010-R(\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00100&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010)\u001a\u0004\bA\u0010+\"\u0004\bB\u0010-R\"\u0010D\u001a\u00020C8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010I¨\u0006K"}, d2 = {"Lcom/xiaomi/fitness/access/misport/MiSportViewModel;", "Lcom/xiaomi/fitness/baseui/BaseViewModel;", "Lcom/xiaomi/fitness/access/AccessModel;", "Lp6r$a;", "", TSMAuthContants.PARAM_AUTH_CODE, "", "postMigrate", "(Ljava/lang/String;)V", "loadData", "()V", "checkStatus", "Landroid/content/Intent;", "buildMiSportIntent", "()Landroid/content/Intent;", SdkContants.KEY_BUNDLE, "", "handleMiSportAuthResponse", "(Landroid/content/Intent;)Z", "updateStatus", "Landroid/os/Message;", "msg", "handleMessage", "(Landroid/os/Message;)V", "removeMessage", "intentHandled", "Z", "getIntentHandled", "()Z", "setIntentHandled", "(Z)V", "Lp6r;", "handler", "Lp6r;", "getHandler", "()Lp6r;", "setHandler", "(Lp6r;)V", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/fitness/access/export/bean/MiSportData$MiSportDataList;", "mGetMiSportData", "Landroidx/lifecycle/MutableLiveData;", "getMGetMiSportData", "()Landroidx/lifecycle/MutableLiveData;", "setMGetMiSportData", "(Landroidx/lifecycle/MutableLiveData;)V", "Lcom/xiaomi/fitness/access/export/bean/MiSportData$MiSportStatus;", "mGetMiSportLastMigrateStatus", "getMGetMiSportLastMigrateStatus", "setMGetMiSportLastMigrateStatus", "Lcom/xiaomi/fitness/access/export/bean/MiSportData$MigrateResponse;", "mMiSportDataMigrate", "getMMiSportDataMigrate", "setMMiSportDataMigrate", "Lcom/xiaomi/fitness/access/export/bean/MiSportData$MiSportStatusList;", "mGetMiSportStatus", "getMGetMiSportStatus", "setMGetMiSportStatus", "mRequestError", "getMRequestError", "setMRequestError", "mPostMigrateError", "getMPostMigrateError", "setMPostMigrateError", "mMiSportLastMigrateStatusError", "getMMiSportLastMigrateStatusError", "setMMiSportLastMigrateStatusError", "Lcom/xiaomi/fitness/access/request/AccessRequest;", "mAccessRequest", "Lcom/xiaomi/fitness/access/request/AccessRequest;", "getMAccessRequest", "()Lcom/xiaomi/fitness/access/request/AccessRequest;", "setMAccessRequest", "(Lcom/xiaomi/fitness/access/request/AccessRequest;)V", "<init>", "access_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class MiSportViewModel extends BaseViewModel<AccessModel> implements p6r.a {
    private boolean intentHandled;
    public AccessRequest mAccessRequest;

    @Nullable
    private p6r handler = new p6r(this);

    @NotNull
    private MutableLiveData<MiSportData.MiSportDataList> mGetMiSportData = new MutableLiveData<>();

    @NotNull
    private MutableLiveData<MiSportData.MiSportStatus> mGetMiSportLastMigrateStatus = new MutableLiveData<>();

    @NotNull
    private MutableLiveData<MiSportData.MigrateResponse> mMiSportDataMigrate = new MutableLiveData<>();

    @NotNull
    private MutableLiveData<MiSportData.MiSportStatusList> mGetMiSportStatus = new MutableLiveData<>();

    @NotNull
    private MutableLiveData<Boolean> mRequestError = new MutableLiveData<>();

    @NotNull
    private MutableLiveData<Boolean> mPostMigrateError = new MutableLiveData<>();

    @NotNull
    private MutableLiveData<Boolean> mMiSportLastMigrateStatusError = new MutableLiveData<>();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkStatus$lambda$2(MiSportViewModel this$0, MiSportData.MiSportStatus it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.mGetMiSportLastMigrateStatus.setValue(it);
        Logger.i(MiSportImportUtilKt.LOG_TAG, "getMiSportLastMigrateStatus doResult code=" + it.toString());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkStatus$lambda$3(MiSportViewModel this$0, ApiException it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.mMiSportLastMigrateStatusError.setValue(Boolean.TRUE);
        Logger.e(MiSportImportUtilKt.LOG_TAG, "getMiSportLastMigrateStatus doError**" + it.getErrorCode());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadData$lambda$0(MiSportViewModel this$0, MiSportData.MiSportDataList it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.mGetMiSportData.setValue(it);
        Logger.i(MiSportImportUtilKt.LOG_TAG, "getMiSportDataItem doResult code=" + it.toString());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadData$lambda$1(MiSportViewModel this$0, ApiException it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.mRequestError.setValue(Boolean.TRUE);
        Logger.e(MiSportImportUtilKt.LOG_TAG, "getMiSportDataItem doError**" + it.getErrorCode());
        return Unit.INSTANCE;
    }

    private final void postMigrate(String authCode) {
        getMAccessRequest().postMiSportDataMigrate(authCode, new Function1() { // from class: jwf
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MiSportViewModel.postMigrate$lambda$5(this.f23203a, (MiSportData.MigrateResponse) obj);
            }
        }, new Function1() { // from class: kwf
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MiSportViewModel.postMigrate$lambda$6(this.f24369a, (ApiException) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit postMigrate$lambda$5(MiSportViewModel this$0, MiSportData.MigrateResponse it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.mMiSportDataMigrate.setValue(it);
        Logger.i(MiSportImportUtilKt.LOG_TAG, "postMigrate doResult**retCode=" + it.retCode);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit postMigrate$lambda$6(MiSportViewModel this$0, ApiException it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.mPostMigrateError.setValue(Boolean.TRUE);
        Logger.e(MiSportImportUtilKt.LOG_TAG, "postMigrate doError**errorCode=" + it.getErrorCode() + " errorMsg=" + it.getMessage());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateStatus$lambda$7(MiSportViewModel this$0, MiSportData.MiSportStatusList it) {
        p6r p6rVar;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.mGetMiSportStatus.setValue(it);
        Logger.i(MiSportImportUtilKt.LOG_TAG, "getMiSportStatus doResult**" + it);
        int i = it.interval * 1000;
        int i2 = it.status;
        Logger.i(MiSportImportUtilKt.LOG_TAG, "getMiSportStatus doResult** status is " + i2);
        if (i2 == 1 && (p6rVar = this$0.handler) != null) {
            p6rVar.sendEmptyMessageDelayed(1, i);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateStatus$lambda$8(MiSportViewModel this$0, ApiException it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.mRequestError.setValue(Boolean.TRUE);
        Logger.e(MiSportImportUtilKt.LOG_TAG, "getMiSportStatus doError**");
        return Unit.INSTANCE;
    }

    @NotNull
    public final Intent buildMiSportIntent() {
        Uri uriBuildMiSportUri = MiSportImportUtilKt.buildMiSportUri();
        this.intentHandled = false;
        return new Intent("android.intent.action.VIEW", uriBuildMiSportUri);
    }

    public final void checkStatus() {
        getMAccessRequest().getMiSportLastMigrateStatus(new Function1() { // from class: lwf
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MiSportViewModel.checkStatus$lambda$2(this.f25494a, (MiSportData.MiSportStatus) obj);
            }
        }, new Function1() { // from class: mwf
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MiSportViewModel.checkStatus$lambda$3(this.f27286a, (ApiException) obj);
            }
        });
    }

    @Nullable
    public final p6r getHandler() {
        return this.handler;
    }

    public final boolean getIntentHandled() {
        return this.intentHandled;
    }

    @NotNull
    public final AccessRequest getMAccessRequest() {
        AccessRequest accessRequest = this.mAccessRequest;
        if (accessRequest != null) {
            return accessRequest;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mAccessRequest");
        return null;
    }

    @NotNull
    public final MutableLiveData<MiSportData.MiSportDataList> getMGetMiSportData() {
        return this.mGetMiSportData;
    }

    @NotNull
    public final MutableLiveData<MiSportData.MiSportStatus> getMGetMiSportLastMigrateStatus() {
        return this.mGetMiSportLastMigrateStatus;
    }

    @NotNull
    public final MutableLiveData<MiSportData.MiSportStatusList> getMGetMiSportStatus() {
        return this.mGetMiSportStatus;
    }

    @NotNull
    public final MutableLiveData<MiSportData.MigrateResponse> getMMiSportDataMigrate() {
        return this.mMiSportDataMigrate;
    }

    @NotNull
    public final MutableLiveData<Boolean> getMMiSportLastMigrateStatusError() {
        return this.mMiSportLastMigrateStatusError;
    }

    @NotNull
    public final MutableLiveData<Boolean> getMPostMigrateError() {
        return this.mPostMigrateError;
    }

    @NotNull
    public final MutableLiveData<Boolean> getMRequestError() {
        return this.mRequestError;
    }

    @Override // p6r.a
    public void handleMessage(@Nullable Message msg) {
        if (msg == null || msg.what != 1) {
            return;
        }
        updateStatus();
    }

    public final boolean handleMiSportAuthResponse(@Nullable Intent bundle) {
        if (this.intentHandled) {
            return true;
        }
        this.intentHandled = true;
        if (bundle != null) {
            String stringExtra = bundle.getStringExtra(MiSportImportActivity.EXTRA_KEY_MSG);
            String stringExtra2 = bundle.getStringExtra("extra_key_code");
            Logger.i(MiSportImportUtilKt.LOG_TAG, "handleMiSportAuthResponse msg is " + stringExtra + " code is " + stringExtra2);
            if (!TextUtils.isEmpty(stringExtra) || stringExtra2 == null) {
                return false;
            }
            postMigrate(stringExtra2);
        }
        return true;
    }

    public final void loadData() {
        getMAccessRequest().getMiSportDataItem(LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null), new Function1() { // from class: hwf
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MiSportViewModel.loadData$lambda$0(this.f20540a, (MiSportData.MiSportDataList) obj);
            }
        }, new Function1() { // from class: iwf
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MiSportViewModel.loadData$lambda$1(this.f22170a, (ApiException) obj);
            }
        });
    }

    public final void removeMessage() {
        p6r p6rVar = this.handler;
        if (p6rVar != null) {
            p6rVar.removeMessages(1);
        }
    }

    public final void setHandler(@Nullable p6r p6rVar) {
        this.handler = p6rVar;
    }

    public final void setIntentHandled(boolean z) {
        this.intentHandled = z;
    }

    public final void setMAccessRequest(@NotNull AccessRequest accessRequest) {
        Intrinsics.checkNotNullParameter(accessRequest, "<set-?>");
        this.mAccessRequest = accessRequest;
    }

    public final void setMGetMiSportData(@NotNull MutableLiveData<MiSportData.MiSportDataList> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.mGetMiSportData = mutableLiveData;
    }

    public final void setMGetMiSportLastMigrateStatus(@NotNull MutableLiveData<MiSportData.MiSportStatus> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.mGetMiSportLastMigrateStatus = mutableLiveData;
    }

    public final void setMGetMiSportStatus(@NotNull MutableLiveData<MiSportData.MiSportStatusList> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.mGetMiSportStatus = mutableLiveData;
    }

    public final void setMMiSportDataMigrate(@NotNull MutableLiveData<MiSportData.MigrateResponse> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.mMiSportDataMigrate = mutableLiveData;
    }

    public final void setMMiSportLastMigrateStatusError(@NotNull MutableLiveData<Boolean> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.mMiSportLastMigrateStatusError = mutableLiveData;
    }

    public final void setMPostMigrateError(@NotNull MutableLiveData<Boolean> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.mPostMigrateError = mutableLiveData;
    }

    public final void setMRequestError(@NotNull MutableLiveData<Boolean> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.mRequestError = mutableLiveData;
    }

    public final void updateStatus() {
        removeMessage();
        getMAccessRequest().getMiSportStatus(LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null), new Function1() { // from class: nwf
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MiSportViewModel.updateStatus$lambda$7(this.f28504a, (MiSportData.MiSportStatusList) obj);
            }
        }, new Function1() { // from class: owf
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MiSportViewModel.updateStatus$lambda$8(this.f29760a, (ApiException) obj);
            }
        });
    }
}
