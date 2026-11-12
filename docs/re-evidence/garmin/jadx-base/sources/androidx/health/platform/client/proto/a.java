package androidx.health.platform.client.proto;

import androidx.health.platform.client.proto.a;
import androidx.health.platform.client.proto.a.AbstractC0103a;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0103a<MessageType, BuilderType>> implements c1 {
    protected int memoizedHashCode = 0;

    /* JADX INFO: renamed from: androidx.health.platform.client.proto.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0103a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0103a<MessageType, BuilderType>> implements c1.a {
        @Override // 
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public abstract j0.a clone();

        public abstract j0.a d(a aVar);
    }

    public static <T> void c(Iterable<T> iterable, List<? super T> list) {
        Charset charset = l0.f7708a;
        iterable.getClass();
        if (!(iterable instanceof p0)) {
            if (iterable instanceof p1) {
                list.addAll((Collection) iterable);
                return;
            }
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
            }
            int size = list.size();
            for (T t7 : iterable) {
                if (t7 == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    j20.x.l(str);
                    return;
                }
                list.add(t7);
            }
            return;
        }
        List<?> underlyingElements = ((p0) iterable).getUnderlyingElements();
        p0 p0Var = (p0) list;
        int size3 = list.size();
        for (Object obj : underlyingElements) {
            if (obj == null) {
                String str2 = "Element at index " + (p0Var.size() - size3) + " is null.";
                for (int size4 = p0Var.size() - 1; size4 >= size3; size4--) {
                    p0Var.remove(size4);
                }
                j20.x.l(str2);
                return;
            }
            if (obj instanceof i) {
                p0Var.s();
            } else if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                i.c(0, bArr.length, bArr);
                p0Var.s();
            } else {
                p0Var.add((String) obj);
            }
        }
    }

    public int d() {
        throw new UnsupportedOperationException();
    }

    public int e(n2 n2Var) {
        int iD = d();
        if (iD != -1) {
            return iD;
        }
        int iD2 = n2Var.d(this);
        g(iD2);
        return iD2;
    }

    public final String f(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public void g(int i14) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.health.platform.client.proto.c1
    public final i.h toByteString() {
        try {
            int iE = ((j0) this).e(null);
            i.h hVar = i.f7657b;
            i.f fVar = new i.f(iE, null);
            CodedOutputStream.b bVar = fVar.f7662a;
            ((j0) this).b(bVar);
            if (bVar.E() == 0) {
                return new i.h(fVar.f7663b);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e4) {
            r1.q2.v(f("ByteString"), e4);
            return null;
        }
    }
}
