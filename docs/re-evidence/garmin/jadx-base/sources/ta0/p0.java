package ta0;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.u1;
import b21.m9;
import ca0.o1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import p005kotlin.Unit;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class p0 {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f163417a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f163418b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f163419c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f163420d;

        static {
            int[] iArr = new int[o1.values().length];
            try {
                iArr[o1.CREATE_ACCOUNT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o1.SIGN_IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o1.ADD_DEVICE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f163417a = iArr;
            int[] iArr2 = new int[j22.h.values().length];
            try {
                iArr2[j22.h.ALLOWED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[j22.h.DENIED_DONT_ASK_AGAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f163418b = iArr2;
            int[] iArr3 = new int[j22.f.values().length];
            try {
                iArr3[j22.f.ALLOWED_WHILE_USING.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[j22.f.ALLOWED_ALL_TIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[j22.f.DENIED.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[j22.f.DENIED_DONT_ASK_AGAIN.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            f163419c = iArr3;
            int[] iArr4 = new int[l90.e.values().length];
            try {
                iArr4[l90.e.BLUETOOTH_PERMISSION_DENIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr4[l90.e.BLUETOOTH_DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr4[l90.e.BACKGROUND_LOCATION_PERMISSION_DENIED.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[l90.e.LOCATION_PERMISSION_DENIED.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr4[l90.e.LOCATION_DISABLED.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            f163420d = iArr4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:114:0x0283  */
    /* JADX WARN: Code duplicated, block: B:125:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:131:0x035b  */
    /* JADX WARN: Code duplicated, block: B:136:0x0378  */
    /* JADX WARN: Code duplicated, block: B:142:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:148:0x0435  */
    /* JADX WARN: Code duplicated, block: B:47:0x008a  */
    /* JADX WARN: Code duplicated, block: B:59:0x0105  */
    /* JADX WARN: Code duplicated, block: B:64:0x0128  */
    /* JADX WARN: Code duplicated, block: B:69:0x0151  */
    /* JADX WARN: Code duplicated, block: B:74:0x017b  */
    /* JADX WARN: Code duplicated, block: B:79:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:86:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:95:0x0203  */
    /* JADX WARN: Multi-variable type inference failed */
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
    public static final void a(boolean z14, q0 q0Var, e23.a aVar, e23.a aVar2, p3.m mVar, int i14) {
        int i15;
        final q0 q0Var2;
        int i16;
        final int i17;
        int i18;
        int i19;
        p3.o0 o0VarP = fb1.c.p(aVar, aVar2, mVar, -697105218);
        if ((i14 & 6) == 0) {
            i15 = (o0VarP.h(z14) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarP.r(aVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarP.r(aVar2) ? 2048 : 1024;
        }
        final int i24 = 1;
        final int i25 = 0;
        if (o0VarP.n(i15 & 1, (i15 & 1171) != 1170)) {
            o0VarP.G0();
            int i26 = i14 & 1;
            p3.m.a aVar3 = p3.m.f135153a;
            if (i26 == 0 || o0VarP.o0()) {
                boolean z15 = (i15 & 14) == 4;
                Object objQ = o0VarP.q();
                if (z15) {
                    objQ = new m9(z14, 2);
                    o0VarP.K(objQ);
                } else {
                    aVar3.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new m9(z14, 2);
                        o0VarP.K(objQ);
                    }
                }
                e23.a aVar4 = (e23.a) objQ;
                o0VarP.L(-1614864554);
                v9.a.f176280a.getClass();
                ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(o0VarP);
                if (viewModelStoreOwnerA == null) {
                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(p005kotlin.jvm.internal.s0.f105811a.b(q0.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(o0VarP, 0), aVar4);
                o0VarP.g0(false);
                q0 q0Var3 = (q0) u1VarResolveViewModel;
                i16 = i15 & (-113);
                q0Var2 = q0Var3;
            } else {
                o0VarP.e();
                i16 = i15 & (-113);
                q0Var2 = q0Var;
            }
            o0VarP.h0();
            x1 x1Var = p3.n.f135158a;
            final Context context = (Context) o0VarP.A(AndroidCompositionLocals_androidKt.f6042b);
            p1 p1VarB = s9.c.b(q0Var2.f163424d, null, o0VarP, 48);
            l90.e eVar = (l90.e) p1VarB.getF182175a();
            boolean zB = o0VarP.B(p1VarB) | ((i16 & 896) == 256);
            Object objQ2 = o0VarP.q();
            if (zB) {
                objQ2 = new o0(aVar, p1VarB, null);
                o0VarP.K(objQ2);
            } else {
                aVar3.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new o0(aVar, p1VarB, null);
                    o0VarP.K(objQ2);
                }
            }
            p3.l0.e((e23.p) objQ2, eVar, o0VarP);
            g.h hVar = new g.h();
            boolean zR = o0VarP.r(q0Var2);
            Object objQ3 = o0VarP.q();
            if (zR) {
                objQ3 = new e23.l() { // from class: ta0.n0
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        f.a aVar5 = (f.a) obj;
                        switch (i25) {
                            case 0:
                                aVar5.getClass();
                                p0.c("onActivityResult: requestBluetoothEnableLauncher " + aVar5);
                                q0Var2.x4();
                                break;
                            default:
                                aVar5.getClass();
                                p0.c("onActivityResult: requestLocationEnableLauncher " + aVar5);
                                q0Var2.y4();
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarP.K(objQ3);
            } else {
                aVar3.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new e23.l() { // from class: ta0.n0
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            f.a aVar5 = (f.a) obj;
                            switch (i25) {
                                case 0:
                                    aVar5.getClass();
                                    p0.c("onActivityResult: requestBluetoothEnableLauncher " + aVar5);
                                    q0Var2.x4();
                                    break;
                                default:
                                    aVar5.getClass();
                                    p0.c("onActivityResult: requestLocationEnableLauncher " + aVar5);
                                    q0Var2.y4();
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarP.K(objQ3);
                }
            }
            c.q qVarC = c.w.c(hVar, (e23.l) objQ3, o0VarP, 0);
            g.h hVar2 = new g.h();
            boolean zR2 = o0VarP.r(context) | o0VarP.r(q0Var2);
            Object objQ4 = o0VarP.q();
            if (zR2) {
                objQ4 = new e23.l() { // from class: ta0.m0
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        f.a aVar5 = (f.a) obj;
                        switch (i24) {
                            case 0:
                                aVar5.getClass();
                                j22.b.f96736a.getClass();
                                j22.f fVarJ = j22.b.j(context);
                                p0.c("onActivityResult: requestLocationAppSettingsLauncher locationPermissionStatus[" + fVarJ + "]");
                                int i27 = p0.a.f163419c[fVarJ.ordinal()];
                                if (i27 == 1 || i27 == 2) {
                                    q0Var2.y4();
                                } else {
                                    p0.c("onActivityResult: requestLocationAppSettingsLauncher location permission still not granted after returning from app settings");
                                }
                                break;
                            default:
                                aVar5.getClass();
                                j22.b.f96736a.getClass();
                                boolean zB2 = j22.b.b(context);
                                p0.c("onActivityResult: requestBluetoothAppSettingsLauncher bluetoothPermission[" + zB2 + "]");
                                if (zB2) {
                                    q0Var2.x4();
                                } else {
                                    p0.c("onActivityResult: requestBluetoothAppSettingsLauncher bluetooth permission still not granted after returning from app settings");
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarP.K(objQ4);
            } else {
                aVar3.getClass();
                if (objQ4 == p3.m.a.f135155b) {
                    objQ4 = new e23.l() { // from class: ta0.m0
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            f.a aVar5 = (f.a) obj;
                            switch (i24) {
                                case 0:
                                    aVar5.getClass();
                                    j22.b.f96736a.getClass();
                                    j22.f fVarJ = j22.b.j(context);
                                    p0.c("onActivityResult: requestLocationAppSettingsLauncher locationPermissionStatus[" + fVarJ + "]");
                                    int i27 = p0.a.f163419c[fVarJ.ordinal()];
                                    if (i27 == 1 || i27 == 2) {
                                        q0Var2.y4();
                                    } else {
                                        p0.c("onActivityResult: requestLocationAppSettingsLauncher location permission still not granted after returning from app settings");
                                    }
                                    break;
                                default:
                                    aVar5.getClass();
                                    j22.b.f96736a.getClass();
                                    boolean zB2 = j22.b.b(context);
                                    p0.c("onActivityResult: requestBluetoothAppSettingsLauncher bluetoothPermission[" + zB2 + "]");
                                    if (zB2) {
                                        q0Var2.x4();
                                    } else {
                                        p0.c("onActivityResult: requestBluetoothAppSettingsLauncher bluetooth permission still not granted after returning from app settings");
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarP.K(objQ4);
                }
            }
            c.q qVarC2 = c.w.c(hVar2, (e23.l) objQ4, o0VarP, 0);
            g.f fVar = new g.f();
            boolean zR3 = o0VarP.r(q0Var2) | o0VarP.r(qVarC2);
            Object objQ5 = o0VarP.q();
            if (zR3) {
                objQ5 = new sy.i(8, q0Var2, qVarC2);
                o0VarP.K(objQ5);
            } else {
                aVar3.getClass();
                if (objQ5 == p3.m.a.f135155b) {
                    objQ5 = new sy.i(8, q0Var2, qVarC2);
                    o0VarP.K(objQ5);
                }
            }
            c.q qVarC3 = c.w.c(fVar, (e23.l) objQ5, o0VarP, 0);
            g.h hVar3 = new g.h();
            boolean zR4 = o0VarP.r(q0Var2);
            Object objQ6 = o0VarP.q();
            if (zR4) {
                final int i27 = 1;
                objQ6 = new e23.l() { // from class: ta0.n0
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        f.a aVar5 = (f.a) obj;
                        switch (i27) {
                            case 0:
                                aVar5.getClass();
                                p0.c("onActivityResult: requestBluetoothEnableLauncher " + aVar5);
                                q0Var2.x4();
                                break;
                            default:
                                aVar5.getClass();
                                p0.c("onActivityResult: requestLocationEnableLauncher " + aVar5);
                                q0Var2.y4();
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarP.K(objQ6);
            } else {
                aVar3.getClass();
                if (objQ6 == p3.m.a.f135155b) {
                    final int i28 = 1;
                    objQ6 = new e23.l() { // from class: ta0.n0
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            f.a aVar5 = (f.a) obj;
                            switch (i28) {
                                case 0:
                                    aVar5.getClass();
                                    p0.c("onActivityResult: requestBluetoothEnableLauncher " + aVar5);
                                    q0Var2.x4();
                                    break;
                                default:
                                    aVar5.getClass();
                                    p0.c("onActivityResult: requestLocationEnableLauncher " + aVar5);
                                    q0Var2.y4();
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarP.K(objQ6);
                }
            }
            c.q qVarC4 = c.w.c(hVar3, (e23.l) objQ6, o0VarP, 0);
            g.h hVar4 = new g.h();
            boolean zR5 = o0VarP.r(context) | o0VarP.r(q0Var2);
            Object objQ7 = o0VarP.q();
            if (zR5) {
                i17 = 0;
                objQ7 = new e23.l() { // from class: ta0.m0
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        f.a aVar5 = (f.a) obj;
                        switch (i17) {
                            case 0:
                                aVar5.getClass();
                                j22.b.f96736a.getClass();
                                j22.f fVarJ = j22.b.j(context);
                                p0.c("onActivityResult: requestLocationAppSettingsLauncher locationPermissionStatus[" + fVarJ + "]");
                                int i29 = p0.a.f163419c[fVarJ.ordinal()];
                                if (i29 == 1 || i29 == 2) {
                                    q0Var2.y4();
                                } else {
                                    p0.c("onActivityResult: requestLocationAppSettingsLauncher location permission still not granted after returning from app settings");
                                }
                                break;
                            default:
                                aVar5.getClass();
                                j22.b.f96736a.getClass();
                                boolean zB2 = j22.b.b(context);
                                p0.c("onActivityResult: requestBluetoothAppSettingsLauncher bluetoothPermission[" + zB2 + "]");
                                if (zB2) {
                                    q0Var2.x4();
                                } else {
                                    p0.c("onActivityResult: requestBluetoothAppSettingsLauncher bluetooth permission still not granted after returning from app settings");
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarP.K(objQ7);
            } else {
                aVar3.getClass();
                if (objQ7 == p3.m.a.f135155b) {
                    i17 = 0;
                    objQ7 = new e23.l() { // from class: ta0.m0
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            f.a aVar5 = (f.a) obj;
                            switch (i17) {
                                case 0:
                                    aVar5.getClass();
                                    j22.b.f96736a.getClass();
                                    j22.f fVarJ = j22.b.j(context);
                                    p0.c("onActivityResult: requestLocationAppSettingsLauncher locationPermissionStatus[" + fVarJ + "]");
                                    int i29 = p0.a.f163419c[fVarJ.ordinal()];
                                    if (i29 == 1 || i29 == 2) {
                                        q0Var2.y4();
                                    } else {
                                        p0.c("onActivityResult: requestLocationAppSettingsLauncher location permission still not granted after returning from app settings");
                                    }
                                    break;
                                default:
                                    aVar5.getClass();
                                    j22.b.f96736a.getClass();
                                    boolean zB2 = j22.b.b(context);
                                    p0.c("onActivityResult: requestBluetoothAppSettingsLauncher bluetoothPermission[" + zB2 + "]");
                                    if (zB2) {
                                        q0Var2.x4();
                                    } else {
                                        p0.c("onActivityResult: requestBluetoothAppSettingsLauncher bluetooth permission still not granted after returning from app settings");
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarP.K(objQ7);
                } else {
                    i17 = 0;
                }
            }
            c.q qVarC5 = c.w.c(hVar4, (e23.l) objQ7, o0VarP, i17);
            g.f fVar2 = new g.f();
            boolean zR6 = ((i16 & 7168) == 2048) | o0VarP.r(q0Var2) | o0VarP.r(qVarC5);
            Object objQ8 = o0VarP.q();
            if (zR6) {
                objQ8 = new rp.b(q0Var2, aVar2, qVarC5, 20);
                o0VarP.K(objQ8);
            } else {
                aVar3.getClass();
                if (objQ8 == p3.m.a.f135155b) {
                    objQ8 = new rp.b(q0Var2, aVar2, qVarC5, 20);
                    o0VarP.K(objQ8);
                }
            }
            c.q qVarC6 = c.w.c(fVar2, (e23.l) objQ8, o0VarP, 0);
            l90.e eVar2 = (l90.e) p1VarB.getF182175a();
            int i29 = eVar2 == null ? -1 : a.f163420d[eVar2.ordinal()];
            if (i29 == 1) {
                int i30 = i16;
                o0VarP.C(-1290702858);
                g82.c cVar = g82.c.f76436a;
                String strQ = gl1.y.Q(o0VarP, R.string.permission_nearby_devices_allow_title);
                String strQ2 = gl1.y.Q(o0VarP, R.string.permission_nearby_devices_allow_message);
                String strQ3 = gl1.y.Q(o0VarP, R.string.lbl_allow_access);
                String strQ4 = gl1.y.Q(o0VarP, R.string.lbl_cancel);
                boolean zR7 = o0VarP.r(qVarC3);
                Object objQ9 = o0VarP.q();
                if (zR7) {
                    objQ9 = new ib0.n(qVarC3, 4);
                    o0VarP.K(objQ9);
                } else {
                    aVar3.getClass();
                    if (objQ9 == p3.m.a.f135155b) {
                        objQ9 = new ib0.n(qVarC3, 4);
                        o0VarP.K(objQ9);
                    }
                }
                cVar.c(null, strQ, strQ2, 0, strQ3, (e23.a) objQ9, strQ4, aVar2, false, aVar2, o0VarP, ((i30 << 12) & 29360128) | ((i30 << 18) & 1879048192), 265);
                o0VarP.g0(false);
                Unit unit = Unit.INSTANCE;
            } else if (i29 == 2) {
                int i34 = i16;
                o0VarP.C(-1289997546);
                g82.c cVar2 = g82.c.f76436a;
                String strQ5 = gl1.y.Q(o0VarP, R.string.title_bluetooth_access_needed);
                String strQ6 = gl1.y.Q(o0VarP, R.string.msg_bluetooth_must_be_on_to_pair);
                String strQ7 = gl1.y.Q(o0VarP, R.string.lbl_turn_on_bluetooth);
                String strQ8 = gl1.y.Q(o0VarP, R.string.lbl_cancel);
                boolean zR8 = o0VarP.r(qVarC);
                Object objQ10 = o0VarP.q();
                if (zR8) {
                    objQ10 = new ib0.n(qVarC, 5);
                    o0VarP.K(objQ10);
                } else {
                    aVar3.getClass();
                    if (objQ10 == p3.m.a.f135155b) {
                        objQ10 = new ib0.n(qVarC, 5);
                        o0VarP.K(objQ10);
                    }
                }
                cVar2.c(null, strQ5, strQ6, 0, strQ7, (e23.a) objQ10, strQ8, aVar2, false, aVar2, o0VarP, ((i34 << 12) & 29360128) | ((i34 << 18) & 1879048192), 265);
                o0VarP.g0(false);
                Unit unit2 = Unit.INSTANCE;
            } else if (i29 == 3) {
                int i35 = i16;
                o0VarP.C(-1289302929);
                g82.c cVar3 = g82.c.f76436a;
                String strQ9 = gl1.y.Q(o0VarP, R.string.title_location_permission);
                String strQ10 = gl1.y.Q(o0VarP, R.string.explanation_location_permission_while_in_use);
                String strQ11 = gl1.y.Q(o0VarP, R.string.lbl_manage_permissions);
                String strQ12 = gl1.y.Q(o0VarP, R.string.not_now_lbl);
                boolean zR9 = o0VarP.r(qVarC5);
                Object objQ11 = o0VarP.q();
                if (zR9) {
                    objQ11 = new ib0.n(qVarC5, 6);
                    o0VarP.K(objQ11);
                } else {
                    aVar3.getClass();
                    if (objQ11 == p3.m.a.f135155b) {
                        objQ11 = new ib0.n(qVarC5, 6);
                        o0VarP.K(objQ11);
                    }
                }
                e23.a aVar5 = (e23.a) objQ11;
                boolean zR10 = o0VarP.r(q0Var2);
                Object objQ12 = o0VarP.q();
                if (zR10) {
                    objQ12 = new sg0.w0(q0Var2, 15);
                    o0VarP.K(objQ12);
                } else {
                    aVar3.getClass();
                    if (objQ12 == p3.m.a.f135155b) {
                        objQ12 = new sg0.w0(q0Var2, 15);
                        o0VarP.K(objQ12);
                    }
                }
                cVar3.c(null, strQ9, strQ10, 0, strQ11, aVar5, strQ12, (e23.a) objQ12, false, aVar2, o0VarP, (i35 << 18) & 1879048192, 265);
                o0VarP.g0(false);
                Unit unit3 = Unit.INSTANCE;
            } else if (i29 == 4) {
                o0VarP.C(-1288593773);
                j22.b.f96736a.getClass();
                if (j22.b.t()) {
                    i18 = -1288511003;
                    i19 = R.string.explanation_location_permission_denied;
                } else {
                    i18 = -1288410687;
                    i19 = R.string.permissions_msg_location_for_ble_rationale;
                }
                String strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarP, i18, i19, o0VarP, false);
                g82.c cVar4 = g82.c.f76436a;
                int i36 = i16;
                String strQ13 = gl1.y.Q(o0VarP, R.string.title_location_permission);
                String strQ14 = gl1.y.Q(o0VarP, R.string.lbl_manage_permissions);
                String strQ15 = gl1.y.Q(o0VarP, R.string.lbl_cancel);
                boolean zR11 = o0VarP.r(qVarC6) | o0VarP.r(q0Var2);
                Object objQ13 = o0VarP.q();
                if (zR11) {
                    objQ13 = new s70.j1(28, qVarC6, q0Var2);
                    o0VarP.K(objQ13);
                } else {
                    aVar3.getClass();
                    if (objQ13 == p3.m.a.f135155b) {
                        objQ13 = new s70.j1(28, qVarC6, q0Var2);
                        o0VarP.K(objQ13);
                    }
                }
                cVar4.c(null, strQ13, strJ, 0, strQ14, (e23.a) objQ13, strQ15, aVar2, false, aVar2, o0VarP, ((i36 << 12) & 29360128) | ((i36 << 18) & 1879048192), 265);
                o0VarP.g0(false);
                Unit unit4 = Unit.INSTANCE;
            } else if (i29 != 5) {
                o0VarP.C(-1287015625);
                o0VarP.g0(false);
                Unit unit5 = Unit.INSTANCE;
            } else {
                o0VarP.C(-1287619505);
                g82.c cVar5 = g82.c.f76436a;
                String strQ16 = gl1.y.Q(o0VarP, R.string.title_location_access_needed);
                String strQ17 = gl1.y.Q(o0VarP, R.string.msg_phone_location_must_be_on);
                String strQ18 = gl1.y.Q(o0VarP, R.string.weather_location_service_enable);
                String strQ19 = gl1.y.Q(o0VarP, R.string.lbl_cancel);
                boolean zR12 = o0VarP.r(qVarC4);
                Object objQ14 = o0VarP.q();
                if (zR12) {
                    objQ14 = new ib0.n(qVarC4, 7);
                    o0VarP.K(objQ14);
                } else {
                    aVar3.getClass();
                    if (objQ14 == p3.m.a.f135155b) {
                        objQ14 = new ib0.n(qVarC4, 7);
                        o0VarP.K(objQ14);
                    }
                }
                cVar5.c(null, strQ16, strQ17, 0, strQ18, (e23.a) objQ14, strQ19, aVar2, false, aVar2, o0VarP, ((i16 << 12) & 29360128) | ((i16 << 18) & 1879048192), 265);
                o0VarP.g0(false);
                Unit unit6 = Unit.INSTANCE;
            }
        } else {
            o0VarP.e();
            q0Var2 = q0Var;
        }
        p2 p2VarI0 = o0VarP.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cq0.i(z14, q0Var2, aVar, aVar2, i14);
        }
    }

    public static final void b(o1 o1Var, e23.a<Unit> aVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        boolean z14;
        o1Var.getClass();
        aVar.getClass();
        aVar2.getClass();
        p3.o0 o0VarE = mVar.E(-819254817);
        int i15 = i14 | (o0VarE.k(o1Var.ordinal()) ? 4 : 2) | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.r(aVar2) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            int i16 = a.f163417a[o1Var.ordinal()];
            if (i16 == 1 || i16 == 2) {
                z14 = false;
            } else {
                if (i16 != 3) {
                    lc.u0.r();
                    return;
                }
                z14 = true;
            }
            a(z14, null, aVar, aVar2, o0VarE, (i15 << 3) & 8064);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new rx1.u(o1Var, aVar, aVar2, i14, 28);
        }
    }

    public static final void c(String str) {
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.DEVICE_SETUP;
        aVar.getClass();
        i2.a.b(a2Var, "DeviceScanPermissionsScreen", str);
    }

    public static final void d(f.c<Intent> cVar) {
        c("sendUserToAppSettings: open Android app settings");
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", "com.garmin.android.apps.connectmobile", null));
        cVar.a(intent, null);
    }
}
