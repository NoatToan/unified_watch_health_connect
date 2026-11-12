package i4;

import android.view.autofill.AutofillValue;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Li4/h;", "Li4/t;", "Landroid/view/autofill/AutofillValue;", "autofillValue", "<init>", "(Landroid/view/autofill/AutofillValue;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h implements t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AutofillValue f90841b;

    public h(AutofillValue autofillValue) {
        this.f90841b = autofillValue;
    }

    @Override // i4.t
    public final Boolean a() {
        AutofillValue autofillValue = this.f90841b;
        if (autofillValue.isToggle()) {
            return Boolean.valueOf(autofillValue.getToggleValue());
        }
        return null;
    }

    @Override // i4.t
    public final CharSequence b() {
        AutofillValue autofillValue = this.f90841b;
        if (autofillValue.isText()) {
            return autofillValue.getTextValue();
        }
        return null;
    }
}
