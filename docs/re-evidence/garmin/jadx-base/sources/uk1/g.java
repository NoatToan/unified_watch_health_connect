package uk1;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB%\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Luk1/g;", "Lcom/garmin/android/library/backgroundtaskmanagement/b;", "Lok1/b;", "Lcom/garmin/android/library/backgroundtaskmanagement/b$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", RemoteConfigComponent.DEFAULTS_FILE_NAME, "", "sport", "<init>", "(Lcom/garmin/android/library/backgroundtaskmanagement/b$a;ZLjava/lang/String;)V", "a", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g extends com.garmin.android.library.backgroundtaskmanagement.b<ok1.b> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f171896l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f171897m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ok1.b f171898n;

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.garmin.android.library.backgroundtaskmanagement.b.a aVar, boolean z14, String str) {
        super(com.garmin.android.library.backgroundtaskmanagement.b.d.UI_PRIORITY, aVar);
        aVar.getClass();
        this.f171896l = z14;
        this.f171897m = str;
        ok1.b bVar = new ok1.b();
        this.f171898n = bVar;
        i(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE, bVar);
        b(new h(this));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Luk1/g$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ g(com.garmin.android.library.backgroundtaskmanagement.b.a aVar, boolean z14, String str, int i14, p005kotlin.jvm.internal.j jVar) {
        this(aVar, (i14 & 2) != 0 ? true : z14, str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(com.garmin.android.library.backgroundtaskmanagement.b.a aVar, String str) {
        this(aVar, false, str, 2, null);
        aVar.getClass();
    }
}
