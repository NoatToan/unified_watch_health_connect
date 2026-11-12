package xz0;

import android.content.Context;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.notifications.requestpage.InboxRequestPagingSource", f = "InboxRequestPagingSource.kt", l = {45, 48}, m = "load", v = 2)
public final class k extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f192785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f192786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f192787c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f192788d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f192789e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h f192790f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f192791g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(h hVar, t13.d<? super k> dVar) {
        super(dVar);
        this.f192790f = hVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f192789e = obj;
        this.f192791g |= Integer.MIN_VALUE;
        return this.f192790f.e(null, this);
    }
}
