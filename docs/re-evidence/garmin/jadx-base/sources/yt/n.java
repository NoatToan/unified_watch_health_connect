package yt;

import androidx.lifecycle.s0;
import androidx.lifecycle.u1;
import androidx.lifecycle.w0;
import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.util.ArrayList;
import java.util.List;
import o53.c2;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import wd2.h0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lyt/n;", "Landroidx/lifecycle/u1;", "<init>", "()V", "a", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n extends u1 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f199339p = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y0<ot.l> f199340a = new y0<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xt.a f199341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.annual_report.preprocess.a f199342c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y0<Integer> f199343d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f199344e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y0<r> f199345f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final s0<tt.j> f199346g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final y0<Boolean> f199347h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final y0<Integer> f199348i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c2 f199349j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final y0<List<eu.g>> f199350k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ot.r f199351l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f199352m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final h0 f199353n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final y0<Integer> f199354o;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f199355a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f199356b;

        static {
            int[] iArr = new int[tt.j.values().length];
            try {
                iArr[tt.j.IDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[tt.j.PROCESSING_REPORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[tt.j.REPORT_READY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[tt.j.PROCESSING_FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f199355a = iArr;
            int[] iArr2 = new int[r.values().length];
            try {
                iArr2[r.CHAPTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[r.SHARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            f199356b = iArr2;
        }
    }

    static {
        new a(null);
    }

    public n() {
        xt.a aVar = (xt.a) KoinJavaComponent.get$default(xt.a.class, null, null, 6, null);
        this.f199341b = aVar;
        this.f199342c = (com.garmin.android.apps.connectmobile.annual_report.preprocess.a) KoinJavaComponent.get$default(com.garmin.android.apps.connectmobile.annual_report.preprocess.a.class, null, null, 6, null);
        this.f199343d = new y0<>(-1);
        this.f199344e = new ArrayList();
        this.f199345f = new y0<>();
        w0 w0VarE = aVar.f192134c.e();
        this.f199346g = w0VarE;
        this.f199347h = new y0<>(Boolean.FALSE);
        this.f199348i = new y0<>(0);
        this.f199350k = new y0<>();
        this.f199352m = true;
        h0 h0Var = new h0(this, 14);
        this.f199353n = h0Var;
        this.f199354o = new y0<>(0);
        w0VarE.g(h0Var);
    }

    public final void A4() {
        Integer numD = this.f199343d.d();
        int iIntValue = numD != null ? numD.intValue() : -1;
        ArrayList arrayList = this.f199344e;
        if (iIntValue < p13.x.j(arrayList)) {
            z4(iIntValue + 1);
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, "AnnualReportPlayerViewModel", "playNextAnimation ");
            return;
        }
        if (iIntValue == arrayList.size() - 1 && y4() == r.CHAPTER) {
            this.f199345f.j(r.SHARE);
            i2.a aVar2 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar2.getClass();
            i2.a.b(a2Var2, "AnnualReportPlayerViewModel", "tab next on Recap, jump to show Share ");
        }
    }

    public final void B4() {
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "AnnualReportPlayerViewModel", "startPlayIntro");
        r rVar = r.INTRO;
        this.f199345f.j(rVar);
        i2.a.b(a2Var, "AnnualReportPlayerViewModel", "updateCurrentPlayerViewState " + rVar);
    }

    @Override // androidx.lifecycle.u1
    public final void onCleared() {
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "AnnualReportPlayerViewModel", "onCleared");
        this.f199346g.k(this.f199353n);
        super.onCleared();
    }

    public final ot.p x4() {
        return this.f199340a.d();
    }

    public final r y4() {
        return this.f199345f.d();
    }

    public final void z4(int i14) {
        this.f199340a.j((ot.l) this.f199344e.get(i14));
        this.f199343d.j(Integer.valueOf(i14));
        y0<r> y0Var = this.f199345f;
        r rVarD = y0Var.d();
        r rVar = r.CHAPTER;
        if (rVarD != rVar) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, "AnnualReportPlayerViewModel", "updateCurrentPlayerViewState " + rVar);
            y0Var.j(rVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lyt/n$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "INITIAL_CHAPTER_INDEX", "I", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
