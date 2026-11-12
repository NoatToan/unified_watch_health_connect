package hw2;

import android.content.Context;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@v13.e(c = "com.garmin.realtimesettings.app.dataLoader.UICompositionDeviceLoader", f = "UICompositionDeviceLoader.kt", l = {70, 73, 77, 85}, m = "getComposition", v = 1)
public final class a extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f85972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f85973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f85974c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f85975d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f85976e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f85977f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f85978g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f85979h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ c f85980i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f85981j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, t13.d<? super a> dVar) {
        super(dVar);
        this.f85980i = cVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f85979h = obj;
        this.f85981j |= Integer.MIN_VALUE;
        return this.f85980i.a(null, 0L, null, 0, 0, false, false, this);
    }
}
