package com.xiaomi.fitness.userinfo.medicalid.util;

import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.user.info.export.MedicalIdSPContract;
import com.xiaomi.fitness.user.info.export.medicalid.IMedicalIdRepository;
import com.xiaomi.fitness.user.info.export.medicalid.MedicalIdRepositoryExtKt;
import defpackage.fyi;
import defpackage.o1j;
import defpackage.yo2;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/userinfo/medicalid/util/BirthdateConverter;", "", "", "getBirthdateLongFromUserProfile", "()J", "Lyo2;", "mBirthdayItem", "", "constructBirthdayAndAgeDisplayText", "(Lyo2;)Ljava/lang/String;", "birthdayLong", "constructAgeStringDisplayText", "(J)Ljava/lang/String;", "", "getAgeFromMedicalIdSp", "()I", "<init>", "()V", "user-info_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nBirthdateConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirthdateConverter.kt\ncom/xiaomi/fitness/userinfo/medicalid/util/BirthdateConverter\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,72:1\n37#2:73\n36#2,3:74\n*S KotlinDebug\n*F\n+ 1 BirthdateConverter.kt\ncom/xiaomi/fitness/userinfo/medicalid/util/BirthdateConverter\n*L\n22#1:73\n22#1:74,3\n*E\n"})
public final class BirthdateConverter {

    @NotNull
    public static final BirthdateConverter INSTANCE = new BirthdateConverter();

    private BirthdateConverter() {
    }

    @NotNull
    public final String constructAgeStringDisplayText(long birthdayLong) {
        int iA = new yo2(birthdayLong).a();
        String quantityString = AppUtil.getApp().getResources().getQuantityString(fyi.f18375a, iA, Integer.valueOf(iA));
        return quantityString.subSequence(1, quantityString.length() - 1).toString();
    }

    @NotNull
    public final String constructBirthdayAndAgeDisplayText(@NotNull yo2 mBirthdayItem) {
        Intrinsics.checkNotNullParameter(mBirthdayItem, "mBirthdayItem");
        int iA = mBirthdayItem.a();
        if (!mBirthdayItem.c()) {
            String string = AppUtil.getApp().getResources().getString(o1j.G);
            Intrinsics.checkNotNull(string);
            return string;
        }
        String string2 = AppUtil.getApp().getResources().getString(o1j.M);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return TimeUtils.formatDate(string2, Long.valueOf(mBirthdayItem.b())) + AppUtil.getApp().getResources().getQuantityString(fyi.f18375a, iA, Integer.valueOf(iA));
    }

    public final int getAgeFromMedicalIdSp() {
        yo2 yo2Var = new yo2(MedicalIdRepositoryExtKt.getInstance(IMedicalIdRepository.INSTANCE).getLongFromSP(MedicalIdSPContract.PREF_BIRTHDAY, 0L));
        if (yo2Var.c()) {
            return yo2Var.a();
        }
        return 0;
    }

    public final long getBirthdateLongFromUserProfile() {
        long dateInMonth;
        List<String> listSplit;
        String[] strArr = null;
        String birth = UserInfoManager.getUserProfile$default(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE), false, 1, null).getBirth();
        if (birth != null && (listSplit = new Regex("-").split(birth, 0)) != null) {
            strArr = (String[]) listSplit.toArray(new String[0]);
        }
        if (strArr != null) {
            dateInMonth = TimeUtils.INSTANCE.getDateInMonth(Integer.parseInt(strArr[0]), Integer.parseInt(strArr[1]), Integer.parseInt(strArr[2]));
            Logger.d("BirthdateConverter", "year " + strArr[0] + " -" + strArr[1] + " -" + strArr[2] + " time " + dateInMonth);
        } else {
            dateInMonth = 0;
        }
        if (dateInMonth != 0) {
            return dateInMonth;
        }
        return 631123200000L;
    }
}
