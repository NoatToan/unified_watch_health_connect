package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import io.netty.util.internal.StringUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.DeprecationLevel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
public final class VersionRequirement {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final Version a;

    @NotNull
    private final ProtoBuf.VersionRequirement.VersionKind b;

    @NotNull
    private final DeprecationLevel c;

    @Nullable
    private final Integer d;

    @Nullable
    private final String e;

    public static final class Version {

        @NotNull
        public static final Companion Companion = new Companion(null);

        @JvmField
        @NotNull
        public static final Version INFINITY = new Version(256, 256, 256);
        private final int a;
        private final int b;
        private final int c;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final Version decode(@Nullable Integer num, @Nullable Integer num2) {
                if (num2 != null) {
                    return new Version(num2.intValue() & 255, (num2.intValue() >> 8) & 255, (num2.intValue() >> 16) & 255);
                }
                return num != null ? new Version(num.intValue() & 7, (num.intValue() >> 3) & 15, (num.intValue() >> 7) & 127) : Version.INFINITY;
            }
        }

        public Version(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }

        @NotNull
        public final String asString() {
            StringBuilder sb;
            int i;
            if (this.c == 0) {
                sb = new StringBuilder();
                sb.append(this.a);
                sb.append('.');
                i = this.b;
            } else {
                sb = new StringBuilder();
                sb.append(this.a);
                sb.append('.');
                sb.append(this.b);
                sb.append('.');
                i = this.c;
            }
            sb.append(i);
            return sb.toString();
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Version)) {
                return false;
            }
            Version version = (Version) obj;
            return this.a == version.a && this.b == version.b && this.c == version.c;
        }

        public int hashCode() {
            return (((this.a * 31) + this.b) * 31) + this.c;
        }

        @NotNull
        public String toString() {
            return asString();
        }

        public /* synthetic */ Version(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, i2, (i4 & 4) != 0 ? 0 : i3);
        }
    }

    public VersionRequirement(@NotNull Version version, @NotNull ProtoBuf.VersionRequirement.VersionKind versionKind, @NotNull DeprecationLevel deprecationLevel, @Nullable Integer num, @Nullable String str) {
        this.a = version;
        this.b = versionKind;
        this.c = deprecationLevel;
        this.d = num;
        this.e = str;
    }

    @NotNull
    public final ProtoBuf.VersionRequirement.VersionKind getKind() {
        return this.b;
    }

    @NotNull
    public final Version getVersion() {
        return this.a;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("since ");
        sb.append(this.a);
        sb.append(StringUtil.SPACE);
        sb.append(this.c);
        Integer num = this.d;
        sb.append(num != null ? Intrinsics.stringPlus(" error ", num) : "");
        String str = this.e;
        sb.append(str != null ? Intrinsics.stringPlus(": ", str) : "");
        return sb.toString();
    }

    public static final class Companion {

        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ProtoBuf.VersionRequirement.Level.values().length];
                iArr[ProtoBuf.VersionRequirement.Level.WARNING.ordinal()] = 1;
                iArr[ProtoBuf.VersionRequirement.Level.ERROR.ordinal()] = 2;
                iArr[ProtoBuf.VersionRequirement.Level.HIDDEN.ordinal()] = 3;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final List<VersionRequirement> create(@NotNull MessageLite messageLite, @NotNull NameResolver nameResolver, @NotNull VersionRequirementTable versionRequirementTable) {
            List<Integer> versionRequirementList;
            if (messageLite instanceof ProtoBuf.Class) {
                versionRequirementList = ((ProtoBuf.Class) messageLite).getVersionRequirementList();
            } else if (messageLite instanceof ProtoBuf.Constructor) {
                versionRequirementList = ((ProtoBuf.Constructor) messageLite).getVersionRequirementList();
            } else if (messageLite instanceof ProtoBuf.Function) {
                versionRequirementList = ((ProtoBuf.Function) messageLite).getVersionRequirementList();
            } else if (messageLite instanceof ProtoBuf.Property) {
                versionRequirementList = ((ProtoBuf.Property) messageLite).getVersionRequirementList();
            } else {
                if (!(messageLite instanceof ProtoBuf.TypeAlias)) {
                    throw new IllegalStateException(Intrinsics.stringPlus("Unexpected declaration: ", messageLite.getClass()));
                }
                versionRequirementList = ((ProtoBuf.TypeAlias) messageLite).getVersionRequirementList();
            }
            ArrayList arrayList = new ArrayList();
            Iterator<T> it2 = versionRequirementList.iterator();
            while (it2.hasNext()) {
                VersionRequirement versionRequirementCreate = VersionRequirement.Companion.create(((Integer) it2.next()).intValue(), nameResolver, versionRequirementTable);
                if (versionRequirementCreate != null) {
                    arrayList.add(versionRequirementCreate);
                }
            }
            return arrayList;
        }

        @Nullable
        public final VersionRequirement create(int i, @NotNull NameResolver nameResolver, @NotNull VersionRequirementTable versionRequirementTable) {
            DeprecationLevel deprecationLevel;
            ProtoBuf.VersionRequirement versionRequirement = versionRequirementTable.get(i);
            if (versionRequirement == null) {
                return null;
            }
            Version versionDecode = Version.Companion.decode(versionRequirement.hasVersion() ? Integer.valueOf(versionRequirement.getVersion()) : null, versionRequirement.hasVersionFull() ? Integer.valueOf(versionRequirement.getVersionFull()) : null);
            int i2 = WhenMappings.$EnumSwitchMapping$0[versionRequirement.getLevel().ordinal()];
            if (i2 == 1) {
                deprecationLevel = DeprecationLevel.WARNING;
            } else if (i2 == 2) {
                deprecationLevel = DeprecationLevel.ERROR;
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                deprecationLevel = DeprecationLevel.HIDDEN;
            }
            return new VersionRequirement(versionDecode, versionRequirement.getVersionKind(), deprecationLevel, versionRequirement.hasErrorCode() ? Integer.valueOf(versionRequirement.getErrorCode()) : null, versionRequirement.hasMessage() ? nameResolver.getString(versionRequirement.getMessage()) : null);
        }
    }
}
