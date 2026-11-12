package m63;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\n\b\u0001\u0010\u0003*\u0004\u0018\u00018\u00002*\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00010\u0006j\b\u0012\u0004\u0012\u00028\u0001`\u00070\u0004B#\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lm63/s1;", "", "ElementKlass", "Element", "Lm63/s;", "", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Lk23/d;", "kClass", "Li63/c;", "eSerializer", "<init>", "(Lk23/d;Li63/c;)V", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class s1<ElementKlass, Element extends ElementKlass> extends s<Element, Element[], ArrayList<Element>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k23.d<ElementKlass> f117014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f117015c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(k23.d<ElementKlass> dVar, i63.c<Element> cVar) {
        super(cVar, null);
        dVar.getClass();
        cVar.getClass();
        this.f117014b = dVar;
        this.f117015c = new c(cVar.getF116202c());
    }

    @Override // m63.a
    public final Object a() {
        return new ArrayList();
    }

    @Override // m63.a
    public final int b(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        return arrayList.size();
    }

    @Override // m63.a
    public final Iterator c(Object obj) {
        Object[] objArr = (Object[]) obj;
        objArr.getClass();
        return new p005kotlin.jvm.internal.b(objArr);
    }

    @Override // m63.a
    public final int d(Object obj) {
        Object[] objArr = (Object[]) obj;
        objArr.getClass();
        return objArr.length;
    }

    @Override // m63.a
    public final Object g(Object obj) {
        throw null;
    }

    @Override // i63.i, i63.b
    /* JADX INFO: renamed from: getDescriptor */
    public final k63.e getF116202c() {
        return this.f117015c;
    }

    @Override // m63.a
    public final Object h(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        k23.d<ElementKlass> dVar = this.f117014b;
        dVar.getClass();
        Object objNewInstance = Array.newInstance((Class<?>) dh.b.u(dVar), arrayList.size());
        objNewInstance.getClass();
        Object[] array = arrayList.toArray((Object[]) objNewInstance);
        array.getClass();
        return array;
    }

    @Override // m63.s
    public final void i(int i14, Object obj, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        arrayList.add(i14, obj2);
    }
}
