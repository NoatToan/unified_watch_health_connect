package com.garmin.android.apps.connectmobile.leaderboard.connections;

import androidx.lifecycle.j;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.leaderboard.model.MetricsMapDTO;
import java.util.List;
import o13.m;
import o13.t;
import o53.f0;
import p005kotlin.Metadata;
import pt0.m0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/connections/e;", "Lqt0/c;", "<init>", "()V", "a", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends qt0.c {
    public static final a D = new a(null);
    public final t C = m.b(new q42.d(this, 21));

    @Override // qt0.c
    public final qt0.a T6() {
        return (qt0.a) this.C.getValue();
    }

    @Override // qt0.c
    public final j U6() {
        return f0.N(new m0(X6(), null));
    }

    @Override // qt0.c
    public final String V6() {
        String string = getString(R.string.leaderboard_menu_item_steps);
        string.getClass();
        return string;
    }

    @Override // qt0.c
    public final void Y6(List<? extends MetricsMapDTO> list) {
        list.getClass();
        t tVar = this.C;
        ((qt0.a) tVar.getValue()).clear();
        ((qt0.a) tVar.getValue()).addAll(list);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/connections/e$a;", "", "<init>", "()V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
