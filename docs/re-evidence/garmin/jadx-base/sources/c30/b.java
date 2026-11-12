package c30;

import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.domain.custom.AddClimbToCourseRouteUseCase", f = "AddClimbToCourseRouteUseCase.kt", l = {46, 49, 64}, m = "addClimbToCourseRoute", v = 2)
public final class b extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a50.g f23789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.courses.model.e f23790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f23791c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f23792d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f23793e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f23794f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ a f23795g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f23796h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, t13.d<? super b> dVar) {
        super(dVar);
        this.f23795g = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f23794f = obj;
        this.f23796h |= Integer.MIN_VALUE;
        return a.a(this.f23795g, null, null, null, this);
    }
}
