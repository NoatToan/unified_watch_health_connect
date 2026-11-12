package com.huami.healthlabel.ui.custom;

import android.content.Context;
import android.text.InputFilter;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.KeyEvent;
import androidx.appcompat.widget.AppCompatEditText;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000?\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u000f\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001cB\u0011\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016B\u001b\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0015\u0010\u0019B#\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u001bJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/huami/healthlabel/ui/custom/KeyEditView;", "Landroidx/appcompat/widget/AppCompatEditText;", "", "keyCode", "Landroid/view/KeyEvent;", "event", "", "onKeyPreIme", "Lcom/huami/healthlabel/ui/custom/KeyEditView$KeyPreImeListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "setOnEditListener", "a", "Lcom/huami/healthlabel/ui/custom/KeyEditView$KeyPreImeListener;", "preImeListener", "com/huami/healthlabel/ui/custom/KeyEditView$emojiFilter$1", "b", "Lcom/huami/healthlabel/ui/custom/KeyEditView$emojiFilter$1;", "emojiFilter", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "KeyPreImeListener", "healthLabel_release"}, k = 1, mv = {1, 5, 1})
public final class KeyEditView extends AppCompatEditText {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private KeyPreImeListener preImeListener;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final KeyEditView$emojiFilter$1 emojiFilter;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/huami/healthlabel/ui/custom/KeyEditView$KeyPreImeListener;", "", "", "keyCode", "", "onKeyPreIme", "healthLabel_release"}, k = 1, mv = {1, 5, 1})
    public interface KeyPreImeListener {
        void onKeyPreIme(int keyCode);
    }

    public KeyEditView(@NotNull Context context) {
        this(context, null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onKeyPreIme(int keyCode, @Nullable KeyEvent event) {
        KeyPreImeListener keyPreImeListener = this.preImeListener;
        if (keyPreImeListener != null) {
            keyPreImeListener.onKeyPreIme(keyCode);
        }
        return super.onKeyPreIme(keyCode, event);
    }

    public final void setOnEditListener(@NotNull KeyPreImeListener listener) {
        this.preImeListener = listener;
    }

    public KeyEditView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.huami.healthlabel.ui.custom.KeyEditView$emojiFilter$1] */
    public KeyEditView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ?? r1 = new InputFilter() { // from class: com.huami.healthlabel.ui.custom.KeyEditView$emojiFilter$1
            @Override // android.text.InputFilter
            @Nullable
            public CharSequence filter(@Nullable CharSequence source, int start, int end, @Nullable Spanned dest, int dstart, int dend) {
                if (source == null || start >= end) {
                    return null;
                }
                while (true) {
                    int i2 = start + 1;
                    byte type = (byte) Character.getType(source.charAt(start));
                    if (type == 19 || type == 28) {
                        return "";
                    }
                    if (i2 >= end) {
                        return null;
                    }
                    start = i2;
                }
            }
        };
        this.emojiFilter = r1;
        setFilters(new InputFilter[]{r1, new InputFilter.LengthFilter(10)});
    }
}
