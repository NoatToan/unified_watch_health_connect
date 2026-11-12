package androidx.camera.core.impl;

import androidx.annotation.RequiresApi;
import defpackage.g2d;
import defpackage.syl;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public interface c extends p {
    public static final Config.a<UseCaseConfigFactory> f = Config.a.a("camerax.core.camera.useCaseConfigFactory", UseCaseConfigFactory.class);
    public static final Config.a<g2d> g = Config.a.a("camerax.core.camera.compatibilityId", g2d.class);
    public static final Config.a<Integer> h = Config.a.a("camerax.core.camera.useCaseCombinationRequiredRule", Integer.class);
    public static final Config.a<syl> i = Config.a.a("camerax.core.camera.SessionProcessor", syl.class);
    public static final Config.a<Boolean> j = Config.a.a("camerax.core.camera.isZslDisabled", Boolean.class);

    default int B() {
        return ((Integer) d(h, 0)).intValue();
    }

    default syl J(syl sylVar) {
        return (syl) d(i, sylVar);
    }

    default UseCaseConfigFactory k() {
        return (UseCaseConfigFactory) d(f, UseCaseConfigFactory.f1721a);
    }

    default Boolean t() {
        return (Boolean) d(j, Boolean.FALSE);
    }

    g2d w();
}
