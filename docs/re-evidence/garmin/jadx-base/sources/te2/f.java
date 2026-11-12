package te2;

import android.os.Parcelable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.mobileauth.biz.AbstractOAuth2DIOperation", f = "AbstractOAuth2DIOperation.kt", l = {131, 150, 158}, m = "exchangeWithThisAppCredential")
public final class f extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Parcelable f164019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f164020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f164021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f164022d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(j jVar, t13.d<? super f> dVar) {
        super(dVar);
        this.f164021c = jVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f164020b = obj;
        this.f164022d |= Integer.MIN_VALUE;
        return j.f(this.f164021c, null, null, this);
    }
}
