package sd1;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import o53.b0;
import o53.e2;
import o53.s0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\nB\u001b\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lsd1/b;", "Lcom/garmin/android/library/backgroundtaskmanagement/e;", "Lpd1/c;", "Lo53/b0;", "Lcom/garmin/android/library/backgroundtaskmanagement/b$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lpd1/a;", "reminderType", "<init>", "(Lcom/garmin/android/library/backgroundtaskmanagement/b$a;Lpd1/a;)V", "a", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends com.garmin.android.library.backgroundtaskmanagement.e<pd1.c> implements b0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Logger f158617o;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final pd1.a f158618m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e2 f158619n;

    static {
        new a(null);
        int i14 = gt2.c.f79010a;
        f158617o = gt2.b.f79005a.h("FetchRemindersOperation");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.garmin.android.library.backgroundtaskmanagement.b.a aVar, pd1.a aVar2) {
        super(com.garmin.android.library.backgroundtaskmanagement.b.d.UI_PRIORITY, aVar);
        aVar2.getClass();
        this.f158618m = aVar2;
        this.f158619n = ge1.b.h();
    }

    @Override // o53.b0
    /* JADX INFO: renamed from: getCoroutineContext */
    public final t13.g getF195311f() {
        return s0.f129406a.plus(this.f158619n);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lsd1/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "Lorg/slf4j/Logger;", "logger", "Lorg/slf4j/Logger;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ b(com.garmin.android.library.backgroundtaskmanagement.b.a aVar, pd1.a aVar2, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : aVar, aVar2);
    }
}
