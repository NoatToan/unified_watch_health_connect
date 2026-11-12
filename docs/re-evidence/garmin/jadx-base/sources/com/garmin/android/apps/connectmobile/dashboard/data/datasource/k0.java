package com.garmin.android.apps.connectmobile.dashboard.data.datasource;

import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0003H§@¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\n0\u0002H§@¢\u0006\u0004\b\u000b\u0010\u0005J \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00022\b\b\u0001\u0010\r\u001a\u00020\fH§@¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\b\b\u0001\u0010\u0011\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0012\u0010\u0013J\u001c\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\n0\u0002H§@¢\u0006\u0004\b\u0015\u0010\u0005J\u001c\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\n0\u0002H§@¢\u0006\u0004\b\u0016\u0010\u0005J\u001c\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\n0\u0002H§@¢\u0006\u0004\b\u0017\u0010\u0005¨\u0006\u0018À\u0006\u0003"}, d2 = {"Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/k0;", "", "Lc83/a0;", "Lj70/y;", JWKParameterNames.RSA_EXPONENT, "(Lt13/d;)Ljava/lang/Object;", "userFocus", "", "f", "(Lj70/y;Lt13/d;)Ljava/lang/Object;", "", "d", "", "nutritionMigrationAllowed", "Lj70/f;", "b", "(ZLt13/d;)Ljava/lang/Object;", "dashboardConfig", "a", "(Lj70/f;Lt13/d;)Ljava/lang/Object;", "Lj70/b;", "c", "h", "g", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface k0 {
    @i83.p("/userfocus-service/dashboard")
    Object a(@i83.a j70.f fVar, t13.d<? super c83.a0<Unit>> dVar);

    @i83.f("/userfocus-service/dashboard")
    Object b(@i83.t("nutritionMigrationAllowed") boolean z14, t13.d<? super c83.a0<j70.f>> dVar);

    @i83.f("/userfocus-service/dashboard/availablePrimaryStats")
    Object c(t13.d<? super c83.a0<List<j70.b>>> dVar);

    @i83.f("/userfocus-service/focus/suggestedFocuses")
    Object d(t13.d<? super c83.a0<List<j70.y>>> dVar);

    @i83.f("/userfocus-service/focus")
    Object e(t13.d<? super c83.a0<j70.y>> dVar);

    @i83.p("/userfocus-service/focus")
    Object f(@i83.a j70.y yVar, t13.d<? super c83.a0<Unit>> dVar);

    @i83.f("/userfocus-service/dashboard/availableEssentialsStats")
    Object g(t13.d<? super c83.a0<List<j70.b>>> dVar);

    @i83.f("/userfocus-service/dashboard/availableSecondaryStats")
    Object h(t13.d<? super c83.a0<List<j70.b>>> dVar);
}
