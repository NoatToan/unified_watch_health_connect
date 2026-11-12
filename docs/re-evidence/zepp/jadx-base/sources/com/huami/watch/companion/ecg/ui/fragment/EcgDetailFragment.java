package com.huami.watch.companion.ecg.ui.fragment;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStore;
import androidx.p008lifecycle.ViewModelStoreOwner;
import com.amap.api.mapcore.util.hl;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.ecg.chart.LineChartView;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.ecg.core.model.EcgAnalysisStatus;
import com.huami.ecg.core.model.FilterRecord;
import com.huami.watch.companion.arch.Result;
import com.huami.watch.companion.ecg.R;
import com.huami.watch.companion.ecg.analytics.EcgAnalyticsManagerKt;
import com.huami.watch.companion.ecg.arch.EcgDetailViewModel;
import com.huami.watch.companion.ecg.ui.fragment.EcgDetailFragment;
import com.huami.watch.companion.ecg.ui.helper.LoadingDialogHelper;
import com.huami.watch.companion.ecg.util.EcgMedicalUtil;
import com.huami.watch.companion.ecg.util.EcgUtils;
import com.huami.watch.companion.ui.view.HuaMiFontTextView;
import com.huami.watch.ui.dialog.AlertDialog;
import com.huami.watch.ui.dialog.LoadingDialog;
import com.huami.watch.util.NetworkUtil;
import com.loc.z;
import java.io.File;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 :2\u00020\u0001:\u0001:B\u0007¢\u0006\u0004\b8\u00109J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\f\u001a\u00020\u00022\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0002J\b\u0010\r\u001a\u00020\u0002H\u0002J\b\u0010\u000e\u001a\u00020\u0002H\u0002J&\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016J\u001a\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0019\u001a\u00020\u0002H\u0016R\u001d\u0010\u001f\u001a\u00020\u001a8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010$\u001a\u00020 8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010#R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u001d\u0010-\u001a\u00020)8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u001c\u001a\u0004\b+\u0010,R\u0018\u00101\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R3\u00107\u001a\u001f\u0012\u0013\u0012\u00110\n¢\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u0002\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106¨\u0006;"}, d2 = {"Lcom/huami/watch/companion/ecg/ui/fragment/EcgDetailFragment;", "Landroidx/fragment/app/Fragment;", "", "initView", "initViewModel", "l", "Lcom/huami/ecg/core/db/entity/EcgData;", EcgAnalyticsManagerKt.ECG, "u", "Lcom/huami/watch/companion/arch/Result;", "Ljava/io/File;", "file", "r", "h", SOAP.XMLNS, "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "onResume", "", "a", "Lkotlin/Lazy;", z.j, "()J", "mEcgId", "Lcom/huami/watch/companion/ecg/arch/EcgDetailViewModel;", "b", hl.k, "()Lcom/huami/watch/companion/ecg/arch/EcgDetailViewModel;", "mViewModel", "", "c", "Z", "mShare", "Lcom/huami/watch/companion/ecg/ui/helper/LoadingDialogHelper;", GoogleApiAvailabilityLight.a, "i", "()Lcom/huami/watch/companion/ecg/ui/helper/LoadingDialogHelper;", "mDialogHelper", "Lcom/huami/watch/companion/ecg/ui/fragment/ShareFragment;", "e", "Lcom/huami/watch/companion/ecg/ui/fragment/ShareFragment;", "mShareFragment", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "f", "Lkotlin/jvm/functions/Function1;", "mShareFun", "<init>", "()V", "Companion", "ecg-companion_release"}, k = 1, mv = {1, 5, 1})
public final class EcgDetailFragment extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String g = "args_timestamp";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy mEcgId = LazyKt__LazyJVMKt.lazy(new c());

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy mViewModel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean mShare;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy mDialogHelper;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private ShareFragment mShareFragment;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private Function1<? super File, Unit> mShareFun;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/huami/watch/companion/ecg/ui/fragment/EcgDetailFragment$Companion;", "", "", "timestamp", "Lcom/huami/watch/companion/ecg/ui/fragment/EcgDetailFragment;", "newInstance", "", "ARGS_TIMESTAMP", "Ljava/lang/String;", "<init>", "()V", "ecg-companion_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final EcgDetailFragment newInstance(long timestamp) {
            EcgDetailFragment ecgDetailFragment = new EcgDetailFragment();
            Bundle bundle = new Bundle();
            bundle.putLong(EcgDetailFragment.g, timestamp);
            Unit unit = Unit.INSTANCE;
            ecgDetailFragment.setArguments(bundle);
            return ecgDetailFragment;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: com.huami.watch.companion.ecg.ui.fragment.EcgDetailFragment$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00052!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0000H\n"}, d2 = {"Lkotlin/Function1;", "Ljava/io/File;", "Lkotlin/ParameterName;", "name", "file", "", "share", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0654a extends Lambda implements Function1<Function1<? super File, ? extends Unit>, Unit> {
            public final /* synthetic */ EcgDetailFragment a;
            public final /* synthetic */ EcgData b;
            public final /* synthetic */ FilterRecord c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0654a(EcgDetailFragment ecgDetailFragment, EcgData ecgData, FilterRecord filterRecord) {
                super(1);
                this.a = ecgDetailFragment;
                this.b = ecgData;
                this.c = filterRecord;
            }

            public final void a(@NotNull Function1<? super File, Unit> function1) {
                this.a.mShareFun = function1;
                this.a.k().savePdf(this.b, this.c);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Function1<? super File, ? extends Unit> function1) {
                a(function1);
                return Unit.INSTANCE;
            }
        }

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            EcgData value = EcgDetailFragment.this.k().getEcgLiveData().getValue();
            FilterRecord value2 = EcgDetailFragment.this.k().getFilterRecordData().getValue();
            if (value == null || value2 == null) {
                Toast.makeText(EcgDetailFragment.this.requireContext(), R.string.loading, 0).show();
                return;
            }
            LoadingDialog.dismiss(EcgDetailFragment.this.mShareFragment);
            EcgDetailFragment.this.mShareFragment = new ShareFragment();
            ShareFragment shareFragment = EcgDetailFragment.this.mShareFragment;
            if (shareFragment == null) {
                return;
            }
            shareFragment.showShareDialog(EcgDetailFragment.this.requireActivity(), new C0654a(EcgDetailFragment.this, value, value2));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/watch/companion/ecg/ui/helper/LoadingDialogHelper;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<LoadingDialogHelper> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LoadingDialogHelper invoke() {
            return new LoadingDialogHelper(EcgDetailFragment.this.requireActivity());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\t\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Long> {
        public c() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Long invoke() {
            Bundle arguments = EcgDetailFragment.this.getArguments();
            return Long.valueOf(arguments != null ? arguments.getLong(EcgDetailFragment.g, 0L) : 0L);
        }
    }

    public EcgDetailFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.huami.watch.companion.ecg.ui.fragment.EcgDetailFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Fragment invoke() {
                return this;
            }
        };
        this.mViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(EcgDetailViewModel.class), new Function0<ViewModelStore>() { // from class: com.huami.watch.companion.ecg.ui.fragment.EcgDetailFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return ((ViewModelStoreOwner) function0.invoke()).getViewModelStore();
            }
        }, null);
        this.mDialogHelper = LazyKt__LazyJVMKt.lazy(new b());
    }

    private final void h() {
        EcgUtils.INSTANCE.withStorage(requireActivity(), new a());
    }

    private final LoadingDialogHelper i() {
        return (LoadingDialogHelper) this.mDialogHelper.getValue();
    }

    private final void initView() {
    }

    private final void initViewModel() {
        k().getEcgLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: vg1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                EcgDetailFragment.m(this.a, (EcgData) obj);
            }
        });
        k().getChartDataLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: yg1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                EcgDetailFragment.n(this.a, (Result) obj);
            }
        });
        k().getPdfFileLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: xg1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                EcgDetailFragment.o(this.a, (Result) obj);
            }
        });
        k().getEcgValidData().observe(getViewLifecycleOwner(), new Observer() { // from class: zg1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                EcgDetailFragment.p(this.a, (Boolean) obj);
            }
        });
        k().getEcgAnalysisStatus().observe(getViewLifecycleOwner(), new Observer() { // from class: wg1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                EcgDetailFragment.q(this.a, (EcgAnalysisStatus) obj);
            }
        });
        k().setTimestamp(j());
    }

    private final long j() {
        return ((Number) this.mEcgId.getValue()).longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EcgDetailViewModel k() {
        return (EcgDetailViewModel) this.mViewModel.getValue();
    }

    private final void l() {
        FragmentTransaction fragmentTransactionBeginTransaction = getChildFragmentManager().beginTransaction();
        fragmentTransactionBeginTransaction.replace(R.id.tag, EcgTagFragment.INSTANCE.newInstance(j()));
        fragmentTransactionBeginTransaction.commit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(EcgDetailFragment ecgDetailFragment, EcgData ecgData) {
        if (ecgData == null) {
            return;
        }
        ecgDetailFragment.u(ecgData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(EcgDetailFragment ecgDetailFragment, Result result) {
        List<Float> list;
        ecgDetailFragment.i().showOrError(result, ecgDetailFragment.getString(R.string.loading), "", ecgDetailFragment.getString(R.string.ecg_loading_failed));
        if (result == null || (list = (List) result.getData()) == null) {
            return;
        }
        View view = ecgDetailFragment.getView();
        ((LineChartView) (view == null ? null : view.findViewById(R.id.lv_line_chart))).setDataSource(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(EcgDetailFragment ecgDetailFragment, Result result) {
        ecgDetailFragment.r(result);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(EcgDetailFragment ecgDetailFragment, Boolean bool) {
        if (bool == null || bool.booleanValue()) {
            return;
        }
        ecgDetailFragment.s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(EcgDetailFragment ecgDetailFragment, EcgAnalysisStatus ecgAnalysisStatus) {
        if (ecgAnalysisStatus == null) {
            return;
        }
        View view = ecgDetailFragment.getView();
        ((Button) (view == null ? null : view.findViewById(R.id.medong))).setText(EcgUtils.INSTANCE.getShowRes(ecgAnalysisStatus));
    }

    private final void r(Result<File> file) {
        i().showOrError(file, getString(R.string.loading), "", getString(R.string.ecg_export_pdf_error));
        if (file == null) {
            return;
        }
        if (file.isLoading()) {
            this.mShare = true;
        }
        if (this.mShare && file.isSuccess() && file.getData() != null) {
            this.mShare = false;
            Function1<? super File, Unit> function1 = this.mShareFun;
            if (function1 != null) {
                function1.invoke(file.getData());
            }
        }
        if (file.isSuccess()) {
            EcgAnalyticsManagerKt.ecgDetailCExportPdf(true);
        }
        if (file.isError()) {
            EcgAnalyticsManagerKt.ecgDetailCExportPdf(false);
        }
    }

    private final void s() {
        AlertDialog.setMessage(getString(NetworkUtil.isOffline(requireContext()) ? R.string.ecg_deleted_no_network : R.string.ecg_deleted)).setNeutralBtn(getString(R.string.btn_known), new DialogInterface.OnClickListener() { // from class: tg1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                EcgDetailFragment.t(this.a, dialogInterface, i);
            }
        }).setCancelable(false).setCanceledOnTouchOutside(false).show(requireActivity(), "Ecg Deleted Dialog");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(EcgDetailFragment ecgDetailFragment, DialogInterface dialogInterface, int i) {
        ecgDetailFragment.k().deleteLocal();
    }

    private final void u(EcgData ecg) {
        View view = getView();
        View viewFindViewById = view == null ? null : view.findViewById(R.id.ecg_result_content);
        EcgMedicalUtil ecgMedicalUtil = EcgMedicalUtil.INSTANCE;
        viewFindViewById.setVisibility(ecgMedicalUtil.getEcgMedicalService().isMedicalCollectSource(ecg.getDeviceSource()) ^ true ? 0 : 8);
        if (ecgMedicalUtil.getEcgMedicalService().isMedicalSource(ecg.getDeviceSource())) {
            View view2 = getView();
            (view2 == null ? null : view2.findViewById(R.id.ic_atrial)).setVisibility(8);
            View view3 = getView();
            (view3 == null ? null : view3.findViewById(R.id.ic_hrv)).setVisibility(8);
        }
        View view4 = getView();
        ((TextView) (view4 == null ? null : view4.findViewById(R.id.tv_ecg_bioid))).setText(ecg.isSelf() ? R.string.ecg_data_self : R.string.ecg_data_other);
        View view5 = getView();
        View viewFindViewById2 = view5 == null ? null : view5.findViewById(R.id.ecg_heart_rate);
        int i = R.string.ecg_hr_text;
        EcgUtils ecgUtils = EcgUtils.INSTANCE;
        ((TextView) viewFindViewById2).setText(getString(i, ecgUtils.getHrText(ecg)));
        View view6 = getView();
        ((HuaMiFontTextView) (view6 == null ? null : view6.findViewById(R.id.hr))).setText(ecgUtils.getHrText(ecg));
        View view7 = getView();
        ((HuaMiFontTextView) (view7 == null ? null : view7.findViewById(R.id.hrv))).setText(String.valueOf((int) Math.rint(ecgUtils.hrv(ecg))));
        int aFib = ecgUtils.getAFib(ecg);
        View view8 = getView();
        ecgUtils.formatAFibTag((TextView) (view8 == null ? null : view8.findViewById(R.id.tv_afib)), aFib, ecg.getDeviceSource());
        View view9 = getView();
        ((TextView) (view9 == null ? null : view9.findViewById(R.id.afib_result))).setText(ecgUtils.getEcgAfibText(requireContext(), aFib, ecg.getDeviceSource()));
        View view10 = getView();
        ((TextView) (view10 == null ? null : view10.findViewById(R.id.afib_desc))).setText(getResources().getStringArray(R.array.ecg_afib_desc)[aFib]);
        if (aFib != 1) {
            View view11 = getView();
            ((TextView) (view11 != null ? view11.findViewById(R.id.operation) : null)).setVisibility(8);
            return;
        }
        View view12 = getView();
        ((TextView) (view12 == null ? null : view12.findViewById(R.id.operation))).setVisibility(0);
        View view13 = getView();
        ((TextView) (view13 == null ? null : view13.findViewById(R.id.operation))).setText(R.string.ecg_export_pdf_simple);
        View view14 = getView();
        ((TextView) (view14 != null ? view14.findViewById(R.id.operation) : null)).setOnClickListener(new View.OnClickListener() { // from class: ug1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view15) {
                EcgDetailFragment.v(this.a, view15);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(EcgDetailFragment ecgDetailFragment, View view) {
        ecgDetailFragment.h();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_ecg_detail, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (j() > 0) {
            k().checkEcgValid(j());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
        l();
        initViewModel();
    }
}
