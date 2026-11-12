package f20;

import android.view.View;
import com.garmin.android.apps.connectmobile.contacts.ContactActivity;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class k implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f68397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ContactActivity f68398b;

    public /* synthetic */ k(ContactActivity contactActivity, int i14) {
        this.f68397a = i14;
        this.f68398b = contactActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        int i14 = this.f68397a;
        ContactActivity contactActivity = this.f68398b;
        switch (i14) {
            case 0:
                ContactActivity.a aVar = ContactActivity.T;
                contactActivity.ga().z4();
                break;
            case 1:
                ContactActivity.a aVar2 = ContactActivity.T;
                contactActivity.da();
                break;
            case 2:
                ContactActivity.a aVar3 = ContactActivity.T;
                z6.a.a(contactActivity, (String[]) p13.w.c(j22.a.f96717f.f96735b).toArray(new String[0]), 1);
                break;
            case 3:
                ContactActivity.a aVar4 = ContactActivity.T;
                contactActivity.da();
                break;
            case 4:
                ContactActivity.a aVar5 = ContactActivity.T;
                j22.b.f96736a.getClass();
                j22.b.r(contactActivity);
                break;
            default:
                ContactActivity.a aVar6 = ContactActivity.T;
                contactActivity.da();
                break;
        }
    }
}
