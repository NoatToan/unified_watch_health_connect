package lu2;

import android.companion.AssociationInfo;
import android.companion.CompanionDeviceManager;
import android.content.IntentSender;
import c22.t;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Llu2/b;", "Landroid/companion/CompanionDeviceManager$Callback;", "device-setup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b extends CompanionDeviceManager.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f115016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a.InterfaceC2186a f115017b;

    public b(String str, a.InterfaceC2186a interfaceC2186a) {
        this.f115016a = str;
        this.f115017b = interfaceC2186a;
    }

    @Override // android.companion.CompanionDeviceManager.Callback
    public final void onAssociationCreated(AssociationInfo associationInfo) {
        associationInfo.getClass();
        a.f115015b.info(t.e(associationInfo.getId(), "Companion Device(", this.f115016a, ") -> onAssociationCreated(", ")"));
        super.onAssociationCreated(associationInfo);
    }

    @Override // android.companion.CompanionDeviceManager.Callback
    public final void onAssociationPending(IntentSender intentSender) {
        intentSender.getClass();
        com.airbnb.lottie.animation.keyframe.a.u("Companion Device(", this.f115016a, ") -> onAssociationPending SUCCESS", a.f115015b);
        this.f115017b.b(intentSender);
    }

    @Override // android.companion.CompanionDeviceManager.Callback
    public final void onFailure(CharSequence charSequence) {
        a.f115015b.error("Companion Device(" + this.f115016a + ") -> onFailure(" + ((Object) charSequence) + ")");
        this.f115017b.a(charSequence);
    }
}
