package te2;

import android.content.Context;
import android.os.Parcelable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.mobileauth.biz.AbstractOAuth2ITOperation", f = "AbstractOAuth2ITOperation.kt", l = {111, 112, 128, 137}, m = "exchangeWithThisAppCredential")
public final class p extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Parcelable f164220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f164221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ve2.e f164222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f164223d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f164224e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f164225f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f164226g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ s f164227h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f164228i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(s sVar, t13.d<? super p> dVar) {
        super(dVar);
        this.f164227h = sVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f164226g = obj;
        this.f164228i |= Integer.MIN_VALUE;
        return s.f(this.f164227h, null, null, this);
    }
}
