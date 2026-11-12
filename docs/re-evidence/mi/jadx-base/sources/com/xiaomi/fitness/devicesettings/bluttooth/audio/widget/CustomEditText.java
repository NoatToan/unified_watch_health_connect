package com.xiaomi.fitness.devicesettings.bluttooth.audio.widget;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatEditText;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.devicesettings.bluttooth.audio.AudioRecordEditVM;
import defpackage.cji;
import defpackage.ez5;
import defpackage.l2j;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 #2\u00020\u0001:\u0002\"#B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0007H\u0014J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\u0014\u0010\u0019\u001a\u00020\u00142\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\u0010\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u0007H\u0016J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\u0014H\u0002R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/widget/CustomEditText;", "Landroidx/appcompat/widget/AppCompatEditText;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "list", "", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioRecordEditVM$EditAction;", "getList", "()Ljava/util/List;", "setList", "(Ljava/util/List;)V", "cursorSatrt", "cursorEnd", "onSelectionChanged", "", "selStart", "selEnd", "isMultyWord", "", "setData", "dataList", "onTextContextMenuItem", "id", "onCreateInputConnection", "Landroid/view/inputmethod/InputConnection;", "outAttrs", "Landroid/view/inputmethod/EditorInfo;", "toast", "BackSpaceInput", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCustomEditText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomEditText.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/audio/widget/CustomEditText\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,105:1\n1#2:106\n*E\n"})
public final class CustomEditText extends AppCompatEditText {

    @NotNull
    private static final String TAG = "AudiRecord_EditView";
    private int cursorEnd;
    private int cursorSatrt;

    @Nullable
    private List<AudioRecordEditVM.EditAction> list;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u0010\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/widget/CustomEditText$BackSpaceInput;", "Landroid/view/inputmethod/InputConnectionWrapper;", "editText", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/widget/CustomEditText;", "target", "Landroid/view/inputmethod/InputConnection;", "mutable", "", "<init>", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/widget/CustomEditText;Landroid/view/inputmethod/InputConnection;Z)V", "ref", "Ljava/lang/ref/WeakReference;", "getRef", "()Ljava/lang/ref/WeakReference;", "setRef", "(Ljava/lang/ref/WeakReference;)V", "sendKeyEvent", "event", "Landroid/view/KeyEvent;", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BackSpaceInput extends InputConnectionWrapper {

        @Nullable
        private WeakReference<CustomEditText> ref;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BackSpaceInput(@NotNull CustomEditText editText, @NotNull InputConnection target, boolean z) {
            super(target, z);
            Intrinsics.checkNotNullParameter(editText, "editText");
            Intrinsics.checkNotNullParameter(target, "target");
            this.ref = new WeakReference<>(editText);
        }

        @Nullable
        public final WeakReference<CustomEditText> getRef() {
            return this.ref;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean sendKeyEvent(@Nullable KeyEvent event) {
            WeakReference<CustomEditText> weakReference;
            CustomEditText customEditText;
            CustomEditText customEditText2;
            if (event == null || event.getAction() != 0 || event.getKeyCode() != 67 || (weakReference = this.ref) == null || (customEditText = weakReference.get()) == null || !customEditText.isMultyWord()) {
                return super.sendKeyEvent(event);
            }
            WeakReference<CustomEditText> weakReference2 = this.ref;
            if (weakReference2 != null && (customEditText2 = weakReference2.get()) != null) {
                customEditText2.toast();
            }
            return true;
        }

        public final void setRef(@Nullable WeakReference<CustomEditText> weakReference) {
            this.ref = weakReference;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CustomEditText(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isMultyWord() {
        List<AudioRecordEditVM.EditAction> list = this.list;
        AudioRecordEditVM.EditAction editAction = null;
        Object obj = null;
        if (list != null) {
            for (Object obj2 : list) {
                AudioRecordEditVM.EditAction editAction2 = (AudioRecordEditVM.EditAction) obj2;
                int cursorStart = editAction2.getCursorStart();
                int cursorEnd = editAction2.getCursorEnd();
                int i = this.cursorSatrt;
                if (cursorStart <= i && i <= cursorEnd) {
                    obj = obj2;
                    break;
                }
            }
            editAction = (AudioRecordEditVM.EditAction) obj;
        }
        return this.cursorEnd > (editAction != null ? editAction.getCursorEnd() : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void toast() {
        Toast.makeText(getContext(), "不能同时操作多句", 1).show();
    }

    @Nullable
    public final List<AudioRecordEditVM.EditAction> getList() {
        return this.list;
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    @NotNull
    public InputConnection onCreateInputConnection(@NotNull EditorInfo outAttrs) {
        Intrinsics.checkNotNullParameter(outAttrs, "outAttrs");
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(outAttrs);
        Intrinsics.checkNotNull(inputConnectionOnCreateInputConnection);
        return new BackSpaceInput(this, inputConnectionOnCreateInputConnection, true);
    }

    @Override // android.widget.TextView
    public void onSelectionChanged(int selStart, int selEnd) {
        super.onSelectionChanged(selStart, selEnd);
        Logger.i(TAG, "onSelectionChanged start=" + selStart + ",end=" + selEnd);
        this.cursorSatrt = selStart;
        this.cursorEnd = selEnd;
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int id) {
        if ((id != 16908320 && id != 16908322) || !isMultyWord()) {
            return super.onTextContextMenuItem(id);
        }
        toast();
        return true;
    }

    public final void setData(@NotNull List<AudioRecordEditVM.EditAction> dataList) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        this.list = dataList;
    }

    public final void setList(@Nullable List<AudioRecordEditVM.EditAction> list) {
        this.list = list;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CustomEditText(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ CustomEditText(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R.attr.editTextStyle : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CustomEditText(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.cursorSatrt = -1;
        this.cursorEnd = -1;
        setInputType(131072);
        setBackgroundColor(0);
        setHorizontallyScrolling(false);
        setSingleLine(false);
        setTextColor(ExtUtilsKt.getColor(cji.D));
        setTextAppearance(l2j.f24571b);
        setPadding(0, ez5.a(5), 0, ez5.a(20));
    }
}
