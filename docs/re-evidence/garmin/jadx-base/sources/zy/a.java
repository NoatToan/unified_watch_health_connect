package zy;

import com.garmin.android.apps.connectmobile.cannedtextreply.CannedTextReplyActivity;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f207377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CannedTextReplyActivity f207378b;

    public /* synthetic */ a(CannedTextReplyActivity cannedTextReplyActivity, int i14) {
        this.f207377a = i14;
        this.f207378b = cannedTextReplyActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f207377a) {
            case 0:
                this.f207378b.f31273i = true;
                break;
            default:
                this.f207378b.f31273i = true;
                break;
        }
    }
}
