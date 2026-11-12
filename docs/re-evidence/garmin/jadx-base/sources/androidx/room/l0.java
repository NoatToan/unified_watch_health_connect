package androidx.room;

import android.annotation.SuppressLint;
import ch.qos.logback.core.joran.action.ActionConst;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0007B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/room/l0;", "Lvd/f;", "Lvd/e;", "", "capacity", "<init>", "(I)V", "a", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"WrongConstant"})
public final class l0 implements vd.f, vd.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f10869i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final TreeMap<Integer, l0> f10870j = new TreeMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile String f10872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f10873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double[] f10874d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f10875e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[][] f10876f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f10877g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f10878h;

    private l0(int i14) {
        this.f10871a = i14;
        int i15 = i14 + 1;
        this.f10877g = new int[i15];
        this.f10873c = new long[i15];
        this.f10874d = new double[i15];
        this.f10875e = new String[i15];
        this.f10876f = new byte[i15][];
    }

    public static final l0 e(int i14, String str) {
        f10869i.getClass();
        TreeMap<Integer, l0> treeMap = f10870j;
        synchronized (treeMap) {
            Map.Entry<Integer, l0> entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i14));
            if (entryCeilingEntry == null) {
                Unit unit = Unit.INSTANCE;
                l0 l0Var = new l0(i14, null);
                l0Var.f10872b = str;
                l0Var.f10878h = i14;
                return l0Var;
            }
            treeMap.remove(entryCeilingEntry.getKey());
            l0 value = entryCeilingEntry.getValue();
            value.getClass();
            value.f10872b = str;
            value.f10878h = i14;
            return value;
        }
    }

    @Override // vd.f
    public final void a(vd.e eVar) {
        int i14 = this.f10878h;
        if (1 > i14) {
            return;
        }
        int i15 = 1;
        while (true) {
            int i16 = this.f10877g[i15];
            if (i16 == 1) {
                eVar.u(i15);
            } else if (i16 == 2) {
                eVar.h(i15, this.f10873c[i15]);
            } else if (i16 == 3) {
                eVar.m(this.f10874d[i15], i15);
            } else if (i16 == 4) {
                String str = this.f10875e[i15];
                if (str == null) {
                    vb.h.s("Required value was null.");
                    return;
                }
                eVar.r(i15, str);
            } else if (i16 == 5) {
                byte[] bArr = this.f10876f[i15];
                if (bArr == null) {
                    vb.h.s("Required value was null.");
                    return;
                }
                eVar.t(i15, bArr);
            }
            if (i15 == i14) {
                return;
            } else {
                i15++;
            }
        }
    }

    @Override // vd.f
    /* JADX INFO: renamed from: c */
    public final String getF177131a() {
        String str = this.f10872b;
        if (str != null) {
            return str;
        }
        vb.h.z("Required value was null.");
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // vd.e
    public final void h(int i14, long j8) {
        this.f10877g[i14] = 2;
        this.f10873c[i14] = j8;
    }

    @Override // vd.e
    public final void m(double d14, int i14) {
        this.f10877g[i14] = 3;
        this.f10874d[i14] = d14;
    }

    @Override // vd.e
    public final void r(int i14, String str) {
        str.getClass();
        this.f10877g[i14] = 4;
        this.f10875e[i14] = str;
    }

    public final void release() {
        TreeMap<Integer, l0> treeMap = f10870j;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f10871a), this);
            f10869i.getClass();
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator<Integer> it = treeMap.descendingKeySet().iterator();
                it.getClass();
                while (true) {
                    int i14 = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i14;
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // vd.e
    public final void t(int i14, byte[] bArr) {
        this.f10877g[i14] = 5;
        this.f10876f[i14] = bArr;
    }

    @Override // vd.e
    public final void u(int i14) {
        this.f10877g[i14] = 1;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Landroidx/room/l0$a;", "", "<init>", "()V", "", ActionConst.NULL, "I", "LONG", "DOUBLE", "STRING", "BLOB", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ l0(int i14, p005kotlin.jvm.internal.j jVar) {
        this(i14);
    }
}
