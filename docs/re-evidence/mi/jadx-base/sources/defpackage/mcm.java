package defpackage;

import androidx.health.connect.client.records.CervicalMucusRecord;
import com.mi.health.course.export.data.CourseConfigModel;
import com.typesafe.config.ConfigException;
import com.typesafe.config.ConfigValueType;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes6.dex */
public final class mcm extends h00 implements dc4, Serializable {
    private static final long serialVersionUID = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<h00> f26011b;
    public final boolean c;

    public class a implements h00.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ eqk f26012a;

        public a(eqk eqkVar) {
            this.f26012a = eqkVar;
        }

        @Override // h00.a
        public h00 a(String str, h00 h00Var) throws h00.c {
            return this.f26012a.c(h00Var);
        }
    }

    public class b extends h00.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ qlh f26014b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(qlh qlhVar) {
            super();
            this.f26014b = qlhVar;
        }

        @Override // h00.b
        public h00 b(String str, h00 h00Var) {
            return h00Var.V(this.f26014b);
        }
    }

    public class c implements Iterator<rc4> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Iterator f26015a;

        public c(Iterator it) {
            this.f26015a = it;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public rc4 next() {
            return (rc4) this.f26015a.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f26015a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw mcm.t0("iterator().remove");
        }
    }

    public static class d implements ListIterator<rc4> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ListIterator f26017a;

        public d(ListIterator listIterator) {
            this.f26017a = listIterator;
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void add(rc4 rc4Var) {
            throw mcm.t0("listIterator().add");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public rc4 next() {
            return (rc4) this.f26017a.next();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public rc4 previous() {
            return (rc4) this.f26017a.previous();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void set(rc4 rc4Var) {
            throw mcm.t0("listIterator().set");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f26017a.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f26017a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f26017a.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f26017a.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw mcm.t0("listIterator().remove");
        }
    }

    public mcm(jc4 jc4Var, List<h00> list) {
        this(jc4Var, list, iqk.b(list));
    }

    public static UnsupportedOperationException t0(String str) {
        return new UnsupportedOperationException("ConfigList is immutable, you can't call List.'" + str + "'");
    }

    public static ListIterator<rc4> u0(ListIterator<h00> listIterator) {
        return new d(listIterator);
    }

    private Object writeReplace() throws ObjectStreamException {
        return new rwl(this);
    }

    @Override // defpackage.h00
    public void W(StringBuilder sb, int i, boolean z, oc4 oc4Var) {
        if (this.f26011b.isEmpty()) {
            sb.append(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
            return;
        }
        sb.append("[");
        if (oc4Var.c()) {
            sb.append('\n');
        }
        for (h00 h00Var : this.f26011b) {
            if (oc4Var.e()) {
                h00.E(sb, i + 1, oc4Var);
                sb.append("# ");
                sb.append(h00Var.g().a());
                sb.append("\n");
            }
            if (oc4Var.b()) {
                for (String str : h00Var.g().f()) {
                    h00.E(sb, i + 1, oc4Var);
                    sb.append("# ");
                    sb.append(str);
                    sb.append("\n");
                }
            }
            int i2 = i + 1;
            h00.E(sb, i2, oc4Var);
            h00Var.W(sb, i2, z, oc4Var);
            sb.append(",");
            if (oc4Var.c()) {
                sb.append('\n');
            }
        }
        sb.setLength(sb.length() - 1);
        if (oc4Var.c()) {
            sb.setLength(sb.length() - 1);
            sb.append('\n');
            h00.E(sb, i, oc4Var);
        }
        sb.append("]");
    }

    @Override // defpackage.h00
    public iqk Z() {
        return iqk.a(this.c);
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends rc4> collection) {
        throw t0("addAll");
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw t0(CervicalMucusRecord.Appearance.CLEAR);
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return this.f26011b.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return this.f26011b.containsAll(collection);
    }

    @Override // defpackage.h00
    public boolean equals(Object obj) {
        return (obj instanceof mcm) && z(obj) && this.f26011b.equals(((mcm) obj).f26011b);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
    public void add(int i, rc4 rc4Var) {
        throw t0("add");
    }

    @Override // defpackage.h00
    public int hashCode() {
        return this.f26011b.hashCode();
    }

    @Override // java.util.List, java.util.Collection
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public boolean add(rc4 rc4Var) {
        throw t0("add");
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return this.f26011b.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.f26011b.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<rc4> iterator() {
        return new c(this.f26011b.iterator());
    }

    public final mcm j0(mcm mcmVar) {
        jc4 jc4VarJ = ocm.j(g(), mcmVar.g());
        ArrayList arrayList = new ArrayList(this.f26011b.size() + mcmVar.f26011b.size());
        arrayList.addAll(this.f26011b);
        arrayList.addAll(mcmVar.f26011b);
        return new mcm(jc4VarJ, arrayList);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public h00 get(int i) {
        return this.f26011b.get(i);
    }

    public final mcm l0(h00.b bVar, iqk iqkVar) {
        try {
            return m0(bVar, iqkVar);
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            throw new ConfigException.BugOrBroken("unexpected checked exception", e2);
        }
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return this.f26011b.lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator<rc4> listIterator() {
        return u0(this.f26011b.listIterator());
    }

    public final mcm m0(h00.a aVar, iqk iqkVar) throws Exception {
        ArrayList arrayList = null;
        int i = 0;
        for (h00 h00Var : this.f26011b) {
            h00 h00VarA = aVar.a(null, h00Var);
            if (arrayList == null && h00VarA != h00Var) {
                arrayList = new ArrayList();
                for (int i2 = 0; i2 < i; i2++) {
                    arrayList.add(this.f26011b.get(i2));
                }
            }
            if (arrayList != null && h00VarA != null) {
                arrayList.add(h00VarA);
            }
            i++;
        }
        return arrayList != null ? new mcm(g(), arrayList, iqkVar) : this;
    }

    @Override // defpackage.h00
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public mcm T(jc4 jc4Var) {
        return new mcm(jc4Var, this.f26011b);
    }

    @Override // defpackage.h00
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public mcm V(qlh qlhVar) {
        return l0(new b(qlhVar), Z());
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public rc4 remove(int i) {
        throw t0("remove");
    }

    @Override // defpackage.h00
    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public mcm a0(eqk eqkVar) throws h00.c {
        if (this.c || eqkVar.a()) {
            return this;
        }
        try {
            return m0(new a(eqkVar), iqk.RESOLVED);
        } catch (h00.c e) {
            throw e;
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception e3) {
            throw new ConfigException.BugOrBroken("unexpected checked exception", e3);
        }
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
    public rc4 set(int i, rc4 rc4Var) {
        throw t0(CourseConfigModel.DevCmd.CMD_ACTION_SET);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        throw t0("removeAll");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        throw t0("retainAll");
    }

    @Override // defpackage.rc4
    /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
    public List<Object> x() {
        ArrayList arrayList = new ArrayList();
        Iterator<h00> it = this.f26011b.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().x());
        }
        return arrayList;
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
        return this.f26011b.size();
    }

    @Override // java.util.List
    public List<rc4> subList(int i, int i2) {
        ArrayList arrayList = new ArrayList();
        Iterator<h00> it = this.f26011b.subList(i, i2).iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return this.f26011b.toArray();
    }

    @Override // defpackage.rc4
    public ConfigValueType valueType() {
        return ConfigValueType.LIST;
    }

    @Override // defpackage.h00
    public boolean z(Object obj) {
        return obj instanceof mcm;
    }

    public mcm(jc4 jc4Var, List<h00> list, iqk iqkVar) {
        super(jc4Var);
        this.f26011b = list;
        this.c = iqkVar == iqk.RESOLVED;
        if (iqkVar == iqk.b(list)) {
            return;
        }
        throw new ConfigException.BugOrBroken("SimpleConfigList created with wrong resolve status: " + this);
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends rc4> collection) {
        throw t0("addAll");
    }

    @Override // java.util.List
    public ListIterator<rc4> listIterator(int i) {
        return u0(this.f26011b.listIterator(i));
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw t0("remove");
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) this.f26011b.toArray(tArr);
    }
}
