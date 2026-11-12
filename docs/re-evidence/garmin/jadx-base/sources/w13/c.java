package w13;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.Serializable;
import java.lang.Enum;
import java.util.RandomAccess;
import p005kotlin.Metadata;
import p13.u;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0003\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00060\u0005j\u0002`\u00062\u00060\u0007j\u0002`\bB\u0015\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lw13/c;", "", "T", "Lw13/a;", "Lp13/c;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "<init>", "([Ljava/lang/Enum;)V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c<T extends Enum<T>> extends p13.c<T> implements a<T>, RandomAccess, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T[] f181276b;

    public c(T[] tArr) {
        tArr.getClass();
        this.f181276b = tArr;
    }

    @Override // p13.a
    /* JADX INFO: renamed from: a */
    public final int getF134922d() {
        return this.f181276b.length;
    }

    @Override // p13.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r14 = (Enum) obj;
        return ((Enum) u.L(r14.ordinal(), this.f181276b)) == r14;
    }

    @Override // java.util.List
    public final Object get(int i14) {
        T[] tArr = this.f181276b;
        int length = tArr.length;
        p13.c.f134916a.getClass();
        p13.c.a.b(i14, length);
        return tArr[i14];
    }

    @Override // p13.c, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r14 = (Enum) obj;
        int iOrdinal = r14.ordinal();
        if (((Enum) u.L(iOrdinal, this.f181276b)) == r14) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // p13.c, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r14 = (Enum) obj;
        int iOrdinal = r14.ordinal();
        if (((Enum) u.L(iOrdinal, this.f181276b)) == r14) {
            return iOrdinal;
        }
        return -1;
    }
}
