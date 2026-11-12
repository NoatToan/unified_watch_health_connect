package kotlin.uuid;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@ExperimentalUuidApi
final class UuidSerialized implements Externalizable {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final long serialVersionUID = 0;
    private long leastSignificantBits;
    private long mostSignificantBits;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public UuidSerialized(long j, long j2) {
        this.mostSignificantBits = j;
        this.leastSignificantBits = j2;
    }

    private final Object readResolve() {
        return Uuid.Companion.fromLongs(this.mostSignificantBits, this.leastSignificantBits);
    }

    public final long getLeastSignificantBits() {
        return this.leastSignificantBits;
    }

    public final long getMostSignificantBits() {
        return this.mostSignificantBits;
    }

    @Override // java.io.Externalizable
    public void readExternal(@NotNull ObjectInput input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.mostSignificantBits = input.readLong();
        this.leastSignificantBits = input.readLong();
    }

    public final void setLeastSignificantBits(long j) {
        this.leastSignificantBits = j;
    }

    public final void setMostSignificantBits(long j) {
        this.mostSignificantBits = j;
    }

    @Override // java.io.Externalizable
    public void writeExternal(@NotNull ObjectOutput output) throws IOException {
        Intrinsics.checkNotNullParameter(output, "output");
        output.writeLong(this.mostSignificantBits);
        output.writeLong(this.leastSignificantBits);
    }

    public UuidSerialized() {
        this(0L, 0L);
    }
}
