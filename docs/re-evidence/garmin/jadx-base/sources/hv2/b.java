package hv2;

import android.content.Context;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@v13.e(c = "com.garmin.realtimesettings.app.baseviews.doublelabel.heightpicker.HeightPickerDataHandler$Companion", f = "HeightPickerDataHandler.kt", l = {82}, m = "updateHeightPickerValue", v = 1)
public final class b extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f85899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f85900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c.a f85901c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f85902d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c.a aVar, t13.d<? super b> dVar) {
        super(dVar);
        this.f85901c = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f85900b = obj;
        this.f85902d |= Integer.MIN_VALUE;
        return this.f85901c.a(null, 0, 0, null, this);
    }
}
