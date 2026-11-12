package aj1;

import androidx.lifecycle.v1;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import androidx.preference.SwitchPreferenceCompat;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.android.apps.connectmobile.settings.notifications.model.NotificationPreferencesDTO;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class g implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.notifications.b f3435b;

    public /* synthetic */ g(com.garmin.android.apps.connectmobile.settings.notifications.b bVar, int i14) {
        this.f3434a = i14;
        this.f3435b = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:160:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:162:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:165:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:167:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:168:0x02bd  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        PreferenceCategory preferenceCategory;
        PreferenceCategory preferenceCategory2;
        ArrayList arrayList;
        com.garmin.android.apps.connectmobile.settings.notifications.model.a aVar;
        int i14 = this.f3434a;
        char c14 = 1;
        com.garmin.android.apps.connectmobile.settings.notifications.b bVar = this.f3435b;
        switch (i14) {
            case 0:
                Boolean bool = (Boolean) obj;
                Preference preference = bVar.W0;
                if (preference != null) {
                    bool.getClass();
                    preference.A(bool.booleanValue());
                }
                if (!bool.booleanValue()) {
                    ArrayList arrayList2 = bVar.f43607l;
                    if (arrayList2 == null) {
                        s.m("mPreferenceList");
                        throw null;
                    }
                    Preference preference2 = bVar.W0;
                    preference2.getClass();
                    arrayList2.remove(preference2);
                }
                return Unit.INSTANCE;
            case 1:
                List<sd2.f> list = (List) obj;
                if (list != null) {
                    com.garmin.android.apps.connectmobile.settings.notifications.b.a aVar2 = com.garmin.android.apps.connectmobile.settings.notifications.b.f43597f1;
                    if (list.isEmpty()) {
                        preferenceCategory = bVar.Z0;
                        if (preferenceCategory != null) {
                            preferenceCategory.A(false);
                        }
                        preferenceCategory2 = bVar.Z0;
                        if (preferenceCategory2 != null) {
                            arrayList = bVar.f43607l;
                            if (arrayList != null) {
                                s.m("mPreferenceList");
                                throw null;
                            }
                            arrayList.remove(preferenceCategory2);
                        }
                    } else {
                        for (sd2.f fVar : list) {
                            long unitID = fVar.getUnitID();
                            Preference preference3 = new Preference(bVar.f10193b.f17488a);
                            preference3.w(bVar.getString(R.string.key_mobile_notifications_low_battery_level_category));
                            preference3.z(fVar.getDisplayName());
                            Preference preference4 = new Preference(bVar.f10193b.f17488a);
                            preference4.w(bVar.getString(R.string.key_mobile_notifications_devices_notifications));
                            preference4.z(bVar.getString(R.string.lbl_device_notifications, fVar.getDisplayName()));
                            int i15 = 2;
                            if (hk0.p.k(unitID)) {
                                t13.g gVar = v1.a((p) bVar.f43603i.getValue()).f183565a;
                                x53.c cVar = s0.f129406a;
                                androidx.lifecycle.m.a(gVar.plus(x53.b.f189152a), new j(unitID, null), 2).f(bVar.getViewLifecycleOwner(), new com.garmin.android.apps.connectmobile.settings.notifications.b.c(new a42.i(4, preference3, preference4)));
                            } else {
                                preference3.f10152f = new e(bVar, preference3, fVar, c14 == true ? 1 : 0);
                                preference4.f10152f = new e(bVar, preference4, fVar, i15);
                            }
                            PreferenceCategory preferenceCategory3 = bVar.X0;
                            if (preferenceCategory3 != null) {
                                preferenceCategory3.E(preference3);
                            }
                            PreferenceCategory preferenceCategory4 = bVar.Z0;
                            if (preferenceCategory4 != null) {
                                preferenceCategory4.E(preference4);
                            }
                        }
                    }
                } else {
                    preferenceCategory = bVar.Z0;
                    if (preferenceCategory != null) {
                        preferenceCategory.A(false);
                    }
                    preferenceCategory2 = bVar.Z0;
                    if (preferenceCategory2 != null) {
                        arrayList = bVar.f43607l;
                        if (arrayList != null) {
                            s.m("mPreferenceList");
                            throw null;
                        }
                        arrayList.remove(preferenceCategory2);
                    }
                }
                return Unit.INSTANCE;
            default:
                g3 g3Var = (g3) obj;
                com.garmin.android.apps.connectmobile.settings.notifications.b.a aVar3 = com.garmin.android.apps.connectmobile.settings.notifications.b.f43597f1;
                g3Var.getClass();
                if (g3Var.f35300a == fw.p.SUCCESS && (aVar = (com.garmin.android.apps.connectmobile.settings.notifications.model.a) g3Var.f35301b) != null) {
                    Gson gson = new Gson();
                    Object objFromJson = gson.fromJson(gson.toJson(aVar), (Class<Object>) com.garmin.android.apps.connectmobile.settings.notifications.model.a.class);
                    objFromJson.getClass();
                    com.garmin.android.apps.connectmobile.settings.notifications.model.a aVar4 = (com.garmin.android.apps.connectmobile.settings.notifications.model.a) objFromJson;
                    bVar.f43602e1 = aVar4;
                    NotificationPreferencesDTO notificationPreferencesDTO = aVar4.f43659a;
                    if (notificationPreferencesDTO != null) {
                        SwitchPreferenceCompat switchPreferenceCompat = bVar.f43609n;
                        if (switchPreferenceCompat != null) {
                            switchPreferenceCompat.a(Boolean.valueOf(notificationPreferencesDTO.N0));
                        }
                        SwitchPreferenceCompat switchPreferenceCompat2 = bVar.f43610o;
                        if (switchPreferenceCompat2 != null) {
                            switchPreferenceCompat2.E(notificationPreferencesDTO.C);
                        }
                        SwitchPreferenceCompat switchPreferenceCompat3 = bVar.f43611p;
                        if (switchPreferenceCompat3 != null) {
                            switchPreferenceCompat3.E(notificationPreferencesDTO.F);
                        }
                        SwitchPreferenceCompat switchPreferenceCompat4 = bVar.f43615v;
                        if (switchPreferenceCompat4 != null) {
                            switchPreferenceCompat4.E(notificationPreferencesDTO.f43645k0);
                        }
                        SwitchPreferenceCompat switchPreferenceCompat5 = bVar.f43616w;
                        if (switchPreferenceCompat5 != null) {
                            switchPreferenceCompat5.E(notificationPreferencesDTO.H0);
                        }
                        SwitchPreferenceCompat switchPreferenceCompat6 = bVar.f43617x;
                        if (switchPreferenceCompat6 != null) {
                            switchPreferenceCompat6.E(notificationPreferencesDTO.I0);
                        }
                        SwitchPreferenceCompat switchPreferenceCompat7 = bVar.f43618y;
                        if (switchPreferenceCompat7 != null) {
                            switchPreferenceCompat7.E(notificationPreferencesDTO.J0);
                        }
                        SwitchPreferenceCompat switchPreferenceCompat8 = bVar.f43619z;
                        if (switchPreferenceCompat8 != null) {
                            switchPreferenceCompat8.E(notificationPreferencesDTO.D);
                        }
                        SwitchPreferenceCompat switchPreferenceCompat9 = bVar.A;
                        if (switchPreferenceCompat9 != null) {
                            switchPreferenceCompat9.E(notificationPreferencesDTO.E);
                        }
                        SwitchPreferenceCompat switchPreferenceCompat10 = bVar.B;
                        if (switchPreferenceCompat10 != null) {
                            switchPreferenceCompat10.E(notificationPreferencesDTO.O0);
                        }
                        SwitchPreferenceCompat switchPreferenceCompat11 = bVar.C;
                        if (switchPreferenceCompat11 != null) {
                            switchPreferenceCompat11.E(notificationPreferencesDTO.K0);
                        }
                        SwitchPreferenceCompat switchPreferenceCompat12 = bVar.D;
                        if (switchPreferenceCompat12 != null) {
                            switchPreferenceCompat12.E(notificationPreferencesDTO.L0);
                        }
                        SwitchPreferenceCompat switchPreferenceCompat13 = bVar.E;
                        if (switchPreferenceCompat13 != null) {
                            switchPreferenceCompat13.E(notificationPreferencesDTO.R0);
                        }
                        SwitchPreferenceCompat switchPreferenceCompat14 = bVar.F;
                        if (switchPreferenceCompat14 != null) {
                            switchPreferenceCompat14.E(notificationPreferencesDTO.S0);
                        }
                        SwitchPreferenceCompat switchPreferenceCompat15 = bVar.I;
                        if (switchPreferenceCompat15 != null) {
                            switchPreferenceCompat15.E(notificationPreferencesDTO.T0);
                        }
                        SwitchPreferenceCompat switchPreferenceCompat16 = bVar.P;
                        if (switchPreferenceCompat16 != null) {
                            switchPreferenceCompat16.E(notificationPreferencesDTO.U0);
                        }
                        SwitchPreferenceCompat switchPreferenceCompat17 = bVar.T;
                        if (switchPreferenceCompat17 != null) {
                            switchPreferenceCompat17.E(notificationPreferencesDTO.V0);
                        }
                        SwitchPreferenceCompat switchPreferenceCompat18 = bVar.X;
                        if (switchPreferenceCompat18 != null) {
                            switchPreferenceCompat18.E(notificationPreferencesDTO.W0);
                        }
                        SwitchPreferenceCompat switchPreferenceCompat19 = bVar.Y;
                        if (switchPreferenceCompat19 != null) {
                            switchPreferenceCompat19.E(notificationPreferencesDTO.X0);
                        }
                        SwitchPreferenceCompat switchPreferenceCompat20 = bVar.Z;
                        if (switchPreferenceCompat20 != null) {
                            switchPreferenceCompat20.E(notificationPreferencesDTO.P);
                        }
                        SwitchPreferenceCompat switchPreferenceCompat21 = bVar.f43606k0;
                        if (switchPreferenceCompat21 != null) {
                            switchPreferenceCompat21.E(notificationPreferencesDTO.T);
                        }
                        SwitchPreferenceCompat switchPreferenceCompat22 = bVar.H0;
                        if (switchPreferenceCompat22 != null) {
                            switchPreferenceCompat22.E(notificationPreferencesDTO.Y);
                        }
                        SwitchPreferenceCompat switchPreferenceCompat23 = bVar.I0;
                        if (switchPreferenceCompat23 != null) {
                            switchPreferenceCompat23.E(notificationPreferencesDTO.I);
                        }
                        SwitchPreferenceCompat switchPreferenceCompat24 = bVar.J0;
                        if (switchPreferenceCompat24 != null) {
                            switchPreferenceCompat24.E(notificationPreferencesDTO.X);
                        }
                        SwitchPreferenceCompat switchPreferenceCompat25 = bVar.K0;
                        if (switchPreferenceCompat25 != null) {
                            switchPreferenceCompat25.E(notificationPreferencesDTO.Z);
                        }
                        SwitchPreferenceCompat switchPreferenceCompat26 = bVar.L0;
                        if (switchPreferenceCompat26 != null) {
                            switchPreferenceCompat26.E(notificationPreferencesDTO.P0);
                        }
                        SwitchPreferenceCompat switchPreferenceCompat27 = bVar.M0;
                        if (switchPreferenceCompat27 != null) {
                            switchPreferenceCompat27.E(notificationPreferencesDTO.f43637e1);
                        }
                        SwitchPreferenceCompat switchPreferenceCompat28 = bVar.N0;
                        if (switchPreferenceCompat28 != null) {
                            switchPreferenceCompat28.E(notificationPreferencesDTO.f43639f1);
                        }
                        SwitchPreferenceCompat switchPreferenceCompat29 = bVar.T0;
                        if (switchPreferenceCompat29 != null) {
                            switchPreferenceCompat29.E(notificationPreferencesDTO.Y0);
                        }
                        SwitchPreferenceCompat switchPreferenceCompat30 = bVar.U0;
                        if (switchPreferenceCompat30 != null) {
                            switchPreferenceCompat30.E(notificationPreferencesDTO.M0);
                        }
                        SwitchPreferenceCompat switchPreferenceCompat31 = bVar.V0;
                        if (switchPreferenceCompat31 != null) {
                            switchPreferenceCompat31.E(notificationPreferencesDTO.Z0);
                        }
                        SwitchPreferenceCompat switchPreferenceCompat32 = bVar.Y0;
                        if (switchPreferenceCompat32 != null) {
                            switchPreferenceCompat32.E(notificationPreferencesDTO.Q0);
                        }
                        SwitchPreferenceCompat switchPreferenceCompat33 = bVar.f43598a1;
                        if (switchPreferenceCompat33 != null) {
                            switchPreferenceCompat33.E(notificationPreferencesDTO.f43629a1);
                        }
                        SwitchPreferenceCompat switchPreferenceCompat34 = bVar.f43600c1;
                        if (switchPreferenceCompat34 != null) {
                            switchPreferenceCompat34.E(notificationPreferencesDTO.f43633c1);
                        }
                        SwitchPreferenceCompat switchPreferenceCompat35 = bVar.f43601d1;
                        if (switchPreferenceCompat35 != null) {
                            switchPreferenceCompat35.E(notificationPreferencesDTO.f43635d1);
                        }
                    }
                    SwitchPreferenceCompat switchPreferenceCompat36 = bVar.f43610o;
                    com.nimbusds.jose.shaded.gson.internal.a.o(GCMSettingManager.f41535a, R.string.key_mobile_notifications_activity_uploads, GCMSettingManager.f41536b.edit(), switchPreferenceCompat36 != null && switchPreferenceCompat36.K0);
                    SwitchPreferenceCompat switchPreferenceCompat37 = bVar.N0;
                    com.nimbusds.jose.shaded.gson.internal.a.o(GCMSettingManager.f41535a, R.string.key_mobile_notifications_pa_uploads, GCMSettingManager.f41536b.edit(), switchPreferenceCompat37 != null && switchPreferenceCompat37.K0);
                    if (bVar.f43612q != null) {
                        jf0.a aVar5 = (jf0.a) KoinJavaComponent.get$default(jf0.a.class, null, null, 6, null);
                        SwitchPreferenceCompat switchPreferenceCompat38 = bVar.f43612q;
                        if (switchPreferenceCompat38 != null) {
                            switchPreferenceCompat38.E(aVar5.c().c());
                        }
                    }
                    if (bVar.f43613r != null) {
                        qn.c cVar2 = (qn.c) KoinJavaComponent.get$default(qn.c.class, null, null, 6, null);
                        SwitchPreferenceCompat switchPreferenceCompat39 = bVar.f43613r;
                        if (switchPreferenceCompat39 != null) {
                            switchPreferenceCompat39.E(cVar2.a());
                        }
                    }
                    SwitchPreferenceCompat switchPreferenceCompat40 = bVar.f43614t;
                    if (switchPreferenceCompat40 != null) {
                        switchPreferenceCompat40.E(((jn0.a) KoinJavaComponent.get$default(jn0.a.class, null, null, 6, null)).c());
                    }
                }
                return Unit.INSTANCE;
        }
    }
}
