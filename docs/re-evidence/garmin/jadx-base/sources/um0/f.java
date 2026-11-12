package um0;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.group.details.feed.post.GroupPostFeedPagingSource", f = "GroupPostFeedPagingSource.kt", l = {44, 48, 53}, m = "load", v = 2)
public final class f extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f172007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f172008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f172009c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f172010d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f172011e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e f172012f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f172013g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e eVar, t13.d<? super f> dVar) {
        super(dVar);
        this.f172012f = eVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f172011e = obj;
        this.f172013g |= Integer.MIN_VALUE;
        return this.f172012f.e(null, this);
    }
}
