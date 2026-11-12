package com.xiaomi.fitness.health.curse;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.ViewModelProvider;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fit.fitness.export.data.aggregation.CurseRecordKt;
import com.xiaomi.fit.fitness.export.data.aggregation.Record;
import com.xiaomi.fit.fitness.export.data.item.WomenHealthSymptoms;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.health.curse.CurseInfoActivity;
import com.xiaomi.fitness.health.curse.view.SymChartRecordInfoView;
import com.xiaomi.fitness.health.curse.view.SymMoodChartRecordInfoView;
import com.xiaomi.fitness.health.curse.vm.CurseEditVM;
import com.xiaomi.fitness.health.curse.vm.CurseInfoVM;
import defpackage.av6;
import defpackage.c0j;
import defpackage.cv1;
import defpackage.eri;
import defpackage.iji;
import defpackage.jui;
import defpackage.osb;
import defpackage.qxi;
import java.io.Serializable;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0007¢\u0006\u0004\b'\u0010\fJ\u001d\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0017\u0010\fR\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010#¨\u0006("}, d2 = {"Lcom/xiaomi/fitness/health/curse/CurseInfoActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/health/curse/vm/CurseInfoVM;", "Losb;", "Landroid/view/View$OnClickListener;", "", "Lcom/xiaomi/fit/fitness/export/data/item/WomenHealthSymptoms;", PluginDeviceInfo.FICONOFF, "", "onDataOk", "(Ljava/util/List;)V", "onDeleteClick", "()V", "delete", "onUpdateClick", "Landroid/view/View;", "v", "onClick", "(Landroid/view/View;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", LifecycleConstantKt.ON_PAUSE, "Lcom/xiaomi/fit/fitness/export/data/aggregation/CurseRecord;", "period", "Lcom/xiaomi/fit/fitness/export/data/aggregation/CurseRecord;", "Lcom/xiaomi/fitness/health/curse/vm/CurseEditVM;", "editViewModel$delegate", "Lkotlin/Lazy;", "getEditViewModel", "()Lcom/xiaomi/fitness/health/curse/vm/CurseEditVM;", "editViewModel", "", "getLayoutId", "()I", "layoutId", "getViewModelId", "viewModelId", "<init>", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nCurseInfoActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CurseInfoActivity.kt\ncom/xiaomi/fitness/health/curse/CurseInfoActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,128:1\n1#2:129\n*E\n"})
public final class CurseInfoActivity extends Hilt_CurseInfoActivity<CurseInfoVM, osb> implements View.OnClickListener {

    /* JADX INFO: renamed from: editViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy editViewModel = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: n65
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CurseInfoActivity.editViewModel_delegate$lambda$0(this.f27587a);
        }
    });
    private Record period;

    /* JADX INFO: Access modifiers changed from: private */
    public final void delete() {
        showLoading(c0j.common_deleting, false);
        CurseEditVM editViewModel = getEditViewModel();
        Record record = this.period;
        if (record == null) {
            Intrinsics.throwUninitializedPropertyAccessException("period");
            record = null;
        }
        editViewModel.delete(record);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CurseEditVM editViewModel_delegate$lambda$0(CurseInfoActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return (CurseEditVM) new ViewModelProvider(this$0).get(CurseEditVM.class);
    }

    private final CurseEditVM getEditViewModel() {
        return (CurseEditVM) this.editViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$3(CurseInfoActivity this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(list);
        this$0.onDataOk(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$4(CurseInfoActivity this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (bool.booleanValue()) {
            this$0.finish();
            ToastUtil.INSTANCE.showToast(c0j.common_delete_success);
            FitnessDataExtKt.getCurseApi().updateLastModify(System.currentTimeMillis() / ((long) 1000));
        } else {
            ToastUtil.INSTANCE.showToast(c0j.common_delete_failure);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onDataOk(List<WomenHealthSymptoms> d) {
        SymChartRecordInfoView symChartRecordInfoView = ((osb) getMBinding()).F;
        Record record = this.period;
        Record record2 = null;
        if (record == null) {
            Intrinsics.throwUninitializedPropertyAccessException("period");
            record = null;
        }
        long startMills = record.getStartMills();
        Record record3 = this.period;
        if (record3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("period");
            record3 = null;
        }
        symChartRecordInfoView.setData(startMills, CurseRecordKt.getInDays(record3), d);
        SymChartRecordInfoView symChartRecordInfoView2 = ((osb) getMBinding()).B;
        Record record4 = this.period;
        if (record4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("period");
            record4 = null;
        }
        long startMills2 = record4.getStartMills();
        Record record5 = this.period;
        if (record5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("period");
            record5 = null;
        }
        symChartRecordInfoView2.setData(startMills2, CurseRecordKt.getInDays(record5), d);
        SymMoodChartRecordInfoView symMoodChartRecordInfoView = ((osb) getMBinding()).G;
        Record record6 = this.period;
        if (record6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("period");
            record6 = null;
        }
        long startMills3 = record6.getStartMills();
        Record record7 = this.period;
        if (record7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("period");
        } else {
            record2 = record7;
        }
        symMoodChartRecordInfoView.setData(startMills3, CurseRecordKt.getInDays(record2), d);
    }

    private final void onDeleteClick() {
        new CommonDialog.c("curseDelete").setDialogTitle(c0j.common_delete).setDialogDescription(c0j.N5).setNegativeText(c0j.c).setPositiveText(c0j.e).setCanceledOnTouchOutside(true).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.health.curse.CurseInfoActivity.onDeleteClick.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which == -2) {
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                } else {
                    if (which != -1) {
                        return;
                    }
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                    CurseInfoActivity.this.delete();
                }
            }
        }).show(getSupportFragmentManager(), "");
    }

    private final void onUpdateClick() {
        Intent intent = new Intent(this, (Class<?>) CurseEditActivity.class);
        Record record = this.period;
        if (record == null) {
            Intrinsics.throwUninitializedPropertyAccessException("period");
            record = null;
        }
        intent.putExtra("info", record);
        startForActivityResult(intent, new Function2() { // from class: m65
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return CurseInfoActivity.onUpdateClick$lambda$2(this.f25800a, ((Integer) obj).intValue(), (Intent) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onUpdateClick$lambda$2(CurseInfoActivity this$0, int i, Intent intent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i == -1) {
            this$0.finish();
        }
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return jui.W2;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return cv1.f14763a;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@NotNull View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        int id = v.getId();
        if (id == eri.Io) {
            onUpdateClick();
        } else if (id == eri.e3) {
            onDeleteClick();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.health.curse.Hilt_CurseInfoActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitleBackground(iji.V);
        Serializable serializableExtra = getIntent().getSerializableExtra("info");
        Record record = serializableExtra instanceof Record ? (Record) serializableExtra : null;
        if (record == null) {
            finish();
            return;
        }
        this.period = record;
        setTitle(c0j.r6);
        ((CurseInfoVM) getMViewModel()).reqSymptom(record.getStartMills(), record.getEndMills());
        ((osb) getMBinding()).H.setText(getString(c0j.A7, TimeDateUtil.getDateMdFormat(record.getStartMills()), TimeDateUtil.getDateMdFormat(record.getEndMills())));
        int interval = record.getInterval() <= 0 ? CurseManager.INSTANCE.getInstance().getInterval() : record.getInterval();
        ((osb) getMBinding()).E.setText(getString(c0j.Y5, getResources().getQuantityString(qxi.G, CurseRecordKt.getInDays(record), Integer.valueOf(CurseRecordKt.getInDays(record))), getResources().getQuantityString(qxi.y, interval, Integer.valueOf(interval))));
        ((osb) getMBinding()).D.setOnClickListener(this);
        ((osb) getMBinding()).J.setOnClickListener(this);
        ((CurseInfoVM) getMViewModel()).getSymptomsEmitter().observe(this, new CurseInfoActivityKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: o65
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CurseInfoActivity.onCreate$lambda$3(this.f28783a, (List) obj);
            }
        }));
        getEditViewModel().getDeleteEmitter().observe(this, new CurseInfoActivityKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: p65
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CurseInfoActivity.onCreate$lambda$4(this.f30052a, (Boolean) obj);
            }
        }));
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
        OneTrackStatBean oneTrackStatBean = new OneTrackStatBean("c_pa_v3", "56.4.5.1.21797");
        Object[] objArr = new Object[6];
        objArr[0] = "name";
        objArr[1] = "women_health_detail_page";
        objArr[2] = "title";
        objArr[3] = "女性健康";
        objArr[4] = "data";
        objArr[5] = getIntent().getSerializableExtra("info") == null ? "0" : "1";
        oneTrackExtKt.reportData(oneTrackStatBean, objArr);
        super.onPause();
    }
}
