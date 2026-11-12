package com.huami.femalehealth.uilib.ui.activity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.femalehealth.logiclib.helper.DateHelper;
import com.huami.femalehealth.logiclib.helper.NetUtil;
import com.huami.femalehealth.logiclib.helper.ext.NumberExtKt;
import com.huami.femalehealth.logiclib.manager.FHUploadPermissionManager;
import com.huami.femalehealth.uilib.R;
import com.huami.femalehealth.uilib.data.SportDay;
import com.huami.femalehealth.uilib.helper.ChartHelper;
import com.huami.femalehealth.uilib.helper.FHSettingUtils;
import com.huami.femalehealth.uilib.helper.ResourceHelper;
import com.huami.femalehealth.uilib.koin.ComponentCallbackExtKt;
import com.huami.femalehealth.uilib.ui.activity.FHPeriodSettingActivity;
import com.huami.femalehealth.uilib.viewmodel.SettingViewModel;
import com.huami.femalehealth.uilib.widget.ExtKt;
import com.huami.femalehealth.uilib.widget.dialog.SingleWheelDialog;
import com.huami.lib.rainbow.ListTile;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.widget.toast.CustomToastKtxKt;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.Calendar;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 '2\u00020\u0001:\u0001'B\u0007¢\u0006\u0004\b%\u0010&J\b\u0010\u0003\u001a\u00020\u0002H\u0002J!\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0002J\b\u0010\u000b\u001a\u00020\u0002H\u0002J\b\u0010\f\u001a\u00020\u0002H\u0002J\b\u0010\r\u001a\u00020\u0002H\u0002J\b\u0010\u000e\u001a\u00020\u0002H\u0002J\u0012\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014R\u0016\u0010\u0014\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001d\u0010$\u001a\u00020\u001f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006("}, d2 = {"Lcom/huami/femalehealth/uilib/ui/activity/FHPeriodSettingActivity;", "Lcom/huami/femalehealth/uilib/ui/activity/FHBaseTitleActivity;", "", com.google.android.exoplayer2.text.ttml.b.r, "Lcom/huami/lib/rainbow/ListTile;", "item", "", "value", GoogleApiAvailabilityLight.b, "(Lcom/huami/lib/rainbow/ListTile;Ljava/lang/Integer;)V", DTransferConstants.SEARCH_KEY, "initView", "y", "m", "l", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "a", LogUtil.I, "periodLen", "b", "cycleLen", "", "c", "J", "lastMenstruationTime", "", GoogleApiAvailabilityLight.a, "Z", "enablePredict", "Lcom/huami/femalehealth/uilib/viewmodel/SettingViewModel;", "e", "Lkotlin/Lazy;", "o", "()Lcom/huami/femalehealth/uilib/viewmodel/SettingViewModel;", "viewModel", "<init>", "()V", "Companion", "uilib_release"}, k = 1, mv = {1, 5, 1})
public final class FHPeriodSettingActivity extends FHBaseTitleActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "FHPeriodSettingActivity";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int periodLen = -1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int cycleLen = -1;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private long lastMenstruationTime = -1;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean enablePredict;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/huami/femalehealth/uilib/ui/activity/FHPeriodSettingActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "start", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "uilib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void start(@NotNull Context context) {
            context.startActivity(new Intent(context, (Class<?>) FHPeriodSettingActivity.class));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "periodLen=" + FHPeriodSettingActivity.this.periodLen + ", cycleLen=" + FHPeriodSettingActivity.this.cycleLen + ", lastTime=" + NumberExtKt.dateFormat(FHPeriodSettingActivity.this.lastMenstruationTime, ChartHelper.FMT_MM_DD) + ", enablePredict=" + FHPeriodSettingActivity.this.enablePredict;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "selectedIndex", "<anonymous parameter 1>", "<anonymous parameter 2>", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function3<Integer, Integer, Integer, Unit> {
        public final /* synthetic */ ListTile b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ListTile listTile) {
            super(3);
            this.b = listTile;
        }

        public final void a(int i, @Nullable Integer num, @Nullable Integer num2) {
            int i2;
            String quantityString;
            if (FHPeriodSettingActivity.this.cycleLen != -1 && i + 1 > FHPeriodSettingActivity.this.cycleLen) {
                FHPeriodSettingActivity fHPeriodSettingActivity = FHPeriodSettingActivity.this;
                CustomToastKtxKt.showToast((Activity) fHPeriodSettingActivity, (CharSequence) fHPeriodSettingActivity.getString(R.string.fh_cycleLen_invalid_data), false);
                return;
            }
            ListTile listTile = this.b;
            Resources resources = ResourceHelper.INSTANCE.getResources();
            String str = "";
            if (resources != null && (quantityString = resources.getQuantityString(R.plurals.fh_time_day_var, (i2 = i + 1), Integer.valueOf(i2))) != null) {
                str = quantityString;
            }
            listTile.setTips(str);
            FHPeriodSettingActivity.this.periodLen = i + 1;
            FHPeriodSettingActivity.this.l();
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2, Integer num3) {
            a(num.intValue(), num2, num3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "selectedIndex", "<anonymous parameter 1>", "<anonymous parameter 2>", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function3<Integer, Integer, Integer, Unit> {
        public final /* synthetic */ ListTile a;
        public final /* synthetic */ Ref.IntRef b;
        public final /* synthetic */ FHPeriodSettingActivity c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ListTile listTile, Ref.IntRef intRef, FHPeriodSettingActivity fHPeriodSettingActivity) {
            super(3);
            this.a = listTile;
            this.b = intRef;
            this.c = fHPeriodSettingActivity;
        }

        public final void a(int i, @Nullable Integer num, @Nullable Integer num2) {
            ListTile listTile = this.a;
            Resources resources = ResourceHelper.INSTANCE.getResources();
            String str = "";
            if (resources != null) {
                int i2 = R.plurals.fh_time_day_var;
                int i3 = this.b.element;
                String quantityString = resources.getQuantityString(i2, i + i3, Integer.valueOf(i3 + i));
                if (quantityString != null) {
                    str = quantityString;
                }
            }
            listTile.setTips(str);
            this.c.cycleLen = i + this.b.element;
            this.c.l();
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2, Integer num3) {
            a(num.intValue(), num2, num3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return Intrinsics.stringPlus("lastMenstruationTime:", Long.valueOf(FHPeriodSettingActivity.this.lastMenstruationTime));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "selectedIndex", "<anonymous parameter 1>", "<anonymous parameter 2>", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function3<Integer, Integer, Integer, Unit> {
        public final /* synthetic */ ListTile a;
        public final /* synthetic */ SportDay b;
        public final /* synthetic */ FHPeriodSettingActivity c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ListTile listTile, SportDay sportDay, FHPeriodSettingActivity fHPeriodSettingActivity) {
            super(3);
            this.a = listTile;
            this.b = sportDay;
            this.c = fHPeriodSettingActivity;
        }

        public final void a(int i, @Nullable Integer num, @Nullable Integer num2) {
            int i2 = i - 99;
            this.a.setTips(FHSettingUtils.INSTANCE.fmtKey(this.b.addDay(i2)));
            this.c.lastMenstruationTime = this.b.addDay(i2).getTimestamp();
            this.c.l();
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2, Integer num3) {
            a(num.intValue(), num2, num3);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FHPeriodSettingActivity() {
        final ComponentCallbackExtKt.C15291 c15291 = new ComponentCallbackExtKt.C15291(this);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<SettingViewModel>() { // from class: com.huami.femalehealth.uilib.ui.activity.FHPeriodSettingActivity$special$$inlined$injectViewModelInFH$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.femalehealth.uilib.viewmodel.SettingViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final SettingViewModel getA() {
                return org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(SettingViewModel.class), c15291, objArr);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(FHPeriodSettingActivity fHPeriodSettingActivity, DialogInterface dialogInterface, int i) {
        fHPeriodSettingActivity.enablePredict = true;
        fHPeriodSettingActivity.m();
        dialogInterface.dismiss();
    }

    private final void initView() {
        final ListTile listTile = (ListTile) findViewById(R.id.item_fh_period_long);
        listTile.setOnClickListener(new View.OnClickListener() { // from class: uy1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FHPeriodSettingActivity.u(listTile, this, view);
            }
        });
        Context context = listTile.getContext();
        int i = R.string.fh_please_choose;
        listTile.setTips(context.getString(i));
        final ListTile listTile2 = (ListTile) findViewById(R.id.item_fh_physiological_long);
        listTile2.setOnClickListener(new View.OnClickListener() { // from class: sy1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FHPeriodSettingActivity.v(this.a, listTile2, view);
            }
        });
        listTile2.setTips(listTile2.getContext().getString(i));
        final ListTile listTile3 = (ListTile) findViewById(R.id.item_fh_period_last_time);
        listTile3.setOnClickListener(new View.OnClickListener() { // from class: ty1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FHPeriodSettingActivity.w(this.a, listTile3, view);
            }
        });
        listTile3.setTips(listTile3.getContext().getString(i));
        int i2 = R.id.item_card_forecast;
        ((ListTile) findViewById(i2)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: wy1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                FHPeriodSettingActivity.x(this.a, compoundButton, z);
            }
        });
        ((ImageView) findViewById(R.id.iv_forecast_icon)).setOnClickListener(new View.OnClickListener() { // from class: vy1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FHPeriodSettingActivity.s(view);
            }
        });
        ((Button) findViewById(R.id.btn_complete)).setOnClickListener(new View.OnClickListener() { // from class: qy1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FHPeriodSettingActivity.t(this.a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l() {
        ((Button) findViewById(R.id.btn_complete)).setEnabled(this.periodLen > 0 && this.cycleLen > 0 && this.lastMenstruationTime > 0);
    }

    private final void m() {
        HMLog.info(TAG, new a());
        o().setInitSetting(this.periodLen, this.cycleLen, this.lastMenstruationTime, this.enablePredict);
        finish();
        FemaleHealthActivity.INSTANCE.start(this);
    }

    private final void n(ListTile item, Integer value) {
        String quantityString;
        if (value == null || value.intValue() <= 0) {
            item.setTips(getString(R.string.fh_please_choose));
            return;
        }
        Resources resources = ResourceHelper.INSTANCE.getResources();
        String str = "";
        if (resources != null && (quantityString = resources.getQuantityString(R.plurals.fh_time_day_var, value.intValue(), value)) != null) {
            str = quantityString;
        }
        item.setTips(str);
    }

    private final SettingViewModel o() {
        return (SettingViewModel) this.viewModel.getValue();
    }

    private final void p() {
        n((ListTile) findViewById(R.id.item_fh_period_long), Integer.valueOf(this.periodLen));
        n((ListTile) findViewById(R.id.item_fh_physiological_long), Integer.valueOf(this.cycleLen));
        n((ListTile) findViewById(R.id.item_fh_period_last_time), Integer.valueOf((int) this.lastMenstruationTime));
        ((ListTile) findViewById(R.id.item_card_forecast)).setChecked(this.enablePredict);
        l();
    }

    private final void q() {
        ((RainbowTitleBar) findViewById(R.id.tv_title_bar)).setNavigationOnClickListener(new View.OnClickListener() { // from class: ry1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FHPeriodSettingActivity.r(this.a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(FHPeriodSettingActivity fHPeriodSettingActivity, View view) {
        fHPeriodSettingActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(View view) {
        InstructionsActivity.INSTANCE.start(view.getContext(), view.getContext().getString(R.string.fh_instructions_activity_title), view.getContext().getString(R.string.fh_instructions_title), view.getContext().getString(R.string.fh_instructions_content));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(FHPeriodSettingActivity fHPeriodSettingActivity, View view) {
        FHUploadPermissionManager fHUploadPermissionManager = FHUploadPermissionManager.INSTANCE;
        if (!fHUploadPermissionManager.getHasPermission()) {
            FHUploadPermissionManager.showNoPermissionMsg$default(fHUploadPermissionManager, fHPeriodSettingActivity, null, 2, null);
            return;
        }
        if (fHPeriodSettingActivity.cycleLen < fHPeriodSettingActivity.periodLen + 2) {
            CustomToastKtxKt.showToast((Activity) fHPeriodSettingActivity, (CharSequence) fHPeriodSettingActivity.getString(R.string.fh_cycleLen_invalid_data), false);
            return;
        }
        if (!NetUtil.INSTANCE.isNetworkConnected(fHPeriodSettingActivity)) {
            CustomToastKtxKt.showToast((Activity) fHPeriodSettingActivity, (CharSequence) fHPeriodSettingActivity.getString(R.string.fh_network_error), false);
        } else if (fHPeriodSettingActivity.enablePredict) {
            fHPeriodSettingActivity.m();
        } else {
            fHPeriodSettingActivity.y();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(ListTile listTile, FHPeriodSettingActivity fHPeriodSettingActivity, View view) {
        List<Integer> listCreatePeriodLongDialogData = FHSettingUtils.INSTANCE.createPeriodLongDialogData();
        String string = listTile.getContext().getString(R.string.fh_date_select);
        String string2 = listTile.getContext().getString(R.string.fh_time_day_text);
        int i = fHPeriodSettingActivity.periodLen;
        if (i == -1) {
            i = 5;
        }
        new SingleWheelDialog(string, "", string2, listCreatePeriodLongDialogData, listCreatePeriodLongDialogData.indexOf(Integer.valueOf(i)), null, fHPeriodSettingActivity.new b(listTile), 32, null).show(fHPeriodSettingActivity.getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(FHPeriodSettingActivity fHPeriodSettingActivity, ListTile listTile, View view) {
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = 11;
        int i = fHPeriodSettingActivity.periodLen;
        if (i != 0) {
            intRef.element = i + 2;
        }
        List<Integer> listCreatePhysiologicalLongDialogData = FHSettingUtils.INSTANCE.createPhysiologicalLongDialogData(intRef.element);
        String string = listTile.getContext().getString(R.string.fh_date_select);
        String string2 = listTile.getContext().getString(R.string.fh_time_day_text);
        int i2 = fHPeriodSettingActivity.cycleLen;
        if (i2 == -1) {
            i2 = 28;
        }
        new SingleWheelDialog(string, "", string2, listCreatePhysiologicalLongDialogData, listCreatePhysiologicalLongDialogData.indexOf(Integer.valueOf(i2)), null, new c(listTile, intRef, fHPeriodSettingActivity), 32, null).show(fHPeriodSettingActivity.getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(FHPeriodSettingActivity fHPeriodSettingActivity, ListTile listTile, View view) {
        int size;
        SportDay sportDay = new SportDay(DateHelper.INSTANCE.today());
        HMLog.error$default("xys", null, null, fHPeriodSettingActivity.new d(), 6, null);
        if (fHPeriodSettingActivity.lastMenstruationTime > 0) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(fHPeriodSettingActivity.lastMenstruationTime);
            size = FHSettingUtils.INSTANCE.indexOfLastPeriodDialogData(new SportDay(calendar));
        } else {
            size = 99;
        }
        List<String> listCreateLastPeriodDialogData = FHSettingUtils.INSTANCE.createLastPeriodDialogData(sportDay);
        String string = listTile.getContext().getString(R.string.fh_date_select);
        if (fHPeriodSettingActivity.lastMenstruationTime == -1) {
            size = listCreateLastPeriodDialogData.size() - 1;
        }
        new SingleWheelDialog(string, "", "", listCreateLastPeriodDialogData, size, null, new e(listTile, sportDay, fHPeriodSettingActivity), 32, null).show(fHPeriodSettingActivity.getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(FHPeriodSettingActivity fHPeriodSettingActivity, CompoundButton compoundButton, boolean z) {
        fHPeriodSettingActivity.enablePredict = z;
    }

    private final void y() {
        AlertDialog alertDialogCreate = new AlertDialog.Builder(this, R.style.FHAlertDialog).setNegativeButton(getString(R.string.fh_remain_close), new DialogInterface.OnClickListener() { // from class: oy1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                FHPeriodSettingActivity.z(this.a, dialogInterface, i);
            }
        }).setPositiveButton(getString(R.string.fh_enable_predict), new DialogInterface.OnClickListener() { // from class: py1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                FHPeriodSettingActivity.A(this.a, dialogInterface, i);
            }
        }).setMessage(getString(R.string.fh_enable_predict_desc)).setTitle(getString(R.string.fh_enable_predict_title)).setCancelable(true).create();
        alertDialogCreate.show();
        alertDialogCreate.getButton(-1).setTextColor(ExtKt.getResColor(this, R.color.p3));
        alertDialogCreate.getButton(-2).setTextColor(ExtKt.getResColor(this, R.color.fh_dialog_button_color));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(FHPeriodSettingActivity fHPeriodSettingActivity, DialogInterface dialogInterface, int i) {
        fHPeriodSettingActivity.enablePredict = false;
        fHPeriodSettingActivity.m();
        dialogInterface.dismiss();
    }

    @Override // com.huami.femalehealth.uilib.ui.activity.FHBaseTitleActivity
    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.femalehealth.uilib.ui.activity.FHBaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fh_activity_period_setting);
        q();
        initView();
        p();
        o().refreshSetting();
    }
}
