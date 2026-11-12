package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.assetpacks.AssetPackException;
import com.xiaomi.onetrack.OneTrack;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class g6s extends pus {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TaskCompletionSource f18659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j8s f18660b;

    public g6s(j8s j8sVar, TaskCompletionSource taskCompletionSource) {
        this.f18660b = j8sVar;
        this.f18659a = taskCompletionSource;
    }

    @Override // defpackage.cxs
    public void C2(int i, Bundle bundle) {
        this.f18660b.d.u(this.f18659a);
        j8s.g.d("onStartDownload(%d)", Integer.valueOf(i));
    }

    @Override // defpackage.cxs
    public final void I(Bundle bundle) {
        this.f18660b.d.u(this.f18659a);
        j8s.g.d("onCancelDownloads()", new Object[0]);
    }

    @Override // defpackage.cxs
    public void K2(List list) {
        this.f18660b.d.u(this.f18659a);
        j8s.g.d("onGetSessionStates", new Object[0]);
    }

    @Override // defpackage.cxs
    public final void L1(int i, Bundle bundle) {
        this.f18660b.d.u(this.f18659a);
        j8s.g.d("onCancelDownload(%d)", Integer.valueOf(i));
    }

    @Override // defpackage.cxs
    public final void R0(int i, Bundle bundle) {
        this.f18660b.d.u(this.f18659a);
        j8s.g.d("onGetSession(%d)", Integer.valueOf(i));
    }

    public void Y1(Bundle bundle) {
        this.f18660b.d.u(this.f18659a);
        int i = bundle.getInt("error_code");
        j8s.g.b("onError(%d)", Integer.valueOf(i));
        this.f18659a.trySetException(new AssetPackException(i));
    }

    @Override // defpackage.cxs
    public final void Y2(Bundle bundle, Bundle bundle2) {
        this.f18660b.d.u(this.f18659a);
        j8s.g.d("onNotifySessionFailed(%d)", Integer.valueOf(bundle.getInt(OneTrack.Param.SESSION_ID)));
    }

    @Override // defpackage.cxs
    public final void e3(Bundle bundle, Bundle bundle2) {
        this.f18660b.d.u(this.f18659a);
        j8s.g.d("onRemoveModule()", new Object[0]);
    }

    public void g1(Bundle bundle, Bundle bundle2) {
        this.f18660b.e.u(this.f18659a);
        j8s.g.d("onKeepAlive(%b)", Boolean.valueOf(bundle.getBoolean("keep_alive")));
    }

    @Override // defpackage.cxs
    public void g2(Bundle bundle, Bundle bundle2) throws RemoteException {
        this.f18660b.d.u(this.f18659a);
        j8s.g.d("onGetChunkFileDescriptor", new Object[0]);
    }

    @Override // defpackage.cxs
    public void j3(Bundle bundle, Bundle bundle2) {
        this.f18660b.d.u(this.f18659a);
        j8s.g.d("onRequestDownloadInfo()", new Object[0]);
    }

    @Override // defpackage.cxs
    public final void n1(Bundle bundle, Bundle bundle2) {
        this.f18660b.d.u(this.f18659a);
        j8s.g.d("onNotifyChunkTransferred(%s, %s, %d, session=%d)", bundle.getString("module_name"), bundle.getString("slice_id"), Integer.valueOf(bundle.getInt("chunk_number")), Integer.valueOf(bundle.getInt(OneTrack.Param.SESSION_ID)));
    }

    @Override // defpackage.cxs
    public final void v1(Bundle bundle, Bundle bundle2) {
        this.f18660b.d.u(this.f18659a);
        j8s.g.d("onNotifyModuleCompleted(%s, sessionId=%d)", bundle.getString("module_name"), Integer.valueOf(bundle.getInt(OneTrack.Param.SESSION_ID)));
    }
}
