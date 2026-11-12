package com.xiaomi.fitness.electronic.scale.util;

import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.user.info.export.MedicalIdSPContract;
import defpackage.zzi;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rJ\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005J\u0012\u0010\u0011\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/util/UserInfoConfigUtil;", "", "<init>", "()V", "TAG", "", "FEMALE", "MALE", "DEFAULT_BIRTHDAY_TIME", "", "getUserInfoValue", "value", "userInfoManager", "Lcom/xiaomi/fitness/account/user/UserInfoManager;", "getDateToString", "milSecond", "pattern", "birthStringToMillis", MedicalIdSPContract.PREF_BIRTHDAY, "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUserInfoConfigUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserInfoConfigUtil.kt\ncom/xiaomi/fitness/electronic/scale/util/UserInfoConfigUtil\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,78:1\n37#2:79\n36#2,3:80\n*S KotlinDebug\n*F\n+ 1 UserInfoConfigUtil.kt\ncom/xiaomi/fitness/electronic/scale/util/UserInfoConfigUtil\n*L\n66#1:79\n66#1:80,3\n*E\n"})
public final class UserInfoConfigUtil {
    public static final long DEFAULT_BIRTHDAY_TIME = 631123200000L;

    @NotNull
    private static final String FEMALE = "female";

    @NotNull
    public static final UserInfoConfigUtil INSTANCE = new UserInfoConfigUtil();

    @NotNull
    private static final String MALE = "male";

    @NotNull
    private static final String TAG = "EcoUserInfoConfigUtil";

    private UserInfoConfigUtil() {
    }

    private final long birthStringToMillis(String birth) {
        long dateInMonth;
        List<String> listSplit;
        String[] strArr = (birth == null || (listSplit = new Regex("-").split(birth, 0)) == null) ? null : (String[]) listSplit.toArray(new String[0]);
        if (strArr != null) {
            dateInMonth = TimeUtils.INSTANCE.getDateInMonth(Integer.parseInt(strArr[0]), Integer.parseInt(strArr[1]), Integer.parseInt(strArr[2]));
            Logger.d(TAG, "year " + strArr[0] + " -" + strArr[1] + " -" + strArr[2] + " time " + dateInMonth);
        } else {
            dateInMonth = 0;
        }
        if (dateInMonth != 0) {
            return dateInMonth;
        }
        return 631123200000L;
    }

    @Nullable
    public final String getDateToString(long milSecond, @Nullable String pattern) {
        return new SimpleDateFormat(pattern).format(new Date(milSecond));
    }

    @NotNull
    public final String getUserInfoValue(@NotNull String value, @NotNull UserInfoManager userInfoManager) {
        String birth;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(userInfoManager, "userInfoManager");
        if (Intrinsics.areEqual(value, ResourceExtKt.getString(zzi.E5))) {
            Logger.i(TAG, "value is sex " + UserInfoManager.getUserProfile$default(userInfoManager, false, 1, null));
            String sex = UserInfoManager.getUserProfile$default(userInfoManager, false, 1, null).getSex();
            if (sex != null && sex.length() != 0) {
                String string = StringsKt__StringsJVMKt.equals$default(UserInfoManager.getUserProfile$default(userInfoManager, false, 1, null).getSex(), "female", false, 2, null) ? ResourceExtKt.getString(zzi.w5) : ResourceExtKt.getString(zzi.y5);
                Logger.i(TAG, "string is " + string);
                return string;
            }
        }
        if (Intrinsics.areEqual(value, ResourceExtKt.getString(zzi.B5)) && (birth = UserInfoManager.getUserProfile$default(userInfoManager, false, 1, null).getBirth()) != null && birth.length() != 0) {
            String dateYYYYMMddLocalFormat = TimeDateUtil.getDateYYYYMMddLocalFormat(birthStringToMillis(UserInfoManager.getUserProfile$default(userInfoManager, false, 1, null).getBirth()));
            Intrinsics.checkNotNull(dateYYYYMMddLocalFormat);
            return dateYYYYMMddLocalFormat;
        }
        if (!Intrinsics.areEqual(value, ResourceExtKt.getString(zzi.x5)) || UserInfoManager.getUserProfile$default(userInfoManager, false, 1, null).getHeight() <= 0.0f) {
            return ResourceExtKt.getString(zzi.z5);
        }
        return ((int) UserInfoManager.getUserProfile$default(userInfoManager, false, 1, null).getHeight()) + ResourceExtKt.getString(zzi.w0);
    }
}
