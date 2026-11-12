package zy;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.cannedtextreply.CustomMessagesService", f = "CustomMessagesService.kt", l = {163}, m = "handleSmsCannedListRequest", v = 2)
public final class b extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f207379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.cannedtextreply.b f207380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f207381c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.garmin.android.apps.connectmobile.cannedtextreply.b bVar, t13.d<? super b> dVar) {
        super(dVar);
        this.f207380b = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f207379a = obj;
        this.f207381c |= Integer.MIN_VALUE;
        return com.garmin.android.apps.connectmobile.cannedtextreply.b.c(this.f207380b, null, null, this);
    }
}
