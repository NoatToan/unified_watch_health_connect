package sm1;

import android.content.Context;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f160105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.sleep.presentation.a f160106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f160107c;

    public /* synthetic */ c(com.garmin.android.apps.connectmobile.sleep.presentation.a aVar, Context context, int i14) {
        this.f160105a = i14;
        this.f160106b = aVar;
        this.f160107c = context;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f160105a;
        Context context = this.f160107c;
        com.garmin.android.apps.connectmobile.sleep.presentation.a aVar = this.f160106b;
        switch (i14) {
            case 0:
                int i15 = com.garmin.android.apps.connectmobile.sleep.presentation.a.f44253g;
                h82.c.f(aVar, context, "https://support.garmin.com/en-US/?faq=qvzNMwxuTb9NxZ6Ce2a9z9&searchQuery=data%20accuracy%20on%20sleep#:~:text=Steps%20to%20Ensure%20Sleep%20Data%20Accuracy");
                break;
            case 1:
                int i16 = com.garmin.android.apps.connectmobile.sleep.presentation.a.f44253g;
                h82.c.f(aVar, context, "https://support.garmin.com/sas/gcm/?contentId=qvzNMwxuTb9NxZ6Ce2a9z9");
                break;
            default:
                int i17 = com.garmin.android.apps.connectmobile.sleep.presentation.a.f44253g;
                h82.c.f(aVar, context, "https://support.garmin.com/en-US/?faq=qvzNMwxuTb9NxZ6Ce2a9z9&searchQuery=data%20accuracy%20on%20sleep#:~:text=Steps%20to%20Ensure%20Sleep%20Data%20Accuracy");
                break;
        }
        return Unit.INSTANCE;
    }
}
