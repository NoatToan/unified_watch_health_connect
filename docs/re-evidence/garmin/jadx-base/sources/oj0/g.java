package oj0;

import android.content.Context;
import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.gcplus.data.GCPlusRepository", f = "GCPlusRepository.kt", l = {269}, m = "fetchEducationImagesIfMissing", v = 2)
public final class g extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f132292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f132293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f132294c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f132295d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f132296e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f132297f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(f fVar, t13.d<? super g> dVar) {
        super(dVar);
        this.f132296e = fVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f132295d = obj;
        this.f132297f |= Integer.MIN_VALUE;
        int i14 = f.f132279m;
        return this.f132296e.c(null, null, this);
    }
}
