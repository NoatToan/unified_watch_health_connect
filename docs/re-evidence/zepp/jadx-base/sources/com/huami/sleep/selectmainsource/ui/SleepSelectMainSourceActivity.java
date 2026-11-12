package com.huami.sleep.selectmainsource.ui;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.sleep.R;
import com.huami.sleep.ext.ViewExKt;
import com.huami.sleep.selectmainsource.ui.SleepSelectMainSourceActivity;
import com.huami.sleep.selectmainsource.viewmodel.SleepMainSourceViewModel;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.util.net.NetUtil;
import com.huami.view.basetitle.BaseTitleActivity;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0012\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014J\u0006\u0010\r\u001a\u00020\u0002R\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u001d\u0010\u0018\u001a\u00020\u00148B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u000f\u0010\u0017R\u001d\u0010\u001c\u001a\u00020\u00198B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u0012\u0010\u001b¨\u0006 "}, d2 = {"Lcom/huami/sleep/selectmainsource/ui/SleepSelectMainSourceActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "", "initData", "", "isEarbud", "B", "r", "loadData", "w", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "initView", "", "x", "Ljava/lang/String;", "mDate", "y", "mUserId", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "z", "Lkotlin/Lazy;", "()Lcom/huami/android/design/dialog/loading/LoadingDialog;", "mDialog", "Lcom/huami/sleep/selectmainsource/viewmodel/SleepMainSourceViewModel;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "()Lcom/huami/sleep/selectmainsource/viewmodel/SleepMainSourceViewModel;", "mViewModel", "<init>", "()V", "Companion", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class SleepSelectMainSourceActivity extends BaseTitleActivity {

    @NotNull
    private static final String B = "SleepDataSourceSelectActivity";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String KEY_DATE = "dateKey";

    @NotNull
    public static final String KEY_USER_ID = "user_id";

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    private final Lazy mViewModel;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private String mDate;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private String mUserId;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    private final Lazy mDialog = LazyKt__LazyJVMKt.lazy(new b());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007R\u0016\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0016\u0010\f\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/huami/sleep/selectmainsource/ui/SleepSelectMainSourceActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "userId", "date", "", "lunch", "KEY_DATE", "Ljava/lang/String;", "KEY_USER_ID", "mTag", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ String a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str) {
                super(0);
                this.a = str;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "date:  " + this.a;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void lunch(@NotNull Context context, @NotNull String userId, @NotNull String date) {
            HMLog.info(SleepSelectMainSourceActivity.B, new a(date));
            Intent intent = new Intent(context, (Class<?>) SleepSelectMainSourceActivity.class);
            intent.putExtra("dateKey", date);
            intent.putExtra("user_id", userId);
            Unit unit = Unit.INSTANCE;
            context.startActivity(intent);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Boolean bool) {
            super(0);
            this.a = bool;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "changeResult:  " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/android/design/dialog/loading/LoadingDialog;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<LoadingDialog> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LoadingDialog invoke() {
            return new LoadingDialog(SleepSelectMainSourceActivity.this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SleepSelectMainSourceActivity() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.sleep.selectmainsource.ui.SleepSelectMainSourceActivity$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelOwner invoke() {
                ViewModelOwner.Companion companion = ViewModelOwner.INSTANCE;
                ComponentCallbacks componentCallbacks = this;
                return companion.from((ViewModelStoreOwner) componentCallbacks, componentCallbacks instanceof SavedStateRegistryOwner ? (SavedStateRegistryOwner) componentCallbacks : null);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.mViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<SleepMainSourceViewModel>() { // from class: com.huami.sleep.selectmainsource.ui.SleepSelectMainSourceActivity$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.sleep.selectmainsource.viewmodel.SleepMainSourceViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final SleepMainSourceViewModel invoke() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(SleepMainSourceViewModel.class), function0, objArr);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(SleepSelectMainSourceActivity sleepSelectMainSourceActivity, View view) {
        if (Intrinsics.areEqual(sleepSelectMainSourceActivity.y().getMIsEarbud().getValue(), Boolean.TRUE)) {
            return;
        }
        sleepSelectMainSourceActivity.w(true);
    }

    private final void B(boolean isEarbud) {
        if (isEarbud) {
            ((ImageView) findViewById(R.id.miliIcon)).setVisibility(4);
            ((ImageView) findViewById(R.id.earbudIcon)).setVisibility(0);
        } else {
            ((ImageView) findViewById(R.id.miliIcon)).setVisibility(0);
            ((ImageView) findViewById(R.id.earbudIcon)).setVisibility(4);
        }
    }

    private final void initData() {
        String stringExtra = getIntent().getStringExtra("dateKey");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.mDate = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("user_id");
        this.mUserId = stringExtra2 != null ? stringExtra2 : "";
    }

    private final void loadData() {
        SleepMainSourceViewModel sleepMainSourceViewModelY = y();
        String str = this.mDate;
        Objects.requireNonNull(str);
        sleepMainSourceViewModelY.setDate(str);
        String str2 = this.mDate;
        Objects.requireNonNull(str2);
        sleepMainSourceViewModelY.checkIsEarBud(str2);
    }

    @JvmStatic
    public static final void lunch(@NotNull Context context, @NotNull String str, @NotNull String str2) {
        INSTANCE.lunch(context, str, str2);
    }

    private final void r() {
        SleepMainSourceViewModel sleepMainSourceViewModelY = y();
        String str = this.mUserId;
        Objects.requireNonNull(str);
        sleepMainSourceViewModelY.setUserId(str);
        sleepMainSourceViewModelY.getChangeResult().observe(this, new Observer() { // from class: h17
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SleepSelectMainSourceActivity.s(this.a, (Boolean) obj);
            }
        });
        sleepMainSourceViewModelY.getMIsEarbud().observe(this, new Observer() { // from class: g17
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SleepSelectMainSourceActivity.t(this.a, (Boolean) obj);
            }
        });
        sleepMainSourceViewModelY.getMiliText().observe(this, new Observer() { // from class: j17
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SleepSelectMainSourceActivity.u(this.a, (String) obj);
            }
        });
        sleepMainSourceViewModelY.getEarbudText().observe(this, new Observer() { // from class: i17
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SleepSelectMainSourceActivity.v(this.a, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(SleepSelectMainSourceActivity sleepSelectMainSourceActivity, Boolean bool) {
        HMLog.info(B, new a(bool));
        if (!bool.booleanValue()) {
            sleepSelectMainSourceActivity.x().setFailed(sleepSelectMainSourceActivity.getString(R.string.earbud_net_error_toast));
            return;
        }
        SleepMainSourceViewModel sleepMainSourceViewModelY = sleepSelectMainSourceActivity.y();
        String str = sleepSelectMainSourceActivity.mDate;
        Objects.requireNonNull(str);
        sleepMainSourceViewModelY.checkIsEarBud(str);
        SleepMainSourceViewModel sleepMainSourceViewModelY2 = sleepSelectMainSourceActivity.y();
        String str2 = sleepSelectMainSourceActivity.mDate;
        Objects.requireNonNull(str2);
        sleepMainSourceViewModelY2.startDataAnalysis(str2);
        sleepSelectMainSourceActivity.x().dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(SleepSelectMainSourceActivity sleepSelectMainSourceActivity, Boolean bool) {
        sleepSelectMainSourceActivity.B(bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(SleepSelectMainSourceActivity sleepSelectMainSourceActivity, String str) {
        ((TextView) sleepSelectMainSourceActivity.findViewById(R.id.sourceMili)).setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(SleepSelectMainSourceActivity sleepSelectMainSourceActivity, String str) {
        ((TextView) sleepSelectMainSourceActivity.findViewById(R.id.sourceEarbud)).setText(str);
    }

    private final void w(boolean isEarbud) {
        if (!NetUtil.INSTANCE.networkInfo().isNetworkConnect()) {
            Toast.makeText(this, R.string.no_network, 0).show();
            return;
        }
        x().setMessage(getString(R.string.loading));
        x().show();
        SleepMainSourceViewModel sleepMainSourceViewModelY = y();
        String str = this.mDate;
        Objects.requireNonNull(str);
        sleepMainSourceViewModelY.changeDataSource(str, isEarbud);
    }

    private final LoadingDialog x() {
        return (LoadingDialog) this.mDialog.getValue();
    }

    private final SleepMainSourceViewModel y() {
        return (SleepMainSourceViewModel) this.mViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(SleepSelectMainSourceActivity sleepSelectMainSourceActivity, View view) {
        if (Intrinsics.areEqual(sleepSelectMainSourceActivity.y().getMIsEarbud().getValue(), Boolean.TRUE)) {
            sleepSelectMainSourceActivity.w(false);
        }
    }

    public void _$_clearFindViewByIdCache() {
    }

    public final void initView() {
        ((TextView) findViewById(R.id.sourceMili)).setOnClickListener(new View.OnClickListener() { // from class: f17
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SleepSelectMainSourceActivity.z(this.a, view);
            }
        });
        ((TextView) findViewById(R.id.sourceEarbud)).setOnClickListener(new View.OnClickListener() { // from class: e17
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SleepSelectMainSourceActivity.A(this.a, view);
            }
        });
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setTheme(R.style.Theme_App);
        super.onCreate(savedInstanceState);
        ViewExKt.setUnifyTitleStyle$default(this, getString(R.string.sleep_select_source), null, null, 6, null);
        setContentView(R.layout.slp_activity_data_source_select_layout);
        initData();
        initView();
        r();
        loadData();
    }
}
