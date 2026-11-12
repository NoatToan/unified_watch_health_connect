package com.xiaomi.fitness.health.weight.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fit.fitness.export.data.item.WeightItem;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.common.recycer.adapter.CommonRecordDetailAdapter;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.health.weight.WeightViewModel;
import com.xiaomi.fitness.health.weight.ui.WeightRecordDetailFragment;
import defpackage.c0j;
import defpackage.eri;
import defpackage.ffr;
import defpackage.jui;
import defpackage.k5g;
import defpackage.pni;
import defpackage.saa;
import defpackage.wc0;
import defpackage.yaa;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import miuix.recyclerview.widget.RecyclerView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 #2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001#B\u0007¢\u0006\u0004\b\"\u0010\u0007J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0007J!\u0010\r\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006$"}, d2 = {"Lcom/xiaomi/fitness/health/weight/ui/WeightRecordDetailFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/health/weight/WeightViewModel;", "Lsaa;", "Lyaa;", "", "initActionBar", "()V", "showDeleteDialog", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "data", "onFragmentResult", "(IILandroid/os/Bundle;)V", "Lcom/xiaomi/fit/fitness/export/data/item/WeightItem;", "record", "Lcom/xiaomi/fit/fitness/export/data/item/WeightItem;", "Lmiuix/recyclerview/widget/RecyclerView;", "mRecyclerView", "Lmiuix/recyclerview/widget/RecyclerView;", "Lcom/xiaomi/fitness/common/recycer/adapter/CommonRecordDetailAdapter;", "mAdapter", "Lcom/xiaomi/fitness/common/recycer/adapter/CommonRecordDetailAdapter;", "", "Lcom/xiaomi/fitness/common/recycer/adapter/CommonRecordDetailAdapter$DetailItem;", "mDetailItemList", "Ljava/util/List;", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class WeightRecordDetailFragment extends Hilt_WeightRecordDetailFragment<WeightViewModel, saa> implements yaa {
    public static final int DELETE_DIALOG_REQ_CODE = 200;

    @NotNull
    public static final String PARAM_RECORD = "weight_record";

    @Nullable
    private CommonRecordDetailAdapter mAdapter;

    @Nullable
    private List<? extends CommonRecordDetailAdapter.DetailItem> mDetailItemList;

    @Nullable
    private RecyclerView mRecyclerView;

    @Nullable
    private WeightItem record;

    public WeightRecordDetailFragment() {
        super(jui.C0);
    }

    private final void initActionBar() {
        setTitle(c0j.s5);
        if (getMiuiActionBar() != null) {
            Context contextRequireContext = requireContext();
            wc0 miuiActionBar = getMiuiActionBar();
            Intrinsics.checkNotNull(miuiActionBar);
            k5g.h(contextRequireContext, miuiActionBar, eri.l8, pni.L1, getString(c0j.G7), new View.OnClickListener() { // from class: fgr
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    WeightRecordDetailFragment.initActionBar$lambda$1$lambda$0(this.f17773a, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initActionBar$lambda$1$lambda$0(WeightRecordDetailFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showDeleteDialog();
    }

    private final void showDeleteDialog() {
        CommonDialog commonDialogCreate = new CommonDialog.c("delete_check").setDialogTitle(c0j.F7).setDialogDescription(c0j.E7).setNegativeText(c0j.D7).setPositiveText(c0j.H7).create();
        Intrinsics.checkNotNullExpressionValue(commonDialogCreate, "create(...)");
        commonDialogCreate.setRequestCode(200);
        commonDialogCreate.showIfNeed(getChildFragmentManager());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.yaa
    public void onFragmentResult(int requestCode, int resultCode, @NotNull Bundle data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (requestCode == 200 && resultCode == -1) {
            ((WeightViewModel) getMViewModel()).deleteRecord(this.record);
            requireActivity().setResult(2);
            requireActivity().onBackPressed();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        initActionBar();
        Bundle arguments = getArguments();
        this.record = (WeightItem) (arguments != null ? arguments.getSerializable(PARAM_RECORD) : null);
        this.mDetailItemList = ffr.i(requireContext(), this.record);
        this.mRecyclerView = ((saa) getMBinding()).B;
        this.mAdapter = new CommonRecordDetailAdapter();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireContext());
        RecyclerView recyclerView = this.mRecyclerView;
        Intrinsics.checkNotNull(recyclerView);
        recyclerView.setLayoutManager(linearLayoutManager);
        RecyclerView recyclerView2 = this.mRecyclerView;
        Intrinsics.checkNotNull(recyclerView2);
        recyclerView2.setAdapter(this.mAdapter);
        if (ArrayUtils.isEmpty(this.mDetailItemList)) {
            return;
        }
        CommonRecordDetailAdapter commonRecordDetailAdapter = this.mAdapter;
        Intrinsics.checkNotNull(commonRecordDetailAdapter);
        commonRecordDetailAdapter.setDetailItems(this.mDetailItemList);
    }
}
