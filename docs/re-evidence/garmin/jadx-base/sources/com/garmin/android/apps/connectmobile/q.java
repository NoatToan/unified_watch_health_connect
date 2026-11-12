package com.garmin.android.apps.connectmobile;

import android.content.Context;
import android.content.SharedPreferences;
import com.garmin.android.apps.connectmobile.cloudmessaging.FCMRegistrationGCWorker;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.AppUpgradeManager$Companion$performUpgrades$2", f = "AppUpgradeManager.kt", l = {90, 98, 102}, m = "invokeSuspend", v = 2)
public final class q extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f41061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f41062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f41063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f41064d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Context context, t13.d<? super q> dVar) {
        super(2, dVar);
        this.f41064d = context;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new q(this.f41064d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((q) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:89:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:92:0x0208  */
    /* JADX WARN: Code duplicated, block: B:95:0x020d  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i14;
        int i15;
        int i16;
        Object objE0;
        int i17;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i18 = this.f41063c;
        Context context = this.f41064d;
        if (i18 != 0) {
            if (i18 == 1) {
                i15 = this.f41062b;
                i14 = this.f41061a;
                o13.r.b(obj);
            } else {
                if (i18 == 2) {
                    i15 = this.f41062b;
                    i16 = this.f41061a;
                    o13.r.b(obj);
                    i14 = i16;
                    if (i14 < 8560) {
                        u.a aVar = u.f46488a;
                        this.f41061a = i14;
                        this.f41062b = i15;
                        this.f41063c = 3;
                        aVar.getClass();
                        x53.c cVar = o53.s0.f129406a;
                        objE0 = ge1.b.e0(x53.b.f189152a, new t(null), this);
                        if (objE0 != u13.a.COROUTINE_SUSPENDED) {
                            objE0 = Unit.INSTANCE;
                        }
                        if (objE0 != obj2) {
                            i17 = i15;
                        }
                        return obj2;
                    }
                    com.airbnb.lottie.animation.keyframe.a.p(GCMSettingManager.f41535a, R.string.key_last_upgrade_version, GCMSettingManager.f41536b.edit(), i15);
                    return Unit.INSTANCE;
                }
                if (i18 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i17 = this.f41062b;
                o13.r.b(obj);
            }
            i15 = i17;
            com.airbnb.lottie.animation.keyframe.a.p(GCMSettingManager.f41535a, R.string.key_last_upgrade_version, GCMSettingManager.f41536b.edit(), i15);
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        i14 = GCMSettingManager.f41536b.getInt(GCMSettingManager.f41535a.getString(R.string.key_last_upgrade_version), 0);
        i15 = 11657;
        if (i14 != 0 && i14 != 11657) {
            a2 a2Var = a2.CRASH;
            String str = a2Var.f28756a;
            int i19 = gt2.c.f79010a;
            str.getClass();
            gt2.b.f79005a.getClass();
            gt2.b.a.l(str, true);
            gt2.c.a(a2Var.f28756a);
            FCMRegistrationGCWorker.f31356e.getClass();
            FCMRegistrationGCWorker.a.a(context);
        }
        if (i14 != 0 && i14 != 11657) {
            if (i14 < 1309) {
                sz0.d.c();
            }
            if (i14 < 1475) {
                u.f46488a.getClass();
                yj2.b.a(context);
            }
            if (i14 < 1610) {
                u.f46488a.getClass();
                rd2.f.a().f152045a.getClass();
                ArrayList<sd2.f> arrayListD = rd2.j.d();
                if (arrayListD != null) {
                    for (sd2.f fVar : arrayListD) {
                        rd2.h hVarD = rd2.h.d();
                        long unitID = fVar.getUnitID();
                        hVarD.getClass();
                        rd2.h.g(unitID, 1, true);
                    }
                }
            }
            if (i14 < 1700) {
                u.f46488a.getClass();
                sz0.d.b();
                yj2.b.a(context);
            }
            if (i14 < 1965) {
                sz0.d.c();
                u.a.b(u.f46488a);
            }
            if (i14 < 2050) {
                u.f46488a.getClass();
                yj2.b.a(context);
            }
            if (i14 < 2150) {
                cw.q.N().M(null);
                cw.q qVarN = cw.q.N();
                qVarN.getClass();
                com.garmin.android.library.backgroundtaskmanagement.c.d(new gw.i(qVarN), null);
            }
            if (i14 < 4607) {
                u.a aVar2 = u.f46488a;
                this.f41061a = i14;
                this.f41062b = 11657;
                this.f41063c = 1;
                if (u.a.c(aVar2, this) != obj2) {
                }
            }
            return obj2;
        }
        sz0.d.c();
        u.a.b(u.f46488a);
        com.airbnb.lottie.animation.keyframe.a.p(GCMSettingManager.f41535a, R.string.key_last_upgrade_version, GCMSettingManager.f41536b.edit(), i15);
        return Unit.INSTANCE;
        if (i14 < 5429) {
            f12.l.f68084a.getClass();
            context.getClass();
            SharedPreferences sharedPreferences = context.getSharedPreferences(context.getString(R.string.key_shared_preferences_name), 0);
            SharedPreferences.Editor editorEdit = context.getSharedPreferences("gcm_user_preferences", 0).edit();
            if (!sharedPreferences.getBoolean("migrateFromMyFitSettingsPrefs_DONE", false)) {
                for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
                    Object value = entry.getValue();
                    String key = entry.getKey();
                    if (value instanceof Boolean) {
                        editorEdit.putBoolean(key, ((Boolean) value).booleanValue());
                    } else if (value instanceof Float) {
                        editorEdit.putFloat(key, ((Number) value).floatValue());
                    } else if (value instanceof Integer) {
                        editorEdit.putInt(key, ((Number) value).intValue());
                    } else if (value instanceof Long) {
                        editorEdit.putLong(key, ((Number) value).longValue());
                    } else if (value instanceof String) {
                        editorEdit.putString(key, (String) value);
                    } else if (value instanceof Set) {
                        editorEdit.putStringSet(key, (Set) value);
                    }
                }
                if (editorEdit.commit()) {
                    sharedPreferences.edit().putBoolean("migrateFromMyFitSettingsPrefs_DONE", true).commit();
                    i2.a aVar3 = i2.f36769a;
                    a2 a2Var2 = a2.GENERAL;
                    aVar3.getClass();
                    i2.a.b(a2Var2, "GCMUserSettings", "migrateFromMyFitSettingsPrefs -> SUCCESSFUL");
                } else {
                    i2.a aVar4 = i2.f36769a;
                    a2 a2Var3 = a2.GENERAL;
                    aVar4.getClass();
                    i2.a.b(a2Var3, "GCMUserSettings", "migrateFromMyFitSettingsPrefs -> ERROR");
                }
            }
        }
        if (i14 >= 8342) {
            if (i14 < 8560) {
                u.a aVar5 = u.f46488a;
                this.f41061a = i14;
                this.f41062b = i15;
                this.f41063c = 3;
                aVar5.getClass();
                x53.c cVar2 = o53.s0.f129406a;
                objE0 = ge1.b.e0(x53.b.f189152a, new t(null), this);
                if (objE0 != u13.a.COROUTINE_SUSPENDED) {
                    objE0 = Unit.INSTANCE;
                }
                if (objE0 != obj2) {
                    i17 = i15;
                    i15 = i17;
                }
            }
            com.airbnb.lottie.animation.keyframe.a.p(GCMSettingManager.f41535a, R.string.key_last_upgrade_version, GCMSettingManager.f41536b.edit(), i15);
            return Unit.INSTANCE;
        }
        u.a aVar6 = u.f46488a;
        this.f41061a = i14;
        this.f41062b = i15;
        this.f41063c = 2;
        if (u.a.a(aVar6, this) != obj2) {
            i16 = i14;
            i14 = i16;
            if (i14 < 8560) {
                u.a aVar7 = u.f46488a;
                this.f41061a = i14;
                this.f41062b = i15;
                this.f41063c = 3;
                aVar7.getClass();
                x53.c cVar3 = o53.s0.f129406a;
                objE0 = ge1.b.e0(x53.b.f189152a, new t(null), this);
                if (objE0 != u13.a.COROUTINE_SUSPENDED) {
                    objE0 = Unit.INSTANCE;
                }
                if (objE0 != obj2) {
                    i17 = i15;
                    i15 = i17;
                }
            }
            com.airbnb.lottie.animation.keyframe.a.p(GCMSettingManager.f41535a, R.string.key_last_upgrade_version, GCMSettingManager.f41536b.edit(), i15);
            return Unit.INSTANCE;
        }
        return obj2;
    }
}
