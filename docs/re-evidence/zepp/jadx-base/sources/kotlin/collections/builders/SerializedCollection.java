package kotlin.collections.builders;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.e;
import kotlin.collections.x;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class SerializedCollection implements Externalizable {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final long serialVersionUID = 0;
    public static final int tagList = 0;
    public static final int tagSet = 1;

    @NotNull
    private Collection<?> a;
    private final int b;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public SerializedCollection(@NotNull Collection<?> collection, int i) {
        this.a = collection;
        this.b = i;
    }

    private final Object readResolve() {
        return this.a;
    }

    @Override // java.io.Externalizable
    public void readExternal(@NotNull ObjectInput objectInput) throws InvalidObjectException {
        Collection<?> collectionBuild;
        byte b = objectInput.readByte();
        int i = b & 1;
        if ((b & (-2)) != 0) {
            throw new InvalidObjectException("Unsupported flags value: " + ((int) b) + '.');
        }
        int i2 = objectInput.readInt();
        if (i2 < 0) {
            throw new InvalidObjectException("Illegal size value: " + i2 + '.');
        }
        int i3 = 0;
        if (i == 0) {
            List listCreateListBuilder = e.createListBuilder(i2);
            while (i3 < i2) {
                i3++;
                listCreateListBuilder.add(objectInput.readObject());
            }
            Unit unit = Unit.INSTANCE;
            collectionBuild = e.build(listCreateListBuilder);
        } else {
            if (i != 1) {
                throw new InvalidObjectException("Unsupported collection type tag: " + i + '.');
            }
            Set setCreateSetBuilder = x.createSetBuilder(i2);
            while (i3 < i2) {
                i3++;
                setCreateSetBuilder.add(objectInput.readObject());
            }
            Unit unit2 = Unit.INSTANCE;
            collectionBuild = x.build(setCreateSetBuilder);
        }
        this.a = collectionBuild;
    }

    @Override // java.io.Externalizable
    public void writeExternal(@NotNull ObjectOutput objectOutput) throws IOException {
        objectOutput.writeByte(this.b);
        objectOutput.writeInt(this.a.size());
        Iterator<?> it2 = this.a.iterator();
        while (it2.hasNext()) {
            objectOutput.writeObject(it2.next());
        }
    }

    public SerializedCollection() {
        this(CollectionsKt__CollectionsKt.emptyList(), 0);
    }
}
