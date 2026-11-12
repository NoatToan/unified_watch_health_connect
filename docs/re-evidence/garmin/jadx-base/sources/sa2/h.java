package sa2;

import android.content.Context;
import android.os.CountDownTimer;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.R;
import i3.e5;
import j20.x;
import java.io.InputStream;
import java.sql.Date;
import o13.r;
import o53.b0;
import o53.c0;
import o53.m0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lsa2/h;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lua2/b;", "reportsDownloadDelegate", "Lqa2/e;", "reportsDataStore", "<init>", "(Landroid/content/Context;Lua2/b;Lqa2/e;)V", "a", "exportable-reports_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final wa2.b f158334i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f158335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ua2.b f158336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qa2.e f158337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f158338d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CountDownTimer f158339e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final u53.d f158340f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u53.d f158341g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f158342h;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.exportablereports.presenter.ReportsDownloadPresenter$acknowledgeReportSuccess$1", f = "ReportsDownloadPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f158343a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.l<Unit, Unit> f158345c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(e23.l<? super Unit, Unit> lVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f158345c = lVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = h.this.new b(this.f158345c, dVar);
            bVar.f158343a = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            b0 b0Var = (b0) this.f158343a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            h hVar = h.this;
            qa2.e eVar = hVar.f158337c;
            i iVar = new i(b0Var, hVar, this.f158345c, 0);
            qa2.e.f143900h.getClass();
            x53.c cVar = s0.f129406a;
            ge1.b.T(c0.a(x53.b.f189152a), null, null, new qa2.f(eVar, iVar, null), 3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.exportablereports.presenter.ReportsDownloadPresenter$downloadReportFromGC$1", f = "ReportsDownloadPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f158346a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.l<String, Unit> f158348c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(e23.l<? super String, Unit> lVar, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f158348c = lVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            c cVar = h.this.new c(this.f158348c, dVar);
            cVar.f158346a = obj;
            return cVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            b0 b0Var = (b0) this.f158346a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            h hVar = h.this;
            qa2.e eVar = hVar.f158337c;
            i iVar = new i(b0Var, hVar, this.f158348c, 1);
            qa2.e.f143900h.getClass();
            x53.c cVar = s0.f129406a;
            ge1.b.T(c0.a(x53.b.f189152a), null, null, new qa2.g(eVar, iVar, null), 3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.exportablereports.presenter.ReportsDownloadPresenter$getReportStatus$1", f = "ReportsDownloadPresenter.kt", l = {300}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f158349a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f158350b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.p<Boolean, String, Unit> f158352d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(e23.p<? super Boolean, ? super String, Unit> pVar, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f158352d = pVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            d dVar2 = h.this.new d(this.f158352d, dVar);
            dVar2.f158350b = obj;
            return dVar2;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            b0 b0Var = (b0) this.f158350b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f158349a;
            h hVar = h.this;
            if (i14 == 0) {
                r.b(obj);
                qa2.b bVar = hVar.f158337c.f143905e;
                if (bVar != null) {
                    long estimatedTimeForStatusCheck = bVar.getEstimatedTimeForStatusCheck();
                    this.f158350b = b0Var;
                    this.f158349a = 1;
                    if (m0.b(estimatedTimeForStatusCheck, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            qa2.e eVar = hVar.f158337c;
            rp.b bVar2 = new rp.b(b0Var, 12, hVar, this.f158352d);
            qa2.e.f143900h.getClass();
            x53.c cVar = s0.f129406a;
            ge1.b.T(c0.a(x53.b.f189152a), null, null, new qa2.i(eVar, bVar2, null), 3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.exportablereports.presenter.ReportsDownloadPresenter$reportFetchingReportFailure$1", f = "ReportsDownloadPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f158354b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, t13.d<? super e> dVar) {
            super(2, dVar);
            this.f158354b = str;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return h.this.new e(this.f158354b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            String string;
            String string2;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            h hVar = h.this;
            ua2.b bVar = hVar.f158336b;
            Context context = hVar.f158335a;
            h.f158334i.getClass();
            qa2.k kVar = qa2.k.DATA_NOT_FOUND;
            String str = kVar.f143942a;
            String str2 = this.f158354b;
            if (s.g(str2, str)) {
                string = context.getString(R.string.download_failure_title);
                string.getClass();
            } else if (s.g(str2, qa2.k.TOO_MANY_REQUESTS.f143942a)) {
                string = context.getString(R.string.download_report_too_many_reports_request_title);
                string.getClass();
            } else {
                string = context.getString(R.string.download_failure_title);
                string.getClass();
            }
            if (s.g(str2, kVar.f143942a)) {
                string2 = context.getString(R.string.download_report_not_available_message);
                string2.getClass();
            } else if (s.g(str2, qa2.k.TOO_MANY_REQUESTS.f143942a)) {
                string2 = context.getString(R.string.download_report_too_many_reports_request_message);
                string2.getClass();
            } else {
                string2 = context.getString(R.string.download_failure_message);
                string2.getClass();
            }
            bVar.C4(wa2.c.a.a(wa2.c.f183804a, context, string, string2, new o13.p(context.getString(R.string.lbl_ok), new sa2.e(hVar, 3)), null, SyslogConstants.LOG_LOCAL6));
            hVar.f158338d = false;
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
        f158334i = new wa2.b("ReportsDownloadPresenter", null, 2, null);
    }

    public h(Context context, ua2.b bVar, qa2.e eVar) {
        context.getClass();
        bVar.getClass();
        eVar.getClass();
        this.f158335a = context;
        this.f158336b = bVar;
        this.f158337c = eVar;
        x53.c cVar = s0.f129406a;
        this.f158340f = c0.a(x53.b.f189152a.plus(g8.i.c()));
        this.f158341g = c0.a(u53.o.f168762a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(h hVar, InputStream inputStream, e23.l lVar) {
        String strD;
        T tConcat;
        hVar.getClass();
        f158334i.getClass();
        r0 r0Var = new r0();
        pa2.b.f136781a.getClass();
        String str = pa2.b.a.a().f136778j;
        Date date = pa2.b.a.a().f136776h;
        Date date2 = pa2.b.a.a().f136777i;
        String strA = date != null ? wa2.a.C3407a.a(wa2.a.f183799a, date, 3) : null;
        String strA2 = date2 != null ? wa2.a.C3407a.a(wa2.a.f183799a, date2, 3) : null;
        if (s.g(strA, strA2)) {
            strD = e5.g(str, "_", date != null ? wa2.a.C3407a.a(wa2.a.f183799a, date, 1) : null);
        } else {
            strD = x.d(str, "_", strA, "-", strA2);
        }
        if (strD.length() == 0) {
            tConcat = tn.k.g(pa2.b.a.a().f136778j, ".pdf");
        } else {
            tConcat = strD.length() > 86 ? strD.substring(0, 85).concat(".pdf") : strD.concat(".pdf");
        }
        r0Var.f105810a = tConcat;
        ge1.b.T(hVar.f158340f, null, null, new j(hVar, r0Var, inputStream, lVar, null), 3);
    }

    public static void h(h hVar, int i14, int i15) {
        hVar.getClass();
        f158334i.getClass();
        ge1.b.T(hVar.f158341g, null, null, new m(i14, hVar, 60000L, 1000L, i15, null), 3);
    }

    public final void b(e23.l<? super Unit, Unit> lVar) {
        f158334i.getClass();
        this.f158342h++;
        h(this, 95, 100);
        ge1.b.T(this.f158340f, null, null, new b(lVar, null), 3);
    }

    public final void c() {
        CountDownTimer countDownTimer = this.f158339e;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    public final void d(e23.l<? super String, Unit> lVar) {
        f158334i.getClass();
        h(this, 75, 95);
        ge1.b.T(this.f158340f, null, null, new c(lVar, null), 3);
    }

    public final void e() {
        CountDownTimer countDownTimer = this.f158339e;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        CountDownTimer countDownTimer2 = this.f158339e;
        if (countDownTimer2 != null) {
            countDownTimer2.onFinish();
        }
    }

    public final void f(boolean z14, e23.p<? super Boolean, ? super String, Unit> pVar) {
        f158334i.getClass();
        if (z14) {
            h(this, 25, 75);
        }
        ge1.b.T(this.f158340f, null, null, new d(pVar, null), 3);
    }

    public final void g(String str) {
        f158334i.getClass();
        ge1.b.T(this.f158341g, null, null, new e(str, null), 3);
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u0014\u0010\u0010\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u0014\u0010\u0011\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u0014\u0010\u0012\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u0014\u0010\u0013\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\fR\u0014\u0010\u0019\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\tR\u0014\u0010\u001a\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\t¨\u0006\u001b"}, d2 = {"Lsa2/h$a;", "", "<init>", "()V", "Lwa2/b;", "logger", "Lwa2/b;", "", "FILE_PATH", "Ljava/lang/String;", "", "PROGRESS_BAR_REPORT_ID_MIN_PROGRESS_VALUE", "I", "PROGRESS_BAR_REPORT_ID_MAX_PROGRESS_VALUE", "PROGRESS_BAR_REPORT_STATUS_MIN_PROGRESS_VALUE", "PROGRESS_BAR_REPORT_STATUS_MAX_PROGRESS_VALUE", "PROGRESS_BAR_DOWNLOAD_MIN_PROGRESS_VALUE", "PROGRESS_BAR_DOWNLOAD_MAX_PROGRESS_VALUE", "PROGRESS_BAR_ACK_MIN_PROGRESS_VALUE", "PROGRESS_BAR_ACK_MAX_PROGRESS_VALUE", "", "PROGRESS_BAR_TOTAL_TIME_FOR_COMPLETION_IN_MILLISECONDS", "J", "PROGRESS_BAR_INTERVAL_PER_EACH_UPDATE_IN_MILLISECONDS", "ACK_RETRY_MAX_LIMIT", "UNDERSCORE_CHARACTER", "PDF_EXTENSION", "exportable-reports_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
