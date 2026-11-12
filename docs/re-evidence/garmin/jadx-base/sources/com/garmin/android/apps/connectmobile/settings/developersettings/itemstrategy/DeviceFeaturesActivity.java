package com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import c2.b0;
import c2.x2;
import c2.y;
import c2.z;
import ca0.j1;
import com.garmin.android.apps.connectmobile.settings.findmydevice.presentation.FindMyDeviceActivity;
import com.garmin.android.apps.connectmobile.setup.presentation.RecordActivitySettingsActivity;
import e23.p;
import h4.r;
import h5.e0;
import i3.ff;
import i3.hf;
import i3.mh;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import l72.p2;
import l72.r1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.p0;
import p3.p1;
import p3.x3;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u001b\u0010\u000e\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0019²\u0006\u0012\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\nX\u008a\u0084\u0002²\u0006\f\u0010\u0013\u001a\u00020\u00128\nX\u008a\u0084\u0002²\u0006\f\u0010\u0015\u001a\u00020\u00148\nX\u008a\u0084\u0002²\u0006\f\u0010\u0016\u001a\u00020\u00148\nX\u008a\u0084\u0002²\u0006\f\u0010\u0017\u001a\u00020\u00148\nX\u008a\u0084\u0002²\u0006\f\u0010\u0018\u001a\u00020\u00148\nX\u008a\u0084\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/developersettings/itemstrategy/DeviceFeaturesActivity;", "Lcom/garmin/android/apps/connectmobile/d;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/garmin/android/apps/connectmobile/settings/developersettings/itemstrategy/DeviceFeaturesViewModel;", "viewModel$delegate", "Lo13/l;", "getViewModel", "()Lcom/garmin/android/apps/connectmobile/settings/developersettings/itemstrategy/DeviceFeaturesViewModel;", "viewModel", "", "Lsd2/f;", "devices", "Lcom/garmin/android/apps/connectmobile/settings/developersettings/itemstrategy/DeviceFeatureUiState;", "uiState", "", "locationAvailable", "preciseLocationAllowed", "backgroundLocationAllowed", "locationServiceEnabled", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class DeviceFeaturesActivity extends com.garmin.android.apps.connectmobile.d {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final o13.l viewModel;

    public DeviceFeaturesActivity() {
        final e23.a aVar = null;
        this.viewModel = new w1(s0.f105811a.b(DeviceFeaturesViewModel.class), new e23.a<y1>() { // from class: com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.DeviceFeaturesActivity$special$$inlined$viewModels$default$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // e23.a
            public final y1 invoke() {
                return this.getF189591b();
            }
        }, new e23.a<x1.c>() { // from class: com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.DeviceFeaturesActivity$special$$inlined$viewModels$default$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // e23.a
            public final x1.c invoke() {
                return this.getDefaultViewModelProviderFactory();
            }
        }, new e23.a<CreationExtras>() { // from class: com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.DeviceFeaturesActivity$special$$inlined$viewModels$default$3
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // e23.a
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                e23.a aVar2 = aVar;
                return (aVar2 == null || (creationExtras = (CreationExtras) aVar2.invoke()) == null) ? this.getDefaultViewModelCreationExtras() : creationExtras;
            }
        });
    }

    private final DeviceFeaturesViewModel getViewModel() {
        return (DeviceFeaturesViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(DeviceFeaturesActivity deviceFeaturesActivity, m mVar, int i14) {
        int i15 = 0;
        if (mVar.n(i14 & 1, (i14 & 3) != 2)) {
            p3.x1 x1Var = n.f135158a;
            z02.b.a(false, null, null, null, false, z3.f.c(2135792662, new g(deviceFeaturesActivity, i15), mVar), mVar, 196608, 31);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0$0(DeviceFeaturesActivity deviceFeaturesActivity, m mVar, int i14) {
        int i15 = 1;
        int i16 = 2;
        if (mVar.n(i14 & 1, (i14 & 3) != 2)) {
            p3.x1 x1Var = n.f135158a;
            z02.d.a(false, z3.f.c(-626113103, new g(deviceFeaturesActivity, i15), mVar), null, null, null, z3.f.c(-528633811, new g(deviceFeaturesActivity, i16), mVar), mVar, 196656, 29);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:12:0x0025  */
    public static final Unit onCreate$lambda$0$0$0(DeviceFeaturesActivity deviceFeaturesActivity, m mVar, int i14) {
        if (mVar.n(i14 & 1, (i14 & 3) != 2)) {
            p3.x1 x1Var = n.f135158a;
            boolean zR = mVar.r(deviceFeaturesActivity);
            Object objQ = mVar.q();
            if (zR) {
                objQ = new c32.k(deviceFeaturesActivity, 22);
                mVar.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new c32.k(deviceFeaturesActivity, 22);
                    mVar.K(objQ);
                }
            }
            z02.f.c(6, 54, null, (e23.a) objQ, null, "Yogi features", mVar, null);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0$0$0$0$0(DeviceFeaturesActivity deviceFeaturesActivity) {
        deviceFeaturesActivity.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0$0$1(DeviceFeaturesActivity deviceFeaturesActivity, m mVar, int i14) {
        int i15 = 0;
        if (mVar.n(i14 & 1, (i14 & 3) != 2)) {
            p3.x1 x1Var = n.f135158a;
            Context context = (Context) mVar.A(AndroidCompositionLocals_androidKt.f6042b);
            p1 p1VarC = s9.c.c(deviceFeaturesActivity.getViewModel().getDevices(), mVar);
            p1 p1VarC2 = s9.c.c(deviceFeaturesActivity.getViewModel().getUiState(), mVar);
            r.a aVar = r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, mVar, 0);
            int iHashCode = Long.hashCode(mVar.getU());
            i2 i2VarX = mVar.x();
            r rVarC = h4.k.c(aVar, mVar);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (mVar.F() == null) {
                p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar2);
            } else {
                mVar.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, mVar);
            b4.c(h5.g.a.f81809f, i2VarX, mVar);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, mVar);
            b0 b0Var = b0.f22601a;
            r1.b("ENABLE ALL DEVICES", z3.f.c(-36060356, new d(deviceFeaturesActivity, p1VarC2, 3), mVar), mVar, 54, 0);
            r1.b("FORCE LIVE ACTIVITY BASIC FLOW", z3.f.c(1643777253, new d(deviceFeaturesActivity, p1VarC2, i15), mVar), mVar, 54, 0);
            r1.b("Find My Device", z3.f.c(-2079960700, new e(deviceFeaturesActivity, context, p1VarC), mVar), mVar, 54, 0);
            r1.b("Record an activity", z3.f.c(-1508731357, new br2.a(context, 5), mVar), mVar, 54, 0);
            r1.b("Reset activity recording onboarding", z3.f.c(-937502014, new e(p1VarC, deviceFeaturesActivity, context), mVar), mVar, 54, 0);
            mVar.y();
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private static final List<sd2.f> onCreate$lambda$0$0$1$0(x3<? extends List<? extends sd2.f>> x3Var) {
        return (List) x3Var.getF182175a();
    }

    private static final DeviceFeatureUiState onCreate$lambda$0$0$1$1(x3<DeviceFeatureUiState> x3Var) {
        return x3Var.getF182175a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0$0$1$2$0(DeviceFeaturesActivity deviceFeaturesActivity, x3 x3Var, m mVar, int i14) {
        int i15 = 2;
        if (mVar.n(i14 & 1, (i14 & 3) != 2)) {
            p3.x1 x1Var = n.f135158a;
            p2.f111205a.h("Enable all paired devices in the app", "", null, null, null, false, false, null, z3.f.c(1485593135, new d(deviceFeaturesActivity, x3Var, i15), mVar), null, null, mVar, 100663350, 0, 1788);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:12:0x002d  */
    public static final Unit onCreate$lambda$0$0$1$2$0$0(DeviceFeaturesActivity deviceFeaturesActivity, x3 x3Var, m mVar, int i14) {
        int i15 = 1;
        if (mVar.n(i14 & 1, (i14 & 3) != 2)) {
            p3.x1 x1Var = n.f135158a;
            boolean zIsAllPairedDevicesEnabled = onCreate$lambda$0$0$1$1(x3Var).isAllPairedDevicesEnabled();
            boolean zR = mVar.r(deviceFeaturesActivity);
            Object objQ = mVar.q();
            if (zR) {
                objQ = new f(deviceFeaturesActivity, i15);
                mVar.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new f(deviceFeaturesActivity, i15);
                    mVar.K(objQ);
                }
            }
            hf.a(zIsAllPairedDevicesEnabled, (e23.l) objQ, null, false, d92.c.a(ff.f88115a, mVar), mVar, 0, 92);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0$0$1$2$0$0$0$0(DeviceFeaturesActivity deviceFeaturesActivity, boolean z14) {
        deviceFeaturesActivity.getViewModel().enableAllPairedDevicesForActivityRecording(z14);
        deviceFeaturesActivity.getViewModel().getSupportedPairedDevices();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0$0$1$2$1(DeviceFeaturesActivity deviceFeaturesActivity, x3 x3Var, m mVar, int i14) {
        int i15 = 1;
        if (mVar.n(i14 & 1, (i14 & 3) != 2)) {
            p3.x1 x1Var = n.f135158a;
            p2.f111205a.h("Force basic flow in Live Activity on GC+ account", "", null, null, null, false, false, null, z3.f.c(-631065832, new d(deviceFeaturesActivity, x3Var, i15), mVar), null, null, mVar, 100663350, 0, 1788);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:12:0x002e  */
    public static final Unit onCreate$lambda$0$0$1$2$1$0(DeviceFeaturesActivity deviceFeaturesActivity, x3 x3Var, m mVar, int i14) {
        int i15 = 0;
        if (mVar.n(i14 & 1, (i14 & 3) != 2)) {
            p3.x1 x1Var = n.f135158a;
            boolean forceBasicFlowEnabled = onCreate$lambda$0$0$1$1(x3Var).getForceBasicFlowEnabled();
            boolean zR = mVar.r(deviceFeaturesActivity);
            Object objQ = mVar.q();
            if (zR) {
                objQ = new f(deviceFeaturesActivity, i15);
                mVar.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new f(deviceFeaturesActivity, i15);
                    mVar.K(objQ);
                }
            }
            hf.a(forceBasicFlowEnabled, (e23.l) objQ, null, false, d92.c.a(ff.f88115a, mVar), mVar, 0, 92);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0$0$1$2$1$0$0$0(DeviceFeaturesActivity deviceFeaturesActivity, boolean z14) {
        deviceFeaturesActivity.getViewModel().setForceBasicFlowEnabled(z14);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:18:0x0094  */
    /* JADX WARN: Code duplicated, block: B:24:0x018b  */
    public static final Unit onCreate$lambda$0$0$1$2$2(DeviceFeaturesActivity deviceFeaturesActivity, Context context, x3 x3Var, m mVar, int i14) {
        m.a aVar;
        if (mVar.n(i14 & 1, (i14 & 3) != 2)) {
            p3.x1 x1Var = n.f135158a;
            p1 p1VarC = s9.c.c(deviceFeaturesActivity.getViewModel().getLocationAvailableState(), mVar);
            mVar.C(-1682433863);
            Iterator<T> it = onCreate$lambda$0$0$1$0(x3Var).iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                aVar = m.f135153a;
                if (!zHasNext) {
                    break;
                }
                sd2.f fVar = (sd2.f) it.next();
                p2 p2Var = p2.f111205a;
                r.a aVar2 = r.S;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                r rVarA = c2.l.A(aVar2, 0.0f, j92.b.f97899b.f97918c, 1);
                StringBuilder sbJ = com.nimbusds.jose.shaded.gson.internal.a.j(fVar.getUnitID(), "Find My Device (", fVar.getDisplayName(), " - ");
                sbJ.append(")");
                String string = sbJ.toString();
                p<m, Integer, Unit> lambda$647636764$app_vanillaRelease = onCreate$lambda$0$0$1$2$2$0(p1VarC) ? null : ComposableSingletons$DeviceFeaturesActivityKt.INSTANCE.getLambda$647636764$app_vanillaRelease();
                boolean zR = mVar.r(context) | mVar.r(fVar);
                Object objQ = mVar.q();
                if (zR) {
                    objQ = new j1(10, context, fVar);
                    mVar.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new j1(10, context, fVar);
                        mVar.K(objQ);
                    }
                }
                p2Var.g(string, rVarA, null, lambda$647636764$app_vanillaRelease, null, false, false, (e23.a) objQ, mVar, 0, 244);
            }
            mVar.f();
            p1 p1VarC2 = s9.c.c(deviceFeaturesActivity.getViewModel().getPreciseLocationAllowedState(), mVar);
            p1 p1VarC3 = s9.c.c(deviceFeaturesActivity.getViewModel().getBackgroundLocationAllowedState(), mVar);
            p1 p1VarC4 = s9.c.c(deviceFeaturesActivity.getViewModel().getLocationServiceEnabledState(), mVar);
            String strValueOf = String.valueOf(onCreate$lambda$0$0$1$2$2$2(p1VarC2));
            Locale locale = Locale.ROOT;
            String upperCase = strValueOf.toUpperCase(locale);
            upperCase.getClass();
            String upperCase2 = String.valueOf(onCreate$lambda$0$0$1$2$2$3(p1VarC3)).toUpperCase(locale);
            upperCase2.getClass();
            String upperCase3 = String.valueOf(onCreate$lambda$0$0$1$2$2$4(p1VarC4)).toUpperCase(locale);
            upperCase3.getClass();
            StringBuilder sbI = p6.b.i("Precise location allowed: ", upperCase, "\nBackground location allowed: ", upperCase2, "\nLocation Service enabled: ");
            sbI.append(upperCase3);
            String string2 = sbI.toString();
            r rVarF = x2.f(r.S, 1.0f);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            r rVarY = c2.l.y(rVarF, j92.b.f97899b.f97920e);
            d92.b.f58624b.getClass();
            mh.c(string2, rVarY, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar), mVar, 0, 0, 131068);
            androidx.lifecycle.b0.a aVar3 = androidx.lifecycle.b0.a.ON_RESUME;
            boolean zR2 = mVar.r(deviceFeaturesActivity) | mVar.r(context);
            Object objQ2 = mVar.q();
            if (zR2) {
                objQ2 = new j1(11, deviceFeaturesActivity, context);
                mVar.K(objQ2);
            } else {
                aVar.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new j1(11, deviceFeaturesActivity, context);
                    mVar.K(objQ2);
                }
            }
            s9.e.a(aVar3, null, (e23.a) objQ2, mVar, 6);
            p3.x1 x1Var2 = n.f135158a;
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private static final boolean onCreate$lambda$0$0$1$2$2$0(x3<Boolean> x3Var) {
        return x3Var.getF182175a().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0$0$1$2$2$1$0$0(Context context, sd2.f fVar) {
        FindMyDeviceActivity.a aVar = FindMyDeviceActivity.f43421e;
        long unitID = fVar.getUnitID();
        aVar.getClass();
        context.getClass();
        Intent intent = new Intent(context, (Class<?>) FindMyDeviceActivity.class);
        intent.putExtra("extra_device_id", unitID);
        context.startActivity(intent);
        return Unit.INSTANCE;
    }

    private static final boolean onCreate$lambda$0$0$1$2$2$2(x3<Boolean> x3Var) {
        return x3Var.getF182175a().booleanValue();
    }

    private static final boolean onCreate$lambda$0$0$1$2$2$3(x3<Boolean> x3Var) {
        return x3Var.getF182175a().booleanValue();
    }

    private static final boolean onCreate$lambda$0$0$1$2$2$4(x3<Boolean> x3Var) {
        return x3Var.getF182175a().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0$0$1$2$2$5$0(DeviceFeaturesActivity deviceFeaturesActivity, Context context) {
        deviceFeaturesActivity.getViewModel().updateLocationStates(context);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:12:0x0027  */
    public static final Unit onCreate$lambda$0$0$1$2$3(Context context, m mVar, int i14) {
        if (mVar.n(i14 & 1, (i14 & 3) != 2)) {
            p3.x1 x1Var = n.f135158a;
            p2 p2Var = p2.f111205a;
            boolean zR = mVar.r(context);
            Object objQ = mVar.q();
            if (zR) {
                objQ = new a42.d(context, 26);
                mVar.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new a42.d(context, 26);
                    mVar.K(objQ);
                }
            }
            p2Var.g("Start activity recording onboarding flow", null, null, null, null, false, false, (e23.a) objQ, mVar, 6, 254);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0$0$1$2$3$0$0(Context context) {
        RecordActivitySettingsActivity.f44210b.getClass();
        context.getClass();
        context.startActivity(new Intent(context, (Class<?>) RecordActivitySettingsActivity.class));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:15:0x0065  */
    public static final Unit onCreate$lambda$0$0$1$2$4(x3 x3Var, DeviceFeaturesActivity deviceFeaturesActivity, Context context, m mVar, int i14) {
        m mVar2 = mVar;
        if (mVar2.n(i14 & 1, (i14 & 3) != 2)) {
            p3.x1 x1Var = n.f135158a;
            for (sd2.f fVar : onCreate$lambda$0$0$1$0(x3Var)) {
                p2 p2Var = p2.f111205a;
                String str = fVar.getDisplayName() + " - " + fVar.getUnitID();
                boolean zR = mVar2.r(deviceFeaturesActivity) | mVar2.r(fVar) | mVar2.r(context);
                Object objQ = mVar2.q();
                if (zR) {
                    objQ = new ak0.m(deviceFeaturesActivity, 25, fVar, context);
                    mVar2.K(objQ);
                } else {
                    m.f135153a.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new ak0.m(deviceFeaturesActivity, 25, fVar, context);
                        mVar2.K(objQ);
                    }
                }
                p2Var.g(str, null, null, null, null, false, false, (e23.a) objQ, mVar2, 0, 254);
                mVar2 = mVar;
            }
            p3.x1 x1Var2 = n.f135158a;
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0$0$1$2$4$0$0$0(DeviceFeaturesActivity deviceFeaturesActivity, sd2.f fVar, Context context) {
        deviceFeaturesActivity.getViewModel().resetOnboardingForDevice(fVar.getUnitID(), new cn1.d(6, fVar, context));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0$0$1$2$4$0$0$0$0(sd2.f fVar, Context context, boolean z14) {
        String str = z14 ? "Onboarding reset successful" : "Onboarding reset failed";
        Toast.makeText(context, str + " for " + fVar.getDisplayName() + " - " + fVar.getUnitID(), 0).show();
        return Unit.INSTANCE;
    }

    @Override // com.garmin.android.apps.connectmobile.d, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initComposeScreen(new z3.e(773004428, true, new g(this, 3)));
    }
}
