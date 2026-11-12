package bb;

import android.net.Uri;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.common.collect.ImmutableList;
import com.google.common.net.HttpHeaders;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class j implements r {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f17202e = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f17203f = new a(new b71.i(1));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f17204g = new a(new b71.i(2));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ImmutableList<androidx.media3.common.q> f17205a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17208d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public yb.n.a f17207c = new yb.e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f17206b = true;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC0242a f17209a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicBoolean f17210b = new AtomicBoolean(false);

        /* JADX INFO: renamed from: bb.j$a$a, reason: collision with other inner class name */
        public interface InterfaceC0242a {
            Constructor<? extends n> a();
        }

        public a(InterfaceC0242a interfaceC0242a) {
            this.f17209a = interfaceC0242a;
        }

        public final n a(Object... objArr) {
            Constructor<? extends n> constructorA;
            synchronized (this.f17210b) {
                if (!this.f17210b.get()) {
                    try {
                        constructorA = this.f17209a.a();
                    } catch (ClassNotFoundException unused) {
                        this.f17210b.set(true);
                        constructorA = null;
                    } catch (Exception e4) {
                        throw new RuntimeException("Error instantiating extension", e4);
                    }
                }
                constructorA = null;
            }
            if (constructorA == null) {
                return null;
            }
            try {
                return constructorA.newInstance(objArr);
            } catch (Exception e14) {
                com.airbnb.lottie.animation.keyframe.a.x("Unexpected error creating extractor", e14);
                return null;
            }
        }
    }

    @Override // bb.r
    @CanIgnoreReturnValue
    public final void a(yb.n.a aVar) {
        synchronized (this) {
            this.f17207c = aVar;
        }
    }

    @Override // bb.r
    @Deprecated
    public final void b(boolean z14) {
        synchronized (this) {
            this.f17206b = z14;
        }
    }

    public final void c(int i14, ArrayList arrayList) {
        switch (i14) {
            case 0:
                arrayList.add(new hc.a());
                break;
            case 1:
                arrayList.add(new hc.c());
                break;
            case 2:
                arrayList.add(new hc.e(0));
                break;
            case 3:
                arrayList.add(new cb.a(0));
                break;
            case 4:
                n nVarA = f17203f.a(0);
                if (nVarA == null) {
                    arrayList.add(new gb.b(0));
                } else {
                    arrayList.add(nVarA);
                }
                break;
            case 5:
                arrayList.add(new hb.b());
                break;
            case 6:
                arrayList.add(new tb.c(this.f17207c, this.f17206b ? 0 : 2));
                break;
            case 7:
                arrayList.add(new ub.d(0));
                break;
            case 8:
                arrayList.add(new vb.f(this.f17207c, this.f17206b ? 0 : 32));
                arrayList.add(new vb.j(this.f17207c, this.f17206b ? 0 : 16));
                break;
            case 9:
                arrayList.add(new wb.c());
                break;
            case 10:
                arrayList.add(new hc.y());
                break;
            case 11:
                if (this.f17205a == null) {
                    this.f17205a = ImmutableList.of();
                }
                arrayList.add(new hc.e0(1, !this.f17206b ? 1 : 0, this.f17207c, new fa.w(0L), new hc.g(0, this.f17205a), TsExtractor.DEFAULT_TIMESTAMP_SEARCH_BYTES));
                break;
            case 12:
                arrayList.add(new ic.a());
                break;
            case 14:
                arrayList.add(new jb.a(this.f17208d));
                break;
            case 15:
                n nVarA2 = f17204g.a(new Object[0]);
                if (nVarA2 != null) {
                    arrayList.add(nVarA2);
                }
                break;
            case 16:
                arrayList.add(new db.b(!this.f17206b ? 1 : 0, this.f17207c));
                break;
            case 17:
                arrayList.add(new xb.a());
                break;
            case 18:
                arrayList.add(new jc.a());
                break;
            case 19:
                arrayList.add(new fb.a());
                break;
            case 20:
                arrayList.add(new ib.a());
                break;
            case 21:
                arrayList.add(new eb.a());
                break;
        }
    }

    @Override // bb.r
    public final synchronized n[] createExtractors(Uri uri, Map<String, List<String>> map) {
        ArrayList arrayList;
        try {
            int[] iArr = f17202e;
            arrayList = new ArrayList(21);
            List<String> list = map.get(HttpHeaders.CONTENT_TYPE);
            int iA = androidx.media3.common.n.a((list == null || list.isEmpty()) ? null : list.get(0));
            if (iA != -1) {
                c(iA, arrayList);
            }
            int iB = androidx.media3.common.n.b(uri);
            if (iB != -1 && iB != iA) {
                c(iB, arrayList);
            }
            for (int i14 = 0; i14 < 21; i14++) {
                int i15 = iArr[i14];
                if (i15 != iA && i15 != iB) {
                    c(i15, arrayList);
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return (n[]) arrayList.toArray(new n[arrayList.size()]);
    }

    @Override // bb.r
    public final synchronized n[] createExtractors() {
        return createExtractors(Uri.EMPTY, new HashMap());
    }
}
