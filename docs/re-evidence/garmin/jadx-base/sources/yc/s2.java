package yc;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00020\u00010\u00042\b\u0012\u0004\u0012\u00028\u00000\u0005B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\u0007B+\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0010\u0010\u000b\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\rB\u0017\b\u0012\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b\u0006\u0010\u000f¨\u0006\u0010"}, d2 = {"Lyc/s2;", "", "T", "Ljava/util/AbstractList;", "Lyc/s0$a;", "Lyc/k3;", "<init>", "()V", "", "leadingNulls", "Lyc/h3$b$c;", "page", "trailingNulls", "(ILyc/h3$b$c;I)V", "other", "(Lyc/s2;)V", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class s2<T> extends AbstractList<T> implements s0.a<Object>, k3<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f196447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f196448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f196449c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f196450d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f196451e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f196452f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f196453g;

    private s2(s2<T> s2Var) {
        ArrayList arrayList = new ArrayList();
        this.f196447a = arrayList;
        this.f196451e = true;
        arrayList.addAll(s2Var.f196447a);
        this.f196448b = s2Var.f196448b;
        this.f196449c = s2Var.f196449c;
        this.f196450d = s2Var.f196450d;
        this.f196451e = s2Var.f196451e;
        this.f196452f = s2Var.f196452f;
        this.f196453g = s2Var.f196453g;
    }

    @Override // yc.k3
    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getF196121c() {
        return this.f196448b;
    }

    @Override // yc.k3
    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getF196122d() {
        return this.f196449c;
    }

    @Override // yc.s0.a
    public final Object c() {
        if (!this.f196451e || this.f196449c > 0) {
            return ((h3.b.c) p13.h0.m0(this.f196447a)).f196018c;
        }
        return null;
    }

    @Override // yc.s0.a
    public final Object d() {
        if (!this.f196451e || this.f196448b + this.f196450d > 0) {
            return ((h3.b.c) p13.h0.b0(this.f196447a)).f196017b;
        }
        return null;
    }

    @Override // yc.k3
    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getF196120b() {
        return this.f196452f;
    }

    public final void f(int i14, h3.b.c<?, T> cVar, int i15, int i16, boolean z14) {
        this.f196448b = i14;
        ArrayList arrayList = this.f196447a;
        arrayList.clear();
        arrayList.add(cVar);
        this.f196449c = i15;
        this.f196450d = i16;
        List<T> list = cVar.f196016a;
        this.f196452f = list.size();
        this.f196451e = z14;
        this.f196453g = list.size() / 2;
    }

    public final boolean g(int i14, int i15, int i16) {
        ArrayList arrayList = this.f196447a;
        return this.f196452f > i14 && arrayList.size() > 2 && this.f196452f - ((h3.b.c) arrayList.get(i16)).f196016a.size() >= i15;
    }

    @Override // java.util.AbstractList, java.util.List
    public final T get(int i14) {
        int i15 = i14 - this.f196448b;
        if (i14 < 0 || i14 >= getSize()) {
            l2.j(getSize(), b71.i.i(i14, "Index: ", ", Size: "));
            return null;
        }
        if (i15 < 0 || i15 >= this.f196452f) {
            return null;
        }
        return getItem(i15);
    }

    @Override // yc.k3
    public final T getItem(int i14) {
        ArrayList arrayList = this.f196447a;
        int size = arrayList.size();
        int i15 = 0;
        while (i15 < size) {
            int size2 = ((h3.b.c) arrayList.get(i15)).f196016a.size();
            if (size2 > i14) {
                break;
            }
            i14 -= size2;
            i15++;
        }
        return (T) ((h3.b.c) arrayList.get(i15)).f196016a.get(i14);
    }

    @Override // yc.k3
    public final int getSize() {
        return this.f196448b + this.f196452f + this.f196449c;
    }

    public final s2<T> h() {
        return new s2<>(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "leading " + this.f196448b + ", dataCount " + this.f196452f + ", trailing " + this.f196449c + ' ' + p13.h0.k0(this.f196447a, StringUtils.SPACE, null, null, null, 62);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s2(int i14, h3.b.c<?, T> cVar, int i15) {
        this();
        cVar.getClass();
        f(i14, cVar, i15, 0, true);
    }

    public s2() {
        this.f196447a = new ArrayList();
        this.f196451e = true;
    }
}
