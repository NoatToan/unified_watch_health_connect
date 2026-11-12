package defpackage;

import androidx.annotation.RestrictTo;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public interface k5h<T> {
    void addListener(T t);

    void removeListener(T t);

    void setLifecycleOwner(LifecycleOwner lifecycleOwner);
}
