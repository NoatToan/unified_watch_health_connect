package com.xiaomi.fitness.health.threetarget;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.health.threetarget.adpter.ThreeTargetSourceAdapter;
import com.xiaomi.fitness.health.threetarget.model.DataSourceModel;
import defpackage.eri;
import defpackage.jui;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/health/threetarget/ThreeTargetSourceDialog;", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "Lcom/xiaomi/fitness/baseui/dialog/DialogParams;", "itemList", "", "Lcom/xiaomi/fitness/health/threetarget/model/DataSourceModel;", "<init>", "(Ljava/util/List;)V", "initCustomView", "", "rootView", "Landroid/view/View;", "Builder", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ThreeTargetSourceDialog extends CommonDialog<DialogParams> {

    @NotNull
    private final List<DataSourceModel> itemList;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0014¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/health/threetarget/ThreeTargetSourceDialog$Builder;", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog$c;", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "Lcom/xiaomi/fitness/baseui/dialog/DialogParams;", "internalCreate", "()Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "", "Lcom/xiaomi/fitness/health/threetarget/model/DataSourceModel;", "itemList", "Ljava/util/List;", "<init>", "(Ljava/util/List;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class Builder extends CommonDialog.c {

        @NotNull
        private final List<DataSourceModel> itemList;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(@NotNull List<DataSourceModel> itemList) {
            super("source_dialog");
            Intrinsics.checkNotNullParameter(itemList, "itemList");
            this.itemList = itemList;
            setCustomLayoutId(jui.L8);
        }

        @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog.c, com.xiaomi.fitness.baseui.dialog.a
        @NotNull
        public CommonDialog<DialogParams> internalCreate() {
            return new ThreeTargetSourceDialog(this.itemList);
        }
    }

    public ThreeTargetSourceDialog(@NotNull List<DataSourceModel> itemList) {
        Intrinsics.checkNotNullParameter(itemList, "itemList");
        this.itemList = itemList;
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog
    public void initCustomView(@Nullable View rootView) {
        if (rootView != null) {
            RecyclerView recyclerView = (RecyclerView) rootView.findViewById(eri.R2);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(rootView.getContext());
            Context context = rootView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            ThreeTargetSourceAdapter threeTargetSourceAdapter = new ThreeTargetSourceAdapter(context, this.itemList);
            recyclerView.setLayoutManager(linearLayoutManager);
            recyclerView.setAdapter(threeTargetSourceAdapter);
        }
    }
}
