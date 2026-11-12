package wz0;

import android.content.Context;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.m0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.notifications.pagination.NotificationPagingSource", f = "NotificationPagingSource.kt", l = {125, 149}, m = "getInboxAllRequests", v = 2)
public final class e extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f188156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f188157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f188158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public v2.b f188159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f188160e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public m0 f188161f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f188162g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f188163h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f188164i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ b f188165j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f188166k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(b bVar, t13.d<? super e> dVar) {
        super(dVar);
        this.f188165j = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f188164i = obj;
        this.f188166k |= Integer.MIN_VALUE;
        int i14 = b.f188136g;
        return this.f188165j.i(null, null, this);
    }
}
