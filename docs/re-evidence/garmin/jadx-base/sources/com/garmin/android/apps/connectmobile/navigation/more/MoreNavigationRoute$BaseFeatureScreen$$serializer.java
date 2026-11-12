package com.garmin.android.apps.connectmobile.navigation.more;

import l63.f;
import m63.e0;
import m63.m1;
import m63.u1;
import m63.y1;
import o13.e;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/navigation/more/MoreNavigationRoute.BaseFeatureScreen.$serializer", "Lm63/e0;", "Lcom/garmin/android/apps/connectmobile/navigation/more/MoreNavigationRoute$BaseFeatureScreen;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@e
public final /* synthetic */ class MoreNavigationRoute$BaseFeatureScreen$$serializer implements e0<MoreNavigationRoute.BaseFeatureScreen> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final MoreNavigationRoute$BaseFeatureScreen$$serializer f39386a;
    private static final k63.e descriptor;

    static {
        MoreNavigationRoute$BaseFeatureScreen$$serializer moreNavigationRoute$BaseFeatureScreen$$serializer = new MoreNavigationRoute$BaseFeatureScreen$$serializer();
        f39386a = moreNavigationRoute$BaseFeatureScreen$$serializer;
        m1 m1Var = new m1("com.garmin.android.apps.connectmobile.navigation.more.MoreNavigationRoute.BaseFeatureScreen", moreNavigationRoute$BaseFeatureScreen$$serializer, 1);
        m1Var.j("featureNavigationItemKey", false);
        descriptor = m1Var;
    }

    private MoreNavigationRoute$BaseFeatureScreen$$serializer() {
    }

    @Override // m63.e0
    public final i63.c<?>[] childSerializers() {
        return new i63.c[]{y1.f117048a};
    }

    @Override // i63.b
    public final Object deserialize(l63.e eVar) {
        eVar.getClass();
        k63.e eVar2 = descriptor;
        l63.c cVarC = eVar.c(eVar2);
        int i14 = l63.c.f110557a;
        u1 u1Var = null;
        boolean z14 = true;
        int i15 = 0;
        String strR = null;
        while (z14) {
            int iE = cVarC.e(eVar2);
            if (iE == -1) {
                z14 = false;
            } else {
                if (iE != 0) {
                    hb.a.o(iE);
                    return null;
                }
                strR = cVarC.r(eVar2, 0);
                i15 = 1;
            }
        }
        cVarC.b(eVar2);
        return new MoreNavigationRoute.BaseFeatureScreen(i15, strR, u1Var);
    }

    @Override // i63.i, i63.b
    /* JADX INFO: renamed from: getDescriptor */
    public final k63.e getF158591b() {
        return descriptor;
    }

    @Override // i63.i
    public final void serialize(f fVar, Object obj) {
        MoreNavigationRoute.BaseFeatureScreen baseFeatureScreen = (MoreNavigationRoute.BaseFeatureScreen) obj;
        baseFeatureScreen.getClass();
        k63.e eVar = descriptor;
        l63.d dVarC = fVar.c(eVar);
        dVarC.k(eVar, 0, baseFeatureScreen.f39385b);
        dVarC.b(eVar);
    }
}
