package androidx.media3.exoplayer.drm;

import androidx.media3.common.t;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.primitives.Ints;
import java.util.Arrays;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class a implements la.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f8891a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public t.f f8892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public DefaultDrmSessionManager f8893c;

    public static DefaultDrmSessionManager b(t.f fVar) {
        ha.i.b bVar = new ha.i.b();
        bVar.f82606c = null;
        fVar.getClass();
        i iVar = new i(null, false, bVar);
        UnmodifiableIterator<Map.Entry<String, String>> it = fVar.f8463b.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> next = it.next();
            String key = next.getKey();
            String value = next.getValue();
            key.getClass();
            value.getClass();
            synchronized (iVar.f8913d) {
                iVar.f8913d.put(key, value);
            }
        }
        DefaultDrmSessionManager.b bVar2 = new DefaultDrmSessionManager.b();
        UUID uuid = fVar.f8462a;
        kg.f fVar2 = h.f8906d;
        uuid.getClass();
        bVar2.f8876b = uuid;
        bVar2.f8877c = fVar2;
        bVar2.f8879e = fVar.f8464c;
        int[] array = Ints.toArray(fVar.f8465d);
        for (int i14 : array) {
            boolean z14 = true;
            if (i14 != 2 && i14 != 1) {
                z14 = false;
            }
            fa.a.a(z14);
        }
        bVar2.f8878d = (int[]) array.clone();
        DefaultDrmSessionManager defaultDrmSessionManager = new DefaultDrmSessionManager(bVar2.f8876b, bVar2.f8877c, iVar, bVar2.f8875a, false, bVar2.f8878d, bVar2.f8879e, bVar2.f8880f, bVar2.f8881g);
        byte[] bArr = fVar.f8466e;
        byte[] bArrCopyOf = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        fa.a.d(defaultDrmSessionManager.f8863m.isEmpty());
        defaultDrmSessionManager.f8872v = bArrCopyOf;
        return defaultDrmSessionManager;
    }

    @Override // la.b
    public final c a(t tVar) {
        DefaultDrmSessionManager defaultDrmSessionManager;
        tVar.f8439b.getClass();
        t.f fVar = tVar.f8439b.f8484c;
        if (fVar == null) {
            return c.f8899a;
        }
        synchronized (this.f8891a) {
            try {
                if (!fVar.equals(this.f8892b)) {
                    this.f8892b = fVar;
                    this.f8893c = b(fVar);
                }
                defaultDrmSessionManager = this.f8893c;
                defaultDrmSessionManager.getClass();
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return defaultDrmSessionManager;
    }
}
