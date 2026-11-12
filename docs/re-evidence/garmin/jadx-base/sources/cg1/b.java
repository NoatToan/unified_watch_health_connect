package cg1;

import com.garmin.android.apps.connectmobile.segments.presentation.ExploreSegmentsActivity;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.segments.presentation.ExploreSegmentsActivity", f = "ExploreSegmentsActivity.kt", l = {254}, m = "fetchSegments", v = 2)
public final class b extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f27126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ExploreSegmentsActivity f27127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f27128c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ExploreSegmentsActivity exploreSegmentsActivity, t13.d<? super b> dVar) {
        super(dVar);
        this.f27127b = exploreSegmentsActivity;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f27126a = obj;
        this.f27128c |= Integer.MIN_VALUE;
        ExploreSegmentsActivity.a aVar = ExploreSegmentsActivity.C;
        return this.f27127b.ma(this);
    }
}
