package hf0;

import f12.l;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lhf0/b;", "Lhf0/a;", "<init>", "()V", "a", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements hf0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f83623a = (l) KoinJavaComponent.get$default(l.class, null, null, 6, null);

    static {
        new a(null);
    }

    @Override // hf0.a
    public final void a() {
        this.f83623a.O2("key_ecg_chart_tool_tip_enabled", false);
    }

    public final boolean b() {
        return this.f83623a.W2("key_ghs_ecg_enabled", false);
    }

    public final boolean c() {
        return this.f83623a.W2("key_ecg_upload_notification_enabled", true);
    }

    public final void d(boolean z14) {
        this.f83623a.O2("key_ghs_ecg_enabled", z14);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lhf0/b$a;", "", "<init>", "()V", "", "GHS_ECG_ENABLED", "Ljava/lang/String;", "ECG_UPLOAD_NOTIFICATION_ENABLED", "ECG_CHART_TOOL_TIP_ENABLED", "BIND_MFA_TOKEN_TO_OAUTH2_CALLED", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
