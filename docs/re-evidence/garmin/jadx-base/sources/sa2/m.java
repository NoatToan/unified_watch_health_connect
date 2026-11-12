package sa2;

import android.os.CountDownTimer;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.p0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.exportablereports.presenter.ReportsDownloadPresenter$startProgressBarMovement$1", f = "ReportsDownloadPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
public final class m extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f158373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f158374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f158375c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f158376d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f158377e;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"sa2/m$a", "Landroid/os/CountDownTimer;", "exportable-reports_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends CountDownTimer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p0 f158378a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f158379b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ h f158380c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f158381d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j8, long j14, p0 p0Var, int i14, h hVar, int i15) {
            super(j8, j14);
            this.f158378a = p0Var;
            this.f158379b = i14;
            this.f158380c = hVar;
            this.f158381d = i15;
        }

        @Override // android.os.CountDownTimer
        public final void onFinish() {
            this.f158380c.f158336b.p3(this.f158381d);
        }

        @Override // android.os.CountDownTimer
        public final void onTick(long j8) {
            p0 p0Var = this.f158378a;
            int i14 = p0Var.f105807a + this.f158379b;
            p0Var.f105807a = i14;
            this.f158380c.f158336b.p3(i14);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(int i14, h hVar, long j8, long j14, int i15, t13.d<? super m> dVar) {
        super(2, dVar);
        this.f158373a = i14;
        this.f158374b = hVar;
        this.f158375c = j8;
        this.f158376d = j14;
        this.f158377e = i15;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new m(this.f158373a, this.f158374b, this.f158375c, this.f158376d, this.f158377e, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((m) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        p0 p0Var = new p0();
        int i14 = this.f158373a;
        p0Var.f105807a = i14;
        h hVar = this.f158374b;
        hVar.f158336b.p3(i14);
        hVar.f158339e = new a(this.f158375c, this.f158376d, p0Var, (int) Math.ceil(((double) (this.f158377e - i14)) / ((double) Math.max(Math.max((int) (this.f158375c / Math.max(this.f158376d, 1L)), 1), 1))), this.f158374b, this.f158377e).start();
        return Unit.INSTANCE;
    }
}
