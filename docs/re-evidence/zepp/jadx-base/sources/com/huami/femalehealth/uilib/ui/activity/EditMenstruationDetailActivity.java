package com.huami.femalehealth.uilib.ui.activity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.p008lifecycle.Observer;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.android.vo.Resource;
import com.huami.android.vo.Status;
import com.huami.android.zxing.Intents;
import com.huami.femalehealth.logiclib.helper.DateHelper;
import com.huami.femalehealth.logiclib.helper.ext.NumberExtKt;
import com.huami.femalehealth.logiclib.vo.HistoryItemVo;
import com.huami.femalehealth.uilib.R;
import com.huami.femalehealth.uilib.koin.ComponentCallbackExtKt;
import com.huami.femalehealth.uilib.ui.activity.EditMenstruationDetailActivity;
import com.huami.femalehealth.uilib.viewmodel.EditDetailViewModel;
import com.huami.femalehealth.uilib.widget.ExtKt;
import com.huami.hmdateformat.date.HMDataFormatKt;
import com.huami.hmdateformat.date.HMPattern;
import com.huami.lib.rainbow.ListTile;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.Date;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 (2\u00020\u0001:\u0001(B\u0007¢\u0006\u0004\b&\u0010'J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0002J\b\u0010\u0010\u001a\u00020\u0002H\u0002J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u0012\u0010\u0016\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0014R\u001d\u0010\u001c\u001a\u00020\u00178B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010 \u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010%\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006)"}, d2 = {"Lcom/huami/femalehealth/uilib/ui/activity/EditMenstruationDetailActivity;", "Lcom/huami/femalehealth/uilib/ui/activity/FHBaseTitleActivity;", "", "initObservers", "", "time", "", "fmt", com.google.android.exoplayer2.text.ttml.b.r, "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "E", "", "type", "x", "v", "Lcom/huami/femalehealth/uilib/viewmodel/EditDetailViewModel$PeriodTip;", "tip", "F", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/huami/femalehealth/uilib/viewmodel/EditDetailViewModel;", "a", "Lkotlin/Lazy;", DTransferConstants.SEARCH_KEY, "()Lcom/huami/femalehealth/uilib/viewmodel/EditDetailViewModel;", "detailViewModel", "Lcom/huami/femalehealth/logiclib/vo/HistoryItemVo;", "b", "Lcom/huami/femalehealth/logiclib/vo/HistoryItemVo;", "historyItem", "c", LogUtil.I, GoogleApiAvailabilityLight.a, "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "loadingDialog", "<init>", "()V", "Companion", "uilib_release"}, k = 1, mv = {1, 5, 1})
public final class EditMenstruationDetailActivity extends FHBaseTitleActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String ITEM = "item";

    @NotNull
    public static final String TAG = "EditMenstruationDetailActivity";

    @NotNull
    public static final String TYPE = "type";
    public static final int TYPE_ADD = 2;
    public static final int TYPE_EDIT = 1;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy detailViewModel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private HistoryItemVo historyItem;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int type;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private LoadingDialog loadingDialog;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\u000b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0016\u0010\u000f\u001a\u00020\u000b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0016\u0010\u0010\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/huami/femalehealth/uilib/ui/activity/EditMenstruationDetailActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "type", "Lcom/huami/femalehealth/logiclib/vo/HistoryItemVo;", "item", "", "start", "(Landroid/content/Context;Ljava/lang/Integer;Lcom/huami/femalehealth/logiclib/vo/HistoryItemVo;)V", "", "ITEM", "Ljava/lang/String;", "TAG", Intents.WifiConnect.TYPE, "TYPE_ADD", LogUtil.I, "TYPE_EDIT", "<init>", "()V", "uilib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void start$default(Companion companion, Context context, Integer num, HistoryItemVo historyItemVo, int i, Object obj) {
            if ((i & 2) != 0) {
                num = 2;
            }
            if ((i & 4) != 0) {
                historyItemVo = null;
            }
            companion.start(context, num, historyItemVo);
        }

        public final void start(@NotNull Context context, @Nullable Integer type, @Nullable HistoryItemVo item) {
            Intent intent = new Intent(context, (Class<?>) EditMenstruationDetailActivity.class);
            intent.putExtra("type", type);
            intent.putExtra("item", item);
            context.startActivity(intent);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Status.values().length];
            iArr[Status.SUCCESS.ordinal()] = 1;
            iArr[Status.ERROR.ordinal()] = 2;
            iArr[Status.LOADING.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lkotlin/Pair;", "Ljava/util/Date;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Pair<? extends Date, ? extends Date>, Unit> {
        public a() {
            super(1);
        }

        public final void a(@NotNull Pair<? extends Date, ? extends Date> pair) {
            ListTile listTile = (ListTile) EditMenstruationDetailActivity.this.findViewById(R.id.item_menstruation_start);
            long time = pair.getFirst().getTime();
            HMPattern hMPattern = HMPattern.YEAR_ABBR_MONTH_DAY;
            listTile.setTips(HMDataFormatKt.getFormatTime$default(time, hMPattern, (Locale) null, 2, (Object) null));
            ((ListTile) EditMenstruationDetailActivity.this.findViewById(R.id.item_menstruation_end)).setTips(HMDataFormatKt.getFormatTime$default(pair.getSecond().getTime(), hMPattern, (Locale) null, 2, (Object) null));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Date, ? extends Date> pair) {
            a(pair);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("initViews, type=", Integer.valueOf(this.a));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Unit> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            HistoryItemVo historyItemVo = EditMenstruationDetailActivity.this.historyItem;
            if (historyItemVo == null) {
                return;
            }
            EditMenstruationDetailActivity.this.q().deleteMenstruation(new Date(historyItemVo.getMenstrualPeriod()), new Date(historyItemVo.getMenstrualEndTime()), historyItemVo.getId());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Ljava/util/Date;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<Date, Unit> {
        public d() {
            super(1);
        }

        public final void a(@NotNull Date date) {
            ((ListTile) EditMenstruationDetailActivity.this.findViewById(R.id.item_menstruation_start)).setTips(EditMenstruationDetailActivity.this.p(date.getTime(), EditMenstruationDetailActivity.this.getString(R.string.fh_time_format_include_year)));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Date date) {
            a(date);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Ljava/util/Date;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function1<Date, Unit> {
        public e() {
            super(1);
        }

        public final void a(@NotNull Date date) {
            ((ListTile) EditMenstruationDetailActivity.this.findViewById(R.id.item_menstruation_end)).setTips(EditMenstruationDetailActivity.this.p(date.getTime(), EditMenstruationDetailActivity.this.getString(R.string.fh_time_format_include_year)));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Date date) {
            a(date);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EditMenstruationDetailActivity() {
        final ComponentCallbackExtKt.C15291 c15291 = new ComponentCallbackExtKt.C15291(this);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.detailViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<EditDetailViewModel>() { // from class: com.huami.femalehealth.uilib.ui.activity.EditMenstruationDetailActivity$special$$inlined$injectViewModelInFH$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.femalehealth.uilib.viewmodel.EditDetailViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final EditDetailViewModel invoke() {
                return org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(EditDetailViewModel.class), c15291, objArr);
            }
        });
        this.type = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(int i, EditMenstruationDetailActivity editMenstruationDetailActivity, View view) {
        if (i != 1) {
            if (i != 2) {
                return;
            }
            editMenstruationDetailActivity.q().addMenstruation();
        } else {
            HistoryItemVo historyItemVo = editMenstruationDetailActivity.historyItem;
            if (historyItemVo == null || historyItemVo.getId() == null) {
                return;
            }
            editMenstruationDetailActivity.q().editMenstruation(historyItemVo.getId(), new Date(historyItemVo.getMenstrualPeriod()), new Date(historyItemVo.getMenstrualEndTime()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(EditMenstruationDetailActivity editMenstruationDetailActivity, View view) {
        editMenstruationDetailActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(EditMenstruationDetailActivity editMenstruationDetailActivity, View view) {
        editMenstruationDetailActivity.q().showDelDialog(editMenstruationDetailActivity, editMenstruationDetailActivity.new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(EditMenstruationDetailActivity editMenstruationDetailActivity, View view) {
        editMenstruationDetailActivity.finish();
    }

    private final LoadingDialog E(Context context) {
        LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(context);
        loadingDialogShowDialog.setCancelable(false);
        return loadingDialogShowDialog;
    }

    private final void F(final EditDetailViewModel.PeriodTip tip) {
        new AlertDialogFragment.Builder(this).setCancelable(true).setMessage(R.string.fh_period_length_too_Long).setNegativeButton(R.string.fh_cancel, new DialogInterface.OnClickListener() { // from class: ri1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                EditMenstruationDetailActivity.G(dialogInterface, i);
            }
        }).setPositiveButton(R.string.fh_sure, new DialogInterface.OnClickListener() { // from class: ni1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                EditMenstruationDetailActivity.H(tip, this, dialogInterface, i);
            }
        }).show(getSupportFragmentManager()).setGravity(17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(EditDetailViewModel.PeriodTip periodTip, EditMenstruationDetailActivity editMenstruationDetailActivity, DialogInterface dialogInterface, int i) {
        HistoryItemVo historyItemVo;
        dialogInterface.dismiss();
        if (Intrinsics.areEqual(periodTip, EditDetailViewModel.PeriodTip.Add.INSTANCE)) {
            editMenstruationDetailActivity.q().addMenstruationDirect();
        } else {
            if (!Intrinsics.areEqual(periodTip, EditDetailViewModel.PeriodTip.Edit.INSTANCE) || (historyItemVo = editMenstruationDetailActivity.historyItem) == null || historyItemVo.getId() == null) {
                return;
            }
            editMenstruationDetailActivity.q().editMenstruationDirect(historyItemVo.getId(), new Date(historyItemVo.getMenstrualPeriod()), new Date(historyItemVo.getMenstrualEndTime()));
        }
    }

    private final void initObservers() {
        q().getAddResult().observe(this, new Observer() { // from class: zi1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                EditMenstruationDetailActivity.r(this.a, (Resource) obj);
            }
        });
        q().getEditResult().observe(this, new Observer() { // from class: pi1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                EditMenstruationDetailActivity.s(this.a, (Resource) obj);
            }
        });
        q().getDelResult().observe(this, new Observer() { // from class: oi1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                EditMenstruationDetailActivity.t(this.a, (Resource) obj);
            }
        });
        q().initDefaultDateRange(this.type, this.historyItem, new a());
        q().getPeriodAlertLiveData().observe(this, new Observer() { // from class: qi1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                EditMenstruationDetailActivity.u(this.a, (EditDetailViewModel.PeriodTip) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String p(long time, String fmt) {
        return NumberExtKt.dateFormat(Math.min(DateHelper.INSTANCE.today().getTimeInMillis(), time), fmt);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EditDetailViewModel q() {
        return (EditDetailViewModel) this.detailViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(EditMenstruationDetailActivity editMenstruationDetailActivity, Resource resource) {
        if (resource == null) {
            return;
        }
        if (resource.getStatus() == Status.SUCCESS) {
            Toast.makeText(editMenstruationDetailActivity.getApplicationContext(), R.string.fh_save_success, 1).show();
            LoadingDialog loadingDialog = editMenstruationDetailActivity.loadingDialog;
            if (loadingDialog != null) {
                loadingDialog.dismiss();
            }
            editMenstruationDetailActivity.finish();
            return;
        }
        if (resource.getStatus() != Status.ERROR) {
            if (resource.getStatus() == Status.LOADING) {
                editMenstruationDetailActivity.loadingDialog = editMenstruationDetailActivity.E(editMenstruationDetailActivity);
            }
        } else {
            Toast.makeText(editMenstruationDetailActivity.getApplicationContext(), R.string.fh_save_err_and_retry, 1).show();
            LoadingDialog loadingDialog2 = editMenstruationDetailActivity.loadingDialog;
            if (loadingDialog2 == null) {
                return;
            }
            loadingDialog2.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(EditMenstruationDetailActivity editMenstruationDetailActivity, Resource resource) {
        if (resource == null) {
            return;
        }
        if (resource.getStatus() == Status.SUCCESS) {
            Toast.makeText(editMenstruationDetailActivity.getApplicationContext(), R.string.fh_save_success, 1).show();
            LoadingDialog loadingDialog = editMenstruationDetailActivity.loadingDialog;
            if (loadingDialog != null) {
                loadingDialog.dismiss();
            }
            editMenstruationDetailActivity.finish();
            return;
        }
        if (resource.getStatus() != Status.ERROR) {
            if (resource.getStatus() == Status.LOADING) {
                editMenstruationDetailActivity.loadingDialog = editMenstruationDetailActivity.E(editMenstruationDetailActivity);
            }
        } else {
            Toast.makeText(editMenstruationDetailActivity.getApplicationContext(), R.string.fh_save_err_and_retry, 1).show();
            LoadingDialog loadingDialog2 = editMenstruationDetailActivity.loadingDialog;
            if (loadingDialog2 == null) {
                return;
            }
            loadingDialog2.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(EditMenstruationDetailActivity editMenstruationDetailActivity, Resource resource) {
        if (resource == null) {
            return;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[resource.getStatus().ordinal()];
        if (i == 1) {
            Toast.makeText(editMenstruationDetailActivity.getApplicationContext(), R.string.fh_delete_success, 1).show();
            LoadingDialog loadingDialog = editMenstruationDetailActivity.loadingDialog;
            if (loadingDialog != null) {
                loadingDialog.dismiss();
            }
            editMenstruationDetailActivity.finish();
            return;
        }
        if (i != 2) {
            if (i != 3) {
                return;
            }
            editMenstruationDetailActivity.loadingDialog = editMenstruationDetailActivity.E(editMenstruationDetailActivity);
        } else {
            Toast.makeText(editMenstruationDetailActivity.getApplicationContext(), R.string.fh_save_err_and_retry, 1).show();
            LoadingDialog loadingDialog2 = editMenstruationDetailActivity.loadingDialog;
            if (loadingDialog2 == null) {
                return;
            }
            loadingDialog2.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(EditMenstruationDetailActivity editMenstruationDetailActivity, EditDetailViewModel.PeriodTip periodTip) {
        if (periodTip != null) {
            editMenstruationDetailActivity.F(periodTip);
        }
    }

    private final void v() {
        ((RainbowTitleBar) findViewById(R.id.tv_title_bar)).setNavigationOnClickListener(new View.OnClickListener() { // from class: ti1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditMenstruationDetailActivity.w(this.a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(EditMenstruationDetailActivity editMenstruationDetailActivity, View view) {
        editMenstruationDetailActivity.finish();
    }

    private final void x(final int type) {
        HMLog.info(TAG, new b(type));
        int i = R.id.item_menstruation_start;
        ListTile listTile = (ListTile) findViewById(i);
        int i2 = R.color.s2;
        listTile.setTrailingTint(ExtKt.getResColor(this, i2));
        int i3 = R.id.item_menstruation_end;
        ((ListTile) findViewById(i3)).setTrailingTint(ExtKt.getResColor(this, i2));
        if (type == 1) {
            ExtKt.setVisible$default((Button) findViewById(R.id.tv_cancel), false, false, 2, null);
            ExtKt.setVisible$default((Button) findViewById(R.id.tv_delete), true, false, 2, null);
            ExtKt.setVisible$default((Button) findViewById(R.id.tv_keep), true, false, 2, null);
        }
        ((Button) findViewById(R.id.tv_confirm)).setOnClickListener(new View.OnClickListener() { // from class: si1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditMenstruationDetailActivity.A(type, this, view);
            }
        });
        ((Button) findViewById(R.id.tv_cancel)).setOnClickListener(new View.OnClickListener() { // from class: vi1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditMenstruationDetailActivity.B(this.a, view);
            }
        });
        ((Button) findViewById(R.id.tv_delete)).setOnClickListener(new View.OnClickListener() { // from class: ui1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditMenstruationDetailActivity.C(this.a, view);
            }
        });
        ((Button) findViewById(R.id.tv_keep)).setOnClickListener(new View.OnClickListener() { // from class: xi1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditMenstruationDetailActivity.D(this.a, view);
            }
        });
        ((ListTile) findViewById(i)).setOnClickListener(new View.OnClickListener() { // from class: wi1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditMenstruationDetailActivity.y(this.a, view);
            }
        });
        ((ListTile) findViewById(i3)).setOnClickListener(new View.OnClickListener() { // from class: yi1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditMenstruationDetailActivity.z(this.a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(EditMenstruationDetailActivity editMenstruationDetailActivity, View view) {
        editMenstruationDetailActivity.q().showSelectDateDialog(view.getContext(), editMenstruationDetailActivity.getSupportFragmentManager(), true, editMenstruationDetailActivity.new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(EditMenstruationDetailActivity editMenstruationDetailActivity, View view) {
        editMenstruationDetailActivity.q().showSelectDateDialog(view.getContext(), editMenstruationDetailActivity.getSupportFragmentManager(), false, editMenstruationDetailActivity.new e());
    }

    @Override // com.huami.femalehealth.uilib.ui.activity.FHBaseTitleActivity
    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.femalehealth.uilib.ui.activity.FHBaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fh_activity_edit_detail);
        this.type = getIntent().getIntExtra("type", 2);
        this.historyItem = (HistoryItemVo) getIntent().getParcelableExtra("item");
        v();
        x(this.type);
        initObservers();
    }
}
