package com.xiaomi.fitness.electronic.scale.manager;

import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountCoreInfo;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.electronic.scale.manager.MiAccountManager;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005J\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007J\u0006\u0010\f\u001a\u00020\nJ\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\u000eJ\u0006\u0010\u0010\u001a\u00020\u0005J\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/manager/MiAccountManager;", "", "<init>", "()V", "getMiId", "", "parseDate", "Ljava/util/Date;", "strDate", "getAge", "", "birthDay", "getSex", "getHeight", "", "getWeight", "getNickName", "getAvatarAddress", "Companion", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MiAccountManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<MiAccountManager> instance$delegate = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, new Function0() { // from class: kuf
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MiAccountManager.instance_delegate$lambda$2();
        }
    });

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/manager/MiAccountManager$Companion;", "", "<init>", "()V", "instance", "Lcom/xiaomi/fitness/electronic/scale/manager/MiAccountManager;", "getInstance", "()Lcom/xiaomi/fitness/electronic/scale/manager/MiAccountManager;", "instance$delegate", "Lkotlin/Lazy;", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final MiAccountManager getInstance() {
            return (MiAccountManager) MiAccountManager.instance$delegate.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MiAccountManager instance_delegate$lambda$2() {
        return new MiAccountManager();
    }

    public final int getAge() {
        String birth = UserInfoManager.getUserProfile$default(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE), false, 1, null).getBirth();
        if (birth == null || birth.length() == 0) {
            return 0;
        }
        return getAge(parseDate(birth));
    }

    @NotNull
    public final String getAvatarAddress() {
        UserInfoManager.Companion companion = UserInfoManager.INSTANCE;
        if (AccountManagerExtKt.getInstance(companion).getXiaomiCoreInfo() != null) {
            AccountCoreInfo xiaomiCoreInfo = AccountManagerExtKt.getInstance(companion).getXiaomiCoreInfo();
            Intrinsics.checkNotNull(xiaomiCoreInfo);
            if (xiaomiCoreInfo.getAvatarAddress() != null) {
                AccountCoreInfo xiaomiCoreInfo2 = AccountManagerExtKt.getInstance(companion).getXiaomiCoreInfo();
                Intrinsics.checkNotNull(xiaomiCoreInfo2);
                String avatarAddress = xiaomiCoreInfo2.getAvatarAddress();
                Intrinsics.checkNotNull(avatarAddress);
                return avatarAddress;
            }
        }
        return "";
    }

    public final float getHeight() {
        return UserInfoManager.getUserProfile$default(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE), false, 1, null).getHeight();
    }

    @NotNull
    public final String getMiId() {
        return AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId();
    }

    @NotNull
    public final String getNickName() {
        UserInfoManager.Companion companion = UserInfoManager.INSTANCE;
        UserInfoManager.getUserProfile$default(AccountManagerExtKt.getInstance(companion), false, 1, null).getName();
        return UserInfoManager.getUserProfile$default(AccountManagerExtKt.getInstance(companion), false, 1, null).getName();
    }

    public final int getSex() {
        return !StringsKt__StringsJVMKt.equals$default(UserInfoManager.getUserProfile$default(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE), false, 1, null).getSex(), "female", false, 2, null) ? 1 : 0;
    }

    public final float getWeight() {
        return UserInfoManager.getUserProfile$default(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE), false, 1, null).getWeight();
    }

    @NotNull
    public final Date parseDate(@NotNull String strDate) throws ParseException {
        Intrinsics.checkNotNullParameter(strDate, "strDate");
        Date date = new SimpleDateFormat("yyyy-MM-dd").parse(strDate);
        Intrinsics.checkNotNullExpressionValue(date, "parse(...)");
        return date;
    }

    public final int getAge(@Nullable Date birthDay) {
        Calendar calendar = Calendar.getInstance();
        if (!calendar.before(birthDay)) {
            int i = calendar.get(1);
            int i2 = calendar.get(2);
            int i3 = calendar.get(5);
            calendar.setTime(birthDay);
            int i4 = calendar.get(1);
            int i5 = calendar.get(2);
            int i6 = calendar.get(5);
            int i7 = i - i4;
            if (i2 <= i5) {
                return (i2 != i5 || i3 < i6) ? i7 - 1 : i7;
            }
            return i7;
        }
        throw new IllegalArgumentException("The birthDay is before Now.It's unbelievable!".toString());
    }
}
