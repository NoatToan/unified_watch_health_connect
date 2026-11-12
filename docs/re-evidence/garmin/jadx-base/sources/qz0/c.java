package qz0;

import java.util.ArrayList;
import p005kotlin.Metadata;
import v13.e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@e(c = "com.garmin.android.apps.connectmobile.newsfeed.pagination.NewsFeedPagingSource", f = "NewsFeedPagingSource.kt", l = {124}, m = "getNewsFeedSuggestedFollowings", v = 2)
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f148614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f148615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f148616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f148617d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, t13.d<? super c> dVar) {
        super(dVar);
        this.f148616c = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f148615b = obj;
        this.f148617d |= Integer.MIN_VALUE;
        return this.f148616c.f(this);
    }
}
