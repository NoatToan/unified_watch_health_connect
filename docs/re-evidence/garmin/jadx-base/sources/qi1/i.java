package qi1;

import p005kotlin.Metadata;
import p92.y;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lqi1/i;", "Lcom/garmin/android/library/backgroundtaskmanagement/b$b;", "", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f144892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t13.d<String> f144893b;

    /* JADX WARN: Multi-variable type inference failed */
    public i(t13.d<? super String> dVar) {
        this.f144893b = dVar;
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
    public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
        String str;
        cVar.getClass();
        com.garmin.android.library.backgroundtaskmanagement.b.c cVar2 = com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS;
        t13.d<String> dVar = this.f144893b;
        if (cVar == cVar2 && (str = this.f144892a) != null && str.length() != 0) {
            int i14 = o13.q.f128596b;
            dVar.resumeWith(this.f144892a);
        } else {
            y.f136664a.getClass();
            y.a.c("LTESubscriptionViewModel", "The call to the sso token was unsuccessful!");
            int i15 = o13.q.f128596b;
            dVar.resumeWith(null);
        }
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
    public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, String str) {
        String str2 = str;
        eVar.getClass();
        str2.getClass();
        this.f144892a = str2;
    }
}
