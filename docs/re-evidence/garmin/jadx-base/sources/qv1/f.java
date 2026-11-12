package qv1;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.progressreports.FBTProgressReportViewModel", f = "FBTProgressReportViewModel.kt", l = {357}, m = "getCyclingAbilitySummery", v = 2)
public final class f extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f148132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f148133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f148134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f148135d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(b bVar, t13.d<? super f> dVar) {
        super(dVar);
        this.f148134c = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f148133b = obj;
        this.f148135d |= Integer.MIN_VALUE;
        return b.A4(this.f148134c, null, null, null, this);
    }
}
