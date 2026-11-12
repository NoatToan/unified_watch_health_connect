package com.garmin.android.apps.connectmobile.golf.truswing;

import androidx.lifecycle.u1;
import com.garmin.android.apps.connectmobile.golf.truswing.model.SwingDTO;
import p005kotlin.Metadata;
import wl0.a0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/golf/truswing/c;", "Landroidx/lifecycle/u1;", "<init>", "()V", "gcm-golf_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ql0.b f35814a = ql0.b.a.a(ql0.b.f145209b);

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f35815a;

        static {
            int[] iArr = new int[a0.values().length];
            try {
                iArr[a0.HISTORICAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a0.REAL_TIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a0.MIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f35815a = iArr;
        }
    }

    public static final void x4(c cVar, SwingDTO swingDTO) {
        cVar.getClass();
        com.garmin.android.apps.connectmobile.golf.truswing.model.k kVar = swingDTO.f35875d;
        if (kVar == null) {
            kVar = new com.garmin.android.apps.connectmobile.golf.truswing.model.k();
        }
        wl0.h hVarI = wl0.h.i();
        kVar.f35953b = hVarI != null ? hVarI.j(kVar.f35954c.f20622a) : null;
        swingDTO.f35875d = kVar;
    }
}
