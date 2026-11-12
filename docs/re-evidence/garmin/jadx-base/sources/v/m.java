package v;

import android.content.Context;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class m implements androidx.camera.core.impl.j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f173915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z.a f173916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.camera.core.impl.t0 f173917c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.camera.core.impl.s0 f173918d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final androidx.camera.camera2.internal.compat.q f173919e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g1 f173920f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f173921g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f173922h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final m0.j f173923i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b0.y f173924j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final k0 f173925k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b0.t f173926l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f173927m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList f173928n;

    public m(Context context, androidx.camera.core.impl.t0 t0Var, b0.t tVar, long j8, b0.y yVar, m0.j jVar) throws InitializationException {
        this.f173922h = new HashMap();
        this.f173927m = new Object();
        this.f173928n = new ArrayList();
        this.f173915a = context;
        this.f173917c = t0Var;
        t0Var.getClass();
        androidx.camera.camera2.internal.compat.q qVarA = androidx.camera.camera2.internal.compat.q.a(context);
        this.f173919e = qVarA;
        this.f173920f = g1.b(context);
        z.a aVar = new z.a(qVarA);
        this.f173916b = aVar;
        androidx.camera.core.impl.s0 s0Var = new androidx.camera.core.impl.s0(aVar, 1);
        this.f173918d = s0Var;
        synchronized (aVar.f200493a) {
            aVar.f200495c.add(s0Var);
        }
        this.f173921g = j8;
        this.f173923i = jVar;
        this.f173924j = yVar;
        this.f173926l = tVar;
        try {
            List<String> listAsList = Arrays.asList(qVarA.c());
            this.f173925k = new k0(listAsList, qVarA, t0Var.a());
            b(listAsList);
        } catch (CameraAccessExceptionCompat e4) {
            throw new InitializationException(v0.a(e4));
        }
    }

    @Override // androidx.camera.core.impl.j0
    public final androidx.camera.camera2.internal.compat.q a() {
        return this.f173919e;
    }

    @Override // androidx.camera.core.impl.m0
    public final void b(List<String> list) throws InitializationException {
        String strA;
        ArrayList<String> arrayList = new ArrayList(list);
        b0.t tVar = this.f173926l;
        try {
            ArrayList<String> arrayList2 = new ArrayList();
            if (tVar == null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add((String) it.next());
                }
            } else {
                try {
                    strA = t0.a(this.f173919e, tVar.b(), arrayList);
                } catch (IllegalStateException unused) {
                    strA = null;
                }
                ArrayList arrayList3 = new ArrayList();
                for (String str : arrayList) {
                    if (!str.equals(strA)) {
                        arrayList3.add(g(str));
                    }
                }
                Iterator it3 = tVar.a(arrayList3).iterator();
                while (it3.hasNext()) {
                    arrayList2.add(((androidx.camera.core.impl.k0) ((b0.r) it3.next())).q());
                }
            }
            ArrayList arrayList4 = new ArrayList();
            for (String str2 : arrayList2) {
                if (str2.equals("0") || str2.equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE)) {
                    arrayList4.add(str2);
                } else if (s0.a(str2, this.f173919e)) {
                    arrayList4.add(str2);
                }
            }
            synchronized (this.f173927m) {
                try {
                    if (this.f173928n.equals(arrayList4)) {
                        return;
                    }
                    Objects.toString(this.f173928n);
                    arrayList4.toString();
                    this.f173928n = arrayList4;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        } catch (CameraAccessExceptionCompat e4) {
            throw new InitializationException(v0.a(e4));
        } catch (CameraUnavailableException e14) {
            throw new InitializationException(e14);
        }
    }

    @Override // androidx.camera.core.impl.j0
    public final s c(String str) {
        synchronized (this.f173927m) {
            if (!this.f173928n.contains(str)) {
                throw new IllegalArgumentException("The given camera id is not on the available camera id list.");
            }
        }
        return new s(this.f173915a, this.f173919e, str, g(str), this.f173916b, this.f173918d, this.f173917c.a(), this.f173917c.b(), this.f173920f, this.f173921g, this.f173924j);
    }

    @Override // androidx.camera.core.impl.j0
    public final k0 d() {
        return this.f173925k;
    }

    @Override // androidx.camera.core.impl.j0
    public final LinkedHashSet e() {
        LinkedHashSet linkedHashSet;
        synchronized (this.f173927m) {
            linkedHashSet = new LinkedHashSet(this.f173928n);
        }
        return linkedHashSet;
    }

    @Override // androidx.camera.core.impl.j0
    public final z.a f() {
        return this.f173916b;
    }

    public final w g(String str) throws CameraUnavailableException {
        HashMap map = this.f173922h;
        try {
            w wVar = (w) map.get(str);
            if (wVar != null) {
                return wVar;
            }
            w wVar2 = new w(str, this.f173919e, this.f173923i);
            map.put(str, wVar2);
            return wVar2;
        } catch (CameraAccessExceptionCompat e4) {
            throw v0.a(e4);
        }
    }

    @Override // androidx.camera.core.impl.j0
    public final void shutdown() {
        z.a aVar = this.f173916b;
        synchronized (aVar.f200493a) {
            aVar.f200495c.clear();
            aVar.f200496d.clear();
            aVar.f200498f.clear();
            aVar.f200497e.clear();
            aVar.f200499g = 0;
        }
        this.f173925k.f();
    }

    public m(Context context, androidx.camera.core.impl.t0 t0Var, b0.t tVar, long j8) {
        this(context, t0Var, tVar, j8, null, m0.j.f115504a);
    }
}
