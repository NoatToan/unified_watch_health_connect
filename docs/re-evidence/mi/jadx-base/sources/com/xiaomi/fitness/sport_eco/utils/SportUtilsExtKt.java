package com.xiaomi.fitness.sport_eco.utils;

import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.user.info.export.SetPageManageExtKt;
import com.xiaomi.fitness.user.info.export.SetPageManager;
import defpackage.e1j;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004\u001a\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004\u001a\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, d2 = {"twoDigits", "", "", "getSportTypeStr", "", DailyRecordKey.sportType, "convertSportType", "perfectInfo", "", LifecycleConstantKt.TYPE_ACTIVITY, "Landroidx/fragment/app/FragmentActivity;", "sport-eco_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SportUtilsExtKt {
    public static final int convertSportType(int i) {
        if (i == 1) {
            return 22;
        }
        if (i == 2) {
            return 28;
        }
        if (i == 3) {
            return 21;
        }
        if (i == 6) {
            return 26;
        }
        if (i == 7) {
            return 25;
        }
        if (i != 14) {
            return i;
        }
        return 31;
    }

    public static final int getSportTypeStr(int i) {
        if (i == 1) {
            return e1j.Y3;
        }
        if (i == 2) {
            return e1j.T4;
        }
        if (i == 3) {
            return e1j.X3;
        }
        if (i == 6) {
            return e1j.v0;
        }
        if (i == 7) {
            return e1j.u0;
        }
        if (i != 8) {
            return i != 14 ? e1j.Y3 : e1j.Z1;
        }
        return e1j.J1;
    }

    public static final boolean perfectInfo(@NotNull FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (!AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin() || UserInfoManager.getUserProfile$default(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE), false, 1, null).isCompleted()) {
            return true;
        }
        SportPreference sportPreference = SportPreference.INSTANCE;
        if (!sportPreference.getPROMPT_USERINFO()) {
            return true;
        }
        SetPageManageExtKt.getInstance(SetPageManager.INSTANCE).showUserInfoDialog(activity);
        sportPreference.setPROMPT_USERINFO(false);
        return false;
    }

    @Nullable
    public static final String twoDigits(float f) {
        DecimalFormat decimalFormat = new DecimalFormat("0.##");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        return decimalFormat.format(Float.valueOf(f));
    }
}
