package defpackage;

import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public interface bh3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final g2d f4201a = g2d.a(new Object());

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    default g2d a() {
        return f4201a;
    }

    List<ch3> b(List<ch3> list);
}
