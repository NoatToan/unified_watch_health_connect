package sm0;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.group.details.feed.all.GroupAllFeedPagingSource", f = "GroupAllFeedPagingSource.kt", l = {45, 49, 54}, m = "load", v = 2)
public final class e extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f160076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f160077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f160078c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f160079d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f160080e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d f160081f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f160082g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d dVar, t13.d<? super e> dVar2) {
        super(dVar2);
        this.f160081f = dVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f160080e = obj;
        this.f160082g |= Integer.MIN_VALUE;
        return this.f160081f.e(null, this);
    }
}
