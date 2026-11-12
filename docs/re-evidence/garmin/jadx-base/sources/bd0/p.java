package bd0;

import com.garmin.android.apps.connectmobile.devices.setup.CustomerGUIDMismatchActivity;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class p implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CustomerGUIDMismatchActivity f17597b;

    public /* synthetic */ p(CustomerGUIDMismatchActivity customerGUIDMismatchActivity, int i14) {
        this.f17596a = i14;
        this.f17597b = customerGUIDMismatchActivity;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f17596a) {
            case 0:
                CustomerGUIDMismatchActivity customerGUIDMismatchActivity = this.f17597b;
                customerGUIDMismatchActivity.hideProgressOverlay();
                ((l80.a) KoinJavaComponent.get$default(l80.a.class, null, null, 6, null)).q(customerGUIDMismatchActivity);
                customerGUIDMismatchActivity.finish();
                break;
            default:
                CustomerGUIDMismatchActivity customerGUIDMismatchActivity2 = this.f17597b;
                customerGUIDMismatchActivity2.hideProgressOverlay();
                customerGUIDMismatchActivity2.finish();
                break;
        }
        return Unit.INSTANCE;
    }
}
