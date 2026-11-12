package com.xiaomi.wearable.home.sport.report;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import com.xiaomi.fit.data.common.data.annotation.SportDataTypeKt;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.sync.export.api.FitnessSyncer;
import com.xiaomi.fit.fitness.sync.export.di.FitnessSyncExtKt;
import com.xiaomi.fitness.baseui.view.BaseBindingActivity;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.device.contact.export.DeviceSyncCallback;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.WearableDeviceInfo;
import com.xiaomi.fitness.sport.view.launch.gym.GymDeviceModel;
import com.xiaomi.fitness.sport.view.launch.gym.data.GymReport;
import com.xiaomi.fitness.sport.view.launch.gym.report.ReceiveVM;
import com.xiaomi.wearable.home.sport.report.ReceiveSportReportActivity;
import defpackage.c1j;
import defpackage.dvi;
import defpackage.eoi;
import defpackage.ion;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 .2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001.B\u0011\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b,\u0010-J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR \u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R*\u0010%\u001a\u0016\u0012\u0004\u0012\u00020#\u0018\u00010\"j\n\u0012\u0004\u0012\u00020#\u0018\u0001`$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001f0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u0014¨\u0006/"}, d2 = {"Lcom/xiaomi/wearable/home/sport/report/ReceiveSportReportActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/sport/view/launch/gym/report/ReceiveVM;", "Lion;", "", "", "mList", "", "syncOfflineData", "(Ljava/util/List;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "setListener", "()V", "", "viewModelId", "I", "getViewModelId", "()I", "", "timeDim", "Ljava/lang/String;", "Lcom/xiaomi/wearable/home/sport/report/ReportAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "getAdapter", "()Lcom/xiaomi/wearable/home/sport/report/ReportAdapter;", "adapter", "Ljava/util/HashMap;", "", "selectMap", "Ljava/util/HashMap;", "Ljava/util/ArrayList;", "Lcom/xiaomi/fitness/sport/view/launch/gym/data/GymReport;", "Lkotlin/collections/ArrayList;", "list", "Ljava/util/ArrayList;", "Landroidx/lifecycle/MutableLiveData;", "hasSelected", "Landroidx/lifecycle/MutableLiveData;", "getLayoutId", "layoutId", "<init>", "(I)V", "Companion", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class ReceiveSportReportActivity extends BaseBindingActivity<ReceiveVM, ion> {

    @NotNull
    public static final String DATA = "DATA";

    @NotNull
    public static final String TAG = "ReceiveSportReportActivity";

    /* JADX INFO: renamed from: adapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy adapter;

    @NotNull
    private final MutableLiveData<Boolean> hasSelected;

    @Nullable
    private ArrayList<GymReport> list;

    @NotNull
    private final HashMap<Integer, Boolean> selectMap;

    @NotNull
    private String timeDim;
    private final int viewModelId;

    public ReceiveSportReportActivity() {
        this(0, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReportAdapter adapter_delegate$lambda$0(ReceiveSportReportActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new ReportAdapter(this$0, this$0.timeDim);
    }

    private final ReportAdapter getAdapter() {
        return (ReportAdapter) this.adapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$2(ReceiveSportReportActivity this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FitnessLogUtils.i("ReceiveSportReportActivity", "selectMap change");
        this$0.getMBinding().B.setBackground(ResourceExtKt.getResourceDrawable(this$0, bool.booleanValue() ? eoi.g0 : eoi.j0));
        this$0.getMBinding().B.setEnabled(bool.booleanValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$3(ReceiveSportReportActivity this$0, View view) {
        GymReport gymReport;
        GymReport gymReport2;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<Integer, Boolean> entry : this$0.selectMap.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            entry.getValue().booleanValue();
            Boolean bool = this$0.selectMap.get(Integer.valueOf(iIntValue));
            Intrinsics.checkNotNull(bool);
            if (bool.booleanValue()) {
                ArrayList<GymReport> arrayList2 = this$0.list;
                byte[] ids = null;
                byte[] ids2 = (arrayList2 == null || (gymReport2 = arrayList2.get(iIntValue)) == null) ? null : gymReport2.getIds();
                Intrinsics.checkNotNull(ids2);
                FitnessLogUtils.i("ReceiveSportReportActivity", "ids : " + ids2);
                ArrayList<GymReport> arrayList3 = this$0.list;
                if (arrayList3 != null && (gymReport = arrayList3.get(iIntValue)) != null) {
                    ids = gymReport.getIds();
                }
                Intrinsics.checkNotNull(ids);
                for (byte b2 : ids) {
                    arrayList.add(Byte.valueOf(b2));
                }
            }
        }
        this$0.syncOfflineData(arrayList);
    }

    private final void syncOfflineData(List<Byte> mList) {
        String did;
        WearableDeviceInfo deviceInfo;
        showLoading(c1j.F0, false);
        byte[] byteArray = CollectionsKt___CollectionsKt.toByteArray(mList);
        WearableDeviceModel wearableDeviceModelCurGymDeviceModel = GymDeviceModel.INSTANCE.curGymDeviceModel();
        if (wearableDeviceModelCurGymDeviceModel == null || (deviceInfo = wearableDeviceModelCurGymDeviceModel.getDeviceInfo()) == null || (did = deviceInfo.getDid()) == null) {
            did = "";
        }
        FitnessLogUtils.i("ReceiveSportReportActivity", "syncOfflineData , did : " + did);
        FitnessSyncExtKt.getInstance(FitnessSyncer.INSTANCE).syncData(did, byteArray, new DeviceSyncCallback() { // from class: com.xiaomi.wearable.home.sport.report.ReceiveSportReportActivity.syncOfflineData.1
            @Override // com.xiaomi.fitness.device.contact.export.DeviceSyncCallback
            public void onSyncError(String did2, int type, String errorInfo) {
                Intrinsics.checkNotNullParameter(did2, "did");
                FitnessLogUtils.i("ReceiveSportReportActivity", "gym Offline data sync error , did : " + did2);
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(ReceiveSportReportActivity.this), Dispatchers.getMain(), null, new ReceiveSportReportActivity$syncOfflineData$1$onSyncError$1(ReceiveSportReportActivity.this, null), 2, null);
            }

            @Override // com.xiaomi.fitness.device.contact.export.DeviceSyncCallback
            public void onSyncSuccess(String did2, int type, Object result) {
                Intrinsics.checkNotNullParameter(did2, "did");
                FitnessLogUtils.i("ReceiveSportReportActivity", "gym Offline data sync success , did : " + did2);
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(ReceiveSportReportActivity.this), Dispatchers.getMain(), null, new ReceiveSportReportActivity$syncOfflineData$1$onSyncSuccess$1(ReceiveSportReportActivity.this, null), 2, null);
            }
        });
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return dvi.q0;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return this.viewModelId;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(c1j.s3);
        Serializable serializableExtra = getIntent().getSerializableExtra("GYM_REPORT");
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type java.util.ArrayList<com.xiaomi.fitness.sport.view.launch.gym.data.GymReport>");
        this.list = (ArrayList) serializableExtra;
        getAdapter().setData(this.list, this.selectMap, this.hasSelected);
        getMBinding().A.setAdapter(getAdapter());
        setListener();
    }

    public final void setListener() {
        this.hasSelected.observe(this, new ReceiveSportReportActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: jhj
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ReceiveSportReportActivity.setListener$lambda$2(this.f22811a, (Boolean) obj);
            }
        }));
        getMBinding().B.setOnClickListener(new View.OnClickListener() { // from class: lhj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReceiveSportReportActivity.setListener$lambda$3(this.f25082a, view);
            }
        });
    }

    public /* synthetic */ ReceiveSportReportActivity(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public ReceiveSportReportActivity(int i) {
        this.viewModelId = i;
        this.timeDim = SportDataTypeKt.DIMEN_TOTAL;
        this.adapter = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: hhj
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ReceiveSportReportActivity.adapter_delegate$lambda$0(this.f20073a);
            }
        });
        this.selectMap = new HashMap<>();
        this.hasSelected = new MutableLiveData<>();
    }
}
