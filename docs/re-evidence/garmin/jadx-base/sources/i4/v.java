package i4;

import android.graphics.Rect;
import android.view.View;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Li4/v;", "Li4/u;", "Landroid/view/autofill/AutofillManager;", "platformAndroidManager", "<init>", "(Landroid/view/autofill/AutofillManager;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class v implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AutofillManager f90886a;

    public v(AutofillManager autofillManager) {
        this.f90886a = autofillManager;
    }

    @Override // i4.u
    public final void a(View view2, int i14, AutofillValue autofillValue) {
        this.f90886a.notifyValueChanged(view2, i14, autofillValue);
    }

    @Override // i4.u
    public final void b(View view2, int i14, Rect rect) {
        this.f90886a.notifyViewEntered(view2, i14, rect);
    }

    @Override // i4.u
    public final void c(View view2, int i14, Rect rect) {
        this.f90886a.requestAutofill(view2, i14, rect);
    }

    @Override // i4.u
    public final void commit() {
        this.f90886a.commit();
    }

    @Override // i4.u
    public final void d(View view2, int i14, boolean z14) {
        k.f90843a.getClass();
        this.f90886a.notifyViewVisibilityChanged(view2, i14, z14);
    }

    @Override // i4.u
    public final void e(int i14, View view2) {
        this.f90886a.notifyViewExited(view2, i14);
    }
}
