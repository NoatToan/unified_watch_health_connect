package m22;

import java.lang.Enum;
import k63.e;
import l63.f;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0003B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lm22/b;", "", "T", "Li63/c;", "defaultSerializer", "<init>", "(Li63/c;)V", "gcm-common-util_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class b<T extends Enum<T>> implements i63.c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i63.c<T> f116203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f116204b;

    public b(i63.c<T> cVar) {
        cVar.getClass();
        this.f116203a = cVar;
        this.f116204b = cVar.getF116204b();
    }

    @Override // i63.b
    public final Object deserialize(l63.e eVar) {
        eVar.getClass();
        try {
            return (Enum) eVar.h(this.f116203a);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // i63.i, i63.b
    /* JADX INFO: renamed from: getDescriptor, reason: from getter */
    public final e getF116204b() {
        return this.f116204b;
    }

    @Override // i63.i
    public final void serialize(f fVar, Object obj) {
        Enum r14 = (Enum) obj;
        if (r14 != null) {
            fVar.l(this.f116203a, r14);
        }
    }
}
