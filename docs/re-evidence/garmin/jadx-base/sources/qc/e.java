package qc;

import android.os.Bundle;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.Arrays;
import lc.v;
import o13.p;
import p005kotlin.Metadata;
import p13.k0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0019\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0015\b\u0010\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\u0006\u0010\u000b¨\u0006\r"}, d2 = {"Lqc/e;", "", "Llc/v;", "entry", "", "destId", "<init>", "(Llc/v;I)V", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", RemoteConfigConstants.ResponseFieldKey.STATE, "(Landroid/os/Bundle;)V", "a", "navigation-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f144307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f144308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f144309c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bundle f144310d;

    static {
        new a(null);
    }

    public e(v vVar, int i14) {
        vVar.getClass();
        this.f144307a = vVar.f111886f;
        this.f144308b = i14;
        d dVar = vVar.f111888h;
        this.f144309c = dVar.a();
        k0.f134949a.getClass();
        p[] pVarArr = new p[0];
        Bundle bundleA = h7.c.a((p[]) Arrays.copyOf(pVarArr, pVarArr.length));
        this.f144310d = bundleA;
        dVar.getClass();
        dVar.f144300h.b(bundleA);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lqc/e$a;", "", "<init>", "()V", "", "KEY_ID", "Ljava/lang/String;", "KEY_DESTINATION_ID", "KEY_ARGS", "KEY_SAVED_STATE", "navigation-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public e(Bundle bundle) {
        bundle.getClass();
        this.f144307a = nd.b.h(bundle, "nav-entry-state:id");
        this.f144308b = nd.b.d(bundle, "nav-entry-state:destination-id");
        this.f144309c = nd.b.g(bundle, "nav-entry-state:args");
        this.f144310d = nd.b.g(bundle, "nav-entry-state:saved-state");
    }
}
