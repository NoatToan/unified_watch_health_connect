package zz0;

import android.view.View;
import com.garmin.android.apps.connectmobile.notifications.model.NotificationItem;
import r22.q0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f207586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f207587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f207588c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f207589d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f207590e;

    public /* synthetic */ c(Object obj, long j8, Object obj2, Object obj3, int i14) {
        this.f207586a = i14;
        this.f207587b = obj;
        this.f207588c = j8;
        this.f207589d = obj2;
        this.f207590e = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        switch (this.f207586a) {
            case 0:
                f fVar = (f) this.f207587b;
                NotificationItem.Activity.a aVar = (NotificationItem.Activity.a) this.f207589d;
                NotificationItem.Activity activity = (NotificationItem.Activity) this.f207590e;
                fVar.f207601a.t5(this.f207588c, true);
                NotificationItem.Activity.a aVarA = NotificationItem.Activity.a.a(aVar, true);
                activity.setViewState(aVarA);
                fVar.d(aVarA);
                break;
            case 1:
                f fVar2 = (f) this.f207587b;
                NotificationItem.Activity.a aVar2 = (NotificationItem.Activity.a) this.f207589d;
                NotificationItem.Activity activity2 = (NotificationItem.Activity) this.f207590e;
                fVar2.f207601a.t5(this.f207588c, false);
                NotificationItem.Activity.a aVarA2 = NotificationItem.Activity.a.a(aVar2, false);
                activity2.setViewState(aVarA2);
                fVar2.d(aVarA2);
                break;
            default:
                cv.i iVar = (cv.i) this.f207587b;
                String str = (String) this.f207589d;
                q0 q0Var = (q0) this.f207590e;
                iVar.f55810d.h(iVar.f55807a, this.f207588c, str);
                q0Var.dismiss();
                break;
        }
    }
}
