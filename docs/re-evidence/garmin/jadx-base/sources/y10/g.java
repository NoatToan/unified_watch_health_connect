package y10;

import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.v2;
import com.google.mlkit.common.MlKitException;
import lc.u0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.connectiq.viewmodel.ConnectIQAppSettingsViewModel$getSettingsBinary$1", f = "ConnectIQAppSettingsViewModel.kt", l = {MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR}, m = "invokeSuspend", v = 2)
public final class g extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f193851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f193852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f193853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f193854d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f193855e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f193856f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f193857g;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.connectiq.viewmodel.ConnectIQAppSettingsViewModel$getSettingsBinary$1$result$1", f = "ConnectIQAppSettingsViewModel.kt", l = {MlKitException.CODE_SCANNER_PIPELINE_INFERENCE_ERROR}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends byte[]>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f193858a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f193859b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f193860c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f193861d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f193862e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f193863f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f193864g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f fVar, String str, String str2, String str3, String str4, String str5, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f193859b = fVar;
            this.f193860c = str;
            this.f193861d = str2;
            this.f193862e = str3;
            this.f193863f = str4;
            this.f193864g = str5;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f193859b, this.f193860c, this.f193861d, this.f193862e, this.f193863f, this.f193864g, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends byte[]>> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f193858a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            r10.a aVar2 = this.f193859b.f193822a;
            this.f193858a = 1;
            aVar2.getClass();
            Object objA = p10.e.a(new r10.b(aVar2, this.f193860c, this.f193861d, this.f193862e, this.f193863f, this.f193864g, null), "Error occurred", this);
            return objA == aVar ? aVar : objA;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(f fVar, String str, String str2, String str3, String str4, String str5, t13.d<? super g> dVar) {
        super(2, dVar);
        this.f193852b = fVar;
        this.f193853c = str;
        this.f193854d = str2;
        this.f193855e = str3;
        this.f193856f = str4;
        this.f193857g = str5;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new g(this.f193852b, this.f193853c, this.f193854d, this.f193855e, this.f193856f, this.f193857g, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f193851a;
        if (i14 == 0) {
            o13.r.b(obj);
            x53.c cVar = s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            a aVar2 = new a(this.f193852b, this.f193853c, this.f193854d, this.f193855e, this.f193856f, this.f193857g, null);
            this.f193851a = 1;
            obj = ge1.b.e0(bVar, aVar2, this);
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
        v2 v2Var = (v2) obj;
        boolean z14 = v2Var instanceof v2.b;
        f fVar = this.f193852b;
        if (z14) {
            y0<g3<byte[]>> y0Var = fVar.f193827f;
            g3.a aVar3 = g3.f35298f;
            T t7 = ((v2.b) v2Var).f47386a;
            aVar3.getClass();
            y0Var.m(g3.a.d(t7));
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            fVar.f193827f.m(g3.a.a(g3.f35298f, null, null, null, null, 11));
        }
        return Unit.INSTANCE;
    }
}
