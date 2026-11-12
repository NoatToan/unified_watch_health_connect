package te2;

import com.google.mlkit.common.MlKitException;
import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.mobileauth.biz.AbstractOAuth2DIOperation", f = "AbstractOAuth2DIOperation.kt", l = {177, 190, MlKitException.CODE_SCANNER_APP_NAME_UNAVAILABLE}, m = "exchangeWithOtherAppCredential")
public final class e extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f164010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f164011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f164012c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j f164013d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f164014e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(j jVar, t13.d<? super e> dVar) {
        super(dVar);
        this.f164013d = jVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f164012c = obj;
        this.f164014e |= Integer.MIN_VALUE;
        return j.e(this.f164013d, null, this);
    }
}
