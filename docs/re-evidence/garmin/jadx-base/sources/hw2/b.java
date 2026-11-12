package hw2;

import android.content.Context;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@v13.e(c = "com.garmin.realtimesettings.app.dataLoader.UICompositionDeviceLoader", f = "UICompositionDeviceLoader.kt", l = {118, 121}, m = "requestCompositionFromDevice", v = 1)
public final class b extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f85982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f85983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f85984c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f85985d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f85986e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c f85987f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f85988g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, t13.d<? super b> dVar) {
        super(dVar);
        this.f85987f = cVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f85986e = obj;
        this.f85988g |= Integer.MIN_VALUE;
        return this.f85987f.c(0, 0, null, 0L, null, this);
    }
}
