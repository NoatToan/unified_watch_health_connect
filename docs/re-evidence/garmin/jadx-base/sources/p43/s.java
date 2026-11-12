package p43;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class s extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t23.e f135913c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<t23.d1> f135914d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Collection<n0> f135915e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t23.e eVar, List<? extends t23.d1> list, Collection<n0> collection, o43.n nVar) {
        super(nVar);
        if (eVar == null) {
            l(0);
            throw null;
        }
        if (list == null) {
            l(1);
            throw null;
        }
        if (collection == null) {
            l(2);
            throw null;
        }
        if (nVar == null) {
            l(3);
            throw null;
        }
        this.f135913c = eVar;
        this.f135914d = Collections.unmodifiableList(new ArrayList(list));
        this.f135915e = Collections.unmodifiableCollection(collection);
    }

    public static /* synthetic */ void l(int i14) {
        String str = (i14 == 4 || i14 == 5 || i14 == 6 || i14 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i14 == 4 || i14 == 5 || i14 == 6 || i14 == 7) ? 2 : 3];
        switch (i14) {
            case 1:
                objArr[0] = "parameters";
                break;
            case 2:
                objArr[0] = "supertypes";
                break;
            case 3:
                objArr[0] = "storageManager";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
                break;
            default:
                objArr[0] = "classDescriptor";
                break;
        }
        if (i14 == 4) {
            objArr[1] = "getParameters";
        } else if (i14 == 5) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i14 == 6) {
            objArr[1] = "computeSupertypes";
        } else if (i14 != 7) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
        } else {
            objArr[1] = "getSupertypeLoopChecker";
        }
        if (i14 != 4 && i14 != 5 && i14 != 6 && i14 != 7) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i14 != 4 && i14 != 5 && i14 != 6 && i14 != 7) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // p43.m1
    public final boolean C() {
        return true;
    }

    @Override // p43.n
    public final Collection<n0> d() {
        Collection<n0> collection = this.f135915e;
        if (collection != null) {
            return collection;
        }
        l(6);
        throw null;
    }

    @Override // p43.m1
    public final List<t23.d1> getParameters() {
        List<t23.d1> list = this.f135914d;
        if (list != null) {
            return list;
        }
        l(4);
        throw null;
    }

    @Override // p43.n
    public final t23.b1 h() {
        t23.b1.a aVar = t23.b1.a.f161998a;
        if (aVar != null) {
            return aVar;
        }
        l(7);
        throw null;
    }

    @Override // p43.b, p43.m1
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final t23.e t() {
        t23.e eVar = this.f135913c;
        if (eVar != null) {
            return eVar;
        }
        l(5);
        throw null;
    }

    public final String toString() {
        return b43.i.f(this.f135913c).f188600a;
    }
}
