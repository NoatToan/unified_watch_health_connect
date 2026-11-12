package l5;

import android.os.Build;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import j4.g;

/* JADX INFO: loaded from: classes.dex */
public class b implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f110136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f110137b;

    public static class a {
        private a() {
        }

        public static AutofillId a(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j8) {
            return contentCaptureSession.newAutofillId(autofillId, j8);
        }

        public static ViewStructure b(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j8) {
            return contentCaptureSession.newVirtualViewStructure(autofillId, j8);
        }

        public static void c(ContentCaptureSession contentCaptureSession, ViewStructure viewStructure) {
            contentCaptureSession.notifyViewAppeared(viewStructure);
        }

        public static void d(ContentCaptureSession contentCaptureSession, AutofillId autofillId) {
            contentCaptureSession.notifyViewDisappeared(autofillId);
        }

        public static void e(ContentCaptureSession contentCaptureSession, AutofillId autofillId, String str) {
            contentCaptureSession.notifyViewTextChanged(autofillId, str);
        }

        public static void f(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long[] jArr) {
            contentCaptureSession.notifyViewsDisappeared(autofillId, jArr);
        }
    }

    private b(ContentCaptureSession contentCaptureSession, View view2) {
        this.f110136a = contentCaptureSession;
        this.f110137b = view2;
    }

    public static b f(ContentCaptureSession contentCaptureSession, View view2) {
        return new b(contentCaptureSession, view2);
    }

    @Override // j4.g
    public final AutofillId a(long j8) {
        if (Build.VERSION.SDK_INT >= 29) {
            return a.a(cq0.d.e(this.f110136a), l5.a.a(this.f110137b.getAutofillId()).f110135a, j8);
        }
        return null;
    }

    @Override // j4.g
    public final e b(AutofillId autofillId, long j8) {
        if (Build.VERSION.SDK_INT >= 29) {
            return e.a(a.b(cq0.d.e(this.f110136a), autofillId, j8));
        }
        return null;
    }

    @Override // j4.g
    public final void c(AutofillId autofillId) {
        if (Build.VERSION.SDK_INT >= 29) {
            a.d(cq0.d.e(this.f110136a), autofillId);
        }
    }

    @Override // j4.g
    public final void d(AutofillId autofillId, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            a.e(cq0.d.e(this.f110136a), autofillId, str);
        }
    }

    @Override // j4.g
    public final void e(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT >= 29) {
            a.c(cq0.d.e(this.f110136a), viewStructure);
        }
    }

    @Override // j4.g
    public final void flush() {
        if (Build.VERSION.SDK_INT >= 29) {
            a.f(cq0.d.e(this.f110136a), l5.a.a(this.f110137b.getAutofillId()).f110135a, new long[]{Long.MIN_VALUE});
        }
    }
}
