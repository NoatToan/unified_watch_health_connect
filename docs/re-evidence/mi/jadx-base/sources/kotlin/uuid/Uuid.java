package kotlin.uuid;

import java.io.Serializable;
import java.util.Comparator;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.ULong;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.HexExtensionsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.uuid.Uuid;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@SinceKotlin(version = "2.0")
@ExperimentalUuidApi
public final class Uuid implements Serializable {
    public static final int SIZE_BITS = 128;
    public static final int SIZE_BYTES = 16;
    private final long leastSignificantBits;
    private final long mostSignificantBits;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final Uuid NIL = new Uuid(0, 0);

    @NotNull
    private static final Comparator<Uuid> LEXICAL_ORDER = new Comparator() { // from class: omq
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Uuid.LEXICAL_ORDER$lambda$0((Uuid) obj, (Uuid) obj2);
        }
    };

    @SourceDebugExtension({"SMAP\nUuid.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Uuid.kt\nkotlin/uuid/Uuid$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,452:1\n1#2:453\n*E\n"})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Uuid fromByteArray(@NotNull byte[] byteArray) {
            Intrinsics.checkNotNullParameter(byteArray, "byteArray");
            if (byteArray.length == 16) {
                return fromLongs(UuidKt__UuidKt.toLong$UuidKt__UuidKt(byteArray, 0), UuidKt__UuidKt.toLong$UuidKt__UuidKt(byteArray, 8));
            }
            throw new IllegalArgumentException("Expected exactly 16 bytes".toString());
        }

        @NotNull
        public final Uuid fromLongs(long j, long j2) {
            return (j == 0 && j2 == 0) ? getNIL() : new Uuid(j, j2);
        }

        @NotNull
        /* JADX INFO: renamed from: fromULongs-eb3DHEI, reason: not valid java name */
        public final Uuid m2374fromULongseb3DHEI(long j, long j2) {
            return fromLongs(j, j2);
        }

        @NotNull
        public final Comparator<Uuid> getLEXICAL_ORDER() {
            return Uuid.LEXICAL_ORDER;
        }

        @NotNull
        public final Uuid getNIL() {
            return Uuid.NIL;
        }

        @NotNull
        public final Uuid parse(@NotNull String uuidString) {
            Intrinsics.checkNotNullParameter(uuidString, "uuidString");
            if (uuidString.length() != 36) {
                throw new IllegalArgumentException("Expected a 36-char string in the standard uuid format.".toString());
            }
            long jHexToLong$default = HexExtensionsKt.hexToLong$default(uuidString, 0, 8, null, 4, null);
            UuidKt__UuidKt.checkHyphenAt$UuidKt__UuidKt(uuidString, 8);
            long jHexToLong$default2 = HexExtensionsKt.hexToLong$default(uuidString, 9, 13, null, 4, null);
            UuidKt__UuidKt.checkHyphenAt$UuidKt__UuidKt(uuidString, 13);
            long jHexToLong$default3 = HexExtensionsKt.hexToLong$default(uuidString, 14, 18, null, 4, null);
            UuidKt__UuidKt.checkHyphenAt$UuidKt__UuidKt(uuidString, 18);
            long jHexToLong$default4 = HexExtensionsKt.hexToLong$default(uuidString, 19, 23, null, 4, null);
            UuidKt__UuidKt.checkHyphenAt$UuidKt__UuidKt(uuidString, 23);
            return fromLongs((jHexToLong$default << 32) | (jHexToLong$default2 << 16) | jHexToLong$default3, HexExtensionsKt.hexToLong$default(uuidString, 24, 36, null, 4, null) | (jHexToLong$default4 << 48));
        }

        @NotNull
        public final Uuid parseHex(@NotNull String hexString) {
            Intrinsics.checkNotNullParameter(hexString, "hexString");
            if (hexString.length() == 32) {
                return fromLongs(HexExtensionsKt.hexToLong$default(hexString, 0, 16, null, 4, null), HexExtensionsKt.hexToLong$default(hexString, 16, 32, null, 4, null));
            }
            throw new IllegalArgumentException("Expected a 32-char hexadecimal string.".toString());
        }

        @NotNull
        public final Uuid random() {
            return UuidKt__UuidJVMKt.secureRandomUuid();
        }
    }

    public Uuid(long j, long j2) {
        this.mostSignificantBits = j;
        this.leastSignificantBits = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int LEXICAL_ORDER$lambda$0(Uuid a2, Uuid b2) {
        Intrinsics.checkNotNullParameter(a2, "a");
        Intrinsics.checkNotNullParameter(b2, "b");
        long j = a2.mostSignificantBits;
        return j != b2.mostSignificantBits ? Long.compareUnsigned(ULong.m1060constructorimpl(j), ULong.m1060constructorimpl(b2.mostSignificantBits)) : Long.compareUnsigned(ULong.m1060constructorimpl(a2.leastSignificantBits), ULong.m1060constructorimpl(b2.leastSignificantBits));
    }

    @PublishedApi
    public static /* synthetic */ void getLeastSignificantBits$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getMostSignificantBits$annotations() {
    }

    @InlineOnly
    private final <T> T toLongs(Function2<? super Long, ? super Long, ? extends T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(Long.valueOf(getMostSignificantBits()), Long.valueOf(getLeastSignificantBits()));
    }

    @InlineOnly
    private final <T> T toULongs(Function2<? super ULong, ? super ULong, ? extends T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(ULong.m1054boximpl(ULong.m1060constructorimpl(getMostSignificantBits())), ULong.m1054boximpl(ULong.m1060constructorimpl(getLeastSignificantBits())));
    }

    private final Object writeReplace() {
        return UuidKt__UuidJVMKt.serializedUuid(this);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Uuid)) {
            return false;
        }
        Uuid uuid = (Uuid) obj;
        return this.mostSignificantBits == uuid.mostSignificantBits && this.leastSignificantBits == uuid.leastSignificantBits;
    }

    public final long getLeastSignificantBits() {
        return this.leastSignificantBits;
    }

    public final long getMostSignificantBits() {
        return this.mostSignificantBits;
    }

    public int hashCode() {
        long j = this.mostSignificantBits ^ this.leastSignificantBits;
        return ((int) j) ^ ((int) (j >> 32));
    }

    @NotNull
    public final byte[] toByteArray() {
        byte[] bArr = new byte[16];
        UuidKt__UuidKt.toByteArray$UuidKt__UuidKt(this.mostSignificantBits, bArr, 0);
        UuidKt__UuidKt.toByteArray$UuidKt__UuidKt(this.leastSignificantBits, bArr, 8);
        return bArr;
    }

    @NotNull
    public final String toHexString() {
        byte[] bArr = new byte[32];
        UuidKt__UuidKt.formatBytesInto$UuidKt__UuidKt(this.leastSignificantBits, bArr, 16, 8);
        UuidKt__UuidKt.formatBytesInto$UuidKt__UuidKt(this.mostSignificantBits, bArr, 0, 8);
        return StringsKt__StringsJVMKt.decodeToString(bArr);
    }

    @NotNull
    public String toString() {
        byte[] bArr = new byte[36];
        UuidKt__UuidKt.formatBytesInto$UuidKt__UuidKt(this.leastSignificantBits, bArr, 24, 6);
        bArr[23] = 45;
        UuidKt__UuidKt.formatBytesInto$UuidKt__UuidKt(this.leastSignificantBits >>> 48, bArr, 19, 2);
        bArr[18] = 45;
        UuidKt__UuidKt.formatBytesInto$UuidKt__UuidKt(this.mostSignificantBits, bArr, 14, 2);
        bArr[13] = 45;
        UuidKt__UuidKt.formatBytesInto$UuidKt__UuidKt(this.mostSignificantBits >>> 16, bArr, 9, 2);
        bArr[8] = 45;
        UuidKt__UuidKt.formatBytesInto$UuidKt__UuidKt(this.mostSignificantBits >>> 32, bArr, 0, 4);
        return StringsKt__StringsJVMKt.decodeToString(bArr);
    }
}
