package com.garmin.android.apps.connectmobile.settings.devices.swim;

import am.g2;
import ch1.h3;
import ch1.m2;
import ch1.x4;
import com.garmin.android.apps.connectmobile.R;
import fb2.k;
import java.util.Observable;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import qs.y;
import vg1.f0;
import vg1.k0;
import zb0.u0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/swim/PoolSizeActivity;", "Lvg1/f0;", "<init>", "()V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PoolSizeActivity extends f0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f43142k = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public m2 f43143i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public x4 f43144j;

    @Override // vg1.f0
    public final void da() {
        u0 u0VarO = this.f178102a.o();
        if (u0VarO != null) {
            ca(new h3(this, u0VarO), 3);
        }
        ca(new k(this), 2);
        m2 m2Var = new m2(this);
        this.f43143i = m2Var;
        ca(m2Var, 3);
        x4 x4Var = new x4(this);
        this.f43144j = x4Var;
        ca(x4Var, 3);
    }

    @Override // vg1.f0
    public final int ea() {
        return 8;
    }

    @Override // vg1.f0
    public final k0 fa() {
        return new k0(this, this, 8);
    }

    @Override // vg1.f0
    public final String ga() {
        String string = getString(R.string.workout_pool_size);
        string.getClass();
        return string;
    }

    @Override // vg1.f0
    public final void ja() {
        g2 g2Var = g2.f3980i;
        g2Var.f3984c = 14.0d;
        g2Var.f3985d = y.UNIT_DISTANCE_METER.f147239a;
        super.ja();
        g2 g2VarA = g2.a(this.f178102a.n().k0(), this.f178102a.n().o0());
        g2VarA.getClass();
        na(g2VarA == g2Var);
    }

    public final void na(boolean z14) {
        m2 m2Var = this.f43143i;
        if (m2Var == null) {
            s.m("lengthField");
            throw null;
        }
        m2Var.m(z14);
        x4 x4Var = this.f43144j;
        if (x4Var == null) {
            s.m("unitsField");
            throw null;
        }
        x4Var.m(z14);
        if (z14) {
            m2 m2Var2 = this.f43143i;
            if (m2Var2 != null) {
                m2Var2.g(this, this.f178102a.n());
            } else {
                s.m("lengthField");
                throw null;
            }
        }
    }

    @Override // vg1.f0, java.util.Observer
    public final void update(Observable observable, Object obj) {
        obj.getClass();
        if (observable instanceof h3) {
            na(((g2) obj) == g2.f3980i);
            return;
        }
        if (observable instanceof x4) {
            m2 m2Var = this.f43143i;
            if (m2Var != null) {
                m2Var.k(this.f178102a.n());
            } else {
                s.m("lengthField");
                throw null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/swim/PoolSizeActivity$a;", "", "<init>", "()V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
