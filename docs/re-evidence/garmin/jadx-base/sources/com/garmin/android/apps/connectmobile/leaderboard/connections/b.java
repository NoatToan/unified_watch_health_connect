package com.garmin.android.apps.connectmobile.leaderboard.connections;

import am.x0;
import am.z0;
import androidx.lifecycle.j;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.leaderboard.model.MetricsMapDTO;
import i3.e5;
import java.util.List;
import lc.u0;
import o13.m;
import o13.t;
import o53.f0;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import pt0.k0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/connections/b;", "Lqt0/c;", "<init>", "()V", "a", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends qt0.c {
    public static final a D = new a(null);
    public final t C = m.b(new q42.d(this, 18));

    @Override // qt0.c
    public final qt0.a T6() {
        return (qt0.a) this.C.getValue();
    }

    @Override // qt0.c
    public final j U6() {
        return f0.N(new k0(X6(), z0.n(x0.f4268a3), null));
    }

    @Override // qt0.c
    public final String V6() {
        return e5.g(u0.j(getString(R.string.activity_type_parasports)), StringUtils.SPACE, getString(R.string.leaderboard_activities_label));
    }

    @Override // qt0.c
    public final void Y6(List<? extends MetricsMapDTO> list) {
        list.getClass();
        t tVar = this.C;
        ((qt0.a) tVar.getValue()).clear();
        ((qt0.a) tVar.getValue()).addAll(list);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/connections/b$a;", "", "<init>", "()V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
