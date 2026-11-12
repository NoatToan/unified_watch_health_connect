package i33;

import java.util.Collection;
import java.util.Set;
import l43.w;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends b43.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f90781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Set f90782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f90783c;

    /* JADX INFO: renamed from: i33.a$a, reason: collision with other inner class name */
    public class C1744a implements e23.l<t23.b, Unit> {
        public C1744a() {
        }

        @Override // e23.l
        public final Unit invoke(t23.b bVar) {
            t23.b bVar2 = bVar;
            if (bVar2 != null) {
                a.this.f90781a.b(bVar2);
                return Unit.INSTANCE;
            }
            vb.h.s("Argument for @NotNull parameter 'descriptor' of kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1$1.invoke must not be null");
            return null;
        }
    }

    public a(w wVar, Set set, boolean z14) {
        this.f90781a = wVar;
        this.f90782b = set;
        this.f90783c = z14;
    }

    public static /* synthetic */ void e(int i14) {
        Object[] objArr = new Object[3];
        if (i14 == 1) {
            objArr[0] = "fromSuper";
        } else if (i14 == 2) {
            objArr[0] = "fromCurrent";
        } else if (i14 == 3) {
            objArr[0] = "member";
        } else if (i14 != 4) {
            objArr[0] = "fakeOverride";
        } else {
            objArr[0] = "overridden";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1";
        if (i14 == 1 || i14 == 2) {
            objArr[2] = "conflict";
        } else if (i14 == 3 || i14 == 4) {
            objArr[2] = "setOverriddenDescriptors";
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
        p005kotlin.reflect.jvm.internal.impl.resolve.b.t(bVar, new C1744a());
        this.f90782b.add(bVar);
    }

    @Override // b43.m
    public final void c(t23.b bVar, Collection<? extends t23.b> collection) {
        if (bVar == null) {
            e(3);
            throw null;
        }
        if (!this.f90783c || bVar.getKind() == t23.b.a.FAKE_OVERRIDE) {
            bVar.i0(collection);
        }
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
