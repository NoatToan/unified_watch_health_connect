package com.mapbox.maps.extension.compose.ornaments.logo;

import c2.h2;
import c2.l;
import c2.t;
import com.mapbox.maps.extension.compose.MapboxMapScopeMarker;
import com.mapbox.maps.extension.compose.R;
import e23.p;
import g6.f;
import h4.d;
import h4.r;
import n5.c;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import u1.y0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/mapbox/maps/extension/compose/ornaments/logo/MapLogoScope;", "", "Lc2/t;", "boxScope", "<init>", "(Lc2/t;)V", "Lh4/r;", "modifier", "Lc2/h2;", "contentPadding", "Lh4/d;", "alignment", "", "Logo", "(Lh4/r;Lc2/h2;Lh4/d;Lp3/m;II)V", "Lc2/t;", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@MapboxMapScopeMarker
public final class MapLogoScope {
    private final t boxScope;

    public MapLogoScope(t tVar) {
        tVar.getClass();
        this.boxScope = tVar;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:40:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:47:0x007f  */
    /* JADX WARN: Code duplicated, block: B:51:0x008d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x008f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:55:0x0095  */
    /* JADX WARN: Code duplicated, block: B:56:0x009d  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:64:0x00d9  */
    public final void Logo(r rVar, h2 h2Var, d dVar, m mVar, int i14, int i15) {
        r rVar2;
        int i16;
        h2 h2Var2;
        int i17;
        d dVar2;
        int i18;
        int i19;
        r rVar3;
        h2 h2VarA;
        d dVar3;
        d dVar4;
        h2 h2Var3;
        r rVar4;
        p2 p2VarI0;
        o0 o0VarE = mVar.E(-1677921706);
        int i24 = i15 & 1;
        if (i24 != 0) {
            i16 = i14 | 6;
            rVar2 = rVar;
        } else if ((i14 & 14) == 0) {
            rVar2 = rVar;
            i16 = (o0VarE.B(rVar2) ? 4 : 2) | i14;
        } else {
            rVar2 = rVar;
            i16 = i14;
        }
        int i25 = i15 & 2;
        if (i25 == 0) {
            if ((i14 & 112) == 0) {
                h2Var2 = h2Var;
                i16 |= o0VarE.B(h2Var2) ? 32 : 16;
            }
            i17 = i15 & 4;
            if (i17 != 0) {
                if ((i14 & 896) == 0) {
                    dVar2 = dVar;
                    if (o0VarE.B(dVar2)) {
                        i18 = 256;
                    } else {
                        i18 = 128;
                    }
                    i16 |= i18;
                }
                if ((i15 & 8) != 0) {
                    i16 |= 3072;
                } else if ((i14 & 7168) == 0) {
                    if (o0VarE.B(this)) {
                        i19 = 2048;
                    } else {
                        i19 = 1024;
                    }
                    i16 |= i19;
                }
                if ((i16 & 5851) == 1170 || !o0VarE.b()) {
                    if (i24 != 0) {
                        rVar3 = r.S;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i25 != 0) {
                        f.a aVar = f.f75994b;
                        h2VarA = l.a(4);
                    } else {
                        h2VarA = h2Var2;
                    }
                    if (i17 != 0) {
                        d.f81522a.getClass();
                        dVar3 = d.a.f81530h;
                    } else {
                        dVar3 = dVar2;
                    }
                    x1 x1Var = n.f135158a;
                    y0.a(c.a(R.drawable.mapbox_logo_icon, o0VarE, 0), "Mapbox Logo", this.boxScope.c(l.x(r.S, h2VarA).then(rVar3), dVar3), null, null, 0.0f, null, o0VarE, 56, 120);
                    dVar4 = dVar3;
                    h2Var3 = h2VarA;
                    rVar4 = rVar3;
                } else {
                    o0VarE.e();
                    rVar4 = rVar2;
                    h2Var3 = h2Var2;
                    dVar4 = dVar2;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 == null) {
                    return;
                }
                p2VarI0.f135219d = new AnonymousClass2(rVar4, h2Var3, dVar4, i14, i15);
            }
            i16 |= 384;
            dVar2 = dVar;
            if ((i15 & 8) != 0) {
                i16 |= 3072;
            } else if ((i14 & 7168) == 0) {
                if (o0VarE.B(this)) {
                    i19 = 2048;
                } else {
                    i19 = 1024;
                }
                i16 |= i19;
            }
            if ((i16 & 5851) == 1170) {
                if (i24 != 0) {
                    rVar3 = r.S;
                } else {
                    rVar3 = rVar2;
                }
                if (i25 != 0) {
                    f.a aVar2 = f.f75994b;
                    h2VarA = l.a(4);
                } else {
                    h2VarA = h2Var2;
                }
                if (i17 != 0) {
                    d.f81522a.getClass();
                    dVar3 = d.a.f81530h;
                } else {
                    dVar3 = dVar2;
                }
                x1 x1Var2 = n.f135158a;
                y0.a(c.a(R.drawable.mapbox_logo_icon, o0VarE, 0), "Mapbox Logo", this.boxScope.c(l.x(r.S, h2VarA).then(rVar3), dVar3), null, null, 0.0f, null, o0VarE, 56, 120);
                dVar4 = dVar3;
                h2Var3 = h2VarA;
                rVar4 = rVar3;
            } else {
                if (i24 != 0) {
                    rVar3 = r.S;
                } else {
                    rVar3 = rVar2;
                }
                if (i25 != 0) {
                    f.a aVar3 = f.f75994b;
                    h2VarA = l.a(4);
                } else {
                    h2VarA = h2Var2;
                }
                if (i17 != 0) {
                    d.f81522a.getClass();
                    dVar3 = d.a.f81530h;
                } else {
                    dVar3 = dVar2;
                }
                x1 x1Var3 = n.f135158a;
                y0.a(c.a(R.drawable.mapbox_logo_icon, o0VarE, 0), "Mapbox Logo", this.boxScope.c(l.x(r.S, h2VarA).then(rVar3), dVar3), null, null, 0.0f, null, o0VarE, 56, 120);
                dVar4 = dVar3;
                h2Var3 = h2VarA;
                rVar4 = rVar3;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 == null) {
                return;
            }
            p2VarI0.f135219d = new AnonymousClass2(rVar4, h2Var3, dVar4, i14, i15);
        }
        i16 |= 48;
        h2Var2 = h2Var;
        i17 = i15 & 4;
        if (i17 != 0) {
            if ((i14 & 896) == 0) {
                dVar2 = dVar;
                if (o0VarE.B(dVar2)) {
                    i18 = 256;
                } else {
                    i18 = 128;
                }
                i16 |= i18;
            }
            if ((i15 & 8) != 0) {
                i16 |= 3072;
            } else if ((i14 & 7168) == 0) {
                if (o0VarE.B(this)) {
                    i19 = 2048;
                } else {
                    i19 = 1024;
                }
                i16 |= i19;
            }
            if ((i16 & 5851) == 1170) {
                if (i24 != 0) {
                    rVar3 = r.S;
                } else {
                    rVar3 = rVar2;
                }
                if (i25 != 0) {
                    f.a aVar4 = f.f75994b;
                    h2VarA = l.a(4);
                } else {
                    h2VarA = h2Var2;
                }
                if (i17 != 0) {
                    d.f81522a.getClass();
                    dVar3 = d.a.f81530h;
                } else {
                    dVar3 = dVar2;
                }
                x1 x1Var4 = n.f135158a;
                y0.a(c.a(R.drawable.mapbox_logo_icon, o0VarE, 0), "Mapbox Logo", this.boxScope.c(l.x(r.S, h2VarA).then(rVar3), dVar3), null, null, 0.0f, null, o0VarE, 56, 120);
                dVar4 = dVar3;
                h2Var3 = h2VarA;
                rVar4 = rVar3;
            } else {
                if (i24 != 0) {
                    rVar3 = r.S;
                } else {
                    rVar3 = rVar2;
                }
                if (i25 != 0) {
                    f.a aVar5 = f.f75994b;
                    h2VarA = l.a(4);
                } else {
                    h2VarA = h2Var2;
                }
                if (i17 != 0) {
                    d.f81522a.getClass();
                    dVar3 = d.a.f81530h;
                } else {
                    dVar3 = dVar2;
                }
                x1 x1Var5 = n.f135158a;
                y0.a(c.a(R.drawable.mapbox_logo_icon, o0VarE, 0), "Mapbox Logo", this.boxScope.c(l.x(r.S, h2VarA).then(rVar3), dVar3), null, null, 0.0f, null, o0VarE, 56, 120);
                dVar4 = dVar3;
                h2Var3 = h2VarA;
                rVar4 = rVar3;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 == null) {
                return;
            }
            p2VarI0.f135219d = new AnonymousClass2(rVar4, h2Var3, dVar4, i14, i15);
        }
        i16 |= 384;
        dVar2 = dVar;
        if ((i15 & 8) != 0) {
            i16 |= 3072;
        } else if ((i14 & 7168) == 0) {
            if (o0VarE.B(this)) {
                i19 = 2048;
            } else {
                i19 = 1024;
            }
            i16 |= i19;
        }
        if ((i16 & 5851) == 1170) {
            if (i24 != 0) {
                rVar3 = r.S;
            } else {
                rVar3 = rVar2;
            }
            if (i25 != 0) {
                f.a aVar6 = f.f75994b;
                h2VarA = l.a(4);
            } else {
                h2VarA = h2Var2;
            }
            if (i17 != 0) {
                d.f81522a.getClass();
                dVar3 = d.a.f81530h;
            } else {
                dVar3 = dVar2;
            }
            x1 x1Var6 = n.f135158a;
            y0.a(c.a(R.drawable.mapbox_logo_icon, o0VarE, 0), "Mapbox Logo", this.boxScope.c(l.x(r.S, h2VarA).then(rVar3), dVar3), null, null, 0.0f, null, o0VarE, 56, 120);
            dVar4 = dVar3;
            h2Var3 = h2VarA;
            rVar4 = rVar3;
        } else {
            if (i24 != 0) {
                rVar3 = r.S;
            } else {
                rVar3 = rVar2;
            }
            if (i25 != 0) {
                f.a aVar7 = f.f75994b;
                h2VarA = l.a(4);
            } else {
                h2VarA = h2Var2;
            }
            if (i17 != 0) {
                d.f81522a.getClass();
                dVar3 = d.a.f81530h;
            } else {
                dVar3 = dVar2;
            }
            x1 x1Var7 = n.f135158a;
            y0.a(c.a(R.drawable.mapbox_logo_icon, o0VarE, 0), "Mapbox Logo", this.boxScope.c(l.x(r.S, h2VarA).then(rVar3), dVar3), null, null, 0.0f, null, o0VarE, 56, 120);
            dVar4 = dVar3;
            h2Var3 = h2VarA;
            rVar4 = rVar3;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new AnonymousClass2(rVar4, h2Var3, dVar4, i14, i15);
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.ornaments.logo.MapLogoScope$Logo$2, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass2 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ d $alignment;
        final /* synthetic */ h2 $contentPadding;
        final /* synthetic */ r $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(r rVar, h2 h2Var, d dVar, int i14, int i15) {
            super(2);
            this.$modifier = rVar;
            this.$contentPadding = h2Var;
            this.$alignment = dVar;
            this.$$changed = i14;
            this.$$default = i15;
        }

        public final void invoke(m mVar, int i14) {
            MapLogoScope.this.Logo(this.$modifier, this.$contentPadding, this.$alignment, mVar, this.$$changed | 1, this.$$default);
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }
    }
}
