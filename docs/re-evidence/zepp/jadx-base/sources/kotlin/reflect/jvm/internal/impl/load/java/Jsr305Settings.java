package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.collections.e;
import kotlin.collections.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
public final class Jsr305Settings {

    @NotNull
    private final ReportLevel a;

    @Nullable
    private final ReportLevel b;

    @NotNull
    private final Map<FqName, ReportLevel> c;

    @NotNull
    private final Lazy d;
    private final boolean e;

    public static final class a extends Lambda implements Function0<String[]> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String[] invoke() {
            Jsr305Settings jsr305Settings = Jsr305Settings.this;
            List listCreateListBuilder = e.createListBuilder();
            listCreateListBuilder.add(jsr305Settings.getGlobalLevel().getDescription());
            ReportLevel migrationLevel = jsr305Settings.getMigrationLevel();
            if (migrationLevel != null) {
                listCreateListBuilder.add(Intrinsics.stringPlus("under-migration:", migrationLevel.getDescription()));
            }
            for (Map.Entry<FqName, ReportLevel> entry : jsr305Settings.getUserDefinedLevelForSpecificAnnotation().entrySet()) {
                listCreateListBuilder.add('@' + entry.getKey() + JsonLexerKt.COLON + entry.getValue().getDescription());
            }
            Object[] array = e.build(listCreateListBuilder).toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            return (String[]) array;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Jsr305Settings(@NotNull ReportLevel reportLevel, @Nullable ReportLevel reportLevel2, @NotNull Map<FqName, ? extends ReportLevel> map) {
        this.a = reportLevel;
        this.b = reportLevel2;
        this.c = map;
        this.d = LazyKt__LazyJVMKt.lazy(new a());
        ReportLevel reportLevel3 = ReportLevel.IGNORE;
        this.e = reportLevel == reportLevel3 && reportLevel2 == reportLevel3 && map.isEmpty();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Jsr305Settings)) {
            return false;
        }
        Jsr305Settings jsr305Settings = (Jsr305Settings) obj;
        return this.a == jsr305Settings.a && this.b == jsr305Settings.b && Intrinsics.areEqual(this.c, jsr305Settings.c);
    }

    @NotNull
    public final ReportLevel getGlobalLevel() {
        return this.a;
    }

    @Nullable
    public final ReportLevel getMigrationLevel() {
        return this.b;
    }

    @NotNull
    public final Map<FqName, ReportLevel> getUserDefinedLevelForSpecificAnnotation() {
        return this.c;
    }

    public int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        ReportLevel reportLevel = this.b;
        return ((iHashCode + (reportLevel == null ? 0 : reportLevel.hashCode())) * 31) + this.c.hashCode();
    }

    public final boolean isDisabled() {
        return this.e;
    }

    @NotNull
    public String toString() {
        return "Jsr305Settings(globalLevel=" + this.a + ", migrationLevel=" + this.b + ", userDefinedLevelForSpecificAnnotation=" + this.c + ')';
    }

    public /* synthetic */ Jsr305Settings(ReportLevel reportLevel, ReportLevel reportLevel2, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(reportLevel, (i & 2) != 0 ? null : reportLevel2, (i & 4) != 0 ? r.emptyMap() : map);
    }
}
