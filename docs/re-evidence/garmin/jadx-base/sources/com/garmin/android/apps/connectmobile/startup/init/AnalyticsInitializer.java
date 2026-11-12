package com.garmin.android.apps.connectmobile.startup.init;

import android.content.Context;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import c22.l;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.google.firebase.analytics.FirebaseAnalytics;
import ht.s;
import j70.r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.d0;
import p13.w;
import zd.b;
import zk.c;
import zk.d;
import zk.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/startup/init/AnalyticsInitializer;", "Lzd/b;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AnalyticsInitializer implements b<Unit> {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f44872a;

        static {
            int[] iArr = new int[l.values().length];
            try {
                iArr[l.DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l.LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[l.SYSTEM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f44872a = iArr;
        }
    }

    @Override // zd.b
    public final Unit create(final Context context) {
        String str;
        context.getClass();
        int iCharCount = 0;
        f[] fVarArr = {new al.b(context)};
        c cVar = c.f205034a;
        f[] fVarArr2 = (f[]) Arrays.copyOf(fVarArr, 1);
        cVar.getClass();
        d0.w(c.f205035b, fVarArr2);
        yy2.b bVar = yy2.b.f200198a;
        d dVar = new d(cVar, null, w.c("FIREBASE"));
        bVar.getClass();
        yy2.b.f200199b = dVar;
        for (zk.a aVar : yy2.b.a(context)) {
            d dVar2 = yy2.b.f200199b;
            if (dVar2 != null) {
                dVar2.a(aVar);
            }
        }
        Object systemService = context.getSystemService("accessibility");
        AccessibilityManager accessibilityManager = systemService instanceof AccessibilityManager ? (AccessibilityManager) systemService : null;
        if (accessibilityManager != null) {
            accessibilityManager.addAccessibilityStateChangeListener(new AccessibilityManager.AccessibilityStateChangeListener() { // from class: yy2.a
                @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
                public final void onAccessibilityStateChanged(boolean z14) {
                    b bVar2 = b.f200198a;
                    Context context2 = context;
                    context2.getClass();
                    b.f200198a.getClass();
                    for (zk.a aVar2 : b.a(context2)) {
                        d dVar3 = b.f200199b;
                        if (dVar3 != null) {
                            dVar3.a(aVar2);
                        }
                    }
                }
            });
        }
        ht.a.f85464a.getClass();
        i2.a aVar2 = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar2.getClass();
        i2.a.b(a2Var, "AnalyticsLogger", "initAnalytics: init firebase logging");
        s.f85508a.getClass();
        ht.f fVar = ht.a.f85465b;
        fVar.getClass();
        FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(context);
        firebaseAnalytics.getClass();
        fVar.f85472a = firebaseAnalytics;
        String string = GCMSettingManager.f41536b.getString("FIREBASE_USER_ID", null);
        if (string == null) {
            string = UUID.randomUUID().toString();
            GCMSettingManager.f41536b.edit().putString("FIREBASE_USER_ID", string).commit();
            break;
        }
        int length = string.length();
        while (true) {
            if (iCharCount >= length) {
                string = UUID.randomUUID().toString();
                GCMSettingManager.f41536b.edit().putString("FIREBASE_USER_ID", string).commit();
                break;
            }
            int iCodePointAt = string.codePointAt(iCharCount);
            if (!Character.isWhitespace(iCodePointAt)) {
                break;
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        s.f85508a.getClass();
        FirebaseAnalytics firebaseAnalytics2 = ht.a.f85465b.f85472a;
        if (firebaseAnalytics2 != null) {
            firebaseAnalytics2.setUserId(string);
        }
        f12.l.f68084a.getClass();
        int i14 = a.f44872a[f12.l.a.a().E2().ordinal()];
        if (i14 == 1) {
            str = "dark";
        } else if (i14 == 2) {
            str = "light";
        } else {
            if (i14 != 3) {
                u0.r();
                return null;
            }
            if (Build.VERSION.SDK_INT >= 30) {
                str = context.getResources().getConfiguration().isNightModeActive() ? "system (dark)" : "system (light)";
            } else {
                str = "system";
            }
        }
        ht.a.c("CurrentAppTheme", str);
        String strH4 = f12.l.a.a().h4();
        if (strH4 == null) {
            strH4 = r.f97629l.f97636a;
        }
        s.c(new lt.d(strH4));
        return Unit.INSTANCE;
    }

    @Override // zd.b
    public final List<Class<? extends b<?>>> dependencies() {
        return new ArrayList();
    }
}
