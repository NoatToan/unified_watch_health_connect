package wz0;

import android.content.Context;
import com.garmin.android.apps.connectmobile.v2;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.notifications.pagination.NotificationPagingSource", f = "NotificationPagingSource.kt", l = {56, 67, 70, 75}, m = "load", v = 2)
public final class g extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f188172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f188173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f188174c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public v2.b f188175d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f188176e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f188177f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f188178g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ b f188179h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f188180i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(b bVar, t13.d<? super g> dVar) {
        super(dVar);
        this.f188179h = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f188178g = obj;
        this.f188180i |= Integer.MIN_VALUE;
        return this.f188179h.e(null, this);
    }
}
