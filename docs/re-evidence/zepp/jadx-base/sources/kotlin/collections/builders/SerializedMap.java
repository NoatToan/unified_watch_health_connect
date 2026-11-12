package kotlin.collections.builders;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.q;
import kotlin.collections.r;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
final class SerializedMap implements Externalizable {

    @NotNull
    public static final Companion b = new Companion(null);
    private static final long serialVersionUID = 0;

    @NotNull
    private Map<?, ?> a;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public SerializedMap(@NotNull Map<?, ?> map) {
        this.a = map;
    }

    private final Object readResolve() {
        return this.a;
    }

    @Override // java.io.Externalizable
    public void readExternal(@NotNull ObjectInput objectInput) throws InvalidObjectException {
        byte b2 = objectInput.readByte();
        if (b2 != 0) {
            throw new InvalidObjectException(Intrinsics.stringPlus("Unsupported flags value: ", Integer.valueOf(b2)));
        }
        int i = objectInput.readInt();
        if (i < 0) {
            throw new InvalidObjectException("Illegal size value: " + i + '.');
        }
        Map mapCreateMapBuilder = q.createMapBuilder(i);
        int i2 = 0;
        while (i2 < i) {
            i2++;
            mapCreateMapBuilder.put(objectInput.readObject(), objectInput.readObject());
        }
        Unit unit = Unit.INSTANCE;
        this.a = q.build(mapCreateMapBuilder);
    }

    @Override // java.io.Externalizable
    public void writeExternal(@NotNull ObjectOutput objectOutput) throws IOException {
        objectOutput.writeByte(0);
        objectOutput.writeInt(this.a.size());
        for (Map.Entry<?, ?> entry : this.a.entrySet()) {
            objectOutput.writeObject(entry.getKey());
            objectOutput.writeObject(entry.getValue());
        }
    }

    public SerializedMap() {
        this(r.emptyMap());
    }
}
