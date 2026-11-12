package defpackage;

import android.net.Uri;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class yu5 implements nl8 {
    public static final int[] m = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 14};
    public static final Constructor<? extends il8> n;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f40560b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f40561k;
    public int j = 1;
    public int l = 112800;

    static {
        Constructor<? extends il8> constructor = null;
        try {
            if (Boolean.TRUE.equals(Class.forName("com.google.android.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
                constructor = Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(il8.class).getConstructor(Integer.TYPE);
            }
        } catch (ClassNotFoundException unused) {
        } catch (Exception e) {
            throw new RuntimeException("Error instantiating FLAC extension", e);
        }
        n = constructor;
    }

    @Override // defpackage.nl8
    public synchronized il8[] b(Uri uri, Map<String, List<String>> map) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList(14);
            int iB = fm9.b(map);
            if (iB != -1) {
                e(iB, arrayList);
            }
            int iC = fm9.c(uri);
            if (iC != -1 && iC != iB) {
                e(iC, arrayList);
            }
            for (int i : m) {
                if (i != iB && i != iC) {
                    e(i, arrayList);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return (il8[]) arrayList.toArray(new il8[arrayList.size()]);
    }

    @Override // defpackage.nl8
    public synchronized il8[] c() {
        return b(Uri.EMPTY, new HashMap());
    }

    public final void e(int i, List<il8> list) {
        switch (i) {
            case 0:
                list.add(new c20());
                return;
            case 1:
                list.add(new g20());
                return;
            case 2:
                list.add(new tu0((this.c | (this.f40560b ? 1 : 0)) == true ? 1 : 0));
                return;
            case 3:
                list.add(new g71((this.d | (this.f40560b ? 1 : 0)) == true ? 1 : 0));
                return;
            case 4:
                Constructor<? extends il8> constructor = n;
                if (constructor == null) {
                    list.add(new zw9(this.e));
                    return;
                }
                try {
                    list.add(constructor.newInstance(Integer.valueOf(this.e)));
                    return;
                } catch (Exception e) {
                    throw new IllegalStateException("Unexpected error creating FLAC extractor", e);
                }
            case 5:
                list.add(new kz9());
                return;
            case 6:
                list.add(new z8f(this.f));
                return;
            case 7:
                list.add(new c9g((this.i | (this.f40560b ? 1 : 0)) == true ? 1 : 0));
                return;
            case 8:
                list.add(new zna(this.h));
                list.add(new f9g(this.g));
                return;
            case 9:
                list.add(new z6h());
                return;
            case 10:
                list.add(new mei());
                return;
            case 11:
                list.add(new h2q(this.j, this.f40561k, this.l));
                return;
            case 12:
                list.add(new h6r());
                return;
            case 13:
            default:
                return;
            case 14:
                list.add(new qrd());
                return;
        }
    }
}
