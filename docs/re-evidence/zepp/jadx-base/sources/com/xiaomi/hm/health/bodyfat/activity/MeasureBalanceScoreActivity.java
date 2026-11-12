package com.xiaomi.hm.health.bodyfat.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProviders;
import com.huami.tools.analytics.DbUtils;
import com.huami.view.basetitle.BaseTitleActivity;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.activity.MeasureBalanceScoreActivity;
import com.xiaomi.hm.health.bodyfat.fragment.MeasureBalanceFailureFragment;
import com.xiaomi.hm.health.bodyfat.fragment.MeasureBalanceFragment;
import com.xiaomi.hm.health.bodyfat.fragment.MeasureBalanceGestureFragment;
import com.xiaomi.hm.health.bodyfat.model.MeasureBalanceState;
import com.xiaomi.hm.health.bodyfat.utils.BFTitleStyleKt;
import com.xiaomi.hm.health.bodyfat.utils.BlueUtilsKt;
import com.xiaomi.hm.health.bodyfat.utils.WeightBluetoothStateReceiver;
import com.xiaomi.hm.health.bodyfat.viewmodel.MeasureBalanceViewModel;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\b\u0010\u0007\u001a\u00020\u0002H\u0014R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001d\u0010\u0015\u001a\u00020\u00108B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/activity/MeasureBalanceScoreActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "", "o", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onDestroy", "Lcom/xiaomi/hm/health/bodyfat/utils/WeightBluetoothStateReceiver;", "x", "Lcom/xiaomi/hm/health/bodyfat/utils/WeightBluetoothStateReceiver;", "blueStateReceiver", "", "y", "Z", "isMeasuringBalance", "Lcom/xiaomi/hm/health/bodyfat/viewmodel/MeasureBalanceViewModel;", "z", "Lkotlin/Lazy;", "m", "()Lcom/xiaomi/hm/health/bodyfat/viewmodel/MeasureBalanceViewModel;", "viewModel", "<init>", "()V", "Companion", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class MeasureBalanceScoreActivity extends BaseTitleActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @Nullable
    private WeightBluetoothStateReceiver blueStateReceiver;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private boolean isMeasuringBalance;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel = LazyKt__LazyJVMKt.lazy(new b());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/activity/MeasureBalanceScoreActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "isGuest", "", "startMe", "<init>", "()V", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void startMe(@NotNull Context context, boolean isGuest) {
            Intent intent = new Intent(context, (Class<?>) MeasureBalanceScoreActivity.class);
            Bundle bundle = new Bundle();
            bundle.putBoolean("IS_GUEST", isGuest);
            Unit unit = Unit.INSTANCE;
            intent.putExtras(bundle);
            context.startActivity(intent);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "state", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Boolean, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            if (z || !MeasureBalanceScoreActivity.this.isMeasuringBalance || z) {
                return;
            }
            MeasureBalanceScoreActivity.this.isMeasuringBalance = false;
            MeasureBalanceScoreActivity.this.getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new MeasureBalanceFailureFragment()).commit();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/viewmodel/MeasureBalanceViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<MeasureBalanceViewModel> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MeasureBalanceViewModel getA() {
            return (MeasureBalanceViewModel) ViewModelProviders.of(MeasureBalanceScoreActivity.this).get(MeasureBalanceViewModel.class);
        }
    }

    private final MeasureBalanceViewModel m() {
        return (MeasureBalanceViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(MeasureBalanceScoreActivity measureBalanceScoreActivity, boolean z, MeasureBalanceState measureBalanceState) {
        if (measureBalanceState instanceof MeasureBalanceState.Failure) {
            measureBalanceScoreActivity.isMeasuringBalance = false;
            measureBalanceScoreActivity.getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new MeasureBalanceFailureFragment()).commit();
            return;
        }
        if (measureBalanceState instanceof MeasureBalanceState.Prepare) {
            measureBalanceScoreActivity.isMeasuringBalance = false;
            measureBalanceScoreActivity.getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new MeasureBalanceGestureFragment()).commit();
            return;
        }
        if (measureBalanceState instanceof MeasureBalanceState.Measuring) {
            measureBalanceScoreActivity.isMeasuringBalance = true;
            measureBalanceScoreActivity.getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, MeasureBalanceFragment.INSTANCE.newInstance(z)).commit();
        } else if (measureBalanceState instanceof MeasureBalanceState.Success) {
            measureBalanceScoreActivity.isMeasuringBalance = false;
            if (z) {
                GuestBalanceDetailActivity.INSTANCE.startMe(measureBalanceScoreActivity, (int) ((MeasureBalanceState.Success) measureBalanceState).getValue());
            } else {
                BalanceDetailsActivity.INSTANCE.startMe(measureBalanceScoreActivity, ((MeasureBalanceState.Success) measureBalanceState).getValue());
            }
            measureBalanceScoreActivity.finish();
        }
    }

    private final void o() {
        WeightBluetoothStateReceiver weightBluetoothStateReceiver = new WeightBluetoothStateReceiver(new a());
        this.blueStateReceiver = weightBluetoothStateReceiver;
        registerReceiver(weightBluetoothStateReceiver, BlueUtilsKt.weightBlueStateIntentFilter());
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        BFTitleStyleKt.setDefaultTheme(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_measure_balance_score);
        getWindow().addFlags(128);
        BFTitleStyleKt.setTitleStyle$default(this, null, null, null, ContextCompat.getColor(this, R.color.scale_measuring_bg_end_color), false, 23, null);
        o();
        TextView titleTextView = getTitleTextView();
        titleTextView.setText(getString(R.string.bodyfat_title_measure_balance));
        titleTextView.setTextColor(ContextCompat.getColor(this, R.color.weight_detail_title_color));
        Bundle extras = getIntent().getExtras();
        final boolean z = extras == null ? false : extras.getBoolean("IS_GUEST");
        m().getPageIndex().observe(this, new Observer() { // from class: rv4
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                MeasureBalanceScoreActivity.n(this.a, z, (MeasureBalanceState) obj);
            }
        });
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m().setMeasureBalanceMode(false);
        this.isMeasuringBalance = false;
        unregisterReceiver(this.blueStateReceiver);
    }
}
