package m22;

import java.lang.Enum;
import k63.e;
import l63.f;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lm22/a;", "", "T", "Li63/c;", "defaultSerializer", "defaultValue", "<init>", "(Li63/c;Ljava/lang/Enum;)V", "gcm-common-util_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a<T extends Enum<T>> implements i63.c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i63.c<T> f116200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f116201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f116202c;

    public a(i63.c<T> cVar, T t7) {
        cVar.getClass();
        t7.getClass();
        this.f116200a = cVar;
        this.f116201b = t7;
        this.f116202c = cVar.getF116202c();
    }

    @Override // i63.b
    public final Object deserialize(l63.e eVar) {
        eVar.getClass();
        try {
            return (Enum) eVar.h(this.f116200a);
        } catch (Exception unused) {
            return this.f116201b;
        }
    }

    @Override // i63.i, i63.b
    /* JADX INFO: renamed from: getDescriptor, reason: from getter */
    public final e getF116202c() {
        return this.f116202c;
    }

    @Override // i63.i
    public final void serialize(f fVar, Object obj) {
        Enum r14 = (Enum) obj;
        r14.getClass();
        fVar.l(this.f116200a, r14);
    }
}
