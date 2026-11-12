package com.xiaomi.fitness.health.curse.view;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import com.xiaomi.fit.fitness.export.data.aggregation.CurseRecordKt;
import com.xiaomi.fit.fitness.export.data.aggregation.Record;
import com.xiaomi.fit.fitness.export.data.item.WomenHealthSymptoms;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.curse.CurseHistoryActivity;
import com.xiaomi.fitness.health.curse.CurseMainActivity;
import com.xiaomi.fitness.health.curse.data.CurseExtKt;
import com.xiaomi.fitness.health.curse.view.CurseLatestHolder;
import com.xiaomi.fitness.health.curse.vm.CurseLatestVM;
import com.xiaomi.fitness.health.curse.vm.CurseMainVM;
import com.xiaomi.fitness.health.curse.vm.HistoryRet;
import defpackage.c0j;
import defpackage.qxi;
import defpackage.ssb;
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
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001b\u0010\u000e\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/health/curse/view/CurseLatestHolder;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "onMoreClick", "()V", "onDataChange", "Lssb;", "bind", "Lssb;", "Lcom/xiaomi/fitness/health/curse/vm/CurseLatestVM;", "viewModel$delegate", "Lkotlin/Lazy;", "getViewModel", "()Lcom/xiaomi/fitness/health/curse/vm/CurseLatestVM;", "viewModel", "Lcom/xiaomi/fitness/health/curse/vm/CurseMainVM;", "mainVM$delegate", "getMainVM", "()Lcom/xiaomi/fitness/health/curse/vm/CurseMainVM;", "mainVM", "", "nameWidth", "I", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attr", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class CurseLatestHolder extends ConstraintLayout {

    @NotNull
    private final ssb bind;

    /* JADX INFO: renamed from: mainVM$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mainVM;
    private int nameWidth;

    /* JADX INFO: renamed from: viewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CurseLatestHolder(@NotNull Context context, @NotNull AttributeSet attr) {
        this(context, attr, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attr, "attr");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(CurseLatestHolder this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int iMax = Math.max(this$0.bind.C.getNameWidth(), Math.max(this$0.bind.D.getNameWidth(), this$0.bind.B.getNameWidth()));
        this$0.nameWidth = iMax;
        Logger.d("CurseLatestHolder", "nameWidth = " + iMax);
        this$0.bind.C.getNameView().setWidth(this$0.nameWidth);
        this$0.bind.B.getNameView().setWidth(this$0.nameWidth);
        this$0.bind.D.getNameView().setWidth(this$0.nameWidth);
        this$0.getViewModel().getLatestRecord();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$3(CurseLatestHolder this$0, WomenHealthSymptoms womenHealthSymptoms) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getViewModel().getLatestRecord();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$5(final CurseLatestHolder this$0, HistoryRet historyRet) {
        String string;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Record period = historyRet.getPeriod();
        int inDays = period != null ? CurseRecordKt.getInDays(period) : 0;
        long startMills = period != null ? period.getStartMills() : 0L;
        int i = inDays;
        this$0.bind.C.setData(startMills, i, historyRet.getSymptoms(), this$0.nameWidth);
        this$0.bind.B.setData(startMills, i, historyRet.getSymptoms(), this$0.nameWidth);
        this$0.bind.D.setData(startMills, i, historyRet.getSymptoms(), this$0.nameWidth);
        this$0.bind.F.setOnClickListener(new View.OnClickListener() { // from class: w65
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CurseLatestHolder.lambda$5$lambda$4(this.f37651a, view);
            }
        });
        ssb ssbVar = this$0.bind;
        TextView textView = ssbVar.H;
        if (period == null) {
            ImageView moreView = ssbVar.G;
            Intrinsics.checkNotNullExpressionValue(moreView, "moreView");
            ViewExtKt.gone(moreView);
            string = ResourceExtKt.getString(c0j.p6);
        } else if (period.getEndMills() > CurseExtKt.getTodayZeroMills()) {
            ImageView moreView2 = this$0.bind.G;
            Intrinsics.checkNotNullExpressionValue(moreView2, "moreView");
            ViewExtKt.visible(moreView2);
            string = ResourceExtKt.getString(c0j.z6, TimeDateUtil.getDateMdFormat(period.getStartMills()));
        } else {
            ImageView moreView3 = this$0.bind.G;
            Intrinsics.checkNotNullExpressionValue(moreView3, "moreView");
            ViewExtKt.visible(moreView3);
            string = CurseExtKt.getDateRangeStr(startMills, period.getEndMills()) + " " + this$0.getResources().getQuantityString(qxi.E, inDays, Integer.valueOf(inDays));
        }
        textView.setText(string);
        return Unit.INSTANCE;
    }

    private final CurseMainVM getMainVM() {
        return (CurseMainVM) this.mainVM.getValue();
    }

    private final CurseLatestVM getViewModel() {
        return (CurseLatestVM) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$5$lambda$4(CurseLatestHolder this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onMoreClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CurseMainVM mainVM_delegate$lambda$1(Context context) {
        Intrinsics.checkNotNullParameter(context, "$context");
        return (CurseMainVM) new ViewModelProvider((CurseMainActivity) context).get(CurseMainVM.class);
    }

    private final void onMoreClick() {
        getContext().startActivity(new Intent(getContext(), (Class<?>) CurseHistoryActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CurseLatestVM viewModel_delegate$lambda$0(Context context) {
        Intrinsics.checkNotNullParameter(context, "$context");
        return (CurseLatestVM) new ViewModelProvider((CurseMainActivity) context).get(CurseLatestVM.class);
    }

    public final void onDataChange() {
        getViewModel().getLatestRecord();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public CurseLatestHolder(@NotNull final Context context, @NotNull AttributeSet attr, int i) {
        super(context, attr, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attr, "attr");
        ssb ssbVarA0 = ssb.A0(ExtUtilsKt.getInflater(context), this, true);
        Intrinsics.checkNotNullExpressionValue(ssbVarA0, "inflate(...)");
        this.bind = ssbVarA0;
        this.viewModel = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: x65
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CurseLatestHolder.viewModel_delegate$lambda$0(context);
            }
        });
        this.mainVM = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: y65
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CurseLatestHolder.mainVM_delegate$lambda$1(context);
            }
        });
        post(new Runnable() { // from class: z65
            @Override // java.lang.Runnable
            public final void run() {
                CurseLatestHolder._init_$lambda$2(this.f40938a);
            }
        });
        LifecycleOwner lifecycleOwner = (LifecycleOwner) context;
        getMainVM().getLatestSymObserver().observe(lifecycleOwner, new CurseLatestHolder$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: a75
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CurseLatestHolder._init_$lambda$3(this.f702a, (WomenHealthSymptoms) obj);
            }
        }));
        getViewModel().getRecordEmitter().observe(lifecycleOwner, new CurseLatestHolder$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: b75
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return CurseLatestHolder._init_$lambda$5(this.f3877a, (HistoryRet) obj);
            }
        }));
    }

    public /* synthetic */ CurseLatestHolder(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
