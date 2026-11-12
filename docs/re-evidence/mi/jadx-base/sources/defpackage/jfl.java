package defpackage;

import androidx.annotation.RestrictTo;
import androidx.work.impl.model.WorkSpec;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public interface jfl {
    boolean a();

    void b(WorkSpec... workSpecArr);

    void cancel(String str);
}
