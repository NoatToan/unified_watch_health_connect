package p3;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lp3/e1;", "parentFrameClock", "", "<anonymous>", "(Lo53/b0;Lp3/e1;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2", f = "Recomposer.kt", l = {615, 626}, m = "invokeSuspend", v = 1)
public final class v2 extends v13.i implements e23.q<o53.b0, e1, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f135342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f135343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f135344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p1.u0 f135345d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p1.u0 f135346e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public p1.u0 f135347f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Set f135348g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p1.u0 f135349h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f135350i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ e1 f135351j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ s2 f135352k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(s2 s2Var, t13.d<? super v2> dVar) {
        super(3, dVar);
        this.f135352k = s2Var;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0075 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0077 A[Catch: all -> 0x0029, LOOP:1: B:12:0x0041->B:22:0x0077, LOOP_END, TryCatch #0 {all -> 0x0029, blocks: (B:4:0x000b, B:6:0x0018, B:9:0x002c, B:12:0x0041, B:14:0x0052, B:16:0x005c, B:18:0x0062, B:19:0x006f, B:24:0x0082, B:27:0x008f, B:29:0x009a, B:31:0x00a4, B:33:0x00aa, B:34:0x00b4, B:37:0x00bc, B:38:0x00bf, B:41:0x00cf, B:43:0x00da, B:45:0x00e4, B:47:0x00ea, B:48:0x00f7, B:51:0x00ff, B:52:0x0102, B:22:0x0077), top: B:57:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00ba A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x00bc A[Catch: all -> 0x0029, LOOP:3: B:27:0x008f->B:37:0x00bc, LOOP_END, TryCatch #0 {all -> 0x0029, blocks: (B:4:0x000b, B:6:0x0018, B:9:0x002c, B:12:0x0041, B:14:0x0052, B:16:0x005c, B:18:0x0062, B:19:0x006f, B:24:0x0082, B:27:0x008f, B:29:0x009a, B:31:0x00a4, B:33:0x00aa, B:34:0x00b4, B:37:0x00bc, B:38:0x00bf, B:41:0x00cf, B:43:0x00da, B:45:0x00e4, B:47:0x00ea, B:48:0x00f7, B:51:0x00ff, B:52:0x0102, B:22:0x0077), top: B:57:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00fd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x00ff A[Catch: all -> 0x0029, LOOP:5: B:41:0x00cf->B:51:0x00ff, LOOP_END, TryCatch #0 {all -> 0x0029, blocks: (B:4:0x000b, B:6:0x0018, B:9:0x002c, B:12:0x0041, B:14:0x0052, B:16:0x005c, B:18:0x0062, B:19:0x006f, B:24:0x0082, B:27:0x008f, B:29:0x009a, B:31:0x00a4, B:33:0x00aa, B:34:0x00b4, B:37:0x00bc, B:38:0x00bf, B:41:0x00cf, B:43:0x00da, B:45:0x00e4, B:47:0x00ea, B:48:0x00f7, B:51:0x00ff, B:52:0x0102, B:22:0x0077), top: B:57:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0082 A[EDGE_INSN: B:61:0x0082->B:24:0x0082 BREAK  A[LOOP:1: B:12:0x0041->B:22:0x0077], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00bf A[EDGE_INSN: B:66:0x00bf->B:38:0x00bf BREAK  A[LOOP:3: B:27:0x008f->B:37:0x00bc], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0102 A[EDGE_INSN: B:71:0x0102->B:52:0x0102 BREAK  A[LOOP:5: B:41:0x00cf->B:51:0x00ff], SYNTHETIC] */
    public static final void a(s2 s2Var, List<c0> list, List<j1> list2, List<c0> list3, p1.u0<c0> u0Var, p1.u0<c0> u0Var2, p1.u0<Object> u0Var3, p1.u0<c0> u0Var4) {
        char c14;
        long j8;
        long j14;
        synchronized (s2Var.f135276c) {
            try {
                list.clear();
                list2.clear();
                int size = list3.size();
                for (int i14 = 0; i14 < size; i14++) {
                    c0 c0Var = list3.get(i14);
                    c0Var.x();
                    s2Var.Q(c0Var);
                }
                list3.clear();
                Object[] objArr = u0Var.f134733b;
                long[] jArr = u0Var.f134732a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i15 = 0;
                    j8 = 255;
                    while (true) {
                        long j15 = jArr[i15];
                        c14 = 7;
                        j14 = -9187201950435737472L;
                        if ((((~j15) << 7) & j15 & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i15 != length) {
                                break;
                                break;
                            }
                            i15++;
                        } else {
                            int i16 = 8 - ((~(i15 - length)) >>> 31);
                            for (int i17 = 0; i17 < i16; i17++) {
                                if ((j15 & 255) < 128) {
                                    c0 c0Var2 = (c0) objArr[(i15 << 3) + i17];
                                    c0Var2.x();
                                    s2Var.Q(c0Var2);
                                }
                                j15 >>= 8;
                            }
                            if (i16 != 8) {
                                break;
                            } else if (i15 != length) {
                                break;
                            } else {
                                i15++;
                            }
                        }
                    }
                } else {
                    c14 = 7;
                    j8 = 255;
                    j14 = -9187201950435737472L;
                }
                u0Var.e();
                Object[] objArr2 = u0Var2.f134733b;
                long[] jArr2 = u0Var2.f134732a;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i18 = 0;
                    while (true) {
                        long j16 = jArr2[i18];
                        if ((((~j16) << c14) & j16 & j14) == j14) {
                            if (i18 != length2) {
                                break;
                                break;
                            }
                            i18++;
                        } else {
                            int i19 = 8 - ((~(i18 - length2)) >>> 31);
                            for (int i24 = 0; i24 < i19; i24++) {
                                if ((j16 & j8) < 128) {
                                    ((c0) objArr2[(i18 << 3) + i24]).n();
                                }
                                j16 >>= 8;
                            }
                            if (i19 != 8) {
                                break;
                            } else if (i18 != length2) {
                                break;
                            } else {
                                i18++;
                            }
                        }
                    }
                }
                u0Var2.e();
                u0Var3.e();
                Object[] objArr3 = u0Var4.f134733b;
                long[] jArr3 = u0Var4.f134732a;
                int length3 = jArr3.length - 2;
                if (length3 >= 0) {
                    int i25 = 0;
                    while (true) {
                        long j17 = jArr3[i25];
                        if ((((~j17) << c14) & j17 & j14) == j14) {
                            if (i25 != length3) {
                                break;
                                break;
                            }
                            i25++;
                        } else {
                            int i26 = 8 - ((~(i25 - length3)) >>> 31);
                            for (int i27 = 0; i27 < i26; i27++) {
                                if ((j17 & j8) < 128) {
                                    c0 c0Var3 = (c0) objArr3[(i25 << 3) + i27];
                                    c0Var3.x();
                                    s2Var.Q(c0Var3);
                                }
                                j17 >>= 8;
                            }
                            if (i26 != 8) {
                                break;
                            } else if (i25 != length3) {
                                break;
                            } else {
                                i25++;
                            }
                        }
                    }
                }
                u0Var4.e();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public static final void g(List<j1> list, s2 s2Var) {
        list.clear();
        synchronized (s2Var.f135276c) {
            try {
                ArrayList arrayList = s2Var.f135284k;
                int size = arrayList.size();
                for (int i14 = 0; i14 < size; i14++) {
                    list.add((j1) arrayList.get(i14));
                }
                s2Var.f135284k.clear();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // e23.q
    public final Object invoke(o53.b0 b0Var, e1 e1Var, t13.d<? super Unit> dVar) {
        v2 v2Var = new v2(this.f135352k, dVar);
        v2Var.f135351j = e1Var;
        return v2Var.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x009c A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:17:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:21:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:22:0x00d3 A[Catch: all -> 0x00ec, TRY_LEAVE, TryCatch #1 {, blocks: (B:19:0x00cb, B:22:0x00d3), top: B:68:0x00cb }] */
    /* JADX WARN: Code duplicated, block: B:26:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:30:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:37:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:40:0x0102  */
    /* JADX WARN: Code duplicated, block: B:43:0x013c  */
    /* JADX WARN: Code duplicated, block: B:65:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:68:0x00cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x013c -> B:44:0x013e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x01eb -> B:12:0x0097). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // v13.a
    public final java.lang.Object invokeSuspend(java.lang.Object r29) {
        /*
            Method dump skipped, instruction units count: 511
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p3.v2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
