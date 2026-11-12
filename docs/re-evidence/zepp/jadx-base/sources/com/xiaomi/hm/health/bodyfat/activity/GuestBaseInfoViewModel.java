package com.xiaomi.hm.health.bodyfat.activity;

import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import com.huami.nfc.base.PayResponse;
import com.xiaomi.hm.health.bodyfat.manager.UserInfoManager;
import com.xiaomi.hm.health.bodyfat.utils.BFKeeper;
import com.xiaomi.hm.health.databases.model.UserInfos;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u001f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR(\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/activity/GuestBaseInfoViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/xiaomi/hm/health/databases/model/UserInfos;", "guest", "", "setValue", "", "needPrivateTip", "setNeedPrivateTip", "Landroidx/lifecycle/MutableLiveData;", "a", "Landroidx/lifecycle/MutableLiveData;", "getBaseInfo", "()Landroidx/lifecycle/MutableLiveData;", "baseInfo", "b", "getNeedShowPrivateTip", "setNeedShowPrivateTip", "(Landroidx/lifecycle/MutableLiveData;)V", "needShowPrivateTip", "<init>", "()V", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class GuestBaseInfoViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<UserInfos> baseInfo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private MutableLiveData<Boolean> needShowPrivateTip;

    public GuestBaseInfoViewModel() {
        MutableLiveData<UserInfos> mutableLiveData = new MutableLiveData<>();
        this.baseInfo = mutableLiveData;
        this.needShowPrivateTip = new MutableLiveData<>();
        UserInfos guest = UserInfoManager.getManager().getGuest();
        if (guest != null) {
            mutableLiveData.setValue(guest);
        } else {
            UserInfos userInfos = new UserInfos();
            userInfos.setUserId(PayResponse.CODE_NFC_CHANNEL_ERROR);
            userInfos.setSynced(1);
            userInfos.setBirthday("");
            mutableLiveData.setValue(userInfos);
        }
        this.needShowPrivateTip.setValue(Boolean.valueOf(BFKeeper.readScaleGuestPrivateTipSetting()));
    }

    @NotNull
    public final MutableLiveData<UserInfos> getBaseInfo() {
        return this.baseInfo;
    }

    @NotNull
    public final MutableLiveData<Boolean> getNeedShowPrivateTip() {
        return this.needShowPrivateTip;
    }

    public final void setNeedPrivateTip(boolean needPrivateTip) {
        this.needShowPrivateTip.setValue(Boolean.valueOf(needPrivateTip));
        BFKeeper.setScaleGuestPrivateTipSetting(false);
    }

    public final void setNeedShowPrivateTip(@NotNull MutableLiveData<Boolean> mutableLiveData) {
        this.needShowPrivateTip = mutableLiveData;
    }

    public final void setValue(@NotNull UserInfos guest) {
        this.baseInfo.setValue(guest);
    }
}
