package w23;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class t extends b43.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Set f181713a;

    public t(s.a aVar, Set set) {
        this.f181713a = set;
    }

    public static /* synthetic */ void e(int i14) {
        Object[] objArr = new Object[3];
        if (i14 == 1) {
            objArr[0] = "fromSuper";
        } else if (i14 != 2) {
            objArr[0] = "fakeOverride";
        } else {
            objArr[0] = "fromCurrent";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope$4";
        if (i14 == 1 || i14 == 2) {
            objArr[2] = "conflict";
        } else {
            objArr[2] = "addFakeOverride";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // b43.m
    public final void a(t23.b bVar) {
        if (bVar == null) {
            e(0);
            throw null;
        }
        p005kotlin.reflect.jvm.internal.impl.resolve.b.t(bVar, null);
        this.f181713a.add(bVar);
    }

    @Override // b43.l
    public final void d(t23.b bVar, t23.b bVar2) {
        if (bVar == null) {
            e(1);
            throw null;
        }
        if (bVar2 != null) {
            return;
        }
        e(2);
        throw null;
    }
}
