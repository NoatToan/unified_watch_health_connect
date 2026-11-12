package ue;

import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import p005kotlin.Metadata;
import p13.b1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001:\u0002\u000b\fB'\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lue/j0;", "", "Ljava/util/UUID;", TtmlNode.ATTR_ID, "Lcf/t;", "workSpec", "", "", "tags", "<init>", "(Ljava/util/UUID;Lcf/t;Ljava/util/Set;)V", "a", "b", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class j0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f170092d = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f170093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cf.t f170094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set<String> f170095c;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u0012\b\u0000\u0010\u0001*\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0000*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004B\u0019\b\u0000\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lue/j0$a;", "B", "Lue/j0;", "W", "", "Ljava/lang/Class;", "Landroidx/work/d;", "workerClass", "<init>", "(Ljava/lang/Class;)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class a<B extends a<B, ?>, W extends j0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f170096a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public UUID f170097b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public cf.t f170098c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Set<String> f170099d;

        public a(Class<? extends androidx.work.d> cls) {
            cls.getClass();
            UUID uuidRandomUUID = UUID.randomUUID();
            uuidRandomUUID.getClass();
            this.f170097b = uuidRandomUUID;
            String string = this.f170097b.toString();
            string.getClass();
            this.f170098c = new cf.t(string, cls.getName());
            this.f170099d = b1.e(cls.getName());
        }

        public final W a() {
            W w14 = (W) b();
            f fVar = this.f170098c.f26950j;
            boolean z14 = !fVar.f170051i.isEmpty() || fVar.f170047e || fVar.f170045c || fVar.f170046d;
            cf.t tVar = this.f170098c;
            if (tVar.f26957q) {
                if (z14) {
                    vb.h.s("Expedited jobs only support network and storage constraints");
                    return null;
                }
                if (tVar.f26947g > 0) {
                    vb.h.s("Expedited jobs cannot be delayed");
                    return null;
                }
            }
            String str = tVar.f26964x;
            if (str == null) {
                b bVar = j0.f170092d;
                String str2 = tVar.f26943c;
                bVar.getClass();
                List listW = d53.w.W(str2, new String[]{"."});
                String strS0 = listW.size() == 1 ? (String) listW.get(0) : (String) p13.h0.m0(listW);
                if (strS0.length() > 127) {
                    strS0 = d53.y.s0(127, strS0);
                }
                tVar.f26964x = strS0;
            } else if (str.length() > 127) {
                this.f170098c.f26964x = d53.y.s0(127, str);
            }
            UUID uuidRandomUUID = UUID.randomUUID();
            uuidRandomUUID.getClass();
            this.f170097b = uuidRandomUUID;
            String string = uuidRandomUUID.toString();
            string.getClass();
            this.f170098c = new cf.t(string, this.f170098c);
            return w14;
        }

        public abstract W b();

        public abstract B c();

        public final B d(ue.a aVar, long j8, TimeUnit timeUnit) {
            aVar.getClass();
            timeUnit.getClass();
            this.f170096a = true;
            cf.t tVar = this.f170098c;
            tVar.f26952l = aVar;
            long millis = timeUnit.toMillis(j8);
            cf.t.a aVar2 = cf.t.f26940z;
            if (millis > 18000000) {
                u.a().getClass();
            }
            if (millis < AbstractComponentTracker.LINGERING_TIMEOUT) {
                u.a().getClass();
            }
            tVar.f26953m = j23.t.g(millis, AbstractComponentTracker.LINGERING_TIMEOUT, 18000000L);
            return (B) c();
        }

        public final B e(long j8, TimeUnit timeUnit) {
            timeUnit.getClass();
            this.f170098c.f26947g = timeUnit.toMillis(j8);
            if (Long.MAX_VALUE - System.currentTimeMillis() > this.f170098c.f26947g) {
                return (B) c();
            }
            vb.h.s("The given initial delay is too large and will cause an overflow!");
            return null;
        }

        public final B f(androidx.work.c cVar) {
            cVar.getClass();
            this.f170098c.f26945e = cVar;
            return (B) c();
        }
    }

    public j0(UUID uuid, cf.t tVar, Set<String> set) {
        uuid.getClass();
        tVar.getClass();
        set.getClass();
        this.f170093a = uuid;
        this.f170094b = tVar;
        this.f170095c = set;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lue/j0$b;", "", "<init>", "()V", "", "DEFAULT_BACKOFF_DELAY_MILLIS", "J", "MAX_BACKOFF_MILLIS", "MIN_BACKOFF_MILLIS", "", "MAX_TRACE_SPAN_LENGTH", "I", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }
}
