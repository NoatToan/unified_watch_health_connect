package com.xiaomi.fitness.userinfo.information;

import androidx.databinding.ObservableArrayList;
import androidx.databinding.f;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.baseui.BaseModel;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.userinfo.bean.UserIndicatorsInfo;
import com.xiaomi.fitness.userinfo.utils.UserInfoConfigUtil;
import defpackage.o1j;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR*\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\b\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/userinfo/information/UserinfoSelectModel;", "Lcom/xiaomi/fitness/baseui/BaseModel;", "Landroidx/databinding/f;", "Lcom/xiaomi/fitness/userinfo/bean/UserIndicatorsInfo;", "getUserIndicatorsList", "()Landroidx/databinding/f;", "", "getCountryList", "()Ljava/util/List;", "Landroidx/databinding/ObservableArrayList;", "countryDataList", "Landroidx/databinding/ObservableArrayList;", "getCountryDataList", "()Landroidx/databinding/ObservableArrayList;", "", "mUserIndicatorsInfoList", "Ljava/util/List;", "getMUserIndicatorsInfoList", "setMUserIndicatorsInfoList", "(Ljava/util/List;)V", "Lcom/xiaomi/fitness/account/user/UserInfoManager;", "mUserInfoManager", "Lcom/xiaomi/fitness/account/user/UserInfoManager;", "getMUserInfoManager", "()Lcom/xiaomi/fitness/account/user/UserInfoManager;", "setMUserInfoManager", "(Lcom/xiaomi/fitness/account/user/UserInfoManager;)V", "<init>", "()V", "user-info_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nUserinfoSelectModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserinfoSelectModel.kt\ncom/xiaomi/fitness/userinfo/information/UserinfoSelectModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,48:1\n1863#2,2:49\n13402#3,2:51\n*S KotlinDebug\n*F\n+ 1 UserinfoSelectModel.kt\ncom/xiaomi/fitness/userinfo/information/UserinfoSelectModel\n*L\n28#1:49,2\n42#1:51,2\n*E\n"})
public final class UserinfoSelectModel extends BaseModel {

    @NotNull
    private final ObservableArrayList<UserIndicatorsInfo> countryDataList = new ObservableArrayList<>();

    @Nullable
    private List<UserIndicatorsInfo> mUserIndicatorsInfoList;
    public UserInfoManager mUserInfoManager;

    @NotNull
    public final ObservableArrayList<UserIndicatorsInfo> getCountryDataList() {
        return this.countryDataList;
    }

    @NotNull
    public final List<UserIndicatorsInfo> getCountryList() {
        this.mUserIndicatorsInfoList = new ArrayList();
        String[] strArr = {ResourceExtKt.getString(o1j.t1), ResourceExtKt.getString(o1j.i0), ResourceExtKt.getString(o1j.E), ResourceExtKt.getString(o1j.l1)};
        for (int i = 0; i < 4; i++) {
            String str = strArr[i];
            UserIndicatorsInfo userIndicatorsInfo = new UserIndicatorsInfo(str, UserInfoConfigUtil.getUserInfoValue$default(UserInfoConfigUtil.INSTANCE, str, UserInfoManager.getUserProfile$default(getMUserInfoManager(), false, 1, null), 0, 4, null));
            List<UserIndicatorsInfo> list = this.mUserIndicatorsInfoList;
            Intrinsics.checkNotNull(list);
            list.add(userIndicatorsInfo);
        }
        List<UserIndicatorsInfo> list2 = this.mUserIndicatorsInfoList;
        Intrinsics.checkNotNull(list2);
        return list2;
    }

    @Nullable
    public final List<UserIndicatorsInfo> getMUserIndicatorsInfoList() {
        return this.mUserIndicatorsInfoList;
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

    @NotNull
    public final f<UserIndicatorsInfo> getUserIndicatorsList() {
        this.countryDataList.clear();
        for (UserIndicatorsInfo userIndicatorsInfo : getCountryList()) {
            ObservableArrayList<UserIndicatorsInfo> observableArrayList = this.countryDataList;
            Intrinsics.checkNotNull(observableArrayList);
            observableArrayList.add(userIndicatorsInfo);
        }
        return this.countryDataList;
    }

    public final void setMUserIndicatorsInfoList(@Nullable List<UserIndicatorsInfo> list) {
        this.mUserIndicatorsInfoList = list;
    }

    public final void setMUserInfoManager(@NotNull UserInfoManager userInfoManager) {
        Intrinsics.checkNotNullParameter(userInfoManager, "<set-?>");
        this.mUserInfoManager = userInfoManager;
    }
}
