package defpackage;

import androidx.exifinterface.media.ExifInterface;
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.Enum;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\b\u0012\u0004\u0012\u0002H\u00010\u00042\u00060\u0005j\u0002`\u0006B\u0015\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\rH\u0096\u0002¢\u0006\u0002\u0010\u0012J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0018J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\u0019\u0010\u001c\u001a\u00020\u001d2\n\u0010\u001e\u001a\u00060\u001fj\u0002` H\u0002¢\u0006\u0002\u0010!R\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\""}, d2 = {"Lkotlin/enums/EnumEntriesList;", ExifInterface.GPS_DIRECTION_TRUE, "", "Lkotlin/enums/EnumEntries;", "Lkotlin/collections/AbstractList;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "entries", "", "<init>", "([Ljava/lang/Enum;)V", "[Ljava/lang/Enum;", "size", "", "getSize", "()I", "get", "index", "(I)Ljava/lang/Enum;", "contains", "", FunctionSetBeanReader.BI_ELEMENT, "(Ljava/lang/Enum;)Z", "indexOf", "(Ljava/lang/Enum;)I", "lastIndexOf", "writeReplace", "", "readObject", "", "input", "Ljava/io/ObjectInputStream;", "Lkotlin/internal/ReadObjectParameterType;", "(Ljava/io/ObjectInputStream;)V", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
final class zbr<T extends Enum<T>> extends AbstractList<T> implements EnumEntries<T>, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final T[] f53970b;

    public zbr(T[] tArr) {
        zcp.c(tArr, "");
        this.f53970b = tArr;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Enum) {
            return b((Enum) obj);
        }
        return false;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Enum) {
            return e((Enum) obj);
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof Enum) {
            return a((Enum) obj);
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    /* JADX INFO: renamed from: getSize */
    public int getF39316c() {
        return this.f53970b.length;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public T get(int i) {
        AbstractList.INSTANCE.a(i, this.f53970b.length);
        return this.f53970b[i];
    }

    public boolean b(T t) {
        zcp.c(t, "");
        return ((Enum) yzk.d(this.f53970b, t.ordinal())) == t;
    }

    public int e(T t) {
        zcp.c(t, "");
        int iOrdinal = t.ordinal();
        if (((Enum) yzk.d(this.f53970b, iOrdinal)) == t) {
            return iOrdinal;
        }
        return -1;
    }

    public int a(T t) {
        zcp.c(t, "");
        return e(t);
    }

    private final Object writeReplace() {
        return new zbs(this.f53970b);
    }

    private final void readObject(ObjectInputStream input) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }
}
