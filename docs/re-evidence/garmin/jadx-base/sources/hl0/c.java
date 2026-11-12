package hl0;

import java.util.Iterator;
import java.util.LinkedHashMap;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.golf.courses.domain.CheckGolfCourseDownloadStatusUseCase", f = "CheckGolfCourseDownloadStatusUseCase.kt", l = {29}, m = "invoke", v = 2)
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LinkedHashMap f84264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f84265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f84266c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f84267d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a f84268e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f84269f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, t13.d<? super c> dVar) {
        super(dVar);
        this.f84268e = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f84267d = obj;
        this.f84269f |= Integer.MIN_VALUE;
        return this.f84268e.e(this);
    }
}
