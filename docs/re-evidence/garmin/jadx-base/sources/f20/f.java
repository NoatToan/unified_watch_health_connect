package f20;

import android.content.DialogInterface;
import com.garmin.android.apps.connectmobile.contacts.ContactActivity;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class f implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f68386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f68387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f68388c;

    public /* synthetic */ f(Object obj, int i14, int i15) {
        this.f68386a = i15;
        this.f68387b = obj;
        this.f68388c = i14;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        int i14 = this.f68386a;
        int i15 = this.f68388c;
        Object obj = this.f68387b;
        switch (i14) {
            case 0:
                ContactActivity.a aVar = ContactActivity.T;
                ((ContactActivity) obj).ka(Integer.valueOf(i15));
                break;
            case 1:
                ContactActivity.a aVar2 = ContactActivity.T;
                ((ContactActivity) obj).ka(Integer.valueOf(i15));
                break;
            default:
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.a aVar3 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b.f43713m;
                ((com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.b) obj).z6(Integer.valueOf(i15));
                break;
        }
    }
}
