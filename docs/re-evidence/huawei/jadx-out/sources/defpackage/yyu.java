package defpackage;

import com.huawei.hms.network.embedded.g4;
import com.huawei.operation.utils.Constants;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import java.io.Serializable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012\u00060\u0003j\u0002`\u0004B\u0017\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00028\u0001¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u000e\u0010\u000f\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\nJ\u000e\u0010\u0010\u001a\u00028\u0001HÆ\u0003¢\u0006\u0002\u0010\nJ.\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0005\u001a\u00028\u00002\b\b\u0002\u0010\u0006\u001a\u00028\u0001HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0013\u0010\u0005\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\n¨\u0006\u0019"}, d2 = {"Lkotlin/Pair;", "A", "B", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "first", "second", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "getFirst", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getSecond", "toString", "", "component1", "component2", "copy", "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;", "equals", "", "other", "", WatchFaceConstant.HASHCODE, "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class yyu<A, B> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final A f53906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final B f53907b;

    public yyu(A a2, B b2) {
        this.f53906a = a2;
        this.f53907b = b2;
    }

    public final A c() {
        return this.f53906a;
    }

    public final B d() {
        return this.f53907b;
    }

    public String toString() {
        return Constants.LEFT_BRACKET_ONLY + this.f53906a + ", " + this.f53907b + g4.l;
    }

    public int hashCode() {
        A a2 = this.f53906a;
        int iHashCode = a2 == null ? 0 : a2.hashCode();
        B b2 = this.f53907b;
        return (iHashCode * 31) + (b2 != null ? b2.hashCode() : 0);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof yyu)) {
            return false;
        }
        yyu yyuVar = (yyu) other;
        return zcp.b(this.f53906a, yyuVar.f53906a) && zcp.b(this.f53907b, yyuVar.f53907b);
    }

    public final B e() {
        return this.f53907b;
    }

    public final A a() {
        return this.f53906a;
    }
}
