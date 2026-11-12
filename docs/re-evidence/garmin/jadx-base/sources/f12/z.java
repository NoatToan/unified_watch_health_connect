package f12;

import android.content.SharedPreferences;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lf12/z;", "Lf12/y;", "<init>", "()V", "a", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class z implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f68125a = (l) KoinJavaComponent.get$default(l.class, null, null, 6, null);

    static {
        new a(null);
    }

    @Override // f12.y
    public final void a(boolean z14) {
        this.f68125a.O2("keyhandleCtkdDualPairFailureImmediately", z14);
    }

    @Override // f12.y
    public final void b() {
        i(false);
        c(false);
        a(false);
    }

    @Override // f12.y
    public final void c(boolean z14) {
        this.f68125a.O2("keyCtkdRegisterDisconnect", z14);
    }

    @Override // f12.y
    public final boolean d() {
        return this.f68125a.W2("keyVoiceAssistantTipMessaging", true);
    }

    @Override // f12.y
    public final boolean e() {
        l lVar = this.f68125a;
        return lVar.W2("keyCtkdRegisterDisconnect", false) && !lVar.W2("keyCtkdRegisterConnect", false);
    }

    @Override // f12.y
    public final void f() {
        this.f68125a.O2("keyVoiceAssistantTipMessaging", false);
    }

    @Override // f12.y
    public final void g(p90.m.b bVar) {
        this.f68125a.u3(bVar);
    }

    @Override // f12.y
    public final boolean h() {
        return this.f68125a.W2("keyhandleCtkdDualPairFailureImmediately", false);
    }

    @Override // f12.y
    public final void i(boolean z14) {
        this.f68125a.O2("keyCtkdRegisterConnect", z14);
    }

    @Override // f12.y
    public final void j(long j8) {
        this.f68125a.h2(j8, "keyVoiceAssistantTipForDevice");
    }

    @Override // f12.y
    public final long k() {
        return this.f68125a.D3(-1L, "keyVoiceAssistantTipForDevice");
    }

    @Override // f12.y
    public final void r(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        onSharedPreferenceChangeListener.getClass();
        this.f68125a.r(onSharedPreferenceChangeListener);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lf12/z$a;", "", "<init>", "()V", "", "CTKD_REGISTER_CONNECTED", "Ljava/lang/String;", "CTKD_REGISTER_DISCONNECTED", "HANDLE_CTKD_DUAL_PAIR_FAILURE_IMMEDIATELY", "VOICE_ASSISTANT_TIP_FOR_DEVICE", "VOICE_ASSISTANT_TIP_MESSAGING", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
