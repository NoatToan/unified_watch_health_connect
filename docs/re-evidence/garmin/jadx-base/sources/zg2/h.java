package zg2;

import android.os.CountDownTimer;
import e23.l;
import e23.p;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.p0;
import p13.c0;
import p13.u;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.livesessionview.util.LiveActivityTimer$startTimer$1", f = "LiveActivityTimer.kt", l = {}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g.b[] f204708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f204709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l<g.b, Unit> f204710c;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"zg2/h$a", "Landroid/os/CountDownTimer;", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends CountDownTimer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g.b f204711a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p0 f204712b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List<g.b> f204713c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ l<g.b, Unit> f204714d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ g f204715e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(g.b bVar, p0 p0Var, List<g.b> list, l<? super g.b, Unit> lVar, g gVar, long j8) {
            super(j8, 1000L);
            this.f204711a = bVar;
            this.f204712b = p0Var;
            this.f204713c = list;
            this.f204714d = lVar;
            this.f204715e = gVar;
        }

        @Override // android.os.CountDownTimer
        public final void onFinish() {
            c cVar = c.f204692a;
            g gVar = this.f204715e;
            String str = gVar.f204701a;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append(" Timer onFinish ");
            g.b bVar = this.f204711a;
            sb3.append(bVar);
            String string = sb3.toString();
            cVar.getClass();
            c.a("LiveActivityTimer", string);
            this.f204714d.invoke(bVar);
            gVar.b();
        }

        @Override // android.os.CountDownTimer
        public final void onTick(long j8) {
            long j14 = this.f204711a.f204707a - j8;
            p0 p0Var = this.f204712b;
            int i14 = p0Var.f105807a;
            List<g.b> list = this.f204713c;
            if (i14 < list.size()) {
                g.b bVar = list.get(p0Var.f105807a);
                if (((float) Math.rint(j14 / 1000)) == ((float) Math.rint(bVar.f204707a / 1000))) {
                    this.f204714d.invoke(bVar);
                    p0Var.f105807a++;
                }
            }
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(Long.valueOf(((g.b) t7).f204707a), Long.valueOf(((g.b) t14).f204707a));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h(g.b[] bVarArr, g gVar, l<? super g.b, Unit> lVar, t13.d<? super h> dVar) {
        super(2, dVar);
        this.f204708a = bVarArr;
        this.f204709b = gVar;
        this.f204710c = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h(this.f204708a, this.f204709b, this.f204710c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        ArrayList arrayListL0 = u.l0(this.f204708a);
        if (arrayListL0.size() > 1) {
            c0.u(arrayListL0, new b());
        }
        g.b bVar = (g.b) arrayListL0.remove(arrayListL0.size() - 1);
        a aVar2 = new a(bVar, new p0(), arrayListL0, this.f204710c, this.f204709b, bVar.f204707a);
        aVar2.start();
        this.f204709b.f204702b = aVar2;
        return Unit.INSTANCE;
    }
}
