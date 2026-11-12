package z0;

import com.google.auto.value.AutoValue;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@AutoValue
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set<Integer> f200589a = Collections.unmodifiableSet(new HashSet(Arrays.asList(2, 3, 4)));

    public abstract double a();

    public abstract long b();

    public abstract int c();

    public abstract Throwable d();
}
