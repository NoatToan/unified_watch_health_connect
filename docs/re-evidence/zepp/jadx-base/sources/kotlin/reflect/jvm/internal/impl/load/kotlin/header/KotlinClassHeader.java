package kotlin.reflect.jvm.internal.impl.load.kotlin.header;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.q;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.e;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
public final class KotlinClassHeader {

    @NotNull
    private final Kind a;

    @NotNull
    private final JvmMetadataVersion b;

    @Nullable
    private final String[] c;

    @Nullable
    private final String[] d;

    @Nullable
    private final String[] e;

    @Nullable
    private final String f;
    private final int g;

    @Nullable
    private final String h;

    public enum Kind {
        UNKNOWN(0),
        CLASS(1),
        FILE_FACADE(2),
        SYNTHETIC_CLASS(3),
        MULTIFILE_CLASS(4),
        MULTIFILE_CLASS_PART(5);


        @NotNull
        public static final Companion Companion = new Companion(null);

        @NotNull
        private static final Map<Integer, Kind> entryById;
        private final int id;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            @NotNull
            public final Kind getById(int i) {
                Kind kind = (Kind) Kind.entryById.get(Integer.valueOf(i));
                return kind == null ? Kind.UNKNOWN : kind;
            }
        }

        static {
            Kind[] kindArrValues = values();
            LinkedHashMap linkedHashMap = new LinkedHashMap(e.coerceAtLeast(q.mapCapacity(kindArrValues.length), 16));
            for (Kind kind : kindArrValues) {
                linkedHashMap.put(Integer.valueOf(kind.getId()), kind);
            }
            entryById = linkedHashMap;
        }

        Kind(int i) {
            this.id = i;
        }

        @JvmStatic
        @NotNull
        public static final Kind getById(int i) {
            return Companion.getById(i);
        }

        public final int getId() {
            return this.id;
        }
    }

    public KotlinClassHeader(@NotNull Kind kind, @NotNull JvmMetadataVersion jvmMetadataVersion, @Nullable String[] strArr, @Nullable String[] strArr2, @Nullable String[] strArr3, @Nullable String str, int i, @Nullable String str2) {
        this.a = kind;
        this.b = jvmMetadataVersion;
        this.c = strArr;
        this.d = strArr2;
        this.e = strArr3;
        this.f = str;
        this.g = i;
        this.h = str2;
    }

    private final boolean a(int i, int i2) {
        return (i & i2) != 0;
    }

    @Nullable
    public final String[] getData() {
        return this.c;
    }

    @Nullable
    public final String[] getIncompatibleData() {
        return this.d;
    }

    @NotNull
    public final Kind getKind() {
        return this.a;
    }

    @NotNull
    public final JvmMetadataVersion getMetadataVersion() {
        return this.b;
    }

    @Nullable
    public final String getMultifileClassName() {
        String str = this.f;
        if (getKind() == Kind.MULTIFILE_CLASS_PART) {
            return str;
        }
        return null;
    }

    @NotNull
    public final List<String> getMultifilePartNames() {
        String[] strArr = this.c;
        if (!(getKind() == Kind.MULTIFILE_CLASS)) {
            strArr = null;
        }
        List<String> listAsList = strArr != null ? ArraysKt___ArraysJvmKt.asList(strArr) : null;
        return listAsList != null ? listAsList : CollectionsKt__CollectionsKt.emptyList();
    }

    @Nullable
    public final String[] getStrings() {
        return this.e;
    }

    public final boolean isPreRelease() {
        return a(this.g, 2);
    }

    public final boolean isUnstableFirBinary() {
        return a(this.g, 64) && !a(this.g, 32);
    }

    public final boolean isUnstableJvmIrBinary() {
        return a(this.g, 16) && !a(this.g, 32);
    }

    @NotNull
    public String toString() {
        return this.a + " version=" + this.b;
    }
}
