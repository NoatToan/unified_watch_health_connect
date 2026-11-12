package lr2;

import android.content.DialogInterface;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.dashboard.data.datasource.d2;
import com.garmin.android.apps.connectmobile.dashboard.data.datasource.g2;
import com.garmin.android.apps.connectmobile.dashboard.data.datasource.h2;
import com.garmin.android.apps.connectmobile.dashboard.data.datasource.j2;
import com.garmin.android.apps.connectmobile.dashboard.data.datasource.k2;
import com.garmin.android.apps.connectmobile.dashboard.data.datasource.y0;
import com.garmin.feature.garminpay.ui.devicesettings.LostWatchActivity;
import gl1.y;
import i3.i7;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.scope.Scope;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p3.x1;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class o implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f114425a;

    public /* synthetic */ o(int i14) {
        this.f114425a = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f114425a) {
            case 0:
                DialogInterface dialogInterface = (DialogInterface) obj;
                ((Integer) obj2).intValue();
                LostWatchActivity.a aVar = LostWatchActivity.f52015j;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                return Unit.INSTANCE;
            case 1:
                DialogInterface dialogInterface2 = (DialogInterface) obj;
                ((Integer) obj2).intValue();
                LostWatchActivity.a aVar2 = LostWatchActivity.f52015j;
                dialogInterface2.getClass();
                dialogInterface2.dismiss();
                return Unit.INSTANCE;
            case 2:
                DialogInterface dialogInterface3 = (DialogInterface) obj;
                ((Integer) obj2).intValue();
                LostWatchActivity.a aVar3 = LostWatchActivity.f52015j;
                dialogInterface3.getClass();
                dialogInterface3.dismiss();
                return Unit.INSTANCE;
            case 3:
                DialogInterface dialogInterface4 = (DialogInterface) obj;
                ((Integer) obj2).intValue();
                LostWatchActivity.a aVar4 = LostWatchActivity.f52015j;
                dialogInterface4.getClass();
                dialogInterface4.dismiss();
                return Unit.INSTANCE;
            case 4:
                DialogInterface dialogInterface5 = (DialogInterface) obj;
                ((Integer) obj2).intValue();
                LostWatchActivity.a aVar5 = LostWatchActivity.f52015j;
                dialogInterface5.getClass();
                dialogInterface5.dismiss();
                return Unit.INSTANCE;
            case 5:
                DialogInterface dialogInterface6 = (DialogInterface) obj;
                ((Integer) obj2).intValue();
                LostWatchActivity.a aVar6 = LostWatchActivity.f52015j;
                dialogInterface6.getClass();
                dialogInterface6.dismiss();
                return Unit.INSTANCE;
            case 6:
                float fFloatValue = ((Float) obj).floatValue();
                com.garmin.android.library.mapsdkadapter.i.d dVar = (com.garmin.android.library.mapsdkadapter.i.d) obj2;
                lt1.b bVar = lt1.b.f114858a;
                dVar.getClass();
                int[] iArr = lt1.b.a.f114859a;
                float f14 = iArr[dVar.ordinal()] == 1 ? 11.0f : 10.0f;
                float f15 = iArr[dVar.ordinal()] == 1 ? 5.0f : 2.0f;
                float f16 = (fFloatValue - f14) * 0.6f;
                if (f16 < 0.0f) {
                    f16 = 0.0f;
                }
                return Float.valueOf(f15 + f16);
            case 7:
                ((Float) obj).floatValue();
                com.garmin.android.library.mapsdkadapter.i.d dVar2 = (com.garmin.android.library.mapsdkadapter.i.d) obj2;
                lt1.b bVar2 = lt1.b.f114858a;
                dVar2.getClass();
                return Float.valueOf(lt1.b.a.f114859a[dVar2.ordinal()] == 1 ? 4.0f : 2.0f);
            case 8:
                return ((m3.s) obj2).f116300a.e();
            case 9:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                m30.h hVar = m30.h.f116346a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    i7.a(n5.c.a(R.drawable.icon_back_arrow, mVar, 0), y.Q(mVar, R.string.common_button_back), null, 0L, mVar, 0, 12);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 10:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                m30.i iVar = m30.i.f116348a;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    i7.a(n5.c.a(R.drawable.revert, mVar2, 0), y.Q(mVar2, R.string.common_undo), null, 0L, mVar2, 0, 12);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 11:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                m30.i iVar2 = m30.i.f116348a;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    i7.a(n5.c.a(R.drawable.overflow, mVar3, 0), y.Q(mVar3, R.string.lbl_course_options_menu), null, 0L, mVar3, 0, 12);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 12:
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                m30.j jVar = m30.j.f116351a;
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    i7.a(n5.c.a(R.drawable.icon_back_arrow, mVar4, 0), y.Q(mVar4, R.string.common_button_back), null, 0L, mVar4, 0, 12);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 13:
                p3.m mVar5 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                m30.k kVar = m30.k.f116353a;
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    i7.a(n5.c.a(R.drawable.revert, mVar5, 0), y.Q(mVar5, R.string.common_undo), null, 0L, mVar5, 0, 12);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 14:
                p3.m mVar6 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                m30.k kVar2 = m30.k.f116353a;
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = p3.n.f135158a;
                    i7.a(n5.c.a(R.drawable.overflow, mVar6, 0), y.Q(mVar6, R.string.lbl_course_options_menu), null, 0L, mVar6, 0, 12);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 15:
                m53.b.a aVar7 = m53.b.f116784e;
                ((m53.a) obj).getClass();
                ((m53.a) obj2).getClass();
                return Boolean.TRUE;
            case 16:
                m53.b.a aVar8 = m53.b.f116784e;
                ((m53.a) obj).getClass();
                ((m53.a) obj2).getClass();
                return Boolean.TRUE;
            case 17:
                int i14 = m53.c.f116789e;
                ((m53.a) obj).getClass();
                ((m53.a) obj2).getClass();
                return Boolean.TRUE;
            case 18:
                int i15 = m53.c.f116789e;
                ((m53.a) obj).getClass();
                ((m53.a) obj2).getClass();
                return Boolean.TRUE;
            case 19:
                ParametersHolder parametersHolder = (ParametersHolder) obj2;
                m70.a aVar9 = m70.a.f117060a;
                ((Scope) obj).getClass();
                parametersHolder.getClass();
                return new y70.a(new n70.m((r53.i) parametersHolder.elementAt(0, s0.f105811a.b(r53.i.class)), o70.f.ACTIVITIES_AND_WORKOUTS));
            case 20:
                ParametersHolder parametersHolder2 = (ParametersHolder) obj2;
                m70.a aVar10 = m70.a.f117060a;
                ((Scope) obj).getClass();
                parametersHolder2.getClass();
                return new s70.a((y70.a) parametersHolder2.elementAt(0, s0.f105811a.b(y70.a.class)));
            case 21:
                Scope scope = (Scope) obj;
                m70.e eVar = m70.e.f117065a;
                scope.getClass();
                ((ParametersHolder) obj2).getClass();
                t0 t0Var = s0.f105811a;
                return new y0((f12.l) scope.get((k23.d<?>) t0Var.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (hd1.a) scope.get((k23.d<?>) t0Var.b(hd1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, 4, null);
            case 22:
                Scope scope2 = (Scope) obj;
                m70.e eVar2 = m70.e.f117065a;
                scope2.getClass();
                ((ParametersHolder) obj2).getClass();
                fm0.a aVar11 = fm0.a.f72093a;
                fm0.a.EnumC1466a enumC1466a = fm0.a.EnumC1466a.Disk;
                aVar11.getClass();
                return new g2(fm0.a.c(enumC1466a), (f12.l) scope2.get((k23.d<?>) s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 23:
                Scope scope3 = (Scope) obj;
                m70.e eVar3 = m70.e.f117065a;
                scope3.getClass();
                ((ParametersHolder) obj2).getClass();
                t0 t0Var2 = s0.f105811a;
                return new d2((f12.l) scope3.get((k23.d<?>) t0Var2.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (h2) scope3.get((k23.d<?>) t0Var2.b(h2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (k2) scope3.get((k23.d<?>) t0Var2.b(k2.class), QualifierKt.named(j2.CACHE.f33246a), (e23.a<? extends ParametersHolder>) null), (k2) scope3.get((k23.d<?>) t0Var2.b(k2.class), QualifierKt.named(j2.SERVER.f33246a), (e23.a<? extends ParametersHolder>) null));
            case 24:
                m70.e eVar4 = m70.e.f117065a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                f12.l.f68084a.getClass();
                return f12.l.a.a();
            case 25:
                Scope scope4 = (Scope) obj;
                m70.e eVar5 = m70.e.f117065a;
                scope4.getClass();
                ((ParametersHolder) obj2).getClass();
                return new com.garmin.android.apps.connectmobile.dashboard.data.datasource.b((ff2.c) scope4.get((k23.d<?>) s0.f105811a.b(ff2.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 26:
                m70.e eVar6 = m70.e.f117065a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return (fu.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, fu.a.class, new c83.h.a[0], null, null, null, 120);
            case 27:
                Scope scope5 = (Scope) obj;
                m70.e eVar7 = m70.e.f117065a;
                scope5.getClass();
                ((ParametersHolder) obj2).getClass();
                return new fu.c((fu.a) scope5.get((k23.d<?>) s0.f105811a.b(fu.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 28:
                m70.e eVar8 = m70.e.f117065a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return l70.b.f110596a;
            default:
                m70.e eVar9 = m70.e.f117065a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return (fu.d) ez0.b.a(ez0.b.f67468a, ez0.c.GC, fu.d.class, new c83.h.a[0], null, null, null, 120);
        }
    }
}
