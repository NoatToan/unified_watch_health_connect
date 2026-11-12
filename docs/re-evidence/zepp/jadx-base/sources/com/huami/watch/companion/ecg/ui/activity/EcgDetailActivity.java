package com.huami.watch.companion.ecg.ui.activity;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelLazy;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p008lifecycle.ViewModelStore;
import com.chenenyu.router.Router;
import com.chenenyu.router.annotation.InjectParam;
import com.chenenyu.router.annotation.Route;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.companion.arch.Result;
import com.huami.watch.companion.ecg.R;
import com.huami.watch.companion.ecg.analytics.EcgAnalyticsManagerKt;
import com.huami.watch.companion.ecg.arch.EcgPagerViewModel;
import com.huami.watch.companion.ecg.ui.activity.EcgDetailActivity;
import com.huami.watch.companion.ecg.ui.fragment.EcgDetailFragment;
import com.huami.watch.companion.ecg.ui.helper.LoadingDialogHelper;
import com.huami.watch.companion.ecg.util.EcgMedicalService;
import com.huami.watch.companion.ecg.util.EcgMedicalUtil;
import com.huami.watch.ui.dialog.AlertDialog;
import com.huami.watch.util.TimeUtil;
import com.loc.z;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Route({"ecg/EcgDetailActivity"})
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000b\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001$B\u0007¢\u0006\u0004\b\"\u0010#J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u0012\u0010\b\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014J\u000e\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\u000e\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tR\u001d\u0010\u0014\u001a\u00020\u000f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0019\u001a\u00020\u00158B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0018R\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006%"}, d2 = {"Lcom/huami/watch/companion/ecg/ui/activity/EcgDetailActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "", "initView", "m", DTransferConstants.SEARCH_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "toDetail", "toHrvDesc", "toMeDong", "toAFibWeb", "Lcom/huami/watch/companion/ecg/arch/EcgPagerViewModel;", "a", "Lkotlin/Lazy;", z.j, "()Lcom/huami/watch/companion/ecg/arch/EcgPagerViewModel;", "mViewModel", "Lcom/huami/watch/companion/ecg/ui/helper/LoadingDialogHelper;", "b", "i", "()Lcom/huami/watch/companion/ecg/ui/helper/LoadingDialogHelper;", "mDialogHelper", "", "c", "J", "getMEcgId", "()J", "setMEcgId", "(J)V", "mEcgId", "<init>", "()V", "Companion", "ecg-companion_release"}, k = 1, mv = {1, 5, 1})
public final class EcgDetailActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String d = "timestamp";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy mViewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(EcgPagerViewModel.class), new Function0<ViewModelStore>() { // from class: com.huami.watch.companion.ecg.ui.activity.EcgDetailActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final ViewModelStore invoke() {
            return this.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.huami.watch.companion.ecg.ui.activity.EcgDetailActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final ViewModelProvider.Factory invoke() {
            return this.getDefaultViewModelProviderFactory();
        }
    });

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy mDialogHelper = LazyKt__LazyJVMKt.lazy(new a());

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @InjectParam(key = "timestamp")
    private long mEcgId;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/huami/watch/companion/ecg/ui/activity/EcgDetailActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "timestamp", "", "to", "", "ARGS_TIMESTAMP", "Ljava/lang/String;", "<init>", "()V", "ecg-companion_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void to(@NotNull Context context, long timestamp) {
            Router.build("ecg/EcgDetailActivity").with("timestamp", Long.valueOf(timestamp)).go(context);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/watch/companion/ecg/ui/helper/LoadingDialogHelper;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<LoadingDialogHelper> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LoadingDialogHelper invoke() {
            return new LoadingDialogHelper(EcgDetailActivity.this);
        }
    }

    private final LoadingDialogHelper i() {
        return (LoadingDialogHelper) this.mDialogHelper.getValue();
    }

    private final void initView() {
        ((ImageView) findViewById(R.id.btn_back)).setOnClickListener(new View.OnClickListener() { // from class: pg1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EcgDetailActivity.k(this.a, view);
            }
        });
        ((TextView) findViewById(R.id.delete_ecg)).setOnClickListener(new View.OnClickListener() { // from class: og1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EcgDetailActivity.l(this.a, view);
            }
        });
        getSupportFragmentManager().beginTransaction().add(R.id.ecg_container, EcgDetailFragment.INSTANCE.newInstance(this.mEcgId)).commit();
    }

    private final EcgPagerViewModel j() {
        return (EcgPagerViewModel) this.mViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(EcgDetailActivity ecgDetailActivity, View view) {
        ecgDetailActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(EcgDetailActivity ecgDetailActivity, View view) {
        ecgDetailActivity.q();
    }

    private final void m() {
        j().setEcgId(this.mEcgId);
        j().getDeleteEcgLiveData().observe(this, new Observer() { // from class: rg1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                EcgDetailActivity.n(this.a, (Result) obj);
            }
        });
        j().getCurrentEcgData().observe(this, new Observer() { // from class: qg1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                EcgDetailActivity.o(this.a, (EcgData) obj);
            }
        });
        j().getAnalysisUrl().observe(this, new Observer() { // from class: sg1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                EcgDetailActivity.p(this.a, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(EcgDetailActivity ecgDetailActivity, Result result) {
        ecgDetailActivity.i().showOrError(result, ecgDetailActivity.getString(R.string.loading), ecgDetailActivity.getString(R.string.ecg_delete_success), ecgDetailActivity.getString(R.string.ecg_delete_failed));
        boolean z = false;
        if (result != null && result.isSuccess()) {
            z = true;
        }
        if (z) {
            ecgDetailActivity.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(EcgDetailActivity ecgDetailActivity, EcgData ecgData) {
        if (ecgData == null) {
            return;
        }
        ((TextView) ecgDetailActivity.findViewById(R.id.title_text)).setText(TimeUtil.formatDateTime(ecgData.getTimestamp() * ((long) 1000), "yyyy-MM-dd HH:mm"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(EcgDetailActivity ecgDetailActivity, String str) {
        if (str == null) {
            return;
        }
        EcgMedicalUtil.INSTANCE.getEcgMedicalService().openWeb(ecgDetailActivity, str);
    }

    private final void q() {
        final EcgData value = j().getCurrentEcgData().getValue();
        if (value == null) {
            return;
        }
        EcgAnalyticsManagerKt.singleEcgCDelete(value);
        AlertDialog.setMessage(getString(R.string.ecg_delete_conform)).setNegativeBtn(getString(R.string.btn_cancel)).setPositiveBtn(getString(R.string.btn_enter), new DialogInterface.OnClickListener() { // from class: ng1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                EcgDetailActivity.r(this.a, value, dialogInterface, i);
            }
        }).show(this, "Delete Ecg");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(EcgDetailActivity ecgDetailActivity, EcgData ecgData, DialogInterface dialogInterface, int i) {
        ecgDetailActivity.j().deleteEcg(ecgData);
        EcgAnalyticsManagerKt.singleEcgCDeleteConfirm(ecgData);
    }

    public void _$_clearFindViewByIdCache() {
    }

    public final long getMEcgId() {
        return this.mEcgId;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecg_detail);
        Router.injectParams(this);
        initView();
        m();
    }

    public final void setMEcgId(long j) {
        this.mEcgId = j;
    }

    public final void toAFibWeb(@NotNull View view) {
        EcgMedicalUtil ecgMedicalUtil = EcgMedicalUtil.INSTANCE;
        EcgMedicalService ecgMedicalService = ecgMedicalUtil.getEcgMedicalService();
        EcgData value = j().getCurrentEcgData().getValue();
        if (ecgMedicalService.isMedicalSource(value == null ? 0 : value.getDeviceSource())) {
            return;
        }
        ecgMedicalUtil.toAFib(this);
    }

    public final void toDetail(@NotNull View view) {
        EcgData value = j().getCurrentEcgData().getValue();
        if (value == null) {
            return;
        }
        EcgChartActivity.INSTANCE.to(this, value.getTimestamp());
        EcgAnalyticsManagerKt.singleEcgCDetail(value);
    }

    public final void toHrvDesc(@NotNull View view) {
        EcgMedicalUtil ecgMedicalUtil = EcgMedicalUtil.INSTANCE;
        EcgMedicalService ecgMedicalService = ecgMedicalUtil.getEcgMedicalService();
        EcgData value = j().getCurrentEcgData().getValue();
        if (ecgMedicalService.isMedicalSource(value == null ? 0 : value.getDeviceSource())) {
            return;
        }
        ecgMedicalUtil.toHrv(this);
    }

    public final void toMeDong(@NotNull View view) {
        j().analysisEcg();
    }
}
