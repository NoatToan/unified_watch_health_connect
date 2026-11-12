package iw2;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import o53.l1;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lo53/l1;", "<anonymous>", "(Lo53/b0;)Lo53/l1;"}, k = 3, mv = {2, 2, 0})
@v13.e(c = "com.garmin.realtimesettings.app.datahandler.RTSPhoneStorageCoordinator$saveTextFileToCompositionFolder$2", f = "RTSPhoneStorageCoordinator.kt", l = {}, m = "invokeSuspend", v = 1)
public final class v extends v13.i implements e23.p<o53.b0, t13.d<? super l1>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f95533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f95534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f95535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f95536d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f95537e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 2, 0})
    @v13.e(c = "com.garmin.realtimesettings.app.datahandler.RTSPhoneStorageCoordinator$saveTextFileToCompositionFolder$2$1", f = "RTSPhoneStorageCoordinator.kt", l = {147}, m = "invokeSuspend", v = 1)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f95538a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f95539b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f95540c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f95541d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f95542e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Context context, long j8, String str2, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f95539b = str;
            this.f95540c = context;
            this.f95541d = j8;
            this.f95542e = str2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f95539b, this.f95540c, this.f95541d, this.f95542e, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f95538a;
            if (i14 == 0) {
                o13.r.b(obj);
                w.f95547a.getClass();
                w.f95548b.getClass();
                this.f95538a = 1;
                x53.c cVar = o53.s0.f129406a;
                obj = ge1.b.e0(x53.b.f189152a, new c(this.f95540c, this.f95541d, this.f95539b, null), this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            FileOutputStream fileOutputStream = new FileOutputStream((File) obj);
            try {
                byte[] bytes = this.f95542e.getBytes(d53.c.f57666b);
                bytes.getClass();
                fileOutputStream.write(bytes);
            } catch (Exception unused) {
            } finally {
                fileOutputStream.flush();
                fileOutputStream.close();
                w.f95547a.getClass();
                w.f95548b.getClass();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(String str, Context context, long j8, String str2, t13.d<? super v> dVar) {
        super(2, dVar);
        this.f95534b = str;
        this.f95535c = context;
        this.f95536d = j8;
        this.f95537e = str2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        v vVar = new v(this.f95534b, this.f95535c, this.f95536d, this.f95537e, dVar);
        vVar.f95533a = obj;
        return vVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super l1> dVar) {
        return ((v) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        o53.b0 b0Var = (o53.b0) this.f95533a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        x53.c cVar = o53.s0.f129406a;
        return ge1.b.T(b0Var, x53.b.f189152a, null, new a(this.f95534b, this.f95535c, this.f95536d, this.f95537e, null), 2);
    }
}
