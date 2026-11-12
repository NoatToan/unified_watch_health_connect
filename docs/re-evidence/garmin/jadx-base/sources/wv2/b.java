package wv2;

import android.content.Context;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@v13.e(c = "com.garmin.realtimesettings.app.baseviews.reorderable.ReorderableItemDataHandler$Companion", f = "ReorderableItemDataHandler.kt", l = {67}, m = "updateReorderableItemPosition", v = 1)
public final class b extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f187466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f187467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c.a f187468c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f187469d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c.a aVar, t13.d<? super b> dVar) {
        super(dVar);
        this.f187468c = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f187467b = obj;
        this.f187469d |= Integer.MIN_VALUE;
        return this.f187468c.a(null, 0, 0, null, this);
    }
}
