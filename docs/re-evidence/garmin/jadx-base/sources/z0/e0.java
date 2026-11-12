package z0;

import androidx.camera.core.impl.y0;
import b0.g1;
import com.google.auto.value.AutoValue;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@AutoValue
public abstract class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f200612a = new k(0, a.INACTIVE, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set<Integer> f200613b = Collections.unmodifiableSet(new HashSet(Arrays.asList(0, -1)));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final y0 f200614c = y0.a(new k(0, a.ACTIVE, null));

    public enum a {
        ACTIVE,
        INACTIVE
    }

    public abstract int a();

    public abstract g1.g b();

    public abstract a c();
}
