package defpackage;

import com.xiaomi.fitness.common.log.Logger;
import java.security.InvalidParameterException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
public final class hir {
    public static final hir f = new hir();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public jyo.a f20114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<Integer> f20115b;
    public int c;
    public int d;
    public List<pir> e;

    public hir() {
    }

    public int a() {
        return this.d;
    }

    public int b() {
        return this.c;
    }

    public List<Integer> c() {
        return this.f20115b;
    }

    public List<pir> d() {
        return this.e;
    }

    public void e() {
        List<pir> list = this.e;
        for (int i = 0; list != null && i < list.size(); i++) {
            pir pirVar = list.get(i);
            if (pirVar.c() == 1) {
                pirVar.i(i + 1);
            }
        }
    }

    public boolean f() {
        List<Integer> list;
        return (this.f20114a == null || (list = this.f20115b) == null || list.isEmpty()) ? false : true;
    }

    public final void g(jyo.a aVar) {
        if (aVar == null) {
            throw new IllegalStateException("WidgetGroup Config is null");
        }
        int i = aVar.c;
        this.c = i;
        int i2 = aVar.d;
        this.d = i2;
        if (i <= 0 || i2 <= 0 || i2 < i) {
            throw new IllegalStateException("the range of WidgetGroup number is invalidate");
        }
        this.f20115b = h(aVar);
    }

    public final List<Integer> h(jyo.a aVar) {
        int i = aVar.e;
        if (i == 0) {
            throw new IllegalStateException("the styles of WidgetGroup supported are empty");
        }
        LinkedList linkedList = new LinkedList();
        for (int i2 = 0; i2 < 15; i2++) {
            int i3 = (1 << i2) & i;
            if (i3 != 0) {
                linkedList.add(Integer.valueOf(i3));
            }
        }
        Logger.i("WidgetGroupListContainer", "parseStyles: styles = " + i);
        return linkedList;
    }

    public jyo.b i() {
        List<pir> list = this.e;
        if (list == null || list.isEmpty()) {
            throw new InvalidParameterException("wrapperList is null or empty");
        }
        jyo.b bVar = new jyo.b();
        int size = list.size();
        Iterator<pir> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().c() == 2) {
                i++;
            }
        }
        bVar.d = true;
        bVar.e = this.f20114a;
        int i2 = size - i;
        jyo[] jyoVarArr = new jyo[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            jyoVarArr[i3] = list.get(i3).e();
        }
        bVar.c = jyoVarArr;
        return bVar;
    }

    public final List<pir> j(jyo.b bVar) {
        jyo[] jyoVarArr = bVar.c;
        int length = jyoVarArr.length;
        if (length >= b() && length <= a()) {
            LinkedList linkedList = new LinkedList();
            for (jyo jyoVar : jyoVarArr) {
                linkedList.add(new pir(jyoVar, this));
            }
            return linkedList;
        }
        throw new IllegalStateException("the number of widget_array is out of config range，len = " + length + ",max = " + a() + ", min = " + b());
    }

    public hir(jyo.b bVar) {
        Objects.requireNonNull(bVar);
        jyo.a aVar = bVar.e;
        Objects.requireNonNull(aVar, "the config in WidgetGroup.List is null");
        this.f20114a = aVar;
        g(aVar);
        this.e = j(bVar);
    }
}
