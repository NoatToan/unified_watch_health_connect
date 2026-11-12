package c30;

import java.util.Collection;
import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.domain.custom.ConvertToGCJ02UseCase", f = "ConvertToGCJ02UseCase.kt", l = {74}, m = "buildSegments", v = 2)
public final class r extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.courses.model.e f23994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Collection f23995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Iterator f23996c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23997d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f23998e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f23999f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f24000g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f24001h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f24002i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ u f24003j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f24004k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(u uVar, t13.d<? super r> dVar) {
        super(dVar);
        this.f24003j = uVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f24002i = obj;
        this.f24004k |= Integer.MIN_VALUE;
        return this.f24003j.b(null, null, this);
    }
}
