package hc;

import com.google.android.exoplayer2.C;

/* JADX INFO: loaded from: classes.dex */
public final class v implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f83162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fa.q f83163b = new fa.q(new byte[10]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f83164c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f83165d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public fa.w f83166e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f83167f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f83168g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f83169h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f83170i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f83171j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f83172k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f83173l;

    public v(j jVar) {
        this.f83162a = jVar;
    }

    @Override // hc.f0
    public final void a(fa.w wVar, bb.p pVar, f0.d dVar) {
        this.f83166e = wVar;
        this.f83162a.c(pVar, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [fa.q] */
    /* JADX WARN: Type inference failed for: r10v3, types: [int] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r3v0, types: [hc.j] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // hc.f0
    public final void b(int i14, fa.r rVar) {
        int i15;
        ?? r14;
        int i16;
        int i17;
        ?? r15;
        fa.a.f(this.f83166e);
        int i18 = i14 & 1;
        ?? r16 = this.f83162a;
        int i19 = 2;
        ?? r17 = 0;
        if (i18 != 0) {
            int i24 = this.f83164c;
            if (i24 != 0 && i24 != 1) {
                if (i24 == 2) {
                    fa.k.g("Unexpected start indicator reading extended header");
                } else {
                    if (i24 != 3) {
                        j20.x.h();
                        return;
                    }
                    if (this.f83171j != -1) {
                        fa.k.g("Unexpected start indicator: expected " + this.f83171j + " more bytes");
                    }
                    r16.d(rVar.f70056c == 0);
                }
            }
            this.f83164c = 1;
            this.f83165d = 0;
        }
        int i25 = i14;
        while (rVar.a() > 0) {
            int i26 = this.f83164c;
            if (i26 != 0) {
                ?? r18 = this.f83163b;
                if (i26 != 1) {
                    if (i26 == i19) {
                        if (c(rVar, r18.f70047a, Math.min(10, this.f83170i)) && c(rVar, null, this.f83170i)) {
                            r18.m(r17);
                            this.f83173l = C.TIME_UNSET;
                            if (this.f83167f) {
                                r18.o(4);
                                long jG = ((long) r18.g(3)) << 30;
                                r18.o(1);
                                long jG2 = ((long) (r18.g(15) << 15)) | jG;
                                r18.o(1);
                                long jG3 = jG2 | ((long) r18.g(15));
                                r18.o(1);
                                if (!this.f83169h && this.f83168g) {
                                    r18.o(4);
                                    long jG4 = ((long) r18.g(3)) << 30;
                                    r18.o(1);
                                    long jG5 = jG4 | ((long) (r18.g(15) << 15));
                                    r18.o(1);
                                    long jG6 = jG5 | ((long) r18.g(15));
                                    r18.o(1);
                                    this.f83166e.b(jG6);
                                    this.f83169h = true;
                                }
                                this.f83173l = this.f83166e.b(jG3);
                            }
                            i25 |= this.f83172k ? 4 : 0;
                            r16.packetStarted(this.f83173l, i25);
                            this.f83164c = 3;
                            this.f83165d = 0;
                            r17 = 0;
                            i19 = 2;
                        }
                    } else {
                        if (i26 != 3) {
                            j20.x.h();
                            return;
                        }
                        int iA = rVar.a();
                        int i27 = this.f83171j;
                        if (i27 == -1) {
                            r15 = r17;
                        } else {
                            i17 = iA - i27;
                        }
                        if (r15 > 0) {
                            r15 = i17;
                            iA -= r15;
                            rVar.F(rVar.f70055b + iA);
                        }
                        r15 = i17;
                        r16.b(rVar);
                        int i28 = this.f83171j;
                        if (i28 != -1) {
                            int i29 = i28 - iA;
                            this.f83171j = i29;
                            if (i29 == 0) {
                                r16.d(r17);
                                this.f83164c = 1;
                                this.f83165d = r17;
                            }
                        }
                    }
                    i15 = i19;
                    r14 = r17;
                } else {
                    ?? r19 = r17;
                    if (c(rVar, r18.f70047a, 9)) {
                        r18.m(r19 == true ? 1 : 0);
                        int iG = r18.g(24);
                        if (iG != 1) {
                            fb1.c.r(iG, "Unexpected start code prefix: ");
                            this.f83171j = -1;
                            i16 = 0;
                            i15 = 2;
                        } else {
                            r18.o(8);
                            int iG2 = r18.g(16);
                            r18.o(5);
                            this.f83172k = r18.f();
                            i15 = 2;
                            r18.o(2);
                            this.f83167f = r18.f();
                            this.f83168g = r18.f();
                            r18.o(6);
                            int iG3 = r18.g(8);
                            this.f83170i = iG3;
                            if (iG2 == 0) {
                                this.f83171j = -1;
                            } else {
                                int i30 = (iG2 - 3) - iG3;
                                this.f83171j = i30;
                                if (i30 < 0) {
                                    fa.k.g("Found negative packet payload size: " + this.f83171j);
                                    this.f83171j = -1;
                                }
                            }
                            i16 = 2;
                        }
                        this.f83164c = i16;
                        r14 = 0;
                        this.f83165d = 0;
                    } else {
                        i15 = 2;
                        r14 = r19;
                    }
                }
            } else {
                i15 = i19;
                r14 = r17;
                rVar.H(rVar.a());
            }
            r17 = r14;
            i19 = i15;
        }
    }

    public final boolean c(fa.r rVar, byte[] bArr, int i14) {
        int iMin = Math.min(rVar.a(), i14 - this.f83165d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            rVar.H(iMin);
        } else {
            rVar.e(bArr, this.f83165d, iMin);
        }
        int i15 = this.f83165d + iMin;
        this.f83165d = i15;
        return i15 == i14;
    }

    @Override // hc.f0
    public final void seek() {
        this.f83164c = 0;
        this.f83165d = 0;
        this.f83169h = false;
        this.f83162a.seek();
    }
}
