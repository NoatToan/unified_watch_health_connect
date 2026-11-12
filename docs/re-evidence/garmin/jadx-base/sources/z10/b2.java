package z10;

import com.garmin.android.apps.connectmobile.GCMWebViewActivity;
import com.garmin.android.apps.connectmobile.consent.DeviceUploadConsentActivity;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b2 implements androidx.lifecycle.z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f200896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DeviceUploadConsentActivity f200897b;

    public /* synthetic */ b2(DeviceUploadConsentActivity deviceUploadConsentActivity, int i14) {
        this.f200896a = i14;
        this.f200897b = deviceUploadConsentActivity;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, o13.l] */
    @Override // androidx.lifecycle.z0
    public final void onChanged(Object obj) {
        int i14 = this.f200896a;
        DeviceUploadConsentActivity deviceUploadConsentActivity = this.f200897b;
        switch (i14) {
            case 0:
                v92.k kVar = (v92.k) obj;
                DeviceUploadConsentActivity.a aVar = DeviceUploadConsentActivity.f32201b;
                kVar.getClass();
                if (kVar instanceof v92.k.d) {
                    deviceUploadConsentActivity.showProgressOverlay();
                } else if (kVar instanceof v92.k.c) {
                    deviceUploadConsentActivity.hideProgressOverlay();
                } else if (kVar instanceof v92.k.b) {
                    deviceUploadConsentActivity.hideProgressOverlay();
                    deviceUploadConsentActivity.displayFailedMessage();
                } else if (!(kVar instanceof v92.k.a)) {
                    lc.u0.r();
                } else {
                    ((j) deviceUploadConsentActivity.f32202a.getValue()).x4(q92.x.DI_CONNECT_UPLOAD);
                }
                break;
            default:
                v92.i iVar = (v92.i) obj;
                DeviceUploadConsentActivity.a aVar2 = DeviceUploadConsentActivity.f32201b;
                iVar.getClass();
                if (iVar instanceof v92.i.e) {
                    v92.i.e eVar = (v92.i.e) iVar;
                    GCMWebViewActivity.fa(deviceUploadConsentActivity, eVar.f176402a, eVar.f176403b);
                } else if (iVar instanceof v92.i.b) {
                    d1.u(d1.f200951a, deviceUploadConsentActivity, (v92.i.b) iVar);
                }
                break;
        }
    }
}
