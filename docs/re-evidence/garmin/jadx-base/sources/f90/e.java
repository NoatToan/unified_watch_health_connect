package f90;

import java.util.Collection;
import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.domain.consent.FetchRequiredConsentsDataUseCase", f = "FetchRequiredConsentsDataUseCase.kt", l = {18}, m = "invoke", v = 2)
public final class e extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Collection f69972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f69973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f69974c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f69975d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f69976e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f69977f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d f69978g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f69979h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d dVar, t13.d<? super e> dVar2) {
        super(dVar2);
        this.f69978g = dVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f69977f = obj;
        this.f69979h |= Integer.MIN_VALUE;
        return this.f69978g.a(null, this);
    }
}
