package c30;

import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.domain.custom.GetCourseDataUseCase", f = "GetCourseDataUseCase.kt", l = {95}, m = "createCustomCourseState", v = 2)
public final class b0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.courses.model.e f23797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f23798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f23799c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f23800d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f23801e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d0 f23802f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f23803g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(d0 d0Var, t13.d<? super b0> dVar) {
        super(dVar);
        this.f23802f = d0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f23801e = obj;
        this.f23803g |= Integer.MIN_VALUE;
        return d0.a(this.f23802f, null, this);
    }
}
