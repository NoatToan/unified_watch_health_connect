package t60;

import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.cross_selling.CrossSellingPreferencesImpl", f = "CrossSellingPreferencesImpl.kt", l = {77}, m = "checkUserPreferences", v = 2)
public final class i extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f162712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f162713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f162714c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m f162715d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f162716e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(m mVar, t13.d<? super i> dVar) {
        super(dVar);
        this.f162715d = mVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f162714c = obj;
        this.f162716e |= Integer.MIN_VALUE;
        return this.f162715d.e(null, this);
    }
}
