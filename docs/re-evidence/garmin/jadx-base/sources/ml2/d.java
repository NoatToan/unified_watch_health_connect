package ml2;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import o53.s0;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0002\r\u000eB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\f¨\u0006\u000f"}, d2 = {"Lml2/d;", "", "", "connectionId", "Lkotlin/Function0;", "", "onResetNeeded", "Lzy2/e;", "clock", "<init>", "(Ljava/lang/String;Le23/a;Lzy2/e;)V", "Ljava/lang/Runnable;", "(Ljava/lang/String;Ljava/lang/Runnable;)V", "c", "d", "multi-link_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f119312f = new c(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final o13.t f119313g = o13.m.b(b.f119320a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e23.a<Unit> f119314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zy2.e f119315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u53.d f119316c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Logger f119317d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final az2.a<Integer, C2269d> f119318e;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a extends p005kotlin.jvm.internal.w implements e23.a<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Runnable f119319a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Runnable runnable) {
            super(0);
            this.f119319a = runnable;
        }

        @Override // e23.a
        public final Unit invoke() {
            d.f119312f.getClass();
            ((Logger) d.f119313g.getValue()).debug("onResetNeeded");
            this.f119319a.run();
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class b extends p005kotlin.jvm.internal.w implements e23.a<Logger> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f119320a = new b();

        public b() {
            super(0);
        }

        @Override // e23.a
        public final Logger invoke() {
            return LoggerFactory.getLogger(m.a("MLRWatchDog", null, d.f119312f));
        }
    }

    /* JADX INFO: renamed from: ml2.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lml2/d$d;", "", "", "Lcom/garmin/device/multilink/MultiLinkServiceId;", "serviceId", "Lzy2/e;", "clock", "<init>", "(ILzy2/e;)V", "multi-link_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class C2269d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f119321a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicInteger f119322b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AtomicLong f119323c;

        public C2269d(int i14, zy2.e eVar) {
            eVar.getClass();
            this.f119321a = i14;
            this.f119322b = new AtomicInteger(0);
            this.f119323c = new AtomicLong(eVar.millis());
        }
    }

    public d(String str, e23.a<Unit> aVar, zy2.e eVar) {
        str.getClass();
        aVar.getClass();
        eVar.getClass();
        this.f119314a = aVar;
        this.f119315b = eVar;
        x53.c cVar = s0.f129406a;
        this.f119316c = zl.a.e("MLRWatchDog", x53.b.f189152a.plus(ge1.b.h()));
        this.f119317d = LoggerFactory.getLogger(m.a("MLRWatchDog", str, this));
        this.f119318e = new az2.a<>();
    }

    public final void a(int i14) {
        C2269d c2269dRemove = this.f119318e.f13782a.remove(Integer.valueOf(i14));
        if (c2269dRemove != null) {
            this.f119317d.info("Stopped monitoring service " + c2269dRemove.f119321a + " with handle " + i14);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lml2/d$c;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "multi-link_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c {
        public /* synthetic */ c(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private c() {
        }
    }

    public /* synthetic */ d(String str, e23.a aVar, zy2.e eVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, aVar, (i14 & 4) != 0 ? new zy2.f() : eVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(String str, Runnable runnable) {
        this(str, new a(runnable), null, 4, null);
        str.getClass();
        runnable.getClass();
    }
}
