package bu;

import android.content.Context;
import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.annual_report.remote_resource.AnnualReportRemoteResourceManager", f = "AnnualReportRemoteResourceManager.kt", l = {62}, m = "prepareReport", v = 2)
public final class d extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f21169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f21170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f21171c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f21172d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f21173e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f21174f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, t13.d<? super d> dVar) {
        super(dVar);
        this.f21173e = fVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f21172d = obj;
        this.f21174f |= Integer.MIN_VALUE;
        return this.f21173e.j(null, null, this);
    }
}
