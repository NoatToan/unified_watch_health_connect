package com.huami.sync;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentManager;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelLazy;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p008lifecycle.ViewModelStore;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.material.timepicker.TimeModel;
import com.huami.lib.rainbow.ListTile;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.sync.TransmissionActivity;
import com.huami.sync.job.LoggingKt;
import com.huami.tools.analytics.DbUtils;
import com.huami.util.net.NetUtil;
import com.loc.z;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 62\u00020\u0001:\u00016B\u0007¢\u0006\u0004\b4\u00105J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\f\u0010\u0006\u001a\u00020\u0002*\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002J\f\u0010\t\u001a\u00020\u0002*\u00020\u0005H\u0002J\u0012\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\u000e\u001a\u00020\u0002H\u0002J\b\u0010\u000f\u001a\u00020\u0002H\u0002J\b\u0010\u0010\u001a\u00020\u0002H\u0002J\f\u0010\u0011\u001a\u00020\f*\u00020\nH\u0002J\f\u0010\u0013\u001a\u00020\f*\u00020\u0012H\u0002J\u0012\u0010\u0016\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0014J\u0010\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0017H\u0016R\u001d\u0010\u001f\u001a\u00020\u001a8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010%\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010\"R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010+\u001a\u00020\u00058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\b\u0010*R\u0016\u0010,\u001a\u00020\u00058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\r\u0010*R\u0016\u0010-\u001a\u00020\u00058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010*R\u0016\u0010.\u001a\u00020\u00058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010*R\u0016\u00100\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010/R\u0016\u00101\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010/R\u0016\u00103\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010/¨\u00067"}, d2 = {"Lcom/huami/sync/TransmissionActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "", GoogleApiAvailabilityLight.b, "o", "Lcom/huami/lib/rainbow/ListTile;", "m", "", "e", "r", "", "textResId", "", "f", DTransferConstants.SEARCH_KEY, com.google.android.exoplayer2.text.ttml.b.r, "h", "i", "", z.j, "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/MenuItem;", "item", "onOptionsItemSelected", "Lcom/huami/sync/TransmissionViewModel;", "a", "Lkotlin/Lazy;", "g", "()Lcom/huami/sync/TransmissionViewModel;", "viewModel", "Landroid/view/View;", "b", "Landroid/view/View;", "containerStatus", "c", "containerTips", "Lcom/huami/sync/LoadingView;", GoogleApiAvailabilityLight.a, "Lcom/huami/sync/LoadingView;", "loadingView", "Lcom/huami/lib/rainbow/ListTile;", "toggle", "tvHeartRate", "tvStep", "tvCal", LogUtil.I, "currentHr", "currentSteps", hl.k, "currentCalories", "<init>", "()V", "Companion", "realtime_transmission_release"}, k = 1, mv = {1, 5, 1})
public final class TransmissionActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static String l = "extra_hr";

    @NotNull
    private static String m = "extra_steps";

    @NotNull
    private static String n = "extra_calories";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private View containerStatus;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private View containerTips;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private LoadingView loadingView;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private ListTile toggle;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private ListTile tvHeartRate;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private ListTile tvStep;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private ListTile tvCal;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private int currentHr;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private int currentSteps;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private int currentCalories;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J&\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0016\u0010\u000e\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/huami/sync/TransmissionActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "currentHr", "currentSteps", "currentCalories", "Landroid/content/Intent;", "getIntent", "", "EXTRA_CURRENT_CALORIES", "Ljava/lang/String;", "EXTRA_CURRENT_HR", "EXTRA_CURRENT_STEPS", "<init>", "()V", "realtime_transmission_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Intent getIntent(@NotNull Context context, int currentHr, int currentSteps, int currentCalories) {
            Intent intent = new Intent(context, (Class<?>) TransmissionActivity.class);
            intent.putExtra(TransmissionActivity.l, currentHr);
            intent.putExtra(TransmissionActivity.m, currentSteps);
            intent.putExtra(TransmissionActivity.n, currentCalories);
            return intent;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "enable", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
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
            if (z) {
                TransmissionActivity.this.n();
            } else {
                TransmissionActivity.this.o();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "allow", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<Boolean, Unit> {
        public final /* synthetic */ ListTile b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ListTile listTile) {
            super(1);
            this.b = listTile;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            if (z) {
                return;
            }
            TransmissionActivity.this.r(this.b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "success", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<Boolean, Unit> {
        public final /* synthetic */ ListTile b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<Unit> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit getA() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ListTile listTile) {
            super(1);
            this.b = listTile;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            if (TransmissionActivity.this.e()) {
                TransmissionActivity.this.g().stopPoll(a.a);
                return;
            }
            TransmissionActivity.this.h();
            if (z) {
                View view = TransmissionActivity.this.containerStatus;
                if (view == null) {
                    view = null;
                }
                view.setVisibility(0);
                View view2 = TransmissionActivity.this.containerTips;
                (view2 != null ? view2 : null).setVisibility(8);
            } else {
                TransmissionActivity.this.q();
                this.b.setChecked(false);
            }
            Config.INSTANCE.getOnToggle().invoke(TransmissionActivity.this, Boolean.valueOf(this.b.isChecked()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<Unit> {
        public final /* synthetic */ ListTile b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<Boolean, Unit> {
            public static final a a = new a();

            public a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z) {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ListTile listTile) {
            super(0);
            this.b = listTile;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (TransmissionActivity.this.e()) {
                TransmissionActivity.this.g().startPoll(a.a);
                return;
            }
            TransmissionActivity.this.h();
            TransmissionActivity.this.o();
            View view = TransmissionActivity.this.containerStatus;
            if (view == null) {
                view = null;
            }
            view.setVisibility(8);
            View view2 = TransmissionActivity.this.containerTips;
            (view2 != null ? view2 : null).setVisibility(0);
            this.b.setChecked(false);
            Config.INSTANCE.getOnToggle().invoke(TransmissionActivity.this, Boolean.valueOf(this.b.isChecked()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$Factory;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<ViewModelProvider.Factory> {
        public e() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke */
        public final ViewModelProvider.Factory getA() {
            return new TransmissionVMFactory(TransmissionActivity.this.getApplication());
        }
    }

    public TransmissionActivity() {
        super(R.layout.activity_realtime_transmission);
        this.viewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(TransmissionViewModel.class), new Function0<ViewModelStore>() { // from class: com.huami.sync.TransmissionActivity$special$$inlined$viewModels$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final ViewModelStore getA() {
                return this.getViewModelStore();
            }
        }, new e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean e() {
        return isFinishing();
    }

    private final String f(@StringRes int textResId) {
        return getString(R.string.realtime_dot, new Object[]{getString(textResId)});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TransmissionViewModel g() {
        return (TransmissionViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h() {
        LoadingView loadingView = this.loadingView;
        if (loadingView == null) {
            loadingView = null;
        }
        loadingView.setVisibility(8);
        ListTile listTile = this.toggle;
        (listTile != null ? listTile : null).setEnabled(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String i(int i) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format(Locale.getDefault(), TimeModel.NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String j(long j) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format(Locale.getDefault(), TimeModel.NUMBER_FORMAT, Arrays.copyOf(new Object[]{Long.valueOf(j)}, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(TransmissionActivity transmissionActivity, View view) {
        transmissionActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(TransmissionActivity transmissionActivity, ListTile listTile, CompoundButton compoundButton, boolean z) {
        if (z) {
            transmissionActivity.m(listTile);
        } else {
            transmissionActivity.r(listTile);
        }
    }

    private final void m(ListTile listTile) {
        if (NetUtil.INSTANCE.networkInfo().isNetworkConnect()) {
            p();
            g().startPoll(new c(listTile));
        } else {
            Toast.makeText(this, getString(R.string.no_network_connection), 0).show();
            listTile.setChecked(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n() {
        String string;
        ListTile listTile = this.tvHeartRate;
        if (listTile == null) {
            listTile = null;
        }
        int i = this.currentHr;
        listTile.setTips(i > 0 ? String.valueOf(i) : getString(R.string.realtime_data_empty));
        ListTile listTile2 = this.tvStep;
        if (listTile2 == null) {
            listTile2 = null;
        }
        if (this.currentSteps > 0) {
            Resources resources = getResources();
            int i2 = R.plurals.realtime_unit_steps;
            int i3 = this.currentSteps;
            string = resources.getQuantityString(i2, i3, Integer.valueOf(i3));
        } else {
            string = getString(R.string.realtime_unit_step, new Object[]{getString(R.string.realtime_data_empty)});
        }
        listTile2.setTips(string);
        ListTile listTile3 = this.tvCal;
        ListTile listTile4 = listTile3 != null ? listTile3 : null;
        int i4 = this.currentCalories;
        listTile4.setTips(i4 > 0 ? getString(R.string.realtime_unit_cal, new Object[]{i(i4)}) : getString(R.string.realtime_unit_cal, new Object[]{getString(R.string.realtime_data_empty)}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o() {
        ListTile listTile = this.tvHeartRate;
        if (listTile == null) {
            listTile = null;
        }
        int i = R.string.realtime_data_empty;
        listTile.setTips(getString(i));
        ListTile listTile2 = this.tvStep;
        if (listTile2 == null) {
            listTile2 = null;
        }
        listTile2.setTips(getString(R.string.realtime_unit_step, new Object[]{getString(i)}));
        ListTile listTile3 = this.tvCal;
        (listTile3 != null ? listTile3 : null).setTips(getString(R.string.realtime_unit_cal, new Object[]{getString(i)}));
    }

    private final void p() {
        LoadingView loadingView = this.loadingView;
        if (loadingView == null) {
            loadingView = null;
        }
        loadingView.setVisibility(0);
        ListTile listTile = this.toggle;
        (listTile != null ? listTile : null).setEnabled(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q() {
        new ADialog(this, getString(R.string.realtime_auth_notice)).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(ListTile listTile) {
        p();
        g().stopPoll(new d(listTile));
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setTheme(R.style.Theme_App);
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null) {
            this.currentHr = savedInstanceState.getInt(l);
            this.currentSteps = savedInstanceState.getInt(m);
            this.currentCalories = savedInstanceState.getInt(n);
        } else {
            this.currentHr = getIntent().getIntExtra(l, 0);
            this.currentSteps = getIntent().getIntExtra(m, 0);
            this.currentCalories = getIntent().getIntExtra(n, 0);
        }
        ((RainbowTitleBar) findViewById(R.id.toolbar)).setNavigationOnClickListener(new View.OnClickListener() { // from class: ry7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TransmissionActivity.k(this.a, view);
            }
        });
        Config config = Config.INSTANCE;
        Function2<Integer, FragmentManager, Unit> deviceStateFragment = config.getDeviceStateFragment();
        if (deviceStateFragment != null) {
            deviceStateFragment.invoke(Integer.valueOf(R.id.device_state_view_container), getSupportFragmentManager());
        }
        config.setOnBLEStateChange(new a());
        this.loadingView = (LoadingView) findViewById(R.id.loading);
        final ListTile listTile = (ListTile) findViewById(R.id.container_toggle);
        listTile.setChecked(g().isOpen());
        listTile.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: sy7
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                TransmissionActivity.l(this.a, listTile, compoundButton, z);
            }
        });
        if (g().isOpen()) {
            g().toggleCheck(new b(listTile));
        }
        Unit unit = Unit.INSTANCE;
        this.toggle = listTile;
        ((TextView) findViewById(R.id.tv_realtime_open_tips1)).setText(f(R.string.open_realtime_tips1));
        ((TextView) findViewById(R.id.tv_realtime_open_tips2)).setText(f(R.string.open_realtime_tips2));
        ((TextView) findViewById(R.id.tv_realtime_open_tips3)).setText(f(R.string.open_realtime_tips3));
        ListTile listTile2 = (ListTile) findViewById(R.id.tv_heart_rate);
        listTile2.setTrailing((Drawable) null);
        this.tvHeartRate = listTile2;
        ListTile listTile3 = (ListTile) findViewById(R.id.tv_step);
        listTile3.setTrailing((Drawable) null);
        this.tvStep = listTile3;
        ListTile listTile4 = (ListTile) findViewById(R.id.tv_cal);
        listTile4.setTrailing((Drawable) null);
        this.tvCal = listTile4;
        n();
        g().getStepLiveData$realtime_transmission_release().observe(this, new Observer<T>() { // from class: com.huami.sync.TransmissionActivity$onCreate$$inlined$observe$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(T t) {
                Step step = (Step) t;
                if (step.getSteps() > 0) {
                    ListTile listTile5 = this.a.tvStep;
                    if (listTile5 == null) {
                        listTile5 = null;
                    }
                    listTile5.setTips(this.a.getResources().getQuantityString(R.plurals.realtime_unit_steps, (int) step.getSteps(), Integer.valueOf((int) step.getSteps())));
                    this.a.currentSteps = (int) step.getSteps();
                }
                if (step.getCalories() > 0) {
                    ListTile listTile6 = this.a.tvCal;
                    ListTile listTile7 = listTile6 != null ? listTile6 : null;
                    TransmissionActivity transmissionActivity = this.a;
                    listTile7.setTips(transmissionActivity.getString(R.string.realtime_unit_cal, new Object[]{transmissionActivity.j(step.getCalories())}));
                    this.a.currentCalories = (int) step.getCalories();
                }
            }
        });
        g().getHeartRateLiveData$realtime_transmission_release().observe(this, new Observer<T>() { // from class: com.huami.sync.TransmissionActivity$onCreate$$inlined$observe$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(T t) {
                HeartRate heartRate = (HeartRate) t;
                ListTile listTile5 = this.a.tvHeartRate;
                if (listTile5 == null) {
                    listTile5 = null;
                }
                listTile5.setTips(this.a.i(heartRate.getHeartRate()));
                this.a.currentHr = heartRate.getHeartRate();
            }
        });
        View viewFindViewById = findViewById(R.id.container_status);
        viewFindViewById.setVisibility(g().isOpen() ? 0 : 8);
        this.containerStatus = viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.container_tips);
        viewFindViewById2.setVisibility(g().isOpen() ? 8 : 0);
        this.containerTips = viewFindViewById2;
        TextView textView = (TextView) findViewById(R.id.tv_realtime_sync_tips);
        String string = getString(R.string.hm_open);
        textView.setText(new Spanny(getString(R.string.realtime_sync_tips, new Object[]{string})).findAndSpan(string, new Spanny.GetSpan() { // from class: com.huami.sync.TransmissionActivity$onCreate$resultSpan$1
            @Override // com.huami.sync.Spanny.GetSpan
            @NotNull
            public Object getSpan() {
                final TransmissionActivity transmissionActivity = this.a;
                return new ClickableSpan() { // from class: com.huami.sync.TransmissionActivity$onCreate$resultSpan$1$span$1
                    @Override // android.text.style.ClickableSpan
                    public void onClick(@NotNull View widget) {
                        LoggingKt.log("跳转开放平台官网");
                        Config.INSTANCE.getOnHmOpenClick().getA();
                    }

                    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                    public void updateDrawState(@NotNull TextPaint ds) {
                        super.updateDrawState(ds);
                        ds.setColor(ContextCompat.getColor(transmissionActivity, R.color.s15));
                        ds.setUnderlineText(false);
                    }
                };
            }
        }));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setHighlightColor(0);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(@NotNull MenuItem item) {
        if (item.getItemId() != 16908332) {
            return super.onOptionsItemSelected(item);
        }
        onBackPressed();
        return true;
    }
}
