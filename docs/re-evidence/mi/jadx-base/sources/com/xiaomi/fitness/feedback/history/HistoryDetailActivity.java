package com.xiaomi.fitness.feedback.history;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.View;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.feedback.history.HistoryDetailActivity;
import defpackage.a0j;
import defpackage.bv1;
import defpackage.hi9;
import defpackage.hui;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u0000 \u000f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/feedback/history/HistoryDetailActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/feedback/history/HistoryDetailViewModel;", "Lhi9;", "", "bindView", "(Lhi9;)V", "", "getViewModelId", "()I", "viewModelId", "getLayoutId", "layoutId", "<init>", "()V", "Companion", "feedback_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class HistoryDetailActivity extends Hilt_HistoryDetailActivity<HistoryDetailViewModel, hi9> {

    @NotNull
    public static final String KEY_DETAIL = "key_detail";

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$0(HistoryDetailActivity this$0, HistoryDetail historyDetail, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((ClipboardManager) this$0.getSystemService(ClipboardManager.class)).setPrimaryClip(ClipData.newPlainText("num", String.valueOf(historyDetail != null ? Integer.valueOf(historyDetail.getFeedbackId()) : null)));
        ToastExtKt.toastShort(this$0, a0j.l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull hi9 hi9Var) {
        Intrinsics.checkNotNullParameter(hi9Var, "<this>");
        setTitle(a0j.t);
        final HistoryDetail historyDetail = (HistoryDetail) getIntent().getParcelableExtra(KEY_DETAIL);
        hi9Var.q0(bv1.f4631b, historyDetail);
        hi9Var.B.setOnClickListener(new View.OnClickListener() { // from class: j8c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HistoryDetailActivity.bindView$lambda$0(this.f22522a, historyDetail, view);
            }
        });
        ((HistoryDetailViewModel) getMViewModel()).showContent(historyDetail);
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return hui.c;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return bv1.e;
    }
}
