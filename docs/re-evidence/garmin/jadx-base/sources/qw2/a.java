package qw2;

import p005kotlin.Metadata;
import t13.d;
import v13.c;
import v13.e;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@e(c = "com.garmin.realtimesettings.app.datahandler.servicecalls.startup.StartUpDataServiceCalls", f = "StartUpDataServiceCalls.kt", l = {31, 33}, m = "getStartUpDataService", v = 1)
public final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f148381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f148382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f148383c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, d<? super a> dVar) {
        super(dVar);
        this.f148382b = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f148381a = obj;
        this.f148383c |= Integer.MIN_VALUE;
        return this.f148382b.d(null, this);
    }
}
