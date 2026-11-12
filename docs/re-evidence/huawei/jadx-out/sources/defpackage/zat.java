package defpackage;

import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import org.apache.commons.io.FilenameUtils;

/* JADX INFO: loaded from: classes46.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u001b\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0002R\u0012\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lkotlin/collections/builders/SerializedCollection;", "Ljava/io/Externalizable;", "collection", "", RemoteMessageConst.Notification.TAG, "", "<init>", "(Ljava/util/Collection;I)V", "()V", "writeExternal", "", "output", "Ljava/io/ObjectOutput;", "readExternal", "input", "Ljava/io/ObjectInput;", "readResolve", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class zat implements Externalizable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f53947a = new b(null);
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Collection<?> f53948b;
    private final int d;

    public zat(Collection<?> collection, int i) {
        zcp.c(collection, "");
        this.f53948b = collection;
        this.d = i;
    }

    public zat() {
        this(yzp.e(), 0);
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput output) throws IOException {
        zcp.c(output, "");
        output.writeByte(this.d);
        output.writeInt(this.f53948b.size());
        Iterator<?> it = this.f53948b.iterator();
        while (it.hasNext()) {
            output.writeObject(it.next());
        }
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput input) throws InvalidObjectException {
        List listC;
        zcp.c(input, "");
        byte b2 = input.readByte();
        int i = b2 & 1;
        if ((b2 & (-2)) != 0) {
            throw new InvalidObjectException("Unsupported flags value: " + ((int) b2) + FilenameUtils.EXTENSION_SEPARATOR);
        }
        int i2 = input.readInt();
        if (i2 < 0) {
            throw new InvalidObjectException("Illegal size value: " + i2 + FilenameUtils.EXTENSION_SEPARATOR);
        }
        int i3 = 0;
        if (i == 0) {
            List listD = yzp.d(i2);
            while (i3 < i2) {
                listD.add(input.readObject());
                i3++;
            }
            listC = yzp.c(listD);
        } else if (i == 1) {
            Set setD = zaj.d(i2);
            while (i3 < i2) {
                setD.add(input.readObject());
                i3++;
            }
            listC = zaj.d(setD);
        } else {
            throw new InvalidObjectException("Unsupported collection type tag: " + i + FilenameUtils.EXTENSION_SEPARATOR);
        }
        this.f53948b = listC;
    }

    private final Object readResolve() {
        return this.f53948b;
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lkotlin/collections/builders/SerializedCollection$Companion;", "", "<init>", "()V", "serialVersionUID", "", "tagList", "", "tagSet", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(zcm zcmVar) {
            this();
        }
    }
}
