package i81;

import am.x0;
import android.os.Bundle;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.b1;
import h7.c;
import l22.b;
import o13.p;
import p005kotlin.Metadata;
import pi0.e;
import r53.b2;
import r53.p2;
import v71.h;
import v71.j;
import v71.k;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0012B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Li81/a;", "Landroidx/lifecycle/u1;", "Ll22/b;", "stringResolver", "Lpi0/e;", "dateFormatter", "Lv71/a;", "enduranceScoreRepo", "Lv71/k;", "staminaRepo", "Lr71/a;", "delegate", "Ly71/b;", "tabHandlingUseCase", "Lcom/garmin/android/apps/connectmobile/b1;", "featureItemAvailability", "<init>", "(Ll22/b;Lpi0/e;Lv71/a;Lv71/k;Lr71/a;Ly71/b;Lcom/garmin/android/apps/connectmobile/b1;)V", "a", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f92251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v71.a f92252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f92253c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r71.a f92254d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y71.b f92255e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b1 f92256f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f92257g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b2 f92258h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b2 f92259i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final u82.a f92260j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final u82.a f92261k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final u82.a f92262l;

    static {
        new C1761a(null);
    }

    public a(b bVar, e eVar, v71.a aVar, k kVar, r71.a aVar2, y71.b bVar2, b1 b1Var) {
        bVar.getClass();
        eVar.getClass();
        aVar.getClass();
        kVar.getClass();
        aVar2.getClass();
        bVar2.getClass();
        b1Var.getClass();
        this.f92251a = bVar;
        this.f92252b = aVar;
        this.f92253c = kVar;
        this.f92254d = aVar2;
        this.f92255e = bVar2;
        this.f92256f = b1Var;
        boolean zX = b1Var.X();
        this.f92257g = zX;
        this.f92258h = bVar2.f194695b;
        this.f92259i = bVar2.f194697d;
        this.f92260j = new u82.a(v1.a(this), new h(bVar, aVar, kVar, aVar2, zX), false, 4, null);
        this.f92261k = new u82.a(v1.a(this), new j(bVar, eVar, aVar, kVar, aVar2, 10, zX), false, 4, null);
        this.f92262l = new u82.a(v1.a(this), new j(bVar, eVar, aVar, kVar, aVar2, 6, zX), false, 4, null);
    }

    public static void x4(a aVar, String str) {
        Bundle bundle = new Bundle(0);
        aVar.getClass();
        ht.a.f85464a.getClass();
        ht.a.a(bundle, str);
    }

    public final void y4(int i14, String str) {
        if (i14 != 0) {
            if (i14 == 2) {
                Bundle bundleA = c.a(new p("Screen", "StaminaReports"), new p("ActivityType", x0.f4308n.f4358a), new p("ReportsAction", str));
                ht.a.f85464a.getClass();
                ht.a.a(bundleA, "PageView");
                return;
            } else {
                if (i14 != 3) {
                    return;
                }
                Bundle bundleA2 = c.a(new p("Screen", "StaminaReports"), new p("ActivityType", x0.f4312o.f4358a), new p("ReportsAction", str));
                ht.a.f85464a.getClass();
                ht.a.a(bundleA2, "PageView");
                return;
            }
        }
        int iHashCode = str.hashCode();
        if (iHashCode == -1321072701) {
            if (str.equals("oneYear")) {
                x4(this, "EnduranceScore1yStatsSelected");
            }
        } else if (iHashCode == -1012466858) {
            if (str.equals("oneDay")) {
                x4(this, "EnduranceScoreSelected");
            }
        } else if (iHashCode == 1798669286 && str.equals("twelveWeeks")) {
            x4(this, "EnduranceScore12wStatsSelected");
        }
    }

    public final void z4(int i14) {
        Object value;
        p2 p2Var = this.f92255e.f194696c;
        do {
            value = p2Var.getValue();
            ((Number) value).intValue();
        } while (!p2Var.b(value, Integer.valueOf(i14)));
    }

    /* JADX INFO: renamed from: i81.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Li81/a$a;", "", "<init>", "()V", "", "SCREEN_NAME", "Ljava/lang/String;", "", "ENDURANCE_SCORE_TAB_INDEX", "I", "STAMINA_RUNNING_TAB_INDEX", "STAMINA_CYCLING_TAB_INDEX", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1761a {
        public /* synthetic */ C1761a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C1761a() {
        }
    }
}
