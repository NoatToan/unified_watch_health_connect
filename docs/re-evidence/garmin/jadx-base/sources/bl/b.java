package bl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import cz2.j;
import e23.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import o53.c0;
import o53.s0;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import p13.t0;
import p13.y;
import zk.f;
import zk.g;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0011BE\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000fB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u0010¨\u0006\u0012"}, d2 = {"Lbl/b;", "Lzk/f;", "Lbl/a;", "delegate", "Lkotlin/Function1;", "Lcl/b;", "analyticsRepo", "", "scheduledDelayMillis", "", "retryFailedUploads", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Lbl/a;Le23/l;JZLandroid/content/Context;)V", "(Lbl/a;)V", "(Lbl/a;Landroid/content/Context;Z)V", "c", "analytics-gcs_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class b implements f {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final c f18548k = new c(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Logger f18549l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Gson f18550m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bl.a f18551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l<bl.a, cl.b> f18552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f18553c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f18554d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f18555e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f18556f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<g> f18557g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ConcurrentLinkedQueue<dl.a> f18558h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final j<Unit> f18559i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final z53.b f18560j;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lbl/a;", "it", "Lcl/b;", "invoke", "(Lbl/a;)Lcl/b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends w implements l<bl.a, cl.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f18561a = new a();

        public a() {
            super(1);
        }

        @Override // e23.l
        public final cl.b invoke(bl.a aVar) {
            bl.a aVar2 = aVar;
            aVar2.getClass();
            cl.b.f27921b.getClass();
            return cl.b.a.a(aVar2);
        }
    }

    /* JADX INFO: renamed from: bl.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lbl/a;", "it", "Lcl/b;", "invoke", "(Lbl/a;)Lcl/b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class C0270b extends w implements l<bl.a, cl.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0270b f18562a = new C0270b();

        public C0270b() {
            super(1);
        }

        @Override // e23.l
        public final cl.b invoke(bl.a aVar) {
            bl.a aVar2 = aVar;
            aVar2.getClass();
            cl.b.f27921b.getClass();
            return cl.b.a.a(aVar2);
        }
    }

    static {
        Logger logger = LoggerFactory.getLogger("GcsAnalyticsService");
        logger.getClass();
        f18549l = logger;
        f18550m = new GsonBuilder().enableComplexMapKeySerialization().create();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(bl.a aVar, l<? super bl.a, cl.b> lVar, long j8, boolean z14, Context context) {
        aVar.getClass();
        lVar.getClass();
        this.f18551a = aVar;
        this.f18552b = lVar;
        this.f18553c = j8;
        this.f18554d = z14;
        this.f18555e = context;
        this.f18556f = "GCS";
        this.f18557g = p13.w.c(new e());
        this.f18558h = new ConcurrentLinkedQueue<>();
        this.f18559i = new j<>(false, null, 3, null);
        this.f18560j = z53.c.a();
    }

    @Override // zk.f
    public final List<g> a() {
        return this.f18557g;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006c  */
    /* JADX WARN: Code duplicated, block: B:27:0x007c A[LOOP:0: B:25:0x0076->B:27:0x007c, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    @Override // zk.f
    public final void b(zk.a aVar) {
        ?? arrayList;
        dl.a aVar2;
        int iA;
        LinkedHashMap linkedHashMap;
        aVar.getClass();
        f18548k.getClass();
        String str = aVar.f205029a;
        List<zk.e> list = aVar.f205030b;
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((zk.e) it.next()).f205040a.equals(str)) {
                    arrayList = new ArrayList();
                    for (zk.e eVar : list) {
                        try {
                            aVar2 = new dl.a(eVar.f205040a, Long.parseLong(eVar.f205041b.toString()), null);
                        } catch (Throwable unused) {
                            aVar2 = null;
                        }
                        if (aVar2 != null) {
                            arrayList.add(aVar2);
                        }
                    }
                }
            }
            long j8 = aVar.f205032d;
            iA = t0.a(y.r(list, 10));
            if (iA < 16) {
                iA = 16;
            }
            linkedHashMap = new LinkedHashMap(iA);
            for (zk.e eVar2 : list) {
                linkedHashMap.put(eVar2.f205040a, eVar2.f205041b);
            }
            arrayList = p13.w.c(new dl.a(str, j8, f18550m.toJsonTree(linkedHashMap)));
        } else {
            long j14 = aVar.f205032d;
            iA = t0.a(y.r(list, 10));
            if (iA < 16) {
                iA = 16;
            }
            linkedHashMap = new LinkedHashMap(iA);
            while (r1.hasNext()) {
                linkedHashMap.put(eVar2.f205040a, eVar2.f205041b);
            }
            arrayList = p13.w.c(new dl.a(str, j14, f18550m.toJsonTree(linkedHashMap)));
        }
        this.f18558h.addAll((Collection<? extends dl.a>) arrayList);
        x53.c cVar = s0.f129406a;
        ge1.b.T(c0.a(x53.b.f189152a), null, null, new bl.c(aVar, arrayList, this, null), 3);
    }

    @Override // zk.f
    /* JADX INFO: renamed from: getId, reason: from getter */
    public final String getF18556f() {
        return this.f18556f;
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\f\u001a\n \u000b*\u0004\u0018\u00010\n0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lbl/b$c;", "", "<init>", "()V", "", "DEFAULT_SCHEDULED_DELAY", "J", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "Lcom/google/gson/Gson;", "kotlin.jvm.PlatformType", "gson", "Lcom/google/gson/Gson;", "analytics-gcs_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c {
        public /* synthetic */ c(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private c() {
        }
    }

    public /* synthetic */ b(bl.a aVar, l lVar, long j8, boolean z14, Context context, int i14, p005kotlin.jvm.internal.j jVar) {
        this(aVar, lVar, (i14 & 4) != 0 ? 30000L : j8, (i14 & 8) != 0 ? false : z14, (i14 & 16) != 0 ? null : context);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(bl.a aVar) {
        this(aVar, a.f18561a, 30000L, false, null, 24, null);
        aVar.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(bl.a aVar, Context context, boolean z14) {
        this(aVar, C0270b.f18562a, 30000L, z14, context);
        aVar.getClass();
        context.getClass();
    }
}
