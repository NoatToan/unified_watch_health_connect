package hf;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00048\u0002X\u0082\u0004¨\u0006\u0007"}, d2 = {"Lhf/v;", "", "<init>", "()V", "Lh53/b;", "reference", "a", "coil_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v f83614a = new v();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReference f83615b = new AtomicReference(null);

    public interface a {
        n a(Context context);
    }

    private v() {
    }

    public static final j a(Context context) {
        j jVar;
        j jVar2;
        f83614a.getClass();
        AtomicReference atomicReference = f83615b;
        Object obj = atomicReference.get();
        j jVar3 = obj instanceof j ? (j) obj : null;
        if (jVar3 != null) {
            return jVar3;
        }
        j jVarA = null;
        while (true) {
            Object obj2 = atomicReference.get();
            if (obj2 instanceof j) {
                jVar = (j) obj2;
                jVar2 = jVarA;
            } else {
                if (jVarA == null) {
                    a aVar = obj2 instanceof a ? (a) obj2 : null;
                    if (aVar != null) {
                        jVarA = aVar.a(context);
                    } else {
                        Object applicationContext = context.getApplicationContext();
                        a aVar2 = applicationContext instanceof a ? (a) applicationContext : null;
                        jVarA = aVar2 != null ? aVar2.a(context) : x.f83616a.a(context);
                    }
                }
                jVar = jVarA;
                jVar2 = jVar;
            }
            while (!atomicReference.compareAndSet(obj2, jVar)) {
                if (atomicReference.get() != obj2) {
                    jVarA = jVar2;
                }
            }
            return jVar;
        }
    }
}
