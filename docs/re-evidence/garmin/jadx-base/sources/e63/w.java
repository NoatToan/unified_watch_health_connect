package e63;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B'\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Le63/w;", "Object", "Field", "Le63/b;", "Lk23/j;", "property", "", "name", "<init>", "(Lk23/j;Ljava/lang/String;)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class w<Object, Field> implements b<Object, Field> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k23.j<Object, Field> f63274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f63275b;

    public w(k23.j<Object, Field> jVar, String str) {
        jVar.getClass();
        str.getClass();
        this.f63274a = jVar;
        this.f63275b = str;
    }

    @Override // e63.b
    public final Field a(Object object) {
        return this.f63274a.get(object);
    }

    @Override // g63.a
    public final Field c(Object object, Field field) {
        k23.j<Object, Field> jVar = this.f63274a;
        Field field2 = jVar.get(object);
        if (field2 == null) {
            jVar.p(object, field);
            return null;
        }
        if (field2.equals(field)) {
            return null;
        }
        return field2;
    }

    @Override // g63.a
    /* JADX INFO: renamed from: getName, reason: from getter */
    public final String getF63275b() {
        return this.f63275b;
    }

    public /* synthetic */ w(k23.j jVar, String str, int i14, p005kotlin.jvm.internal.j jVar2) {
        this(jVar, (i14 & 2) != 0 ? jVar.getName() : str);
    }
}
