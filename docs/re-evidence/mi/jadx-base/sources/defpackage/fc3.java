package defpackage;

import android.util.Size;
import androidx.annotation.RequiresApi;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class fc3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ec3 f17642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set<Size> f17643b;

    public fc3(ec3 ec3Var) {
        this.f17642a = ec3Var;
        this.f17643b = ec3Var != null ? new HashSet<>(ec3Var.a()) : Collections.emptySet();
    }
}
