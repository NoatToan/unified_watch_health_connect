package du0;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.proto.generated.GDIEventSharingProto;
import dh0.j;
import o13.m;
import o13.t;
import o53.b0;
import o53.e2;
import o53.s0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000bB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Ldu0/c;", "", "Lo53/b0;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "deviceId", "Lcom/garmin/proto/generated/GDIEventSharingProto$ActivityAlertDetails;", "activityAlertDetails", "<init>", "(Landroid/content/Context;JLcom/garmin/proto/generated/GDIEventSharingProto$ActivityAlertDetails;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements b0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f61224g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f61225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f61226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final GDIEventSharingProto.ActivityAlertDetails f61227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e2 f61228d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final lu0.a f61229e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f61230f;

    static {
        new a(null);
    }

    public c(Context context, long j8, GDIEventSharingProto.ActivityAlertDetails activityAlertDetails) {
        context.getClass();
        activityAlertDetails.getClass();
        this.f61225a = context;
        this.f61226b = j8;
        this.f61227c = activityAlertDetails;
        this.f61228d = ge1.b.h();
        this.f61229e = new lu0.a(context);
        this.f61230f = m.b(new j(11));
    }

    @Override // o53.b0
    /* JADX INFO: renamed from: getCoroutineContext */
    public final t13.g getF195311f() {
        x53.c cVar = s0.f129406a;
        return x53.b.f189152a.plus(this.f61228d);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ldu0/c$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
