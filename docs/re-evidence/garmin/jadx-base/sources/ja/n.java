package ja;

import androidx.media3.common.d0;
import com.google.common.base.Supplier;
import fa.z;
import java.util.HashMap;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final androidx.media3.exoplayer.o f97999i = new androidx.media3.exoplayer.o(2);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Random f98000j = new Random();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0.c f98001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0.b f98002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap<String, a> f98003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Supplier<String> f98004d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p f98005e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d0 f98006f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f98007g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f98008h;

    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f98009a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f98010b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f98011c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final androidx.media3.exoplayer.source.j.b f98012d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f98013e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f98014f;

        public a(String str, int i14, androidx.media3.exoplayer.source.j.b bVar) {
            this.f98009a = str;
            this.f98010b = i14;
            this.f98011c = bVar == null ? -1L : bVar.f9522d;
            if (bVar == null || !bVar.b()) {
                return;
            }
            this.f98012d = bVar;
        }

        public final boolean a(b.a aVar) {
            androidx.media3.exoplayer.source.j.b bVar = aVar.f97945d;
            d0 d0Var = aVar.f97943b;
            if (bVar == null) {
                return this.f98010b != aVar.f97944c;
            }
            long j8 = this.f98011c;
            if (j8 == -1) {
                return false;
            }
            if (bVar.f9522d > j8) {
                return true;
            }
            androidx.media3.exoplayer.source.j.b bVar2 = this.f98012d;
            if (bVar2 == null) {
                return false;
            }
            int i14 = bVar2.f9520b;
            int iB = d0Var.b(bVar.f9519a);
            int iB2 = d0Var.b(bVar2.f9519a);
            if (bVar.f9522d < bVar2.f9522d || iB < iB2) {
                return false;
            }
            if (iB > iB2) {
                return true;
            }
            if (!bVar.b()) {
                int i15 = bVar.f9523e;
                return i15 == -1 || i15 > i14;
            }
            int i16 = bVar.f9520b;
            int i17 = bVar.f9521c;
            if (i16 <= i14) {
                return i16 == i14 && i17 > bVar2.f9521c;
            }
            return true;
        }

        public final boolean b(d0 d0Var, d0 d0Var2) {
            androidx.media3.exoplayer.source.j.b bVar;
            int i14 = this.f98010b;
            if (i14 < d0Var.o()) {
                n nVar = n.this;
                d0.c cVar = nVar.f98001a;
                d0Var.n(i14, cVar);
                int i15 = cVar.f8209n;
                while (true) {
                    if (i15 > cVar.f8210o) {
                        i14 = -1;
                        break;
                    }
                    int iB = d0Var2.b(d0Var.l(i15));
                    if (iB != -1) {
                        i14 = d0Var2.f(iB, nVar.f98002b, false).f8189c;
                        break;
                    }
                    i15++;
                }
            } else if (i14 >= d0Var2.o()) {
                i14 = -1;
                break;
            }
            this.f98010b = i14;
            return i14 != -1 && ((bVar = this.f98012d) == null || d0Var2.b(bVar.f9519a) != -1);
        }
    }

    public n(Supplier<String> supplier) {
        this.f98004d = supplier;
        this.f98001a = new d0.c();
        this.f98002b = new d0.b();
        this.f98003c = new HashMap<>();
        this.f98006f = d0.f8186a;
        this.f98008h = -1L;
    }

    public final void a(a aVar) {
        long j8 = aVar.f98011c;
        if (j8 != -1) {
            this.f98008h = j8;
        }
        this.f98007g = null;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0089  */
    /* JADX WARN: Code duplicated, block: B:54:0x009b A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    public final a b(int i14, androidx.media3.exoplayer.source.j.b bVar) {
        long j8;
        long j14;
        long j15;
        HashMap<String, a> map = this.f98003c;
        a aVar = null;
        long j16 = Long.MAX_VALUE;
        for (a aVar2 : map.values()) {
            long j17 = aVar2.f98011c;
            androidx.media3.exoplayer.source.j.b bVar2 = aVar2.f98012d;
            if (j17 == -1 && i14 == aVar2.f98010b && bVar != null) {
                long j18 = bVar.f9522d;
                n nVar = n.this;
                j8 = -1;
                a aVar3 = nVar.f98003c.get(nVar.f98007g);
                if (aVar3 != null) {
                    j15 = aVar3.f98011c;
                    if (j15 == -1) {
                        j15 = nVar.f98008h + 1;
                    }
                } else {
                    j15 = nVar.f98008h + 1;
                }
                if (j18 >= j15) {
                    aVar2.f98011c = j18;
                }
            } else {
                j8 = -1;
            }
            if (bVar != null) {
                long j19 = bVar.f9522d;
                if (bVar2 == null) {
                    if (!bVar.b() && j19 == aVar2.f98011c) {
                        j14 = aVar2.f98011c;
                        if (j14 != j8) {
                        }
                        aVar = aVar2;
                        j16 = j14;
                    }
                } else if (j19 == bVar2.f9522d && bVar.f9520b == bVar2.f9520b && bVar.f9521c == bVar2.f9521c) {
                    j14 = aVar2.f98011c;
                    if (j14 != j8) {
                    }
                    aVar = aVar2;
                    j16 = j14;
                }
            } else if (i14 == aVar2.f98010b) {
                j14 = aVar2.f98011c;
                if (j14 != j8 || j14 < j16) {
                    aVar = aVar2;
                    j16 = j14;
                } else if (j14 == j16) {
                    int i15 = z.f70071a;
                    if (aVar.f98012d != null && bVar2 != null) {
                        aVar = aVar2;
                    }
                }
            }
        }
        if (aVar != null) {
            return aVar;
        }
        String str = this.f98004d.get();
        a aVar4 = new a(str, i14, bVar);
        map.put(str, aVar4);
        return aVar4;
    }

    public final synchronized String c(d0 d0Var, androidx.media3.exoplayer.source.j.b bVar) {
        return b(d0Var.g(bVar.f9519a, this.f98002b).f8189c, bVar).f98009a;
    }

    public final void d(b.a aVar) {
        androidx.media3.exoplayer.source.j.b bVar;
        d0 d0Var = aVar.f97943b;
        int i14 = aVar.f97944c;
        androidx.media3.exoplayer.source.j.b bVar2 = aVar.f97945d;
        boolean zP = d0Var.p();
        String str = this.f98007g;
        HashMap<String, a> map = this.f98003c;
        if (zP) {
            if (str != null) {
                a aVar2 = map.get(str);
                aVar2.getClass();
                a(aVar2);
                return;
            }
            return;
        }
        a aVar3 = map.get(str);
        this.f98007g = b(i14, bVar2).f98009a;
        e(aVar);
        if (bVar2 != null) {
            long j8 = bVar2.f9522d;
            if (bVar2.b()) {
                if (aVar3 != null && aVar3.f98011c == j8 && (bVar = aVar3.f98012d) != null && bVar.f9520b == bVar2.f9520b && bVar.f9521c == bVar2.f9521c) {
                    return;
                }
                b(i14, new androidx.media3.exoplayer.source.j.b(bVar2.f9519a, j8));
                this.f98005e.getClass();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002f A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0005, B:8:0x0014, B:10:0x0018, B:12:0x0028, B:21:0x003a, B:23:0x0046, B:25:0x004c, B:15:0x002f, B:31:0x0057, B:33:0x0063, B:34:0x0067, B:36:0x006c, B:38:0x0072, B:40:0x0089, B:41:0x00d7, B:43:0x00db, B:44:0x00e3, B:46:0x00ed, B:48:0x00f1, B:50:0x00ff, B:53:0x0106), top: B:58:0x0005 }] */
    public final synchronized void e(b.a aVar) {
        long j8;
        this.f98005e.getClass();
        if (aVar.f97943b.p()) {
            return;
        }
        androidx.media3.exoplayer.source.j.b bVar = aVar.f97945d;
        if (bVar != null) {
            long j14 = bVar.f9522d;
            a aVar2 = this.f98003c.get(this.f98007g);
            if (aVar2 != null) {
                j8 = aVar2.f98011c;
                if (j8 == -1) {
                    j8 = this.f98008h + 1;
                }
            } else {
                j8 = this.f98008h + 1;
            }
            if (j14 < j8) {
                return;
            }
            a aVar3 = this.f98003c.get(this.f98007g);
            if (aVar3 != null && aVar3.f98011c == -1 && aVar3.f98010b != aVar.f97944c) {
                return;
            }
        }
        a aVarB = b(aVar.f97944c, aVar.f97945d);
        if (this.f98007g == null) {
            this.f98007g = aVarB.f98009a;
        }
        androidx.media3.exoplayer.source.j.b bVar2 = aVar.f97945d;
        if (bVar2 != null && bVar2.b()) {
            androidx.media3.exoplayer.source.j.b bVar3 = aVar.f97945d;
            androidx.media3.exoplayer.source.j.b bVar4 = new androidx.media3.exoplayer.source.j.b(bVar3.f9519a, bVar3.f9522d, bVar3.f9520b);
            a aVarB2 = b(aVar.f97944c, bVar4);
            if (!aVarB2.f98013e) {
                aVarB2.f98013e = true;
                aVar.f97943b.g(aVar.f97945d.f9519a, this.f98002b);
                new b.a(aVar.f97942a, aVar.f97943b, aVar.f97944c, bVar4, Math.max(0L, z.Y(this.f98002b.d(aVar.f97945d.f9520b)) + z.Y(this.f98002b.f8191e)), aVar.f97947f, aVar.f97948g, aVar.f97949h, aVar.f97950i, aVar.f97951j);
                this.f98005e.getClass();
            }
        }
        if (!aVarB.f98013e) {
            aVarB.f98013e = true;
            this.f98005e.getClass();
        }
        if (aVarB.f98009a.equals(this.f98007g) && !aVarB.f98014f) {
            aVarB.f98014f = true;
            p pVar = this.f98005e;
            String str = aVarB.f98009a;
            pVar.getClass();
            androidx.media3.exoplayer.source.j.b bVar5 = aVar.f97945d;
            if (bVar5 == null || !bVar5.b()) {
                pVar.p();
                pVar.f98024i = str;
                pVar.f98025j = o.f().setPlayerName("AndroidXMedia3").setPlayerVersion("1.5.1");
                pVar.z(aVar.f97943b, aVar.f97945d);
            }
        }
    }

    public n() {
        this(f97999i);
    }
}
