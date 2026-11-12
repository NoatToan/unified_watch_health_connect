package id2;

import android.content.Context;
import com.garmin.android.apps.connectmobile.GCMWebViewActivity;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class n implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f93060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f93061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f93062c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f93063d;

    public /* synthetic */ n(Context context, int i14, String str, String str2) {
        this.f93060a = i14;
        this.f93061b = context;
        this.f93062c = str;
        this.f93063d = str2;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f93060a;
        String str = this.f93063d;
        String str2 = this.f93062c;
        Context context = this.f93061b;
        switch (i14) {
            case 0:
                int i15 = o.f93064d;
                return wc2.c.b(context, str2, str);
            default:
                GCMWebViewActivity.fa(context, str2, str);
                return Unit.INSTANCE;
        }
    }
}
