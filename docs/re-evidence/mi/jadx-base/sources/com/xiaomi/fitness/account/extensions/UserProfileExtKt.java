package com.xiaomi.fitness.account.extensions;

import com.xiaomi.fitness.account.api.bean.UserProfile;
import com.xiaomi.fitness.account.user.DallyGoalItem;
import com.xiaomi.fitness.common.log.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0003\u001a\u0010\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007*\u00020\u0004\u001a\u0016\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t*\u00020\u0004\u001a\u0012\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0007*\u00020\u0004H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"TAG", "", "getRainbowItemGoal", "", "Lcom/xiaomi/fitness/account/api/bean/UserProfile;", "type", "getRainbowItemTypes", "", "getRainbowItemGoalMap", "", "getTargetList", "Lcom/xiaomi/fitness/account/user/DallyGoalItem;", "account_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUserProfileExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserProfileExt.kt\ncom/xiaomi/fitness/account/extensions/UserProfileExtKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,73:1\n1863#2,2:74\n1863#2,2:76\n1863#2,2:78\n*S KotlinDebug\n*F\n+ 1 UserProfileExt.kt\ncom/xiaomi/fitness/account/extensions/UserProfileExtKt\n*L\n17#1:74,2\n32#1:76,2\n45#1:78,2\n*E\n"})
public final class UserProfileExtKt {

    @NotNull
    private static final String TAG = "UserProfileExt";

    public static final int getRainbowItemGoal(@NotNull UserProfile userProfile, int i) {
        Intrinsics.checkNotNullParameter(userProfile, "<this>");
        List<DallyGoalItem> targetListOrDefault = userProfile.getTargetListOrDefault();
        Logger.d(TAG, "getGoal: type = " + i + ", goalList = " + targetListOrDefault);
        if (targetListOrDefault != null) {
            for (DallyGoalItem dallyGoalItem : targetListOrDefault) {
                if (dallyGoalItem.getField() == i) {
                    return dallyGoalItem.getTarget();
                }
            }
        }
        return userProfile.getDEFAULT_TARGET()[i - 1];
    }

    @NotNull
    public static final Map<Integer, Integer> getRainbowItemGoalMap(@NotNull UserProfile userProfile) {
        Intrinsics.checkNotNullParameter(userProfile, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<DallyGoalItem> targetList = getTargetList(userProfile);
        Logger.i(TAG, "getRainbowItemGoalMap: src goalList = " + targetList);
        for (DallyGoalItem dallyGoalItem : targetList) {
            linkedHashMap.put(Integer.valueOf(dallyGoalItem.getField()), Integer.valueOf(dallyGoalItem.getTarget()));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final List<Integer> getRainbowItemTypes(@NotNull UserProfile userProfile) {
        Intrinsics.checkNotNullParameter(userProfile, "<this>");
        ArrayList arrayList = new ArrayList();
        List<DallyGoalItem> targetList = getTargetList(userProfile);
        Logger.d(TAG, "getRainbowItemTypes: goalList = " + targetList);
        Iterator<T> it = targetList.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((DallyGoalItem) it.next()).getField()));
        }
        return arrayList;
    }

    private static final List<DallyGoalItem> getTargetList(UserProfile userProfile) {
        List<DallyGoalItem> targetListOrDefault = userProfile.getTargetListOrDefault();
        if (targetListOrDefault != null && targetListOrDefault.size() >= 3) {
            return targetListOrDefault;
        }
        Logger.i(TAG, "getTargetList: invalid (" + targetListOrDefault + ")");
        return userProfile.getDefaultAPPGoal();
    }
}
