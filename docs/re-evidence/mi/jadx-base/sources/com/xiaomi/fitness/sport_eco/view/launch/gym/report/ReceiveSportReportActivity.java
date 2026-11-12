package com.xiaomi.fitness.sport_eco.view.launch.gym.report;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwnerKt;
import com.xiaomi.fit.data.common.data.annotation.SportDataTypeKt;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.eco.sync.export.api.EcoFitnessSyncer;
import com.xiaomi.fit.fitness.eco.sync.export.di.EcoFitnessSyncExtKt;
import com.xiaomi.fitness.baseui.view.BaseBindingActivity;
import com.xiaomi.fitness.eco.device.contact.export.EcoDeviceSyncCallback;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoDeviceInfo;
import com.xiaomi.fitness.sport_eco.view.launch.gym.data.GymReport;
import com.xiaomi.fitness.sport_eco.view.launch.gym.report.ReceiveSportReportActivity;
import com.xiaomi.fitness.sport_eco_manager_export.utils.SportManagerExportPreference;
import com.xiaomi.wearable.home.sport_eco.report.ReportAdapter;
import defpackage.by7;
import defpackage.cki;
import defpackage.e1j;
import defpackage.foi;
import defpackage.fvi;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 .2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001.B\u0011\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b,\u0010-J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\r\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0006R\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R \u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00070\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R*\u0010(\u001a\u0016\u0012\u0004\u0012\u00020&\u0018\u00010%j\n\u0012\u0004\u0012\u00020&\u0018\u0001`'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u0018¨\u0006/"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/view/launch/gym/report/ReceiveSportReportActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/sport_eco/view/launch/gym/report/ReceiveVM;", "Lby7;", "", "checkSportReports", "()V", "", "hasChecked", "()Z", "", "", "mList", "syncOfflineData", "(Ljava/util/List;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "setListener", "", "viewModelId", "I", "getViewModelId", "()I", "", "timeDim", "Ljava/lang/String;", "Lcom/xiaomi/wearable/home/sport_eco/report/ReportAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "getAdapter", "()Lcom/xiaomi/wearable/home/sport_eco/report/ReportAdapter;", "adapter", "Ljava/util/HashMap;", "selectMap", "Ljava/util/HashMap;", "Ljava/util/ArrayList;", "Lcom/xiaomi/fitness/sport_eco/view/launch/gym/data/GymReport;", "Lkotlin/collections/ArrayList;", "list", "Ljava/util/ArrayList;", "getLayoutId", "layoutId", "<init>", "(I)V", "Companion", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class ReceiveSportReportActivity extends BaseBindingActivity<ReceiveVM, by7> {

    @NotNull
    public static final String DATA = "DATA";

    @NotNull
    public static final String TAG = "ReceiveSportReportActivity";

    /* JADX INFO: renamed from: adapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy adapter;

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

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkSportReports() {
        TextView textView = getMBinding().B;
        if (hasChecked()) {
            textView.setBackgroundResource(foi.f18003b);
            textView.setClickable(true);
        } else {
            textView.setBackgroundResource(foi.C);
            textView.setClickable(false);
        }
    }

    private final ReportAdapter getAdapter() {
        return (ReportAdapter) this.adapter.getValue();
    }

    private final boolean hasChecked() {
        for (Map.Entry<Integer, Boolean> entry : this.selectMap.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            entry.getValue().booleanValue();
            Boolean bool = this.selectMap.get(Integer.valueOf(iIntValue));
            Intrinsics.checkNotNull(bool);
            if (bool.booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$2(ReceiveSportReportActivity this$0, View view) {
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
                FitnessLogUtils.d("ReceiveSportReportActivity", "ids : " + ids2);
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
        EcoDeviceInfo deviceInfo;
        showLoading(e1j.W, false);
        FitnessLogUtils.i("ReceiveSportReportActivity", "syncOfflineData , mList : " + mList);
        byte[] byteArray = CollectionsKt___CollectionsKt.toByteArray(mList);
        EcoDeviceModel localDeviceModel = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getLocalDeviceModel(SportManagerExportPreference.INSTANCE.getKEY_GYM_LOCAL_SPORT_TYPE());
        if (localDeviceModel == null || (deviceInfo = localDeviceModel.getDeviceInfo()) == null || (did = deviceInfo.getDid()) == null) {
            did = "";
        }
        FitnessLogUtils.i("ReceiveSportReportActivity", "syncOfflineData , did : " + did);
        EcoFitnessSyncExtKt.getInstance(EcoFitnessSyncer.INSTANCE).syncData(did, byteArray, new EcoDeviceSyncCallback() { // from class: com.xiaomi.fitness.sport_eco.view.launch.gym.report.ReceiveSportReportActivity.syncOfflineData.1
            @Override // com.xiaomi.fitness.eco.device.contact.export.EcoDeviceSyncCallback
            public void onSyncError(String did2, int type, String errorInfo) {
                Intrinsics.checkNotNullParameter(did2, "did");
                FitnessLogUtils.i("ReceiveSportReportActivity", "gym Offline data sync error , did : " + did2 + ", type = " + type + ", errorInfo = " + errorInfo);
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(ReceiveSportReportActivity.this), Dispatchers.getMain(), null, new ReceiveSportReportActivity$syncOfflineData$1$onSyncError$1(ReceiveSportReportActivity.this, null), 2, null);
            }

            @Override // com.xiaomi.fitness.eco.device.contact.export.EcoDeviceSyncCallback
            public void onSyncSuccess(String did2, int type, Object result) {
                Intrinsics.checkNotNullParameter(did2, "did");
                FitnessLogUtils.d("ReceiveSportReportActivity", "gym Offline data sync success , did : " + did2);
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(ReceiveSportReportActivity.this), Dispatchers.getMain(), null, new ReceiveSportReportActivity$syncOfflineData$1$onSyncSuccess$1(ReceiveSportReportActivity.this, null), 2, null);
            }
        });
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return fvi.z;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return this.viewModelId;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(e1j.N2);
        setTitleBackground(cki.common_page_bg_color);
        Serializable serializableExtra = getIntent().getSerializableExtra("GYM_REPORT");
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type java.util.ArrayList<com.xiaomi.fitness.sport_eco.view.launch.gym.data.GymReport>");
        this.list = (ArrayList) serializableExtra;
        getAdapter().setData(this.list, this.selectMap);
        getMBinding().A.setAdapter(getAdapter());
        setListener();
    }

    public final void setListener() {
        getMBinding().B.setOnClickListener(new View.OnClickListener() { // from class: ihj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReceiveSportReportActivity.setListener$lambda$2(this.f21151a, view);
            }
        });
        checkSportReports();
        getAdapter().setOnCheckListener(new ReportAdapter.OnCheckListener() { // from class: com.xiaomi.fitness.sport_eco.view.launch.gym.report.ReceiveSportReportActivity.setListener.2
            @Override // com.xiaomi.wearable.home.sport_eco.report.ReportAdapter.OnCheckListener
            public void onChecked() {
                ReceiveSportReportActivity.this.checkSportReports();
            }
        });
    }

    public /* synthetic */ ReceiveSportReportActivity(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public ReceiveSportReportActivity(int i) {
        this.viewModelId = i;
        this.timeDim = SportDataTypeKt.DIMEN_TOTAL;
        this.adapter = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: khj
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ReceiveSportReportActivity.adapter_delegate$lambda$0(this.f23852a);
            }
        });
        this.selectMap = new HashMap<>();
    }
}
