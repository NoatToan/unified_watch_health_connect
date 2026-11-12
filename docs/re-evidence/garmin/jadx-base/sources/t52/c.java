package t52;

import android.content.Context;
import android.widget.ImageView;
import com.garmin.android.apps.connectmobile.workouts.presentation.benchmark.viewbinder.BenchmarkExerciseOneRepMaxView;
import com.garmin.android.gncs.NotificationConstants;
import com.google.common.base.Ascii;
import e23.l;
import i3.e5;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import k63.e;
import k63.k;
import lc.u0;
import m63.y1;
import me0.w;
import n70.a0;
import ne0.b0;
import ne0.d0;
import ne0.f0;
import ne0.i0;
import ne0.j;
import ne0.n;
import ne0.p;
import ne0.r;
import ne0.t;
import ne0.v;
import ne0.x;
import ne0.z;
import oe0.s;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;
import org.slf4j.Logger;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p13.j0;
import p13.u;
import p5.h0;
import p5.k0;
import t70.b1;
import t70.c1;
import ta0.d;
import ta0.f;
import ta0.h;
import tn2.e1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f162554a;

    public /* synthetic */ c(int i14) {
        this.f162554a = i14;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = 23;
        int i15 = 22;
        int i16 = 17;
        int i17 = 10;
        int i18 = 2;
        int i19 = 26;
        int i24 = 24;
        byte b14 = 0;
        switch (this.f162554a) {
            case 0:
                oi0.b bVar = (oi0.b) obj;
                int i25 = BenchmarkExerciseOneRepMaxView.f48406i;
                bVar.getClass();
                bVar.N();
                return Unit.INSTANCE;
            case 1:
                b1 b1Var = (b1) obj;
                b1Var.getClass();
                return b1Var.f162810a;
            case 2:
                c1 c1Var = (c1) obj;
                c1Var.getClass();
                return c1Var.f162819a;
            case 3:
                k0 k0Var = (k0) obj;
                k0Var.getClass();
                h0.h(k0Var);
                return Unit.INSTANCE;
            case 4:
                f fVar = f.f163310a;
                ((String) obj).getClass();
                return Unit.INSTANCE;
            case 5:
                f fVar2 = f.f163310a;
                ((zb0.l) obj).getClass();
                return Unit.INSTANCE;
            case 6:
                f fVar3 = f.f163310a;
                ((l90.b) obj).getClass();
                return Unit.INSTANCE;
            case 7:
                f fVar4 = f.f163310a;
                ((String) obj).getClass();
                return Unit.INSTANCE;
            case 8:
                f fVar5 = f.f163310a;
                ((zb0.l) obj).getClass();
                return Unit.INSTANCE;
            case 9:
                f fVar6 = f.f163310a;
                ((l90.b) obj).getClass();
                return Unit.INSTANCE;
            case 10:
                h hVar = h.f163340a;
                ((String) obj).getClass();
                return Unit.INSTANCE;
            case 11:
                h hVar2 = h.f163340a;
                ((l90.b) obj).getClass();
                return Unit.INSTANCE;
            case 12:
                va0.c cVar = (va0.c) obj;
                cVar.getClass();
                if (cVar instanceof va0.c.b) {
                    return ((va0.c.b) cVar).f176575a.name();
                }
                if (cVar instanceof va0.c.a) {
                    return ((va0.c.a) cVar).f176574a.f111516a;
                }
                u0.r();
                return null;
            case 13:
                l90.b bVar2 = (l90.b) obj;
                bVar2.getClass();
                return bVar2.f111516a;
            case 14:
                Context context = (Context) obj;
                context.getClass();
                ImageView imageView = new ImageView(context);
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                return imageView;
            case 15:
                Context context2 = (Context) obj;
                context2.getClass();
                ImageView imageView2 = new ImageView(context2);
                imageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
                return imageView2;
            case 16:
                Context context3 = (Context) obj;
                context3.getClass();
                ImageView imageView3 = new ImageView(context3);
                imageView3.setScaleType(ImageView.ScaleType.FIT_CENTER);
                return imageView3;
            case 17:
                Context context4 = (Context) obj;
                context4.getClass();
                ImageView imageView4 = new ImageView(context4);
                imageView4.setScaleType(ImageView.ScaleType.FIT_CENTER);
                return imageView4;
            case 18:
                k63.a aVar = (k63.a) obj;
                y1.f117048a.getClass();
                k63.a.b(aVar, NotificationConstants.KEY_DATA_MIME_TYPE, y1.f117049b);
                k63.a.b(aVar, "value", k.d("Any", new e[0]));
                return Unit.INSTANCE;
            case 19:
                Module module = (Module) obj;
                td0.b bVar3 = td0.b.f163880a;
                module.getClass();
                d dVar = new d(i14);
                ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
                Kind kind = Kind.Factory;
                j0 j0Var = j0.f134944a;
                t0 t0Var = s0.f105811a;
                new KoinDefinition(module, e5.n(new BeanDefinition(rootScopeQualifier, t0Var.b(ke0.c.class), null, dVar, kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(ke0.a.class), null, new d(15), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(ke0.b.class), null, new d(i15), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(w.class), null, new d(i24), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(n.class), null, new d(25), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(ne0.l.class), null, new d(i19), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(j.class), null, new d(27), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(b0.class), null, new d(28), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(ne0.c.class), null, new d(29), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(i0.class), null, new td0.a(b14, b14), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(r.class), null, new td0.a(b14, 1), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(t.class), null, new td0.a(b14, i18), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(p.class), null, new td0.a(b14, 3), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(z.class), null, new td0.a(b14, 4), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(x.class), null, new td0.a(b14, 5), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(v.class), null, new td0.a(b14, 6), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(d0.class), null, new td0.a(b14, 7), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(ne0.j0.class), null, new td0.a(b14, 8), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(ne0.e.class), null, new d(13), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(f0.class), null, new d(14), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(oe0.l.class), null, new d(16), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(oe0.d.class), null, new d(i16), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(s.class), null, new d(18), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(oe0.j.class), null, new d(19), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(oe0.f.class), null, new d(20), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(be0.a.class), null, new d(21), kind, j0Var), module));
                return Unit.INSTANCE;
            case 20:
                Module module2 = (Module) obj;
                tf1.a aVar2 = tf1.a.f164466a;
                module2.getClass();
                td0.a aVar3 = new td0.a(b14, 9);
                ScopeRegistry.Companion companion2 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier2 = companion2.getRootScopeQualifier();
                Kind kind2 = Kind.Singleton;
                j0 j0Var2 = j0.f134944a;
                t0 t0Var2 = s0.f105811a;
                SingleInstanceFactory<?> singleInstanceFactoryP = u0.p(new BeanDefinition(rootScopeQualifier2, t0Var2.b(vf1.b.class), null, aVar3, kind2, j0Var2), module2);
                if (module2.get_createdAtStart()) {
                    module2.prepareForCreationAtStart(singleInstanceFactoryP);
                }
                new KoinDefinition(module2, singleInstanceFactoryP);
                td0.a aVar4 = new td0.a(b14, i17);
                StringQualifier rootScopeQualifier3 = companion2.getRootScopeQualifier();
                Kind kind3 = Kind.Factory;
                new KoinDefinition(module2, e5.n(new BeanDefinition(rootScopeQualifier3, t0Var2.b(vf1.a.class), null, aVar4, kind3, j0Var2), module2));
                new KoinDefinition(module2, e5.n(new BeanDefinition(companion2.getRootScopeQualifier(), t0Var2.b(qf1.b.class), null, new td0.a(b14, 11), kind3, j0Var2), module2));
                return Unit.INSTANCE;
            case 21:
                return Float.valueOf(((Float) obj).floatValue() * 0.35f);
            case 22:
                oi0.b bVar4 = (oi0.b) obj;
                tl.a aVar5 = tl.a.f165261a;
                bVar4.getClass();
                bVar4.w();
                return Unit.INSTANCE;
            case 23:
                oi0.b bVar5 = (oi0.b) obj;
                tl.b bVar6 = tl.b.f165263a;
                bVar5.getClass();
                bVar5.w();
                return Unit.INSTANCE;
            case 24:
                ((k0) obj).getClass();
                return Unit.INSTANCE;
            case 25:
                Module module3 = (Module) obj;
                tl0.a aVar6 = tl0.a.f165270a;
                module3.getClass();
                StringQualifier stringQualifierNamed = QualifierKt.named(o70.b.GOLF_SCORE_CARD.a());
                td0.a aVar7 = new td0.a(b14, i15);
                ScopeRegistry.Companion companion3 = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier4 = companion3.getRootScopeQualifier();
                Kind kind4 = Kind.Factory;
                j0 j0Var3 = j0.f134944a;
                t0 t0Var3 = s0.f105811a;
                new KoinDefinition(module3, e5.n(new BeanDefinition(rootScopeQualifier4, t0Var3.b(a0.class), stringQualifierNamed, aVar7, kind4, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(r70.a.class), stringQualifierNamed, new td0.a(b14, i14), kind4, j0Var3), module3));
                new KoinDefinition(module3, e5.n(new BeanDefinition(companion3.getRootScopeQualifier(), t0Var3.b(r70.r.class), stringQualifierNamed, new td0.a(b14, i24), kind4, j0Var3), module3));
                return Unit.INSTANCE;
            case 26:
                oi0.b bVar7 = (oi0.b) obj;
                int i26 = tn.r.f165491f;
                bVar7.getClass();
                bVar7.U();
                return Unit.INSTANCE;
            case 27:
                DecimalFormatSymbols decimalFormatSymbols = (DecimalFormatSymbols) obj;
                decimalFormatSymbols.getClass();
                return new DecimalFormat("¤###,###,###", decimalFormatSymbols);
            case 28:
                byte[] bArr = (byte[]) obj;
                Logger logger = tn2.w.f165679d;
                bArr.getClass();
                byte[] bArr2 = (byte[]) p13.u0.c(new e1.a(-97, Ascii.DEL), new tn2.a().b(bArr));
                return p13.s.q(u.W(bArr2, new j23.l(26, 33)), u.W(bArr2, new j23.l(10, 17)));
            default:
                byte[] bArr3 = (byte[]) obj;
                Logger logger2 = tn2.w.f165679d;
                bArr3.getClass();
                return u.W(bArr3, new j23.l(24, 26));
        }
    }
}
