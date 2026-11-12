package i4;

import android.view.View;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import i3.e5;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Li4/a;", "Li4/i;", "Landroid/view/View;", "view", "Li4/p;", "autofillTree", "<init>", "(Landroid/view/View;Li4/p;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f90820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f90821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AutofillManager f90822c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AutofillId f90823d;

    public a(View view2, p pVar) {
        this.f90820a = view2;
        this.f90821b = pVar;
        AutofillManager autofillManager = (AutofillManager) view2.getContext().getSystemService(AutofillManager.class);
        if (autofillManager == null) {
            vb.h.z("Autofill service could not be located.");
            throw null;
        }
        this.f90822c = autofillManager;
        view2.setImportantForAutofill(1);
        AutofillId autofillId = l5.a.a(view2.getAutofillId()).f110135a;
        if (autofillId == null) {
            throw e5.m("Required value was null.");
        }
        this.f90823d = autofillId;
    }
}
