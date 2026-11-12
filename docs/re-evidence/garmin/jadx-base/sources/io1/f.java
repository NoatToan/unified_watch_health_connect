package io1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.social.conversation.follow.tag.FollowTaggingSuggestionPagingSource", f = "FollowTaggingSuggestionPagingSource.kt", l = {24}, m = "load", v = 2)
public final class f extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f94603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f94604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f94605c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f94606d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, t13.d<? super f> dVar) {
        super(dVar);
        this.f94605c = gVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f94604b = obj;
        this.f94606d |= Integer.MIN_VALUE;
        return this.f94605c.e(null, this);
    }
}
