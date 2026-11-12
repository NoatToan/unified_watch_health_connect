package com.xiaomi.fitness.health.hrm;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fit.fitness.export.data.item.AbnormalFibItem;
import com.xiaomi.fit.fitness.export.data.item.AbnormalItem;
import com.xiaomi.fit.fitness.export.data.item.HrItem;
import com.xiaomi.fit.fitness.export.data.item.SegmentItem;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.device.manager.bean.Device;
import com.xiaomi.fitness.device.manager.bean.DeviceInfo;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.health.hrm.HrmRecordDetailFragment;
import com.xiaomi.fitness.health.hrm.recycler.HrmRecordDetailAdapter;
import com.xiaomi.fitness.rn.export.RNDeviceManager;
import com.xiaomi.fitness.rn.export.RNDeviceModel;
import com.xiaomi.fitness.rn.export.bean.RNDeviceInfo;
import com.xiaomi.fitness.rn.export.extensions.RNDeviceManagerExtKt;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import miuix.recyclerview.widget.RecyclerView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 52\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u00015B\u0007¢\u0006\u0004\b4\u0010\u0007J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\u0007J\u000f\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u0007J!\u0010\u000f\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u001e\u0010%\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010'\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010\u0019R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010+\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010*R\u0018\u0010-\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00100\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00102\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103¨\u00066"}, d2 = {"Lcom/xiaomi/fitness/health/hrm/HrmRecordDetailFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/health/hrm/HrmViewModel;", "Lsaa;", "Lyaa;", "", "loadBundle", "()V", "initActionBar", "showDeleteDialog", "fillRecyclerList", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "data", "onFragmentResult", "(IILandroid/os/Bundle;)V", "", "TAG", "Ljava/lang/String;", "Lcom/xiaomi/fit/fitness/export/data/item/HrItem;", "record", "Lcom/xiaomi/fit/fitness/export/data/item/HrItem;", "Lcom/xiaomi/fit/fitness/export/data/item/AbnormalRecordItem;", "abnormalRecordItem", "Lcom/xiaomi/fit/fitness/export/data/item/AbnormalRecordItem;", "Lcom/xiaomi/fit/fitness/export/data/item/AbnormalFibItem;", "abnormalFibItem", "Lcom/xiaomi/fit/fitness/export/data/item/AbnormalFibItem;", "", "Lcom/xiaomi/fit/fitness/export/data/item/AbnormalItem;", "mItems", "Ljava/util/List;", "mSid", "", "mStartTimeInSec", "Ljava/lang/Long;", "mEndTimeInSec", "Lmiuix/recyclerview/widget/RecyclerView;", "mRecyclerView", "Lmiuix/recyclerview/widget/RecyclerView;", "Lcom/xiaomi/fitness/health/hrm/recycler/HrmRecordDetailAdapter;", "mRecyclerAdapter", "Lcom/xiaomi/fitness/health/hrm/recycler/HrmRecordDetailAdapter;", "mHrRecordType", "I", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nHrmRecordDetailFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HrmRecordDetailFragment.kt\ncom/xiaomi/fitness/health/hrm/HrmRecordDetailFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,273:1\n1863#2,2:274\n*S KotlinDebug\n*F\n+ 1 HrmRecordDetailFragment.kt\ncom/xiaomi/fitness/health/hrm/HrmRecordDetailFragment\n*L\n200#1:274,2\n*E\n"})
public final class HrmRecordDetailFragment extends Hilt_HrmRecordDetailFragment<HrmViewModel, saa> implements yaa {
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

    @Nullable
    private Long mEndTimeInSec;
    private int mHrRecordType;

    @Nullable
    private List<AbnormalItem> mItems;

    @Nullable
    private HrmRecordDetailAdapter mRecyclerAdapter;

    @Nullable
    private RecyclerView mRecyclerView;
    private String mSid;

    @Nullable
    private Long mStartTimeInSec;

    @Nullable
    private HrItem record;

    public HrmRecordDetailFragment() {
        super(jui.C0);
        this.TAG = "HrmRecordDetailFragment";
        this.mHrRecordType = 1;
    }

    private final void fillRecyclerList() {
        RNDeviceInfo deviceInfo;
        String name;
        AbnormalFibItem abnormalFibItem;
        ArrayList arrayList = new ArrayList();
        int i = this.mHrRecordType;
        if (i == 1 || i == 2 || i == 3) {
            String string = getString(c0j.y7);
            Long l = this.mStartTimeInSec;
            Intrinsics.checkNotNull(l);
            arrayList.add(new HrmRecordDetailAdapter.DetailItem(string, TimeDateUtil.getDateYYYYMMDDLocalFormat(l.longValue())));
            Long l2 = this.mStartTimeInSec;
            Intrinsics.checkNotNull(l2);
            String dateHHmm24Format = TimeDateUtil.getDateHHmm24Format(l2.longValue());
            Long l3 = this.mEndTimeInSec;
            Intrinsics.checkNotNull(l3);
            arrayList.add(new HrmRecordDetailAdapter.DetailItem(getString(c0j.vn), dateHHmm24Format + " - " + TimeDateUtil.getDateHHmm24Format(l3.longValue())));
        }
        String name2 = null;
        if (this.mHrRecordType == 0) {
            String string2 = getString(c0j.y7);
            HrItem hrItem = this.record;
            Long lValueOf = hrItem != null ? Long.valueOf(hrItem.getTime()) : null;
            Intrinsics.checkNotNull(lValueOf);
            arrayList.add(new HrmRecordDetailAdapter.DetailItem(string2, TimeDateUtil.getDateYYYYMMDDLocalFormat(lValueOf.longValue())));
            String string3 = getString(c0j.vn);
            HrItem hrItem2 = this.record;
            Long lValueOf2 = hrItem2 != null ? Long.valueOf(hrItem2.getTime()) : null;
            Intrinsics.checkNotNull(lValueOf2);
            arrayList.add(new HrmRecordDetailAdapter.DetailItem(string3, TimeDateUtil.getDateHHmm24Format(lValueOf2.longValue())));
        }
        if (this.mHrRecordType == 0) {
            HrItem hrItem3 = this.record;
            Intrinsics.checkNotNull(hrItem3);
            int hr = hrItem3.getHr();
            arrayList.add(new HrmRecordDetailAdapter.DetailItem(l2c.b(4), getResources().getQuantityString(qxi.common_unit_heart_rate_desc, hr, Integer.valueOf(hr))));
        }
        int i2 = this.mHrRecordType;
        if (i2 == 1 || i2 == 2) {
            Logger.d(this.TAG, "heartRateItems mItems " + this.mItems);
            Logger.d(this.TAG, "heartRateItems setVisible");
            arrayList.add(new HrmRecordDetailAdapter.DetailItem(1));
            String strB = l2c.b(4);
            Intrinsics.checkNotNullExpressionValue(strB, "getSportTypeName(...)");
            arrayList.add(new HrmRecordDetailAdapter.DetailItem(strB));
            List<AbnormalItem> list = this.mItems;
            Intrinsics.checkNotNull(list);
            for (AbnormalItem abnormalItem : list) {
                arrayList.add(new HrmRecordDetailAdapter.DetailItem(abnormalItem.getValue() + getResources().getQuantityString(qxi.common_unit_heart_rate, abnormalItem.getValue(), Integer.valueOf(abnormalItem.getValue())), TimeDateUtil.getDateHHmm24Format(abnormalItem.getTime())));
            }
        }
        if (this.mHrRecordType == 3 && (abnormalFibItem = this.abnormalFibItem) != null) {
            Intrinsics.checkNotNull(abnormalFibItem);
            int duration = abnormalFibItem.getDuration();
            String quantityString = getResources().getQuantityString(qxi.P1, duration, Integer.valueOf(duration));
            Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
            arrayList.add(new HrmRecordDetailAdapter.DetailItem(getString(c0j.c9) + getString(c0j.yk), duration + quantityString));
        }
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
                name2 = getString(c0j.D);
            } else {
                WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE);
                String str3 = this.mSid;
                if (str3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mSid");
                    str3 = null;
                }
                DeviceInfo<? extends Device> deviceInfoInAll = deviceManagerExtKt.getDeviceInfoInAll(str3);
                if (deviceInfoInAll == null || (name = deviceInfoInAll.getName()) == null) {
                    RNDeviceManager rNDeviceManagerExtKt = RNDeviceManagerExtKt.getInstance(RNDeviceManager.INSTANCE);
                    String str4 = this.mSid;
                    if (str4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mSid");
                        str4 = null;
                    }
                    RNDeviceModel rNDeviceModel = (RNDeviceModel) rNDeviceManagerExtKt.getDeviceModel(str4);
                    if (rNDeviceModel != null && (deviceInfo = rNDeviceModel.getDeviceInfo()) != null) {
                        name2 = deviceInfo.getName();
                    }
                } else {
                    name2 = name;
                }
            }
            if (name2 != null && !StringsKt__StringsKt.isBlank(name2)) {
                arrayList.add(new HrmRecordDetailAdapter.DetailItem(1));
                arrayList.add(new HrmRecordDetailAdapter.DetailItem(getString(c0j.i5), StringsKt__StringsKt.trim((CharSequence) name2).toString()));
            }
        }
        HrmRecordDetailAdapter hrmRecordDetailAdapter = this.mRecyclerAdapter;
        Intrinsics.checkNotNull(hrmRecordDetailAdapter);
        hrmRecordDetailAdapter.setDetailItems(arrayList);
    }

    private final void initActionBar() {
        setTitle(c0j.s5);
        if (getMiuiActionBar() != null) {
            Context contextRequireContext = requireContext();
            wc0 miuiActionBar = getMiuiActionBar();
            Intrinsics.checkNotNull(miuiActionBar);
            k5g.h(contextRequireContext, miuiActionBar, eri.l8, pni.L1, getString(c0j.G7), new View.OnClickListener() { // from class: wec
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HrmRecordDetailFragment.initActionBar$lambda$1$lambda$0(this.f37897a, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initActionBar$lambda$1$lambda$0(HrmRecordDetailFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showDeleteDialog();
    }

    private final void loadBundle() {
        Bundle arguments = getArguments();
        Integer numValueOf = arguments != null ? Integer.valueOf(arguments.getInt("hr_record_type")) : null;
        Intrinsics.checkNotNull(numValueOf);
        int iIntValue = numValueOf.intValue();
        this.mHrRecordType = iIntValue;
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
            HrItem hrItem = (HrItem) (arguments3 != null ? arguments3.getSerializable("record") : null);
            this.record = hrItem;
            this.mSid = String.valueOf(hrItem != null ? hrItem.getSid() : null);
            return;
        }
        Bundle arguments4 = getArguments();
        Serializable serializable2 = arguments4 != null ? arguments4.getSerializable("record") : null;
        Intrinsics.checkNotNull(serializable2, "null cannot be cast to non-null type com.xiaomi.fit.fitness.export.data.item.AbnormalFibItem");
        AbnormalFibItem abnormalFibItem = (AbnormalFibItem) serializable2;
        this.abnormalFibItem = abnormalFibItem;
        this.mSid = String.valueOf(abnormalFibItem != null ? abnormalFibItem.getSid() : null);
        AbnormalFibItem abnormalFibItem2 = this.abnormalFibItem;
        this.mStartTimeInSec = abnormalFibItem2 != null ? Long.valueOf(abnormalFibItem2.getStartTime()) : null;
        AbnormalFibItem abnormalFibItem3 = this.abnormalFibItem;
        this.mEndTimeInSec = abnormalFibItem3 != null ? Long.valueOf(abnormalFibItem3.getEndTime()) : null;
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
            Logger.d(this.TAG, "mHrRecordType " + this.mHrRecordType);
            int i = this.mHrRecordType;
            if (i == 0) {
                ((HrmViewModel) getMViewModel()).deleteRecord(this.record);
            } else if (i == 1 || i == 2) {
                ((HrmViewModel) getMViewModel()).deleteRecord(this.abnormalRecordItem);
            } else if (i == 3) {
                ((HrmViewModel) getMViewModel()).deleteRecord(this.abnormalFibItem);
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
        this.mRecyclerAdapter = new HrmRecordDetailAdapter();
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
