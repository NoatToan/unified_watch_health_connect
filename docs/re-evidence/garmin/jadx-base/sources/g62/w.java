package g62;

import java.io.File;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.MultiSportOverviewFragment", f = "MultiSportOverviewFragment.kt", l = {367, 374, 378}, m = "uploadAudioNote", v = 2)
public final class w extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public File f76113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f76114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.b f76115c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f76116d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.b bVar, t13.d<? super w> dVar) {
        super(dVar);
        this.f76115c = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f76114b = obj;
        this.f76116d |= Integer.MIN_VALUE;
        com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.b.a aVar = com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.b.f49107t;
        return this.f76115c.C6(null, this);
    }
}
