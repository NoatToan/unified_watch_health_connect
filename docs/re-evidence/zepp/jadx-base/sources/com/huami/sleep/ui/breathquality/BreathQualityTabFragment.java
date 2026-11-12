package com.huami.sleep.ui.breathquality;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.huami.hmchartui.ui.CommonTabFragment;
import com.huami.hmchartui.utils.Constant;
import com.huami.sleep.ext.KoinExtKt;
import com.huami.sleep.statistic.dto.TimeMode;
import com.huami.sleep.statistic.sleepanalysis.ui.SleepAnalysisFragment;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0016R\u001d\u0010\u000e\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/huami/sleep/ui/breathquality/BreathQualityTabFragment;", "Lcom/huami/hmchartui/ui/CommonTabFragment;", "", "getTimeType", "", "getRegisterDate", "time", "position", "Landroidx/fragment/app/Fragment;", "createContentFragment", "a", "Lkotlin/Lazy;", "b", "()I", SleepAnalysisFragment.TIME_MODE, "<init>", "()V", "Companion", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class BreathQualityTabFragment extends CommonTabFragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String b = "user_id";

    @NotNull
    private static final String c = "time_type";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy timeMode = LazyKt__LazyJVMKt.lazy(new a());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\r"}, d2 = {"Lcom/huami/sleep/ui/breathquality/BreathQualityTabFragment$Companion;", "", "", "userId", "", "timeType", "Lcom/huami/sleep/ui/breathquality/BreathQualityTabFragment;", "newInstance", "ARGS_USER_ID", "Ljava/lang/String;", Constant.KEY_TIME_TYPE, "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final BreathQualityTabFragment newInstance(@NotNull String userId, int timeType) {
            BreathQualityTabFragment breathQualityTabFragment = new BreathQualityTabFragment();
            Bundle bundle = new Bundle();
            bundle.putInt(BreathQualityTabFragment.c, timeType);
            bundle.putString("user_id", userId);
            Unit unit = Unit.INSTANCE;
            breathQualityTabFragment.setArguments(bundle);
            return breathQualityTabFragment;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Integer> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Integer invoke() {
            return Integer.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final int invoke2() {
            Bundle arguments = BreathQualityTabFragment.this.getArguments();
            Integer numValueOf = arguments == null ? null : Integer.valueOf(arguments.getInt(BreathQualityTabFragment.c));
            return numValueOf == null ? TimeMode.DAY.getValue() : numValueOf.intValue();
        }
    }

    private final int b() {
        return ((Number) this.timeMode.getValue()).intValue();
    }

    @Override // com.huami.hmchartui.ui.CommonTabFragment
    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.hmchartui.ui.CommonTabFragment
    @NotNull
    public Fragment createContentFragment(long time, int position) {
        String string;
        Bundle arguments = getArguments();
        String str = "";
        if (arguments != null && (string = arguments.getString("user_id")) != null) {
            str = string;
        }
        return BreathQualityFragment.INSTANCE.newInstance(str, b(), time);
    }

    @Override // com.huami.hmchartui.ui.CommonTabFragment
    public long getRegisterDate() {
        return KoinExtKt.getAccountInfo().getCreatTime() * ((long) 1000);
    }

    @Override // com.huami.hmchartui.ui.CommonTabFragment
    public int getTimeType() {
        return b();
    }
}
