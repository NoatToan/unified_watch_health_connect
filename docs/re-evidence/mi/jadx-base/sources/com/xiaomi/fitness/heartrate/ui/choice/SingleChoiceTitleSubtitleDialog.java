package com.xiaomi.fitness.heartrate.ui.choice;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.dialog.a;
import com.xiaomi.fitness.heartrate.ui.choice.ChoiceItem;
import com.xiaomi.fitness.heartrate.ui.choice.SingleChoiceTitleSubtitleDialog;
import defpackage.fri;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0019\u001aB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0014J\u0014\u0010\u0011\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013J\u0010\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\bH\u0002J\u0010\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\bH\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/heartrate/ui/choice/SingleChoiceTitleSubtitleDialog;", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "Lcom/xiaomi/fitness/baseui/dialog/DialogParams;", "<init>", "()V", "mAdapter", "Lcom/xiaomi/fitness/heartrate/ui/choice/ChoiceAdapter;", "selectPosition", "", "getSelectPosition", "()I", "setSelectPosition", "(I)V", "initCustomView", "", "rootView", "Landroid/view/View;", "setItemList", "list", "", "Lcom/xiaomi/fitness/heartrate/ui/choice/ChoiceItem;", "checkedItem", "position", "onDialogDismiss", "cause", "Builder", "Companion", "heartrate_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SingleChoiceTitleSubtitleDialog extends CommonDialog<DialogParams> {

    @NotNull
    public static final String KEY_SELECT = "key_select";

    @NotNull
    private final ChoiceAdapter mAdapter = new ChoiceAdapter();
    private int selectPosition;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0000\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nB\u0013\b\u0016\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\t\u0010\rJ\u000f\u0010\u0004\u001a\u00020\u0000H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/heartrate/ui/choice/SingleChoiceTitleSubtitleDialog$Builder;", "Lcom/xiaomi/fitness/baseui/dialog/a;", "Lcom/xiaomi/fitness/baseui/dialog/DialogParams;", "Lcom/xiaomi/fitness/heartrate/ui/choice/SingleChoiceTitleSubtitleDialog;", "getThis", "()Lcom/xiaomi/fitness/heartrate/ui/choice/SingleChoiceTitleSubtitleDialog$Builder;", "internalCreate", "()Lcom/xiaomi/fitness/heartrate/ui/choice/SingleChoiceTitleSubtitleDialog;", "dialogParams", "<init>", "(Lcom/xiaomi/fitness/baseui/dialog/DialogParams;)V", "", "name", "(Ljava/lang/String;)V", "heartrate_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class Builder extends a<Builder, DialogParams, SingleChoiceTitleSubtitleDialog> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(@NotNull DialogParams dialogParams) {
            super(dialogParams);
            Intrinsics.checkNotNullParameter(dialogParams, "dialogParams");
        }

        @Override // com.xiaomi.fitness.baseui.dialog.a
        @NotNull
        public Builder getThis() {
            return this;
        }

        public Builder(@Nullable String str) {
            this(new DialogParams(str));
        }

        @Override // com.xiaomi.fitness.baseui.dialog.a
        @NotNull
        public SingleChoiceTitleSubtitleDialog internalCreate() {
            return new SingleChoiceTitleSubtitleDialog();
        }
    }

    private final void checkedItem(int position) {
        int count = this.mAdapter.getCount();
        if (count >= 0) {
            int i = 0;
            while (true) {
                ChoiceItem itemData = this.mAdapter.getItemData(i);
                if (itemData != null) {
                    itemData.setChecked(i == position);
                }
                if (i == count) {
                    break;
                } else {
                    i++;
                }
            }
        }
        this.selectPosition = position;
        this.mAdapter.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initCustomView$lambda$0(SingleChoiceTitleSubtitleDialog this$0, ChoiceItem choiceItem, int i, View itemView) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(choiceItem, "choiceItem");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this$0.checkedItem(i);
        return Unit.INSTANCE;
    }

    public final int getSelectPosition() {
        return this.selectPosition;
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog
    public void initCustomView(@NotNull View rootView) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        super.initCustomView(rootView);
        this.mAdapter.setOnItemClickListener(new Function3() { // from class: dem
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return SingleChoiceTitleSubtitleDialog.initCustomView$lambda$0(this.f15451a, (ChoiceItem) obj, ((Integer) obj2).intValue(), (View) obj3);
            }
        });
        View viewFindViewById = rootView.findViewById(fri.y);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()) { // from class: com.xiaomi.fitness.heartrate.ui.choice.SingleChoiceTitleSubtitleDialog.initCustomView.2
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
            public boolean canScrollVertically() {
                return false;
            }
        });
        recyclerView.setAdapter(this.mAdapter);
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog
    public void onDialogDismiss(int cause) {
        super.onDialogDismiss(cause);
        Bundle bundle = new Bundle();
        bundle.putInt(KEY_SELECT, this.selectPosition);
        setResultData(Integer.valueOf(cause), bundle);
    }

    public final void setItemList(@NotNull List<ChoiceItem> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.mAdapter.setDataList(list);
    }

    public final void setSelectPosition(int i) {
        this.selectPosition = i;
    }
}
