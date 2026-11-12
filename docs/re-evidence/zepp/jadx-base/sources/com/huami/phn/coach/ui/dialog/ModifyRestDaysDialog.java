package com.huami.phn.coach.ui.dialog;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.p008lifecycle.Observer;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.DialogParams;
import com.huami.phn.coach.R;
import com.huami.phn.coach.koin.PHNProjectModuleKt;
import com.huami.phn.coach.ui.adapter.PHNRestDaysSelectAdapter;
import com.huami.phn.coach.ui.dialog.ModifyRestDaysDialog;
import com.huami.phn.coach.usecase.PlanDetail;
import com.huami.phn.coach.usecase.UseCaseException;
import com.huami.phn.coach.viewmodel.PHNDetailPageViewModel;
import com.huami.phn.core.device.BleException;
import com.huami.phn.core.device.DeviceManager;
import com.huami.phn.util.Result;
import com.huami.util.net.NetUtil;
import com.huami.widget.toast.IconToast;
import com.loc.z;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.FragmentExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b!\u0010\"J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0018\u001a\u00020\u00138B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Lcom/huami/phn/coach/ui/dialog/ModifyRestDaysDialog;", "Lcom/huami/android/design/dialog/AlertDialogFragment;", "Landroid/view/View;", "getContentView", "", GoogleApiAvailabilityLight.b, "o", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroidx/fragment/app/FragmentManager;", "h", "Landroidx/fragment/app/FragmentManager;", "manager", "", "", "i", "Ljava/util/List;", "weekDataList", "Lcom/huami/phn/coach/viewmodel/PHNDetailPageViewModel;", z.j, "Lkotlin/Lazy;", "m", "()Lcom/huami/phn/coach/viewmodel/PHNDetailPageViewModel;", "viewModel", "Lcom/huami/phn/coach/ui/adapter/PHNRestDaysSelectAdapter;", hl.k, "Lcom/huami/phn/coach/ui/adapter/PHNRestDaysSelectAdapter;", "phnRestDaysSelectAdapter", "", "l", "Z", "isModify", "<init>", "(Landroidx/fragment/app/FragmentManager;)V", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
public final class ModifyRestDaysDialog extends AlertDialogFragment {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final FragmentManager manager;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private List<String> weekDataList = new ArrayList();

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private PHNRestDaysSelectAdapter phnRestDaysSelectAdapter;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private boolean isModify;

    /* JADX WARN: Multi-variable type inference failed */
    public ModifyRestDaysDialog(@NotNull FragmentManager fragmentManager) {
        this.manager = fragmentManager;
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.phn.coach.ui.dialog.ModifyRestDaysDialog$special$$inlined$sharedViewModel$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final ViewModelOwner getA() {
                return ViewModelOwner.INSTANCE.from(this.requireActivity(), this.requireActivity());
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<PHNDetailPageViewModel>() { // from class: com.huami.phn.coach.ui.dialog.ModifyRestDaysDialog$special$$inlined$sharedViewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.phn.coach.viewmodel.PHNDetailPageViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final PHNDetailPageViewModel getA() {
                return FragmentExtKt.getSharedViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(PHNDetailPageViewModel.class), function0, objArr);
            }
        });
    }

    private final View getContentView() {
        View viewInflate = View.inflate(getContext(), R.layout.phn_dialog_modify_rest_days, null);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_modify_cancel);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_modify_confirm);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.rv_week_picker);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 7));
        this.phnRestDaysSelectAdapter = new PHNRestDaysSelectAdapter(this.weekDataList);
        m().getPlanDetailLiveData().observe(this, new Observer() { // from class: t75
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                ModifyRestDaysDialog.i(this.a, (PlanDetail) obj);
            }
        });
        PHNRestDaysSelectAdapter pHNRestDaysSelectAdapter = this.phnRestDaysSelectAdapter;
        if (pHNRestDaysSelectAdapter == null) {
            pHNRestDaysSelectAdapter = null;
        }
        recyclerView.setAdapter(pHNRestDaysSelectAdapter);
        final DeviceManager deviceManager = (DeviceManager) PHNProjectModuleKt.getPhnProjectKoinScope().get(Reflection.getOrCreateKotlinClass(DeviceManager.class), null, null);
        textView.setOnClickListener(new View.OnClickListener() { // from class: r75
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ModifyRestDaysDialog.j(this.a, view);
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: s75
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ModifyRestDaysDialog.k(deviceManager, this, view);
            }
        });
        m().getModifyRestDaysLiveData().observe(this, new Observer() { // from class: u75
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                ModifyRestDaysDialog.l(this.a, (Result) obj);
            }
        });
        return viewInflate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(ModifyRestDaysDialog modifyRestDaysDialog, PlanDetail planDetail) {
        PHNRestDaysSelectAdapter pHNRestDaysSelectAdapter = modifyRestDaysDialog.phnRestDaysSelectAdapter;
        if (pHNRestDaysSelectAdapter == null) {
            pHNRestDaysSelectAdapter = null;
        }
        pHNRestDaysSelectAdapter.initSelectedArray(planDetail.getRest());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(ModifyRestDaysDialog modifyRestDaysDialog, View view) {
        modifyRestDaysDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(DeviceManager deviceManager, ModifyRestDaysDialog modifyRestDaysDialog, View view) {
        if (!deviceManager.isActiveDeviceConnected()) {
            IconToast.showError(modifyRestDaysDialog.getContext(), modifyRestDaysDialog.getString(R.string.phn_device_not_connected));
            return;
        }
        if (!NetUtil.INSTANCE.networkInfo().isNetworkConnect()) {
            IconToast.showError(modifyRestDaysDialog.getContext(), modifyRestDaysDialog.getString(R.string.phn_network_not_connected));
            return;
        }
        PHNDetailPageViewModel pHNDetailPageViewModelM = modifyRestDaysDialog.m();
        PHNRestDaysSelectAdapter pHNRestDaysSelectAdapter = modifyRestDaysDialog.phnRestDaysSelectAdapter;
        if (pHNRestDaysSelectAdapter == null) {
            pHNRestDaysSelectAdapter = null;
        }
        pHNDetailPageViewModelM.modifyRestDays(CollectionsKt___CollectionsKt.toIntArray(pHNRestDaysSelectAdapter.getSelectList()));
        modifyRestDaysDialog.isModify = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(ModifyRestDaysDialog modifyRestDaysDialog, Result result) {
        if (modifyRestDaysDialog.isModify) {
            Throwable thExceptionOrNull = result.exceptionOrNull();
            if (thExceptionOrNull == null) {
                ((Boolean) result.getValue()).booleanValue();
                modifyRestDaysDialog.dismiss();
                return;
            }
            UseCaseException useCaseException = (UseCaseException) thExceptionOrNull;
            if ((useCaseException instanceof UseCaseException.DeviceException) && (((UseCaseException.DeviceException) useCaseException).getExc() instanceof BleException.NoPhnPlan)) {
                modifyRestDaysDialog.o();
            } else {
                IconToast.showError(modifyRestDaysDialog.getContext(), modifyRestDaysDialog.getString(R.string.phn_operation_failed));
            }
            modifyRestDaysDialog.isModify = false;
        }
    }

    private final PHNDetailPageViewModel m() {
        return (PHNDetailPageViewModel) this.viewModel.getValue();
    }

    private final void n() {
        this.weekDataList.add(getString(R.string.monday));
        this.weekDataList.add(getString(R.string.tuesday));
        this.weekDataList.add(getString(R.string.wednesday));
        this.weekDataList.add(getString(R.string.thursday));
        this.weekDataList.add(getString(R.string.friday));
        this.weekDataList.add(getString(R.string.saturday));
        this.weekDataList.add(getString(R.string.sunday));
    }

    private final void o() {
        new AlertDialogFragment.Builder(getContext()).setMessage(R.string.phn_modify_rest_days_no_plan).setNeutralButton(R.string.phn_common_confirm, (DialogInterface.OnClickListener) null).show(this.manager).setGravity(17);
    }

    @Override // com.huami.android.design.dialog.AlertDialogFragment, com.huami.android.design.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        n();
        DialogParams dialogParams = new DialogParams();
        dialogParams.title = "";
        dialogParams.contentView = getContentView();
        setParams(dialogParams);
    }
}
