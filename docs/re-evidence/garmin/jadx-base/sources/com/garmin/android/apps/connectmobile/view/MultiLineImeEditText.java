package com.garmin.android.apps.connectmobile.view;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import c32.f;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u001a\u001bB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001d\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB'\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/garmin/android/apps/connectmobile/view/MultiLineImeEditText;", "Landroidx/appcompat/widget/AppCompatEditText;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/garmin/android/apps/connectmobile/view/MultiLineImeEditText$b;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "setTextUpdatedListener", "(Lcom/garmin/android/apps/connectmobile/view/MultiLineImeEditText$b;)V", "Lcom/garmin/android/apps/connectmobile/view/MultiLineImeEditText$a;", "setTextEntryDoneListener", "(Lcom/garmin/android/apps/connectmobile/view/MultiLineImeEditText$a;)V", "Landroid/view/View$OnClickListener;", "setExtraOnClickListener", "(Landroid/view/View$OnClickListener;)V", "Landroid/view/View$OnFocusChangeListener;", "setExtraOnFocusChangeListener", "(Landroid/view/View$OnFocusChangeListener;)V", "b", "a", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class MultiLineImeEditText extends AppCompatEditText {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f47496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f47497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View.OnClickListener f47498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View.OnFocusChangeListener f47499d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView.OnEditorActionListener f47500e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View.OnFocusChangeListener f47501f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View.OnClickListener f47502g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c f47503h;

    public interface a {
        void b();
    }

    public interface b {
        void h();
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/view/MultiLineImeEditText$c", "Landroid/text/TextWatcher;", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements TextWatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f47504a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f47505b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f47506c;

        public c() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            editable.getClass();
            boolean z14 = this.f47506c;
            MultiLineImeEditText multiLineImeEditText = MultiLineImeEditText.this;
            if (!z14) {
                int i14 = this.f47505b + this.f47504a;
                String string = editable.toString();
                String strConcat = string.substring(0, this.f47505b).concat(string.substring(i14, editable.length()));
                int i15 = this.f47505b;
                multiLineImeEditText.setText(strConcat);
                multiLineImeEditText.setSelection(i15);
            }
            b bVar = multiLineImeEditText.f47496a;
            if (bVar != null) {
                bVar.h();
            }
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
            charSequence.getClass();
            this.f47504a = i16;
            this.f47505b = i14;
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
            charSequence.getClass();
            this.f47506c = true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiLineImeEditText(Context context) {
        super(context);
        context.getClass();
        int i14 = 10;
        this.f47500e = new bl0.a(this, i14);
        this.f47501f = new f(this, i14);
        this.f47502g = new oq.a(this, 16);
        this.f47503h = new c();
        d();
    }

    public static boolean a(MultiLineImeEditText multiLineImeEditText, TextView textView, int i14) {
        textView.getClass();
        if (i14 != 6) {
            return false;
        }
        textView.setCursorVisible(false);
        Object systemService = textView.getContext().getSystemService("input_method");
        systemService.getClass();
        ((InputMethodManager) systemService).hideSoftInputFromWindow(textView.getWindowToken(), 0);
        a aVar = multiLineImeEditText.f47497b;
        if (aVar == null) {
            return true;
        }
        aVar.b();
        return true;
    }

    public static void b(MultiLineImeEditText multiLineImeEditText, View view2, boolean z14) {
        if (view2 instanceof TextView) {
            ((TextView) view2).setCursorVisible(z14);
        }
        View.OnFocusChangeListener onFocusChangeListener = multiLineImeEditText.f47499d;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view2, z14);
        }
    }

    public static void c(MultiLineImeEditText multiLineImeEditText, View view2) {
        if (view2 instanceof TextView) {
            ((TextView) view2).setCursorVisible(true);
        }
        View.OnClickListener onClickListener = multiLineImeEditText.f47498c;
        if (onClickListener != null) {
            onClickListener.onClick(view2);
        }
    }

    public final void d() {
        setOnEditorActionListener(this.f47500e);
        setOnFocusChangeListener(this.f47501f);
        setOnClickListener(this.f47502g);
        addTextChangedListener(this.f47503h);
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        editorInfo.getClass();
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        int i14 = editorInfo.imeOptions;
        if ((1073741824 & i14) != 0) {
            editorInfo.imeOptions = i14 & (-1073741825);
        }
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i14, KeyEvent keyEvent) {
        keyEvent.getClass();
        if (i14 == 0 || i14 == 4) {
            setCursorVisible(false);
            a aVar = this.f47497b;
            if (aVar != null) {
                aVar.b();
            }
        }
        return super.onKeyPreIme(i14, keyEvent);
    }

    public final void setExtraOnClickListener(View.OnClickListener listener) {
        listener.getClass();
        this.f47498c = listener;
    }

    public final void setExtraOnFocusChangeListener(View.OnFocusChangeListener listener) {
        listener.getClass();
        this.f47499d = listener;
    }

    public final void setTextEntryDoneListener(a listener) {
        listener.getClass();
        this.f47497b = listener;
    }

    public final void setTextUpdatedListener(b listener) {
        listener.getClass();
        this.f47496a = listener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiLineImeEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        int i14 = 10;
        this.f47500e = new bl0.a(this, i14);
        this.f47501f = new f(this, i14);
        this.f47502g = new oq.a(this, 16);
        this.f47503h = new c();
        d();
    }

    public /* synthetic */ MultiLineImeEditText(Context context, AttributeSet attributeSet, int i14, j jVar) {
        this(context, (i14 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiLineImeEditText(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        context.getClass();
        int i15 = 10;
        this.f47500e = new bl0.a(this, i15);
        this.f47501f = new f(this, i15);
        this.f47502g = new oq.a(this, 16);
        this.f47503h = new c();
        d();
    }

    public /* synthetic */ MultiLineImeEditText(Context context, AttributeSet attributeSet, int i14, int i15, j jVar) {
        this(context, (i15 & 2) != 0 ? null : attributeSet, (i15 & 4) != 0 ? 0 : i14);
    }
}
