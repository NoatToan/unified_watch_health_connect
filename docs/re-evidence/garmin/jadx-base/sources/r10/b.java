package r10;

import com.garmin.android.apps.connectmobile.v2;
import e23.l;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "()Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.connectiq.repo.ConnectIQAppSettingsRepo$getSettingsBinary$2", f = "ConnectIQAppSettingsRepo.kt", l = {55}, m = "invokeSuspend", v = 2)
public final class b extends v13.i implements l<t13.d<? super v2<? extends byte[]>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f149332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f149333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f149334c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f149335d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f149336e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f149337f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f149338g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, String str, String str2, String str3, String str4, String str5, t13.d<? super b> dVar) {
        super(1, dVar);
        this.f149333b = aVar;
        this.f149334c = str;
        this.f149335d = str2;
        this.f149336e = str3;
        this.f149337f = str4;
        this.f149338g = str5;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new b(this.f149333b, this.f149334c, this.f149335d, this.f149336e, this.f149337f, this.f149338g, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super v2<? extends byte[]>> dVar) {
        return ((b) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f149332a;
        if (i14 == 0) {
            r.b(obj);
            this.f149332a = 1;
            Object objA = a.a(this.f149333b, this.f149334c, this.f149335d, this.f149336e, this.f149337f, this.f149338g, this);
            return objA == aVar ? aVar : objA;
        }
        if (i14 == 1) {
            r.b(obj);
            return obj;
        }
        vb.h.z("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
