package xa1;

import androidx.lifecycle.u1;
import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.powerguide.PowerGuideAlgorithm;
import o53.c2;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lxa1/k;", "Landroidx/lifecycle/u1;", "Lab1/g;", "powerGuidanceSummary", "", "powerGuideToReplace", "<init>", "(Lab1/g;Ljava/lang/Long;)V", "a", "gcm-power-guide_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k extends u1 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f189751k = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ab1.g f189752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f189753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PowerGuideAlgorithm f189754c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final sa1.m f189755d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final sa1.a0 f189756e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final sa1.j f189757f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o13.t f189758g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c2 f189759h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final y0<ab1.f> f189760i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final y0<Boolean> f189761j;

    static {
        new a(null);
    }

    public k(ab1.g gVar, Long l14) {
        gVar.getClass();
        this.f189752a = gVar;
        this.f189753b = l14;
        this.f189754c = new PowerGuideAlgorithm();
        this.f189755d = sa1.m.a.a(sa1.m.f158284b);
        this.f189756e = sa1.a0.a.a(sa1.a0.f158256b);
        this.f189757f = (sa1.j) KoinJavaComponent.get$default(sa1.j.class, null, null, 6, null);
        this.f189758g = o13.m.b(new j(0));
        this.f189760i = new y0<>();
        y0<Boolean> y0Var = new y0<>();
        this.f189761j = y0Var;
        y0Var.j(Boolean.valueOf(gVar.f2568a == null));
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lxa1/k$a;", "", "<init>", "()V", "", "WEIGHT_CHANGE_THRESHOLD", "D", "", "FTP_CHANGE_THRESHOLD", "I", "gcm-power-guide_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
