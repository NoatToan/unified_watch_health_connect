package gh2;

import android.content.Context;
import android.util.Pair;
import com.google.android.exoplayer2.analytics.q;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.remoteconfig.ConfigUpdate;
import com.google.firebase.remoteconfig.ConfigUpdateListener;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigInfo;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;
import java.util.TreeSet;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import v.e0;

/* JADX INFO: loaded from: classes11.dex */
public class b extends n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f77423c = m.a("FirebaseRemoteConfiguration");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FirebaseRemoteConfig f77424b;

    public class a implements ConfigUpdateListener {
        public a() {
        }

        @Override // com.google.firebase.remoteconfig.ConfigUpdateListener
        public final void onError(FirebaseRemoteConfigException firebaseRemoteConfigException) {
            b.f77423c.warn("Config update error with code: " + firebaseRemoteConfigException.getCode(), (Throwable) firebaseRemoteConfigException);
        }

        @Override // com.google.firebase.remoteconfig.ConfigUpdateListener
        public final void onUpdate(ConfigUpdate configUpdate) {
            b.f77423c.debug("Updated keys: " + configUpdate.getUpdatedKeys());
            b.this.f77424b.activate().addOnSuccessListener(new q(25, this, configUpdate));
        }
    }

    /* JADX INFO: renamed from: gh2.b$b, reason: collision with other inner class name */
    public static class C1564b extends i.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f77426a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f77427b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f77428c = 3600;

        public C1564b(Context context, int i14) {
            this.f77426a = context;
            this.f77427b = i14;
        }

        @Override // gh2.i.a
        public final i.c b() {
            return i.c.Firebase;
        }

        @Override // gh2.i.a
        public final n c() {
            return new b(this.f77426a, this.f77427b, this.f77428c, 0);
        }
    }

    private b(Context context, int i14, long j8) {
        try {
            this.f77424b = FirebaseRemoteConfig.getInstance();
        } catch (IllegalStateException unused) {
            FirebaseApp.initializeApp(context);
            this.f77424b = FirebaseRemoteConfig.getInstance();
        }
        this.f77424b.setConfigSettingsAsync(new FirebaseRemoteConfigSettings.Builder().setMinimumFetchIntervalInSeconds(j8).build());
        this.f77424b.setDefaultsAsync(i14);
        this.f77424b.addOnConfigUpdateListener(new a());
    }

    public static /* synthetic */ void j(b bVar, Task task) {
        boolean zIsSuccessful = task.isSuccessful();
        Logger logger = f77423c;
        if (!zIsSuccessful) {
            logger.warn("fetchConfig: 'activate' unsuccessful", (Throwable) task.getException());
            return;
        }
        logger.debug("fetchConfig: 'activate' success");
        bVar.a();
        bVar.setChanged();
        bVar.notifyObservers();
    }

    public static String k(int i14) {
        if (i14 == -1) {
            return "LAST_FETCH_STATUS_SUCCESS";
        }
        if (i14 == 0) {
            return "LAST_FETCH_STATUS_NO_FETCH_YET";
        }
        if (i14 != 1) {
            return i14 != 2 ? e0.f(i14, "unknown(", ")") : "LAST_FETCH_STATUS_THROTTLED";
        }
        return "LAST_FETCH_STATUS_FAILURE";
    }

    @Override // gh2.n
    public final void b() {
        FirebaseRemoteConfig firebaseRemoteConfig = this.f77424b;
        FirebaseRemoteConfigInfo info = firebaseRemoteConfig.getInfo();
        Logger logger = f77423c;
        if (info == null) {
            logger.error("fetchConfig: 'FirebaseRemoteConfigInfo' is null");
            return;
        }
        logger.debug("fetchConfig: minimumFetchIntervalInSeconds [" + info.getConfigSettings().getMinimumFetchIntervalInSeconds() + "]");
        firebaseRemoteConfig.fetch().addOnCompleteListener(new q(24, this, info));
    }

    @Override // gh2.n
    public final boolean c(String str) {
        return this.f77424b.getBoolean(str);
    }

    @Override // gh2.n
    public final String d() {
        FirebaseRemoteConfig firebaseRemoteConfig = this.f77424b;
        try {
            StringBuilder sb3 = new StringBuilder();
            for (String str : firebaseRemoteConfig.getKeysByPrefix("")) {
                sb3.append(str);
                sb3.append(": ");
                sb3.append(firebaseRemoteConfig.getValue(str).asString());
                sb3.append(IOUtils.LINE_SEPARATOR_WINDOWS);
            }
            return sb3.toString();
        } catch (Exception e4) {
            f77423c.error("getConfiguration", (Throwable) e4);
            return "";
        }
    }

    @Override // gh2.n
    public final Pair[] e() {
        FirebaseRemoteConfig firebaseRemoteConfig = this.f77424b;
        try {
            TreeSet<String> treeSet = new TreeSet(firebaseRemoteConfig.getKeysByPrefix(""));
            Pair[] pairArr = new Pair[treeSet.size()];
            int i14 = 0;
            for (String str : treeSet) {
                pairArr[i14] = Pair.create(str, m.d(firebaseRemoteConfig.getValue(str).asString()));
                i14++;
            }
            return pairArr;
        } catch (Exception e4) {
            f77423c.error("getConfigurationPairs", (Throwable) e4);
            return null;
        }
    }

    @Override // gh2.n
    public final FirebaseRemoteConfigInfo f() {
        return this.f77424b.getInfo();
    }

    @Override // gh2.n
    public final long g(String str) {
        return this.f77424b.getLong(str);
    }

    @Override // gh2.n
    public final String h(String str) {
        return this.f77424b.getString(str);
    }

    public /* synthetic */ b(Context context, int i14, long j8, int i15) {
        this(context, i14, j8);
    }
}
