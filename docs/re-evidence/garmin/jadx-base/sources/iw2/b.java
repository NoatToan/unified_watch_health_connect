package iw2;

import android.content.Context;
import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@v13.e(c = "com.garmin.realtimesettings.app.datahandler.GFDIResponder$Companion", f = "GFDIResponder.kt", l = {86}, m = "compositionSettingsResponse", v = 1)
public final class b extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f95359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p005kotlin.jvm.internal.m0 f95360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Iterator f95361c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f95362d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f95363e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f95364f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ a.C1825a f95365g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f95366h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a.C1825a c1825a, t13.d<? super b> dVar) {
        super(dVar);
        this.f95365g = c1825a;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f95364f = obj;
        this.f95366h |= Integer.MIN_VALUE;
        return this.f95365g.a(null, 0L, 0, null, this);
    }
}
