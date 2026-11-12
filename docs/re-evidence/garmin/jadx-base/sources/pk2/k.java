package pk2;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import o53.j2;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.k0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.device.filetransfer.core.agent.AgentQueueHelper$populateQueueFromCache$1", f = "AgentQueueHelper.kt", l = {208}, m = "invokeSuspend")
public final class k extends v13.i implements e23.l<t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f138415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f138416b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.device.filetransfer.core.agent.AgentQueueHelper$populateQueueFromCache$1$1", f = "AgentQueueHelper.kt", l = {}, m = "invokeSuspend")
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f138417a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b bVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f138417a = bVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f138417a, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            b bVar = this.f138417a;
            List<c0> list = bVar.f138360c.getConfiguration().f132621a;
            zk2.d dVar = bVar.f138358a;
            cl2.h hVar = cl2.h.f27950a;
            rs2.c cVar = bVar.f138359b;
            long f92746j = cVar.getF92746j();
            hVar.getClass();
            String str = tn.k.g(cl2.h.f27953d, "//source") + "/" + f92746j;
            ArrayList<o13.p> arrayList = new ArrayList();
            File[] fileArrListFiles = new File(str).listFiles();
            if (fileArrListFiles != null) {
                int length = fileArrListFiles.length;
                int i14 = 0;
                int i15 = 0;
                while (i15 < length) {
                    File file = fileArrListFiles[i15];
                    if (file.isFile()) {
                        List listW = d53.w.W(a23.g.f(file), new String[]{"--"});
                        if (listW.size() != 2) {
                            com.airbnb.lottie.animation.keyframe.a.A("Failed to parse file type/id for ", file.getName(), cl2.h.f27951b);
                        } else {
                            String str2 = (String) listW.get(i14);
                            try {
                                UUID uuidFromString = UUID.fromString((String) listW.get(1));
                                uuidFromString.getClass();
                                wk2.f.a aVar2 = wk2.f.f185841i;
                                long length2 = file.length();
                                k0 k0Var = k0.f134949a;
                                k0Var.getClass();
                                aVar2.getClass();
                                wk2.f fVarA = wk2.f.a.a(uuidFromString, str2, length2, k0Var);
                                arrayList.add(new o13.p(fVarA, new wk2.o(file, fVarA)));
                            } catch (Exception unused) {
                            }
                        }
                    }
                    i15++;
                    i14 = 0;
                }
            }
            ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
            for (o13.p pVar : arrayList) {
                wk2.f fVar = (wk2.f) pVar.f128594a;
                arrayList2.add(wk2.i.a.b(wk2.i.f185855a, fVar, (wk2.e) pVar.f128595b, cl2.c.e(list, fVar, cVar), wk2.m.f185862b, bVar.f138360c.a(), null, null, 224));
            }
            dVar.a(arrayList2);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(b bVar, t13.d<? super k> dVar) {
        super(1, dVar);
        this.f138416b = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new k(this.f138416b, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super Unit> dVar) {
        return ((k) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f138415a;
        b bVar = this.f138416b;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                a aVar2 = new a(bVar, null);
                this.f138415a = 1;
                if (j2.b(30000L, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
        } catch (Exception e4) {
            com.airbnb.lottie.animation.keyframe.a.A("Failed populateQueueFromCache: ", e4.getMessage(), bVar.f138362e);
        }
        return Unit.INSTANCE;
    }
}
