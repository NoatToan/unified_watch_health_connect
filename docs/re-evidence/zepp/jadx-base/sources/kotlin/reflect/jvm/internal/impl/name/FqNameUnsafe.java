package kotlin.reflect.jvm.internal.impl.name;

import com.huami.watch.dataflow.model.sport.bean.SportDetail;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import org.cybergarage.upnp.RootDescription;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class FqNameUnsafe {
    private static final Name e = Name.special("<root>");
    private static final Pattern f = Pattern.compile("\\.");
    private static final Function1<String, Name> g = new a();

    @NotNull
    private final String a;
    private transient FqName b;
    private transient FqNameUnsafe c;
    private transient Name d;

    public static class a implements Function1<String, Name> {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Name invoke(String str) {
            return Name.guessByFirstCharacter(str);
        }
    }

    public FqNameUnsafe(@NotNull String str, @NotNull FqName fqName) {
        if (str == null) {
            a(0);
        }
        if (fqName == null) {
            a(1);
        }
        this.a = str;
        this.b = fqName;
    }

    private static /* synthetic */ void a(int i) {
        String str;
        int i2;
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 9:
            case 15:
            case 16:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                i2 = 2;
                break;
            case 9:
            case 15:
            case 16:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        if (i != 1) {
            switch (i) {
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 17:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                    break;
                case 9:
                    objArr[0] = "name";
                    break;
                case 15:
                    objArr[0] = SportDetail.COLUMN_SEGMENT;
                    break;
                case 16:
                    objArr[0] = "shortName";
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
        } else {
            objArr[0] = "safe";
        }
        switch (i) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
            case 6:
                objArr[1] = "toSafe";
                break;
            case 7:
            case 8:
                objArr[1] = "parent";
                break;
            case 9:
            case 15:
            case 16:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                break;
            case 10:
            case 11:
                objArr[1] = "shortName";
                break;
            case 12:
            case 13:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 14:
                objArr[1] = "pathSegments";
                break;
            case 17:
                objArr[1] = "toString";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                break;
            case 9:
                objArr[2] = "child";
                break;
            case 15:
                objArr[2] = "startsWith";
                break;
            case 16:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                throw new IllegalStateException(str2);
            case 9:
            case 15:
            case 16:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    private void b() {
        int iLastIndexOf = this.a.lastIndexOf(46);
        if (iLastIndexOf >= 0) {
            this.d = Name.guessByFirstCharacter(this.a.substring(iLastIndexOf + 1));
            this.c = new FqNameUnsafe(this.a.substring(0, iLastIndexOf));
        } else {
            this.d = Name.guessByFirstCharacter(this.a);
            this.c = FqName.ROOT.toUnsafe();
        }
    }

    @NotNull
    public static FqNameUnsafe topLevel(@NotNull Name name) {
        if (name == null) {
            a(16);
        }
        return new FqNameUnsafe(name.asString(), FqName.ROOT.toUnsafe(), name);
    }

    @NotNull
    public String asString() {
        String str = this.a;
        if (str == null) {
            a(4);
        }
        return str;
    }

    @NotNull
    public FqNameUnsafe child(@NotNull Name name) {
        String strAsString;
        if (name == null) {
            a(9);
        }
        if (isRoot()) {
            strAsString = name.asString();
        } else {
            strAsString = this.a + "." + name.asString();
        }
        return new FqNameUnsafe(strAsString, this, name);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FqNameUnsafe) && this.a.equals(((FqNameUnsafe) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public boolean isRoot() {
        return this.a.isEmpty();
    }

    public boolean isSafe() {
        return this.b != null || asString().indexOf(60) < 0;
    }

    @NotNull
    public FqNameUnsafe parent() {
        FqNameUnsafe fqNameUnsafe = this.c;
        if (fqNameUnsafe != null) {
            if (fqNameUnsafe == null) {
                a(7);
            }
            return fqNameUnsafe;
        }
        if (isRoot()) {
            throw new IllegalStateException(RootDescription.ROOT_ELEMENT);
        }
        b();
        FqNameUnsafe fqNameUnsafe2 = this.c;
        if (fqNameUnsafe2 == null) {
            a(8);
        }
        return fqNameUnsafe2;
    }

    @NotNull
    public List<Name> pathSegments() {
        List<Name> listEmptyList = isRoot() ? Collections.emptyList() : ArraysKt___ArraysKt.map(f.split(this.a), g);
        if (listEmptyList == null) {
            a(14);
        }
        return listEmptyList;
    }

    @NotNull
    public Name shortName() {
        Name name = this.d;
        if (name != null) {
            if (name == null) {
                a(10);
            }
            return name;
        }
        if (isRoot()) {
            throw new IllegalStateException(RootDescription.ROOT_ELEMENT);
        }
        b();
        Name name2 = this.d;
        if (name2 == null) {
            a(11);
        }
        return name2;
    }

    @NotNull
    public Name shortNameOrSpecial() {
        if (isRoot()) {
            Name name = e;
            if (name == null) {
                a(12);
            }
            return name;
        }
        Name nameShortName = shortName();
        if (nameShortName == null) {
            a(13);
        }
        return nameShortName;
    }

    public boolean startsWith(@NotNull Name name) {
        if (name == null) {
            a(15);
        }
        if (isRoot()) {
            return false;
        }
        int iIndexOf = this.a.indexOf(46);
        String str = this.a;
        String strAsString = name.asString();
        if (iIndexOf == -1) {
            iIndexOf = this.a.length();
        }
        return str.regionMatches(0, strAsString, 0, iIndexOf);
    }

    @NotNull
    public FqName toSafe() {
        FqName fqName = this.b;
        if (fqName != null) {
            if (fqName == null) {
                a(5);
            }
            return fqName;
        }
        FqName fqName2 = new FqName(this);
        this.b = fqName2;
        return fqName2;
    }

    @NotNull
    public String toString() {
        String strAsString = isRoot() ? e.asString() : this.a;
        if (strAsString == null) {
            a(17);
        }
        return strAsString;
    }

    public FqNameUnsafe(@NotNull String str) {
        if (str == null) {
            a(2);
        }
        this.a = str;
    }

    private FqNameUnsafe(@NotNull String str, FqNameUnsafe fqNameUnsafe, Name name) {
        if (str == null) {
            a(3);
        }
        this.a = str;
        this.c = fqNameUnsafe;
        this.d = name;
    }
}
