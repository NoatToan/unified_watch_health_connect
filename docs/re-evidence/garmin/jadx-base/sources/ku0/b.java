package ku0;

import android.content.Intent;
import android.view.View;
import com.garmin.android.apps.connectmobile.contacts.ContactActivity;
import com.garmin.android.apps.connectmobile.liveeventsharing.recipients.LiveEventRecipientsActivity;
import l20.r;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f106541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LiveEventRecipientsActivity f106542b;

    public /* synthetic */ b(LiveEventRecipientsActivity liveEventRecipientsActivity, int i14) {
        this.f106541a = i14;
        this.f106542b = liveEventRecipientsActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        switch (this.f106541a) {
            case 0:
                LiveEventRecipientsActivity.a aVar = LiveEventRecipientsActivity.f38506l;
                j22.b.f96736a.getClass();
                j22.b.r(this.f106542b);
                return;
            default:
                LiveEventRecipientsActivity liveEventRecipientsActivity = this.f106542b;
                f.c<Intent> cVar = liveEventRecipientsActivity.f38517k;
                ContactActivity.a aVar2 = ContactActivity.T;
                r rVar = liveEventRecipientsActivity.f38510d;
                if (rVar != null) {
                    cVar.a(ContactActivity.a.a(aVar2, liveEventRecipientsActivity, false, 2, rVar, liveEventRecipientsActivity.f38514h, false, null, 98), null);
                    return;
                } else {
                    s.m("userContactsDTO");
                    throw null;
                }
        }
    }
}
