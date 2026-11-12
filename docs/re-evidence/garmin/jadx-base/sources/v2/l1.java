package v2;

import android.R;
import android.content.ClipData;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.PreviewableHandwritingGesture;
import com.google.android.exoplayer2.audio.WavUtil;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lv2/l1;", "Landroid/view/inputmethod/InputConnection;", "Lv2/f2;", "session", "Landroid/view/inputmethod/EditorInfo;", "editorInfo", "<init>", "(Lv2/f2;Landroid/view/inputmethod/EditorInfo;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class l1 implements InputConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f2 f175081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q3.c<e23.l<p0, Unit>> f175082b = new q3.c<>(new e23.l[16], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m7.b f175083c;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"v2/l1$a", "Lm7/c;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements m7.c {
        public a() {
        }

        @Override // m7.c
        public final boolean a(m7.d dVar, int i14, Bundle bundle) {
            int i15 = i14 & 1;
            l1 l1Var = l1.this;
            if (i15 != 0) {
                try {
                    ((m7.d.a) dVar.f117058a).f117059a.requestPermission();
                    InputContentInfo inputContentInfo = ((m7.d.a) dVar.f117058a).f117059a;
                    inputContentInfo.getClass();
                    bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                    bundle.putParcelable("EXTRA_INPUT_CONTENT_INFO", inputContentInfo);
                } catch (Exception e4) {
                    e4.toString();
                    l1Var.getClass();
                    return false;
                }
            }
            f2 f2Var = l1Var.f175081a;
            m7.d.b bVar = dVar.f117058a;
            m7.d.b bVar2 = dVar.f117058a;
            kotlin.m1 m1Var = new kotlin.m1(new ClipData(((m7.d.a) bVar).f117059a.getDescription(), new ClipData.Item(((m7.d.a) bVar2).f117059a.getContentUri())));
            v1.d.a.f174661b.getClass();
            kotlin.n1 n1Var = new kotlin.n1(((m7.d.a) bVar2).f117059a.getDescription());
            Uri linkUri = ((m7.d.a) bVar2).f117059a.getLinkUri();
            if (bundle == null) {
                bundle = Bundle.EMPTY;
            }
            new v1.d(m1Var, n1Var, 0, new v1.b(linkUri, bundle), null);
            f2Var.f();
            return false;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"v2/l1$b", "Landroid/view/inputmethod/InputConnectionWrapper;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends InputConnectionWrapper {
        public b(l1 l1Var) {
            super(l1Var, false);
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public final boolean commitContent(InputContentInfo inputContentInfo, int i14, Bundle bundle) {
            return false;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public final boolean performPrivateCommand(String str, Bundle bundle) {
            return true;
        }
    }

    public l1(f2 f2Var, EditorInfo editorInfo) {
        this.f175081a = f2Var;
        b bVar = new b(this);
        a aVar = new a();
        if (editorInfo != null) {
            this.f175083c = new m7.b(bVar, false, aVar);
        } else {
            j20.x.l("editorInfo must be non-null");
            throw null;
        }
    }

    public final void b(int i14) {
        sendKeyEvent(new KeyEvent(0, i14));
        sendKeyEvent(new KeyEvent(1, i14));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        this.f175081a.beginBatchEdit();
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i14) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.f175082b.g();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        Objects.toString(completionInfo != null ? completionInfo.getText() : null);
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i14, Bundle bundle) {
        Objects.toString(inputContentInfo);
        Objects.toString(bundle);
        j.f175061a.getClass();
        return this.f175083c.commitContent(inputContentInfo, i14, bundle);
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i14) {
        Objects.toString(charSequence);
        if (charSequence == null) {
            return true;
        }
        this.f175081a.g(new cf.k(charSequence.toString(), i14, 3));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i14, int i15) {
        f2 f2Var = this.f175081a;
        f2Var.g(new q0(i14, i15, f2Var));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i14, int i15) {
        this.f175081a.g(new lr2.s(i14, i15, 1));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return this.f175081a.endBatchEdit();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        this.f175081a.g(new uu.o(8));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i14) {
        f2 f2Var = this.f175081a;
        return TextUtils.getCapsMode(f2Var.getText(), s5.w0.h(f2Var.getText().f167840d), i14);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i14) {
        Objects.toString(extractedTextRequest);
        u2.e text = this.f175081a.getText();
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = text;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = text.f167839c.length();
        extractedText.partialStartOffset = -1;
        long j8 = text.f167840d;
        extractedText.selectionStart = s5.w0.h(j8);
        extractedText.selectionEnd = s5.w0.g(j8);
        extractedText.flags = !d53.w.A(text, '\n') ? 1 : 0;
        return extractedText;
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i14) {
        f2 f2Var = this.f175081a;
        if (s5.w0.e(f2Var.getText().f167840d)) {
            return null;
        }
        u2.e text = f2Var.getText();
        return text.f167839c.subSequence(s5.w0.h(text.f167840d), s5.w0.g(text.f167840d)).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i14, int i15) {
        u2.e text = this.f175081a.getText();
        long j8 = text.f167840d;
        CharSequence charSequence = text.f167839c;
        int iG = s5.w0.g(j8);
        int iG2 = s5.w0.g(text.f167840d);
        int length = iG2 + i14;
        if (((i14 ^ length) & (iG2 ^ length)) < 0) {
            length = charSequence.length();
        }
        return charSequence.subSequence(iG, Math.min(length, charSequence.length())).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i14, int i15) {
        u2.e text = this.f175081a.getText();
        int iH = s5.w0.h(text.f167840d);
        int i16 = iH - i14;
        if (((i14 ^ iH) & (iH ^ i16)) < 0) {
            i16 = 0;
        }
        return text.f167839c.subSequence(Math.max(0, i16), s5.w0.h(text.f167840d)).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i14) {
        switch (i14) {
            case R.id.selectAll:
                f2 f2Var = this.f175081a;
                f2Var.g(new q0(f2Var, 0, f2Var.getText().f167839c.length()));
                break;
            case R.id.cut:
                b(277);
                break;
            case R.id.copy:
                b(278);
                break;
            case R.id.paste:
                b(279);
                break;
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i14) {
        int i15;
        if (i14 != 0) {
            switch (i14) {
                case 2:
                    x5.p.f188918b.getClass();
                    i15 = x5.p.f188921e;
                    break;
                case 3:
                    x5.p.f188918b.getClass();
                    i15 = x5.p.f188922f;
                    break;
                case 4:
                    x5.p.f188918b.getClass();
                    i15 = x5.p.f188923g;
                    break;
                case 5:
                    x5.p.f188918b.getClass();
                    i15 = x5.p.f188925i;
                    break;
                case 6:
                    x5.p.f188918b.getClass();
                    i15 = x5.p.f188926j;
                    break;
                case 7:
                    x5.p.f188918b.getClass();
                    i15 = x5.p.f188924h;
                    break;
                default:
                    x5.p.f188918b.getClass();
                    i15 = x5.p.f188920d;
                    break;
            }
        } else {
            x5.p.f188918b.getClass();
            i15 = x5.p.f188920d;
        }
        this.f175081a.a(i15);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        Objects.toString(handwritingGesture);
        Objects.toString(executor);
        Objects.toString(intConsumer);
        if (Build.VERSION.SDK_INT < 34) {
            return;
        }
        m.f175085a.getClass();
        int iB = this.f175081a.b(handwritingGesture);
        if (intConsumer == null) {
            return;
        }
        if (executor != null) {
            executor.execute(new k(intConsumer, iB, 1));
        } else {
            intConsumer.accept(iB);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        Objects.toString(bundle);
        return this.f175083c.performPrivateCommand(str, bundle);
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        Objects.toString(previewableHandwritingGesture);
        Objects.toString(cancellationSignal);
        if (Build.VERSION.SDK_INT < 34) {
            return false;
        }
        m.f175085a.getClass();
        return this.f175081a.previewHandwritingGesture(previewableHandwritingGesture, cancellationSignal);
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z14) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i14) {
        this.f175081a.requestCursorUpdates(i14);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        Objects.toString(keyEvent);
        this.f175081a.sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i14, int i15) {
        this.f175081a.g(new lr2.s(i14, i15, 2));
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:61:0x01fb  */
    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i14) {
        s5.i0 i0Var;
        w5.i0 i0Var2;
        w5.i0 i0Var3;
        w5.i0 i0Var4;
        w5.q j0Var;
        s5.i0 i0Var5;
        Objects.toString(charSequence);
        if (charSequence == null) {
            return true;
        }
        String string = charSequence.toString();
        ArrayList arrayList = null;
        Spanned spanned = charSequence instanceof Spanned ? (Spanned) charSequence : null;
        if (spanned != null) {
            ArrayList arrayList2 = null;
            for (Object obj : spanned.getSpans(0, spanned.length(), Object.class)) {
                if (obj instanceof BackgroundColorSpan) {
                    i0Var = new s5.i0(0L, 0L, (w5.f0) null, (w5.b0) null, (w5.c0) null, (w5.q) null, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, o4.f0.b(((BackgroundColorSpan) obj).getBackgroundColor()), (d6.i) null, (o4.q1) null, (s5.b0) null, (q4.g) null, 63487, (p005kotlin.jvm.internal.j) null);
                } else if (obj instanceof ForegroundColorSpan) {
                    i0Var = new s5.i0(o4.f0.b(((ForegroundColorSpan) obj).getForegroundColor()), 0L, (w5.f0) null, (w5.b0) null, (w5.c0) null, (w5.q) null, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (d6.i) null, (o4.q1) null, (s5.b0) null, (q4.g) null, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE, (p005kotlin.jvm.internal.j) null);
                } else if (obj instanceof StrikethroughSpan) {
                    d6.i.f57760b.getClass();
                    i0Var = new s5.i0(0L, 0L, (w5.f0) null, (w5.b0) null, (w5.c0) null, (w5.q) null, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, d6.i.f57763e, (o4.q1) null, (s5.b0) null, (q4.g) null, 61439, (p005kotlin.jvm.internal.j) null);
                } else if (obj instanceof StyleSpan) {
                    int style = ((StyleSpan) obj).getStyle();
                    if (style == 1) {
                        w5.f0.f182097b.getClass();
                        i0Var = new s5.i0(0L, 0L, w5.f0.f182105j, (w5.b0) null, (w5.c0) null, (w5.q) null, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (d6.i) null, (o4.q1) null, (s5.b0) null, (q4.g) null, 65531, (p005kotlin.jvm.internal.j) null);
                    } else if (style == 2) {
                        w5.b0.f182070b.getClass();
                        i0Var5 = new s5.i0(0L, 0L, (w5.f0) null, w5.b0.a(w5.b0.f182071c), (w5.c0) null, (w5.q) null, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (d6.i) null, (o4.q1) null, (s5.b0) null, (q4.g) null, 65527, (p005kotlin.jvm.internal.j) null);
                        i0Var = i0Var5;
                    } else if (style != 3) {
                        i0Var = null;
                    } else {
                        w5.f0.f182097b.getClass();
                        w5.f0 f0Var = w5.f0.f182105j;
                        w5.b0.f182070b.getClass();
                        i0Var = new s5.i0(0L, 0L, f0Var, w5.b0.a(w5.b0.f182071c), (w5.c0) null, (w5.q) null, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (d6.i) null, (o4.q1) null, (s5.b0) null, (q4.g) null, 65523, (p005kotlin.jvm.internal.j) null);
                    }
                } else if (obj instanceof TypefaceSpan) {
                    TypefaceSpan typefaceSpan = (TypefaceSpan) obj;
                    String family = typefaceSpan.getFamily();
                    w5.q.f182149a.getClass();
                    w5.i0 i0Var6 = w5.q.f182154f;
                    if (!p005kotlin.jvm.internal.s.g(family, i0Var6.f182124g)) {
                        i0Var2 = w5.q.f182153e;
                        if (!p005kotlin.jvm.internal.s.g(family, i0Var2.f182124g)) {
                            i0Var3 = w5.q.f182151c;
                            if (!p005kotlin.jvm.internal.s.g(family, i0Var3.f182124g)) {
                                i0Var4 = w5.q.f182152d;
                                if (!p005kotlin.jvm.internal.s.g(family, i0Var4.f182124g)) {
                                    String family2 = typefaceSpan.getFamily();
                                    if (family2 == null || family2.length() == 0) {
                                        j0Var = i0Var6;
                                        j0Var = i0Var2;
                                        j0Var = i0Var3;
                                        j0Var = i0Var4;
                                        j0Var = i0Var6;
                                        j0Var = i0Var2;
                                        j0Var = i0Var3;
                                        j0Var = i0Var4;
                                        j0Var = null;
                                    } else {
                                        Typeface typefaceCreate = Typeface.create(family2, 0);
                                        Typeface typeface = Typeface.DEFAULT;
                                        if (p005kotlin.jvm.internal.s.g(typefaceCreate, typeface) || p005kotlin.jvm.internal.s.g(typefaceCreate, Typeface.create(typeface, 0))) {
                                            j0Var = i0Var6;
                                            j0Var = i0Var2;
                                            j0Var = i0Var3;
                                            j0Var = i0Var4;
                                            j0Var = i0Var6;
                                            j0Var = i0Var2;
                                            j0Var = i0Var3;
                                            j0Var = i0Var4;
                                            typefaceCreate = null;
                                        }
                                        if (typefaceCreate != null) {
                                            j0Var = new w5.j0(new a6.j(typefaceCreate));
                                        } else {
                                            j0Var = i0Var6;
                                            j0Var = i0Var2;
                                            j0Var = i0Var3;
                                            j0Var = i0Var4;
                                            j0Var = i0Var6;
                                            j0Var = i0Var2;
                                            j0Var = i0Var3;
                                            j0Var = i0Var4;
                                            j0Var = null;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    j0Var = i0Var6;
                    j0Var = i0Var2;
                    j0Var = i0Var3;
                    j0Var = i0Var4;
                    j0Var = i0Var6;
                    j0Var = i0Var2;
                    j0Var = i0Var3;
                    j0Var = i0Var6;
                    j0Var = i0Var2;
                    j0Var = i0Var6;
                    i0Var5 = new s5.i0(0L, 0L, (w5.f0) null, (w5.b0) null, (w5.c0) null, j0Var, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (d6.i) null, (o4.q1) null, (s5.b0) null, (q4.g) null, 65503, (p005kotlin.jvm.internal.j) null);
                    i0Var = i0Var5;
                } else if (obj instanceof UnderlineSpan) {
                    d6.i.f57760b.getClass();
                    i0Var = new s5.i0(0L, 0L, (w5.f0) null, (w5.b0) null, (w5.c0) null, (w5.q) null, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, d6.i.f57762d, (o4.q1) null, (s5.b0) null, (q4.g) null, 61439, (p005kotlin.jvm.internal.j) null);
                } else {
                    i0Var = null;
                }
                if (i0Var != null) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(new s5.c.d(i0Var, spanned.getSpanStart(obj), spanned.getSpanEnd(obj)));
                }
            }
            arrayList = arrayList2;
        }
        this.f175081a.g(new ct2.e(string, arrayList, i14, 9));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i14, int i15) {
        f2 f2Var = this.f175081a;
        f2Var.g(new q0(f2Var, i14, i15));
        f2Var.e();
        return true;
    }
}
