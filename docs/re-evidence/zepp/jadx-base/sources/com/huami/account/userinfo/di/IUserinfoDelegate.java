package com.huami.account.userinfo.di;

import androidx.fragment.app.FragmentActivity;
import com.huami.account.api.HMAccountWebAPI;
import com.huami.account.userinfo.bean.PersonInfoItem;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H&J\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH&J\b\u0010\u000e\u001a\u00020\rH&J\b\u0010\u000f\u001a\u00020\rH&J\b\u0010\u0010\u001a\u00020\bH&J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H&J;\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142!\u0010\u001a\u001a\u001d\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\b0\u0016H\u0016¨\u0006\u001c"}, d2 = {"Lcom/huami/account/userinfo/di/IUserinfoDelegate;", "", "Landroidx/fragment/app/FragmentActivity;", DbUtils.Const.Table.CONTEXT, "", "Lcom/huami/account/userinfo/bean/PersonInfoItem;", "providePersonInfoExtraItems", "activity", "", "weightItemActionExceptDefault", "", HMAccountWebAPI.MILI_CONFIG_EXTRA_WEATHER, "getDisplayCity", "", "hasBoundDisney", "hasBoundFalconDisney", "setUserInfoToDevice", "", "unit", "setupTemperatureUnit", "", "initialWeight", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "weight", "weightCallback", "pickWeightValue", "userinfo_release"}, k = 1, mv = {1, 5, 1})
public interface IUserinfoDelegate {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "未实现体重选择器";
            }
        }

        public static void pickWeightValue(@NotNull IUserinfoDelegate iUserinfoDelegate, @NotNull FragmentActivity fragmentActivity, float f, @NotNull Function1<? super Float, Unit> function1) {
            HMLog.info$default(null, a.a, 1, null);
        }
    }

    @NotNull
    String getDisplayCity(@NotNull String weatherSetting);

    boolean hasBoundDisney();

    boolean hasBoundFalconDisney();

    void pickWeightValue(@NotNull FragmentActivity activity, float initialWeight, @NotNull Function1<? super Float, Unit> weightCallback);

    @NotNull
    List<PersonInfoItem> providePersonInfoExtraItems(@NotNull FragmentActivity context);

    void setUserInfoToDevice();

    void setupTemperatureUnit(int unit);

    void weightItemActionExceptDefault(@NotNull FragmentActivity activity);
}
