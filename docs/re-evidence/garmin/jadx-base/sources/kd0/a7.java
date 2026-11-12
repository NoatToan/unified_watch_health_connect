package kd0;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lkd0/a7;", "Lk42/a;", "Lf12/l;", "prefs", "<init>", "(Lf12/l;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a7 implements k42.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f12.l f103983a;

    static {
        new a(null);
    }

    public a7(f12.l lVar) {
        lVar.getClass();
        this.f103983a = lVar;
    }

    @Override // k42.a
    public final l42.d a() {
        Object next;
        l42.d dVar = l42.d.WEIGHT;
        String strA4 = this.f103983a.A4("key_weight_selected_overlay", String.valueOf(dVar.f109935a));
        if (strA4 == null) {
            return dVar;
        }
        w13.c cVar = l42.d.f109934j;
        p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
        do {
            if (!bVarN.hasNext()) {
                next = null;
                break;
            }
            next = bVarN.next();
        } while (!p005kotlin.jvm.internal.s.g(String.valueOf(((l42.d) next).f109935a), strA4));
        l42.d dVar2 = (l42.d) next;
        return dVar2 == null ? l42.d.WEIGHT : dVar2;
    }

    @Override // k42.a
    public final void b(l42.d dVar) {
        dVar.getClass();
        this.f103983a.S("key_weight_selected_overlay", String.valueOf(dVar.f109935a));
    }

    @Override // k42.a
    public final void c(int i14) {
        com.airbnb.lottie.animation.keyframe.a.p(GCMSettingManager.f41535a, R.string.key_weight_measurement_unit, GCMSettingManager.f41536b.edit(), i14);
    }

    @Override // k42.a
    public final int d() {
        int i14 = GCMSettingManager.f41536b.getInt(GCMSettingManager.f41535a.getString(R.string.key_weight_measurement_unit), 1);
        if (i14 != 0) {
            return i14 != 2 ? 1 : 2;
        }
        return 0;
    }

    @Override // k42.a
    public final float t() {
        return this.f103983a.t();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkd0/a7$a;", "", "<init>", "()V", "", "USER_WEIGHT_SELECTED_OVERLAY", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
