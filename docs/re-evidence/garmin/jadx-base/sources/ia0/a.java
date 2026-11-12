package ia0;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.u1;
import b21.n9;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import e23.l;
import e23.p;
import gl1.y;
import i3.f2;
import java.util.List;
import l72.c1;
import o13.r;
import o53.b0;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.q;
import p005kotlin.jvm.internal.s0;
import p13.x;
import p3.l0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p1;
import p3.x1;
import p3.x3;
import r53.p2;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: ia0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.customization.activityoptions.ActivityOptionsScreenKt$ActivityOptionsScreenRoute$1$1", f = "ActivityOptionsScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class C1764a extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f92402a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f92403b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x3<ia0.b> f92404c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1764a(e23.a<Unit> aVar, g gVar, x3<ia0.b> x3Var, t13.d<? super C1764a> dVar) {
            super(2, dVar);
            this.f92402a = aVar;
            this.f92403b = gVar;
            this.f92404c = x3Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new C1764a(this.f92402a, this.f92403b, this.f92404c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C1764a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            if (this.f92404c.getF182175a().f92415h) {
                this.f92402a.invoke();
                this.f92403b.x4();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.customization.activityoptions.ActivityOptionsScreenKt$ActivityOptionsScreenRoute$2$1", f = "ActivityOptionsScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f92405a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f92406b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x3<ia0.b> f92407c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, g gVar, x3<ia0.b> x3Var, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f92405a = context;
            this.f92406b = gVar;
            this.f92407c = x3Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f92405a, this.f92406b, this.f92407c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            if (this.f92407c.getF182175a().f92413f) {
                Toast.makeText(this.f92405a, R.string.txt_error_occurred, 0).show();
                this.f92406b.x4();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class c extends q implements l<j90.b, Unit> {
        public c(Object obj) {
            super(1, obj, g.class, "onActivitySelected", "onActivitySelected(Lcom/garmin/android/apps/connectmobile/device/setup/domain/customization/model/ActivityOptionsItem;)V", 0);
        }

        @Override // e23.l
        public final Unit invoke(j90.b bVar) {
            int i14;
            int i15;
            Object value;
            Object value2;
            j90.b bVar2 = bVar;
            bVar2.getClass();
            g gVar = (g) this.receiver;
            h90.a aVar = gVar.f92424b;
            p2 p2Var = gVar.f92427e;
            boolean z14 = bVar2.f97790c;
            if (!bVar2.f97789b) {
                List<j90.b> list = ((ia0.b) p2Var.getValue()).f92408a;
                if (list == null || !list.isEmpty()) {
                    i14 = 0;
                    for (j90.b bVar3 : list) {
                        if (bVar3.f97789b || bVar3.f97790c) {
                            i14++;
                            if (i14 < 0) {
                                x.p();
                                throw null;
                            }
                        }
                    }
                } else {
                    i14 = 0;
                }
                if (i14 != aVar.f82514d) {
                    List<j90.b> list2 = ((ia0.b) p2Var.getValue()).f92408a;
                    if (list2 == null || !list2.isEmpty()) {
                        i15 = 0;
                        for (j90.b bVar4 : list2) {
                            if (bVar4.f97789b || bVar4.f97790c) {
                                i15++;
                                if (i15 < 0) {
                                    x.p();
                                    throw null;
                                }
                            }
                        }
                    } else {
                        i15 = 0;
                    }
                    if (i15 != aVar.f82513c) {
                        gVar.y4(j90.b.a(bVar2, !z14));
                    } else if (z14) {
                        gVar.y4(j90.b.a(bVar2, false));
                    } else {
                        do {
                            value = p2Var.getValue();
                        } while (!p2Var.b(value, ia0.b.a((ia0.b) value, null, true, false, false, false, false, 253)));
                    }
                } else if (z14) {
                    do {
                        value2 = p2Var.getValue();
                    } while (!p2Var.b(value2, ia0.b.a((ia0.b) value2, null, false, true, false, false, false, 251)));
                } else {
                    gVar.y4(j90.b.a(bVar2, true));
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class d extends q implements e23.a<Unit> {
        public d(Object obj) {
            super(0, obj, g.class, "dismissMinimumLimitReached", "dismissMinimumLimitReached()V", 0);
        }

        @Override // e23.a
        public final Unit invoke() {
            Object value;
            p2 p2Var = ((g) this.receiver).f92427e;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, ia0.b.a((ia0.b) value, null, false, false, false, false, false, 251)));
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class e extends q implements e23.a<Unit> {
        public e(Object obj) {
            super(0, obj, g.class, "dismissMaximumLimitReached", "dismissMaximumLimitReached()V", 0);
        }

        @Override // e23.a
        public final Unit invoke() {
            Object value;
            p2 p2Var = ((g) this.receiver).f92427e;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, ia0.b.a((ia0.b) value, null, false, false, false, false, false, 253)));
            return Unit.INSTANCE;
        }
    }

    public static final void a(ia0.b bVar, l<? super j90.b, Unit> lVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, boolean z14, e23.a<Unit> aVar4, m mVar, int i14) {
        int i15;
        e23.a<Unit> aVar5;
        e23.a<Unit> aVar6;
        e23.a<Unit> aVar7;
        o0 o0Var;
        o0 o0Var2;
        int i16;
        boolean z15;
        o0 o0VarE = mVar.E(2006378090);
        int i17 = 4;
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(bVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(lVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            aVar5 = aVar;
            i15 |= o0VarE.r(aVar5) ? 256 : 128;
        } else {
            aVar5 = aVar;
        }
        if ((i14 & 3072) == 0) {
            aVar6 = aVar2;
            i15 |= o0VarE.r(aVar6) ? 2048 : 1024;
        } else {
            aVar6 = aVar2;
        }
        if ((i14 & 24576) == 0) {
            aVar7 = aVar3;
            i15 |= o0VarE.r(aVar7) ? 16384 : 8192;
        } else {
            aVar7 = aVar3;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.h(z14) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i15 |= o0VarE.r(aVar4) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (o0VarE.n(i15 & 1, (599187 & i15) != 599186)) {
            x1 x1Var = n.f135158a;
            if (bVar.f92410c) {
                o0VarE.C(-1049823205);
                i16 = R.string.lbl_ok;
                e23.a<Unit> aVar8 = aVar5;
                z15 = false;
                c1.f110940a.a(false, y.Q(o0VarE, R.string.activity_options_bic_select_activity_title), y.Q(o0VarE, R.string.activity_options_bic_select_activity_message), null, null, y.Q(o0VarE, R.string.lbl_ok), false, false, aVar8, null, null, o0VarE, (i15 << 18) & 234881024, 0, 1753);
                o0Var2 = o0VarE;
                o0Var2.g0(false);
            } else {
                o0Var2 = o0VarE;
                i16 = R.string.lbl_ok;
                z15 = false;
                o0Var2.C(-1049487816);
                o0Var2.g0(false);
            }
            if (bVar.f92409b) {
                o0Var2.C(-1049430559);
                o0 o0Var3 = o0Var2;
                c1.f110940a.a(false, y.Q(o0Var2, R.string.activity_options_bic_limitation_title), y.Q(o0Var2, R.string.activity_options_bic_limitation_description), null, null, y.Q(o0Var2, i16), false, false, aVar6, null, null, o0Var3, (i15 << 15) & 234881024, 0, 1753);
                o0Var2 = o0Var3;
                o0Var2.g0(z15);
            } else {
                o0Var2.C(-1049100936);
                o0Var2.g0(z15);
            }
            String strQ = y.Q(o0Var2, R.string.activity_options_bic_title);
            s62.a.f157643a.getClass();
            u4.d dVarA = u62.a.a(t62.a.f162797a);
            boolean z16 = bVar.f92414g;
            String strQ2 = y.Q(o0Var2, R.string.lbl_next);
            z3.e eVarC = z3.f.c(317475690, new hv0.d(i17, bVar, lVar), o0Var2);
            int i18 = i15 << 6;
            o0 o0Var4 = o0Var2;
            da0.p.b("device_customization_activity_options_screen", strQ, dVarA, null, null, strQ2, aVar7, z14, null, null, false, null, null, false, z16, aVar4, null, null, null, null, null, eVarC, o0Var4, (3670016 & i18) | 6 | (i18 & 29360128), (i15 >> 3) & 458752, 384, 4144920);
            o0Var = o0Var4;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n9(bVar, lVar, aVar, aVar2, aVar3, z14, aVar4, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x007b  */
    /* JADX WARN: Code duplicated, block: B:43:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:48:0x0131  */
    /* JADX WARN: Code duplicated, block: B:53:0x0155  */
    /* JADX WARN: Code duplicated, block: B:58:0x0172  */
    /* JADX WARN: Code duplicated, block: B:63:0x0190  */
    /* JADX WARN: Code duplicated, block: B:68:0x01ad  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(long j8, h90.a aVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, m mVar, int i14) {
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        o0 o0VarE = mVar.E(-1266663865);
        int i15 = i14 | (o0VarE.l(j8) ? 4 : 2) | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.r(aVar2) ? 256 : 128) | (o0VarE.r(aVar3) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            boolean zR = ((i15 & 14) == 4) | o0VarE.r(aVar);
            Object objQ = o0VarE.q();
            m.a aVar4 = m.f135153a;
            if (zR) {
                objQ = new a6.g(aVar, j8, 6);
                o0VarE.K(objQ);
            } else {
                aVar4.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new a6.g(aVar, j8, 6);
                    o0VarE.K(objQ);
                }
            }
            e23.a aVar5 = (e23.a) objQ;
            o0VarE.L(-1614864554);
            v9.a.f176280a.getClass();
            ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(o0VarE);
            if (viewModelStoreOwnerA == null) {
                h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(s0.f105811a.b(g.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(o0VarE, 0), aVar5);
            o0VarE.g0(false);
            g gVar = (g) u1VarResolveViewModel;
            p1 p1VarC = s9.c.c(gVar.f92428f, o0VarE);
            p1 p1VarC2 = s9.c.c(gVar.f92429g, o0VarE);
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Boolean boolValueOf = Boolean.valueOf(((ia0.b) p1VarC.getF182175a()).f92415h);
            boolean zB = o0VarE.B(p1VarC) | ((i15 & 896) == 256) | o0VarE.r(gVar);
            Object objQ2 = o0VarE.q();
            if (zB) {
                objQ2 = new C1764a(aVar2, gVar, p1VarC, null);
                o0VarE.K(objQ2);
            } else {
                aVar4.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new C1764a(aVar2, gVar, p1VarC, null);
                    o0VarE.K(objQ2);
                }
            }
            l0.e((p) objQ2, boolValueOf, o0VarE);
            Boolean boolValueOf2 = Boolean.valueOf(((ia0.b) p1VarC.getF182175a()).f92413f);
            boolean zB2 = o0VarE.B(p1VarC) | o0VarE.r(context) | o0VarE.r(gVar);
            Object objQ3 = o0VarE.q();
            if (zB2) {
                objQ3 = new b(context, gVar, p1VarC, null);
                o0VarE.K(objQ3);
            } else {
                aVar4.getClass();
                if (objQ3 == m.a.f135155b) {
                    objQ3 = new b(context, gVar, p1VarC, null);
                    o0VarE.K(objQ3);
                }
            }
            l0.e((p) objQ3, boolValueOf2, o0VarE);
            ia0.b bVar = (ia0.b) p1VarC.getF182175a();
            boolean zR2 = o0VarE.r(gVar);
            Object objQ4 = o0VarE.q();
            if (zR2) {
                objQ4 = new c(gVar);
                o0VarE.K(objQ4);
            } else {
                aVar4.getClass();
                if (objQ4 == m.a.f135155b) {
                    objQ4 = new c(gVar);
                    o0VarE.K(objQ4);
                }
            }
            l lVar = (l) ((k23.g) objQ4);
            boolean zR3 = o0VarE.r(gVar);
            Object objQ5 = o0VarE.q();
            if (zR3) {
                objQ5 = new d(gVar);
                o0VarE.K(objQ5);
            } else {
                aVar4.getClass();
                if (objQ5 == m.a.f135155b) {
                    objQ5 = new d(gVar);
                    o0VarE.K(objQ5);
                }
            }
            e23.a aVar6 = (e23.a) ((k23.g) objQ5);
            boolean zR4 = o0VarE.r(gVar);
            Object objQ6 = o0VarE.q();
            if (zR4) {
                objQ6 = new e(gVar);
                o0VarE.K(objQ6);
            } else {
                aVar4.getClass();
                if (objQ6 == m.a.f135155b) {
                    objQ6 = new e(gVar);
                    o0VarE.K(objQ6);
                }
            }
            e23.a aVar7 = (e23.a) ((k23.g) objQ6);
            boolean zR5 = o0VarE.r(gVar);
            Object objQ7 = o0VarE.q();
            if (zR5) {
                objQ7 = new f2(gVar, 6);
                o0VarE.K(objQ7);
            } else {
                aVar4.getClass();
                if (objQ7 == m.a.f135155b) {
                    objQ7 = new f2(gVar, 6);
                    o0VarE.K(objQ7);
                }
            }
            a(bVar, lVar, aVar6, aVar7, (e23.a) objQ7, ((Boolean) p1VarC2.getF182175a()).booleanValue(), aVar3, o0VarE, 3670016 & (i15 << 9));
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new da0.d(j8, aVar, aVar2, aVar3, i14, 2);
        }
    }
}
