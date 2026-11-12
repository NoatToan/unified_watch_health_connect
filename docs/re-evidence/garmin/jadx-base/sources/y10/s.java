package y10;

import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.v2;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Lo10/b;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.connectiq.viewmodel.ConnectIQDownloadViewModel$appsDownloads$result$1", f = "ConnectIQDownloadViewModel.kt", l = {151}, m = "invokeSuspend", v = 2)
public final class s extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends List<? extends o10.b>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f193989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f193990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f193991c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f193992d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "", "Lo10/b;", "<anonymous>", "()Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.connectiq.viewmodel.ConnectIQDownloadViewModel$appsDownloads$result$1$1", f = "ConnectIQDownloadViewModel.kt", l = {SyslogConstants.LOG_LOCAL3}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.l<t13.d<? super v2<? extends List<? extends o10.b>>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f193993a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ k f193994b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f193995c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f193996d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k kVar, String str, String str2, t13.d<? super a> dVar) {
            super(1, dVar);
            this.f193994b = kVar;
            this.f193995c = str;
            this.f193996d = str2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new a(this.f193994b, this.f193995c, this.f193996d, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super v2<? extends List<? extends o10.b>>> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f193993a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            k kVar = this.f193994b;
            r10.d dVar = kVar.f193905d;
            String strValueOf = String.valueOf(kVar.f193903b);
            String str = kVar.f193902a.f31894a;
            str.getClass();
            this.f193993a = 1;
            Object objC = dVar.c(strValueOf, this.f193995c, this.f193996d, str, this);
            return objC == aVar ? aVar : objC;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(k kVar, String str, String str2, t13.d<? super s> dVar) {
        super(2, dVar);
        this.f193990b = kVar;
        this.f193991c = str;
        this.f193992d = str2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new s(this.f193990b, this.f193991c, this.f193992d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends List<? extends o10.b>>> dVar) {
        return ((s) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f193989a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        a aVar2 = new a(this.f193990b, this.f193991c, this.f193992d, null);
        this.f193989a = 1;
        Object objA = p10.e.a(aVar2, "Error occurred -> CIQ appsDownloads", this);
        return objA == aVar ? aVar : objA;
    }
}
