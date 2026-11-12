package kotlin.reflect.jvm.internal.impl.name;

import com.huami.watch.dataflow.model.sport.bean.SportDetail;
import java.util.List;
import org.cybergarage.upnp.RootDescription;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class FqName {
    public static final FqName ROOT = new FqName("");

    @NotNull
    private final FqNameUnsafe a;
    private transient FqName b;

    public FqName(@NotNull String str) {
        if (str == null) {
            a(1);
        }
        this.a = new FqNameUnsafe(str, this);
    }

    private static /* synthetic */ void a(int i) {
        String str;
        int i2;
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 8:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                i2 = 2;
                break;
            case 8:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "fqName";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
            case 8:
                objArr[0] = "name";
                break;
            case 12:
                objArr[0] = SportDetail.COLUMN_SEGMENT;
                break;
            case 13:
                objArr[0] = "shortName";
                break;
            default:
                objArr[0] = "names";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
                objArr[1] = "toUnsafe";
                break;
            case 6:
            case 7:
                objArr[1] = "parent";
                break;
            case 8:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
            case 9:
                objArr[1] = "shortName";
                break;
            case 10:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 11:
                objArr[1] = "pathSegments";
                break;
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
                objArr[2] = "<init>";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                break;
            case 8:
                objArr[2] = "child";
                break;
            case 12:
                objArr[2] = "startsWith";
                break;
            case 13:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "fromSegments";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                throw new IllegalStateException(str2);
            case 8:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @NotNull
    public static FqName topLevel(@NotNull Name name) {
        if (name == null) {
            a(13);
        }
        return new FqName(FqNameUnsafe.topLevel(name));
    }

    @NotNull
    public String asString() {
        String strAsString = this.a.asString();
        if (strAsString == null) {
            a(4);
        }
        return strAsString;
    }

    @NotNull
    public FqName child(@NotNull Name name) {
        if (name == null) {
            a(8);
        }
        return new FqName(this.a.child(name), this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FqName) && this.a.equals(((FqName) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public boolean isRoot() {
        return this.a.isRoot();
    }

    @NotNull
    public FqName parent() {
        FqName fqName = this.b;
        if (fqName != null) {
            if (fqName == null) {
                a(6);
            }
            return fqName;
        }
        if (isRoot()) {
            throw new IllegalStateException(RootDescription.ROOT_ELEMENT);
        }
        FqName fqName2 = new FqName(this.a.parent());
        this.b = fqName2;
        return fqName2;
    }

    @NotNull
    public List<Name> pathSegments() {
        List<Name> listPathSegments = this.a.pathSegments();
        if (listPathSegments == null) {
            a(11);
        }
        return listPathSegments;
    }

    @NotNull
    public Name shortName() {
        Name nameShortName = this.a.shortName();
        if (nameShortName == null) {
            a(9);
        }
        return nameShortName;
    }

    @NotNull
    public Name shortNameOrSpecial() {
        Name nameShortNameOrSpecial = this.a.shortNameOrSpecial();
        if (nameShortNameOrSpecial == null) {
            a(10);
        }
        return nameShortNameOrSpecial;
    }

    public boolean startsWith(@NotNull Name name) {
        if (name == null) {
            a(12);
        }
        return this.a.startsWith(name);
    }

    public String toString() {
        return this.a.toString();
    }

    @NotNull
    public FqNameUnsafe toUnsafe() {
        FqNameUnsafe fqNameUnsafe = this.a;
        if (fqNameUnsafe == null) {
            a(5);
        }
        return fqNameUnsafe;
    }

    public FqName(@NotNull FqNameUnsafe fqNameUnsafe) {
        if (fqNameUnsafe == null) {
            a(2);
        }
        this.a = fqNameUnsafe;
    }

    private FqName(@NotNull FqNameUnsafe fqNameUnsafe, FqName fqName) {
        if (fqNameUnsafe == null) {
            a(3);
        }
        this.a = fqNameUnsafe;
        this.b = fqName;
    }
}
