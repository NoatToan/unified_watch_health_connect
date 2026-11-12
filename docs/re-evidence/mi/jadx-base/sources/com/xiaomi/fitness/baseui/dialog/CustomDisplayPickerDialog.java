package com.xiaomi.fitness.baseui.dialog;

import com.xiaomi.fitness.baseui.widget.NumberPickerView;
import defpackage.mvi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0012\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005J\"\u0010\t\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0014J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\rH\u0014R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/baseui/dialog/CustomDisplayPickerDialog;", "Lcom/xiaomi/fitness/baseui/dialog/PickerDialog;", "<init>", "()V", "mCustomAdapter", "Lcom/xiaomi/fitness/baseui/dialog/CustomDisplayPickerDialog$CustomAdapter;", "setCustomAdapter", "", "adapter", "onPickerValueChange", "picker", "Lcom/xiaomi/fitness/baseui/widget/NumberPickerView;", "oldVal", "", "newVal", "getDisplayValue", "", "index", "CustomAdapter", "Builder", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CustomDisplayPickerDialog extends PickerDialog {

    @Nullable
    private CustomAdapter mCustomAdapter;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0000\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nB\u0013\b\u0016\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\t\u0010\rJ\u000f\u0010\u0004\u001a\u00020\u0000H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/baseui/dialog/CustomDisplayPickerDialog$Builder;", "Lcom/xiaomi/fitness/baseui/dialog/a;", "Lcom/xiaomi/fitness/baseui/dialog/PickerDialog$PickerDialogParams;", "Lcom/xiaomi/fitness/baseui/dialog/CustomDisplayPickerDialog;", "getThis", "()Lcom/xiaomi/fitness/baseui/dialog/CustomDisplayPickerDialog$Builder;", "internalCreate", "()Lcom/xiaomi/fitness/baseui/dialog/CustomDisplayPickerDialog;", "dialogParams", "<init>", "(Lcom/xiaomi/fitness/baseui/dialog/PickerDialog$PickerDialogParams;)V", "", "name", "(Ljava/lang/String;)V", "ui_release"}, k = 1, mv = {2, 0, 0})
    public static final class Builder extends a<Builder, PickerDialog.PickerDialogParams, CustomDisplayPickerDialog> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(@NotNull PickerDialog.PickerDialogParams dialogParams) {
            super(dialogParams);
            Intrinsics.checkNotNullParameter(dialogParams, "dialogParams");
        }

        @Override // com.xiaomi.fitness.baseui.dialog.a
        @NotNull
        public Builder getThis() {
            return this;
        }

        public Builder(@Nullable String str) {
            this(new PickerDialog.PickerDialogParams(str));
            setCustomLayoutId(mvi.p);
        }

        @Override // com.xiaomi.fitness.baseui.dialog.a
        @NotNull
        public CustomDisplayPickerDialog internalCreate() {
            return new CustomDisplayPickerDialog();
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/baseui/dialog/CustomDisplayPickerDialog$CustomAdapter;", "Lcom/xiaomi/fitness/baseui/dialog/PickerDialog$a;", "", "index", "", "getDisplayValue", "(I)Ljava/lang/String;", "getHintTest", "ui_release"}, k = 1, mv = {2, 0, 0})
    public interface CustomAdapter extends PickerDialog.a {

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class DefaultImpls {
            @NotNull
            public static String getDisplayValue(@NotNull CustomAdapter customAdapter, int i) {
                return String.valueOf(customAdapter.getValue(i));
            }
        }

        @Override // com.xiaomi.fitness.baseui.dialog.PickerDialog.a
        /* synthetic */ int getCount();

        @NotNull
        String getDisplayValue(int index);

        @NotNull
        String getHintTest(int index);

        @Override // com.xiaomi.fitness.baseui.dialog.PickerDialog.a
        /* synthetic */ int getValue(int i);
    }

    @Override // com.xiaomi.fitness.baseui.dialog.PickerDialog
    @Nullable
    public String getDisplayValue(int index) {
        CustomAdapter customAdapter = this.mCustomAdapter;
        if (customAdapter != null) {
            return customAdapter.getDisplayValue(index);
        }
        return null;
    }

    @Override // com.xiaomi.fitness.baseui.dialog.PickerDialog
    public void onPickerValueChange(@Nullable NumberPickerView picker, int oldVal, int newVal) {
        super.onPickerValueChange(picker, oldVal, newVal);
        CustomAdapter customAdapter = this.mCustomAdapter;
        setPickerHintText(customAdapter != null ? customAdapter.getHintTest(newVal) : null);
    }

    public final void setCustomAdapter(@NotNull CustomAdapter adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        int[] iArr = new int[adapter.getCount()];
        int count = adapter.getCount();
        for (int i = 0; i < count; i++) {
            iArr[i] = adapter.getValue(i);
        }
        getPickerDialogParam().setPickerData(iArr);
        this.mCustomAdapter = adapter;
    }
}
