package q12;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.presentation.follow.block.FollowBlockedUsersPagingSource", f = "FollowBlockedUsersPagingSource.kt", l = {25}, m = "convertToViewData", v = 2)
public final class a extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f142076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f142077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f142078c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f142079d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, t13.d<? super a> dVar) {
        super(dVar);
        this.f142078c = cVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f142077b = obj;
        this.f142079d |= Integer.MIN_VALUE;
        return this.f142078c.f(null, this);
    }
}
