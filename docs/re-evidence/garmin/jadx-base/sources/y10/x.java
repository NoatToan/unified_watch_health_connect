package y10;

import com.garmin.android.apps.connectmobile.v2;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Lq10/b;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.connectiq.viewmodel.ConnectIQDownloadViewModel$installLegacyApp$result$1", f = "ConnectIQDownloadViewModel.kt", l = {339}, m = "invokeSuspend", v = 2)
public final class x extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends List<? extends q10.b>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f194009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o10.b f194010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f194011c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "", "Lq10/b;", "<anonymous>", "()Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.connectiq.viewmodel.ConnectIQDownloadViewModel$installLegacyApp$result$1$1", f = "ConnectIQDownloadViewModel.kt", l = {340}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.l<t13.d<? super v2<? extends List<? extends q10.b>>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f194012a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ k f194013b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ q10.c f194014c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k kVar, q10.c cVar, t13.d<? super a> dVar) {
            super(1, dVar);
            this.f194013b = kVar;
            this.f194014c = cVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new a(this.f194013b, this.f194014c, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super v2<? extends List<? extends q10.b>>> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f194012a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            k kVar = this.f194013b;
            r10.d dVar = kVar.f193905d;
            q10.a aVar2 = new q10.a(String.valueOf(kVar.f193903b), p13.x.d(this.f194014c));
            this.f194012a = 1;
            Object objE = dVar.e(aVar2, this);
            return objE == aVar ? aVar : objE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(o10.b bVar, k kVar, t13.d<? super x> dVar) {
        super(2, dVar);
        this.f194010b = bVar;
        this.f194011c = kVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new x(this.f194010b, this.f194011c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends List<? extends q10.b>>> dVar) {
        return ((x) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f194009a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        o10.b bVar = this.f194010b;
        a aVar2 = new a(this.f194011c, new q10.c(bVar.f(), bVar.getInternalVersion()), null);
        this.f194009a = 1;
        Object objA = p10.e.a(aVar2, "Error occurred", this);
        return objA == aVar ? aVar : objA;
    }
}
