package com.xiaomi.fitness.health.bloodglucose.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fit.fitness.export.data.item.AbnormalFibItem;
import com.xiaomi.fit.fitness.export.data.item.AbnormalItem;
import com.xiaomi.fit.fitness.export.data.item.BloodSugarItem;
import com.xiaomi.fit.fitness.export.data.item.SegmentItem;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.device.manager.bean.Device;
import com.xiaomi.fitness.device.manager.bean.DeviceInfo;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.health.bloodglucose.BloodGlucoseViewModel;
import com.xiaomi.fitness.health.bloodglucose.holder.BloodGlucoseRecordDetailAdapter;
import com.xiaomi.fitness.health.bloodglucose.ui.BloodGlucoseRecordDetailFragment;
import com.xiaomi.fitness.health.bloodglucose.util.BloodGlucoseDataUtil;
import defpackage.c0j;
import defpackage.eri;
import defpackage.jui;
import defpackage.k5g;
import defpackage.l2c;
import defpackage.pni;
import defpackage.qxi;
import defpackage.saa;
import defpackage.wc0;
import defpackage.yaa;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import miuix.recyclerview.widget.RecyclerView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 82\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u00018B\u0007¢\u0006\u0004\b7\u0010\u0007J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\u0007J\u000f\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u0007J\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\r8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u001e\u0010(\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010*\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010\u001cR\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010.\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010-R\u0018\u00100\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00103\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00105\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106¨\u00069"}, d2 = {"Lcom/xiaomi/fitness/health/bloodglucose/ui/BloodGlucoseRecordDetailFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/health/bloodglucose/BloodGlucoseViewModel;", "Lsaa;", "Lyaa;", "", "loadBundle", "()V", "initActionBar", "showDeleteDialog", "fillRecyclerList", "", "constant", "", "getBloodGlucoseTypeByConstant", "(I)Ljava/lang/String;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "data", "onFragmentResult", "(IILandroid/os/Bundle;)V", "TAG", "Ljava/lang/String;", "Lcom/xiaomi/fit/fitness/export/data/item/BloodSugarItem;", "record", "Lcom/xiaomi/fit/fitness/export/data/item/BloodSugarItem;", "Lcom/xiaomi/fit/fitness/export/data/item/AbnormalRecordItem;", "abnormalRecordItem", "Lcom/xiaomi/fit/fitness/export/data/item/AbnormalRecordItem;", "Lcom/xiaomi/fit/fitness/export/data/item/AbnormalFibItem;", "abnormalFibItem", "Lcom/xiaomi/fit/fitness/export/data/item/AbnormalFibItem;", "", "Lcom/xiaomi/fit/fitness/export/data/item/AbnormalItem;", "mItems", "Ljava/util/List;", "mSid", "", "mStartTimeInSec", "Ljava/lang/Long;", "mEndTimeInSec", "Lmiuix/recyclerview/widget/RecyclerView;", "mRecyclerView", "Lmiuix/recyclerview/widget/RecyclerView;", "Lcom/xiaomi/fitness/health/bloodglucose/holder/BloodGlucoseRecordDetailAdapter;", "mRecyclerAdapter", "Lcom/xiaomi/fitness/health/bloodglucose/holder/BloodGlucoseRecordDetailAdapter;", "mBloodSugarRecordType", "I", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class BloodGlucoseRecordDetailFragment extends Hilt_BloodGlucoseRecordDetailFragment<BloodGlucoseViewModel, saa> implements yaa {
    public static final int DELETE_DIALOG_REQ_CODE = 200;

    @NotNull
    public static final String KEY_HR_RECORD_TYPE = "hr_record_type";

    @NotNull
    public static final String PARAM_RECORD = "record";

    @NotNull
    public static final String SID_MANUAL_RECORD = "xiaomiwear_app_manually";
    public static final int TYPE_HR_ABN_HIGH = 1;
    public static final int TYPE_HR_ABN_LOW = 2;
    public static final int TYPE_HR_EXC_FIB = 3;
    public static final int TYPE_HR_MAN_MEASURED = 0;

    @NotNull
    private final String TAG;

    @Nullable
    private AbnormalFibItem abnormalFibItem;

    @Nullable
    private SegmentItem abnormalRecordItem;
    private int mBloodSugarRecordType;

    @Nullable
    private Long mEndTimeInSec;

    @Nullable
    private List<AbnormalItem> mItems;

    @Nullable
    private BloodGlucoseRecordDetailAdapter mRecyclerAdapter;

    @Nullable
    private RecyclerView mRecyclerView;
    private String mSid;

    @Nullable
    private Long mStartTimeInSec;

    @Nullable
    private BloodSugarItem record;

    public BloodGlucoseRecordDetailFragment() {
        super(jui.C0);
        this.TAG = "BloodGlucoseRecordDetailFragment";
        this.mBloodSugarRecordType = 1;
    }

    private final void fillRecyclerList() {
        String name;
        Integer measurePeriod;
        ArrayList arrayList = new ArrayList();
        int i = this.mBloodSugarRecordType;
        if (i == 1 || i == 2 || i == 3) {
            String string = getString(c0j.y7);
            Long l = this.mStartTimeInSec;
            Intrinsics.checkNotNull(l);
            arrayList.add(new BloodGlucoseRecordDetailAdapter.DetailItem(string, TimeDateUtil.getDateYYYYMMDDLocalFormat(l.longValue())));
            Long l2 = this.mStartTimeInSec;
            Intrinsics.checkNotNull(l2);
            String dateHHmm24Format = TimeDateUtil.getDateHHmm24Format(l2.longValue());
            Long l3 = this.mEndTimeInSec;
            Intrinsics.checkNotNull(l3);
            arrayList.add(new BloodGlucoseRecordDetailAdapter.DetailItem(getString(c0j.vn), dateHHmm24Format + " - " + TimeDateUtil.getDateHHmm24Format(l3.longValue())));
        }
        if (this.mBloodSugarRecordType == 0) {
            String string2 = getString(c0j.y7);
            BloodSugarItem bloodSugarItem = this.record;
            Long lValueOf = bloodSugarItem != null ? Long.valueOf(bloodSugarItem.getTime()) : null;
            Intrinsics.checkNotNull(lValueOf);
            arrayList.add(new BloodGlucoseRecordDetailAdapter.DetailItem(string2, TimeDateUtil.getDateYYYYMMDDLocalFormat(lValueOf.longValue())));
            BloodSugarItem bloodSugarItem2 = this.record;
            Intrinsics.checkNotNull(bloodSugarItem2);
            float fBloodSugar = bloodSugarItem2.bloodSugar();
            BloodSugarItem bloodSugarItem3 = this.record;
            Intrinsics.checkNotNull(bloodSugarItem3);
            String string3 = getString(BloodGlucoseDataUtil.INSTANCE.getTypeStingRes(BloodSugarItem.getTargetLevel$default(bloodSugarItem3, null, 1, null)));
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            arrayList.add(new BloodGlucoseRecordDetailAdapter.DetailItem(l2c.b(403), getResources().getQuantityString(qxi.e, (int) fBloodSugar, Float.valueOf(fBloodSugar)), string3));
            String str = this.mSid;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSid");
                str = null;
            }
            if (!StringsKt__StringsKt.isBlank(str)) {
                String str2 = this.mSid;
                if (str2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mSid");
                    str2 = null;
                }
                if (Intrinsics.areEqual(str2, "xiaomiwear_app_manually")) {
                    String string4 = getString(c0j.J0);
                    BloodSugarItem bloodSugarItem4 = this.record;
                    arrayList.add(new BloodGlucoseRecordDetailAdapter.DetailItem(string4, getBloodGlucoseTypeByConstant((bloodSugarItem4 == null || (measurePeriod = bloodSugarItem4.getMeasurePeriod()) == null) ? 9 : measurePeriod.intValue())));
                }
            }
        }
        String str3 = this.mSid;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSid");
            str3 = null;
        }
        if (!StringsKt__StringsKt.isBlank(str3)) {
            String str4 = this.mSid;
            if (str4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSid");
                str4 = null;
            }
            if (Intrinsics.areEqual(str4, "xiaomiwear_app_manually")) {
                name = getString(c0j.D);
            } else {
                WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE);
                String str5 = this.mSid;
                if (str5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mSid");
                    str5 = null;
                }
                DeviceInfo<? extends Device> deviceInfoInAll = deviceManagerExtKt.getDeviceInfoInAll(str5);
                name = deviceInfoInAll != null ? deviceInfoInAll.getName() : null;
            }
            arrayList.add(new BloodGlucoseRecordDetailAdapter.DetailItem(1));
            arrayList.add(new BloodGlucoseRecordDetailAdapter.DetailItem(getString(c0j.i5), name != null ? StringsKt__StringsKt.trim((CharSequence) name).toString() : null));
        }
        BloodGlucoseRecordDetailAdapter bloodGlucoseRecordDetailAdapter = this.mRecyclerAdapter;
        Intrinsics.checkNotNull(bloodGlucoseRecordDetailAdapter);
        bloodGlucoseRecordDetailAdapter.setDetailItems(arrayList);
    }

    private final String getBloodGlucoseTypeByConstant(int constant) {
        switch (constant) {
            case 1:
                String string = getString(c0j.i0);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                return string;
            case 2:
                String string2 = getString(c0j.l0);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return string2;
            case 3:
                String string3 = getString(c0j.Q0);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                return string3;
            case 4:
                String string4 = getString(c0j.U0);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                return string4;
            case 5:
                String string5 = getString(c0j.S0);
                Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                return string5;
            case 6:
                String string6 = getString(c0j.T0);
                Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
                return string6;
            case 7:
                String string7 = getString(c0j.R0);
                Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
                return string7;
            case 8:
                String string8 = getString(c0j.f0);
                Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
                return string8;
            case 9:
                String string9 = getString(c0j.V0);
                Intrinsics.checkNotNullExpressionValue(string9, "getString(...)");
                return string9;
            default:
                String string10 = getString(c0j.V0);
                Intrinsics.checkNotNullExpressionValue(string10, "getString(...)");
                return string10;
        }
    }

    private final void initActionBar() {
        setTitle(c0j.s5);
        if (getMiuiActionBar() != null) {
            Context contextRequireContext = requireContext();
            wc0 miuiActionBar = getMiuiActionBar();
            Intrinsics.checkNotNull(miuiActionBar);
            k5g.h(contextRequireContext, miuiActionBar, eri.l8, pni.L1, getString(c0j.G7), new View.OnClickListener() { // from class: xx2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BloodGlucoseRecordDetailFragment.initActionBar$lambda$1$lambda$0(this.f39542a, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initActionBar$lambda$1$lambda$0(BloodGlucoseRecordDetailFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showDeleteDialog();
    }

    private final void loadBundle() {
        Bundle arguments = getArguments();
        Integer numValueOf = arguments != null ? Integer.valueOf(arguments.getInt("hr_record_type")) : null;
        Intrinsics.checkNotNull(numValueOf);
        int iIntValue = numValueOf.intValue();
        this.mBloodSugarRecordType = iIntValue;
        if (iIntValue == 1 || iIntValue == 2) {
            Bundle arguments2 = getArguments();
            Serializable serializable = arguments2 != null ? arguments2.getSerializable("record") : null;
            Intrinsics.checkNotNull(serializable, "null cannot be cast to non-null type com.xiaomi.fit.fitness.export.data.item.AbnormalRecordItem");
            SegmentItem segmentItem = (SegmentItem) serializable;
            this.abnormalRecordItem = segmentItem;
            this.mStartTimeInSec = segmentItem != null ? Long.valueOf(segmentItem.getStartTime()) : null;
            SegmentItem segmentItem2 = this.abnormalRecordItem;
            this.mEndTimeInSec = segmentItem2 != null ? Long.valueOf(segmentItem2.getEndTime()) : null;
            SegmentItem segmentItem3 = this.abnormalRecordItem;
            this.mSid = String.valueOf(segmentItem3 != null ? segmentItem3.getSid() : null);
            SegmentItem segmentItem4 = this.abnormalRecordItem;
            this.mItems = segmentItem4 != null ? segmentItem4.getItems() : null;
            return;
        }
        if (iIntValue != 3) {
            Bundle arguments3 = getArguments();
            BloodSugarItem bloodSugarItem = (BloodSugarItem) (arguments3 != null ? arguments3.getSerializable("record") : null);
            this.record = bloodSugarItem;
            this.mSid = String.valueOf(bloodSugarItem != null ? bloodSugarItem.getSid() : null);
            return;
        }
        Bundle arguments4 = getArguments();
        Serializable serializable2 = arguments4 != null ? arguments4.getSerializable("record") : null;
        Intrinsics.checkNotNull(serializable2, "null cannot be cast to non-null type com.xiaomi.fit.fitness.export.data.item.AbnormalFibItem");
        this.abnormalFibItem = (AbnormalFibItem) serializable2;
        SegmentItem segmentItem5 = this.abnormalRecordItem;
        this.mSid = String.valueOf(segmentItem5 != null ? segmentItem5.getSid() : null);
        AbnormalFibItem abnormalFibItem = this.abnormalFibItem;
        this.mStartTimeInSec = abnormalFibItem != null ? Long.valueOf(abnormalFibItem.getStartTime()) : null;
        AbnormalFibItem abnormalFibItem2 = this.abnormalFibItem;
        this.mEndTimeInSec = abnormalFibItem2 != null ? Long.valueOf(abnormalFibItem2.getEndTime()) : null;
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
            Logger.d(this.TAG, "mHrRecordType " + this.mBloodSugarRecordType);
            if (this.mBloodSugarRecordType == 0) {
                BloodGlucoseViewModel bloodGlucoseViewModel = (BloodGlucoseViewModel) getMViewModel();
                BloodSugarItem bloodSugarItem = this.record;
                Intrinsics.checkNotNull(bloodSugarItem);
                bloodGlucoseViewModel.deleteBloodGlucoseRecord(bloodSugarItem);
            }
            requireActivity().setResult(2);
            requireActivity().lambda$onCreate$0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        initActionBar();
        loadBundle();
        this.mRecyclerView = ((saa) getMBinding()).B;
        this.mRecyclerAdapter = new BloodGlucoseRecordDetailAdapter();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireContext());
        RecyclerView recyclerView = this.mRecyclerView;
        Intrinsics.checkNotNull(recyclerView);
        recyclerView.setLayoutManager(linearLayoutManager);
        RecyclerView recyclerView2 = this.mRecyclerView;
        Intrinsics.checkNotNull(recyclerView2);
        recyclerView2.setAdapter(this.mRecyclerAdapter);
        fillRecyclerList();
    }
}
