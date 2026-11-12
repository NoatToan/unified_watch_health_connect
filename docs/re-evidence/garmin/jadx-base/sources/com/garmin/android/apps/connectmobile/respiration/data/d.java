package com.garmin.android.apps.connectmobile.respiration.data;

import b63.o;
import c83.a0;
import com.garmin.android.apps.connectmobile.f0;
import fe1.n;
import i83.s;
import java.util.List;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/respiration/data/d;", "Lcom/garmin/android/apps/connectmobile/respiration/data/c;", "Lcom/garmin/android/apps/connectmobile/f0;", "<init>", "()V", "a", "b", "gcm-respiration_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements c, f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f41137a = new b(null);

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bb\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ5\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00050\u00042\b\b\u0001\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u0002H'¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lcom/garmin/android/apps/connectmobile/respiration/data/d$a;", "", "Lfz0/f;", "date", "Lo53/i0;", "Lc83/a0;", "Lbe1/a;", "a", "(Lfz0/f;)Lo53/i0;", "startDate", "endDate", "", "Lbe1/b;", "b", "(Lfz0/f;Lfz0/f;)Lo53/i0;", "gcm-respiration_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface a {
        @i83.f("/wellness-service/wellness/daily/respiration/{date}")
        i0<a0<be1.a>> a(@s("date") fz0.f date);

        @i83.f("/usersummary-service/stats/respiration/daily/{startDate}/{endDate}")
        i0<a0<List<be1.b>>> b(@s("startDate") fz0.f startDate, @s("endDate") fz0.f endDate);
    }

    @Override // com.garmin.android.apps.connectmobile.respiration.data.c
    public final Object a(o oVar, n.a.C1448a c1448a) {
        return f0.J(this, new e(oVar, null), c1448a);
    }

    @Override // com.garmin.android.apps.connectmobile.respiration.data.c
    public final Object b(o oVar, o oVar2, n.b bVar) {
        return f0.J(this, new f(oVar, oVar2, null), bVar);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/respiration/data/d$b;", "", "<init>", "()V", "gcm-respiration_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(j jVar) {
            this();
        }

        private b() {
        }
    }
}
