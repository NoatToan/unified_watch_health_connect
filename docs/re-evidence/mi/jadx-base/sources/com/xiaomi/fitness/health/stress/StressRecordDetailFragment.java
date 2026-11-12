package com.xiaomi.fitness.health.stress;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fit.fitness.export.data.item.StressItem;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.common.recycer.adapter.CommonRecordDetailAdapter;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.device.manager.bean.Device;
import com.xiaomi.fitness.device.manager.bean.DeviceInfo;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.health.stress.StressRecordDetailFragment;
import com.xiaomi.fitness.util.StressDataUtil;
import defpackage.c0j;
import defpackage.eri;
import defpackage.jui;
import defpackage.k5g;
import defpackage.pni;
import defpackage.saa;
import defpackage.wc0;
import defpackage.yaa;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import miuix.recyclerview.widget.RecyclerView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001 B\u0007¢\u0006\u0004\b\u001f\u0010\u0007J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\u0007J!\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/health/stress/StressRecordDetailFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/health/stress/StressViewModel;", "Lsaa;", "Lyaa;", "", "initActionBar", "()V", "showDeleteDialog", "fillList", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "data", "onFragmentResult", "(IILandroid/os/Bundle;)V", "Lcom/xiaomi/fit/fitness/export/data/item/StressItem;", "record", "Lcom/xiaomi/fit/fitness/export/data/item/StressItem;", "Lmiuix/recyclerview/widget/RecyclerView;", "mRecyclerView", "Lmiuix/recyclerview/widget/RecyclerView;", "Lcom/xiaomi/fitness/common/recycer/adapter/CommonRecordDetailAdapter;", "mAdapter", "Lcom/xiaomi/fitness/common/recycer/adapter/CommonRecordDetailAdapter;", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class StressRecordDetailFragment extends Hilt_StressRecordDetailFragment<StressViewModel, saa> implements yaa {
    public static final int DELETE_DIALOG_REQ_CODE = 200;

    @NotNull
    public static final String PARAM_RECORD = "stress_record";

    @Nullable
    private CommonRecordDetailAdapter mAdapter;

    @Nullable
    private RecyclerView mRecyclerView;

    @Nullable
    private StressItem record;

    public StressRecordDetailFragment() {
        super(jui.C0);
    }

    private final void fillList() {
        String name;
        ArrayList arrayList = new ArrayList();
        StressItem stressItem = this.record;
        String string = null;
        if ((stressItem != null ? Long.valueOf(stressItem.getTime()) : null) != null) {
            String string2 = getString(c0j.Z1);
            StressItem stressItem2 = this.record;
            Intrinsics.checkNotNull(stressItem2);
            arrayList.add(new CommonRecordDetailAdapter.DetailItem(string2, TimeUtils.formatDate("yyyy-MM-dd HH:mm", Long.valueOf(stressItem2.getTime() * ((long) 1000)))));
        }
        StressItem stressItem3 = this.record;
        if ((stressItem3 != null ? Integer.valueOf(stressItem3.getStress()) : null) != null) {
            String string3 = getString(c0j.Nl);
            StressItem stressItem4 = this.record;
            Intrinsics.checkNotNull(stressItem4);
            arrayList.add(new CommonRecordDetailAdapter.DetailItem(string3, String.valueOf(stressItem4.getStress())));
            String string4 = getString(c0j.Gl);
            StressItem stressItem5 = this.record;
            Intrinsics.checkNotNull(stressItem5);
            arrayList.add(new CommonRecordDetailAdapter.DetailItem(string4, StressDataUtil.getStressTypeNameAsValue(stressItem5.getStress())));
        }
        StressItem stressItem6 = this.record;
        if ((stressItem6 != null ? stressItem6.getSid() : null) != null) {
            WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE);
            StressItem stressItem7 = this.record;
            Intrinsics.checkNotNull(stressItem7);
            String sid = stressItem7.getSid();
            Intrinsics.checkNotNull(sid);
            DeviceInfo<? extends Device> deviceInfoInAll = deviceManagerExtKt.getDeviceInfoInAll(sid);
            StressItem stressItem8 = this.record;
            Intrinsics.checkNotNull(stressItem8);
            String sid2 = stressItem8.getSid();
            Intrinsics.checkNotNull(sid2);
            String name2 = deviceInfoInAll != null ? deviceInfoInAll.getName() : null;
            StringBuilder sb = new StringBuilder();
            sb.append("stressdetail-id:");
            sb.append(sid2);
            sb.append("-dataSourceName:");
            sb.append(name2);
            String string5 = getString(c0j.i5);
            if (deviceInfoInAll != null && (name = deviceInfoInAll.getName()) != null) {
                string = StringsKt__StringsKt.trim((CharSequence) name).toString();
            }
            arrayList.add(new CommonRecordDetailAdapter.DetailItem(string5, string));
        }
        CommonRecordDetailAdapter commonRecordDetailAdapter = this.mAdapter;
        Intrinsics.checkNotNull(commonRecordDetailAdapter);
        commonRecordDetailAdapter.setDetailItems(arrayList);
    }

    private final void initActionBar() {
        setTitle(c0j.s5);
        Context contextRequireContext = requireContext();
        wc0 actionBar = getActionBar();
        Intrinsics.checkNotNull(actionBar);
        k5g.h(contextRequireContext, actionBar, eri.l8, pni.L1, getString(c0j.G7), new View.OnClickListener() { // from class: oko
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StressRecordDetailFragment.initActionBar$lambda$0(this.f29261a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initActionBar$lambda$0(StressRecordDetailFragment this$0, View view) {
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
            ((StressViewModel) getMViewModel()).deleteRecord(this.record);
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
        this.record = (StressItem) (arguments != null ? arguments.getSerializable("stress_record") : null);
        this.mRecyclerView = ((saa) getMBinding()).B;
        this.mAdapter = new CommonRecordDetailAdapter();
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
