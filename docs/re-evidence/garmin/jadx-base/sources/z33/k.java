package z33;

import java.io.UnsupportedEncodingException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import r1.q2;
import w52.u0;

/* JADX INFO: loaded from: classes3.dex */
public class k extends AbstractList<String> implements RandomAccess, l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t f202209b = new t(new k());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f202210a;

    public k(l lVar) {
        this.f202210a = new ArrayList(lVar.size());
        addAll(lVar);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i14, Object obj) {
        this.f202210a.add(i14, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i14, Collection<? extends String> collection) {
        if (collection instanceof l) {
            collection = ((l) collection).getUnderlyingElements();
        }
        boolean zAddAll = this.f202210a.addAll(i14, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f202210a.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i14) {
        ArrayList arrayList = this.f202210a;
        Object obj = arrayList.get(i14);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            String strO = cVar.o();
            if (cVar.g()) {
                arrayList.set(i14, strO);
            }
            return strO;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = h.f202205a;
        try {
            String str = new String(bArr, "UTF-8");
            if (u0.u(bArr, 0, bArr.length) == 0) {
                arrayList.set(i14, str);
            }
            return str;
        } catch (UnsupportedEncodingException e4) {
            q2.v("UTF-8 not supported?", e4);
            return null;
        }
    }

    @Override // z33.l
    public final c getByteString(int i14) {
        c mVar;
        ArrayList arrayList = this.f202210a;
        Object obj = arrayList.get(i14);
        if (obj instanceof c) {
            mVar = (c) obj;
        } else if (obj instanceof String) {
            String str = (String) obj;
            m mVar2 = c.f202161a;
            try {
                mVar = new m(str.getBytes("UTF-8"));
            } catch (UnsupportedEncodingException e4) {
                q2.v("UTF-8 not supported?", e4);
                return null;
            }
        } else {
            byte[] bArr = (byte[]) obj;
            m mVar3 = c.f202161a;
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            mVar = new m(bArr2);
        }
        if (mVar != obj) {
            arrayList.set(i14, mVar);
        }
        return mVar;
    }

    @Override // z33.l
    public final List<?> getUnderlyingElements() {
        return Collections.unmodifiableList(this.f202210a);
    }

    @Override // z33.l
    public final t getUnmodifiableView() {
        return new t(this);
    }

    @Override // z33.l
    public final void n2(m mVar) {
        this.f202210a.add(mVar);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i14) {
        Object objRemove = this.f202210a.remove(i14);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (objRemove instanceof c) {
            return ((c) objRemove).o();
        }
        byte[] bArr = (byte[]) objRemove;
        byte[] bArr2 = h.f202205a;
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e4) {
            q2.v("UTF-8 not supported?", e4);
            return null;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i14, Object obj) {
        Object obj2 = this.f202210a.set(i14, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (obj2 instanceof c) {
            return ((c) obj2).o();
        }
        byte[] bArr = (byte[]) obj2;
        byte[] bArr2 = h.f202205a;
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e4) {
            q2.v("UTF-8 not supported?", e4);
            return null;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f202210a.size();
    }

    public k() {
        this.f202210a = new ArrayList();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(this.f202210a.size(), collection);
    }
}
