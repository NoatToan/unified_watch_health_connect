package u7;

import java.io.File;
import java.util.LinkedHashMap;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lq53/t;", "", "<anonymous>", "(Lq53/t;)V"}, k = 3, mv = {1, 8, 0})
@v13.e(c = "androidx.datastore.core.MulticastFileObserver$Companion$observe$1", f = "MulticastFileObserver.android.kt", l = {84, 85}, m = "invokeSuspend")
public final class e1 extends v13.i implements e23.p<q53.t<? super Unit>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p53.a f169118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f169119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f169120c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ File f169121d;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a extends p005kotlin.jvm.internal.w implements e23.a<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o53.u0 f169122a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(o53.u0 u0Var) {
            super(0);
            this.f169122a = u0Var;
        }

        @Override // e23.a
        public final Unit invoke() {
            this.f169122a.dispose();
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "fileName", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class b extends p005kotlin.jvm.internal.w implements e23.l<String, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ File f169123a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ q53.t<Unit> f169124b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(File file, q53.t<? super Unit> tVar) {
            super(1);
            this.f169123a = file;
            this.f169124b = tVar;
        }

        @Override // e23.l
        public final Unit invoke(String str) {
            if (p005kotlin.jvm.internal.s.g(str, this.f169123a.getName())) {
                og.a.d0(this.f169124b, Unit.INSTANCE);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(File file, t13.d<? super e1> dVar) {
        super(2, dVar);
        this.f169121d = file;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        e1 e1Var = new e1(this.f169121d, dVar);
        e1Var.f169120c = obj;
        return e1Var;
    }

    @Override // e23.p
    public final Object invoke(q53.t<? super Unit> tVar, t13.d<? super Unit> dVar) {
        return ((e1) create(tVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0099, code lost:
    
        if (q53.r.a(r4, r10, r9) == r0) goto L27;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        q53.t tVar;
        p53.a aVar;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f169119b;
        if (i14 != 0) {
            if (i14 == 1) {
                aVar = this.f169118a;
                tVar = (q53.t) this.f169120c;
                o13.r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        q53.t tVar2 = (q53.t) this.f169120c;
        b bVar = new b(this.f169121d, tVar2);
        f1.a aVar3 = f1.f169129b;
        File parentFile = this.f169121d.getParentFile();
        parentFile.getClass();
        aVar3.getClass();
        String path = parentFile.getCanonicalFile().getPath();
        synchronized (f1.f169130c) {
            try {
                LinkedHashMap linkedHashMap = f1.f169131d;
                path.getClass();
                Object f1Var = linkedHashMap.get(path);
                if (f1Var == null) {
                    f1Var = new f1(path, null);
                    linkedHashMap.put(path, f1Var);
                }
                f1 f1Var2 = (f1) f1Var;
                f1Var2.f169132a.add(bVar);
                if (f1Var2.f169132a.size() == 1) {
                    f1Var2.startWatching();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        p53.a aVar4 = new p53.a(1, path, bVar);
        Unit unit = Unit.INSTANCE;
        this.f169120c = tVar2;
        this.f169118a = aVar4;
        this.f169119b = 1;
        if (tVar2.h(unit, this) != aVar2) {
            tVar = tVar2;
            aVar = aVar4;
        }
        return aVar2;
        a aVar5 = new a(aVar);
        this.f169120c = null;
        this.f169118a = null;
        this.f169119b = 2;
    }
}
