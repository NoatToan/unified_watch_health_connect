package ea;

import com.google.common.collect.ImmutableList;
import fa.z;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f63585b = new b(ImmutableList.of(), 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImmutableList<a> f63586a;

    static {
        z.H(0);
        z.H(1);
    }

    public b(List<a> list, long j8) {
        this.f63586a = ImmutableList.copyOf((Collection) list);
    }
}
