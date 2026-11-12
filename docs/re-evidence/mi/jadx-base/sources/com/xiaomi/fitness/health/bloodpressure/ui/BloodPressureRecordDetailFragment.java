package com.xiaomi.fitness.health.bloodpressure.ui;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fit.fitness.export.data.item.BloodPressureItem;
import com.xiaomi.fit.fitness.parser.schema.DailyReportKey;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.common.recycer.adapter.CommonRecordDetailAdapter;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.device.manager.bean.Device;
import com.xiaomi.fitness.device.manager.bean.DeviceInfo;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.bloodpressure.BloodPressureViewModel;
import com.xiaomi.fitness.health.bloodpressure.ui.BloodPressureRecordDetailFragment;
import defpackage.c0j;
import defpackage.eri;
import defpackage.jui;
import defpackage.k5g;
import defpackage.pni;
import defpackage.qxi;
import defpackage.uaa;
import defpackage.wc0;
import defpackage.yaa;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsKt;
import miuix.recyclerview.widget.RecyclerView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001$B\u0007¢\u0006\u0004\b#\u0010\fJ\u001b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\fJ!\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lcom/xiaomi/fitness/health/bloodpressure/ui/BloodPressureRecordDetailFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/health/bloodpressure/BloodPressureViewModel;", "Luaa;", "Lyaa;", "", DailyReportKey.measurementStatus, "", "getMeasureAbnormalString", "(Ljava/lang/Integer;)Ljava/lang/String;", "", "initActionBar", "()V", "showDeleteDialog", "fillList", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "data", "onFragmentResult", "(IILandroid/os/Bundle;)V", "Lmiuix/recyclerview/widget/RecyclerView;", "mRecyclerView", "Lmiuix/recyclerview/widget/RecyclerView;", "Lcom/xiaomi/fitness/common/recycer/adapter/CommonRecordDetailAdapter;", "mAdapter", "Lcom/xiaomi/fitness/common/recycer/adapter/CommonRecordDetailAdapter;", "Lcom/xiaomi/fit/fitness/export/data/item/BloodPressureItem;", "record", "Lcom/xiaomi/fit/fitness/export/data/item/BloodPressureItem;", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class BloodPressureRecordDetailFragment extends Hilt_BloodPressureRecordDetailFragment<BloodPressureViewModel, uaa> implements yaa {
    public static final int DELETE_DIALOG_REQ_CODE = 200;

    @NotNull
    public static final String PARAM_RECORD = "record";

    @Nullable
    private CommonRecordDetailAdapter mAdapter;

    @Nullable
    private RecyclerView mRecyclerView;

    @Nullable
    private BloodPressureItem record;

    public BloodPressureRecordDetailFragment() {
        super(jui.D0);
    }

    private final void fillList() {
        String name;
        ArrayList arrayList = new ArrayList();
        BloodPressureItem bloodPressureItem = this.record;
        if ((bloodPressureItem != null ? Long.valueOf(bloodPressureItem.getTime()) : null) != null) {
            String string = getString(c0j.Z1);
            BloodPressureItem bloodPressureItem2 = this.record;
            Long lValueOf = bloodPressureItem2 != null ? Long.valueOf(bloodPressureItem2.getTime()) : null;
            Intrinsics.checkNotNull(lValueOf);
            arrayList.add(new CommonRecordDetailAdapter.DetailItem(string, TimeDateUtil.getDateYYYYMMDDHHmmLocalFormat$default(lValueOf.longValue(), false, 2, null)));
        }
        BloodPressureItem bloodPressureItem3 = this.record;
        if ((bloodPressureItem3 != null ? Integer.valueOf(bloodPressureItem3.getHighPressure()) : null) != null) {
            String string2 = getString(c0j.G1);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            Object[] objArr = new Object[2];
            BloodPressureItem bloodPressureItem4 = this.record;
            objArr[0] = bloodPressureItem4 != null ? Integer.valueOf(bloodPressureItem4.getHighPressure()) : null;
            objArr[1] = getString(c0j.D2);
            String str = String.format("%d%s", Arrays.copyOf(objArr, 2));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            arrayList.add(new CommonRecordDetailAdapter.DetailItem(string2, str));
        }
        BloodPressureItem bloodPressureItem5 = this.record;
        if ((bloodPressureItem5 != null ? Integer.valueOf(bloodPressureItem5.getLowPressure()) : null) != null) {
            String string3 = getString(c0j.H1);
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            Object[] objArr2 = new Object[2];
            BloodPressureItem bloodPressureItem6 = this.record;
            objArr2[0] = bloodPressureItem6 != null ? Integer.valueOf(bloodPressureItem6.getLowPressure()) : null;
            objArr2[1] = getString(c0j.D2);
            String str2 = String.format("%d%s", Arrays.copyOf(objArr2, 2));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            arrayList.add(new CommonRecordDetailAdapter.DetailItem(string3, str2));
        }
        BloodPressureItem bloodPressureItem7 = this.record;
        if ((bloodPressureItem7 != null ? bloodPressureItem7.getPulse() : null) != null) {
            String string4 = getString(c0j.j2);
            Resources resources = requireContext().getResources();
            int i = qxi.h;
            BloodPressureItem bloodPressureItem8 = this.record;
            Intrinsics.checkNotNull(bloodPressureItem8);
            Integer pulse = bloodPressureItem8.getPulse();
            Intrinsics.checkNotNull(pulse);
            int iIntValue = pulse.intValue();
            BloodPressureItem bloodPressureItem9 = this.record;
            Intrinsics.checkNotNull(bloodPressureItem9);
            arrayList.add(new CommonRecordDetailAdapter.DetailItem(string4, resources.getQuantityString(i, iIntValue, bloodPressureItem9.getPulse())));
        }
        BloodPressureItem bloodPressureItem10 = this.record;
        String sid = bloodPressureItem10 != null ? bloodPressureItem10.getSid() : null;
        if (!TextUtils.isEmpty(sid)) {
            if (Intrinsics.areEqual(sid, "xiaomiwear_app_manually")) {
                name = getString(c0j.D);
            } else {
                WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE);
                Intrinsics.checkNotNull(sid);
                DeviceInfo<? extends Device> deviceInfoInAll = deviceManagerExtKt.getDeviceInfoInAll(sid);
                name = deviceInfoInAll != null ? deviceInfoInAll.getName() : null;
            }
            arrayList.add(new CommonRecordDetailAdapter.DetailItem(getString(c0j.i5), name != null ? StringsKt__StringsKt.trim((CharSequence) name).toString() : null));
        }
        CommonRecordDetailAdapter commonRecordDetailAdapter = this.mAdapter;
        Intrinsics.checkNotNull(commonRecordDetailAdapter);
        commonRecordDetailAdapter.setDetailItems(arrayList);
    }

    private final String getMeasureAbnormalString(Integer measurementStatus) {
        if (measurementStatus != null && measurementStatus.intValue() == 2) {
            return getString(c0j.S1, getString(c0j.Q1), getString(c0j.R1));
        }
        if (measurementStatus != null && measurementStatus.intValue() == 1) {
            return getString(c0j.S1, getString(c0j.M1), getString(c0j.N1));
        }
        if (measurementStatus != null && measurementStatus.intValue() == 3) {
            return getString(c0j.S1, getString(c0j.O1), getString(c0j.P1));
        }
        return null;
    }

    private final void initActionBar() {
        setTitle(c0j.s5);
        if (getMiuiActionBar() != null) {
            Context contextRequireContext = requireContext();
            wc0 miuiActionBar = getMiuiActionBar();
            Intrinsics.checkNotNull(miuiActionBar);
            k5g.h(contextRequireContext, miuiActionBar, eri.l8, pni.L1, getString(c0j.G7), new View.OnClickListener() { // from class: f03
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BloodPressureRecordDetailFragment.initActionBar$lambda$1$lambda$0(this.f17247a, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initActionBar$lambda$1$lambda$0(BloodPressureRecordDetailFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showDeleteDialog();
    }

    private final void showDeleteDialog() {
        CommonDialog commonDialogCreate = new CommonDialog.c("delete_check").setDialogTitle(c0j.Ga).setDialogDescription(c0j.ma).setNegativeText(c0j.D7).setPositiveText(c0j.H7).create();
        Intrinsics.checkNotNullExpressionValue(commonDialogCreate, "create(...)");
        commonDialogCreate.setRequestCode(200);
        commonDialogCreate.showIfNeed(getChildFragmentManager());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.yaa
    public void onFragmentResult(int requestCode, int resultCode, @NotNull Bundle data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (requestCode == 200 && resultCode == -1) {
            ((BloodPressureViewModel) getMViewModel()).deleteRecord(this.record);
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
        Serializable serializable = arguments != null ? arguments.getSerializable("record") : null;
        Intrinsics.checkNotNull(serializable, "null cannot be cast to non-null type com.xiaomi.fit.fitness.export.data.item.BloodPressureItem");
        this.record = (BloodPressureItem) serializable;
        this.mRecyclerView = ((uaa) getMBinding()).B;
        this.mAdapter = new CommonRecordDetailAdapter();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireContext());
        RecyclerView recyclerView = this.mRecyclerView;
        Intrinsics.checkNotNull(recyclerView);
        recyclerView.setLayoutManager(linearLayoutManager);
        RecyclerView recyclerView2 = this.mRecyclerView;
        Intrinsics.checkNotNull(recyclerView2);
        recyclerView2.setAdapter(this.mAdapter);
        BloodPressureItem bloodPressureItem = this.record;
        String measureAbnormalString = getMeasureAbnormalString(bloodPressureItem != null ? bloodPressureItem.getStatus() : null);
        if (measureAbnormalString == null || StringsKt__StringsKt.isBlank(measureAbnormalString)) {
            TextView tvAbnormal = ((uaa) getMBinding()).C;
            Intrinsics.checkNotNullExpressionValue(tvAbnormal, "tvAbnormal");
            ViewExtKt.setVisible(tvAbnormal, false);
        } else {
            TextView tvAbnormal2 = ((uaa) getMBinding()).C;
            Intrinsics.checkNotNullExpressionValue(tvAbnormal2, "tvAbnormal");
            ViewExtKt.setVisible(tvAbnormal2, true);
            ((uaa) getMBinding()).C.setText(measureAbnormalString);
        }
        fillList();
    }
}
