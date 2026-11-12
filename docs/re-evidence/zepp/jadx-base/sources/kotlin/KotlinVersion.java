package kotlin;

import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
@SinceKotlin(version = "1.1")
public final class KotlinVersion implements Comparable<KotlinVersion> {
    public static final int MAX_COMPONENT_VALUE = 255;
    private final int a;
    private final int b;
    private final int c;
    private final int d;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @JvmField
    @NotNull
    public static final KotlinVersion CURRENT = b.a();

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public KotlinVersion(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = a(i, i2, i3);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0020  */
    private final int a(int i, int i2, int i3) {
        boolean z;
        if (i >= 0 && i < 256) {
            if (i2 >= 0 && i2 < 256) {
                z = i3 >= 0 && i3 < 256;
            }
        }
        if (z) {
            return (i << 16) + (i2 << 8) + i3;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i + '.' + i2 + '.' + i3).toString());
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        KotlinVersion kotlinVersion = obj instanceof KotlinVersion ? (KotlinVersion) obj : null;
        return kotlinVersion != null && this.d == kotlinVersion.d;
    }

    public final int getMajor() {
        return this.a;
    }

    public final int getMinor() {
        return this.b;
    }

    public final int getPatch() {
        return this.c;
    }

    public int hashCode() {
        return this.d;
    }

    public final boolean isAtLeast(int i, int i2) {
        int i3 = this.a;
        return i3 > i || (i3 == i && this.b >= i2);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('.');
        sb.append(this.b);
        sb.append('.');
        sb.append(this.c);
        return sb.toString();
    }

    @Override // java.lang.Comparable
    public int compareTo(@NotNull KotlinVersion kotlinVersion) {
        return this.d - kotlinVersion.d;
    }

    public final boolean isAtLeast(int i, int i2, int i3) {
        int i4;
        int i5 = this.a;
        return i5 > i || (i5 == i && ((i4 = this.b) > i2 || (i4 == i2 && this.c >= i3)));
    }

    public KotlinVersion(int i, int i2) {
        this(i, i2, 0);
    }
}
