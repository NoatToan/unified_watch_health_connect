package com.xiaomi.fitness.electronic.scale;

import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import com.google.android.gms.common.Scopes;
import com.xiaomi.fitness.account.api.bean.UserProfile;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.baseui.BaseViewModel;
import com.xiaomi.fitness.electronic.scale.DataReportViewModel;
import com.xiaomi.fitness.electronic.scale.data.WeightResult;
import com.xiaomi.fitness.electronic.scale.export.bean.VirtualAccount;
import com.xiaomi.fitness.electronic.scale.manager.VirtualAccountHelper;
import defpackage.qal;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0006\u0010\u001c\u001a\u00020\u0006J \u0010\u001d\u001a\u00020\u00062\u0018\u0010\u001e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 \u0012\u0004\u0012\u00020\u00060\u001fR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\""}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/DataReportViewModel;", "Lcom/xiaomi/fitness/baseui/BaseViewModel;", "Lcom/xiaomi/fitness/electronic/scale/DataReportModel;", "<init>", "()V", "attach", "", "savedInstanceState", "Landroid/os/Bundle;", "weightResult", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/fitness/electronic/scale/data/WeightResult;", "getWeightResult", "()Landroidx/lifecycle/MutableLiveData;", "setWeightResult", "(Landroidx/lifecycle/MutableLiveData;)V", "mUserInfoManager", "Lcom/xiaomi/fitness/account/user/UserInfoManager;", "getMUserInfoManager", "()Lcom/xiaomi/fitness/account/user/UserInfoManager;", "setMUserInfoManager", "(Lcom/xiaomi/fitness/account/user/UserInfoManager;)V", Scopes.PROFILE, "Lcom/xiaomi/fitness/account/api/bean/UserProfile;", "getProfile", "()Lcom/xiaomi/fitness/account/api/bean/UserProfile;", "setProfile", "(Lcom/xiaomi/fitness/account/api/bean/UserProfile;)V", "initUserProfile", "getReportData", "callBack", "Lkotlin/Function1;", "", "Lcom/xiaomi/fitness/electronic/scale/export/bean/VirtualAccount;", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DataReportViewModel extends BaseViewModel<DataReportModel> {
    public UserInfoManager mUserInfoManager;

    @Nullable
    private UserProfile profile;

    @NotNull
    private MutableLiveData<WeightResult> weightResult = new MutableLiveData<>();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getReportData$lambda$0(Function1 callBack, List list) {
        Intrinsics.checkNotNullParameter(callBack, "$callBack");
        Intrinsics.checkNotNullParameter(list, "list");
        callBack.invoke(list);
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.baseui.BaseViewModel, com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    @NotNull
    public final UserInfoManager getMUserInfoManager() {
        UserInfoManager userInfoManager = this.mUserInfoManager;
        if (userInfoManager != null) {
            return userInfoManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mUserInfoManager");
        return null;
    }

    @Nullable
    public final UserProfile getProfile() {
        return this.profile;
    }

    public final void getReportData(@NotNull final Function1<? super List<VirtualAccount>, Unit> callBack) {
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        VirtualAccountHelper.INSTANCE.queryByUid(new VirtualAccount(null, null, Long.parseLong(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId()), 0L, null, null, false, false, 0, null, null, 0L, 0L, null, 0, 0, 0L, 0, 0.0f, 524283, null), new Function1() { // from class: on5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DataReportViewModel.getReportData$lambda$0(callBack, (List) obj);
            }
        });
    }

    @NotNull
    public final MutableLiveData<WeightResult> getWeightResult() {
        return this.weightResult;
    }

    public final void initUserProfile() {
        UserProfile userProfile$default = UserInfoManager.getUserProfile$default(getMUserInfoManager(), false, 1, null);
        this.profile = userProfile$default;
        qal.c("initUserProfile() profile == " + userProfile$default);
    }

    public final void setMUserInfoManager(@NotNull UserInfoManager userInfoManager) {
        Intrinsics.checkNotNullParameter(userInfoManager, "<set-?>");
        this.mUserInfoManager = userInfoManager;
    }

    public final void setProfile(@Nullable UserProfile userProfile) {
        this.profile = userProfile;
    }

    public final void setWeightResult(@NotNull MutableLiveData<WeightResult> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.weightResult = mutableLiveData;
    }
}
