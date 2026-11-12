package bw2;

import android.content.Context;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@v13.e(c = "com.garmin.realtimesettings.app.baseviews.switch.SwitchDataHandler$Companion", f = "SwitchDataHandler.kt", l = {53}, m = "updateSwitchValue", v = 1)
public final class e extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f21587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f21588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f.a f21589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f21590d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f.a aVar, t13.d<? super e> dVar) {
        super(dVar);
        this.f21589c = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f21588b = obj;
        this.f21590d |= Integer.MIN_VALUE;
        return this.f21589c.a(null, 0, 0, false, this);
    }
}
