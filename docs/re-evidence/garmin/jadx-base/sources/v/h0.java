package v;

import android.content.Context;
import android.media.CamcorderProfile;
import android.os.Build;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.impl.CameraUpdateException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class h0 implements androidx.camera.core.impl.i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f173826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f173827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f173828c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.camera.camera2.internal.compat.q f173829d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f173830e;

    public class a implements f {
        @Override // v.f
        public final boolean a(int i14, int i15) {
            return CamcorderProfile.hasProfile(i14, i15);
        }

        @Override // v.f
        public final CamcorderProfile b(int i14, int i15) {
            return CamcorderProfile.get(i14, i15);
        }
    }

    public h0(Context context, f fVar, Object obj, Set<String> set) throws CameraUnavailableException {
        this.f173826a = new Object();
        this.f173827b = new HashMap();
        fVar.getClass();
        this.f173828c = fVar;
        this.f173830e = context;
        if (obj instanceof androidx.camera.camera2.internal.compat.q) {
            this.f173829d = (androidx.camera.camera2.internal.compat.q) obj;
        } else {
            j0.p.a();
            this.f173829d = androidx.camera.camera2.internal.compat.q.a(context);
        }
        try {
            a(new ArrayList(set));
        } catch (CameraUpdateException e4) {
            if (!(e4.getCause() instanceof CameraUnavailableException)) {
                throw new CameraUnavailableException(3, e4);
            }
            throw ((CameraUnavailableException) e4.getCause());
        }
    }

    @Override // androidx.camera.core.impl.q1
    public final void a(List<String> list) throws CameraUpdateException {
        HashSet<String> hashSet;
        HashMap map = new HashMap();
        synchronized (this.f173826a) {
            hashSet = new HashSet(list);
            hashSet.removeAll(this.f173827b.keySet());
        }
        try {
            for (String str : hashSet) {
                map.put(str, b(str));
            }
            synchronized (this.f173826a) {
                try {
                    HashMap map2 = new HashMap();
                    for (String str2 : (ArrayList) list) {
                        if (this.f173827b.containsKey(str2)) {
                            map2.put(str2, (b2) this.f173827b.get(str2));
                        } else {
                            map2.put(str2, (b2) map.get(str2));
                        }
                    }
                    this.f173827b.clear();
                    this.f173827b.putAll(map2);
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        } catch (CameraUnavailableException | RuntimeException e4) {
            throw new CameraUpdateException("Failed to create SupportedSurfaceCombination", e4);
        }
    }

    public final b2 b(String str) {
        e0.a cVar = e0.a.f61818b;
        if (Build.VERSION.SDK_INT >= 35) {
            cVar = new u.c(this.f173830e, str, this.f173829d);
        }
        androidx.camera.camera2.internal.compat.q qVar = this.f173829d;
        f fVar = this.f173828c;
        return new b2(this.f173830e, str, qVar, fVar, cVar);
    }

    public h0(Context context, Object obj, Set<String> set) {
        this(context, new a(), obj, set);
    }
}
