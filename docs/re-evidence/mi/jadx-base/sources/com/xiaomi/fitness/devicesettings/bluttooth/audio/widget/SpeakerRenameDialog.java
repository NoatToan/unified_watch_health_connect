package com.xiaomi.fitness.devicesettings.bluttooth.audio.widget;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.CheckBox;
import android.widget.EditText;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.dialog.a;
import com.xiaomi.fitness.baseui.utils.InputFilter;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.devicesettings.bluttooth.audio.widget.SpeakerRenameDialog;
import defpackage.eui;
import defpackage.we6;
import defpackage.wzi;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001a\u001b\u0019B\u0007¢\u0006\u0004\b\u0018\u0010\u0012J\u0019\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/widget/SpeakerRenameDialog;", "Lcom/xiaomi/fitness/baseui/dialog/CommonDialog;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/widget/SpeakerRenameDialog$RenameDialogParams;", "Landroid/view/View;", "rootView", "", "initCustomView", "(Landroid/view/View;)V", "", "isRename", "setShowRename", "(Z)V", "", "getNameText", "()Ljava/lang/String;", "isReplaceAll", "()Z", LifecycleConstantKt.ON_RESUME, "()V", "Lwe6;", "mBinging", "Lwe6;", "isShowRename", "Z", "<init>", "Companion", "Builder", "RenameDialogParams", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SpeakerRenameDialog extends CommonDialog<RenameDialogParams> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private boolean isShowRename;
    private we6 mBinging;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0004\u001a\u00020\u0000H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/widget/SpeakerRenameDialog$Builder;", "Lcom/xiaomi/fitness/baseui/dialog/a;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/widget/SpeakerRenameDialog$RenameDialogParams;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/widget/SpeakerRenameDialog;", "getThis", "()Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/widget/SpeakerRenameDialog$Builder;", "internalCreate", "()Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/widget/SpeakerRenameDialog;", "", "name", "setSpeakerName", "(Ljava/lang/String;)Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/widget/SpeakerRenameDialog$Builder;", "<init>", "(Ljava/lang/String;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class Builder extends a<Builder, RenameDialogParams, SpeakerRenameDialog> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Builder(@NotNull String name) {
            super(new RenameDialogParams(name, null, 2, 0 == true ? 1 : 0));
            Intrinsics.checkNotNullParameter(name, "name");
        }

        @Override // com.xiaomi.fitness.baseui.dialog.a
        @NotNull
        public Builder getThis() {
            return this;
        }

        @NotNull
        public final Builder setSpeakerName(@Nullable String name) {
            requireDialogParams().setSpeakerName(name);
            return this;
        }

        @Override // com.xiaomi.fitness.baseui.dialog.a
        @NotNull
        public SpeakerRenameDialog internalCreate() {
            return new SpeakerRenameDialog();
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/widget/SpeakerRenameDialog$Companion;", "", "<init>", "()V", "defaultBuilder", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/widget/SpeakerRenameDialog$Builder;", "name", "", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Builder defaultBuilder(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            Builder cancelable = new Builder(name).setCustomLayoutId(eui.B).setCanceledOnTouchOutside(true).setCancelable(true);
            Intrinsics.checkNotNullExpressionValue(cancelable, "setCancelable(...)");
            return cancelable;
        }
    }

    @Parcelize
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\b\"\u0004\b\n\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/widget/SpeakerRenameDialog$RenameDialogParams;", "Lcom/xiaomi/fitness/baseui/dialog/DialogParams;", "name", "", "speakerName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getSpeakerName", "setSpeakerName", "(Ljava/lang/String;)V", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RenameDialogParams extends DialogParams {

        @NotNull
        public static final Parcelable.Creator<RenameDialogParams> CREATOR = new Creator();

        @NotNull
        private final String name;

        @Nullable
        private String speakerName;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<RenameDialogParams> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RenameDialogParams createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RenameDialogParams(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RenameDialogParams[] newArray(int i) {
                return new RenameDialogParams[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RenameDialogParams(@NotNull String name, @Nullable String str) {
            super(name);
            Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
            this.speakerName = str;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        @Nullable
        public final String getSpeakerName() {
            return this.speakerName;
        }

        public final void setSpeakerName(@Nullable String str) {
            this.speakerName = str;
        }

        @Override // com.xiaomi.fitness.baseui.dialog.DialogParams, android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.name);
            dest.writeString(this.speakerName);
        }

        public /* synthetic */ RenameDialogParams(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onResume$lambda$2$lambda$1(EditText this_apply) {
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        Context context = this_apply.getContext();
        Object systemService = context != null ? context.getSystemService("input_method") : null;
        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(this_apply, 0);
        }
    }

    @NotNull
    public final String getNameText() {
        we6 we6Var = this.mBinging;
        if (we6Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinging");
            we6Var = null;
        }
        return we6Var.A.getText().toString();
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog
    public void initCustomView(@Nullable View rootView) {
        super.initCustomView(rootView);
        if (rootView == null) {
            return;
        }
        we6 we6VarA0 = we6.A0(rootView);
        this.mBinging = we6VarA0;
        we6 we6Var = null;
        if (we6VarA0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinging");
            we6VarA0 = null;
        }
        EditText editText = we6VarA0.A;
        InputFilter inputFilter = InputFilter.INSTANCE;
        Intrinsics.checkNotNull(editText);
        inputFilter.lengthFilter_2(editText, this.isShowRename ? 20 : 40, getString(wzi.o0));
        editText.setText(getDialogParams().getSpeakerName());
        we6 we6Var2 = this.mBinging;
        if (we6Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinging");
        } else {
            we6Var = we6Var2;
        }
        CheckBox replaceAll = we6Var.B;
        Intrinsics.checkNotNullExpressionValue(replaceAll, "replaceAll");
        ExtUtilsKt.setVisible(replaceAll, this.isShowRename);
    }

    public final boolean isReplaceAll() {
        we6 we6Var = this.mBinging;
        if (we6Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinging");
            we6Var = null;
        }
        return we6Var.B.isChecked();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        we6 we6Var = this.mBinging;
        if (we6Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinging");
            we6Var = null;
        }
        final EditText editText = we6Var.A;
        editText.requestFocus();
        editText.postDelayed(new Runnable() { // from class: k5n
            @Override // java.lang.Runnable
            public final void run() {
                SpeakerRenameDialog.onResume$lambda$2$lambda$1(editText);
            }
        }, 100L);
    }

    public final void setShowRename(boolean isRename) {
        this.isShowRename = isRename;
    }
}
