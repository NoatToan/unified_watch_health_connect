package de2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.livetrack.device.DefaultDeviceManager", f = "DefaultDeviceManager.kt", l = {TsExtractor.TS_STREAM_TYPE_AIT}, m = "updateLivetrackAutoStart", v = 2)
public final class n extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f59340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f59341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f59342c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f59343d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a f59344e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f59345f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(a aVar, t13.d<? super n> dVar) {
        super(dVar);
        this.f59344e = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f59343d = obj;
        this.f59345f |= Integer.MIN_VALUE;
        return this.f59344e.q(false, this);
    }
}
