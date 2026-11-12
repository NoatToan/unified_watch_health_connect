package gh2;

import com.google.firebase.remoteconfig.FirebaseRemoteConfigInfo;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;

/* JADX INFO: loaded from: classes11.dex */
public class h implements FirebaseRemoteConfigInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f77456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f77457b;

    @Override // com.google.firebase.remoteconfig.FirebaseRemoteConfigInfo
    public final FirebaseRemoteConfigSettings getConfigSettings() {
        return null;
    }

    @Override // com.google.firebase.remoteconfig.FirebaseRemoteConfigInfo
    public final long getFetchTimeMillis() {
        return this.f77456a;
    }

    @Override // com.google.firebase.remoteconfig.FirebaseRemoteConfigInfo
    public final int getLastFetchStatus() {
        return this.f77457b;
    }
}
