package com.huami.sleep.napsleep.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentTransaction;
import com.huami.sky.lib.constant.WebConstant;
import com.huami.sleep.R;
import com.huami.sleep.ext.KoinExtKt;
import com.huami.sleep.ext.ViewExKt;
import com.huami.tools.analytics.DbUtils;
import com.huami.view.basetitle.BaseTitleActivity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¨\u0006\n"}, d2 = {"Lcom/huami/sleep/napsleep/ui/NapSleepDetailActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "", "initView", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "<init>", "()V", "Companion", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class NapSleepDetailActivity extends BaseTitleActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String x = "extra_date";

    @NotNull
    private static final String y = "user_id";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007R\u0016\u0010\t\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/huami/sleep/napsleep/ui/NapSleepDetailActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "date", "userId", "", WebConstant.QueryParam.LAUNCH, "EXTRA_DATE", "Ljava/lang/String;", "EXTRA_USER_ID", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void launch(@NotNull Context context, @NotNull String date, @NotNull String userId) {
            Intent intent = new Intent(context, (Class<?>) NapSleepDetailActivity.class);
            intent.putExtra(NapSleepDetailActivity.x, date);
            intent.putExtra("user_id", userId);
            Unit unit = Unit.INSTANCE;
            context.startActivity(intent);
        }
    }

    private final void initView() {
        ViewExKt.setUnifyTitleStyle$default(this, getString(R.string.sporadic_sleep), null, null, 6, null);
        String stringExtra = getIntent().getStringExtra(x);
        if (stringExtra == null) {
            return;
        }
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        int i = R.id.container;
        NapSleepDayFragment.Companion companion = NapSleepDayFragment.INSTANCE;
        String stringExtra2 = getIntent().getStringExtra("user_id");
        if (stringExtra2 == null) {
            stringExtra2 = KoinExtKt.getAccountInfo().getUserId();
        }
        fragmentTransactionBeginTransaction.add(i, companion.getInstance(stringExtra, stringExtra2)).commit();
    }

    @JvmStatic
    public static final void launch(@NotNull Context context, @NotNull String str, @NotNull String str2) {
        INSTANCE.launch(context, str, str2);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setTheme(R.style.Theme_App);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nap_sleep_detail);
        initView();
    }
}
