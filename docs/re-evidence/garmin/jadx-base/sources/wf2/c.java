package wf2;

import fg2.y;
import java.util.UUID;
import org.koin.core.module.Module;
import org.koin.dsl.ModuleDSLKt;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import w40.d;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwf2/c;", "Lwf2/a;", "<init>", "()V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends wf2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f185026a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Module f185027b = ModuleDSLKt.module$default(false, new d(26), 1, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Module f185028c = ModuleDSLKt.module$default(false, new d(27), 1, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Module f185029d = ModuleDSLKt.module$default(false, new d(28), 1, null);

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"wf2/c$a", "Lfg2/y;", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements y {
        @Override // fg2.y
        public final Object a(long j8, jg2.d dVar, v13.c cVar) {
            return Unit.INSTANCE;
        }

        @Override // fg2.y
        public final Object b(long j8, v13.c cVar) {
            return null;
        }

        @Override // fg2.y
        public final Object c(long j8, UUID uuid, v13.c cVar) {
            return jg2.a.b.f98731a;
        }
    }

    private c() {
    }
}
