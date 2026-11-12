package com.xiaomi.fitness.health.hrm;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fit.fitness.export.data.item.LactateThresholdItem;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.common.recycer.adapter.CommonRecordDetailAdapter;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.health.hrm.HrAndPaceSegmentReportDetailFragment;
import defpackage.c0j;
import defpackage.eri;
import defpackage.jui;
import defpackage.k5g;
import defpackage.pni;
import defpackage.qxi;
import defpackage.saa;
import defpackage.wc0;
import defpackage.yaa;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 *2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001*B\u0007¢\u0006\u0004\b)\u0010\u0007J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\u0007J\u000f\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u0007J\u000f\u0010\u000b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\u0007J!\u0010\u0010\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R$\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0018\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006+"}, d2 = {"Lcom/xiaomi/fitness/health/hrm/HrAndPaceSegmentReportDetailFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/health/hrm/HrmViewModel;", "Lsaa;", "Lyaa;", "", "fillListWithData", "()V", "initViews", "loadBundle", "initActionBar", "showDeleteDialog", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "data", "onFragmentResult", "(IILandroid/os/Bundle;)V", "Landroidx/recyclerview/widget/RecyclerView;", "mRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getMRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "setMRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "Lcom/xiaomi/fitness/common/recycer/adapter/CommonRecordDetailAdapter;", "commonRecordDetailAdapter", "Lcom/xiaomi/fitness/common/recycer/adapter/CommonRecordDetailAdapter;", "getCommonRecordDetailAdapter", "()Lcom/xiaomi/fitness/common/recycer/adapter/CommonRecordDetailAdapter;", "setCommonRecordDetailAdapter", "(Lcom/xiaomi/fitness/common/recycer/adapter/CommonRecordDetailAdapter;)V", "Lcom/xiaomi/fit/fitness/export/data/item/LactateThresholdItem;", "lactateThresholdItem", "Lcom/xiaomi/fit/fitness/export/data/item/LactateThresholdItem;", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class HrAndPaceSegmentReportDetailFragment extends Hilt_HrAndPaceSegmentReportDetailFragment<HrmViewModel, saa> implements yaa {
    public static final int REQ_CODE_DELETE_DIALOG = 1;

    @Nullable
    private CommonRecordDetailAdapter commonRecordDetailAdapter;

    @Nullable
    private LactateThresholdItem lactateThresholdItem;

    @Nullable
    private RecyclerView mRecyclerView;

    public HrAndPaceSegmentReportDetailFragment() {
        super(jui.C0);
    }

    private final void fillListWithData() {
        ArrayList arrayList = new ArrayList();
        LactateThresholdItem lactateThresholdItem = this.lactateThresholdItem;
        if ((lactateThresholdItem != null ? lactateThresholdItem.getPace() : null) != null) {
            LactateThresholdItem lactateThresholdItem2 = this.lactateThresholdItem;
            Intrinsics.checkNotNull(lactateThresholdItem2);
            long time = lactateThresholdItem2.getTime();
            String str = TimeDateUtil.getDateYYYYMMddLocalFormat(((long) 1000) * time) + " " + TimeDateUtil.getDateHHmm24Format(time);
            LactateThresholdItem lactateThresholdItem3 = this.lactateThresholdItem;
            Intrinsics.checkNotNull(lactateThresholdItem3);
            Integer pace = lactateThresholdItem3.getPace();
            Intrinsics.checkNotNull(pace);
            String sportPaceStrWithSecDef = TimeDateUtil.getSportPaceStrWithSecDef(pace.intValue());
            Resources resources = AppUtil.getApp().getResources();
            int i = qxi.Z0;
            LactateThresholdItem lactateThresholdItem4 = this.lactateThresholdItem;
            Intrinsics.checkNotNull(lactateThresholdItem4);
            Integer pace2 = lactateThresholdItem4.getPace();
            Intrinsics.checkNotNull(pace2);
            String quantityString = resources.getQuantityString(i, pace2.intValue(), sportPaceStrWithSecDef);
            Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
            arrayList.add(new CommonRecordDetailAdapter.DetailItem(quantityString, str));
        }
        LactateThresholdItem lactateThresholdItem5 = this.lactateThresholdItem;
        if ((lactateThresholdItem5 != null ? lactateThresholdItem5.getHeartRate() : null) != null) {
            LactateThresholdItem lactateThresholdItem6 = this.lactateThresholdItem;
            Intrinsics.checkNotNull(lactateThresholdItem6);
            long time2 = lactateThresholdItem6.getTime();
            String str2 = TimeDateUtil.getDateYYYYMMddLocalFormat(((long) 1000) * time2) + " " + TimeDateUtil.getDateHHmm24Format(time2);
            Resources resources2 = AppUtil.getApp().getResources();
            int i2 = qxi.Y0;
            LactateThresholdItem lactateThresholdItem7 = this.lactateThresholdItem;
            Intrinsics.checkNotNull(lactateThresholdItem7);
            Integer heartRate = lactateThresholdItem7.getHeartRate();
            Intrinsics.checkNotNull(heartRate);
            int iIntValue = heartRate.intValue();
            LactateThresholdItem lactateThresholdItem8 = this.lactateThresholdItem;
            Intrinsics.checkNotNull(lactateThresholdItem8);
            Integer heartRate2 = lactateThresholdItem8.getHeartRate();
            Intrinsics.checkNotNull(heartRate2);
            String quantityString2 = resources2.getQuantityString(i2, iIntValue, String.valueOf(heartRate2.intValue()));
            Intrinsics.checkNotNullExpressionValue(quantityString2, "getQuantityString(...)");
            arrayList.add(new CommonRecordDetailAdapter.DetailItem(quantityString2, str2));
        }
        CommonRecordDetailAdapter commonRecordDetailAdapter = this.commonRecordDetailAdapter;
        Intrinsics.checkNotNull(commonRecordDetailAdapter);
        commonRecordDetailAdapter.setDetailItems(arrayList);
    }

    private final void initActionBar() {
        setTitle(c0j.s5);
        if (getMiuiActionBar() != null) {
            Context contextRequireContext = requireContext();
            wc0 miuiActionBar = getMiuiActionBar();
            Intrinsics.checkNotNull(miuiActionBar);
            k5g.h(contextRequireContext, miuiActionBar, eri.l8, pni.L1, getString(c0j.G7), new View.OnClickListener() { // from class: pbc
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HrAndPaceSegmentReportDetailFragment.initActionBar$lambda$1$lambda$0(this.f30201a, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initActionBar$lambda$1$lambda$0(HrAndPaceSegmentReportDetailFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showDeleteDialog();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initViews() {
        this.mRecyclerView = ((saa) getMBinding()).B;
        this.commonRecordDetailAdapter = new CommonRecordDetailAdapter();
        RecyclerView recyclerView = this.mRecyclerView;
        Intrinsics.checkNotNull(recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        RecyclerView recyclerView2 = this.mRecyclerView;
        Intrinsics.checkNotNull(recyclerView2);
        recyclerView2.setAdapter(this.commonRecordDetailAdapter);
    }

    private final void loadBundle() {
        if (getArguments() == null) {
            return;
        }
        Serializable serializable = requireArguments().getSerializable(HrAndPaceExpandableAllRecordsFragment.PARAM_RECORD);
        Intrinsics.checkNotNull(serializable, "null cannot be cast to non-null type com.xiaomi.fit.fitness.export.data.item.LactateThresholdItem");
        this.lactateThresholdItem = (LactateThresholdItem) serializable;
    }

    private final void showDeleteDialog() {
        CommonDialog commonDialogCreate = new CommonDialog.c("delete_check").setDialogTitle(c0j.F7).setDialogDescription(c0j.E7).setNegativeText(c0j.D7).setPositiveText(c0j.H7).create();
        Intrinsics.checkNotNullExpressionValue(commonDialogCreate, "create(...)");
        commonDialogCreate.setRequestCode(1);
        commonDialogCreate.showIfNeed(getChildFragmentManager());
    }

    @Nullable
    public final CommonRecordDetailAdapter getCommonRecordDetailAdapter() {
        return this.commonRecordDetailAdapter;
    }

    @Nullable
    public final RecyclerView getMRecyclerView() {
        return this.mRecyclerView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.yaa
    public void onFragmentResult(int requestCode, int resultCode, @NotNull Bundle data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (requestCode == 1 && resultCode == -1) {
            ((HrmViewModel) getMViewModel()).deleteRecord(this.lactateThresholdItem);
            requireActivity().setResult(2);
            requireActivity().onBackPressed();
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        initActionBar();
        loadBundle();
        initViews();
        fillListWithData();
    }

    public final void setCommonRecordDetailAdapter(@Nullable CommonRecordDetailAdapter commonRecordDetailAdapter) {
        this.commonRecordDetailAdapter = commonRecordDetailAdapter;
    }

    public final void setMRecyclerView(@Nullable RecyclerView recyclerView) {
        this.mRecyclerView = recyclerView;
    }
}
