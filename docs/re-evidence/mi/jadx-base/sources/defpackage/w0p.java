package defpackage;

import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.p;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public interface w0p<T> extends p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final Config.a<String> f37423b = Config.a.a("camerax.core.target.name", String.class);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final Config.a<Class<?>> c = Config.a.a("camerax.core.target.class", Class.class);

    default String r(String str) {
        return (String) d(f37423b, str);
    }
}
