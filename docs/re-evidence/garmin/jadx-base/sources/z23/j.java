package z23;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends h implements o33.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f202056c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(x33.f fVar, Object[] objArr) {
        super(fVar, null);
        objArr.getClass();
        this.f202056c = objArr;
    }

    @Override // o33.d
    public final ArrayList getElements() {
        Object[] objArr = this.f202056c;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            obj.getClass();
            h.f202048b.getClass();
            arrayList.add(h.a.a(null, obj));
        }
        return arrayList;
    }
}
