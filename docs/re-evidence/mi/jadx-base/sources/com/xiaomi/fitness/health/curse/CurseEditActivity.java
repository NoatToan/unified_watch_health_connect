package com.xiaomi.fitness.health.curse;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.Observer;
import com.xiaomi.fit.fitness.export.data.aggregation.Record;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.health.curse.CurseEditActivity;
import com.xiaomi.fitness.health.curse.data.CurseExtKt;
import com.xiaomi.fitness.health.curse.view.CurseSetItemView;
import com.xiaomi.fitness.health.curse.vm.CurseEditVM;
import com.xiaomi.fitness.util.ExtUtilKt;
import defpackage.c0j;
import defpackage.cv1;
import defpackage.eri;
import defpackage.iji;
import defpackage.jui;
import defpackage.msb;
import defpackage.zp5;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import miuix.pickerwidget.widget.DatePicker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0007¢\u0006\u0004\b*\u0010\u0007J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u0016\u0010 \u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0016\u0010!\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001eR\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010\u001b\u001a\u0004\b&\u0010'R\u001a\u0010(\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010\u001b\u001a\u0004\b)\u0010'¨\u0006+"}, d2 = {"Lcom/xiaomi/fitness/health/curse/CurseEditActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/health/curse/vm/CurseEditVM;", "Lmsb;", "Landroid/view/View$OnClickListener;", "", "onSaveClick", "()V", "saveRecord", "", "isStart", "selectDate", "(Z)V", "", "mills", "setValue", "(ZJ)V", "Landroid/view/View;", "v", "onClick", "(Landroid/view/View;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "", "cycle", "I", "id", "oriStartDate", "J", "oriEndDate", "finalStart", "finalEnd", "Lcom/xiaomi/fit/fitness/export/data/aggregation/CurseRecord;", "preRecord", "Lcom/xiaomi/fit/fitness/export/data/aggregation/CurseRecord;", "layoutId", "getLayoutId", "()I", "viewModelId", "getViewModelId", "<init>", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nCurseEditActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CurseEditActivity.kt\ncom/xiaomi/fitness/health/curse/CurseEditActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,137:1\n1#2:138\n*E\n"})
public final class CurseEditActivity extends Hilt_CurseEditActivity<CurseEditVM, msb> implements View.OnClickListener {
    private int cycle = CurseManager.INSTANCE.getInstance().getInterval();
    private long finalEnd;
    private long finalStart;
    private int id;
    private final int layoutId;
    private long oriEndDate;
    private long oriStartDate;

    @Nullable
    private Record preRecord;
    private final int viewModelId;

    public CurseEditActivity() {
        long todayZeroMills = CurseExtKt.getTodayZeroMills();
        this.oriStartDate = todayZeroMills;
        this.oriEndDate = todayZeroMills;
        this.finalStart = todayZeroMills;
        this.finalEnd = todayZeroMills;
        this.layoutId = jui.V2;
        this.viewModelId = cv1.f14763a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$5(CurseEditActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.selectDate(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$6(CurseEditActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.selectDate(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$7(CurseEditActivity this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismissDialog();
        if (!bool.booleanValue()) {
            ToastExtKt.toast$default(this$0, c0j.common_save_fail, 0, 0, 0L, 14, null);
            return;
        }
        ToastExtKt.toast$default(this$0, c0j.common_save_success, 0, 0, 0L, 14, null);
        this$0.setResult(-1);
        this$0.finish();
    }

    private final void onSaveClick() {
        Logger.d("CurseEditPage", "onSaveClick:  oriStart = " + this.oriStartDate + ", oriEnd = " + this.oriEndDate + ", finalStart = " + this.finalStart + ", finalEnd = " + this.finalEnd);
        long j = this.finalEnd;
        long j2 = this.finalStart;
        if (j < j2) {
            ToastExtKt.toast$default(this, c0j.y6, 0, 0, 0L, 14, null);
            return;
        }
        if (this.preRecord == null || j2 != this.oriStartDate || j != this.oriEndDate) {
            saveRecord();
        } else {
            Logger.d("CurseEditPage", "onSaveClick: no change");
            finish();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void saveRecord() {
        PageState.DefaultImpls.showLoading$default(this, null, 0, false, 3, null);
        Record record = this.preRecord;
        VM mViewModel = getMViewModel();
        if (record != null) {
            ((CurseEditVM) mViewModel).updateFromEditAct(this.finalStart, this.finalEnd, record);
        } else {
            ((CurseEditVM) mViewModel).addFromEditAct(this.finalStart, this.finalEnd);
        }
    }

    private final void selectDate(final boolean isStart) {
        LocalDate localDate = new LocalDate(isStart ? this.finalStart : this.finalEnd);
        zp5 zp5Var = new zp5(this, new zp5.d() { // from class: b65
            @Override // zp5.d
            public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                CurseEditActivity.selectDate$lambda$2(this.f3846a, isStart, datePicker, i, i2, i3);
            }
        }, localDate.getYear(), localDate.getMonthOfYear() - 1, localDate.getDayOfMonth());
        zp5Var.K(false);
        DatePicker datePickerH = zp5Var.H();
        zp5Var.setTitle(isStart ? c0j.ql : c0j.W7);
        datePickerH.setMinDate(1546272000000L);
        datePickerH.setMaxDate(CurseExtKt.getTodayZeroMills());
        zp5Var.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void selectDate$lambda$2(CurseEditActivity this$0, boolean z, DatePicker datePicker, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setValue(z, ExtUtilKt.getZeroMills(new LocalDate(i, i2 + 1, i3)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setValue(boolean isStart, long mills) {
        String dateYYYYMMddLocalFormat = TimeDateUtil.getDateYYYYMMddLocalFormat(mills);
        if (isStart) {
            this.finalStart = mills;
            ((msb) getMBinding()).F.setTitle(dateYYYYMMddLocalFormat);
        } else {
            this.finalEnd = mills;
            ((msb) getMBinding()).B.setTitle(dateYYYYMMddLocalFormat);
        }
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return this.layoutId;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return this.viewModelId;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@NotNull View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        int id = v.getId();
        if (id == eri.o1) {
            finish();
        } else if (id == eri.Je) {
            onSaveClick();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.health.curse.Hilt_CurseEditActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitleBackground(iji.E0);
        Intent intent = getIntent();
        Serializable serializableExtra = intent != null ? intent.getSerializableExtra("info") : null;
        Record record = serializableExtra instanceof Record ? (Record) serializableExtra : null;
        this.preRecord = record;
        Logger.d("CurseEditPage", "initView: period = " + record);
        Record record2 = this.preRecord;
        if (record2 != null) {
            this.oriStartDate = record2.getStartMills();
            long endMills = record2.getEndMills();
            this.oriEndDate = endMills;
            this.finalStart = this.oriStartDate;
            this.finalEnd = endMills;
            setTitle(c0j.C6);
        } else {
            setTitle(c0j.D5);
        }
        ((msb) getMBinding()).D.setOnClickListener(this);
        ((msb) getMBinding()).A.setOnClickListener(this);
        ((msb) getMBinding()).G.setOnClickListener(this);
        ((msb) getMBinding()).F.addClick(new Function0() { // from class: y55
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CurseEditActivity.onCreate$lambda$5(this.f39802a);
            }
        });
        ((msb) getMBinding()).B.addClick(new Function0() { // from class: z55
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CurseEditActivity.onCreate$lambda$6(this.f40894a);
            }
        });
        CurseSetItemView curseSetItemView = ((msb) getMBinding()).F;
        String string = getString(c0j.t6);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        CurseSetItemView.setData$default(curseSetItemView, string, TimeDateUtil.getDateYYYYMMddLocalFormat(this.oriStartDate), null, false, 12, null);
        CurseSetItemView curseSetItemView2 = ((msb) getMBinding()).B;
        String string2 = getString(c0j.Q5);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        CurseSetItemView.setData$default(curseSetItemView2, string2, TimeDateUtil.getDateYYYYMMddLocalFormat(this.oriEndDate), null, false, 12, null);
        ((CurseEditVM) getMViewModel()).getRetObserver().observe(this, new Observer() { // from class: a65
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                CurseEditActivity.onCreate$lambda$7(this.f677a, (Boolean) obj);
            }
        });
        ((msb) getMBinding()).C.setOnClickListener(this);
        ((msb) getMBinding()).E.setOnClickListener(this);
        ((msb) getMBinding()).H.setOnClickListener(this);
    }
}
