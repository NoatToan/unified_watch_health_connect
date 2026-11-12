package ov2;

import android.content.Context;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@v13.e(c = "com.garmin.realtimesettings.app.baseviews.edittext.EditTextDataHandler$Companion", f = "EditTextDataHandler.kt", l = {91}, m = "updateEditTextValue", v = 1)
public final class b extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f134259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f134260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c.a f134261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f134262d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c.a aVar, t13.d<? super b> dVar) {
        super(dVar);
        this.f134261c = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f134260b = obj;
        this.f134262d |= Integer.MIN_VALUE;
        return this.f134261c.b(null, 0, 0, null, this);
    }
}
