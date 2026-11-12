package c30;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.domain.custom.CreateNewSegmentForCourseUseCase", f = "CreateNewSegmentForCourseUseCase.kt", l = {16}, m = "invoke", v = 2)
public final class v extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f24040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f24041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w f24042c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f24043d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w wVar, t13.d<? super v> dVar) {
        super(dVar);
        this.f24042c = wVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f24041b = obj;
        this.f24043d |= Integer.MIN_VALUE;
        return this.f24042c.a(null, null, this);
    }
}
