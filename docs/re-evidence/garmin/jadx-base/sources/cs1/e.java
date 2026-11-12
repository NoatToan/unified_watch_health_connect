package cs1;

import android.text.Editable;
import android.text.Selection;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcs1/e;", "Landroid/text/Editable$Factory;", "<init>", "()V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends Editable.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f55465a = new e();

    private e() {
    }

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        d dVar = new d(charSequence);
        Selection.setSelection(dVar, 0);
        return dVar;
    }
}
