package com.xiaomi.fitness.sport.utils;

import android.annotation.SuppressLint;
import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.user.info.export.SetPageManageExtKt;
import com.xiaomi.fitness.user.info.export.SetPageManager;
import defpackage.c1j;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004\u001a\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u001a\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u001a\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b¨\u0006\f"}, d2 = {"twoDigits", "", "", "getSportTypeStr", "", DailyRecordKey.sportType, "convertSportType", "convertSportType2", "perfectInfo", "", LifecycleConstantKt.TYPE_ACTIVITY, "Landroidx/fragment/app/FragmentActivity;", "sport_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SportUtilsExtKt {
    @SuppressLint({"WrongConstant"})
    public static final int convertSportType(int i) {
        if (i == 1 || i == 2) {
            return 22;
        }
        if (i == 3) {
            return 3;
        }
        if (i != 6) {
            return i;
        }
        return 23;
    }

    @SuppressLint({"WrongConstant"})
    public static final int convertSportType2(int i) {
        if (i == 1) {
            return 22;
        }
        if (i == 2) {
            return 28;
        }
        if (i == 3) {
            return 21;
        }
        if (i != 6) {
            return i;
        }
        return 26;
    }

    public static final int getSportTypeStr(int i) {
        if (i == 1) {
            return c1j.d4;
        }
        if (i == 2) {
            return c1j.f4832r;
        }
        if (i == 3) {
            return c1j.b4;
        }
        if (i == 6) {
            return c1j.c1;
        }
        if (i == 8) {
            return c1j.B1;
        }
        if (i != 14) {
            return i != 324 ? c1j.d4 : c1j.v;
        }
        return c1j.t;
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
