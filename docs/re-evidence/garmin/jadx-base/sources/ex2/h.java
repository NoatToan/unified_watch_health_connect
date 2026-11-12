package ex2;

import android.content.Context;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@v13.e(c = "com.garmin.realtimesettings.networkwrapper.networking.ImageHelper", f = "ImageHelper.kt", l = {252, 256}, m = "loadImageFromCache", v = 1)
public final class h extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f66963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f66964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f66965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f66966d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f66967e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i f66968f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f66969g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, t13.d<? super h> dVar) {
        super(dVar);
        this.f66968f = iVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f66967e = obj;
        this.f66969g |= Integer.MIN_VALUE;
        i iVar = i.f66970a;
        return this.f66968f.d(null, null, null, null, this);
    }
}
