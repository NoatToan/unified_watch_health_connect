package x5;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import java.util.ArrayList;
import p005kotlin.Metadata;
import s5.w0;

/* JADX INFO: loaded from: classes.dex */
@o13.e
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lx5/h0;", "Landroid/view/inputmethod/InputConnection;", "Lx5/l0;", "initState", "Lx5/r;", "eventCallback", "", "autoCorrect", "<init>", "(Lx5/l0;Lx5/r;Z)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h0 implements InputConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f188856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f188857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f188858c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public l0 f188859d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f188860e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f188861f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f188862g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f188863h = true;

    public h0(l0 l0Var, r rVar, boolean z14) {
        this.f188856a = rVar;
        this.f188857b = z14;
        this.f188859d = l0Var;
    }

    public final void b(k kVar) {
        this.f188858c++;
        try {
            this.f188862g.add(kVar);
        } finally {
            c();
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z14 = this.f188863h;
        if (!z14) {
            return z14;
        }
        this.f188858c++;
        return true;
    }

    public final boolean c() {
        int i14 = this.f188858c - 1;
        this.f188858c = i14;
        if (i14 == 0) {
            ArrayList arrayList = this.f188862g;
            if (!arrayList.isEmpty()) {
                this.f188856a.d(new ArrayList(arrayList));
                arrayList.clear();
            }
        }
        return this.f188858c > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i14) {
        boolean z14 = this.f188863h;
        if (z14) {
            return false;
        }
        return z14;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.f188862g.clear();
        this.f188858c = 0;
        this.f188863h = false;
        this.f188856a.e(this);
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z14 = this.f188863h;
        if (z14) {
            return false;
        }
        return z14;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i14, Bundle bundle) {
        boolean z14 = this.f188863h;
        if (z14) {
            return false;
        }
        return z14;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z14 = this.f188863h;
        return z14 ? this.f188857b : z14;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i14) {
        boolean z14 = this.f188863h;
        if (z14) {
            b(new b(String.valueOf(charSequence), i14));
        }
        return z14;
    }

    public final void d(int i14) {
        sendKeyEvent(new KeyEvent(0, i14));
        sendKeyEvent(new KeyEvent(1, i14));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i14, int i15) {
        boolean z14 = this.f188863h;
        if (!z14) {
            return z14;
        }
        b(new i(i14, i15));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i14, int i15) {
        boolean z14 = this.f188863h;
        if (!z14) {
            return z14;
        }
        b(new j(i14, i15));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return c();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z14 = this.f188863h;
        if (!z14) {
            return z14;
        }
        b(new n());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i14) {
        l0 l0Var = this.f188859d;
        return TextUtils.getCapsMode(l0Var.f188878a.f157138b, w0.h(l0Var.f188879b), i14);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i14) {
        boolean z14 = (i14 & 1) != 0;
        this.f188861f = z14;
        if (z14) {
            this.f188860e = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return w13.b.n(this.f188859d);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i14) {
        if (w0.e(this.f188859d.f188879b)) {
            return null;
        }
        return w2.a0.j(this.f188859d).f157138b;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i14, int i15) {
        return w2.a0.k(this.f188859d, i14).f157138b;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i14, int i15) {
        return w2.a0.l(this.f188859d, i14).f157138b;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i14) {
        boolean z14 = this.f188863h;
        if (z14) {
            z14 = false;
            switch (i14) {
                case R.id.selectAll:
                    b(new k0(0, this.f188859d.f188878a.f157138b.length()));
                    break;
                case R.id.cut:
                    d(277);
                    return false;
                case R.id.copy:
                    d(278);
                    return false;
                case R.id.paste:
                    d(279);
                    return false;
                default:
                    return false;
            }
        }
        return z14;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i14) {
        int i15;
        boolean z14 = this.f188863h;
        if (!z14) {
            return z14;
        }
        if (i14 != 0) {
            switch (i14) {
                case 2:
                    p.f188918b.getClass();
                    i15 = p.f188921e;
                    break;
                case 3:
                    p.f188918b.getClass();
                    i15 = p.f188922f;
                    break;
                case 4:
                    p.f188918b.getClass();
                    i15 = p.f188923g;
                    break;
                case 5:
                    p.f188918b.getClass();
                    i15 = p.f188925i;
                    break;
                case 6:
                    p.f188918b.getClass();
                    i15 = p.f188926j;
                    break;
                case 7:
                    p.f188918b.getClass();
                    i15 = p.f188924h;
                    break;
                default:
                    p.f188918b.getClass();
                    i15 = p.f188920d;
                    break;
            }
        } else {
            p.f188918b.getClass();
            i15 = p.f188920d;
        }
        this.f188856a.a(i15);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z14 = this.f188863h;
        if (z14) {
            return true;
        }
        return z14;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z14) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i14) {
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18 = this.f188863h;
        if (!z18) {
            return z18;
        }
        boolean z19 = false;
        boolean z24 = (i14 & 1) != 0;
        boolean z25 = (i14 & 2) != 0;
        int i15 = Build.VERSION.SDK_INT;
        if (i15 >= 33) {
            boolean z26 = (i14 & 16) != 0;
            boolean z27 = (i14 & 8) != 0;
            boolean z28 = (i14 & 4) != 0;
            if (i15 >= 34 && (i14 & 32) != 0) {
                z19 = true;
            }
            if (z26 || z27 || z28 || z19) {
                z15 = z19;
                z14 = z28;
                z17 = z27;
                z16 = z26;
            } else if (i15 >= 34) {
                z16 = true;
                z17 = true;
                z14 = true;
                z15 = true;
            } else {
                z15 = z19;
                z16 = true;
                z17 = true;
                z14 = true;
            }
        } else {
            z14 = false;
            z15 = false;
            z16 = true;
            z17 = true;
        }
        this.f188856a.b(z24, z25, z16, z17, z14, z15);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z14 = this.f188863h;
        if (!z14) {
            return z14;
        }
        this.f188856a.c(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i14, int i15) {
        boolean z14 = this.f188863h;
        if (z14) {
            b(new i0(i14, i15));
        }
        return z14;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i14) {
        boolean z14 = this.f188863h;
        if (z14) {
            b(new j0(String.valueOf(charSequence), i14));
        }
        return z14;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i14, int i15) {
        boolean z14 = this.f188863h;
        if (!z14) {
            return z14;
        }
        b(new k0(i14, i15));
        return true;
    }
}
