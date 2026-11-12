package zy;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.cannedtextreply.CustomMessagesService", f = "CustomMessagesService.kt", l = {106}, m = "handleSmsSendMessageRequest", v = 2)
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f207382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.cannedtextreply.b f207383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f207384c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.garmin.android.apps.connectmobile.cannedtextreply.b bVar, t13.d<? super c> dVar) {
        super(dVar);
        this.f207383b = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f207382a = obj;
        this.f207384c |= Integer.MIN_VALUE;
        return com.garmin.android.apps.connectmobile.cannedtextreply.b.d(this.f207383b, null, null, this);
    }
}
