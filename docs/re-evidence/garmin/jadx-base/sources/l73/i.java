package l73;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ArrayList f111446d = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f111447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o f111448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i f111449c;

    private i(Object obj, o oVar) {
        this.f111447a = obj;
        this.f111448b = oVar;
    }

    public static i a(Object obj, o oVar) {
        ArrayList arrayList = f111446d;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                if (size <= 0) {
                    return new i(obj, oVar);
                }
                i iVar = (i) arrayList.remove(size - 1);
                iVar.f111447a = obj;
                iVar.f111448b = oVar;
                iVar.f111449c = null;
                return iVar;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
