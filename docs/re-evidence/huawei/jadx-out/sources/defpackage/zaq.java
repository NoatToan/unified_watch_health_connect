package defpackage;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;
import kotlin.Metadata;
import org.apache.commons.io.FilenameUtils;

/* JADX INFO: loaded from: classes46.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0002R\u0016\u0010\u0002\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lkotlin/collections/builders/SerializedMap;", "Ljava/io/Externalizable;", "map", "", "<init>", "(Ljava/util/Map;)V", "()V", "writeExternal", "", "output", "Ljava/io/ObjectOutput;", "readExternal", "input", "Ljava/io/ObjectInput;", "readResolve", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
final class zaq implements Externalizable {
    public static final a e = new a(null);
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<?, ?> f53945c;

    public zaq(Map<?, ?> map) {
        zcp.c(map, "");
        this.f53945c = map;
    }

    public zaq() {
        this(zae.e());
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput output) throws IOException {
        zcp.c(output, "");
        output.writeByte(0);
        output.writeInt(this.f53945c.size());
        for (Map.Entry<?, ?> entry : this.f53945c.entrySet()) {
            output.writeObject(entry.getKey());
            output.writeObject(entry.getValue());
        }
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput input) throws InvalidObjectException {
        zcp.c(input, "");
        byte b2 = input.readByte();
        if (b2 != 0) {
            throw new InvalidObjectException("Unsupported flags value: " + ((int) b2));
        }
        int i = input.readInt();
        if (i < 0) {
            throw new InvalidObjectException("Illegal size value: " + i + FilenameUtils.EXTENSION_SEPARATOR);
        }
        Map mapA = zae.a(i);
        for (int i2 = 0; i2 < i; i2++) {
            mapA.put(input.readObject(), input.readObject());
        }
        this.f53945c = zae.c(mapA);
    }

    private final Object readResolve() {
        return this.f53945c;
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lkotlin/collections/builders/SerializedMap$Companion;", "", "<init>", "()V", "serialVersionUID", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(zcm zcmVar) {
            this();
        }
    }
}
