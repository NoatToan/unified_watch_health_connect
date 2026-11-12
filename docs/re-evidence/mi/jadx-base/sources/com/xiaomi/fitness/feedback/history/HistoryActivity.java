package com.xiaomi.fitness.feedback.history;

import android.content.Intent;
import android.view.View;
import com.xiaomi.fitness.baseui.extension.LaunchExtensionKt;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.NetworkExtKt;
import com.xiaomi.fitness.feedback.history.HistoryActivity;
import com.xiaomi.fitness.feedback.history.HistoryDetail;
import defpackage.a0j;
import defpackage.bv1;
import defpackage.fi9;
import defpackage.hui;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\bJ\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/feedback/history/HistoryActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/feedback/history/HistoryViewModel;", "Lfi9;", "", "bindView", "(Lfi9;)V", LifecycleConstantKt.ON_DESTROY, "()V", "", "getViewModelId", "()I", "viewModelId", "getLayoutId", "layoutId", "<init>", "feedback_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class HistoryActivity extends Hilt_HistoryActivity<HistoryViewModel, fi9> {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$1(HistoryActivity this$0, final HistoryDetail historyItem, int i, View itemView) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(historyItem, "historyItem");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        LaunchExtensionKt.startActivity(this$0, (Class<?>) HistoryDetailActivity.class, (Function1<? super Intent, Unit>) new Function1() { // from class: f8c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HistoryActivity.bindView$lambda$1$lambda$0(historyItem, (Intent) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$1$lambda$0(HistoryDetail historyItem, Intent it) {
        Intrinsics.checkNotNullParameter(historyItem, "$historyItem");
        Intrinsics.checkNotNullParameter(it, "it");
        it.putExtra(HistoryDetailActivity.KEY_DETAIL, historyItem);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$2(HistoryActivity this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (bool.booleanValue()) {
            PageState.DefaultImpls.showEmpty$default(this$0, a0j.v, 0, 2, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull fi9 fi9Var) {
        Intrinsics.checkNotNullParameter(fi9Var, "<this>");
        setTitle(a0j.z);
        ((HistoryViewModel) getMViewModel()).getAdapter().setOnItemClickListener(new Function3() { // from class: g8c
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return HistoryActivity.bindView$lambda$1(this.f18716a, (HistoryDetail) obj, ((Integer) obj2).intValue(), (View) obj3);
            }
        });
        if (!NetworkExtKt.isNetworkAvailable()) {
            showNoNetwork();
        }
        ((HistoryViewModel) getMViewModel()).isEmpty$feedback_chinaProductRelease().observe(this, new HistoryActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: h8c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HistoryActivity.bindView$lambda$2(this.f19801a, (Boolean) obj);
            }
        }));
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return hui.f20476b;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return bv1.e;
    }

    @Override // com.xiaomi.fitness.feedback.history.Hilt_HistoryActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }
}
