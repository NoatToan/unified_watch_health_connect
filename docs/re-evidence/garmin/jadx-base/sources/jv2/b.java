package jv2;

import android.content.Context;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@v13.e(c = "com.garmin.realtimesettings.app.baseviews.doublelabel.integerpicker.IntegerPickerDataHandler$Companion", f = "IntegerPickerDataHandler.kt", l = {100}, m = "updateIntegerPicker", v = 1)
public final class b extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f101191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f101192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c.a f101193c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f101194d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c.a aVar, t13.d<? super b> dVar) {
        super(dVar);
        this.f101193c = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f101192b = obj;
        this.f101194d |= Integer.MIN_VALUE;
        return this.f101193c.a(null, 0, 0, 0, this);
    }
}
