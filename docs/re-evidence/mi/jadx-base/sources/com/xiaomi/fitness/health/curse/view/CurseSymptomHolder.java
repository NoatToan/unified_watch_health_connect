package com.xiaomi.fitness.health.curse.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import com.xiaomi.fit.fitness.export.data.item.WomenHealthSymptoms;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.device.manager.export.bean.Feature;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.curse.CurseManager;
import com.xiaomi.fitness.health.curse.data.CurseFactorKt;
import com.xiaomi.fitness.health.curse.data.DayData;
import com.xiaomi.fitness.health.curse.view.CurseSymptomHolder;
import com.xiaomi.fitness.health.curse.vm.CurseMainVM;
import com.xiaomi.fitness.health.curse.vm.CurseSymVM;
import com.xiaomi.fitness.user.info.export.MedicalIdSPContract;
import com.xiaomi.fitness.util.HealthUtil;
import defpackage.c0j;
import defpackage.mtb;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020*\u0012\b\b\u0002\u0010,\u001a\u00020\u0002¢\u0006\u0004\b-\u0010.J'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0016\u0010\u0012\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010 R\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010&\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006/"}, d2 = {"Lcom/xiaomi/fitness/health/curse/view/CurseSymptomHolder;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", MedicalIdSPContract.PREF_BLOOD_TYPE, "mood", "pain", "", "upSymptom", "(III)V", "Lcom/xiaomi/fit/fitness/export/data/item/WomenHealthSymptoms;", Feature.FIND, "setView", "(Lcom/xiaomi/fit/fitness/export/data/item/WomenHealthSymptoms;)V", "Lcom/xiaomi/fitness/health/curse/data/DayData;", "r", "setSymptom", "(Lcom/xiaomi/fitness/health/curse/data/DayData;)V", "I", "motion", "hurt", "Landroidx/lifecycle/ViewModelStoreOwner;", "lifeCycle", "Landroidx/lifecycle/ViewModelStoreOwner;", "Lcom/xiaomi/fitness/health/curse/vm/CurseSymVM;", "viewModel$delegate", "Lkotlin/Lazy;", "getViewModel", "()Lcom/xiaomi/fitness/health/curse/vm/CurseSymVM;", "viewModel", "Lcom/xiaomi/fitness/health/curse/vm/CurseMainVM;", "activityVM$delegate", "getActivityVM", "()Lcom/xiaomi/fitness/health/curse/vm/CurseMainVM;", "activityVM", "Lmtb;", "bind", "Lmtb;", "", "curTime", "J", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attr", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class CurseSymptomHolder extends ConstraintLayout {

    /* JADX INFO: renamed from: activityVM$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy activityVM;

    @NotNull
    private mtb bind;
    private int blood;
    private long curTime;
    private int hurt;

    @NotNull
    private final ViewModelStoreOwner lifeCycle;
    private int motion;

    /* JADX INFO: renamed from: viewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CurseSymptomHolder(@NotNull Context context, @NotNull AttributeSet attr) {
        this(context, attr, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attr, "attr");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(CurseSymptomHolder this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int iMax = Math.max(this$0.bind.H.getNameWidth(), Math.max(this$0.bind.G.getNameWidth(), this$0.bind.I.getNameWidth()));
        Logger.d("CurseLatestHolder", "nameWidth = " + iMax);
        this$0.bind.I.nameView().setWidth(iMax);
        this$0.bind.H.nameView().setWidth(iMax);
        this$0.bind.G.nameView().setWidth(iMax);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$7(CurseSymptomHolder this$0, WomenHealthSymptoms womenHealthSymptoms) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(womenHealthSymptoms);
        this$0.setView(womenHealthSymptoms);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$8(CurseSymptomHolder this$0, WomenHealthSymptoms womenHealthSymptoms) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (CurseManager.INSTANCE.getInstance().isLatestIn(this$0.curTime)) {
            Logger.d("CurseSymptomHolder", "CurseSymptomHolder: is latest in");
            this$0.getActivityVM().getLatestSymObserver().setValue(womenHealthSymptoms);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CurseMainVM activityVM_delegate$lambda$1(CurseSymptomHolder this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return (CurseMainVM) new ViewModelProvider(this$0.lifeCycle).get(CurseMainVM.class);
    }

    private final CurseMainVM getActivityVM() {
        return (CurseMainVM) this.activityVM.getValue();
    }

    private final CurseSymVM getViewModel() {
        return (CurseSymVM) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$6$lambda$3(CurseSymptomHolder this$0, RadioGroup radioGroup, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int value = CurseFactorKt.getValue(i);
        this$0.hurt = value;
        this$0.upSymptom(this$0.blood, this$0.motion, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$6$lambda$4(CurseSymptomHolder this$0, RadioGroup radioGroup, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int value = CurseFactorKt.getValue(i);
        this$0.blood = value;
        this$0.upSymptom(value, this$0.motion, this$0.hurt);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$6$lambda$5(CurseSymptomHolder this$0, RadioGroup radioGroup, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int value = CurseFactorKt.getValue(i);
        this$0.motion = value;
        this$0.upSymptom(this$0.blood, value, this$0.hurt);
    }

    private final void setView(WomenHealthSymptoms find) {
        mtb mtbVar = this.bind;
        mtbVar.H.check(find.getPain());
        mtbVar.G.check(find.getHp());
        mtbVar.I.check(find.getMood());
        Integer hp = find.getHp();
        this.blood = hp != null ? hp.intValue() : -1;
        Integer mood = find.getMood();
        this.motion = mood != null ? mood.intValue() : -1;
        Integer pain = find.getPain();
        this.hurt = pain != null ? pain.intValue() : -1;
    }

    private final void upSymptom(int blood, int mood, int pain) {
        getViewModel().uploadSymptom(this.curTime, blood, mood, pain);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CurseSymVM viewModel_delegate$lambda$0(CurseSymptomHolder this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return (CurseSymVM) new ViewModelProvider(this$0.lifeCycle).get(CurseSymVM.class);
    }

    public final void setSymptom(@NotNull DayData r2) {
        Intrinsics.checkNotNullParameter(r2, "r");
        Logger.i("CurseSymptomHolder", "setSymptom: record = " + r2 + ", curTime = " + this.curTime);
        if (!r2.isIn() || r2.getTime() > System.currentTimeMillis()) {
            this.curTime = r2.getTime();
            ViewExtKt.gone(this);
        } else {
            this.curTime = r2.getTime();
            ViewExtKt.visible(this);
            getViewModel().reqSymptom(this.curTime);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public CurseSymptomHolder(@NotNull Context context, @NotNull AttributeSet attr, int i) {
        String string;
        super(context, attr, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attr, "attr");
        this.blood = -1;
        this.motion = -1;
        this.hurt = -1;
        this.lifeCycle = (ViewModelStoreOwner) context;
        this.viewModel = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: jc5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CurseSymptomHolder.viewModel_delegate$lambda$0(this.f22643a);
            }
        });
        this.activityVM = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: kc5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CurseSymptomHolder.activityVM_delegate$lambda$1(this.f23708a);
            }
        });
        mtb mtbVarA0 = mtb.A0(ExtUtilsKt.getInflater(context), this, true);
        Intrinsics.checkNotNullExpressionValue(mtbVarA0, "inflate(...)");
        this.bind = mtbVarA0;
        post(new Runnable() { // from class: lc5
            @Override // java.lang.Runnable
            public final void run() {
                CurseSymptomHolder._init_$lambda$2(this.f24893a);
            }
        });
        mtb mtbVar = this.bind;
        TextView textView = mtbVar.E;
        if (HealthUtil.isFemale()) {
            string = ResourceExtKt.getString(c0j.v6);
        } else {
            string = context.getString(c0j.V5);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        }
        textView.setText(string);
        mtbVar.H.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: mc5
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i2) {
                CurseSymptomHolder.lambda$6$lambda$3(this.f26001a, radioGroup, i2);
            }
        });
        mtbVar.G.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: nc5
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i2) {
                CurseSymptomHolder.lambda$6$lambda$4(this.f27770a, radioGroup, i2);
            }
        });
        mtbVar.I.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: oc5
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i2) {
                CurseSymptomHolder.lambda$6$lambda$5(this.f28990a, radioGroup, i2);
            }
        });
        LifecycleOwner lifecycleOwner = (LifecycleOwner) context;
        getViewModel().getDayDataEmitter().observe(lifecycleOwner, new CurseSymptomHolderKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: pc5
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CurseSymptomHolder._init_$lambda$7(this.f30231a, (WomenHealthSymptoms) obj);
            }
        }));
        getViewModel().getUploadEmitter().observe(lifecycleOwner, new CurseSymptomHolderKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: qc5
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CurseSymptomHolder._init_$lambda$8(this.f31356a, (WomenHealthSymptoms) obj);
            }
        }));
    }

    public /* synthetic */ CurseSymptomHolder(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
