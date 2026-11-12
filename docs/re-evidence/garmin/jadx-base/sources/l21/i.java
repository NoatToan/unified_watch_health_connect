package l21;

import am.j1;
import b11.u;
import c2.n0;
import c2.n3;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import i3.fe;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l72.d3;
import m21.w;
import o53.b0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.x0;
import p006l2.w2;
import p13.y;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.x1;
import p3.x3;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
public final class i {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.search.screen.FoodSearchScreenKt$FoodSearchScreen$11$1", f = "FoodSearchScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f109104a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f109105b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e23.a<Unit> aVar, p1<Boolean> p1Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f109104a = aVar;
            this.f109105b = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f109104a, this.f109105b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            if (this.f109105b.getF182175a().booleanValue()) {
                this.f109104a.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.search.screen.FoodSearchScreenKt$FoodSearchScreen$14$1$1$1$1", f = "FoodSearchScreen.kt", l = {251}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f109106a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a2.j f109107b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f109108c;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ p1<Boolean> f109109a;

            public a(p1<Boolean> p1Var) {
                this.f109109a = p1Var;
            }

            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                a2.h hVar = (a2.h) obj;
                boolean z14 = hVar instanceof a2.b;
                p1<Boolean> p1Var = this.f109109a;
                if (z14) {
                    p1Var.setValue(Boolean.TRUE);
                } else if (hVar instanceof a2.c) {
                    p1Var.setValue(Boolean.FALSE);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a2.j jVar, p1<Boolean> p1Var, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f109107b = jVar;
            this.f109108c = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f109107b, this.f109108c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f109106a;
            if (i14 == 0) {
                o13.r.b(obj);
                r53.i<a2.h> iVarC = this.f109107b.c();
                a aVar2 = new a(this.f109108c);
                this.f109106a = 1;
                if (iVarC.collect(aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.search.screen.FoodSearchScreenKt$FoodSearchScreen$14$1$4$1$1", f = "FoodSearchScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f109110a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m21.g f109111b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x3<m21.e> f109112c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i14, m21.g gVar, x3<m21.e> x3Var, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f109110a = i14;
            this.f109111b = gVar;
            this.f109112c = x3Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f109110a, this.f109111b, this.f109112c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x00be  */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            k21.a aVar;
            w wVar;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            x3<m21.e> x3Var = this.f109112c;
            k21.a aVar3 = x3Var.getF182175a().f116092i.get(this.f109110a);
            if (aVar3 != x3Var.getF182175a().f116093j) {
                m21.g gVar = this.f109111b;
                gVar.getClass();
                aVar3.getClass();
                p2 p2Var = gVar.f116124q;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, m21.e.a((m21.e) value, null, false, false, null, null, false, aVar3, null, false, false, null, null, false, null, null, null, 1048063)));
                if (((m21.e) p2Var.getValue()).f116084a.length() <= 0 || aVar3 != (aVar = k21.a.ALL)) {
                    gVar.S4(aVar3);
                } else {
                    Map map = (Map) gVar.f116123p.get(aVar);
                    if (p005kotlin.jvm.internal.s.g((map == null || (wVar = (w) map.get(Boolean.TRUE)) == null) ? null : wVar.f116197a, ((m21.e) p2Var.getValue()).f116084a) || p005kotlin.jvm.internal.s.g(((m21.e) p2Var.getValue()).f116084a, gVar.f116121n)) {
                        gVar.S4(aVar3);
                    } else {
                        gVar.G4(((m21.e) p2Var.getValue()).f116084a);
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.search.screen.FoodSearchScreenKt$FoodSearchScreen$9$1", f = "FoodSearchScreen.kt", l = {99}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f109113a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f109114b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ fe f109115c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ m21.g f109116d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, fe feVar, m21.g gVar, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f109114b = str;
            this.f109115c = feVar;
            this.f109116d = gVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new d(this.f109114b, this.f109115c, this.f109116d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f109113a;
            if (i14 == 0) {
                o13.r.b(obj);
                String str = this.f109114b;
                if (str != null) {
                    this.f109113a = 1;
                    if (d3.c(this.f109115c, str, null, this) == aVar) {
                        return aVar;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            this.f109116d.C4();
            return Unit.INSTANCE;
        }
    }

    public static final /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f109117a;

        static {
            int[] iArr = new int[k21.a.values().length];
            try {
                iArr[k21.a.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k21.a.FAVORITES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[k21.a.MY_FOODS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[k21.a.MY_MEALS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[k21.a.MY_RECIPES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f109117a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0135  */
    /* JADX WARN: Code duplicated, block: B:102:0x013c  */
    /* JADX WARN: Code duplicated, block: B:104:0x0146  */
    /* JADX WARN: Code duplicated, block: B:105:0x0149  */
    /* JADX WARN: Code duplicated, block: B:109:0x0153  */
    /* JADX WARN: Code duplicated, block: B:111:0x0159  */
    /* JADX WARN: Code duplicated, block: B:112:0x015c  */
    /* JADX WARN: Code duplicated, block: B:116:0x0166  */
    /* JADX WARN: Code duplicated, block: B:117:0x016d  */
    /* JADX WARN: Code duplicated, block: B:119:0x0177  */
    /* JADX WARN: Code duplicated, block: B:120:0x017a  */
    /* JADX WARN: Code duplicated, block: B:124:0x0182  */
    /* JADX WARN: Code duplicated, block: B:126:0x0188  */
    /* JADX WARN: Code duplicated, block: B:130:0x019c  */
    /* JADX WARN: Code duplicated, block: B:134:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:137:0x01af  */
    /* JADX WARN: Code duplicated, block: B:139:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:146:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:148:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:149:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:151:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:153:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:155:0x0209  */
    /* JADX WARN: Code duplicated, block: B:157:0x020d  */
    /* JADX WARN: Code duplicated, block: B:159:0x0218  */
    /* JADX WARN: Code duplicated, block: B:161:0x0225  */
    /* JADX WARN: Code duplicated, block: B:163:0x0228  */
    /* JADX WARN: Code duplicated, block: B:165:0x0233  */
    /* JADX WARN: Code duplicated, block: B:167:0x023f  */
    /* JADX WARN: Code duplicated, block: B:169:0x0242  */
    /* JADX WARN: Code duplicated, block: B:171:0x024d  */
    /* JADX WARN: Code duplicated, block: B:173:0x025a  */
    /* JADX WARN: Code duplicated, block: B:175:0x025e  */
    /* JADX WARN: Code duplicated, block: B:177:0x0269  */
    /* JADX WARN: Code duplicated, block: B:179:0x0276  */
    /* JADX WARN: Code duplicated, block: B:181:0x027a  */
    /* JADX WARN: Code duplicated, block: B:183:0x0287  */
    /* JADX WARN: Code duplicated, block: B:185:0x0295  */
    /* JADX WARN: Code duplicated, block: B:187:0x029b  */
    /* JADX WARN: Code duplicated, block: B:189:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:190:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:192:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:194:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:196:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:199:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:202:0x0305  */
    /* JADX WARN: Code duplicated, block: B:203:0x0316  */
    /* JADX WARN: Code duplicated, block: B:205:0x0326  */
    /* JADX WARN: Code duplicated, block: B:208:0x034b A[LOOP:0: B:206:0x0345->B:208:0x034b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:210:0x0374  */
    /* JADX WARN: Code duplicated, block: B:214:0x039d  */
    /* JADX WARN: Code duplicated, block: B:215:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:218:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:220:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:223:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:226:0x03de  */
    /* JADX WARN: Code duplicated, block: B:229:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:233:0x041b  */
    /* JADX WARN: Code duplicated, block: B:236:0x0423 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:237:0x0425  */
    /* JADX WARN: Code duplicated, block: B:239:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:242:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:245:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x0099  */
    /* JADX WARN: Code duplicated, block: B:50:0x009e  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:54:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:60:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:70:0x00da  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:81:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:83:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:85:0x0108  */
    /* JADX WARN: Code duplicated, block: B:86:0x010b  */
    /* JADX WARN: Code duplicated, block: B:90:0x0115  */
    /* JADX WARN: Code duplicated, block: B:92:0x011c  */
    /* JADX WARN: Code duplicated, block: B:94:0x0120  */
    /* JADX WARN: Code duplicated, block: B:96:0x012a  */
    /* JADX WARN: Code duplicated, block: B:97:0x012d  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final m21.g gVar, v21.e eVar, final fe feVar, final e23.p<? super b11.a, ? super Boolean, Unit> pVar, e23.l<? super b11.a, Unit> lVar, e23.a<Unit> aVar, e23.l<? super b11.a, Unit> lVar2, e23.l<? super f01.j, Unit> lVar3, e23.a<Unit> aVar2, e23.a<Unit> aVar3, e23.a<Unit> aVar4, final e23.a<Unit> aVar5, e23.a<Unit> aVar6, final e23.a<Unit> aVar7, p3.m mVar, final int i14, final int i15, final int i16) {
        int i17;
        int i18;
        e23.a<Unit> aVar8;
        int i19;
        int i24;
        e23.l<? super b11.a, Unit> lVar4;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i44;
        int i45;
        int i46;
        int i47;
        boolean z14;
        final v21.e eVar2;
        final e23.l<? super f01.j, Unit> lVar5;
        final e23.a<Unit> aVar9;
        final e23.a<Unit> aVar10;
        final e23.a<Unit> aVar11;
        final e23.a<Unit> aVar12;
        o0 o0Var;
        final e23.l<? super b11.a, Unit> lVar6;
        final e23.a<Unit> aVar13;
        final e23.l<? super b11.a, Unit> lVar7;
        p3.p2 p2VarI0;
        int i48;
        p3.m.a aVar14;
        v21.e eVar3;
        e23.l<? super b11.a, Unit> lVar8;
        e23.a<Unit> aVar15;
        e23.l<? super b11.a, Unit> lVar9;
        e23.l<? super f01.j, Unit> lVar10;
        e23.a<Unit> aVar16;
        e23.a<Unit> aVar17;
        e23.a<Unit> aVar18;
        e23.a<Unit> aVar19;
        e23.l<? super b11.a, Unit> lVar11;
        e23.l<? super f01.j, Unit> lVar12;
        e23.a<Unit> aVar20;
        e23.a<Unit> aVar21;
        e23.l<? super b11.a, Unit> lVar13;
        int i49;
        v21.e eVar4;
        Object objQ;
        Object objQ2;
        Object objQ3;
        Object objQ4;
        Object objQ5;
        Object objQ6;
        Object objQ7;
        Object objQ8;
        m21.d dVar;
        u uVar;
        List<u> list;
        boolean z15;
        String strA;
        ArrayList arrayList;
        Iterator<T> it;
        boolean z16;
        boolean zR;
        Object objQ9;
        Object objQ10;
        p3.m.a.C2565a c2565a;
        p1 p1Var;
        Object objQ11;
        p1 p1Var2;
        Object objQ12;
        boolean z17;
        Object objQ13;
        int i54;
        gVar.getClass();
        feVar.getClass();
        pVar.getClass();
        aVar5.getClass();
        aVar7.getClass();
        o0 o0VarE = mVar.E(-1764016693);
        if ((i14 & 6) == 0) {
            i17 = (o0VarE.r(gVar) ? 4 : 2) | i14;
        } else {
            i17 = i14;
        }
        if ((i14 & 48) == 0) {
            i17 |= ((i16 & 2) == 0 && o0VarE.r(eVar)) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i17 |= o0VarE.B(feVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i17 |= o0VarE.r(pVar) ? 2048 : 1024;
        }
        int i55 = i16 & 16;
        if (i55 == 0) {
            if ((i14 & 24576) == 0) {
                i17 |= o0VarE.r(lVar) ? 16384 : 8192;
            }
            i18 = i16 & 32;
            if (i18 != 0) {
                i17 |= 196608;
                aVar8 = aVar;
            } else {
                aVar8 = aVar;
                if ((i14 & 196608) == 0) {
                    if (o0VarE.r(aVar8)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i17 |= i19;
                }
            }
            i24 = i16 & 64;
            if (i24 != 0) {
                i17 |= 1572864;
                lVar4 = lVar2;
            } else {
                lVar4 = lVar2;
                if ((i14 & 1572864) == 0) {
                    if (o0VarE.r(lVar4)) {
                        i25 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i25 = 524288;
                    }
                    i17 |= i25;
                }
            }
            i26 = i16 & 128;
            if (i26 != 0) {
                i17 |= 12582912;
            } else if ((i14 & 12582912) == 0) {
                if (o0VarE.r(lVar3)) {
                    i27 = 8388608;
                } else {
                    i27 = 4194304;
                }
                i17 |= i27;
            }
            i28 = i16 & 256;
            if (i28 != 0) {
                if ((i14 & 100663296) == 0) {
                    int i56 = i17;
                    if (o0VarE.r(aVar2)) {
                        i29 = 67108864;
                    } else {
                        i29 = 33554432;
                    }
                    i30 = i56 | i29;
                }
                i34 = i16 & 512;
                if (i34 != 0) {
                    if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                        if (o0VarE.r(aVar3)) {
                            i35 = 536870912;
                        } else {
                            i35 = 268435456;
                        }
                        i30 |= i35;
                    }
                    i36 = i16 & 1024;
                    if (i36 != 0) {
                        i38 = i15 | 6;
                    } else {
                        if (o0VarE.r(aVar4)) {
                            i37 = 4;
                        } else {
                            i37 = 2;
                        }
                        i38 = i15 | i37;
                    }
                    if ((i15 & 48) == 0) {
                        if (o0VarE.r(aVar5)) {
                            i54 = 32;
                        } else {
                            i54 = 16;
                        }
                        i38 |= i54;
                    }
                    i39 = i38;
                    i44 = i16 & 4096;
                    if (i44 != 0) {
                        i46 = i39 | 384;
                    } else {
                        if (o0VarE.r(aVar6)) {
                            i45 = 256;
                        } else {
                            i45 = 128;
                        }
                        i46 = i39 | i45;
                    }
                    if ((i15 & 3072) == 0) {
                        i46 |= o0VarE.r(aVar7) ? 2048 : 1024;
                    }
                    i47 = i46;
                    if ((i30 & 306783379) == 306783378 || (i47 & 1171) != 1170) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (o0VarE.n(i30 & 1, z14)) {
                        o0VarE.G0();
                        i48 = i14 & 1;
                        aVar14 = p3.m.f135153a;
                        if (i48 != 0 || o0VarE.o0()) {
                            if ((i16 & 2) != 0) {
                                eVar3 = (v21.e) KoinJavaComponent.get$default(v21.e.class, null, null, 6, null);
                                i30 &= -113;
                            } else {
                                eVar3 = eVar;
                            }
                            if (i55 != 0) {
                                objQ8 = o0VarE.q();
                                aVar14.getClass();
                                if (objQ8 == p3.m.a.f135155b) {
                                    objQ8 = new w2(6);
                                    o0VarE.K(objQ8);
                                }
                                lVar8 = (e23.l) objQ8;
                            } else {
                                lVar8 = lVar;
                            }
                            if (i18 != 0) {
                                objQ7 = o0VarE.q();
                                aVar14.getClass();
                                if (objQ7 == p3.m.a.f135155b) {
                                    objQ7 = new l01.b(20);
                                    o0VarE.K(objQ7);
                                }
                                aVar15 = (e23.a) objQ7;
                            } else {
                                aVar15 = aVar8;
                            }
                            if (i24 != 0) {
                                objQ6 = o0VarE.q();
                                aVar14.getClass();
                                if (objQ6 == p3.m.a.f135155b) {
                                    objQ6 = new w2(7);
                                    o0VarE.K(objQ6);
                                }
                                lVar9 = (e23.l) objQ6;
                            } else {
                                lVar9 = lVar4;
                            }
                            if (i26 != 0) {
                                objQ5 = o0VarE.q();
                                aVar14.getClass();
                                if (objQ5 == p3.m.a.f135155b) {
                                    objQ5 = new w2(8);
                                    o0VarE.K(objQ5);
                                }
                                lVar10 = (e23.l) objQ5;
                            } else {
                                lVar10 = lVar3;
                            }
                            if (i28 != 0) {
                                objQ4 = o0VarE.q();
                                aVar14.getClass();
                                if (objQ4 == p3.m.a.f135155b) {
                                    objQ4 = new l01.b(21);
                                    o0VarE.K(objQ4);
                                }
                                aVar16 = (e23.a) objQ4;
                            } else {
                                aVar16 = aVar2;
                            }
                            if (i34 != 0) {
                                objQ3 = o0VarE.q();
                                aVar14.getClass();
                                if (objQ3 == p3.m.a.f135155b) {
                                    objQ3 = new l01.b(22);
                                    o0VarE.K(objQ3);
                                }
                                aVar17 = (e23.a) objQ3;
                            } else {
                                aVar17 = aVar3;
                            }
                            if (i36 != 0) {
                                objQ2 = o0VarE.q();
                                aVar14.getClass();
                                if (objQ2 == p3.m.a.f135155b) {
                                    objQ2 = new l01.b(23);
                                    o0VarE.K(objQ2);
                                }
                                aVar18 = (e23.a) objQ2;
                            } else {
                                aVar18 = aVar4;
                            }
                            if (i44 != 0) {
                                objQ = o0VarE.q();
                                aVar14.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = new l01.b(19);
                                    o0VarE.K(objQ);
                                }
                                aVar19 = (e23.a) objQ;
                            } else {
                                aVar19 = aVar6;
                            }
                            lVar11 = lVar9;
                            lVar12 = lVar10;
                            aVar20 = aVar16;
                            aVar21 = aVar18;
                            lVar13 = lVar8;
                            i49 = i30;
                            eVar4 = eVar3;
                        } else {
                            o0VarE.e();
                            if ((i16 & 2) != 0) {
                                i30 &= -113;
                            }
                            eVar4 = eVar;
                            lVar13 = lVar;
                            lVar12 = lVar3;
                            aVar17 = aVar3;
                            aVar19 = aVar6;
                            aVar15 = aVar8;
                            lVar11 = lVar4;
                            i49 = i30;
                            aVar20 = aVar2;
                            aVar21 = aVar4;
                        }
                        o0VarE.h0();
                        x1 x1Var = p3.n.f135158a;
                        p1 p1VarC = s9.c.c(gVar.f116126t, o0VarE);
                        dVar = ((m21.e) p1VarC.getF182175a()).f116089f;
                        if (dVar == null) {
                            o0VarE.C(1399357418);
                            o0VarE.g0(false);
                            aVar15 = aVar15;
                            aVar20 = aVar20;
                            strA = null;
                        } else {
                            o0VarE.C(1292066551);
                            uVar = dVar.f116082a;
                            list = dVar.f116083b;
                            if (list.isEmpty()) {
                                z15 = false;
                                o0VarE.C(598779980);
                                strA = uVar.a(o0VarE);
                                o0VarE.g0(false);
                            } else {
                                o0VarE.C(598671852);
                                x0 x0Var = x0.f105818a;
                                String strA2 = uVar.a(o0VarE);
                                arrayList = new ArrayList(y.r(list, 10));
                                it = list.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(((u) it.next()).a(o0VarE));
                                }
                                z15 = false;
                                String[] strArr = (String[]) arrayList.toArray(new String[0]);
                                Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
                                strA = String.format(strA2, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                                o0VarE.g0(false);
                            }
                            x1 x1Var2 = p3.n.f135158a;
                            o0VarE.g0(z15);
                        }
                        m21.d dVar2 = ((m21.e) p1VarC.getF182175a()).f116089f;
                        boolean zB = o0VarE.B(strA);
                        if ((i49 & 896) == 256) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        zR = z16 | zB | o0VarE.r(gVar);
                        objQ9 = o0VarE.q();
                        if (zR) {
                            objQ9 = new d(strA, feVar, gVar, null);
                            o0VarE.K(objQ9);
                        } else {
                            aVar14.getClass();
                            if (objQ9 == p3.m.a.f135155b) {
                                objQ9 = new d(strA, feVar, gVar, null);
                                o0VarE.K(objQ9);
                            }
                        }
                        l0.e((e23.p) objQ9, dVar2, o0VarE);
                        objQ10 = o0VarE.q();
                        aVar14.getClass();
                        c2565a = p3.m.a.f135155b;
                        if (objQ10 == c2565a) {
                            objQ10 = p0.n(Boolean.TRUE);
                            o0VarE.K(objQ10);
                        }
                        p1Var = (p1) objQ10;
                        objQ11 = o0VarE.q();
                        if (objQ11 == c2565a) {
                            objQ11 = p0.n(Boolean.FALSE);
                            o0VarE.K(objQ11);
                        }
                        p1Var2 = (p1) objQ11;
                        boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
                        objQ12 = o0VarE.q();
                        if (objQ12 == c2565a) {
                            objQ12 = new j1(p1Var, p1Var2, 15);
                            o0VarE.K(objQ12);
                        }
                        c.w.a(48, 0, (e23.a) objQ12, o0VarE, zBooleanValue);
                        Boolean bool = (Boolean) p1Var2.getF182175a();
                        bool.getClass();
                        z17 = (i47 & 7168) == 2048;
                        objQ13 = o0VarE.q();
                        if (z17 || objQ13 == c2565a) {
                            objQ13 = new a(aVar7, p1Var2, null);
                            o0VarE.K(objQ13);
                        }
                        l0.e((e23.p) objQ13, bool, o0VarE);
                        boolean z18 = ((m21.e) p1VarC.getF182175a()).f116086c;
                        n0 n0Var = n3.f22788a;
                        n0 n0Var2 = new n0(0, 0, 0, 0);
                        e23.a<Unit> aVar22 = aVar15;
                        e23.a<Unit> aVar23 = aVar20;
                        e23.l<? super b11.a, Unit> lVar14 = lVar11;
                        z3.e eVarC = z3.f.c(1306855696, new dd1.d(gVar, aVar7, aVar5, aVar22, aVar23, aVar21, aVar17, p1VarC, 12), o0VarE);
                        z3.e eVarC2 = z3.f.c(1409332689, new ak0.o(feVar, 23), o0VarE);
                        e23.a<Unit> aVar24 = aVar17;
                        v21.e eVar5 = eVar4;
                        e23.l<? super b11.a, Unit> lVar15 = lVar13;
                        e23.l<? super f01.j, Unit> lVar16 = lVar12;
                        e23.a<Unit> aVar25 = aVar21;
                        z02.d.a(z18, eVarC, eVarC2, null, n0Var2, z3.f.c(1716763668, new dj0.j(gVar, p1VarC, aVar19, eVar5, lVar16, pVar, lVar15, aVar5, aVar23, lVar14, aVar24, aVar25), o0VarE), o0VarE, 197040, 8);
                        eVar2 = eVar5;
                        o0Var = o0VarE;
                        lVar6 = lVar14;
                        lVar5 = lVar16;
                        aVar9 = aVar23;
                        aVar13 = aVar22;
                        lVar7 = lVar15;
                        aVar10 = aVar24;
                        aVar11 = aVar25;
                        aVar12 = aVar19;
                    } else {
                        o0VarE.e();
                        eVar2 = eVar;
                        lVar5 = lVar3;
                        aVar9 = aVar2;
                        aVar10 = aVar3;
                        aVar11 = aVar4;
                        aVar12 = aVar6;
                        o0Var = o0VarE;
                        lVar6 = lVar4;
                        aVar13 = aVar8;
                        lVar7 = lVar;
                    }
                    p2VarI0 = o0Var.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new e23.p() { // from class: l21.h
                            @Override // e23.p
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iT = p0.t(i14 | 1);
                                int iT2 = p0.t(i15);
                                i.a(gVar, eVar2, feVar, pVar, lVar7, aVar13, lVar6, lVar5, aVar9, aVar10, aVar11, aVar5, aVar12, aVar7, (p3.m) obj, iT, iT2, i16);
                                return Unit.INSTANCE;
                            }
                        };
                    }
                }
                i30 |= C.ENCODING_PCM_32BIT;
                i36 = i16 & 1024;
                if (i36 != 0) {
                    i38 = i15 | 6;
                } else {
                    if (o0VarE.r(aVar4)) {
                        i37 = 4;
                    } else {
                        i37 = 2;
                    }
                    i38 = i15 | i37;
                }
                if ((i15 & 48) == 0) {
                    if (o0VarE.r(aVar5)) {
                        i54 = 32;
                    } else {
                        i54 = 16;
                    }
                    i38 |= i54;
                }
                i39 = i38;
                i44 = i16 & 4096;
                if (i44 != 0) {
                    i46 = i39 | 384;
                } else {
                    if (o0VarE.r(aVar6)) {
                        i45 = 256;
                    } else {
                        i45 = 128;
                    }
                    i46 = i39 | i45;
                }
                if ((i15 & 3072) == 0) {
                    i46 |= o0VarE.r(aVar7) ? 2048 : 1024;
                }
                i47 = i46;
                if ((i30 & 306783379) == 306783378) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                if (o0VarE.n(i30 & 1, z14)) {
                    o0VarE.G0();
                    i48 = i14 & 1;
                    aVar14 = p3.m.f135153a;
                    if (i48 != 0) {
                        if ((i16 & 2) != 0) {
                            eVar3 = (v21.e) KoinJavaComponent.get$default(v21.e.class, null, null, 6, null);
                            i30 &= -113;
                        } else {
                            eVar3 = eVar;
                        }
                        if (i55 != 0) {
                            objQ8 = o0VarE.q();
                            aVar14.getClass();
                            if (objQ8 == p3.m.a.f135155b) {
                                objQ8 = new w2(6);
                                o0VarE.K(objQ8);
                            }
                            lVar8 = (e23.l) objQ8;
                        } else {
                            lVar8 = lVar;
                        }
                        if (i18 != 0) {
                            objQ7 = o0VarE.q();
                            aVar14.getClass();
                            if (objQ7 == p3.m.a.f135155b) {
                                objQ7 = new l01.b(20);
                                o0VarE.K(objQ7);
                            }
                            aVar15 = (e23.a) objQ7;
                        } else {
                            aVar15 = aVar8;
                        }
                        if (i24 != 0) {
                            objQ6 = o0VarE.q();
                            aVar14.getClass();
                            if (objQ6 == p3.m.a.f135155b) {
                                objQ6 = new w2(7);
                                o0VarE.K(objQ6);
                            }
                            lVar9 = (e23.l) objQ6;
                        } else {
                            lVar9 = lVar4;
                        }
                        if (i26 != 0) {
                            objQ5 = o0VarE.q();
                            aVar14.getClass();
                            if (objQ5 == p3.m.a.f135155b) {
                                objQ5 = new w2(8);
                                o0VarE.K(objQ5);
                            }
                            lVar10 = (e23.l) objQ5;
                        } else {
                            lVar10 = lVar3;
                        }
                        if (i28 != 0) {
                            objQ4 = o0VarE.q();
                            aVar14.getClass();
                            if (objQ4 == p3.m.a.f135155b) {
                                objQ4 = new l01.b(21);
                                o0VarE.K(objQ4);
                            }
                            aVar16 = (e23.a) objQ4;
                        } else {
                            aVar16 = aVar2;
                        }
                        if (i34 != 0) {
                            objQ3 = o0VarE.q();
                            aVar14.getClass();
                            if (objQ3 == p3.m.a.f135155b) {
                                objQ3 = new l01.b(22);
                                o0VarE.K(objQ3);
                            }
                            aVar17 = (e23.a) objQ3;
                        } else {
                            aVar17 = aVar3;
                        }
                        if (i36 != 0) {
                            objQ2 = o0VarE.q();
                            aVar14.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new l01.b(23);
                                o0VarE.K(objQ2);
                            }
                            aVar18 = (e23.a) objQ2;
                        } else {
                            aVar18 = aVar4;
                        }
                        if (i44 != 0) {
                            objQ = o0VarE.q();
                            aVar14.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new l01.b(19);
                                o0VarE.K(objQ);
                            }
                            aVar19 = (e23.a) objQ;
                        } else {
                            aVar19 = aVar6;
                        }
                        lVar11 = lVar9;
                        lVar12 = lVar10;
                        aVar20 = aVar16;
                        aVar21 = aVar18;
                        lVar13 = lVar8;
                        i49 = i30;
                        eVar4 = eVar3;
                    } else {
                        if ((i16 & 2) != 0) {
                            eVar3 = (v21.e) KoinJavaComponent.get$default(v21.e.class, null, null, 6, null);
                            i30 &= -113;
                        } else {
                            eVar3 = eVar;
                        }
                        if (i55 != 0) {
                            objQ8 = o0VarE.q();
                            aVar14.getClass();
                            if (objQ8 == p3.m.a.f135155b) {
                                objQ8 = new w2(6);
                                o0VarE.K(objQ8);
                            }
                            lVar8 = (e23.l) objQ8;
                        } else {
                            lVar8 = lVar;
                        }
                        if (i18 != 0) {
                            objQ7 = o0VarE.q();
                            aVar14.getClass();
                            if (objQ7 == p3.m.a.f135155b) {
                                objQ7 = new l01.b(20);
                                o0VarE.K(objQ7);
                            }
                            aVar15 = (e23.a) objQ7;
                        } else {
                            aVar15 = aVar8;
                        }
                        if (i24 != 0) {
                            objQ6 = o0VarE.q();
                            aVar14.getClass();
                            if (objQ6 == p3.m.a.f135155b) {
                                objQ6 = new w2(7);
                                o0VarE.K(objQ6);
                            }
                            lVar9 = (e23.l) objQ6;
                        } else {
                            lVar9 = lVar4;
                        }
                        if (i26 != 0) {
                            objQ5 = o0VarE.q();
                            aVar14.getClass();
                            if (objQ5 == p3.m.a.f135155b) {
                                objQ5 = new w2(8);
                                o0VarE.K(objQ5);
                            }
                            lVar10 = (e23.l) objQ5;
                        } else {
                            lVar10 = lVar3;
                        }
                        if (i28 != 0) {
                            objQ4 = o0VarE.q();
                            aVar14.getClass();
                            if (objQ4 == p3.m.a.f135155b) {
                                objQ4 = new l01.b(21);
                                o0VarE.K(objQ4);
                            }
                            aVar16 = (e23.a) objQ4;
                        } else {
                            aVar16 = aVar2;
                        }
                        if (i34 != 0) {
                            objQ3 = o0VarE.q();
                            aVar14.getClass();
                            if (objQ3 == p3.m.a.f135155b) {
                                objQ3 = new l01.b(22);
                                o0VarE.K(objQ3);
                            }
                            aVar17 = (e23.a) objQ3;
                        } else {
                            aVar17 = aVar3;
                        }
                        if (i36 != 0) {
                            objQ2 = o0VarE.q();
                            aVar14.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new l01.b(23);
                                o0VarE.K(objQ2);
                            }
                            aVar18 = (e23.a) objQ2;
                        } else {
                            aVar18 = aVar4;
                        }
                        if (i44 != 0) {
                            objQ = o0VarE.q();
                            aVar14.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new l01.b(19);
                                o0VarE.K(objQ);
                            }
                            aVar19 = (e23.a) objQ;
                        } else {
                            aVar19 = aVar6;
                        }
                        lVar11 = lVar9;
                        lVar12 = lVar10;
                        aVar20 = aVar16;
                        aVar21 = aVar18;
                        lVar13 = lVar8;
                        i49 = i30;
                        eVar4 = eVar3;
                    }
                    o0VarE.h0();
                    x1 x1Var3 = p3.n.f135158a;
                    p1 p1VarC2 = s9.c.c(gVar.f116126t, o0VarE);
                    dVar = ((m21.e) p1VarC2.getF182175a()).f116089f;
                    if (dVar == null) {
                        o0VarE.C(1399357418);
                        o0VarE.g0(false);
                        aVar15 = aVar15;
                        aVar20 = aVar20;
                        strA = null;
                    } else {
                        o0VarE.C(1292066551);
                        uVar = dVar.f116082a;
                        list = dVar.f116083b;
                        if (list.isEmpty()) {
                            o0VarE.C(598671852);
                            x0 x0Var2 = x0.f105818a;
                            String strA3 = uVar.a(o0VarE);
                            arrayList = new ArrayList(y.r(list, 10));
                            it = list.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((u) it.next()).a(o0VarE));
                            }
                            z15 = false;
                            String[] strArr2 = (String[]) arrayList.toArray(new String[0]);
                            Object[] objArrCopyOf2 = Arrays.copyOf(strArr2, strArr2.length);
                            strA = String.format(strA3, Arrays.copyOf(objArrCopyOf2, objArrCopyOf2.length));
                            o0VarE.g0(false);
                        } else {
                            z15 = false;
                            o0VarE.C(598779980);
                            strA = uVar.a(o0VarE);
                            o0VarE.g0(false);
                        }
                        x1 x1Var4 = p3.n.f135158a;
                        o0VarE.g0(z15);
                    }
                    m21.d dVar3 = ((m21.e) p1VarC2.getF182175a()).f116089f;
                    boolean zB2 = o0VarE.B(strA);
                    if ((i49 & 896) == 256) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    zR = z16 | zB2 | o0VarE.r(gVar);
                    objQ9 = o0VarE.q();
                    if (zR) {
                        aVar14.getClass();
                        if (objQ9 == p3.m.a.f135155b) {
                            objQ9 = new d(strA, feVar, gVar, null);
                            o0VarE.K(objQ9);
                        }
                    } else {
                        objQ9 = new d(strA, feVar, gVar, null);
                        o0VarE.K(objQ9);
                    }
                    l0.e((e23.p) objQ9, dVar3, o0VarE);
                    objQ10 = o0VarE.q();
                    aVar14.getClass();
                    c2565a = p3.m.a.f135155b;
                    if (objQ10 == c2565a) {
                        objQ10 = p0.n(Boolean.TRUE);
                        o0VarE.K(objQ10);
                    }
                    p1Var = (p1) objQ10;
                    objQ11 = o0VarE.q();
                    if (objQ11 == c2565a) {
                        objQ11 = p0.n(Boolean.FALSE);
                        o0VarE.K(objQ11);
                    }
                    p1Var2 = (p1) objQ11;
                    boolean zBooleanValue2 = ((Boolean) p1Var.getF182175a()).booleanValue();
                    objQ12 = o0VarE.q();
                    if (objQ12 == c2565a) {
                        objQ12 = new j1(p1Var, p1Var2, 15);
                        o0VarE.K(objQ12);
                    }
                    c.w.a(48, 0, (e23.a) objQ12, o0VarE, zBooleanValue2);
                    Boolean bool2 = (Boolean) p1Var2.getF182175a();
                    bool2.getClass();
                    if ((i47 & 7168) == 2048) {
                    }
                    objQ13 = o0VarE.q();
                    if (z17) {
                        objQ13 = new a(aVar7, p1Var2, null);
                        o0VarE.K(objQ13);
                    } else {
                        objQ13 = new a(aVar7, p1Var2, null);
                        o0VarE.K(objQ13);
                    }
                    l0.e((e23.p) objQ13, bool2, o0VarE);
                    boolean z19 = ((m21.e) p1VarC2.getF182175a()).f116086c;
                    n0 n0Var3 = n3.f22788a;
                    n0 n0Var4 = new n0(0, 0, 0, 0);
                    e23.a<Unit> aVar26 = aVar15;
                    e23.a<Unit> aVar27 = aVar20;
                    e23.l<? super b11.a, Unit> lVar17 = lVar11;
                    z3.e eVarC3 = z3.f.c(1306855696, new dd1.d(gVar, aVar7, aVar5, aVar26, aVar27, aVar21, aVar17, p1VarC2, 12), o0VarE);
                    z3.e eVarC4 = z3.f.c(1409332689, new ak0.o(feVar, 23), o0VarE);
                    e23.a<Unit> aVar28 = aVar17;
                    v21.e eVar6 = eVar4;
                    e23.l<? super b11.a, Unit> lVar18 = lVar13;
                    e23.l<? super f01.j, Unit> lVar19 = lVar12;
                    e23.a<Unit> aVar29 = aVar21;
                    z02.d.a(z19, eVarC3, eVarC4, null, n0Var4, z3.f.c(1716763668, new dj0.j(gVar, p1VarC2, aVar19, eVar6, lVar19, pVar, lVar18, aVar5, aVar27, lVar17, aVar28, aVar29), o0VarE), o0VarE, 197040, 8);
                    eVar2 = eVar6;
                    o0Var = o0VarE;
                    lVar6 = lVar17;
                    lVar5 = lVar19;
                    aVar9 = aVar27;
                    aVar13 = aVar26;
                    lVar7 = lVar18;
                    aVar10 = aVar28;
                    aVar11 = aVar29;
                    aVar12 = aVar19;
                } else {
                    o0VarE.e();
                    eVar2 = eVar;
                    lVar5 = lVar3;
                    aVar9 = aVar2;
                    aVar10 = aVar3;
                    aVar11 = aVar4;
                    aVar12 = aVar6;
                    o0Var = o0VarE;
                    lVar6 = lVar4;
                    aVar13 = aVar8;
                    lVar7 = lVar;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e23.p() { // from class: l21.h
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iT = p0.t(i14 | 1);
                            int iT2 = p0.t(i15);
                            i.a(gVar, eVar2, feVar, pVar, lVar7, aVar13, lVar6, lVar5, aVar9, aVar10, aVar11, aVar5, aVar12, aVar7, (p3.m) obj, iT, iT2, i16);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i17 |= 100663296;
            i30 = i17;
            i34 = i16 & 512;
            if (i34 != 0) {
                if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                    if (o0VarE.r(aVar3)) {
                        i35 = 536870912;
                    } else {
                        i35 = 268435456;
                    }
                    i30 |= i35;
                }
                i36 = i16 & 1024;
                if (i36 != 0) {
                    i38 = i15 | 6;
                } else {
                    if (o0VarE.r(aVar4)) {
                        i37 = 4;
                    } else {
                        i37 = 2;
                    }
                    i38 = i15 | i37;
                }
                if ((i15 & 48) == 0) {
                    if (o0VarE.r(aVar5)) {
                        i54 = 32;
                    } else {
                        i54 = 16;
                    }
                    i38 |= i54;
                }
                i39 = i38;
                i44 = i16 & 4096;
                if (i44 != 0) {
                    i46 = i39 | 384;
                } else {
                    if (o0VarE.r(aVar6)) {
                        i45 = 256;
                    } else {
                        i45 = 128;
                    }
                    i46 = i39 | i45;
                }
                if ((i15 & 3072) == 0) {
                    i46 |= o0VarE.r(aVar7) ? 2048 : 1024;
                }
                i47 = i46;
                if ((i30 & 306783379) == 306783378) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                if (o0VarE.n(i30 & 1, z14)) {
                    o0VarE.G0();
                    i48 = i14 & 1;
                    aVar14 = p3.m.f135153a;
                    if (i48 != 0) {
                        if ((i16 & 2) != 0) {
                            eVar3 = (v21.e) KoinJavaComponent.get$default(v21.e.class, null, null, 6, null);
                            i30 &= -113;
                        } else {
                            eVar3 = eVar;
                        }
                        if (i55 != 0) {
                            objQ8 = o0VarE.q();
                            aVar14.getClass();
                            if (objQ8 == p3.m.a.f135155b) {
                                objQ8 = new w2(6);
                                o0VarE.K(objQ8);
                            }
                            lVar8 = (e23.l) objQ8;
                        } else {
                            lVar8 = lVar;
                        }
                        if (i18 != 0) {
                            objQ7 = o0VarE.q();
                            aVar14.getClass();
                            if (objQ7 == p3.m.a.f135155b) {
                                objQ7 = new l01.b(20);
                                o0VarE.K(objQ7);
                            }
                            aVar15 = (e23.a) objQ7;
                        } else {
                            aVar15 = aVar8;
                        }
                        if (i24 != 0) {
                            objQ6 = o0VarE.q();
                            aVar14.getClass();
                            if (objQ6 == p3.m.a.f135155b) {
                                objQ6 = new w2(7);
                                o0VarE.K(objQ6);
                            }
                            lVar9 = (e23.l) objQ6;
                        } else {
                            lVar9 = lVar4;
                        }
                        if (i26 != 0) {
                            objQ5 = o0VarE.q();
                            aVar14.getClass();
                            if (objQ5 == p3.m.a.f135155b) {
                                objQ5 = new w2(8);
                                o0VarE.K(objQ5);
                            }
                            lVar10 = (e23.l) objQ5;
                        } else {
                            lVar10 = lVar3;
                        }
                        if (i28 != 0) {
                            objQ4 = o0VarE.q();
                            aVar14.getClass();
                            if (objQ4 == p3.m.a.f135155b) {
                                objQ4 = new l01.b(21);
                                o0VarE.K(objQ4);
                            }
                            aVar16 = (e23.a) objQ4;
                        } else {
                            aVar16 = aVar2;
                        }
                        if (i34 != 0) {
                            objQ3 = o0VarE.q();
                            aVar14.getClass();
                            if (objQ3 == p3.m.a.f135155b) {
                                objQ3 = new l01.b(22);
                                o0VarE.K(objQ3);
                            }
                            aVar17 = (e23.a) objQ3;
                        } else {
                            aVar17 = aVar3;
                        }
                        if (i36 != 0) {
                            objQ2 = o0VarE.q();
                            aVar14.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new l01.b(23);
                                o0VarE.K(objQ2);
                            }
                            aVar18 = (e23.a) objQ2;
                        } else {
                            aVar18 = aVar4;
                        }
                        if (i44 != 0) {
                            objQ = o0VarE.q();
                            aVar14.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new l01.b(19);
                                o0VarE.K(objQ);
                            }
                            aVar19 = (e23.a) objQ;
                        } else {
                            aVar19 = aVar6;
                        }
                        lVar11 = lVar9;
                        lVar12 = lVar10;
                        aVar20 = aVar16;
                        aVar21 = aVar18;
                        lVar13 = lVar8;
                        i49 = i30;
                        eVar4 = eVar3;
                    } else {
                        if ((i16 & 2) != 0) {
                            eVar3 = (v21.e) KoinJavaComponent.get$default(v21.e.class, null, null, 6, null);
                            i30 &= -113;
                        } else {
                            eVar3 = eVar;
                        }
                        if (i55 != 0) {
                            objQ8 = o0VarE.q();
                            aVar14.getClass();
                            if (objQ8 == p3.m.a.f135155b) {
                                objQ8 = new w2(6);
                                o0VarE.K(objQ8);
                            }
                            lVar8 = (e23.l) objQ8;
                        } else {
                            lVar8 = lVar;
                        }
                        if (i18 != 0) {
                            objQ7 = o0VarE.q();
                            aVar14.getClass();
                            if (objQ7 == p3.m.a.f135155b) {
                                objQ7 = new l01.b(20);
                                o0VarE.K(objQ7);
                            }
                            aVar15 = (e23.a) objQ7;
                        } else {
                            aVar15 = aVar8;
                        }
                        if (i24 != 0) {
                            objQ6 = o0VarE.q();
                            aVar14.getClass();
                            if (objQ6 == p3.m.a.f135155b) {
                                objQ6 = new w2(7);
                                o0VarE.K(objQ6);
                            }
                            lVar9 = (e23.l) objQ6;
                        } else {
                            lVar9 = lVar4;
                        }
                        if (i26 != 0) {
                            objQ5 = o0VarE.q();
                            aVar14.getClass();
                            if (objQ5 == p3.m.a.f135155b) {
                                objQ5 = new w2(8);
                                o0VarE.K(objQ5);
                            }
                            lVar10 = (e23.l) objQ5;
                        } else {
                            lVar10 = lVar3;
                        }
                        if (i28 != 0) {
                            objQ4 = o0VarE.q();
                            aVar14.getClass();
                            if (objQ4 == p3.m.a.f135155b) {
                                objQ4 = new l01.b(21);
                                o0VarE.K(objQ4);
                            }
                            aVar16 = (e23.a) objQ4;
                        } else {
                            aVar16 = aVar2;
                        }
                        if (i34 != 0) {
                            objQ3 = o0VarE.q();
                            aVar14.getClass();
                            if (objQ3 == p3.m.a.f135155b) {
                                objQ3 = new l01.b(22);
                                o0VarE.K(objQ3);
                            }
                            aVar17 = (e23.a) objQ3;
                        } else {
                            aVar17 = aVar3;
                        }
                        if (i36 != 0) {
                            objQ2 = o0VarE.q();
                            aVar14.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new l01.b(23);
                                o0VarE.K(objQ2);
                            }
                            aVar18 = (e23.a) objQ2;
                        } else {
                            aVar18 = aVar4;
                        }
                        if (i44 != 0) {
                            objQ = o0VarE.q();
                            aVar14.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new l01.b(19);
                                o0VarE.K(objQ);
                            }
                            aVar19 = (e23.a) objQ;
                        } else {
                            aVar19 = aVar6;
                        }
                        lVar11 = lVar9;
                        lVar12 = lVar10;
                        aVar20 = aVar16;
                        aVar21 = aVar18;
                        lVar13 = lVar8;
                        i49 = i30;
                        eVar4 = eVar3;
                    }
                    o0VarE.h0();
                    x1 x1Var5 = p3.n.f135158a;
                    p1 p1VarC3 = s9.c.c(gVar.f116126t, o0VarE);
                    dVar = ((m21.e) p1VarC3.getF182175a()).f116089f;
                    if (dVar == null) {
                        o0VarE.C(1399357418);
                        o0VarE.g0(false);
                        aVar15 = aVar15;
                        aVar20 = aVar20;
                        strA = null;
                    } else {
                        o0VarE.C(1292066551);
                        uVar = dVar.f116082a;
                        list = dVar.f116083b;
                        if (list.isEmpty()) {
                            o0VarE.C(598671852);
                            x0 x0Var3 = x0.f105818a;
                            String strA4 = uVar.a(o0VarE);
                            arrayList = new ArrayList(y.r(list, 10));
                            it = list.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((u) it.next()).a(o0VarE));
                            }
                            z15 = false;
                            String[] strArr3 = (String[]) arrayList.toArray(new String[0]);
                            Object[] objArrCopyOf3 = Arrays.copyOf(strArr3, strArr3.length);
                            strA = String.format(strA4, Arrays.copyOf(objArrCopyOf3, objArrCopyOf3.length));
                            o0VarE.g0(false);
                        } else {
                            z15 = false;
                            o0VarE.C(598779980);
                            strA = uVar.a(o0VarE);
                            o0VarE.g0(false);
                        }
                        x1 x1Var6 = p3.n.f135158a;
                        o0VarE.g0(z15);
                    }
                    m21.d dVar4 = ((m21.e) p1VarC3.getF182175a()).f116089f;
                    boolean zB3 = o0VarE.B(strA);
                    if ((i49 & 896) == 256) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    zR = z16 | zB3 | o0VarE.r(gVar);
                    objQ9 = o0VarE.q();
                    if (zR) {
                        aVar14.getClass();
                        if (objQ9 == p3.m.a.f135155b) {
                            objQ9 = new d(strA, feVar, gVar, null);
                            o0VarE.K(objQ9);
                        }
                    } else {
                        objQ9 = new d(strA, feVar, gVar, null);
                        o0VarE.K(objQ9);
                    }
                    l0.e((e23.p) objQ9, dVar4, o0VarE);
                    objQ10 = o0VarE.q();
                    aVar14.getClass();
                    c2565a = p3.m.a.f135155b;
                    if (objQ10 == c2565a) {
                        objQ10 = p0.n(Boolean.TRUE);
                        o0VarE.K(objQ10);
                    }
                    p1Var = (p1) objQ10;
                    objQ11 = o0VarE.q();
                    if (objQ11 == c2565a) {
                        objQ11 = p0.n(Boolean.FALSE);
                        o0VarE.K(objQ11);
                    }
                    p1Var2 = (p1) objQ11;
                    boolean zBooleanValue3 = ((Boolean) p1Var.getF182175a()).booleanValue();
                    objQ12 = o0VarE.q();
                    if (objQ12 == c2565a) {
                        objQ12 = new j1(p1Var, p1Var2, 15);
                        o0VarE.K(objQ12);
                    }
                    c.w.a(48, 0, (e23.a) objQ12, o0VarE, zBooleanValue3);
                    Boolean bool3 = (Boolean) p1Var2.getF182175a();
                    bool3.getClass();
                    if ((i47 & 7168) == 2048) {
                    }
                    objQ13 = o0VarE.q();
                    if (z17) {
                        objQ13 = new a(aVar7, p1Var2, null);
                        o0VarE.K(objQ13);
                    } else {
                        objQ13 = new a(aVar7, p1Var2, null);
                        o0VarE.K(objQ13);
                    }
                    l0.e((e23.p) objQ13, bool3, o0VarE);
                    boolean z110 = ((m21.e) p1VarC3.getF182175a()).f116086c;
                    n0 n0Var5 = n3.f22788a;
                    n0 n0Var6 = new n0(0, 0, 0, 0);
                    e23.a<Unit> aVar210 = aVar15;
                    e23.a<Unit> aVar211 = aVar20;
                    e23.l<? super b11.a, Unit> lVar110 = lVar11;
                    z3.e eVarC5 = z3.f.c(1306855696, new dd1.d(gVar, aVar7, aVar5, aVar210, aVar211, aVar21, aVar17, p1VarC3, 12), o0VarE);
                    z3.e eVarC6 = z3.f.c(1409332689, new ak0.o(feVar, 23), o0VarE);
                    e23.a<Unit> aVar212 = aVar17;
                    v21.e eVar7 = eVar4;
                    e23.l<? super b11.a, Unit> lVar111 = lVar13;
                    e23.l<? super f01.j, Unit> lVar112 = lVar12;
                    e23.a<Unit> aVar213 = aVar21;
                    z02.d.a(z110, eVarC5, eVarC6, null, n0Var6, z3.f.c(1716763668, new dj0.j(gVar, p1VarC3, aVar19, eVar7, lVar112, pVar, lVar111, aVar5, aVar211, lVar110, aVar212, aVar213), o0VarE), o0VarE, 197040, 8);
                    eVar2 = eVar7;
                    o0Var = o0VarE;
                    lVar6 = lVar110;
                    lVar5 = lVar112;
                    aVar9 = aVar211;
                    aVar13 = aVar210;
                    lVar7 = lVar111;
                    aVar10 = aVar212;
                    aVar11 = aVar213;
                    aVar12 = aVar19;
                } else {
                    o0VarE.e();
                    eVar2 = eVar;
                    lVar5 = lVar3;
                    aVar9 = aVar2;
                    aVar10 = aVar3;
                    aVar11 = aVar4;
                    aVar12 = aVar6;
                    o0Var = o0VarE;
                    lVar6 = lVar4;
                    aVar13 = aVar8;
                    lVar7 = lVar;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e23.p() { // from class: l21.h
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iT = p0.t(i14 | 1);
                            int iT2 = p0.t(i15);
                            i.a(gVar, eVar2, feVar, pVar, lVar7, aVar13, lVar6, lVar5, aVar9, aVar10, aVar11, aVar5, aVar12, aVar7, (p3.m) obj, iT, iT2, i16);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i30 |= C.ENCODING_PCM_32BIT;
            i36 = i16 & 1024;
            if (i36 != 0) {
                i38 = i15 | 6;
            } else {
                if (o0VarE.r(aVar4)) {
                    i37 = 4;
                } else {
                    i37 = 2;
                }
                i38 = i15 | i37;
            }
            if ((i15 & 48) == 0) {
                if (o0VarE.r(aVar5)) {
                    i54 = 32;
                } else {
                    i54 = 16;
                }
                i38 |= i54;
            }
            i39 = i38;
            i44 = i16 & 4096;
            if (i44 != 0) {
                i46 = i39 | 384;
            } else {
                if (o0VarE.r(aVar6)) {
                    i45 = 256;
                } else {
                    i45 = 128;
                }
                i46 = i39 | i45;
            }
            if ((i15 & 3072) == 0) {
                i46 |= o0VarE.r(aVar7) ? 2048 : 1024;
            }
            i47 = i46;
            if ((i30 & 306783379) == 306783378) {
                z14 = true;
            } else {
                z14 = true;
            }
            if (o0VarE.n(i30 & 1, z14)) {
                o0VarE.G0();
                i48 = i14 & 1;
                aVar14 = p3.m.f135153a;
                if (i48 != 0) {
                    if ((i16 & 2) != 0) {
                        eVar3 = (v21.e) KoinJavaComponent.get$default(v21.e.class, null, null, 6, null);
                        i30 &= -113;
                    } else {
                        eVar3 = eVar;
                    }
                    if (i55 != 0) {
                        objQ8 = o0VarE.q();
                        aVar14.getClass();
                        if (objQ8 == p3.m.a.f135155b) {
                            objQ8 = new w2(6);
                            o0VarE.K(objQ8);
                        }
                        lVar8 = (e23.l) objQ8;
                    } else {
                        lVar8 = lVar;
                    }
                    if (i18 != 0) {
                        objQ7 = o0VarE.q();
                        aVar14.getClass();
                        if (objQ7 == p3.m.a.f135155b) {
                            objQ7 = new l01.b(20);
                            o0VarE.K(objQ7);
                        }
                        aVar15 = (e23.a) objQ7;
                    } else {
                        aVar15 = aVar8;
                    }
                    if (i24 != 0) {
                        objQ6 = o0VarE.q();
                        aVar14.getClass();
                        if (objQ6 == p3.m.a.f135155b) {
                            objQ6 = new w2(7);
                            o0VarE.K(objQ6);
                        }
                        lVar9 = (e23.l) objQ6;
                    } else {
                        lVar9 = lVar4;
                    }
                    if (i26 != 0) {
                        objQ5 = o0VarE.q();
                        aVar14.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            objQ5 = new w2(8);
                            o0VarE.K(objQ5);
                        }
                        lVar10 = (e23.l) objQ5;
                    } else {
                        lVar10 = lVar3;
                    }
                    if (i28 != 0) {
                        objQ4 = o0VarE.q();
                        aVar14.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new l01.b(21);
                            o0VarE.K(objQ4);
                        }
                        aVar16 = (e23.a) objQ4;
                    } else {
                        aVar16 = aVar2;
                    }
                    if (i34 != 0) {
                        objQ3 = o0VarE.q();
                        aVar14.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new l01.b(22);
                            o0VarE.K(objQ3);
                        }
                        aVar17 = (e23.a) objQ3;
                    } else {
                        aVar17 = aVar3;
                    }
                    if (i36 != 0) {
                        objQ2 = o0VarE.q();
                        aVar14.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new l01.b(23);
                            o0VarE.K(objQ2);
                        }
                        aVar18 = (e23.a) objQ2;
                    } else {
                        aVar18 = aVar4;
                    }
                    if (i44 != 0) {
                        objQ = o0VarE.q();
                        aVar14.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new l01.b(19);
                            o0VarE.K(objQ);
                        }
                        aVar19 = (e23.a) objQ;
                    } else {
                        aVar19 = aVar6;
                    }
                    lVar11 = lVar9;
                    lVar12 = lVar10;
                    aVar20 = aVar16;
                    aVar21 = aVar18;
                    lVar13 = lVar8;
                    i49 = i30;
                    eVar4 = eVar3;
                } else {
                    if ((i16 & 2) != 0) {
                        eVar3 = (v21.e) KoinJavaComponent.get$default(v21.e.class, null, null, 6, null);
                        i30 &= -113;
                    } else {
                        eVar3 = eVar;
                    }
                    if (i55 != 0) {
                        objQ8 = o0VarE.q();
                        aVar14.getClass();
                        if (objQ8 == p3.m.a.f135155b) {
                            objQ8 = new w2(6);
                            o0VarE.K(objQ8);
                        }
                        lVar8 = (e23.l) objQ8;
                    } else {
                        lVar8 = lVar;
                    }
                    if (i18 != 0) {
                        objQ7 = o0VarE.q();
                        aVar14.getClass();
                        if (objQ7 == p3.m.a.f135155b) {
                            objQ7 = new l01.b(20);
                            o0VarE.K(objQ7);
                        }
                        aVar15 = (e23.a) objQ7;
                    } else {
                        aVar15 = aVar8;
                    }
                    if (i24 != 0) {
                        objQ6 = o0VarE.q();
                        aVar14.getClass();
                        if (objQ6 == p3.m.a.f135155b) {
                            objQ6 = new w2(7);
                            o0VarE.K(objQ6);
                        }
                        lVar9 = (e23.l) objQ6;
                    } else {
                        lVar9 = lVar4;
                    }
                    if (i26 != 0) {
                        objQ5 = o0VarE.q();
                        aVar14.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            objQ5 = new w2(8);
                            o0VarE.K(objQ5);
                        }
                        lVar10 = (e23.l) objQ5;
                    } else {
                        lVar10 = lVar3;
                    }
                    if (i28 != 0) {
                        objQ4 = o0VarE.q();
                        aVar14.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new l01.b(21);
                            o0VarE.K(objQ4);
                        }
                        aVar16 = (e23.a) objQ4;
                    } else {
                        aVar16 = aVar2;
                    }
                    if (i34 != 0) {
                        objQ3 = o0VarE.q();
                        aVar14.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new l01.b(22);
                            o0VarE.K(objQ3);
                        }
                        aVar17 = (e23.a) objQ3;
                    } else {
                        aVar17 = aVar3;
                    }
                    if (i36 != 0) {
                        objQ2 = o0VarE.q();
                        aVar14.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new l01.b(23);
                            o0VarE.K(objQ2);
                        }
                        aVar18 = (e23.a) objQ2;
                    } else {
                        aVar18 = aVar4;
                    }
                    if (i44 != 0) {
                        objQ = o0VarE.q();
                        aVar14.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new l01.b(19);
                            o0VarE.K(objQ);
                        }
                        aVar19 = (e23.a) objQ;
                    } else {
                        aVar19 = aVar6;
                    }
                    lVar11 = lVar9;
                    lVar12 = lVar10;
                    aVar20 = aVar16;
                    aVar21 = aVar18;
                    lVar13 = lVar8;
                    i49 = i30;
                    eVar4 = eVar3;
                }
                o0VarE.h0();
                x1 x1Var7 = p3.n.f135158a;
                p1 p1VarC4 = s9.c.c(gVar.f116126t, o0VarE);
                dVar = ((m21.e) p1VarC4.getF182175a()).f116089f;
                if (dVar == null) {
                    o0VarE.C(1399357418);
                    o0VarE.g0(false);
                    aVar15 = aVar15;
                    aVar20 = aVar20;
                    strA = null;
                } else {
                    o0VarE.C(1292066551);
                    uVar = dVar.f116082a;
                    list = dVar.f116083b;
                    if (list.isEmpty()) {
                        o0VarE.C(598671852);
                        x0 x0Var4 = x0.f105818a;
                        String strA5 = uVar.a(o0VarE);
                        arrayList = new ArrayList(y.r(list, 10));
                        it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((u) it.next()).a(o0VarE));
                        }
                        z15 = false;
                        String[] strArr4 = (String[]) arrayList.toArray(new String[0]);
                        Object[] objArrCopyOf4 = Arrays.copyOf(strArr4, strArr4.length);
                        strA = String.format(strA5, Arrays.copyOf(objArrCopyOf4, objArrCopyOf4.length));
                        o0VarE.g0(false);
                    } else {
                        z15 = false;
                        o0VarE.C(598779980);
                        strA = uVar.a(o0VarE);
                        o0VarE.g0(false);
                    }
                    x1 x1Var8 = p3.n.f135158a;
                    o0VarE.g0(z15);
                }
                m21.d dVar5 = ((m21.e) p1VarC4.getF182175a()).f116089f;
                boolean zB4 = o0VarE.B(strA);
                if ((i49 & 896) == 256) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                zR = z16 | zB4 | o0VarE.r(gVar);
                objQ9 = o0VarE.q();
                if (zR) {
                    aVar14.getClass();
                    if (objQ9 == p3.m.a.f135155b) {
                        objQ9 = new d(strA, feVar, gVar, null);
                        o0VarE.K(objQ9);
                    }
                } else {
                    objQ9 = new d(strA, feVar, gVar, null);
                    o0VarE.K(objQ9);
                }
                l0.e((e23.p) objQ9, dVar5, o0VarE);
                objQ10 = o0VarE.q();
                aVar14.getClass();
                c2565a = p3.m.a.f135155b;
                if (objQ10 == c2565a) {
                    objQ10 = p0.n(Boolean.TRUE);
                    o0VarE.K(objQ10);
                }
                p1Var = (p1) objQ10;
                objQ11 = o0VarE.q();
                if (objQ11 == c2565a) {
                    objQ11 = p0.n(Boolean.FALSE);
                    o0VarE.K(objQ11);
                }
                p1Var2 = (p1) objQ11;
                boolean zBooleanValue4 = ((Boolean) p1Var.getF182175a()).booleanValue();
                objQ12 = o0VarE.q();
                if (objQ12 == c2565a) {
                    objQ12 = new j1(p1Var, p1Var2, 15);
                    o0VarE.K(objQ12);
                }
                c.w.a(48, 0, (e23.a) objQ12, o0VarE, zBooleanValue4);
                Boolean bool4 = (Boolean) p1Var2.getF182175a();
                bool4.getClass();
                if ((i47 & 7168) == 2048) {
                }
                objQ13 = o0VarE.q();
                if (z17) {
                    objQ13 = new a(aVar7, p1Var2, null);
                    o0VarE.K(objQ13);
                } else {
                    objQ13 = new a(aVar7, p1Var2, null);
                    o0VarE.K(objQ13);
                }
                l0.e((e23.p) objQ13, bool4, o0VarE);
                boolean z111 = ((m21.e) p1VarC4.getF182175a()).f116086c;
                n0 n0Var7 = n3.f22788a;
                n0 n0Var8 = new n0(0, 0, 0, 0);
                e23.a<Unit> aVar214 = aVar15;
                e23.a<Unit> aVar215 = aVar20;
                e23.l<? super b11.a, Unit> lVar113 = lVar11;
                z3.e eVarC7 = z3.f.c(1306855696, new dd1.d(gVar, aVar7, aVar5, aVar214, aVar215, aVar21, aVar17, p1VarC4, 12), o0VarE);
                z3.e eVarC8 = z3.f.c(1409332689, new ak0.o(feVar, 23), o0VarE);
                e23.a<Unit> aVar216 = aVar17;
                v21.e eVar8 = eVar4;
                e23.l<? super b11.a, Unit> lVar114 = lVar13;
                e23.l<? super f01.j, Unit> lVar115 = lVar12;
                e23.a<Unit> aVar217 = aVar21;
                z02.d.a(z111, eVarC7, eVarC8, null, n0Var8, z3.f.c(1716763668, new dj0.j(gVar, p1VarC4, aVar19, eVar8, lVar115, pVar, lVar114, aVar5, aVar215, lVar113, aVar216, aVar217), o0VarE), o0VarE, 197040, 8);
                eVar2 = eVar8;
                o0Var = o0VarE;
                lVar6 = lVar113;
                lVar5 = lVar115;
                aVar9 = aVar215;
                aVar13 = aVar214;
                lVar7 = lVar114;
                aVar10 = aVar216;
                aVar11 = aVar217;
                aVar12 = aVar19;
            } else {
                o0VarE.e();
                eVar2 = eVar;
                lVar5 = lVar3;
                aVar9 = aVar2;
                aVar10 = aVar3;
                aVar11 = aVar4;
                aVar12 = aVar6;
                o0Var = o0VarE;
                lVar6 = lVar4;
                aVar13 = aVar8;
                lVar7 = lVar;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e23.p() { // from class: l21.h
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iT = p0.t(i14 | 1);
                        int iT2 = p0.t(i15);
                        i.a(gVar, eVar2, feVar, pVar, lVar7, aVar13, lVar6, lVar5, aVar9, aVar10, aVar11, aVar5, aVar12, aVar7, (p3.m) obj, iT, iT2, i16);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i17 |= 24576;
        i18 = i16 & 32;
        if (i18 != 0) {
            i17 |= 196608;
            aVar8 = aVar;
        } else {
            aVar8 = aVar;
            if ((i14 & 196608) == 0) {
                if (o0VarE.r(aVar8)) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
                i17 |= i19;
            }
        }
        i24 = i16 & 64;
        if (i24 != 0) {
            i17 |= 1572864;
            lVar4 = lVar2;
        } else {
            lVar4 = lVar2;
            if ((i14 & 1572864) == 0) {
                if (o0VarE.r(lVar4)) {
                    i25 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i25 = 524288;
                }
                i17 |= i25;
            }
        }
        i26 = i16 & 128;
        if (i26 != 0) {
            i17 |= 12582912;
        } else if ((i14 & 12582912) == 0) {
            if (o0VarE.r(lVar3)) {
                i27 = 8388608;
            } else {
                i27 = 4194304;
            }
            i17 |= i27;
        }
        i28 = i16 & 256;
        if (i28 != 0) {
            if ((i14 & 100663296) == 0) {
                int i57 = i17;
                if (o0VarE.r(aVar2)) {
                    i29 = 67108864;
                } else {
                    i29 = 33554432;
                }
                i30 = i57 | i29;
            }
            i34 = i16 & 512;
            if (i34 != 0) {
                if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                    if (o0VarE.r(aVar3)) {
                        i35 = 536870912;
                    } else {
                        i35 = 268435456;
                    }
                    i30 |= i35;
                }
                i36 = i16 & 1024;
                if (i36 != 0) {
                    i38 = i15 | 6;
                } else {
                    if (o0VarE.r(aVar4)) {
                        i37 = 4;
                    } else {
                        i37 = 2;
                    }
                    i38 = i15 | i37;
                }
                if ((i15 & 48) == 0) {
                    if (o0VarE.r(aVar5)) {
                        i54 = 32;
                    } else {
                        i54 = 16;
                    }
                    i38 |= i54;
                }
                i39 = i38;
                i44 = i16 & 4096;
                if (i44 != 0) {
                    i46 = i39 | 384;
                } else {
                    if (o0VarE.r(aVar6)) {
                        i45 = 256;
                    } else {
                        i45 = 128;
                    }
                    i46 = i39 | i45;
                }
                if ((i15 & 3072) == 0) {
                    i46 |= o0VarE.r(aVar7) ? 2048 : 1024;
                }
                i47 = i46;
                if ((i30 & 306783379) == 306783378) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                if (o0VarE.n(i30 & 1, z14)) {
                    o0VarE.G0();
                    i48 = i14 & 1;
                    aVar14 = p3.m.f135153a;
                    if (i48 != 0) {
                        if ((i16 & 2) != 0) {
                            eVar3 = (v21.e) KoinJavaComponent.get$default(v21.e.class, null, null, 6, null);
                            i30 &= -113;
                        } else {
                            eVar3 = eVar;
                        }
                        if (i55 != 0) {
                            objQ8 = o0VarE.q();
                            aVar14.getClass();
                            if (objQ8 == p3.m.a.f135155b) {
                                objQ8 = new w2(6);
                                o0VarE.K(objQ8);
                            }
                            lVar8 = (e23.l) objQ8;
                        } else {
                            lVar8 = lVar;
                        }
                        if (i18 != 0) {
                            objQ7 = o0VarE.q();
                            aVar14.getClass();
                            if (objQ7 == p3.m.a.f135155b) {
                                objQ7 = new l01.b(20);
                                o0VarE.K(objQ7);
                            }
                            aVar15 = (e23.a) objQ7;
                        } else {
                            aVar15 = aVar8;
                        }
                        if (i24 != 0) {
                            objQ6 = o0VarE.q();
                            aVar14.getClass();
                            if (objQ6 == p3.m.a.f135155b) {
                                objQ6 = new w2(7);
                                o0VarE.K(objQ6);
                            }
                            lVar9 = (e23.l) objQ6;
                        } else {
                            lVar9 = lVar4;
                        }
                        if (i26 != 0) {
                            objQ5 = o0VarE.q();
                            aVar14.getClass();
                            if (objQ5 == p3.m.a.f135155b) {
                                objQ5 = new w2(8);
                                o0VarE.K(objQ5);
                            }
                            lVar10 = (e23.l) objQ5;
                        } else {
                            lVar10 = lVar3;
                        }
                        if (i28 != 0) {
                            objQ4 = o0VarE.q();
                            aVar14.getClass();
                            if (objQ4 == p3.m.a.f135155b) {
                                objQ4 = new l01.b(21);
                                o0VarE.K(objQ4);
                            }
                            aVar16 = (e23.a) objQ4;
                        } else {
                            aVar16 = aVar2;
                        }
                        if (i34 != 0) {
                            objQ3 = o0VarE.q();
                            aVar14.getClass();
                            if (objQ3 == p3.m.a.f135155b) {
                                objQ3 = new l01.b(22);
                                o0VarE.K(objQ3);
                            }
                            aVar17 = (e23.a) objQ3;
                        } else {
                            aVar17 = aVar3;
                        }
                        if (i36 != 0) {
                            objQ2 = o0VarE.q();
                            aVar14.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new l01.b(23);
                                o0VarE.K(objQ2);
                            }
                            aVar18 = (e23.a) objQ2;
                        } else {
                            aVar18 = aVar4;
                        }
                        if (i44 != 0) {
                            objQ = o0VarE.q();
                            aVar14.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new l01.b(19);
                                o0VarE.K(objQ);
                            }
                            aVar19 = (e23.a) objQ;
                        } else {
                            aVar19 = aVar6;
                        }
                        lVar11 = lVar9;
                        lVar12 = lVar10;
                        aVar20 = aVar16;
                        aVar21 = aVar18;
                        lVar13 = lVar8;
                        i49 = i30;
                        eVar4 = eVar3;
                    } else {
                        if ((i16 & 2) != 0) {
                            eVar3 = (v21.e) KoinJavaComponent.get$default(v21.e.class, null, null, 6, null);
                            i30 &= -113;
                        } else {
                            eVar3 = eVar;
                        }
                        if (i55 != 0) {
                            objQ8 = o0VarE.q();
                            aVar14.getClass();
                            if (objQ8 == p3.m.a.f135155b) {
                                objQ8 = new w2(6);
                                o0VarE.K(objQ8);
                            }
                            lVar8 = (e23.l) objQ8;
                        } else {
                            lVar8 = lVar;
                        }
                        if (i18 != 0) {
                            objQ7 = o0VarE.q();
                            aVar14.getClass();
                            if (objQ7 == p3.m.a.f135155b) {
                                objQ7 = new l01.b(20);
                                o0VarE.K(objQ7);
                            }
                            aVar15 = (e23.a) objQ7;
                        } else {
                            aVar15 = aVar8;
                        }
                        if (i24 != 0) {
                            objQ6 = o0VarE.q();
                            aVar14.getClass();
                            if (objQ6 == p3.m.a.f135155b) {
                                objQ6 = new w2(7);
                                o0VarE.K(objQ6);
                            }
                            lVar9 = (e23.l) objQ6;
                        } else {
                            lVar9 = lVar4;
                        }
                        if (i26 != 0) {
                            objQ5 = o0VarE.q();
                            aVar14.getClass();
                            if (objQ5 == p3.m.a.f135155b) {
                                objQ5 = new w2(8);
                                o0VarE.K(objQ5);
                            }
                            lVar10 = (e23.l) objQ5;
                        } else {
                            lVar10 = lVar3;
                        }
                        if (i28 != 0) {
                            objQ4 = o0VarE.q();
                            aVar14.getClass();
                            if (objQ4 == p3.m.a.f135155b) {
                                objQ4 = new l01.b(21);
                                o0VarE.K(objQ4);
                            }
                            aVar16 = (e23.a) objQ4;
                        } else {
                            aVar16 = aVar2;
                        }
                        if (i34 != 0) {
                            objQ3 = o0VarE.q();
                            aVar14.getClass();
                            if (objQ3 == p3.m.a.f135155b) {
                                objQ3 = new l01.b(22);
                                o0VarE.K(objQ3);
                            }
                            aVar17 = (e23.a) objQ3;
                        } else {
                            aVar17 = aVar3;
                        }
                        if (i36 != 0) {
                            objQ2 = o0VarE.q();
                            aVar14.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new l01.b(23);
                                o0VarE.K(objQ2);
                            }
                            aVar18 = (e23.a) objQ2;
                        } else {
                            aVar18 = aVar4;
                        }
                        if (i44 != 0) {
                            objQ = o0VarE.q();
                            aVar14.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new l01.b(19);
                                o0VarE.K(objQ);
                            }
                            aVar19 = (e23.a) objQ;
                        } else {
                            aVar19 = aVar6;
                        }
                        lVar11 = lVar9;
                        lVar12 = lVar10;
                        aVar20 = aVar16;
                        aVar21 = aVar18;
                        lVar13 = lVar8;
                        i49 = i30;
                        eVar4 = eVar3;
                    }
                    o0VarE.h0();
                    x1 x1Var9 = p3.n.f135158a;
                    p1 p1VarC5 = s9.c.c(gVar.f116126t, o0VarE);
                    dVar = ((m21.e) p1VarC5.getF182175a()).f116089f;
                    if (dVar == null) {
                        o0VarE.C(1399357418);
                        o0VarE.g0(false);
                        aVar15 = aVar15;
                        aVar20 = aVar20;
                        strA = null;
                    } else {
                        o0VarE.C(1292066551);
                        uVar = dVar.f116082a;
                        list = dVar.f116083b;
                        if (list.isEmpty()) {
                            o0VarE.C(598671852);
                            x0 x0Var5 = x0.f105818a;
                            String strA6 = uVar.a(o0VarE);
                            arrayList = new ArrayList(y.r(list, 10));
                            it = list.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((u) it.next()).a(o0VarE));
                            }
                            z15 = false;
                            String[] strArr5 = (String[]) arrayList.toArray(new String[0]);
                            Object[] objArrCopyOf5 = Arrays.copyOf(strArr5, strArr5.length);
                            strA = String.format(strA6, Arrays.copyOf(objArrCopyOf5, objArrCopyOf5.length));
                            o0VarE.g0(false);
                        } else {
                            z15 = false;
                            o0VarE.C(598779980);
                            strA = uVar.a(o0VarE);
                            o0VarE.g0(false);
                        }
                        x1 x1Var10 = p3.n.f135158a;
                        o0VarE.g0(z15);
                    }
                    m21.d dVar6 = ((m21.e) p1VarC5.getF182175a()).f116089f;
                    boolean zB5 = o0VarE.B(strA);
                    if ((i49 & 896) == 256) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    zR = z16 | zB5 | o0VarE.r(gVar);
                    objQ9 = o0VarE.q();
                    if (zR) {
                        aVar14.getClass();
                        if (objQ9 == p3.m.a.f135155b) {
                            objQ9 = new d(strA, feVar, gVar, null);
                            o0VarE.K(objQ9);
                        }
                    } else {
                        objQ9 = new d(strA, feVar, gVar, null);
                        o0VarE.K(objQ9);
                    }
                    l0.e((e23.p) objQ9, dVar6, o0VarE);
                    objQ10 = o0VarE.q();
                    aVar14.getClass();
                    c2565a = p3.m.a.f135155b;
                    if (objQ10 == c2565a) {
                        objQ10 = p0.n(Boolean.TRUE);
                        o0VarE.K(objQ10);
                    }
                    p1Var = (p1) objQ10;
                    objQ11 = o0VarE.q();
                    if (objQ11 == c2565a) {
                        objQ11 = p0.n(Boolean.FALSE);
                        o0VarE.K(objQ11);
                    }
                    p1Var2 = (p1) objQ11;
                    boolean zBooleanValue5 = ((Boolean) p1Var.getF182175a()).booleanValue();
                    objQ12 = o0VarE.q();
                    if (objQ12 == c2565a) {
                        objQ12 = new j1(p1Var, p1Var2, 15);
                        o0VarE.K(objQ12);
                    }
                    c.w.a(48, 0, (e23.a) objQ12, o0VarE, zBooleanValue5);
                    Boolean bool5 = (Boolean) p1Var2.getF182175a();
                    bool5.getClass();
                    if ((i47 & 7168) == 2048) {
                    }
                    objQ13 = o0VarE.q();
                    if (z17) {
                        objQ13 = new a(aVar7, p1Var2, null);
                        o0VarE.K(objQ13);
                    } else {
                        objQ13 = new a(aVar7, p1Var2, null);
                        o0VarE.K(objQ13);
                    }
                    l0.e((e23.p) objQ13, bool5, o0VarE);
                    boolean z112 = ((m21.e) p1VarC5.getF182175a()).f116086c;
                    n0 n0Var9 = n3.f22788a;
                    n0 n0Var10 = new n0(0, 0, 0, 0);
                    e23.a<Unit> aVar218 = aVar15;
                    e23.a<Unit> aVar219 = aVar20;
                    e23.l<? super b11.a, Unit> lVar116 = lVar11;
                    z3.e eVarC9 = z3.f.c(1306855696, new dd1.d(gVar, aVar7, aVar5, aVar218, aVar219, aVar21, aVar17, p1VarC5, 12), o0VarE);
                    z3.e eVarC10 = z3.f.c(1409332689, new ak0.o(feVar, 23), o0VarE);
                    e23.a<Unit> aVar2110 = aVar17;
                    v21.e eVar9 = eVar4;
                    e23.l<? super b11.a, Unit> lVar117 = lVar13;
                    e23.l<? super f01.j, Unit> lVar118 = lVar12;
                    e23.a<Unit> aVar2111 = aVar21;
                    z02.d.a(z112, eVarC9, eVarC10, null, n0Var10, z3.f.c(1716763668, new dj0.j(gVar, p1VarC5, aVar19, eVar9, lVar118, pVar, lVar117, aVar5, aVar219, lVar116, aVar2110, aVar2111), o0VarE), o0VarE, 197040, 8);
                    eVar2 = eVar9;
                    o0Var = o0VarE;
                    lVar6 = lVar116;
                    lVar5 = lVar118;
                    aVar9 = aVar219;
                    aVar13 = aVar218;
                    lVar7 = lVar117;
                    aVar10 = aVar2110;
                    aVar11 = aVar2111;
                    aVar12 = aVar19;
                } else {
                    o0VarE.e();
                    eVar2 = eVar;
                    lVar5 = lVar3;
                    aVar9 = aVar2;
                    aVar10 = aVar3;
                    aVar11 = aVar4;
                    aVar12 = aVar6;
                    o0Var = o0VarE;
                    lVar6 = lVar4;
                    aVar13 = aVar8;
                    lVar7 = lVar;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e23.p() { // from class: l21.h
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iT = p0.t(i14 | 1);
                            int iT2 = p0.t(i15);
                            i.a(gVar, eVar2, feVar, pVar, lVar7, aVar13, lVar6, lVar5, aVar9, aVar10, aVar11, aVar5, aVar12, aVar7, (p3.m) obj, iT, iT2, i16);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i30 |= C.ENCODING_PCM_32BIT;
            i36 = i16 & 1024;
            if (i36 != 0) {
                i38 = i15 | 6;
            } else {
                if (o0VarE.r(aVar4)) {
                    i37 = 4;
                } else {
                    i37 = 2;
                }
                i38 = i15 | i37;
            }
            if ((i15 & 48) == 0) {
                if (o0VarE.r(aVar5)) {
                    i54 = 32;
                } else {
                    i54 = 16;
                }
                i38 |= i54;
            }
            i39 = i38;
            i44 = i16 & 4096;
            if (i44 != 0) {
                i46 = i39 | 384;
            } else {
                if (o0VarE.r(aVar6)) {
                    i45 = 256;
                } else {
                    i45 = 128;
                }
                i46 = i39 | i45;
            }
            if ((i15 & 3072) == 0) {
                i46 |= o0VarE.r(aVar7) ? 2048 : 1024;
            }
            i47 = i46;
            if ((i30 & 306783379) == 306783378) {
                z14 = true;
            } else {
                z14 = true;
            }
            if (o0VarE.n(i30 & 1, z14)) {
                o0VarE.G0();
                i48 = i14 & 1;
                aVar14 = p3.m.f135153a;
                if (i48 != 0) {
                    if ((i16 & 2) != 0) {
                        eVar3 = (v21.e) KoinJavaComponent.get$default(v21.e.class, null, null, 6, null);
                        i30 &= -113;
                    } else {
                        eVar3 = eVar;
                    }
                    if (i55 != 0) {
                        objQ8 = o0VarE.q();
                        aVar14.getClass();
                        if (objQ8 == p3.m.a.f135155b) {
                            objQ8 = new w2(6);
                            o0VarE.K(objQ8);
                        }
                        lVar8 = (e23.l) objQ8;
                    } else {
                        lVar8 = lVar;
                    }
                    if (i18 != 0) {
                        objQ7 = o0VarE.q();
                        aVar14.getClass();
                        if (objQ7 == p3.m.a.f135155b) {
                            objQ7 = new l01.b(20);
                            o0VarE.K(objQ7);
                        }
                        aVar15 = (e23.a) objQ7;
                    } else {
                        aVar15 = aVar8;
                    }
                    if (i24 != 0) {
                        objQ6 = o0VarE.q();
                        aVar14.getClass();
                        if (objQ6 == p3.m.a.f135155b) {
                            objQ6 = new w2(7);
                            o0VarE.K(objQ6);
                        }
                        lVar9 = (e23.l) objQ6;
                    } else {
                        lVar9 = lVar4;
                    }
                    if (i26 != 0) {
                        objQ5 = o0VarE.q();
                        aVar14.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            objQ5 = new w2(8);
                            o0VarE.K(objQ5);
                        }
                        lVar10 = (e23.l) objQ5;
                    } else {
                        lVar10 = lVar3;
                    }
                    if (i28 != 0) {
                        objQ4 = o0VarE.q();
                        aVar14.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new l01.b(21);
                            o0VarE.K(objQ4);
                        }
                        aVar16 = (e23.a) objQ4;
                    } else {
                        aVar16 = aVar2;
                    }
                    if (i34 != 0) {
                        objQ3 = o0VarE.q();
                        aVar14.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new l01.b(22);
                            o0VarE.K(objQ3);
                        }
                        aVar17 = (e23.a) objQ3;
                    } else {
                        aVar17 = aVar3;
                    }
                    if (i36 != 0) {
                        objQ2 = o0VarE.q();
                        aVar14.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new l01.b(23);
                            o0VarE.K(objQ2);
                        }
                        aVar18 = (e23.a) objQ2;
                    } else {
                        aVar18 = aVar4;
                    }
                    if (i44 != 0) {
                        objQ = o0VarE.q();
                        aVar14.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new l01.b(19);
                            o0VarE.K(objQ);
                        }
                        aVar19 = (e23.a) objQ;
                    } else {
                        aVar19 = aVar6;
                    }
                    lVar11 = lVar9;
                    lVar12 = lVar10;
                    aVar20 = aVar16;
                    aVar21 = aVar18;
                    lVar13 = lVar8;
                    i49 = i30;
                    eVar4 = eVar3;
                } else {
                    if ((i16 & 2) != 0) {
                        eVar3 = (v21.e) KoinJavaComponent.get$default(v21.e.class, null, null, 6, null);
                        i30 &= -113;
                    } else {
                        eVar3 = eVar;
                    }
                    if (i55 != 0) {
                        objQ8 = o0VarE.q();
                        aVar14.getClass();
                        if (objQ8 == p3.m.a.f135155b) {
                            objQ8 = new w2(6);
                            o0VarE.K(objQ8);
                        }
                        lVar8 = (e23.l) objQ8;
                    } else {
                        lVar8 = lVar;
                    }
                    if (i18 != 0) {
                        objQ7 = o0VarE.q();
                        aVar14.getClass();
                        if (objQ7 == p3.m.a.f135155b) {
                            objQ7 = new l01.b(20);
                            o0VarE.K(objQ7);
                        }
                        aVar15 = (e23.a) objQ7;
                    } else {
                        aVar15 = aVar8;
                    }
                    if (i24 != 0) {
                        objQ6 = o0VarE.q();
                        aVar14.getClass();
                        if (objQ6 == p3.m.a.f135155b) {
                            objQ6 = new w2(7);
                            o0VarE.K(objQ6);
                        }
                        lVar9 = (e23.l) objQ6;
                    } else {
                        lVar9 = lVar4;
                    }
                    if (i26 != 0) {
                        objQ5 = o0VarE.q();
                        aVar14.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            objQ5 = new w2(8);
                            o0VarE.K(objQ5);
                        }
                        lVar10 = (e23.l) objQ5;
                    } else {
                        lVar10 = lVar3;
                    }
                    if (i28 != 0) {
                        objQ4 = o0VarE.q();
                        aVar14.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new l01.b(21);
                            o0VarE.K(objQ4);
                        }
                        aVar16 = (e23.a) objQ4;
                    } else {
                        aVar16 = aVar2;
                    }
                    if (i34 != 0) {
                        objQ3 = o0VarE.q();
                        aVar14.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new l01.b(22);
                            o0VarE.K(objQ3);
                        }
                        aVar17 = (e23.a) objQ3;
                    } else {
                        aVar17 = aVar3;
                    }
                    if (i36 != 0) {
                        objQ2 = o0VarE.q();
                        aVar14.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new l01.b(23);
                            o0VarE.K(objQ2);
                        }
                        aVar18 = (e23.a) objQ2;
                    } else {
                        aVar18 = aVar4;
                    }
                    if (i44 != 0) {
                        objQ = o0VarE.q();
                        aVar14.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new l01.b(19);
                            o0VarE.K(objQ);
                        }
                        aVar19 = (e23.a) objQ;
                    } else {
                        aVar19 = aVar6;
                    }
                    lVar11 = lVar9;
                    lVar12 = lVar10;
                    aVar20 = aVar16;
                    aVar21 = aVar18;
                    lVar13 = lVar8;
                    i49 = i30;
                    eVar4 = eVar3;
                }
                o0VarE.h0();
                x1 x1Var11 = p3.n.f135158a;
                p1 p1VarC6 = s9.c.c(gVar.f116126t, o0VarE);
                dVar = ((m21.e) p1VarC6.getF182175a()).f116089f;
                if (dVar == null) {
                    o0VarE.C(1399357418);
                    o0VarE.g0(false);
                    aVar15 = aVar15;
                    aVar20 = aVar20;
                    strA = null;
                } else {
                    o0VarE.C(1292066551);
                    uVar = dVar.f116082a;
                    list = dVar.f116083b;
                    if (list.isEmpty()) {
                        o0VarE.C(598671852);
                        x0 x0Var6 = x0.f105818a;
                        String strA7 = uVar.a(o0VarE);
                        arrayList = new ArrayList(y.r(list, 10));
                        it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((u) it.next()).a(o0VarE));
                        }
                        z15 = false;
                        String[] strArr6 = (String[]) arrayList.toArray(new String[0]);
                        Object[] objArrCopyOf6 = Arrays.copyOf(strArr6, strArr6.length);
                        strA = String.format(strA7, Arrays.copyOf(objArrCopyOf6, objArrCopyOf6.length));
                        o0VarE.g0(false);
                    } else {
                        z15 = false;
                        o0VarE.C(598779980);
                        strA = uVar.a(o0VarE);
                        o0VarE.g0(false);
                    }
                    x1 x1Var12 = p3.n.f135158a;
                    o0VarE.g0(z15);
                }
                m21.d dVar7 = ((m21.e) p1VarC6.getF182175a()).f116089f;
                boolean zB6 = o0VarE.B(strA);
                if ((i49 & 896) == 256) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                zR = z16 | zB6 | o0VarE.r(gVar);
                objQ9 = o0VarE.q();
                if (zR) {
                    aVar14.getClass();
                    if (objQ9 == p3.m.a.f135155b) {
                        objQ9 = new d(strA, feVar, gVar, null);
                        o0VarE.K(objQ9);
                    }
                } else {
                    objQ9 = new d(strA, feVar, gVar, null);
                    o0VarE.K(objQ9);
                }
                l0.e((e23.p) objQ9, dVar7, o0VarE);
                objQ10 = o0VarE.q();
                aVar14.getClass();
                c2565a = p3.m.a.f135155b;
                if (objQ10 == c2565a) {
                    objQ10 = p0.n(Boolean.TRUE);
                    o0VarE.K(objQ10);
                }
                p1Var = (p1) objQ10;
                objQ11 = o0VarE.q();
                if (objQ11 == c2565a) {
                    objQ11 = p0.n(Boolean.FALSE);
                    o0VarE.K(objQ11);
                }
                p1Var2 = (p1) objQ11;
                boolean zBooleanValue6 = ((Boolean) p1Var.getF182175a()).booleanValue();
                objQ12 = o0VarE.q();
                if (objQ12 == c2565a) {
                    objQ12 = new j1(p1Var, p1Var2, 15);
                    o0VarE.K(objQ12);
                }
                c.w.a(48, 0, (e23.a) objQ12, o0VarE, zBooleanValue6);
                Boolean bool6 = (Boolean) p1Var2.getF182175a();
                bool6.getClass();
                if ((i47 & 7168) == 2048) {
                }
                objQ13 = o0VarE.q();
                if (z17) {
                    objQ13 = new a(aVar7, p1Var2, null);
                    o0VarE.K(objQ13);
                } else {
                    objQ13 = new a(aVar7, p1Var2, null);
                    o0VarE.K(objQ13);
                }
                l0.e((e23.p) objQ13, bool6, o0VarE);
                boolean z113 = ((m21.e) p1VarC6.getF182175a()).f116086c;
                n0 n0Var11 = n3.f22788a;
                n0 n0Var12 = new n0(0, 0, 0, 0);
                e23.a<Unit> aVar2112 = aVar15;
                e23.a<Unit> aVar2113 = aVar20;
                e23.l<? super b11.a, Unit> lVar119 = lVar11;
                z3.e eVarC11 = z3.f.c(1306855696, new dd1.d(gVar, aVar7, aVar5, aVar2112, aVar2113, aVar21, aVar17, p1VarC6, 12), o0VarE);
                z3.e eVarC12 = z3.f.c(1409332689, new ak0.o(feVar, 23), o0VarE);
                e23.a<Unit> aVar2114 = aVar17;
                v21.e eVar10 = eVar4;
                e23.l<? super b11.a, Unit> lVar1110 = lVar13;
                e23.l<? super f01.j, Unit> lVar1111 = lVar12;
                e23.a<Unit> aVar2115 = aVar21;
                z02.d.a(z113, eVarC11, eVarC12, null, n0Var12, z3.f.c(1716763668, new dj0.j(gVar, p1VarC6, aVar19, eVar10, lVar1111, pVar, lVar1110, aVar5, aVar2113, lVar119, aVar2114, aVar2115), o0VarE), o0VarE, 197040, 8);
                eVar2 = eVar10;
                o0Var = o0VarE;
                lVar6 = lVar119;
                lVar5 = lVar1111;
                aVar9 = aVar2113;
                aVar13 = aVar2112;
                lVar7 = lVar1110;
                aVar10 = aVar2114;
                aVar11 = aVar2115;
                aVar12 = aVar19;
            } else {
                o0VarE.e();
                eVar2 = eVar;
                lVar5 = lVar3;
                aVar9 = aVar2;
                aVar10 = aVar3;
                aVar11 = aVar4;
                aVar12 = aVar6;
                o0Var = o0VarE;
                lVar6 = lVar4;
                aVar13 = aVar8;
                lVar7 = lVar;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e23.p() { // from class: l21.h
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iT = p0.t(i14 | 1);
                        int iT2 = p0.t(i15);
                        i.a(gVar, eVar2, feVar, pVar, lVar7, aVar13, lVar6, lVar5, aVar9, aVar10, aVar11, aVar5, aVar12, aVar7, (p3.m) obj, iT, iT2, i16);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i17 |= 100663296;
        i30 = i17;
        i34 = i16 & 512;
        if (i34 != 0) {
            if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                if (o0VarE.r(aVar3)) {
                    i35 = 536870912;
                } else {
                    i35 = 268435456;
                }
                i30 |= i35;
            }
            i36 = i16 & 1024;
            if (i36 != 0) {
                i38 = i15 | 6;
            } else {
                if (o0VarE.r(aVar4)) {
                    i37 = 4;
                } else {
                    i37 = 2;
                }
                i38 = i15 | i37;
            }
            if ((i15 & 48) == 0) {
                if (o0VarE.r(aVar5)) {
                    i54 = 32;
                } else {
                    i54 = 16;
                }
                i38 |= i54;
            }
            i39 = i38;
            i44 = i16 & 4096;
            if (i44 != 0) {
                i46 = i39 | 384;
            } else {
                if (o0VarE.r(aVar6)) {
                    i45 = 256;
                } else {
                    i45 = 128;
                }
                i46 = i39 | i45;
            }
            if ((i15 & 3072) == 0) {
                i46 |= o0VarE.r(aVar7) ? 2048 : 1024;
            }
            i47 = i46;
            if ((i30 & 306783379) == 306783378) {
                z14 = true;
            } else {
                z14 = true;
            }
            if (o0VarE.n(i30 & 1, z14)) {
                o0VarE.G0();
                i48 = i14 & 1;
                aVar14 = p3.m.f135153a;
                if (i48 != 0) {
                    if ((i16 & 2) != 0) {
                        eVar3 = (v21.e) KoinJavaComponent.get$default(v21.e.class, null, null, 6, null);
                        i30 &= -113;
                    } else {
                        eVar3 = eVar;
                    }
                    if (i55 != 0) {
                        objQ8 = o0VarE.q();
                        aVar14.getClass();
                        if (objQ8 == p3.m.a.f135155b) {
                            objQ8 = new w2(6);
                            o0VarE.K(objQ8);
                        }
                        lVar8 = (e23.l) objQ8;
                    } else {
                        lVar8 = lVar;
                    }
                    if (i18 != 0) {
                        objQ7 = o0VarE.q();
                        aVar14.getClass();
                        if (objQ7 == p3.m.a.f135155b) {
                            objQ7 = new l01.b(20);
                            o0VarE.K(objQ7);
                        }
                        aVar15 = (e23.a) objQ7;
                    } else {
                        aVar15 = aVar8;
                    }
                    if (i24 != 0) {
                        objQ6 = o0VarE.q();
                        aVar14.getClass();
                        if (objQ6 == p3.m.a.f135155b) {
                            objQ6 = new w2(7);
                            o0VarE.K(objQ6);
                        }
                        lVar9 = (e23.l) objQ6;
                    } else {
                        lVar9 = lVar4;
                    }
                    if (i26 != 0) {
                        objQ5 = o0VarE.q();
                        aVar14.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            objQ5 = new w2(8);
                            o0VarE.K(objQ5);
                        }
                        lVar10 = (e23.l) objQ5;
                    } else {
                        lVar10 = lVar3;
                    }
                    if (i28 != 0) {
                        objQ4 = o0VarE.q();
                        aVar14.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new l01.b(21);
                            o0VarE.K(objQ4);
                        }
                        aVar16 = (e23.a) objQ4;
                    } else {
                        aVar16 = aVar2;
                    }
                    if (i34 != 0) {
                        objQ3 = o0VarE.q();
                        aVar14.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new l01.b(22);
                            o0VarE.K(objQ3);
                        }
                        aVar17 = (e23.a) objQ3;
                    } else {
                        aVar17 = aVar3;
                    }
                    if (i36 != 0) {
                        objQ2 = o0VarE.q();
                        aVar14.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new l01.b(23);
                            o0VarE.K(objQ2);
                        }
                        aVar18 = (e23.a) objQ2;
                    } else {
                        aVar18 = aVar4;
                    }
                    if (i44 != 0) {
                        objQ = o0VarE.q();
                        aVar14.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new l01.b(19);
                            o0VarE.K(objQ);
                        }
                        aVar19 = (e23.a) objQ;
                    } else {
                        aVar19 = aVar6;
                    }
                    lVar11 = lVar9;
                    lVar12 = lVar10;
                    aVar20 = aVar16;
                    aVar21 = aVar18;
                    lVar13 = lVar8;
                    i49 = i30;
                    eVar4 = eVar3;
                } else {
                    if ((i16 & 2) != 0) {
                        eVar3 = (v21.e) KoinJavaComponent.get$default(v21.e.class, null, null, 6, null);
                        i30 &= -113;
                    } else {
                        eVar3 = eVar;
                    }
                    if (i55 != 0) {
                        objQ8 = o0VarE.q();
                        aVar14.getClass();
                        if (objQ8 == p3.m.a.f135155b) {
                            objQ8 = new w2(6);
                            o0VarE.K(objQ8);
                        }
                        lVar8 = (e23.l) objQ8;
                    } else {
                        lVar8 = lVar;
                    }
                    if (i18 != 0) {
                        objQ7 = o0VarE.q();
                        aVar14.getClass();
                        if (objQ7 == p3.m.a.f135155b) {
                            objQ7 = new l01.b(20);
                            o0VarE.K(objQ7);
                        }
                        aVar15 = (e23.a) objQ7;
                    } else {
                        aVar15 = aVar8;
                    }
                    if (i24 != 0) {
                        objQ6 = o0VarE.q();
                        aVar14.getClass();
                        if (objQ6 == p3.m.a.f135155b) {
                            objQ6 = new w2(7);
                            o0VarE.K(objQ6);
                        }
                        lVar9 = (e23.l) objQ6;
                    } else {
                        lVar9 = lVar4;
                    }
                    if (i26 != 0) {
                        objQ5 = o0VarE.q();
                        aVar14.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            objQ5 = new w2(8);
                            o0VarE.K(objQ5);
                        }
                        lVar10 = (e23.l) objQ5;
                    } else {
                        lVar10 = lVar3;
                    }
                    if (i28 != 0) {
                        objQ4 = o0VarE.q();
                        aVar14.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new l01.b(21);
                            o0VarE.K(objQ4);
                        }
                        aVar16 = (e23.a) objQ4;
                    } else {
                        aVar16 = aVar2;
                    }
                    if (i34 != 0) {
                        objQ3 = o0VarE.q();
                        aVar14.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new l01.b(22);
                            o0VarE.K(objQ3);
                        }
                        aVar17 = (e23.a) objQ3;
                    } else {
                        aVar17 = aVar3;
                    }
                    if (i36 != 0) {
                        objQ2 = o0VarE.q();
                        aVar14.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new l01.b(23);
                            o0VarE.K(objQ2);
                        }
                        aVar18 = (e23.a) objQ2;
                    } else {
                        aVar18 = aVar4;
                    }
                    if (i44 != 0) {
                        objQ = o0VarE.q();
                        aVar14.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new l01.b(19);
                            o0VarE.K(objQ);
                        }
                        aVar19 = (e23.a) objQ;
                    } else {
                        aVar19 = aVar6;
                    }
                    lVar11 = lVar9;
                    lVar12 = lVar10;
                    aVar20 = aVar16;
                    aVar21 = aVar18;
                    lVar13 = lVar8;
                    i49 = i30;
                    eVar4 = eVar3;
                }
                o0VarE.h0();
                x1 x1Var13 = p3.n.f135158a;
                p1 p1VarC7 = s9.c.c(gVar.f116126t, o0VarE);
                dVar = ((m21.e) p1VarC7.getF182175a()).f116089f;
                if (dVar == null) {
                    o0VarE.C(1399357418);
                    o0VarE.g0(false);
                    aVar15 = aVar15;
                    aVar20 = aVar20;
                    strA = null;
                } else {
                    o0VarE.C(1292066551);
                    uVar = dVar.f116082a;
                    list = dVar.f116083b;
                    if (list.isEmpty()) {
                        o0VarE.C(598671852);
                        x0 x0Var7 = x0.f105818a;
                        String strA8 = uVar.a(o0VarE);
                        arrayList = new ArrayList(y.r(list, 10));
                        it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((u) it.next()).a(o0VarE));
                        }
                        z15 = false;
                        String[] strArr7 = (String[]) arrayList.toArray(new String[0]);
                        Object[] objArrCopyOf7 = Arrays.copyOf(strArr7, strArr7.length);
                        strA = String.format(strA8, Arrays.copyOf(objArrCopyOf7, objArrCopyOf7.length));
                        o0VarE.g0(false);
                    } else {
                        z15 = false;
                        o0VarE.C(598779980);
                        strA = uVar.a(o0VarE);
                        o0VarE.g0(false);
                    }
                    x1 x1Var14 = p3.n.f135158a;
                    o0VarE.g0(z15);
                }
                m21.d dVar8 = ((m21.e) p1VarC7.getF182175a()).f116089f;
                boolean zB7 = o0VarE.B(strA);
                if ((i49 & 896) == 256) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                zR = z16 | zB7 | o0VarE.r(gVar);
                objQ9 = o0VarE.q();
                if (zR) {
                    aVar14.getClass();
                    if (objQ9 == p3.m.a.f135155b) {
                        objQ9 = new d(strA, feVar, gVar, null);
                        o0VarE.K(objQ9);
                    }
                } else {
                    objQ9 = new d(strA, feVar, gVar, null);
                    o0VarE.K(objQ9);
                }
                l0.e((e23.p) objQ9, dVar8, o0VarE);
                objQ10 = o0VarE.q();
                aVar14.getClass();
                c2565a = p3.m.a.f135155b;
                if (objQ10 == c2565a) {
                    objQ10 = p0.n(Boolean.TRUE);
                    o0VarE.K(objQ10);
                }
                p1Var = (p1) objQ10;
                objQ11 = o0VarE.q();
                if (objQ11 == c2565a) {
                    objQ11 = p0.n(Boolean.FALSE);
                    o0VarE.K(objQ11);
                }
                p1Var2 = (p1) objQ11;
                boolean zBooleanValue7 = ((Boolean) p1Var.getF182175a()).booleanValue();
                objQ12 = o0VarE.q();
                if (objQ12 == c2565a) {
                    objQ12 = new j1(p1Var, p1Var2, 15);
                    o0VarE.K(objQ12);
                }
                c.w.a(48, 0, (e23.a) objQ12, o0VarE, zBooleanValue7);
                Boolean bool7 = (Boolean) p1Var2.getF182175a();
                bool7.getClass();
                if ((i47 & 7168) == 2048) {
                }
                objQ13 = o0VarE.q();
                if (z17) {
                    objQ13 = new a(aVar7, p1Var2, null);
                    o0VarE.K(objQ13);
                } else {
                    objQ13 = new a(aVar7, p1Var2, null);
                    o0VarE.K(objQ13);
                }
                l0.e((e23.p) objQ13, bool7, o0VarE);
                boolean z114 = ((m21.e) p1VarC7.getF182175a()).f116086c;
                n0 n0Var13 = n3.f22788a;
                n0 n0Var14 = new n0(0, 0, 0, 0);
                e23.a<Unit> aVar2116 = aVar15;
                e23.a<Unit> aVar2117 = aVar20;
                e23.l<? super b11.a, Unit> lVar1112 = lVar11;
                z3.e eVarC13 = z3.f.c(1306855696, new dd1.d(gVar, aVar7, aVar5, aVar2116, aVar2117, aVar21, aVar17, p1VarC7, 12), o0VarE);
                z3.e eVarC14 = z3.f.c(1409332689, new ak0.o(feVar, 23), o0VarE);
                e23.a<Unit> aVar2118 = aVar17;
                v21.e eVar11 = eVar4;
                e23.l<? super b11.a, Unit> lVar1113 = lVar13;
                e23.l<? super f01.j, Unit> lVar1114 = lVar12;
                e23.a<Unit> aVar2119 = aVar21;
                z02.d.a(z114, eVarC13, eVarC14, null, n0Var14, z3.f.c(1716763668, new dj0.j(gVar, p1VarC7, aVar19, eVar11, lVar1114, pVar, lVar1113, aVar5, aVar2117, lVar1112, aVar2118, aVar2119), o0VarE), o0VarE, 197040, 8);
                eVar2 = eVar11;
                o0Var = o0VarE;
                lVar6 = lVar1112;
                lVar5 = lVar1114;
                aVar9 = aVar2117;
                aVar13 = aVar2116;
                lVar7 = lVar1113;
                aVar10 = aVar2118;
                aVar11 = aVar2119;
                aVar12 = aVar19;
            } else {
                o0VarE.e();
                eVar2 = eVar;
                lVar5 = lVar3;
                aVar9 = aVar2;
                aVar10 = aVar3;
                aVar11 = aVar4;
                aVar12 = aVar6;
                o0Var = o0VarE;
                lVar6 = lVar4;
                aVar13 = aVar8;
                lVar7 = lVar;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e23.p() { // from class: l21.h
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iT = p0.t(i14 | 1);
                        int iT2 = p0.t(i15);
                        i.a(gVar, eVar2, feVar, pVar, lVar7, aVar13, lVar6, lVar5, aVar9, aVar10, aVar11, aVar5, aVar12, aVar7, (p3.m) obj, iT, iT2, i16);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i30 |= C.ENCODING_PCM_32BIT;
        i36 = i16 & 1024;
        if (i36 != 0) {
            i38 = i15 | 6;
        } else {
            if (o0VarE.r(aVar4)) {
                i37 = 4;
            } else {
                i37 = 2;
            }
            i38 = i15 | i37;
        }
        if ((i15 & 48) == 0) {
            if (o0VarE.r(aVar5)) {
                i54 = 32;
            } else {
                i54 = 16;
            }
            i38 |= i54;
        }
        i39 = i38;
        i44 = i16 & 4096;
        if (i44 != 0) {
            i46 = i39 | 384;
        } else {
            if (o0VarE.r(aVar6)) {
                i45 = 256;
            } else {
                i45 = 128;
            }
            i46 = i39 | i45;
        }
        if ((i15 & 3072) == 0) {
            i46 |= o0VarE.r(aVar7) ? 2048 : 1024;
        }
        i47 = i46;
        if ((i30 & 306783379) == 306783378) {
            z14 = true;
        } else {
            z14 = true;
        }
        if (o0VarE.n(i30 & 1, z14)) {
            o0VarE.G0();
            i48 = i14 & 1;
            aVar14 = p3.m.f135153a;
            if (i48 != 0) {
                if ((i16 & 2) != 0) {
                    eVar3 = (v21.e) KoinJavaComponent.get$default(v21.e.class, null, null, 6, null);
                    i30 &= -113;
                } else {
                    eVar3 = eVar;
                }
                if (i55 != 0) {
                    objQ8 = o0VarE.q();
                    aVar14.getClass();
                    if (objQ8 == p3.m.a.f135155b) {
                        objQ8 = new w2(6);
                        o0VarE.K(objQ8);
                    }
                    lVar8 = (e23.l) objQ8;
                } else {
                    lVar8 = lVar;
                }
                if (i18 != 0) {
                    objQ7 = o0VarE.q();
                    aVar14.getClass();
                    if (objQ7 == p3.m.a.f135155b) {
                        objQ7 = new l01.b(20);
                        o0VarE.K(objQ7);
                    }
                    aVar15 = (e23.a) objQ7;
                } else {
                    aVar15 = aVar8;
                }
                if (i24 != 0) {
                    objQ6 = o0VarE.q();
                    aVar14.getClass();
                    if (objQ6 == p3.m.a.f135155b) {
                        objQ6 = new w2(7);
                        o0VarE.K(objQ6);
                    }
                    lVar9 = (e23.l) objQ6;
                } else {
                    lVar9 = lVar4;
                }
                if (i26 != 0) {
                    objQ5 = o0VarE.q();
                    aVar14.getClass();
                    if (objQ5 == p3.m.a.f135155b) {
                        objQ5 = new w2(8);
                        o0VarE.K(objQ5);
                    }
                    lVar10 = (e23.l) objQ5;
                } else {
                    lVar10 = lVar3;
                }
                if (i28 != 0) {
                    objQ4 = o0VarE.q();
                    aVar14.getClass();
                    if (objQ4 == p3.m.a.f135155b) {
                        objQ4 = new l01.b(21);
                        o0VarE.K(objQ4);
                    }
                    aVar16 = (e23.a) objQ4;
                } else {
                    aVar16 = aVar2;
                }
                if (i34 != 0) {
                    objQ3 = o0VarE.q();
                    aVar14.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new l01.b(22);
                        o0VarE.K(objQ3);
                    }
                    aVar17 = (e23.a) objQ3;
                } else {
                    aVar17 = aVar3;
                }
                if (i36 != 0) {
                    objQ2 = o0VarE.q();
                    aVar14.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new l01.b(23);
                        o0VarE.K(objQ2);
                    }
                    aVar18 = (e23.a) objQ2;
                } else {
                    aVar18 = aVar4;
                }
                if (i44 != 0) {
                    objQ = o0VarE.q();
                    aVar14.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new l01.b(19);
                        o0VarE.K(objQ);
                    }
                    aVar19 = (e23.a) objQ;
                } else {
                    aVar19 = aVar6;
                }
                lVar11 = lVar9;
                lVar12 = lVar10;
                aVar20 = aVar16;
                aVar21 = aVar18;
                lVar13 = lVar8;
                i49 = i30;
                eVar4 = eVar3;
            } else {
                if ((i16 & 2) != 0) {
                    eVar3 = (v21.e) KoinJavaComponent.get$default(v21.e.class, null, null, 6, null);
                    i30 &= -113;
                } else {
                    eVar3 = eVar;
                }
                if (i55 != 0) {
                    objQ8 = o0VarE.q();
                    aVar14.getClass();
                    if (objQ8 == p3.m.a.f135155b) {
                        objQ8 = new w2(6);
                        o0VarE.K(objQ8);
                    }
                    lVar8 = (e23.l) objQ8;
                } else {
                    lVar8 = lVar;
                }
                if (i18 != 0) {
                    objQ7 = o0VarE.q();
                    aVar14.getClass();
                    if (objQ7 == p3.m.a.f135155b) {
                        objQ7 = new l01.b(20);
                        o0VarE.K(objQ7);
                    }
                    aVar15 = (e23.a) objQ7;
                } else {
                    aVar15 = aVar8;
                }
                if (i24 != 0) {
                    objQ6 = o0VarE.q();
                    aVar14.getClass();
                    if (objQ6 == p3.m.a.f135155b) {
                        objQ6 = new w2(7);
                        o0VarE.K(objQ6);
                    }
                    lVar9 = (e23.l) objQ6;
                } else {
                    lVar9 = lVar4;
                }
                if (i26 != 0) {
                    objQ5 = o0VarE.q();
                    aVar14.getClass();
                    if (objQ5 == p3.m.a.f135155b) {
                        objQ5 = new w2(8);
                        o0VarE.K(objQ5);
                    }
                    lVar10 = (e23.l) objQ5;
                } else {
                    lVar10 = lVar3;
                }
                if (i28 != 0) {
                    objQ4 = o0VarE.q();
                    aVar14.getClass();
                    if (objQ4 == p3.m.a.f135155b) {
                        objQ4 = new l01.b(21);
                        o0VarE.K(objQ4);
                    }
                    aVar16 = (e23.a) objQ4;
                } else {
                    aVar16 = aVar2;
                }
                if (i34 != 0) {
                    objQ3 = o0VarE.q();
                    aVar14.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new l01.b(22);
                        o0VarE.K(objQ3);
                    }
                    aVar17 = (e23.a) objQ3;
                } else {
                    aVar17 = aVar3;
                }
                if (i36 != 0) {
                    objQ2 = o0VarE.q();
                    aVar14.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new l01.b(23);
                        o0VarE.K(objQ2);
                    }
                    aVar18 = (e23.a) objQ2;
                } else {
                    aVar18 = aVar4;
                }
                if (i44 != 0) {
                    objQ = o0VarE.q();
                    aVar14.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new l01.b(19);
                        o0VarE.K(objQ);
                    }
                    aVar19 = (e23.a) objQ;
                } else {
                    aVar19 = aVar6;
                }
                lVar11 = lVar9;
                lVar12 = lVar10;
                aVar20 = aVar16;
                aVar21 = aVar18;
                lVar13 = lVar8;
                i49 = i30;
                eVar4 = eVar3;
            }
            o0VarE.h0();
            x1 x1Var15 = p3.n.f135158a;
            p1 p1VarC8 = s9.c.c(gVar.f116126t, o0VarE);
            dVar = ((m21.e) p1VarC8.getF182175a()).f116089f;
            if (dVar == null) {
                o0VarE.C(1399357418);
                o0VarE.g0(false);
                aVar15 = aVar15;
                aVar20 = aVar20;
                strA = null;
            } else {
                o0VarE.C(1292066551);
                uVar = dVar.f116082a;
                list = dVar.f116083b;
                if (list.isEmpty()) {
                    o0VarE.C(598671852);
                    x0 x0Var8 = x0.f105818a;
                    String strA9 = uVar.a(o0VarE);
                    arrayList = new ArrayList(y.r(list, 10));
                    it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((u) it.next()).a(o0VarE));
                    }
                    z15 = false;
                    String[] strArr8 = (String[]) arrayList.toArray(new String[0]);
                    Object[] objArrCopyOf8 = Arrays.copyOf(strArr8, strArr8.length);
                    strA = String.format(strA9, Arrays.copyOf(objArrCopyOf8, objArrCopyOf8.length));
                    o0VarE.g0(false);
                } else {
                    z15 = false;
                    o0VarE.C(598779980);
                    strA = uVar.a(o0VarE);
                    o0VarE.g0(false);
                }
                x1 x1Var16 = p3.n.f135158a;
                o0VarE.g0(z15);
            }
            m21.d dVar9 = ((m21.e) p1VarC8.getF182175a()).f116089f;
            boolean zB8 = o0VarE.B(strA);
            if ((i49 & 896) == 256) {
                z16 = true;
            } else {
                z16 = false;
            }
            zR = z16 | zB8 | o0VarE.r(gVar);
            objQ9 = o0VarE.q();
            if (zR) {
                aVar14.getClass();
                if (objQ9 == p3.m.a.f135155b) {
                    objQ9 = new d(strA, feVar, gVar, null);
                    o0VarE.K(objQ9);
                }
            } else {
                objQ9 = new d(strA, feVar, gVar, null);
                o0VarE.K(objQ9);
            }
            l0.e((e23.p) objQ9, dVar9, o0VarE);
            objQ10 = o0VarE.q();
            aVar14.getClass();
            c2565a = p3.m.a.f135155b;
            if (objQ10 == c2565a) {
                objQ10 = p0.n(Boolean.TRUE);
                o0VarE.K(objQ10);
            }
            p1Var = (p1) objQ10;
            objQ11 = o0VarE.q();
            if (objQ11 == c2565a) {
                objQ11 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ11);
            }
            p1Var2 = (p1) objQ11;
            boolean zBooleanValue8 = ((Boolean) p1Var.getF182175a()).booleanValue();
            objQ12 = o0VarE.q();
            if (objQ12 == c2565a) {
                objQ12 = new j1(p1Var, p1Var2, 15);
                o0VarE.K(objQ12);
            }
            c.w.a(48, 0, (e23.a) objQ12, o0VarE, zBooleanValue8);
            Boolean bool8 = (Boolean) p1Var2.getF182175a();
            bool8.getClass();
            if ((i47 & 7168) == 2048) {
            }
            objQ13 = o0VarE.q();
            if (z17) {
                objQ13 = new a(aVar7, p1Var2, null);
                o0VarE.K(objQ13);
            } else {
                objQ13 = new a(aVar7, p1Var2, null);
                o0VarE.K(objQ13);
            }
            l0.e((e23.p) objQ13, bool8, o0VarE);
            boolean z115 = ((m21.e) p1VarC8.getF182175a()).f116086c;
            n0 n0Var15 = n3.f22788a;
            n0 n0Var16 = new n0(0, 0, 0, 0);
            e23.a<Unit> aVar21110 = aVar15;
            e23.a<Unit> aVar21111 = aVar20;
            e23.l<? super b11.a, Unit> lVar1115 = lVar11;
            z3.e eVarC15 = z3.f.c(1306855696, new dd1.d(gVar, aVar7, aVar5, aVar21110, aVar21111, aVar21, aVar17, p1VarC8, 12), o0VarE);
            z3.e eVarC16 = z3.f.c(1409332689, new ak0.o(feVar, 23), o0VarE);
            e23.a<Unit> aVar21112 = aVar17;
            v21.e eVar12 = eVar4;
            e23.l<? super b11.a, Unit> lVar1116 = lVar13;
            e23.l<? super f01.j, Unit> lVar1117 = lVar12;
            e23.a<Unit> aVar21113 = aVar21;
            z02.d.a(z115, eVarC15, eVarC16, null, n0Var16, z3.f.c(1716763668, new dj0.j(gVar, p1VarC8, aVar19, eVar12, lVar1117, pVar, lVar1116, aVar5, aVar21111, lVar1115, aVar21112, aVar21113), o0VarE), o0VarE, 197040, 8);
            eVar2 = eVar12;
            o0Var = o0VarE;
            lVar6 = lVar1115;
            lVar5 = lVar1117;
            aVar9 = aVar21111;
            aVar13 = aVar21110;
            lVar7 = lVar1116;
            aVar10 = aVar21112;
            aVar11 = aVar21113;
            aVar12 = aVar19;
        } else {
            o0VarE.e();
            eVar2 = eVar;
            lVar5 = lVar3;
            aVar9 = aVar2;
            aVar10 = aVar3;
            aVar11 = aVar4;
            aVar12 = aVar6;
            o0Var = o0VarE;
            lVar6 = lVar4;
            aVar13 = aVar8;
            lVar7 = lVar;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: l21.h
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p0.t(i14 | 1);
                    int iT2 = p0.t(i15);
                    i.a(gVar, eVar2, feVar, pVar, lVar7, aVar13, lVar6, lVar5, aVar9, aVar10, aVar11, aVar5, aVar12, aVar7, (p3.m) obj, iT, iT2, i16);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
