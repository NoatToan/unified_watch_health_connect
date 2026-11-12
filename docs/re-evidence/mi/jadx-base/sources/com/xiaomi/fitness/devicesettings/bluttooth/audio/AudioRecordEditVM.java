package com.xiaomi.fitness.devicesettings.bluttooth.audio;

import android.os.Bundle;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.devicesettings.bluttooth.audio.widget.CustomEditText;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import com.xiaomi.fitness.statistics.StatConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u000e\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioRecordEditVM;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "oldContent", "", "getOldContent", "()Ljava/lang/String;", "setOldContent", "(Ljava/lang/String;)V", "attach", "", "savedInstanceState", "Landroid/os/Bundle;", "EditAction", "OperationAction", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AudioRecordEditVM extends AbsViewModel {

    @NotNull
    private String oldContent = "";

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J1\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000b\"\u0004\b\u0014\u0010\u0012¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioRecordEditVM$EditAction;", "", "index", "", MiuiCursorConstants.CONTENT, "", "cursorStart", "cursorEnd", "<init>", "(ILjava/lang/CharSequence;II)V", "getIndex", "()I", "getContent", "()Ljava/lang/CharSequence;", "setContent", "(Ljava/lang/CharSequence;)V", "getCursorStart", "setCursorStart", "(I)V", "getCursorEnd", "setCursorEnd", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class EditAction {

        @NotNull
        private CharSequence content;
        private int cursorEnd;
        private int cursorStart;
        private final int index;

        public EditAction(int i, @NotNull CharSequence content, int i2, int i3) {
            Intrinsics.checkNotNullParameter(content, "content");
            this.index = i;
            this.content = content;
            this.cursorStart = i2;
            this.cursorEnd = i3;
        }

        public static /* synthetic */ EditAction copy$default(EditAction editAction, int i, CharSequence charSequence, int i2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i = editAction.index;
            }
            if ((i4 & 2) != 0) {
                charSequence = editAction.content;
            }
            if ((i4 & 4) != 0) {
                i2 = editAction.cursorStart;
            }
            if ((i4 & 8) != 0) {
                i3 = editAction.cursorEnd;
            }
            return editAction.copy(i, charSequence, i2, i3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final CharSequence getContent() {
            return this.content;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getCursorStart() {
            return this.cursorStart;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final int getCursorEnd() {
            return this.cursorEnd;
        }

        @NotNull
        public final EditAction copy(int index, @NotNull CharSequence content, int cursorStart, int cursorEnd) {
            Intrinsics.checkNotNullParameter(content, "content");
            return new EditAction(index, content, cursorStart, cursorEnd);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EditAction)) {
                return false;
            }
            EditAction editAction = (EditAction) other;
            return this.index == editAction.index && Intrinsics.areEqual(this.content, editAction.content) && this.cursorStart == editAction.cursorStart && this.cursorEnd == editAction.cursorEnd;
        }

        @NotNull
        public final CharSequence getContent() {
            return this.content;
        }

        public final int getCursorEnd() {
            return this.cursorEnd;
        }

        public final int getCursorStart() {
            return this.cursorStart;
        }

        public final int getIndex() {
            return this.index;
        }

        public int hashCode() {
            return (((((Integer.hashCode(this.index) * 31) + this.content.hashCode()) * 31) + Integer.hashCode(this.cursorStart)) * 31) + Integer.hashCode(this.cursorEnd);
        }

        public final void setContent(@NotNull CharSequence charSequence) {
            Intrinsics.checkNotNullParameter(charSequence, "<set-?>");
            this.content = charSequence;
        }

        public final void setCursorEnd(int i) {
            this.cursorEnd = i;
        }

        public final void setCursorStart(int i) {
            this.cursorStart = i;
        }

        @NotNull
        public String toString() {
            int i = this.index;
            CharSequence charSequence = this.content;
            return "EditAction(index=" + i + ", content=" + ((Object) charSequence) + ", cursorStart=" + this.cursorStart + ", cursorEnd=" + this.cursorEnd + ")";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioRecordEditVM$OperationAction;", "", "index", "", StatConstants.PARAM_START, StatConstants.PARAM_END, MiuiCursorConstants.CONTENT, "", "editText", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/widget/CustomEditText;", "<init>", "(IIILjava/lang/String;Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/widget/CustomEditText;)V", "getIndex", "()I", "getStart", "getEnd", "getContent", "()Ljava/lang/String;", "getEditText", "()Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/widget/CustomEditText;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OperationAction {

        @NotNull
        private final String content;

        @NotNull
        private final CustomEditText editText;
        private final int end;
        private final int index;
        private final int start;

        public OperationAction(int i, int i2, int i3, @NotNull String content, @NotNull CustomEditText editText) {
            Intrinsics.checkNotNullParameter(content, "content");
            Intrinsics.checkNotNullParameter(editText, "editText");
            this.index = i;
            this.start = i2;
            this.end = i3;
            this.content = content;
            this.editText = editText;
        }

        public static /* synthetic */ OperationAction copy$default(OperationAction operationAction, int i, int i2, int i3, String str, CustomEditText customEditText, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i = operationAction.index;
            }
            if ((i4 & 2) != 0) {
                i2 = operationAction.start;
            }
            int i5 = i2;
            if ((i4 & 4) != 0) {
                i3 = operationAction.end;
            }
            int i6 = i3;
            if ((i4 & 8) != 0) {
                str = operationAction.content;
            }
            String str2 = str;
            if ((i4 & 16) != 0) {
                customEditText = operationAction.editText;
            }
            return operationAction.copy(i, i5, i6, str2, customEditText);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getStart() {
            return this.start;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getEnd() {
            return this.end;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getContent() {
            return this.content;
        }

        @NotNull
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final CustomEditText getEditText() {
            return this.editText;
        }

        @NotNull
        public final OperationAction copy(int index, int start, int end, @NotNull String content, @NotNull CustomEditText editText) {
            Intrinsics.checkNotNullParameter(content, "content");
            Intrinsics.checkNotNullParameter(editText, "editText");
            return new OperationAction(index, start, end, content, editText);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OperationAction)) {
                return false;
            }
            OperationAction operationAction = (OperationAction) other;
            return this.index == operationAction.index && this.start == operationAction.start && this.end == operationAction.end && Intrinsics.areEqual(this.content, operationAction.content) && Intrinsics.areEqual(this.editText, operationAction.editText);
        }

        @NotNull
        public final String getContent() {
            return this.content;
        }

        @NotNull
        public final CustomEditText getEditText() {
            return this.editText;
        }

        public final int getEnd() {
            return this.end;
        }

        public final int getIndex() {
            return this.index;
        }

        public final int getStart() {
            return this.start;
        }

        public int hashCode() {
            return (((((((Integer.hashCode(this.index) * 31) + Integer.hashCode(this.start)) * 31) + Integer.hashCode(this.end)) * 31) + this.content.hashCode()) * 31) + this.editText.hashCode();
        }

        @NotNull
        public String toString() {
            return "OperationAction(index=" + this.index + ", start=" + this.start + ", end=" + this.end + ", content=" + this.content + ", editText=" + this.editText + ")";
        }
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    @NotNull
    public final String getOldContent() {
        return this.oldContent;
    }

    public final void setOldContent(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.oldContent = str;
    }
}
