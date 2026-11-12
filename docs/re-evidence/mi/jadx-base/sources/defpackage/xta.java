package defpackage;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class xta {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final xta f39450b = new xta();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<a> f39451a = new CopyOnWriteArrayList();

    @ApiStatus.Internal
    public interface a {
    }

    @NotNull
    public static xta a() {
        return f39450b;
    }

    public void b(@NotNull a aVar) {
        this.f39451a.add(aVar);
    }
}
