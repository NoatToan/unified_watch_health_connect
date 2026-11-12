package aq1;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.startup.StartupChecksViewModel", f = "StartupChecksViewModel.kt", l = {230, 231, 236, 238, PsExtractor.VIDEO_STREAM_MASK, 241, 244, 251}, m = "checkUserGraduationConsents", v = 2)
public final class y extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f12448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f12449c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.startup.e f12450d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12451e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.garmin.android.apps.connectmobile.startup.e eVar, t13.d<? super y> dVar) {
        super(dVar);
        this.f12450d = eVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f12449c = obj;
        this.f12451e |= Integer.MIN_VALUE;
        int i14 = com.garmin.android.apps.connectmobile.startup.e.f44827g;
        return this.f12450d.y4(0, this);
    }
}
