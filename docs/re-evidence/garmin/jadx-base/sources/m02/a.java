package m02;

import java.util.List;
import p005kotlin.Metadata;
import t13.d;
import v13.c;
import v13.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@e(c = "com.garmin.android.apps.connectmobile.ui.composable.paging.DefaultPaginator", f = "DefaultPaginator.kt", l = {21, 25, 29, 30}, m = "loadNextItems", v = 2)
public final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f115741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f115742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f115743c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b<Object, Object> f115744d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f115745e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b<Object, Object> bVar, d<? super a> dVar) {
        super(dVar);
        this.f115744d = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f115743c = obj;
        this.f115745e |= Integer.MIN_VALUE;
        return this.f115744d.a(this);
    }
}
