package y10;

import com.garmin.android.apps.connectmobile.v2;
import com.google.mlkit.common.MlKitException;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Lo10/a;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.connectiq.viewmodel.ConnectIQDownloadViewModel$appIcons$result$1", f = "ConnectIQDownloadViewModel.kt", l = {MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR}, m = "invokeSuspend", v = 2)
public final class m extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends List<? extends o10.a>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f193941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f193942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List<String> f193943c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "", "Lo10/a;", "<anonymous>", "()Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.connectiq.viewmodel.ConnectIQDownloadViewModel$appIcons$result$1$1", f = "ConnectIQDownloadViewModel.kt", l = {MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.l<t13.d<? super v2<? extends List<? extends o10.a>>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f193944a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ k f193945b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List<String> f193946c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k kVar, List<String> list, t13.d<? super a> dVar) {
            super(1, dVar);
            this.f193945b = kVar;
            this.f193946c = list;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new a(this.f193945b, this.f193946c, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super v2<? extends List<? extends o10.a>>> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f193944a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            r10.d dVar = this.f193945b.f193905d;
            this.f193944a = 1;
            Object objA = dVar.a(this.f193946c, this);
            return objA == aVar ? aVar : objA;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(k kVar, List<String> list, t13.d<? super m> dVar) {
        super(2, dVar);
        this.f193942b = kVar;
        this.f193943c = list;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new m(this.f193942b, this.f193943c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends List<? extends o10.a>>> dVar) {
        return ((m) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f193941a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        a aVar2 = new a(this.f193942b, this.f193943c, null);
        this.f193941a = 1;
        Object objA = p10.e.a(aVar2, "Error occurred -> CIQ appIcons", this);
        return objA == aVar ? aVar : objA;
    }
}
