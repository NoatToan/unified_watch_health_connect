package r82;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import i3.e5;
import java.util.List;
import lc.p0;
import lc.y0;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.module.Module;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p13.h0;
import p13.j0;
import p5.k0;
import r1.u0;
import rk0.f0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f151237a;

    public /* synthetic */ e(int i14) {
        this.f151237a = i14;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        byte b14 = 0;
        switch (this.f151237a) {
            case 0:
                ((Integer) obj).intValue();
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj).intValue();
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj).intValue();
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj).intValue();
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj).intValue();
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj).intValue();
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj).intValue();
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj).intValue();
                return Unit.INSTANCE;
            case 8:
                ((Boolean) obj).booleanValue();
                return Unit.INSTANCE;
            case 9:
                ((Float) obj).floatValue();
                rb0.a aVar = rb0.a.f151536a;
                return Unit.INSTANCE;
            case 10:
                ((r1.n) obj).getClass();
                return r1.b.c(u0.d(null, 3), u0.e(null, 3));
            case 11:
                Context context = (Context) obj;
                context.getClass();
                ImageView imageView = new ImageView(context);
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                return imageView;
            case 12:
                Context context2 = (Context) obj;
                context2.getClass();
                ImageView imageView2 = new ImageView(context2);
                imageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
                return imageView2;
            case 13:
                Module module = (Module) obj;
                rc1.a aVar2 = rc1.a.f151859a;
                module.getClass();
                r72.g gVar = new r72.g(b14, 15);
                ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
                StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
                Kind kind = Kind.Factory;
                j0 j0Var = j0.f134944a;
                t0 t0Var = s0.f105811a;
                new KoinDefinition(module, e5.n(new BeanDefinition(rootScopeQualifier, t0Var.b(pc1.a.class), null, gVar, kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(qc1.a.class), null, new r72.g(b14, 16), kind, j0Var), module));
                new KoinDefinition(module, e5.n(new BeanDefinition(companion.getRootScopeQualifier(), t0Var.b(uc1.f.class), null, new r72.g(b14, 17), kind, j0Var), module));
                return Unit.INSTANCE;
            case 14:
                List list = (List) obj;
                list.getClass();
                return new sd.h((i63.c) h0.b0(list));
            case 15:
                List list2 = (List) obj;
                list2.getClass();
                return new sd.p((i63.c) h0.b0(list2));
            case 16:
                TextView textView = (TextView) obj;
                textView.getClass();
                textView.setTextAppearance(R.style.Text_Caption_Secondary);
                int dimensionPixelSize = textView.getResources().getDimensionPixelSize(R.dimen.spacing_normal);
                int dimensionPixelSize2 = textView.getResources().getDimensionPixelSize(R.dimen.spacing_micro);
                textView.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
                textView.setLayoutParams(new RecyclerView.q(-1, -2));
                return Unit.INSTANCE;
            case 17:
                TextView textView2 = (TextView) obj;
                textView2.getClass();
                textView2.setTextAppearance(R.style.Text_Body2_Primary);
                int dimensionPixelSize3 = textView2.getResources().getDimensionPixelSize(R.dimen.spacing_normal);
                int dimensionPixelSize4 = textView2.getResources().getDimensionPixelSize(R.dimen.spacing_normal);
                textView2.setPadding(dimensionPixelSize3, dimensionPixelSize4, dimensionPixelSize3, dimensionPixelSize4);
                textView2.setLayoutParams(new RecyclerView.q(-1, -2));
                return Unit.INSTANCE;
            case 18:
                TextView textView3 = (TextView) obj;
                textView3.getClass();
                textView3.setTextAppearance(R.style.Text_Overline_Secondary);
                int dimensionPixelSize5 = textView3.getResources().getDimensionPixelSize(R.dimen.spacing_normal);
                int dimensionPixelSize6 = textView3.getResources().getDimensionPixelSize(R.dimen.spacing_micro);
                textView3.setPadding(dimensionPixelSize5, dimensionPixelSize6, dimensionPixelSize5, dimensionPixelSize6);
                int dimensionPixelSize7 = textView3.getResources().getDimensionPixelSize(R.dimen.spacing_normal);
                RecyclerView.q qVar = new RecyclerView.q(-1, -2);
                qVar.setMargins(0, dimensionPixelSize7, 0, 0);
                textView3.setLayoutParams(qVar);
                return Unit.INSTANCE;
            case 19:
                ((Unit) obj).getClass();
                return Unit.INSTANCE;
            case 20:
                p0 p0Var = (p0) obj;
                k23.d<?> dVarB = s0.f105811a.b(ri1.j.class);
                p0Var.getClass();
                p0Var.f111835h = dVarB;
                p0Var.f111833f = false;
                y0 y0VarI = kg.f.i(p0Var, -1);
                y0VarI.f111914a = true;
                Unit unit = Unit.INSTANCE;
                p0Var.f111833f = true;
                p0Var.f111834g = y0VarI.f111915b;
                return Unit.INSTANCE;
            case 21:
                p0 p0Var2 = (p0) obj;
                k23.d<?> dVarB2 = s0.f105811a.b(ri1.j.class);
                p0Var2.getClass();
                p0Var2.f111835h = dVarB2;
                p0Var2.f111833f = false;
                y0 y0VarI2 = kg.f.i(p0Var2, -1);
                y0VarI2.f111914a = true;
                Unit unit2 = Unit.INSTANCE;
                p0Var2.f111833f = true;
                p0Var2.f111834g = y0VarI2.f111915b;
                return Unit.INSTANCE;
            case 22:
                ((k0) obj).getClass();
                return Unit.INSTANCE;
            case 23:
                rk0.o oVar = rk0.o.f153236a;
                ((List) obj).getClass();
                return Unit.INSTANCE;
            case 24:
                rk0.o oVar2 = rk0.o.f153236a;
                ((jk0.j) obj).getClass();
                return Unit.INSTANCE;
            case 25:
                rk0.o oVar3 = rk0.o.f153236a;
                ((List) obj).getClass();
                return Unit.INSTANCE;
            case 26:
                rk0.o oVar4 = rk0.o.f153236a;
                ((f0) obj).getClass();
                return Unit.INSTANCE;
            case 27:
                rk0.o oVar5 = rk0.o.f153236a;
                ((List) obj).getClass();
                return Unit.INSTANCE;
            case 28:
                rk0.o oVar6 = rk0.o.f153236a;
                ((jk0.j) obj).getClass();
                return Unit.INSTANCE;
            default:
                rk0.o oVar7 = rk0.o.f153236a;
                ((List) obj).getClass();
                return Unit.INSTANCE;
        }
    }
}
