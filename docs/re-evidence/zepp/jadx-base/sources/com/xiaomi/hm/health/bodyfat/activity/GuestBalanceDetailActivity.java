package com.xiaomi.hm.health.bodyfat.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModelProviders;
import com.huami.tools.analytics.DbUtils;
import com.huami.view.basetitle.BaseTitleActivity;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.utils.BFTitleStyleKt;
import com.xiaomi.hm.health.bodyfat.view.SDAdaptiveTextView;
import com.xiaomi.hm.health.bodyfat.viewmodel.BalanceDetailViewModel;
import com.xiaomi.hm.health.databases.model.WeightInfos;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014R\u001d\u0010\f\u001a\u00020\u00078B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/activity/GuestBalanceDetailActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "", "initView", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/xiaomi/hm/health/bodyfat/viewmodel/BalanceDetailViewModel;", "x", "Lkotlin/Lazy;", "l", "()Lcom/xiaomi/hm/health/bodyfat/viewmodel/BalanceDetailViewModel;", "viewModel", "<init>", "()V", "Companion", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class GuestBalanceDetailActivity extends BaseTitleActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String y = "key_score";

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel = LazyKt__LazyJVMKt.lazy(new a());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/activity/GuestBalanceDetailActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "score", "", "startMe", "", GuestBalanceDetailActivity.y, "Ljava/lang/String;", "<init>", "()V", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void startMe(@NotNull Context context, int score) {
            Intent intent = new Intent(context, (Class<?>) GuestBalanceDetailActivity.class);
            Bundle bundle = new Bundle();
            bundle.putInt(GuestBalanceDetailActivity.y, score);
            Unit unit = Unit.INSTANCE;
            intent.putExtras(bundle);
            context.startActivity(intent);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/viewmodel/BalanceDetailViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<BalanceDetailViewModel> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BalanceDetailViewModel invoke() {
            return (BalanceDetailViewModel) ViewModelProviders.of(GuestBalanceDetailActivity.this).get(BalanceDetailViewModel.class);
        }
    }

    private final void initView() {
        BFTitleStyleKt.setUnifyTitleStyle$default(this, null, null, 3, null);
        TextView titleTextView = getTitleTextView();
        titleTextView.setText(getString(R.string.bodyfat_title_measure_balance));
        titleTextView.setTextColor(ContextCompat.getColor(this, R.color.weight_detail_title_color));
        Bundle extras = getIntent().getExtras();
        int i = extras == null ? 0 : extras.getInt(y);
        MutableLiveData<WeightInfos> selectData = l().getSelectData();
        WeightInfos weightInfos = new WeightInfos();
        weightInfos.setOfmt(Float.valueOf(i));
        Unit unit = Unit.INSTANCE;
        selectData.setValue(weightInfos);
        TextView textView = (TextView) findViewById(R.id.card_status_title);
        SDAdaptiveTextView sDAdaptiveTextView = (SDAdaptiveTextView) findViewById(R.id.card_status_introduce);
        textView.setText(R.string.bodyfat_measure_principle);
        sDAdaptiveTextView.setText(R.string.bodyfat_desc_measure_balance_theroy);
    }

    private final BalanceDetailViewModel l() {
        return (BalanceDetailViewModel) this.viewModel.getValue();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        BFTitleStyleKt.setDefaultTheme(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guest_balance_detail);
        initView();
    }
}
