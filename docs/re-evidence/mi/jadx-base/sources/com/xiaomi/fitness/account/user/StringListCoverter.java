package com.xiaomi.fitness.account.user;

import com.xiaomi.fitness.account.api.bean.UserProfile;
import com.xiaomi.fitness.common.log.Logger;
import defpackage.xpd;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0007J\u0018\u0010\u000b\u001a\u00020\u00052\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\fH\u0007J\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0007J\u0018\u0010\u0010\u001a\u00020\u00052\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fH\u0007J\u0012\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0007J\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0007J\u0012\u0010\u0016\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0007J\u0012\u0010\u0019\u001a\u00020\u00182\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0007R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/account/user/StringListCoverter;", "", "<init>", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "stringToList", "", "dids", "listToString", "", "stringToArray", "Lcom/xiaomi/fitness/account/user/DallyGoalItem;", "str", "arrayToString", "array", "medalString", "medal", "Lcom/xiaomi/fitness/account/api/bean/UserProfile$UserWearMedal;", "stringToMedal", "recordMaxHrmToString", "hrm", "Lcom/xiaomi/fitness/account/api/bean/UserProfile$RecordMaxHrm;", "stringToRecordMaxHrm", "account_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StringListCoverter {

    @NotNull
    private final String TAG = "StringListCoverter";

    @NotNull
    public final String arrayToString(@Nullable List<DallyGoalItem> array) {
        if (array == null) {
            return "";
        }
        String strC = xpd.c(array);
        Logger.d(this.TAG, "goalString is " + strC);
        return strC;
    }

    @NotNull
    public final String getTAG() {
        return this.TAG;
    }

    @NotNull
    public final String listToString(@Nullable List<String> dids) {
        return dids == null ? toString() : CollectionsKt___CollectionsKt.joinToString$default(new CopyOnWriteArrayList(dids), null, null, null, 0, null, null, 63, null);
    }

    @NotNull
    public final String medalString(@Nullable UserProfile.UserWearMedal medal) {
        if (medal == null) {
            return "";
        }
        String strA = xpd.a(medal);
        Intrinsics.checkNotNullExpressionValue(strA, "beanToJson(...)");
        return strA;
    }

    @NotNull
    public final String recordMaxHrmToString(@Nullable UserProfile.RecordMaxHrm hrm) {
        if (hrm == null) {
            return "";
        }
        String strA = xpd.a(hrm);
        Logger.d(this.TAG, "hrmString --- " + strA);
        Intrinsics.checkNotNull(strA);
        return strA;
    }

    @NotNull
    public final List<DallyGoalItem> stringToArray(@Nullable String str) {
        List<DallyGoalItem> listG;
        if (str == null || (listG = xpd.g(str, DallyGoalItem.class)) == null) {
            return new ArrayList();
        }
        int size = listG.size();
        for (int i = 0; i < size; i++) {
            Logger.d(this.TAG, "index=" + i + " " + listG.get(i));
        }
        return listG;
    }

    @NotNull
    public final List<String> stringToList(@Nullable String dids) {
        return dids == null ? new ArrayList() : CollectionsKt___CollectionsKt.toMutableList((Collection) StringsKt__StringsKt.split$default((CharSequence) dids, new String[]{", "}, false, 0, 6, (Object) null));
    }

    @Nullable
    public final UserProfile.UserWearMedal stringToMedal(@Nullable String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        Object objF = xpd.f(str, UserProfile.UserWearMedal.class);
        Intrinsics.checkNotNull(objF);
        return (UserProfile.UserWearMedal) objF;
    }

    @NotNull
    public final UserProfile.RecordMaxHrm stringToRecordMaxHrm(@Nullable String str) {
        Logger.d(this.TAG, "str --- " + str);
        if (str == null || str.length() == 0) {
            return new UserProfile.RecordMaxHrm(178, "auto", 178);
        }
        Object objF = xpd.f(str, UserProfile.RecordMaxHrm.class);
        Intrinsics.checkNotNull(objF);
        UserProfile.RecordMaxHrm recordMaxHrm = (UserProfile.RecordMaxHrm) objF;
        Logger.d(this.TAG, "hrm --- " + recordMaxHrm);
        return recordMaxHrm;
    }
}
