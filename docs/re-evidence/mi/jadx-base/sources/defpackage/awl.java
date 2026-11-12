package defpackage;

import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class awl<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<T> f3520a;

    public awl(@Nullable List<T> list) {
        this.f3520a = new ArrayList(list == null ? new ArrayList<>(0) : list);
    }

    @NotNull
    public List<T> a() {
        return this.f3520a;
    }
}
