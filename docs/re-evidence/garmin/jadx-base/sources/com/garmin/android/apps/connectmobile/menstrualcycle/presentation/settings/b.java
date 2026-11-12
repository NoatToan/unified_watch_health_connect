package com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings;

import j23.l;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import ww0.i;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/settings/b;", "", "<init>", "()V", "a", "gcm-domain-womens-health_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f39089a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f39090b = new l(20, 45);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/settings/b$a;", "", "<init>", "()V", "", "PERIOD_LENGTH_MIN", "I", "PERIOD_LENGTH_MAX", "PERIOD_LENGTH_DEFAULT", "CYCLE_LENGTH_MAX", "CYCLE_LENGTH_DEFAULT", "PERIOD_PREDICTIONS_MAX_LENGTH", "gcm-domain-womens-health_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static boolean b(ww0.a aVar, i iVar, boolean z14, int i14) {
            aVar.getClass();
            iVar.getClass();
            if (aVar == ww0.a.NONE || iVar != i.NONE || !z14) {
                return false;
            }
            l lVar = b.f39090b;
            return i14 <= lVar.f96797b && lVar.f96796a <= i14;
        }

        public static boolean c(a aVar) {
            aVar.getClass();
            i52.a aVar2 = i52.a.f91796a;
            aVar2.getClass();
            ww0.a aVarL = i52.a.l();
            aVar.getClass();
            aVar2.getClass();
            i iVarO = i52.a.o();
            boolean zF = f(aVar, aVarL);
            aVar.getClass();
            aVarL.getClass();
            iVarO.getClass();
            aVar2.getClass();
            if (!b(aVarL, iVarO, zF, i52.a.a())) {
                return false;
            }
            f12.l.f68084a.getClass();
            return f12.l.a.a().z0();
        }

        public static boolean d(a aVar) {
            aVar.getClass();
            i52.a aVar2 = i52.a.f91796a;
            aVar2.getClass();
            ww0.a aVarL = i52.a.l();
            aVar.getClass();
            aVarL.getClass();
            if (aVarL == ww0.a.NONE) {
                return false;
            }
            aVar2.getClass();
            f12.l.f68084a.getClass();
            return f12.l.a.a().s3();
        }

        public static boolean e(ww0.a aVar, int i14) {
            aVar.getClass();
            return aVar != ww0.a.NONE && i14 <= 100;
        }

        public static boolean f(a aVar, ww0.a aVar2) {
            aVar.getClass();
            i52.a.f91796a.getClass();
            int iA = i52.a.a();
            aVar.getClass();
            return e(aVar2, iA);
        }

        public static boolean g(a aVar) {
            aVar.getClass();
            i52.a aVar2 = i52.a.f91796a;
            aVar2.getClass();
            ww0.a aVarL = i52.a.l();
            aVar.getClass();
            aVarL.getClass();
            if (!f(aVar, aVarL)) {
                return false;
            }
            aVar2.getClass();
            f12.l.f68084a.getClass();
            return f12.l.a.a().P3();
        }

        public final boolean a(ww0.l lVar) {
            if (lVar == null) {
                i52.a.f91796a.getClass();
                return i52.a.l() != ww0.a.NONE;
            }
            i52.a.f91796a.getClass();
            if (i52.a.l() != ww0.a.NONE) {
                if (g(this) == (lVar.getPeriodLength() != null)) {
                    if (c(this) == (lVar.getFertileWindowStartDay() != null)) {
                        if (g(this)) {
                            if ((i52.a.o() == i.NONE) != (lVar.getLutealPhaseStart() != null)) {
                            }
                        }
                    }
                }
            }
        }

        private a() {
        }
    }
}
