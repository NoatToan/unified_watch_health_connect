package c62;

import com.garmin.android.apps.connectmobile.workouts.presentation.details.MultiSportsDetailsActivity;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.details.MultiSportsDetailsActivity", f = "MultiSportsDetailsActivity.kt", l = {1018, 1025, 1029}, m = "downloadAudioNote", v = 2)
public final class h extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f24745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f24746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f24747c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f24748d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ MultiSportsDetailsActivity f24749e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f24750f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(MultiSportsDetailsActivity multiSportsDetailsActivity, t13.d<? super h> dVar) {
        super(dVar);
        this.f24749e = multiSportsDetailsActivity;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f24748d = obj;
        this.f24750f |= Integer.MIN_VALUE;
        MultiSportsDetailsActivity.a aVar = MultiSportsDetailsActivity.f48440z;
        return this.f24749e.da(null, null, this);
    }
}
