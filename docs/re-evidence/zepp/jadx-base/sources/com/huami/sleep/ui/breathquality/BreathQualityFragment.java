package com.huami.sleep.ui.breathquality;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.hmchartui.utils.Constant;
import com.huami.sleep.R;
import com.huami.sleep.statistic.dto.TimeMode;
import com.huami.sleep.statistic.dto.TimeParam;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0016\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0002\u001a\u00020\u0001H\u0002J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u000f\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0002\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/huami/sleep/ui/breathquality/BreathQualityFragment;", "Landroidx/fragment/app/Fragment;", "b", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "Lcom/huami/sleep/statistic/dto/TimeParam;", "a", "Lcom/huami/sleep/statistic/dto/TimeParam;", "timeParam", "", "Ljava/lang/String;", "mUserId", "<init>", "()V", "Companion", "sleep_release"}, k = 1, mv = {1, 5, 1})
public class BreathQualityFragment extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String c = "score_chart";

    @NotNull
    private static final String d = "od_chart";

    @NotNull
    private static final String e = "user_id";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private TimeParam timeParam;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private String mUserId;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0016\u0010\r\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/huami/sleep/ui/breathquality/BreathQualityFragment$Companion;", "", "", "userId", "", "timeType", "", "time", "Lcom/huami/sleep/ui/breathquality/BreathQualityFragment;", "newInstance", "ARGS_USER_ID", "Ljava/lang/String;", "FRAGMENT_OD_TAG", "FRAGMENT_SCORE_TAG", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final BreathQualityFragment newInstance(@NotNull String userId, int timeType, long time) {
            BreathQualityFragment breathQualityFragment = new BreathQualityFragment();
            Bundle bundle = new Bundle();
            bundle.putLong(Constant.KEY_TIME, time);
            bundle.putInt(Constant.KEY_TIME_TYPE, timeType);
            bundle.putString("user_id", userId);
            Unit unit = Unit.INSTANCE;
            breathQualityFragment.setArguments(bundle);
            return breathQualityFragment;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TimeMode.values().length];
            iArr[TimeMode.DAY.ordinal()] = 1;
            iArr[TimeMode.WEEK.ordinal()] = 2;
            iArr[TimeMode.MONTH.ordinal()] = 3;
            iArr[TimeMode.YEAR.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public BreathQualityFragment() {
        super(R.layout.fragment_breath_quality);
    }

    private final Fragment b() {
        TimeParam timeParam = this.timeParam;
        Objects.requireNonNull(timeParam);
        int i = WhenMappings.$EnumSwitchMapping$0[timeParam.getMode().ordinal()];
        if (i == 1) {
            BreathQualityDayScoreChartFragment.Companion companion = BreathQualityDayScoreChartFragment.INSTANCE;
            String str = this.mUserId;
            Objects.requireNonNull(str);
            TimeParam timeParam2 = this.timeParam;
            Objects.requireNonNull(timeParam2);
            return companion.newInstance(str, timeParam2.getTime());
        }
        if (i != 2 && i != 3) {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            BreathQualityYearChartFragment.Companion companion2 = BreathQualityYearChartFragment.INSTANCE;
            String str2 = this.mUserId;
            Objects.requireNonNull(str2);
            TimeParam timeParam3 = this.timeParam;
            Objects.requireNonNull(timeParam3);
            return companion2.getInstance(str2, timeParam3.getTime());
        }
        BreathQualityWMChartFragment.Companion companion3 = BreathQualityWMChartFragment.INSTANCE;
        String str3 = this.mUserId;
        Objects.requireNonNull(str3);
        TimeParam timeParam4 = this.timeParam;
        Objects.requireNonNull(timeParam4);
        TimeMode mode = timeParam4.getMode();
        TimeParam timeParam5 = this.timeParam;
        Objects.requireNonNull(timeParam5);
        return companion3.getInstance(str3, mode, timeParam5.getTime());
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        String string;
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        TimeParam timeParam = arguments == null ? null : new TimeParam(TimeMode.INSTANCE.gerModeByValue(arguments.getInt(Constant.KEY_TIME_TYPE)), arguments.getLong(Constant.KEY_TIME));
        if (timeParam == null) {
            timeParam = new TimeParam(TimeMode.DAY, 0L, 2, null);
        }
        this.timeParam = timeParam;
        Bundle arguments2 = getArguments();
        String str = "";
        if (arguments2 != null && (string = arguments2.getString("user_id")) != null) {
            str = string;
        }
        this.mUserId = str;
        FragmentManager childFragmentManager = getChildFragmentManager();
        FragmentTransaction fragmentTransactionBeginTransaction = childFragmentManager.beginTransaction();
        if (childFragmentManager.findFragmentByTag(c) == null) {
            fragmentTransactionBeginTransaction.add(R.id.chartContentFL, b(), c);
        }
        TimeParam timeParam2 = this.timeParam;
        Objects.requireNonNull(timeParam2);
        if (WhenMappings.$EnumSwitchMapping$0[timeParam2.getMode().ordinal()] == 1 && childFragmentManager.findFragmentByTag(d) == null) {
            int i = R.id.chartContentFL;
            BreathQualityDayOdChartFragment.Companion companion = BreathQualityDayOdChartFragment.INSTANCE;
            String str2 = this.mUserId;
            Objects.requireNonNull(str2);
            TimeParam timeParam3 = this.timeParam;
            Objects.requireNonNull(timeParam3);
            fragmentTransactionBeginTransaction.add(i, companion.newInstance(str2, timeParam3.getTime()), d);
        }
        fragmentTransactionBeginTransaction.commit();
    }
}
