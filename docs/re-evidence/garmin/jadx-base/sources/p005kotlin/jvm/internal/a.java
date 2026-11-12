package p005kotlin.jvm.internal;

import java.io.Serializable;
import k23.f;
import wr.g;

/* JADX INFO: loaded from: classes3.dex */
public class a implements o, Serializable {
    private final int arity;
    private final int flags;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private final String signature;

    public a(int i14, Object obj, Class cls, String str, String str2, int i15) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = (i15 & 1) == 1;
        this.arity = i14;
        this.flags = i15 >> 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.isTopLevel == aVar.isTopLevel && this.arity == aVar.arity && this.flags == aVar.flags && s.g(this.receiver, aVar.receiver) && s.g(this.owner, aVar.owner) && this.name.equals(aVar.name) && this.signature.equals(aVar.signature);
    }

    @Override // p005kotlin.jvm.internal.o
    public int getArity() {
        return this.arity;
    }

    public f getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? s0.f105811a.c(cls) : s0.f105811a.b(cls);
    }

    public int hashCode() {
        Object obj = this.receiver;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.owner;
        return ((((g.j(g.j((iHashCode + (cls != null ? cls.hashCode() : 0)) * 31, 31, this.name), 31, this.signature) + (this.isTopLevel ? 1231 : 1237)) * 31) + this.arity) * 31) + this.flags;
    }

    public String toString() {
        return s0.f105811a.j(this);
    }

    public a(int i14, Class cls, String str, String str2, int i15) {
        this(i14, e.NO_RECEIVER, cls, str, str2, i15);
    }
}
