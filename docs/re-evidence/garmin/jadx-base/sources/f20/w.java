package f20;

import android.view.View;
import com.garmin.android.apps.connectmobile.contacts.ContactsMigrationActivity;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class w implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f68443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ContactsMigrationActivity f68444b;

    public /* synthetic */ w(ContactsMigrationActivity contactsMigrationActivity, int i14) {
        this.f68443a = i14;
        this.f68444b = contactsMigrationActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        int i14 = this.f68443a;
        ContactsMigrationActivity contactsMigrationActivity = this.f68444b;
        switch (i14) {
            case 0:
                ContactsMigrationActivity.a aVar = ContactsMigrationActivity.f32322j;
                j22.b.f96736a.getClass();
                j22.b.r(contactsMigrationActivity);
                return;
            case 1:
                x xVar = contactsMigrationActivity.f32325c;
                if (xVar == null) {
                    p005kotlin.jvm.internal.s.m("presenter");
                    throw null;
                }
                ContactsMigrationActivity contactsMigrationActivity2 = xVar.f68446a;
                if (contactsMigrationActivity2 != null) {
                    j22.b bVar = j22.b.f96736a;
                    j22.a aVar2 = j22.a.f96717f;
                    bVar.getClass();
                    if (j22.b.k(aVar2)) {
                        xVar.c();
                        return;
                    } else {
                        j22.b.B(contactsMigrationActivity2, aVar2);
                        return;
                    }
                }
                return;
            case 2:
                ContactsMigrationActivity.a aVar3 = ContactsMigrationActivity.f32322j;
                contactsMigrationActivity.finish();
                return;
            default:
                x xVar2 = contactsMigrationActivity.f32325c;
                if (xVar2 != null) {
                    xVar2.d();
                    return;
                } else {
                    p005kotlin.jvm.internal.s.m("presenter");
                    throw null;
                }
        }
    }
}
