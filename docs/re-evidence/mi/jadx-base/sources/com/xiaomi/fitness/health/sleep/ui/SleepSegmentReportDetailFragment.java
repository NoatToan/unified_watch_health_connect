package com.xiaomi.fitness.health.sleep.ui;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.recycer.adapter.CommonRecordDetailAdapter;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.device.manager.bean.Device;
import com.xiaomi.fitness.device.manager.bean.DeviceInfo;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.health.sleep.ui.SleepSegmentReportDetailFragment;
import com.xiaomi.fitness.health.sleep.view.SleepViewModel;
import defpackage.c0j;
import defpackage.eri;
import defpackage.gjm;
import defpackage.jui;
import defpackage.k5g;
import defpackage.pni;
import defpackage.qxi;
import defpackage.saa;
import defpackage.wc0;
import defpackage.xr5;
import defpackage.yaa;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 *2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001*B\u0007¢\u0006\u0004\b)\u0010\u0007J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\u0007J\u000f\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u0007J\u000f\u0010\u000b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\u0007J!\u0010\u0010\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R$\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0018\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006+"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/SleepSegmentReportDetailFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/health/sleep/view/SleepViewModel;", "Lsaa;", "Lyaa;", "", "fillListWithData", "()V", "initViews", "loadBundle", "initActionBar", "showDeleteDialog", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "data", "onFragmentResult", "(IILandroid/os/Bundle;)V", "Landroidx/recyclerview/widget/RecyclerView;", "mRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getMRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "setMRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "Lcom/xiaomi/fitness/common/recycer/adapter/CommonRecordDetailAdapter;", "commonRecordDetailAdapter", "Lcom/xiaomi/fitness/common/recycer/adapter/CommonRecordDetailAdapter;", "getCommonRecordDetailAdapter", "()Lcom/xiaomi/fitness/common/recycer/adapter/CommonRecordDetailAdapter;", "setCommonRecordDetailAdapter", "(Lcom/xiaomi/fitness/common/recycer/adapter/CommonRecordDetailAdapter;)V", "Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport;", "sleepSegmentReport", "Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport;", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SleepSegmentReportDetailFragment extends Hilt_SleepSegmentReportDetailFragment<SleepViewModel, saa> implements yaa {
    public static final int REQ_CODE_DELETE_DIALOG = 1;

    @NotNull
    public static final String SID_MANUAL_RECORD = "xiaomiwear_app_manually";

    @Nullable
    private CommonRecordDetailAdapter commonRecordDetailAdapter;

    @Nullable
    private RecyclerView mRecyclerView;

    @Nullable
    private SleepSegmentReport sleepSegmentReport;

    public SleepSegmentReportDetailFragment() {
        super(jui.C0);
    }

    private final void fillListWithData() {
        Integer dreamTalkCount;
        Integer snoreDuration;
        String name;
        Integer wakeDuration;
        ArrayList arrayList = new ArrayList();
        SleepSegmentReport sleepSegmentReport = this.sleepSegmentReport;
        if ((sleepSegmentReport != null ? Long.valueOf(sleepSegmentReport.getBedTime()) : null) != null) {
            SleepSegmentReport sleepSegmentReport2 = this.sleepSegmentReport;
            Intrinsics.checkNotNull(sleepSegmentReport2);
            long bedTime = sleepSegmentReport2.getBedTime();
            arrayList.add(new CommonRecordDetailAdapter.DetailItem(getString(c0j.Wd), TimeDateUtil.getDateYYYYMMddLocalFormat(((long) 1000) * bedTime) + " " + TimeDateUtil.getDateHHmm24Format(bedTime)));
        }
        SleepSegmentReport sleepSegmentReport3 = this.sleepSegmentReport;
        if ((sleepSegmentReport3 != null ? Long.valueOf(sleepSegmentReport3.getWakeupTime()) : null) != null) {
            SleepSegmentReport sleepSegmentReport4 = this.sleepSegmentReport;
            Intrinsics.checkNotNull(sleepSegmentReport4);
            long wakeupTime = sleepSegmentReport4.getWakeupTime();
            arrayList.add(new CommonRecordDetailAdapter.DetailItem(getString(c0j.Fk), TimeDateUtil.getDateYYYYMMddLocalFormat(((long) 1000) * wakeupTime) + " " + TimeDateUtil.getDateHHmm24Format(wakeupTime)));
        }
        int[] iArrH = gjm.h(this.sleepSegmentReport);
        Intrinsics.checkNotNullExpressionValue(iArrH, "getSleepDistributePercent(...)");
        int i = iArrH[0];
        int i2 = iArrH[1];
        int i3 = iArrH[2];
        SleepSegmentReport sleepSegmentReport5 = this.sleepSegmentReport;
        int iIntValue = (sleepSegmentReport5 == null || (wakeDuration = sleepSegmentReport5.getWakeDuration()) == null) ? 0 : wakeDuration.intValue();
        if (i > 0) {
            arrayList.add(new CommonRecordDetailAdapter.DetailItem(getString(c0j.C7), xr5.h(i)));
        }
        if (i2 > 0) {
            arrayList.add(new CommonRecordDetailAdapter.DetailItem(getString(c0j.u9), xr5.h(i2)));
        }
        if (i3 > 0) {
            arrayList.add(new CommonRecordDetailAdapter.DetailItem(getString(c0j.Cb), xr5.h(i3)));
        }
        if (iIntValue != 0) {
            String quantityString = getResources().getQuantityString(qxi.L1, iIntValue, Integer.valueOf(iIntValue));
            Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
            arrayList.add(new CommonRecordDetailAdapter.DetailItem(getString(c0j.Ek), quantityString));
        }
        SleepSegmentReport sleepSegmentReport6 = this.sleepSegmentReport;
        String sid = sleepSegmentReport6 != null ? sleepSegmentReport6.getSid() : null;
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
        SleepSegmentReport sleepSegmentReport7 = this.sleepSegmentReport;
        int iIntValue2 = (sleepSegmentReport7 == null || (snoreDuration = sleepSegmentReport7.getSnoreDuration()) == null) ? 0 : snoreDuration.intValue();
        if (iIntValue2 != 0) {
            arrayList.add(new CommonRecordDetailAdapter.DetailItem(getString(c0j.Ik), TimeDateUtil.getZNTimeWithMin(iIntValue2 / 60)));
        }
        SleepSegmentReport sleepSegmentReport8 = this.sleepSegmentReport;
        int iIntValue3 = (sleepSegmentReport8 == null || (dreamTalkCount = sleepSegmentReport8.getDreamTalkCount()) == null) ? 0 : dreamTalkCount.intValue();
        if (iIntValue3 != 0) {
            Logger.d("dreamWordsCount " + iIntValue3, new Object[0]);
            String quantityString2 = getResources().getQuantityString(qxi.w0, iIntValue3);
            Intrinsics.checkNotNullExpressionValue(quantityString2, "getQuantityString(...)");
            String str = iIntValue3 + quantityString2;
            Logger.d("dreamWordsCount dreamTalkCountStr " + str, new Object[0]);
            arrayList.add(new CommonRecordDetailAdapter.DetailItem(getString(c0j.zf), str));
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
            k5g.h(contextRequireContext, miuiActionBar, eri.l8, pni.L1, getString(c0j.G7), new View.OnClickListener() { // from class: dxm
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SleepSegmentReportDetailFragment.initActionBar$lambda$1$lambda$0(this.f16039a, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initActionBar$lambda$1$lambda$0(SleepSegmentReportDetailFragment this$0, View view) {
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
        Serializable serializable = requireArguments().getSerializable("sleep");
        Intrinsics.checkNotNull(serializable, "null cannot be cast to non-null type com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport");
        this.sleepSegmentReport = (SleepSegmentReport) serializable;
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
            ((SleepViewModel) getMViewModel()).deleteRecord(this.sleepSegmentReport);
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
