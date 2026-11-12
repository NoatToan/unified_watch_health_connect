package com.garmin.android.apps.connectmobile.menstrualcycle.data.api;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.menstrualcycle.data.api.PeriodicHealthServiceApi$Companion", f = "PeriodicHealthServiceApi.kt", l = {TsExtractor.TS_STREAM_TYPE_SPLICE_INFO}, m = "postDailyLog", v = 2)
public final class e extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f38767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a.b f38768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f38769c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(a.b bVar, t13.d<? super e> dVar) {
        super(dVar);
        this.f38768b = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f38767a = obj;
        this.f38769c |= Integer.MIN_VALUE;
        return this.f38768b.i(null, null, this);
    }
}
