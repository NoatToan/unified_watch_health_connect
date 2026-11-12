package defpackage;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.selects.SelectClause0;
import kotlinx.coroutines.selects.SelectInstance;

/* JADX INFO: loaded from: classes46.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001e\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0002R\u0017\u0010\u0005\u001a\u00020\u00068F¢\u0006\f\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/selects/OnTimeout;", "", "timeMillis", "", "(J)V", "selectClause", "Lkotlinx/coroutines/selects/SelectClause0;", "getSelectClause$annotations", "()V", "getSelectClause", "()Lkotlinx/coroutines/selects/SelectClause0;", "register", "", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "ignoredParam", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class znd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f54334a;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "kotlinx/coroutines/RunnableKt$Runnable$1"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ SelectInstance f54335a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ znd f54336c;

        @Override // java.lang.Runnable
        public final void run() {
            this.f54335a.trySelect(this.f54336c, yzc.e);
        }

        public a(SelectInstance selectInstance, znd zndVar) {
            this.f54335a = selectInstance;
            this.f54336c = zndVar;
        }
    }

    public znd(long j) {
        this.f54334a = j;
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    final /* synthetic */ class c extends zcn implements Function3<znd, SelectInstance<?>, Object, yzc> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f54337b = new c();

        public final void b(znd zndVar, SelectInstance<?> selectInstance, Object obj) {
            zndVar.b(selectInstance, obj);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* synthetic */ yzc invoke(znd zndVar, SelectInstance<?> selectInstance, Object obj) {
            b(zndVar, selectInstance, obj);
            return yzc.e;
        }

        c() {
            super(3, znd.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }
    }

    public final SelectClause0 a() {
        c cVar = c.f54337b;
        zcp.e(cVar, "");
        return new znc(this, (Function3) zcy.c(cVar, 3), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(SelectInstance<?> selectInstance, Object obj) {
        if (this.f54334a <= 0) {
            selectInstance.selectInRegistrationPhase(yzc.e);
            return;
        }
        a aVar = new a(selectInstance, this);
        zcp.e(selectInstance, "");
        CoroutineContext f54350b = selectInstance.getF54350b();
        selectInstance.disposeOnCompletion(delay.a(f54350b).invokeOnTimeout(this.f54334a, aVar, f54350b));
    }
}
