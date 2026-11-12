package kotlin.reflect.jvm.internal.impl.name;

import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
public final class CallableId {

    @NotNull
    private static final a e = new a(null);

    @Deprecated
    @NotNull
    private static final Name f;

    @Deprecated
    @NotNull
    private static final FqName g;

    @NotNull
    private final FqName a;

    @Nullable
    private final FqName b;

    @NotNull
    private final Name c;

    @Nullable
    private final FqName d;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        Name nameSpecial = Name.special("<local>");
        f = nameSpecial;
        g = FqName.topLevel(nameSpecial);
    }

    public CallableId(@NotNull FqName fqName, @Nullable FqName fqName2, @NotNull Name name, @Nullable FqName fqName3) {
        this.a = fqName;
        this.b = fqName2;
        this.c = name;
        this.d = fqName3;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CallableId)) {
            return false;
        }
        CallableId callableId = (CallableId) obj;
        return Intrinsics.areEqual(this.a, callableId.a) && Intrinsics.areEqual(this.b, callableId.b) && Intrinsics.areEqual(this.c, callableId.c) && Intrinsics.areEqual(this.d, callableId.d);
    }

    @NotNull
    public final Name getCallableName() {
        return this.c;
    }

    @Nullable
    public final FqName getClassName() {
        return this.b;
    }

    @NotNull
    public final FqName getPackageName() {
        return this.a;
    }

    public int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        FqName fqName = this.b;
        int iHashCode2 = (((iHashCode + (fqName == null ? 0 : fqName.hashCode())) * 31) + this.c.hashCode()) * 31;
        FqName fqName2 = this.d;
        return iHashCode2 + (fqName2 != null ? fqName2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(m.replace$default(getPackageName().asString(), '.', '/', false, 4, (Object) null));
        sb.append(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE);
        if (getClassName() != null) {
            sb.append(getClassName());
            sb.append(".");
        }
        sb.append(getCallableName());
        return sb.toString();
    }

    public /* synthetic */ CallableId(FqName fqName, FqName fqName2, Name name, FqName fqName3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(fqName, fqName2, name, (i & 8) != 0 ? null : fqName3);
    }

    public CallableId(@NotNull FqName fqName, @NotNull Name name) {
        this(fqName, null, name, null, 8, null);
    }
}
