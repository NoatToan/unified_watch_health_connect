package com.huami.sleep.ui.breathquality;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.LifecycleOwnerKt;
import com.chenenyu.router.annotation.Route;
import com.huami.chart.util.Index;
import com.huami.hmchartui.ui.CommonTabActivity;
import com.huami.hmchartui.ui.CommonTabFragment;
import com.huami.module.homepage.cards.helper.RouterHelper;
import com.huami.module.ktx.NumberExtKt;
import com.huami.sleep.R;
import com.huami.sleep.koin.ScopesKt;
import com.huami.sleep.repo.IBreathQualitySelectHistoryRepo;
import com.huami.sleep.util.SleepStatusAnalytics;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.context.GlobalContext;

/* JADX INFO: loaded from: classes13.dex */
@Route({RouterHelper.SLEEP_BREATH_PATH})
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\bH\u0016J\n\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016R\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/huami/sleep/ui/breathquality/BreathQualityActivity;", "Lcom/huami/hmchartui/ui/CommonTabActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "", "getTitleText", "", "type", "onActionClick", "timeType", "Lcom/huami/hmchartui/ui/CommonTabFragment;", "createTabFragment", "Landroidx/fragment/app/Fragment;", "createNoSlideFragment", "Lcom/huami/sleep/repo/IBreathQualitySelectHistoryRepo;", "Lcom/huami/chart/util/Index;", "b", "Lcom/huami/sleep/repo/IBreathQualitySelectHistoryRepo;", "mHistroyRepo", "<init>", "()V", "Companion", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class BreathQualityActivity extends CommonTabActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String c = "user_id";

    @NotNull
    private static final String d = "time_type";

    @NotNull
    private static final String e = "time";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final IBreathQualitySelectHistoryRepo<Index> mHistroyRepo = (IBreathQualitySelectHistoryRepo) ScopesKt.sleepDataScope(GlobalContext.INSTANCE.get()).get(Reflection.getOrCreateKotlinClass(IBreathQualitySelectHistoryRepo.class), null, null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J&\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bR\u0016\u0010\f\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0016\u0010\u000f\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/huami/sleep/ui/breathquality/BreathQualityActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "userId", "", "timeType", "", "time", "", NotificationCompat.CATEGORY_NAVIGATION, "ARGS_TIME", "Ljava/lang/String;", "ARGS_TIME_TYPE", "ARGS_USER_ID", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void navigation(@NotNull Context context, @NotNull String userId, int timeType, long time) {
            Intent intent = new Intent(context, (Class<?>) BreathQualityActivity.class);
            intent.putExtra("user_id", userId);
            intent.putExtra(BreathQualityActivity.d, timeType);
            intent.putExtra("time", time);
            Unit unit = Unit.INSTANCE;
            context.startActivity(intent);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sleep.ui.breathquality.BreathQualityActivity$onCreate$1", f = "BreathQualityActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BreathQualityActivity.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            BreathQualityActivity breathQualityActivity = BreathQualityActivity.this;
            breathQualityActivity.setCurrentTabPosition(breathQualityActivity.getIntent().getIntExtra(BreathQualityActivity.d, 16), BreathQualityActivity.this.getIntent().getLongExtra("time", System.currentTimeMillis()));
            return Unit.INSTANCE;
        }
    }

    @Override // com.huami.hmchartui.ui.CommonTabActivity
    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.hmchartui.ui.CommonTabActivity
    @Nullable
    public Fragment createNoSlideFragment() {
        return null;
    }

    @Override // com.huami.hmchartui.ui.CommonTabActivity
    @NotNull
    public CommonTabFragment createTabFragment(int timeType) {
        BreathQualityTabFragment.Companion companion = BreathQualityTabFragment.INSTANCE;
        String stringExtra = getIntent().getStringExtra("user_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        return companion.newInstance(stringExtra, timeType);
    }

    @Override // com.huami.hmchartui.ui.CommonTabActivity
    @NotNull
    public CharSequence getTitleText() {
        SpannableString spannableString = new SpannableString(getString(R.string.sleep_breath_quality) + "  ");
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.ic_sleep_breath_quality_beta);
        if (drawable != null) {
            drawable.setBounds(0, 0, NumberExtKt.getDp(30), NumberExtKt.getDp(15));
            spannableString.setSpan(new ImageSpan(drawable, 2), spannableString.length() - 1, spannableString.length(), 17);
        }
        return spannableString;
    }

    @Override // com.huami.hmchartui.ui.CommonTabActivity
    public void onActionClick(int type) {
    }

    @Override // com.huami.hmchartui.ui.CommonTabActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setTheme(R.style.Theme_App);
        super.onCreate(savedInstanceState);
        setMenuIcon(0);
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new a(null));
        SleepStatusAnalytics.recordEvent(SleepStatusAnalytics.EventId.SLP_BREATH_DETAIL);
        this.mHistroyRepo.cleanRecord();
    }
}
