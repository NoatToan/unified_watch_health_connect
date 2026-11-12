package lu2;

import android.companion.CompanionDeviceManager;
import android.content.IntentSender;
import o13.e;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Llu2/c;", "Landroid/companion/CompanionDeviceManager$Callback;", "device-setup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c extends CompanionDeviceManager.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f115018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a.InterfaceC2186a f115019b;

    public c(String str, a.InterfaceC2186a interfaceC2186a) {
        this.f115018a = str;
        this.f115019b = interfaceC2186a;
    }

    @Override // android.companion.CompanionDeviceManager.Callback
    @e
    public final void onDeviceFound(IntentSender intentSender) {
        intentSender.getClass();
        com.airbnb.lottie.animation.keyframe.a.u("Companion Device(", this.f115018a, ") -> onDeviceFound SUCCESS", a.f115015b);
        this.f115019b.b(intentSender);
    }

    @Override // android.companion.CompanionDeviceManager.Callback
    public final void onFailure(CharSequence charSequence) {
        a.f115015b.error("Companion Device(" + this.f115018a + ") -> onFailure(" + ((Object) charSequence) + ")");
        this.f115019b.a(charSequence);
    }
}
