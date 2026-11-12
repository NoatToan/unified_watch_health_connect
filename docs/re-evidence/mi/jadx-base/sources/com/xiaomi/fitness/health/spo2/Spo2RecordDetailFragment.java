package com.xiaomi.fitness.health.spo2;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fit.fitness.export.data.item.AbnormalItem;
import com.xiaomi.fit.fitness.export.data.item.SegmentItem;
import com.xiaomi.fit.fitness.export.data.item.Spo2Item;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.device.manager.bean.Device;
import com.xiaomi.fitness.device.manager.bean.DeviceInfo;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.health.spo2.Spo2RecordDetailFragment;
import com.xiaomi.fitness.health.spo2.recycler.Spo2RecordDetailAdapter;
import defpackage.c0j;
import defpackage.eri;
import defpackage.jui;
import defpackage.k5g;
import defpackage.l2c;
import defpackage.pni;
import defpackage.saa;
import defpackage.wc0;
import defpackage.xr5;
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
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 52\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u00015B\u0007¢\u0006\u0004\b4\u0010\u0007J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\u0007J\u000f\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u0007J!\u0010\u000f\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010'\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u001e\u0010+\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00101\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00103\u001a\u00020\u00198\u0002X\u0082D¢\u0006\u0006\n\u0004\b3\u0010\u001b¨\u00066"}, d2 = {"Lcom/xiaomi/fitness/health/spo2/Spo2RecordDetailFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/health/spo2/Spo2ViewModel;", "Lsaa;", "Lyaa;", "", "initActionBar", "()V", "showDeleteDialog", "loadBundle", "fillList", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "data", "onFragmentResult", "(IILandroid/os/Bundle;)V", "mValue", "Ljava/lang/Integer;", "", "mSid", "Ljava/lang/String;", "", "mTime", "Ljava/lang/Long;", "mStartTimeInSec", "mEndTimeInSec", "Lcom/xiaomi/fit/fitness/export/data/item/Spo2Item;", "record", "Lcom/xiaomi/fit/fitness/export/data/item/Spo2Item;", "Lcom/xiaomi/fit/fitness/export/data/item/AbnormalRecordItem;", "abnormalRecordItem", "Lcom/xiaomi/fit/fitness/export/data/item/AbnormalRecordItem;", "mRecordType", "I", "", "Lcom/xiaomi/fit/fitness/export/data/item/AbnormalItem;", "mItems", "Ljava/util/List;", "Lmiuix/recyclerview/widget/RecyclerView;", "mRecyclerView", "Lmiuix/recyclerview/widget/RecyclerView;", "Lcom/xiaomi/fitness/health/spo2/recycler/Spo2RecordDetailAdapter;", "mAdapter", "Lcom/xiaomi/fitness/health/spo2/recycler/Spo2RecordDetailAdapter;", "TAG", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSpo2RecordDetailFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Spo2RecordDetailFragment.kt\ncom/xiaomi/fitness/health/spo2/Spo2RecordDetailFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,209:1\n1863#2,2:210\n*S KotlinDebug\n*F\n+ 1 Spo2RecordDetailFragment.kt\ncom/xiaomi/fitness/health/spo2/Spo2RecordDetailFragment\n*L\n168#1:210,2\n*E\n"})
public final class Spo2RecordDetailFragment extends Hilt_Spo2RecordDetailFragment<Spo2ViewModel, saa> implements yaa {
    public static final int DELETE_DIALOG_REQ_CODE = 20;

    @NotNull
    public static final String KEY_SPO2_RECORD_TYPE = "spo2_type";

    @NotNull
    public static final String PARAM_RECORD = "spo2_record";
    public static final int TYPE_EXTREME_LOW = 1;
    public static final int TYPE_MANUALLY_MEASURED = 0;

    @NotNull
    private final String TAG;

    @Nullable
    private SegmentItem abnormalRecordItem;

    @Nullable
    private Spo2RecordDetailAdapter mAdapter;

    @Nullable
    private Long mEndTimeInSec;

    @Nullable
    private List<AbnormalItem> mItems;
    private int mRecordType;

    @Nullable
    private RecyclerView mRecyclerView;
    private String mSid;

    @Nullable
    private Long mStartTimeInSec;

    @Nullable
    private Long mTime;

    @Nullable
    private Integer mValue;

    @Nullable
    private Spo2Item record;

    public Spo2RecordDetailFragment() {
        super(jui.C0);
        this.TAG = "Spo2RecordDetailFragment";
    }

    private final void fillList() {
        String name;
        ArrayList arrayList = new ArrayList();
        Spo2Item spo2Item = this.record;
        if ((spo2Item != null ? Long.valueOf(spo2Item.getTime()) : null) != null && this.mRecordType == 0) {
            String string = getString(c0j.Z1);
            Spo2Item spo2Item2 = this.record;
            Intrinsics.checkNotNull(spo2Item2);
            arrayList.add(new Spo2RecordDetailAdapter.DetailItem(string, TimeUtils.formatDate("yyyy-MM-dd HH:mm", Long.valueOf(spo2Item2.getTime() * ((long) 1000)))));
        }
        Spo2Item spo2Item3 = this.record;
        if ((spo2Item3 != null ? Integer.valueOf(spo2Item3.getSpo2()) : null) != null && this.mRecordType == 0) {
            String string2 = getString(c0j.il);
            Spo2Item spo2Item4 = this.record;
            Intrinsics.checkNotNull(spo2Item4);
            arrayList.add(new Spo2RecordDetailAdapter.DetailItem(string2, xr5.h(spo2Item4.getSpo2())));
        }
        if (this.mRecordType == 1) {
            String string3 = getString(c0j.y7);
            Long l = this.mStartTimeInSec;
            Intrinsics.checkNotNull(l);
            arrayList.add(new Spo2RecordDetailAdapter.DetailItem(string3, TimeDateUtil.getDateYYYYMMdd(l.longValue() * ((long) 1000))));
            Long l2 = this.mStartTimeInSec;
            Intrinsics.checkNotNull(l2);
            String dateHHmm24Format = TimeDateUtil.getDateHHmm24Format(l2.longValue());
            Long l3 = this.mEndTimeInSec;
            Intrinsics.checkNotNull(l3);
            arrayList.add(new Spo2RecordDetailAdapter.DetailItem(getString(c0j.vn), dateHHmm24Format + " - " + TimeDateUtil.getDateHHmm24Format(l3.longValue())));
        }
        List<AbnormalItem> list = this.mItems;
        if (list != null) {
            Intrinsics.checkNotNull(list);
            if (!list.isEmpty()) {
                arrayList.add(new Spo2RecordDetailAdapter.DetailItem(1));
                String strB = l2c.b(13);
                Intrinsics.checkNotNullExpressionValue(strB, "getSportTypeName(...)");
                arrayList.add(new Spo2RecordDetailAdapter.DetailItem(strB));
                List<AbnormalItem> list2 = this.mItems;
                Intrinsics.checkNotNull(list2);
                for (AbnormalItem abnormalItem : list2) {
                    arrayList.add(new Spo2RecordDetailAdapter.DetailItem(xr5.h(abnormalItem.getValue()), TimeDateUtil.getDateHHmm24Format(abnormalItem.getTime())));
                }
            }
        }
        WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE);
        String str = this.mSid;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSid");
            str = null;
        }
        DeviceInfo<? extends Device> deviceInfoInAll = deviceManagerExtKt.getDeviceInfoInAll(str);
        arrayList.add(new Spo2RecordDetailAdapter.DetailItem(1));
        arrayList.add(new Spo2RecordDetailAdapter.DetailItem(getString(c0j.i5), (deviceInfoInAll == null || (name = deviceInfoInAll.getName()) == null) ? null : StringsKt__StringsKt.trim((CharSequence) name).toString()));
        String str2 = this.mSid;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSid");
            str2 = null;
        }
        String name2 = deviceInfoInAll != null ? deviceInfoInAll.getName() : null;
        StringBuilder sb = new StringBuilder();
        sb.append("spo2-record-detail-id:");
        sb.append(str2);
        sb.append("-dataSourceName:");
        sb.append(name2);
        Spo2RecordDetailAdapter spo2RecordDetailAdapter = this.mAdapter;
        Intrinsics.checkNotNull(spo2RecordDetailAdapter);
        spo2RecordDetailAdapter.setDetailItems(arrayList);
    }

    private final void initActionBar() {
        setTitle(c0j.s5);
        Context contextRequireContext = requireContext();
        wc0 actionBar = getActionBar();
        Intrinsics.checkNotNull(actionBar);
        k5g.h(contextRequireContext, actionBar, eri.l8, pni.L1, getString(c0j.G7), new View.OnClickListener() { // from class: s8n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Spo2RecordDetailFragment.initActionBar$lambda$0(this.f33410a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initActionBar$lambda$0(Spo2RecordDetailFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showDeleteDialog();
    }

    private final void loadBundle() {
        Bundle arguments = getArguments();
        Integer numValueOf = arguments != null ? Integer.valueOf(arguments.getInt(KEY_SPO2_RECORD_TYPE)) : null;
        Intrinsics.checkNotNull(numValueOf);
        int iIntValue = numValueOf.intValue();
        this.mRecordType = iIntValue;
        if (iIntValue != 1) {
            Bundle arguments2 = getArguments();
            Serializable serializable = arguments2 != null ? arguments2.getSerializable("spo2_record") : null;
            Intrinsics.checkNotNull(serializable, "null cannot be cast to non-null type com.xiaomi.fit.fitness.export.data.item.Spo2Item");
            Spo2Item spo2Item = (Spo2Item) serializable;
            this.record = spo2Item;
            this.mSid = String.valueOf(spo2Item != null ? spo2Item.getSid() : null);
            Spo2Item spo2Item2 = this.record;
            this.mValue = spo2Item2 != null ? Integer.valueOf(spo2Item2.getSpo2()) : null;
            Spo2Item spo2Item3 = this.record;
            this.mTime = spo2Item3 != null ? Long.valueOf(spo2Item3.getTime()) : null;
            return;
        }
        Bundle arguments3 = getArguments();
        Serializable serializable2 = arguments3 != null ? arguments3.getSerializable("spo2_record") : null;
        Intrinsics.checkNotNull(serializable2, "null cannot be cast to non-null type com.xiaomi.fit.fitness.export.data.item.AbnormalRecordItem");
        SegmentItem segmentItem = (SegmentItem) serializable2;
        this.abnormalRecordItem = segmentItem;
        this.mSid = String.valueOf(segmentItem != null ? segmentItem.getSid() : null);
        SegmentItem segmentItem2 = this.abnormalRecordItem;
        this.mStartTimeInSec = segmentItem2 != null ? Long.valueOf(segmentItem2.getStartTime()) : null;
        SegmentItem segmentItem3 = this.abnormalRecordItem;
        this.mEndTimeInSec = segmentItem3 != null ? Long.valueOf(segmentItem3.getEndTime()) : null;
        SegmentItem segmentItem4 = this.abnormalRecordItem;
        this.mItems = segmentItem4 != null ? segmentItem4.getItems() : null;
    }

    private final void showDeleteDialog() {
        CommonDialog commonDialogCreate = new CommonDialog.c("delete_check").setDialogTitle(c0j.F7).setDialogDescription(c0j.E7).setNegativeText(c0j.D7).setPositiveText(c0j.H7).create();
        Intrinsics.checkNotNullExpressionValue(commonDialogCreate, "create(...)");
        commonDialogCreate.setRequestCode(20);
        commonDialogCreate.showIfNeed(getChildFragmentManager());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.yaa
    public void onFragmentResult(int requestCode, int resultCode, @NotNull Bundle data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (requestCode == 20 && resultCode == -1) {
            if (this.mRecordType == 1) {
                ((Spo2ViewModel) getMViewModel()).deleteRecord(this.abnormalRecordItem);
            } else {
                ((Spo2ViewModel) getMViewModel()).deleteRecord(this.record);
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
        this.mRecyclerView = ((saa) getMBinding()).B;
        loadBundle();
        this.mAdapter = new Spo2RecordDetailAdapter();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireContext());
        RecyclerView recyclerView = this.mRecyclerView;
        Intrinsics.checkNotNull(recyclerView);
        recyclerView.setLayoutManager(linearLayoutManager);
        RecyclerView recyclerView2 = this.mRecyclerView;
        Intrinsics.checkNotNull(recyclerView2);
        recyclerView2.setAdapter(this.mAdapter);
        fillList();
    }
}
