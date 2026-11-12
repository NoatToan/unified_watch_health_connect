package oj0;

import android.content.Context;
import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.gcplus.data.GCPlusRepository", f = "GCPlusRepository.kt", l = {276}, m = "fetchEducationPageImagesIfNecessary", v = 2)
public final class h extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f132298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f132299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f132300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f132301d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f132302e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f132303f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f fVar, t13.d<? super h> dVar) {
        super(dVar);
        this.f132302e = fVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f132301d = obj;
        this.f132303f |= Integer.MIN_VALUE;
        return this.f132302e.d(null, this);
    }
}
