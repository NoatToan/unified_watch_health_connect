package c30;

import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.domain.custom.AddNewPointUseCase", f = "AddNewPointUseCase.kt", l = {60, 63, 78}, m = "addNewPoint", v = 2)
public final class i extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a50.g f23892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f23893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.courses.model.e f23894c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f23895d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f23896e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Double f23897f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f23898g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList f23899h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f23900i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f23901j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ h f23902k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f23903l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(h hVar, t13.d<? super i> dVar) {
        super(dVar);
        this.f23902k = hVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f23901j = obj;
        this.f23903l |= Integer.MIN_VALUE;
        return h.a(this.f23902k, null, null, null, null, 0L, this);
    }
}
