package kotlin.reflect.jvm.internal.impl.name;

import com.huami.watch.dataflow.model.sport.bean.SportDetail;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
public final class ClassId {
    public static final /* synthetic */ boolean d = false;
    private final FqName a;
    private final FqName b;
    private final boolean c;

    public ClassId(@NotNull FqName fqName, @NotNull FqName fqName2, boolean z) {
        if (fqName == null) {
            a(1);
        }
        if (fqName2 == null) {
            a(2);
        }
        this.a = fqName;
        this.b = fqName2;
        this.c = z;
    }

    private static /* synthetic */ void a(int i) {
        String str = (i == 5 || i == 6 || i == 7 || i == 9 || i == 13 || i == 14) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 5 || i == 6 || i == 7 || i == 9 || i == 13 || i == 14) ? 2 : 3];
        switch (i) {
            case 1:
            case 3:
                objArr[0] = "packageFqName";
                break;
            case 2:
                objArr[0] = "relativeClassName";
                break;
            case 4:
                objArr[0] = "topLevelName";
                break;
            case 5:
            case 6:
            case 7:
            case 9:
            case 13:
            case 14:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/name/ClassId";
                break;
            case 8:
                objArr[0] = "name";
                break;
            case 10:
                objArr[0] = SportDetail.COLUMN_SEGMENT;
                break;
            case 11:
            case 12:
                objArr[0] = "string";
                break;
            default:
                objArr[0] = "topLevelFqName";
                break;
        }
        if (i == 5) {
            objArr[1] = "getPackageFqName";
        } else if (i == 6) {
            objArr[1] = "getRelativeClassName";
        } else if (i == 7) {
            objArr[1] = "getShortClassName";
        } else if (i == 9) {
            objArr[1] = "asSingleFqName";
        } else if (i == 13 || i == 14) {
            objArr[1] = "asString";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/name/ClassId";
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
                objArr[2] = "<init>";
                break;
            case 5:
            case 6:
            case 7:
            case 9:
            case 13:
            case 14:
                break;
            case 8:
                objArr[2] = "createNestedClassId";
                break;
            case 10:
                objArr[2] = "startsWith";
                break;
            case 11:
            case 12:
                objArr[2] = "fromString";
                break;
            default:
                objArr[2] = "topLevel";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 5 && i != 6 && i != 7 && i != 9 && i != 13 && i != 14) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @NotNull
    public static ClassId fromString(@NotNull String str) {
        if (str == null) {
            a(11);
        }
        return fromString(str, false);
    }

    @NotNull
    public static ClassId topLevel(@NotNull FqName fqName) {
        if (fqName == null) {
            a(0);
        }
        return new ClassId(fqName.parent(), fqName.shortName());
    }

    @NotNull
    public FqName asSingleFqName() {
        if (this.a.isRoot()) {
            FqName fqName = this.b;
            if (fqName == null) {
                a(9);
            }
            return fqName;
        }
        return new FqName(this.a.asString() + "." + this.b.asString());
    }

    @NotNull
    public String asString() {
        if (this.a.isRoot()) {
            String strAsString = this.b.asString();
            if (strAsString == null) {
                a(13);
            }
            return strAsString;
        }
        String str = this.a.asString().replace('.', '/') + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + this.b.asString();
        if (str == null) {
            a(14);
        }
        return str;
    }

    @NotNull
    public ClassId createNestedClassId(@NotNull Name name) {
        if (name == null) {
            a(8);
        }
        return new ClassId(getPackageFqName(), this.b.child(name), this.c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ClassId.class != obj.getClass()) {
            return false;
        }
        ClassId classId = (ClassId) obj;
        return this.a.equals(classId.a) && this.b.equals(classId.b) && this.c == classId.c;
    }

    @Nullable
    public ClassId getOuterClassId() {
        FqName fqNameParent = this.b.parent();
        if (fqNameParent.isRoot()) {
            return null;
        }
        return new ClassId(getPackageFqName(), fqNameParent, this.c);
    }

    @NotNull
    public FqName getPackageFqName() {
        FqName fqName = this.a;
        if (fqName == null) {
            a(5);
        }
        return fqName;
    }

    @NotNull
    public FqName getRelativeClassName() {
        FqName fqName = this.b;
        if (fqName == null) {
            a(6);
        }
        return fqName;
    }

    @NotNull
    public Name getShortClassName() {
        Name nameShortName = this.b.shortName();
        if (nameShortName == null) {
            a(7);
        }
        return nameShortName;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + Boolean.valueOf(this.c).hashCode();
    }

    public boolean isLocal() {
        return this.c;
    }

    public boolean isNestedClass() {
        return !this.b.parent().isRoot();
    }

    public String toString() {
        if (!this.a.isRoot()) {
            return asString();
        }
        return FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + asString();
    }

    @NotNull
    public static ClassId fromString(@NotNull String str, boolean z) {
        String str2;
        if (str == null) {
            a(12);
        }
        int iLastIndexOf = str.lastIndexOf(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE);
        if (iLastIndexOf == -1) {
            str2 = "";
        } else {
            String strReplace = str.substring(0, iLastIndexOf).replace('/', '.');
            str = str.substring(iLastIndexOf + 1);
            str2 = strReplace;
        }
        return new ClassId(new FqName(str2), new FqName(str), z);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ClassId(@NotNull FqName fqName, @NotNull Name name) {
        this(fqName, FqName.topLevel(name), false);
        if (fqName == null) {
            a(3);
        }
        if (name == null) {
            a(4);
        }
    }
}
