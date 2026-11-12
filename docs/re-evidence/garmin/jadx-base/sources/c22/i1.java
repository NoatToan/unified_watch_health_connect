package c22;

import com.google.android.play.core.splitinstall.SplitInstallSessionState;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class i1 implements e23.l<SplitInstallSessionState, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.p<Boolean, String, Unit> f23087a;

    /* JADX WARN: Multi-variable type inference failed */
    public i1(e23.p<? super Boolean, ? super String, Unit> pVar) {
        this.f23087a = pVar;
    }

    @Override // e23.l
    public final Unit invoke(SplitInstallSessionState splitInstallSessionState) {
        SplitInstallSessionState splitInstallSessionState2 = splitInstallSessionState;
        int iStatus = splitInstallSessionState2.status();
        e23.p<Boolean, String, Unit> pVar = this.f23087a;
        if (iStatus == 5) {
            pVar.invoke(Boolean.TRUE, "Session state check confirmed INSTALLED.");
        } else if (splitInstallSessionState2.status() == 6) {
            pVar.invoke(Boolean.FALSE, "Session state check confirmed FAILED.");
        } else if (splitInstallSessionState2.status() == 7) {
            pVar.invoke(Boolean.FALSE, "Session state check confirmed CANCELED.");
        }
        return Unit.INSTANCE;
    }
}
