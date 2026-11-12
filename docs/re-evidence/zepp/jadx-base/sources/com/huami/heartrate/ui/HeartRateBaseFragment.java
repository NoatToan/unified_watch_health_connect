package com.huami.heartrate.ui;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u000b\b\u0016\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u0007\u001a\u00020\u00028F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\t\u001a\u00020\u00028D@\u0004X\u0084\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/huami/heartrate/ui/HeartRateBaseFragment;", "Landroidx/fragment/app/Fragment;", "", "a", "Lkotlin/Lazy;", "getStartTime", "()J", "startTime", "getTime", "time", "<init>", "()V", "Companion", "heartrate_release"}, k = 1, mv = {1, 5, 1})
public class HeartRateBaseFragment extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String EXTRA_KEY_POS = "EXTRA_KEY_POS";

    @NotNull
    public static final String EXTRA_KEY_TIME = "EXTRA_KEY_TIME";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy startTime = LazyKt__LazyJVMKt.lazy(new a());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004R\u0016\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u00020\t8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/huami/heartrate/ui/HeartRateBaseFragment$Companion;", "", "", "time", "", "timeType", "pos", "Lcom/huami/heartrate/ui/HeartRateBaseFragment;", "newInstance", "", HeartRateBaseFragment.EXTRA_KEY_POS, "Ljava/lang/String;", HeartRateBaseFragment.EXTRA_KEY_TIME, "<init>", "()V", "heartrate_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final HeartRateBaseFragment newInstance(long time, int timeType, int pos) {
            HeartRateBaseFragment heartRateWeekDetailFragment;
            switch (timeType) {
                case 17:
                    heartRateWeekDetailFragment = new HeartRateWeekDetailFragment();
                    break;
                case 18:
                    heartRateWeekDetailFragment = new HeartRateMonthDetailFragment();
                    break;
                case 19:
                    heartRateWeekDetailFragment = new HeartRateYearDetailFragment();
                    break;
                default:
                    heartRateWeekDetailFragment = new HeartRateDayDetailFragment();
                    break;
            }
            Bundle bundle = new Bundle();
            bundle.putLong(HeartRateBaseFragment.EXTRA_KEY_TIME, time);
            bundle.putInt(HeartRateBaseFragment.EXTRA_KEY_POS, pos);
            Unit unit = Unit.INSTANCE;
            heartRateWeekDetailFragment.setArguments(bundle);
            return heartRateWeekDetailFragment;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\t\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Long> {
        public a() {
            super(0);
        }

        public final long a() {
            Bundle arguments = HeartRateBaseFragment.this.getArguments();
            Long lValueOf = arguments == null ? null : Long.valueOf(arguments.getLong(HeartRateBaseFragment.EXTRA_KEY_TIME));
            return lValueOf == null ? System.currentTimeMillis() : lValueOf.longValue();
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Long getA() {
            return Long.valueOf(a());
        }
    }

    public final long getStartTime() {
        return ((Number) this.startTime.getValue()).longValue();
    }

    public final long getTime() {
        return requireArguments().getLong(EXTRA_KEY_TIME);
    }
}
