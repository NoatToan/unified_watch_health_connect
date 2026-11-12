package defpackage;

import android.widget.Checkable;
import androidx.annotation.RestrictTo;
import defpackage.h8f;

/* JADX INFO: loaded from: classes5.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public interface h8f<T extends h8f<T>> extends Checkable {

    public interface a<C> {
        void a(C c, boolean z);
    }

    int getId();

    void setInternalOnCheckedChangeListener(a<T> aVar);
}
