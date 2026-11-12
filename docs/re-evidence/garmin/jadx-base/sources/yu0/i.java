package yu0;

import com.garmin.android.apps.connectmobile.g3;
import com.google.mlkit.common.MlKitException;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import p005kotlin.jvm.internal.s;
import r53.b2;
import r53.p2;
import wd2.f0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.livetrackplus.LiveTrackPlusViewModel$saveProfileUrlAndAccessCode$1", f = "LiveTrackPlusViewModel.kt", l = {193, 197, 201, MlKitException.CODE_SCANNER_PIPELINE_INFERENCE_ERROR, 235}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r0 f199767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r0 f199768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public r0 f199769c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f199770d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f199771e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(f fVar, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f199771e = fVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new i(this.f199771e, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:109:0x020b  */
    /* JADX WARN: Code duplicated, block: B:112:0x021c  */
    /* JADX WARN: Code duplicated, block: B:113:0x021f  */
    /* JADX WARN: Code duplicated, block: B:115:0x0222  */
    /* JADX WARN: Code duplicated, block: B:117:0x022d  */
    /* JADX WARN: Code duplicated, block: B:119:0x023d  */
    /* JADX WARN: Code duplicated, block: B:120:0x0240  */
    /* JADX WARN: Code duplicated, block: B:122:0x0253  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:62:0x0168  */
    /* JADX WARN: Code duplicated, block: B:63:0x016b  */
    /* JADX WARN: Code duplicated, block: B:66:0x016f  */
    /* JADX WARN: Code duplicated, block: B:69:0x0176  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:78:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:80:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:81:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:84:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:86:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:87:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:88:0x01c8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:90:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:93:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:94:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:96:0x01e0 A[PHI: r2 r5 r6
      0x01e0: PHI (r2v13 kotlin.jvm.internal.r0) = (r2v8 kotlin.jvm.internal.r0), (r2v8 kotlin.jvm.internal.r0), (r2v17 kotlin.jvm.internal.r0) binds: [B:68:0x0174, B:70:0x0182, B:95:0x01d8] A[DONT_GENERATE, DONT_INLINE]
      0x01e0: PHI (r5v10 kotlin.jvm.internal.r0) = (r5v6 kotlin.jvm.internal.r0), (r5v6 kotlin.jvm.internal.r0), (r5v12 kotlin.jvm.internal.r0) binds: [B:68:0x0174, B:70:0x0182, B:95:0x01d8] A[DONT_GENERATE, DONT_INLINE]
      0x01e0: PHI (r6v11 kotlin.jvm.internal.r0) = (r6v8 kotlin.jvm.internal.r0), (r6v8 kotlin.jvm.internal.r0), (r6v13 kotlin.jvm.internal.r0) binds: [B:68:0x0174, B:70:0x0182, B:95:0x01d8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:99:0x01f3  */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x026f, code lost:
    
        if (r2.a(r24) == r1) goto L127;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r0 r0VarS;
        r0 r0Var;
        r0 r0Var2;
        r0 r0Var3;
        su0.a aVar;
        ev0.c cVar;
        Object objK2;
        r0 r0Var4;
        r0 r0Var5;
        T t7;
        r0 r0Var6;
        r0 r0Var7;
        T t14;
        p2 p2Var;
        Object value;
        r0 r0Var8;
        r0 r0Var9;
        Object value2;
        ev0.c cVar2;
        String str;
        Object objB;
        r0 r0Var10;
        r0 r0Var11;
        r0 r0Var12;
        T t15;
        p2 p2Var2;
        Object value3;
        ev0.c cVar3;
        ev0.c cVarA;
        T t16;
        boolean z14;
        f0 f0Var;
        Exception exc;
        ev0.c cVar4;
        String str2;
        String str3;
        ge2.e eVar;
        ge2.d dVar;
        String str4;
        String str5;
        String str6;
        String str7;
        T t17;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f199770d;
        f fVar = this.f199771e;
        if (i14 == 0) {
            r0VarS = wr.g.s(obj);
            r0Var = new r0();
            Object value4 = fVar.f199718p.getValue();
            ev0.c cVar5 = (ev0.c) ((g3) fVar.f199712j.f150540a.getValue()).f35301b;
            String str8 = cVar5 != null ? cVar5.f66155d : null;
            if (str8 == null) {
                str8 = "";
            }
            if (s.g(value4, str8)) {
                r0Var2 = r0VarS;
                r0Var3 = r0Var;
                b2 b2Var = fVar.f199712j;
                p2 p2Var3 = fVar.f199720r;
                aVar = fVar.f199704b;
                p2 p2Var4 = fVar.f199722v;
                cVar = (ev0.c) ((g3) b2Var.f150540a.getValue()).f35301b;
                if ((cVar == null && ((Boolean) p2Var4.getValue()).booleanValue() == cVar.b()) || ((Boolean) p2Var4.getValue()).booleanValue()) {
                    Object value5 = p2Var3.getValue();
                    ev0.c cVar6 = (ev0.c) ((g3) fVar.f199712j.f150540a.getValue()).f35301b;
                    String str9 = cVar6 != null ? cVar6.f66156e : null;
                    if (str9 == null) {
                        str9 = "";
                    }
                    if (s.g(value5, str9)) {
                        r0Var8 = r0Var2;
                        r0Var9 = new r0();
                        value2 = fVar.f199720r.getValue();
                        cVar2 = (ev0.c) ((g3) fVar.f199712j.f150540a.getValue()).f35301b;
                        if (cVar2 != null) {
                            str = cVar2.f66156e;
                        } else {
                            str = null;
                        }
                        if (s.g(value2, str != null ? str : "")) {
                            p2Var2 = fVar.f199711i;
                            do {
                                value3 = p2Var2.getValue();
                                g3.a aVar3 = g3.f35298f;
                                cVar3 = (ev0.c) ((g3) value3).f35301b;
                                if (cVar3 != null) {
                                    t16 = r0Var8.f105810a;
                                    if (t16 == 0) {
                                        z14 = false;
                                    } else {
                                        z14 = false;
                                    }
                                    String str10 = (String) fVar.f199718p.getValue();
                                    f0Var = (f0) r0Var3.f105810a;
                                    if (f0Var != null) {
                                        exc = f0Var.f184458b;
                                    } else {
                                        exc = null;
                                    }
                                    if (exc == null) {
                                        str3 = (String) fVar.f199720r.getValue();
                                    } else {
                                        cVar4 = (ev0.c) ((g3) fVar.f199712j.f150540a.getValue()).f35301b;
                                        if (cVar4 != null) {
                                            str3 = cVar4.f66156e;
                                        } else {
                                            str2 = null;
                                        }
                                        cVarA = ev0.c.a(cVar3, str10, str2, Boolean.valueOf(z14), (ev0.a) r0Var9.f105810a, 7);
                                    }
                                    str2 = str3;
                                    cVarA = ev0.c.a(cVar3, str10, str2, Boolean.valueOf(z14), (ev0.a) r0Var9.f105810a, 7);
                                } else {
                                    cVarA = null;
                                }
                                aVar3.getClass();
                            } while (!p2Var2.b(value3, g3.a.d(cVarA)));
                            uu0.h hVar = fVar.f199706d;
                            this.f199767a = null;
                            this.f199768b = null;
                            this.f199769c = null;
                            this.f199770d = 5;
                        } else {
                            p2Var2 = fVar.f199711i;
                            do {
                                value3 = p2Var2.getValue();
                                g3.a aVar4 = g3.f35298f;
                                cVar3 = (ev0.c) ((g3) value3).f35301b;
                                if (cVar3 != null) {
                                    t16 = r0Var8.f105810a;
                                    if (t16 == 0) {
                                        z14 = false;
                                    } else {
                                        z14 = false;
                                    }
                                    String str11 = (String) fVar.f199718p.getValue();
                                    f0Var = (f0) r0Var3.f105810a;
                                    if (f0Var != null) {
                                        exc = f0Var.f184458b;
                                    } else {
                                        exc = null;
                                    }
                                    if (exc == null) {
                                        str3 = (String) fVar.f199720r.getValue();
                                    } else {
                                        cVar4 = (ev0.c) ((g3) fVar.f199712j.f150540a.getValue()).f35301b;
                                        if (cVar4 != null) {
                                            str3 = cVar4.f66156e;
                                        } else {
                                            str2 = null;
                                        }
                                        cVarA = ev0.c.a(cVar3, str11, str2, Boolean.valueOf(z14), (ev0.a) r0Var9.f105810a, 7);
                                    }
                                    str2 = str3;
                                    cVarA = ev0.c.a(cVar3, str11, str2, Boolean.valueOf(z14), (ev0.a) r0Var9.f105810a, 7);
                                } else {
                                    cVarA = null;
                                }
                                aVar4.getClass();
                            } while (!p2Var2.b(value3, g3.a.d(cVarA)));
                            uu0.h hVar2 = fVar.f199706d;
                            this.f199767a = null;
                            this.f199768b = null;
                            this.f199769c = null;
                            this.f199770d = 5;
                        }
                    } else {
                        String str12 = (String) p2Var3.getValue();
                        this.f199767a = r0Var2;
                        this.f199768b = r0Var3;
                        this.f199769c = r0Var3;
                        this.f199770d = 3;
                        Object objJ1 = aVar.J1(str12, this);
                        if (objJ1 != aVar2) {
                            r0Var7 = r0Var3;
                            t15 = objJ1;
                            r0Var3.f105810a = t15;
                            r0Var3 = r0Var7;
                            r0Var8 = r0Var2;
                            r0Var9 = new r0();
                            value2 = fVar.f199720r.getValue();
                            cVar2 = (ev0.c) ((g3) fVar.f199712j.f150540a.getValue()).f35301b;
                            if (cVar2 != null) {
                                str = cVar2.f66156e;
                            } else {
                                str = null;
                            }
                            if (s.g(value2, str != null ? str : "")) {
                                p2Var2 = fVar.f199711i;
                                do {
                                    value3 = p2Var2.getValue();
                                    g3.a aVar5 = g3.f35298f;
                                    cVar3 = (ev0.c) ((g3) value3).f35301b;
                                    if (cVar3 != null) {
                                        t16 = r0Var8.f105810a;
                                        if (t16 == 0) {
                                            z14 = false;
                                        } else {
                                            z14 = false;
                                        }
                                        String str13 = (String) fVar.f199718p.getValue();
                                        f0Var = (f0) r0Var3.f105810a;
                                        if (f0Var != null) {
                                            exc = f0Var.f184458b;
                                        } else {
                                            exc = null;
                                        }
                                        if (exc == null) {
                                            str3 = (String) fVar.f199720r.getValue();
                                        } else {
                                            cVar4 = (ev0.c) ((g3) fVar.f199712j.f150540a.getValue()).f35301b;
                                            if (cVar4 != null) {
                                                str3 = cVar4.f66156e;
                                            } else {
                                                str2 = null;
                                            }
                                            cVarA = ev0.c.a(cVar3, str13, str2, Boolean.valueOf(z14), (ev0.a) r0Var9.f105810a, 7);
                                        }
                                        str2 = str3;
                                        cVarA = ev0.c.a(cVar3, str13, str2, Boolean.valueOf(z14), (ev0.a) r0Var9.f105810a, 7);
                                    } else {
                                        cVarA = null;
                                    }
                                    aVar5.getClass();
                                } while (!p2Var2.b(value3, g3.a.d(cVarA)));
                                uu0.h hVar3 = fVar.f199706d;
                                this.f199767a = null;
                                this.f199768b = null;
                                this.f199769c = null;
                                this.f199770d = 5;
                            } else {
                                p2Var2 = fVar.f199711i;
                                do {
                                    value3 = p2Var2.getValue();
                                    g3.a aVar6 = g3.f35298f;
                                    cVar3 = (ev0.c) ((g3) value3).f35301b;
                                    if (cVar3 != null) {
                                        t16 = r0Var8.f105810a;
                                        if (t16 == 0) {
                                            z14 = false;
                                        } else {
                                            z14 = false;
                                        }
                                        String str14 = (String) fVar.f199718p.getValue();
                                        f0Var = (f0) r0Var3.f105810a;
                                        if (f0Var != null) {
                                            exc = f0Var.f184458b;
                                        } else {
                                            exc = null;
                                        }
                                        if (exc == null) {
                                            str3 = (String) fVar.f199720r.getValue();
                                        } else {
                                            cVar4 = (ev0.c) ((g3) fVar.f199712j.f150540a.getValue()).f35301b;
                                            if (cVar4 != null) {
                                                str3 = cVar4.f66156e;
                                            } else {
                                                str2 = null;
                                            }
                                            cVarA = ev0.c.a(cVar3, str14, str2, Boolean.valueOf(z14), (ev0.a) r0Var9.f105810a, 7);
                                        }
                                        str2 = str3;
                                        cVarA = ev0.c.a(cVar3, str14, str2, Boolean.valueOf(z14), (ev0.a) r0Var9.f105810a, 7);
                                    } else {
                                        cVarA = null;
                                    }
                                    aVar6.getClass();
                                } while (!p2Var2.b(value3, g3.a.d(cVarA)));
                                uu0.h hVar4 = fVar.f199706d;
                                this.f199767a = null;
                                this.f199768b = null;
                                this.f199769c = null;
                                this.f199770d = 5;
                            }
                        }
                    }
                } else {
                    this.f199767a = r0Var2;
                    this.f199768b = r0Var3;
                    this.f199769c = r0Var3;
                    this.f199770d = 2;
                    objK2 = aVar.k2(this);
                    if (objK2 != aVar2) {
                        r0Var4 = r0Var3;
                        r0Var5 = r0Var4;
                        t7 = objK2;
                        r0Var6 = r0Var2;
                        fVar.getClass();
                        p2Var = fVar.f199719q;
                        do {
                            value = p2Var.getValue();
                        } while (!p2Var.b(value, ""));
                        r0Var4.f105810a = t7;
                        r0Var3 = r0Var5;
                        r0Var8 = r0Var6;
                        r0Var9 = new r0();
                        value2 = fVar.f199720r.getValue();
                        cVar2 = (ev0.c) ((g3) fVar.f199712j.f150540a.getValue()).f35301b;
                        if (cVar2 != null) {
                            str = cVar2.f66156e;
                        } else {
                            str = null;
                        }
                        if (s.g(value2, str != null ? str : "")) {
                            p2Var2 = fVar.f199711i;
                            do {
                                value3 = p2Var2.getValue();
                                g3.a aVar7 = g3.f35298f;
                                cVar3 = (ev0.c) ((g3) value3).f35301b;
                                if (cVar3 != null) {
                                    t16 = r0Var8.f105810a;
                                    if (t16 == 0) {
                                        z14 = false;
                                    } else {
                                        z14 = false;
                                    }
                                    String str15 = (String) fVar.f199718p.getValue();
                                    f0Var = (f0) r0Var3.f105810a;
                                    if (f0Var != null) {
                                        exc = f0Var.f184458b;
                                    } else {
                                        exc = null;
                                    }
                                    if (exc == null) {
                                        str3 = (String) fVar.f199720r.getValue();
                                    } else {
                                        cVar4 = (ev0.c) ((g3) fVar.f199712j.f150540a.getValue()).f35301b;
                                        if (cVar4 != null) {
                                            str3 = cVar4.f66156e;
                                        } else {
                                            str2 = null;
                                        }
                                        cVarA = ev0.c.a(cVar3, str15, str2, Boolean.valueOf(z14), (ev0.a) r0Var9.f105810a, 7);
                                    }
                                    str2 = str3;
                                    cVarA = ev0.c.a(cVar3, str15, str2, Boolean.valueOf(z14), (ev0.a) r0Var9.f105810a, 7);
                                } else {
                                    cVarA = null;
                                }
                                aVar7.getClass();
                            } while (!p2Var2.b(value3, g3.a.d(cVarA)));
                            uu0.h hVar5 = fVar.f199706d;
                            this.f199767a = null;
                            this.f199768b = null;
                            this.f199769c = null;
                            this.f199770d = 5;
                        } else {
                            p2Var2 = fVar.f199711i;
                            do {
                                value3 = p2Var2.getValue();
                                g3.a aVar8 = g3.f35298f;
                                cVar3 = (ev0.c) ((g3) value3).f35301b;
                                if (cVar3 != null) {
                                    t16 = r0Var8.f105810a;
                                    if (t16 == 0) {
                                        z14 = false;
                                    } else {
                                        z14 = false;
                                    }
                                    String str16 = (String) fVar.f199718p.getValue();
                                    f0Var = (f0) r0Var3.f105810a;
                                    if (f0Var != null) {
                                        exc = f0Var.f184458b;
                                    } else {
                                        exc = null;
                                    }
                                    if (exc == null) {
                                        str3 = (String) fVar.f199720r.getValue();
                                    } else {
                                        cVar4 = (ev0.c) ((g3) fVar.f199712j.f150540a.getValue()).f35301b;
                                        if (cVar4 != null) {
                                            str3 = cVar4.f66156e;
                                        } else {
                                            str2 = null;
                                        }
                                        cVarA = ev0.c.a(cVar3, str16, str2, Boolean.valueOf(z14), (ev0.a) r0Var9.f105810a, 7);
                                    }
                                    str2 = str3;
                                    cVarA = ev0.c.a(cVar3, str16, str2, Boolean.valueOf(z14), (ev0.a) r0Var9.f105810a, 7);
                                } else {
                                    cVarA = null;
                                }
                                aVar8.getClass();
                            } while (!p2Var2.b(value3, g3.a.d(cVarA)));
                            uu0.h hVar6 = fVar.f199706d;
                            this.f199767a = null;
                            this.f199768b = null;
                            this.f199769c = null;
                            this.f199770d = 5;
                        }
                    }
                }
            } else {
                String str17 = (String) fVar.f199717o.getValue();
                this.f199767a = r0VarS;
                this.f199768b = r0Var;
                this.f199769c = r0VarS;
                this.f199770d = 1;
                Object objO1 = fVar.f199703a.o1(str17, this);
                if (objO1 != aVar2) {
                    r0Var2 = r0VarS;
                    t14 = objO1;
                }
            }
            return aVar2;
        }
        if (i14 == 1) {
            r0VarS = this.f199769c;
            r0Var = this.f199768b;
            r0 r0Var13 = this.f199767a;
            r.b(obj);
            r0Var2 = r0Var13;
            t14 = obj;
        } else {
            if (i14 == 2) {
                r0 r0Var14 = this.f199769c;
                r0 r0Var15 = this.f199768b;
                r0 r0Var16 = this.f199767a;
                r.b(obj);
                r0Var4 = r0Var14;
                r0Var5 = r0Var15;
                r0Var6 = r0Var16;
                t7 = obj;
                fVar.getClass();
                p2Var = fVar.f199719q;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, ""));
                r0Var4.f105810a = t7;
                r0Var3 = r0Var5;
                r0Var8 = r0Var6;
                r0Var9 = new r0();
                value2 = fVar.f199720r.getValue();
                cVar2 = (ev0.c) ((g3) fVar.f199712j.f150540a.getValue()).f35301b;
                if (cVar2 != null) {
                    str = cVar2.f66156e;
                } else {
                    str = null;
                }
                if (s.g(value2, str != null ? str : "")) {
                    p2Var2 = fVar.f199711i;
                    do {
                        value3 = p2Var2.getValue();
                        g3.a aVar9 = g3.f35298f;
                        cVar3 = (ev0.c) ((g3) value3).f35301b;
                        if (cVar3 != null) {
                            t16 = r0Var8.f105810a;
                            if (t16 == 0) {
                                z14 = false;
                            } else {
                                z14 = false;
                            }
                            String str18 = (String) fVar.f199718p.getValue();
                            f0Var = (f0) r0Var3.f105810a;
                            if (f0Var != null) {
                                exc = f0Var.f184458b;
                            } else {
                                exc = null;
                            }
                            if (exc == null) {
                                str3 = (String) fVar.f199720r.getValue();
                            } else {
                                cVar4 = (ev0.c) ((g3) fVar.f199712j.f150540a.getValue()).f35301b;
                                if (cVar4 != null) {
                                    str3 = cVar4.f66156e;
                                } else {
                                    str2 = null;
                                }
                                cVarA = ev0.c.a(cVar3, str18, str2, Boolean.valueOf(z14), (ev0.a) r0Var9.f105810a, 7);
                            }
                            str2 = str3;
                            cVarA = ev0.c.a(cVar3, str18, str2, Boolean.valueOf(z14), (ev0.a) r0Var9.f105810a, 7);
                        } else {
                            cVarA = null;
                        }
                        aVar9.getClass();
                    } while (!p2Var2.b(value3, g3.a.d(cVarA)));
                    uu0.h hVar7 = fVar.f199706d;
                    this.f199767a = null;
                    this.f199768b = null;
                    this.f199769c = null;
                    this.f199770d = 5;
                } else {
                    p2Var2 = fVar.f199711i;
                    do {
                        value3 = p2Var2.getValue();
                        g3.a aVar10 = g3.f35298f;
                        cVar3 = (ev0.c) ((g3) value3).f35301b;
                        if (cVar3 != null) {
                            t16 = r0Var8.f105810a;
                            if (t16 == 0) {
                                z14 = false;
                            } else {
                                z14 = false;
                            }
                            String str19 = (String) fVar.f199718p.getValue();
                            f0Var = (f0) r0Var3.f105810a;
                            if (f0Var != null) {
                                exc = f0Var.f184458b;
                            } else {
                                exc = null;
                            }
                            if (exc == null) {
                                str3 = (String) fVar.f199720r.getValue();
                            } else {
                                cVar4 = (ev0.c) ((g3) fVar.f199712j.f150540a.getValue()).f35301b;
                                if (cVar4 != null) {
                                    str3 = cVar4.f66156e;
                                } else {
                                    str2 = null;
                                }
                                cVarA = ev0.c.a(cVar3, str19, str2, Boolean.valueOf(z14), (ev0.a) r0Var9.f105810a, 7);
                            }
                            str2 = str3;
                            cVarA = ev0.c.a(cVar3, str19, str2, Boolean.valueOf(z14), (ev0.a) r0Var9.f105810a, 7);
                        } else {
                            cVarA = null;
                        }
                        aVar10.getClass();
                    } while (!p2Var2.b(value3, g3.a.d(cVarA)));
                    uu0.h hVar8 = fVar.f199706d;
                    this.f199767a = null;
                    this.f199768b = null;
                    this.f199769c = null;
                    this.f199770d = 5;
                }
                return aVar2;
            }
            if (i14 == 3) {
                r0Var3 = this.f199769c;
                r0 r0Var17 = this.f199768b;
                r0 r0Var18 = this.f199767a;
                r.b(obj);
                r0Var2 = r0Var18;
                r0Var7 = r0Var17;
                t15 = obj;
                r0Var3.f105810a = t15;
                r0Var3 = r0Var7;
                r0Var8 = r0Var2;
                r0Var9 = new r0();
                value2 = fVar.f199720r.getValue();
                cVar2 = (ev0.c) ((g3) fVar.f199712j.f150540a.getValue()).f35301b;
                if (cVar2 != null) {
                    str = cVar2.f66156e;
                } else {
                    str = null;
                }
                if (s.g(value2, str != null ? str : "") || !((Boolean) fVar.f199722v.getValue()).booleanValue()) {
                    p2Var2 = fVar.f199711i;
                    do {
                        value3 = p2Var2.getValue();
                        g3.a aVar11 = g3.f35298f;
                        cVar3 = (ev0.c) ((g3) value3).f35301b;
                        if (cVar3 != null) {
                            t16 = r0Var8.f105810a;
                            if (t16 == 0) {
                                z14 = false;
                            } else {
                                z14 = false;
                            }
                            String str110 = (String) fVar.f199718p.getValue();
                            f0Var = (f0) r0Var3.f105810a;
                            if (f0Var != null) {
                                exc = f0Var.f184458b;
                            } else {
                                exc = null;
                            }
                            if (exc == null) {
                                str3 = (String) fVar.f199720r.getValue();
                            } else {
                                cVar4 = (ev0.c) ((g3) fVar.f199712j.f150540a.getValue()).f35301b;
                                if (cVar4 != null) {
                                    str3 = cVar4.f66156e;
                                } else {
                                    str2 = null;
                                }
                                cVarA = ev0.c.a(cVar3, str110, str2, Boolean.valueOf(z14), (ev0.a) r0Var9.f105810a, 7);
                            }
                            str2 = str3;
                            cVarA = ev0.c.a(cVar3, str110, str2, Boolean.valueOf(z14), (ev0.a) r0Var9.f105810a, 7);
                        } else {
                            cVarA = null;
                        }
                        aVar11.getClass();
                    } while (!p2Var2.b(value3, g3.a.d(cVarA)));
                    uu0.h hVar9 = fVar.f199706d;
                    this.f199767a = null;
                    this.f199768b = null;
                    this.f199769c = null;
                    this.f199770d = 5;
                } else {
                    this.f199767a = r0Var8;
                    this.f199768b = r0Var3;
                    this.f199769c = r0Var9;
                    this.f199770d = 4;
                    objB = fVar.f199705c.b(this);
                    if (objB != aVar2) {
                        r0 r0Var19 = r0Var8;
                        r0Var10 = r0Var3;
                        r0Var11 = r0Var9;
                        r0Var12 = r0Var19;
                        eVar = (ge2.e) ((f0) objB).f184457a;
                        if (eVar != null) {
                            dVar = eVar.f77027f;
                        } else {
                            dVar = null;
                        }
                        if (dVar != null) {
                            str4 = dVar.f77020a;
                        } else {
                            str4 = null;
                        }
                        ge2.b bVar = ge2.b.OnlyMe;
                        str5 = bVar.f77016a;
                        str6 = bVar.f77016a;
                        if (s.g(str4, str5)) {
                            if (dVar != null) {
                                str7 = dVar.f77021b;
                            } else {
                                str7 = null;
                            }
                            if (s.g(str7, str6)) {
                                t17 = ev0.a.ACTIVE;
                            } else {
                                t17 = 0;
                            }
                        } else if (s.g(dVar.f77021b, str6)) {
                            t17 = ev0.a.SAVED_ACTIVE;
                        } else {
                            t17 = ev0.a.SAVED;
                        }
                        r0Var11.f105810a = t17;
                        r0 r0Var20 = r0Var12;
                        r0Var9 = r0Var11;
                        r0Var3 = r0Var10;
                        r0Var8 = r0Var20;
                        p2Var2 = fVar.f199711i;
                        do {
                            value3 = p2Var2.getValue();
                            g3.a aVar12 = g3.f35298f;
                            cVar3 = (ev0.c) ((g3) value3).f35301b;
                            if (cVar3 != null) {
                                t16 = r0Var8.f105810a;
                                if (t16 == 0) {
                                    z14 = false;
                                } else {
                                    z14 = false;
                                }
                                String str111 = (String) fVar.f199718p.getValue();
                                f0Var = (f0) r0Var3.f105810a;
                                if (f0Var != null) {
                                    exc = f0Var.f184458b;
                                } else {
                                    exc = null;
                                }
                                if (exc == null) {
                                    str3 = (String) fVar.f199720r.getValue();
                                } else {
                                    cVar4 = (ev0.c) ((g3) fVar.f199712j.f150540a.getValue()).f35301b;
                                    if (cVar4 != null) {
                                        str3 = cVar4.f66156e;
                                    } else {
                                        str2 = null;
                                    }
                                    cVarA = ev0.c.a(cVar3, str111, str2, Boolean.valueOf(z14), (ev0.a) r0Var9.f105810a, 7);
                                }
                                str2 = str3;
                                cVarA = ev0.c.a(cVar3, str111, str2, Boolean.valueOf(z14), (ev0.a) r0Var9.f105810a, 7);
                            } else {
                                cVarA = null;
                            }
                            aVar12.getClass();
                        } while (!p2Var2.b(value3, g3.a.d(cVarA)));
                        uu0.h hVar10 = fVar.f199706d;
                        this.f199767a = null;
                        this.f199768b = null;
                        this.f199769c = null;
                        this.f199770d = 5;
                    }
                }
                return aVar2;
            }
            if (i14 == 4) {
                r0Var11 = this.f199769c;
                r0 r0Var21 = this.f199768b;
                r0 r0Var22 = this.f199767a;
                r.b(obj);
                r0Var12 = r0Var22;
                r0Var10 = r0Var21;
                objB = obj;
                eVar = (ge2.e) ((f0) objB).f184457a;
                if (eVar != null) {
                    dVar = eVar.f77027f;
                } else {
                    dVar = null;
                }
                if (dVar != null) {
                    str4 = dVar.f77020a;
                } else {
                    str4 = null;
                }
                ge2.b bVar2 = ge2.b.OnlyMe;
                str5 = bVar2.f77016a;
                str6 = bVar2.f77016a;
                if (s.g(str4, str5)) {
                    if (dVar != null) {
                        str7 = dVar.f77021b;
                    } else {
                        str7 = null;
                    }
                    if (s.g(str7, str6)) {
                        t17 = ev0.a.ACTIVE;
                    } else {
                        t17 = 0;
                    }
                } else if (s.g(dVar.f77021b, str6)) {
                    t17 = ev0.a.SAVED_ACTIVE;
                } else {
                    t17 = ev0.a.SAVED;
                }
                r0Var11.f105810a = t17;
                r0 r0Var23 = r0Var12;
                r0Var9 = r0Var11;
                r0Var3 = r0Var10;
                r0Var8 = r0Var23;
                p2Var2 = fVar.f199711i;
                do {
                    value3 = p2Var2.getValue();
                    g3.a aVar13 = g3.f35298f;
                    cVar3 = (ev0.c) ((g3) value3).f35301b;
                    if (cVar3 != null) {
                        t16 = r0Var8.f105810a;
                        if (t16 == 0 && ((f0) t16).f184458b == null) {
                            f0 f0Var2 = (f0) r0Var3.f105810a;
                            if ((f0Var2 != null ? f0Var2.f184458b : null) == null) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                        } else {
                            z14 = false;
                        }
                        String str112 = (String) fVar.f199718p.getValue();
                        f0Var = (f0) r0Var3.f105810a;
                        if (f0Var != null) {
                            exc = f0Var.f184458b;
                        } else {
                            exc = null;
                        }
                        if (exc == null) {
                            str3 = (String) fVar.f199720r.getValue();
                        } else {
                            cVar4 = (ev0.c) ((g3) fVar.f199712j.f150540a.getValue()).f35301b;
                            if (cVar4 != null) {
                                str3 = cVar4.f66156e;
                            } else {
                                str2 = null;
                            }
                            cVarA = ev0.c.a(cVar3, str112, str2, Boolean.valueOf(z14), (ev0.a) r0Var9.f105810a, 7);
                        }
                        str2 = str3;
                        cVarA = ev0.c.a(cVar3, str112, str2, Boolean.valueOf(z14), (ev0.a) r0Var9.f105810a, 7);
                    } else {
                        cVarA = null;
                    }
                    aVar13.getClass();
                } while (!p2Var2.b(value3, g3.a.d(cVarA)));
                uu0.h hVar11 = fVar.f199706d;
                this.f199767a = null;
                this.f199768b = null;
                this.f199769c = null;
                this.f199770d = 5;
            } else {
                if (i14 != 5) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
        }
        return Unit.INSTANCE;
        r0VarS.f105810a = t14;
        r0Var3 = r0Var;
        b2 b2Var2 = fVar.f199712j;
        p2 p2Var5 = fVar.f199720r;
        aVar = fVar.f199704b;
        p2 p2Var6 = fVar.f199722v;
        cVar = (ev0.c) ((g3) b2Var2.f150540a.getValue()).f35301b;
        if (cVar == null) {
            this.f199767a = r0Var2;
            this.f199768b = r0Var3;
            this.f199769c = r0Var3;
            this.f199770d = 2;
            objK2 = aVar.k2(this);
            if (objK2 != aVar2) {
                r0Var4 = r0Var3;
                r0Var5 = r0Var4;
                t7 = objK2;
                r0Var6 = r0Var2;
                fVar.getClass();
                p2Var = fVar.f199719q;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, ""));
                r0Var4.f105810a = t7;
                r0Var3 = r0Var5;
                r0Var8 = r0Var6;
                r0Var9 = new r0();
                value2 = fVar.f199720r.getValue();
                cVar2 = (ev0.c) ((g3) fVar.f199712j.f150540a.getValue()).f35301b;
                if (cVar2 != null) {
                    str = cVar2.f66156e;
                } else {
                    str = null;
                }
                if (s.g(value2, str != null ? str : "")) {
                    p2Var2 = fVar.f199711i;
                    do {
                        value3 = p2Var2.getValue();
                        g3.a aVar14 = g3.f35298f;
                        cVar3 = (ev0.c) ((g3) value3).f35301b;
                        if (cVar3 != null) {
                            t16 = r0Var8.f105810a;
                            if (t16 == 0) {
                                z14 = false;
                            } else {
                                z14 = false;
                            }
                            String str113 = (String) fVar.f199718p.getValue();
                            f0Var = (f0) r0Var3.f105810a;
                            if (f0Var != null) {
                                exc = f0Var.f184458b;
                            } else {
                                exc = null;
                            }
                            if (exc == null) {
                                str3 = (String) fVar.f199720r.getValue();
                            } else {
                                cVar4 = (ev0.c) ((g3) fVar.f199712j.f150540a.getValue()).f35301b;
                                if (cVar4 != null) {
                                    str3 = cVar4.f66156e;
                                } else {
                                    str2 = null;
                                }
                                cVarA = ev0.c.a(cVar3, str113, str2, Boolean.valueOf(z14), (ev0.a) r0Var9.f105810a, 7);
                            }
                            str2 = str3;
                            cVarA = ev0.c.a(cVar3, str113, str2, Boolean.valueOf(z14), (ev0.a) r0Var9.f105810a, 7);
                        } else {
                            cVarA = null;
                        }
                        aVar14.getClass();
                    } while (!p2Var2.b(value3, g3.a.d(cVarA)));
                    uu0.h hVar12 = fVar.f199706d;
                    this.f199767a = null;
                    this.f199768b = null;
                    this.f199769c = null;
                    this.f199770d = 5;
                } else {
                    p2Var2 = fVar.f199711i;
                    do {
                        value3 = p2Var2.getValue();
                        g3.a aVar15 = g3.f35298f;
                        cVar3 = (ev0.c) ((g3) value3).f35301b;
                        if (cVar3 != null) {
                            t16 = r0Var8.f105810a;
                            if (t16 == 0) {
                                z14 = false;
                            } else {
                                z14 = false;
                            }
                            String str114 = (String) fVar.f199718p.getValue();
                            f0Var = (f0) r0Var3.f105810a;
                            if (f0Var != null) {
                                exc = f0Var.f184458b;
                            } else {
                                exc = null;
                            }
                            if (exc == null) {
                                str3 = (String) fVar.f199720r.getValue();
                            } else {
                                cVar4 = (ev0.c) ((g3) fVar.f199712j.f150540a.getValue()).f35301b;
                                if (cVar4 != null) {
                                    str3 = cVar4.f66156e;
                                } else {
                                    str2 = null;
                                }
                                cVarA = ev0.c.a(cVar3, str114, str2, Boolean.valueOf(z14), (ev0.a) r0Var9.f105810a, 7);
                            }
                            str2 = str3;
                            cVarA = ev0.c.a(cVar3, str114, str2, Boolean.valueOf(z14), (ev0.a) r0Var9.f105810a, 7);
                        } else {
                            cVarA = null;
                        }
                        aVar15.getClass();
                    } while (!p2Var2.b(value3, g3.a.d(cVarA)));
                    uu0.h hVar13 = fVar.f199706d;
                    this.f199767a = null;
                    this.f199768b = null;
                    this.f199769c = null;
                    this.f199770d = 5;
                }
            }
        } else {
            this.f199767a = r0Var2;
            this.f199768b = r0Var3;
            this.f199769c = r0Var3;
            this.f199770d = 2;
            objK2 = aVar.k2(this);
            if (objK2 != aVar2) {
                r0Var4 = r0Var3;
                r0Var5 = r0Var4;
                t7 = objK2;
                r0Var6 = r0Var2;
                fVar.getClass();
                p2Var = fVar.f199719q;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, ""));
                r0Var4.f105810a = t7;
                r0Var3 = r0Var5;
                r0Var8 = r0Var6;
                r0Var9 = new r0();
                value2 = fVar.f199720r.getValue();
                cVar2 = (ev0.c) ((g3) fVar.f199712j.f150540a.getValue()).f35301b;
                if (cVar2 != null) {
                    str = cVar2.f66156e;
                } else {
                    str = null;
                }
                if (s.g(value2, str != null ? str : "")) {
                    p2Var2 = fVar.f199711i;
                    do {
                        value3 = p2Var2.getValue();
                        g3.a aVar16 = g3.f35298f;
                        cVar3 = (ev0.c) ((g3) value3).f35301b;
                        if (cVar3 != null) {
                            t16 = r0Var8.f105810a;
                            if (t16 == 0) {
                                z14 = false;
                            } else {
                                z14 = false;
                            }
                            String str115 = (String) fVar.f199718p.getValue();
                            f0Var = (f0) r0Var3.f105810a;
                            if (f0Var != null) {
                                exc = f0Var.f184458b;
                            } else {
                                exc = null;
                            }
                            if (exc == null) {
                                str3 = (String) fVar.f199720r.getValue();
                            } else {
                                cVar4 = (ev0.c) ((g3) fVar.f199712j.f150540a.getValue()).f35301b;
                                if (cVar4 != null) {
                                    str3 = cVar4.f66156e;
                                } else {
                                    str2 = null;
                                }
                                cVarA = ev0.c.a(cVar3, str115, str2, Boolean.valueOf(z14), (ev0.a) r0Var9.f105810a, 7);
                            }
                            str2 = str3;
                            cVarA = ev0.c.a(cVar3, str115, str2, Boolean.valueOf(z14), (ev0.a) r0Var9.f105810a, 7);
                        } else {
                            cVarA = null;
                        }
                        aVar16.getClass();
                    } while (!p2Var2.b(value3, g3.a.d(cVarA)));
                    uu0.h hVar14 = fVar.f199706d;
                    this.f199767a = null;
                    this.f199768b = null;
                    this.f199769c = null;
                    this.f199770d = 5;
                } else {
                    p2Var2 = fVar.f199711i;
                    do {
                        value3 = p2Var2.getValue();
                        g3.a aVar17 = g3.f35298f;
                        cVar3 = (ev0.c) ((g3) value3).f35301b;
                        if (cVar3 != null) {
                            t16 = r0Var8.f105810a;
                            if (t16 == 0) {
                                z14 = false;
                            } else {
                                z14 = false;
                            }
                            String str116 = (String) fVar.f199718p.getValue();
                            f0Var = (f0) r0Var3.f105810a;
                            if (f0Var != null) {
                                exc = f0Var.f184458b;
                            } else {
                                exc = null;
                            }
                            if (exc == null) {
                                str3 = (String) fVar.f199720r.getValue();
                            } else {
                                cVar4 = (ev0.c) ((g3) fVar.f199712j.f150540a.getValue()).f35301b;
                                if (cVar4 != null) {
                                    str3 = cVar4.f66156e;
                                } else {
                                    str2 = null;
                                }
                                cVarA = ev0.c.a(cVar3, str116, str2, Boolean.valueOf(z14), (ev0.a) r0Var9.f105810a, 7);
                            }
                            str2 = str3;
                            cVarA = ev0.c.a(cVar3, str116, str2, Boolean.valueOf(z14), (ev0.a) r0Var9.f105810a, 7);
                        } else {
                            cVarA = null;
                        }
                        aVar17.getClass();
                    } while (!p2Var2.b(value3, g3.a.d(cVarA)));
                    uu0.h hVar15 = fVar.f199706d;
                    this.f199767a = null;
                    this.f199768b = null;
                    this.f199769c = null;
                    this.f199770d = 5;
                }
            }
        }
        return aVar2;
    }
}
