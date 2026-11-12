package xt;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.f0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lxt/a;", "Lcom/garmin/android/apps/connectmobile/f0;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ldu/a;", "annualReportApi", "<init>", "(Landroid/content/Context;Ldu/a;)V", "a", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f192132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final du.a f192133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rt.a f192134c;

    static {
        new C3582a(null);
    }

    public a(Context context, du.a aVar) {
        context.getClass();
        aVar.getClass();
        this.f192132a = context;
        this.f192133b = aVar;
        this.f192134c = (rt.a) KoinJavaComponent.get$default(rt.a.class, null, null, 6, null);
    }

    /* JADX INFO: renamed from: xt.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lxt/a$a;", "", "<init>", "()V", "", "SHARE_IMAGE_FOLDER", "Ljava/lang/String;", "PRE_PROCESS_IMAGE_FOLDER", "TAG", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3582a {
        public /* synthetic */ C3582a(j jVar) {
            this();
        }

        private C3582a() {
        }
    }
}
