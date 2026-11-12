package com.google.maps.android.compose.clustering;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import b63.o;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.workouts.presentation.details.doworkout.WorkoutActivityProfileSelectionActivity;
import com.garmin.feature.garminpay.providers.gpay.ui.addcard.fragment.FitPayAddressManagementFragment;
import com.google.android.gms.maps.StreetViewPanoramaView;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;
import com.google.maps.android.clustering.ClusterItem;
import com.google.maps.android.compose.streetview.StreetViewKt;
import com.google.maps.android.compose.streetview.StreetViewPanoramaEventListeners;
import d53.i;
import e23.l;
import i3.pc;
import java.util.Map;
import lc.q0;
import lc.u;
import lc.u0;
import p005kotlin.Unit;
import p5.k0;
import x5.l0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53942a;

    public /* synthetic */ d(int i14) {
        this.f53942a = i14;
    }

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
    @Override // e23.l
    public final Object invoke(Object obj) {
        o82.g gVar;
        switch (this.f53942a) {
            case 0:
                return ClusteringKt.Clustering$lambda$7$lambda$6((ClusterItem) obj);
            case 1:
                return StreetViewKt.StreetView$lambda$3$lambda$2((StreetViewPanoramaOrientation) obj);
            case 2:
                return StreetViewKt.StreetView$lambda$5$lambda$4((StreetViewPanoramaOrientation) obj);
            case 3:
                return StreetViewKt.StreetView$lambda$10$lambda$9((StreetViewPanoramaView) obj);
            case 4:
                return StreetViewPanoramaEventListeners.onClick_delegate$lambda$0((StreetViewPanoramaOrientation) obj);
            case 5:
                return StreetViewPanoramaEventListeners.onLongClick_delegate$lambda$1((StreetViewPanoramaOrientation) obj);
            case 6:
                cp2.a.f54916h.error("Something went wrong when processing card details item click event (" + ((Throwable) obj) + ")");
                return Unit.INSTANCE;
            case 7:
                FitPayAddressManagementFragment.b.a(FitPayAddressManagementFragment.f51413t).error("Something went wrong when processing submit verification item click event (" + ((Throwable) obj) + ")");
                return Unit.INSTANCE;
            case 8:
                cp2.g.f54954h.error("Something went wrong when processing payment card item click event (" + ((Throwable) obj) + ")");
                return Unit.INSTANCE;
            case 9:
                Context context = (Context) obj;
                context.getClass();
                LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
                layoutInflaterFrom.getClass();
                return layoutInflaterFrom.inflate(R.layout.climb_details_top_section, (ViewGroup) null);
            case 10:
                oi0.b bVar = (oi0.b) obj;
                bVar.getClass();
                bVar.a();
                return Unit.INSTANCE;
            case 11:
                ((k0) obj).getClass();
                return Unit.INSTANCE;
            case 12:
                ((k0) obj).getClass();
                return Unit.INSTANCE;
            case 13:
                ((k0) obj).getClass();
                return Unit.INSTANCE;
            case 14:
                ((k0) obj).getClass();
                return Unit.INSTANCE;
            case 15:
                zd1.a.C3809a c3809a = (zd1.a.C3809a) obj;
                c3809a.getClass();
                c3809a.a(g22.l.d(o.INSTANCE));
                zd1.e eVar = zd1.e.f204226a;
                eVar.getClass();
                zd1.c cVar = zd1.c.f204224a;
                Intent intent = c3809a.f204222a;
                if (eVar.equals(zd1.d.f204225a)) {
                    gVar = o82.g.f130850c;
                } else {
                    if (!eVar.equals(eVar)) {
                        u0.r();
                        return null;
                    }
                    gVar = o82.g.f130851d;
                }
                cVar.getClass();
                gVar.getClass();
                intent.putExtra("EXTRA_INITIAL_INTERVAL_TYPE", gVar);
                return Unit.INSTANCE;
            case 16:
                l0 l0Var = (l0) obj;
                l0Var.getClass();
                return l0Var;
            case 17:
                i iVar = (i) obj;
                iVar.getClass();
                return iVar.getValue().concat("$s");
            case 18:
                u uVar = (u) obj;
                cy1.b bVar2 = cy1.b.f56796a;
                uVar.getClass();
                uVar.b(q0.f111838c);
                uVar.a(0);
                uVar.f111877a.f111872b = false;
                return Unit.INSTANCE;
            case 19:
                u uVar2 = (u) obj;
                cy1.f fVar = cy1.f.f56801a;
                uVar2.getClass();
                uVar2.b(q0.f111838c);
                uVar2.a(0);
                return Unit.INSTANCE;
            case 20:
                return new d4.d((Map) obj);
            case 21:
                return obj;
            case 22:
                pc pcVar = (pc) obj;
                pcVar.getClass();
                return Boolean.valueOf(pcVar != pc.Hidden);
            case 23:
                oi0.b bVar3 = (oi0.b) obj;
                int i14 = d52.e.f57567c;
                bVar3.getClass();
                bVar3.a();
                return Unit.INSTANCE;
            case 24:
                oi0.b bVar4 = (oi0.b) obj;
                int i15 = d52.e.f57567c;
                bVar4.getClass();
                bVar4.a();
                return Unit.INSTANCE;
            case 25:
                oi0.b bVar5 = (oi0.b) obj;
                int i16 = d52.e.f57567c;
                bVar5.getClass();
                bVar5.a();
                return Unit.INSTANCE;
            case 26:
                oi0.b bVar6 = (oi0.b) obj;
                bVar6.getClass();
                bVar6.y();
                bVar6.g();
                return Unit.INSTANCE;
            case 27:
                Context context2 = (Context) obj;
                context2.getClass();
                return LayoutInflater.from(context2).inflate(R.layout.fragment_acclimation_report_with_chart_no_nested_scroll, (ViewGroup) null);
            case 28:
                String str = (String) obj;
                WorkoutActivityProfileSelectionActivity.b bVar7 = WorkoutActivityProfileSelectionActivity.f48559a;
                str.getClass();
                return str;
            default:
                oi0.b bVar8 = (oi0.b) obj;
                bVar8.getClass();
                bVar8.V();
                return Unit.INSTANCE;
        }
    }
}
