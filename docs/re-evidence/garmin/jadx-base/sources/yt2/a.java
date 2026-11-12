package yt2;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001:\u0001\u000fBA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lyt2/a;", "Lyt2/d;", "Landroid/content/Context;", "appContext", "", "clientName", "Lkotlin/Function0;", "Lad2/d;", "environment", "", "isAppVisible", "Landroid/content/SharedPreferences;", "sharedPreferences", "<init>", "(Landroid/content/Context;Ljava/lang/String;Le23/a;Le23/a;Landroid/content/SharedPreferences;)V", "b", "analytics-omt_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class a implements d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f199649f = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f199650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f199651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e23.a<ad2.d> f199652c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e23.a<Boolean> f199653d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SharedPreferences f199654e;

    /* JADX INFO: renamed from: yt2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C3735a extends w implements e23.a<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f199655a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3735a(Context context) {
            super(0);
            this.f199655a = context;
        }

        @Override // e23.a
        public final Boolean invoke() {
            boolean z14;
            b bVar = a.f199649f;
            Context context = this.f199655a;
            bVar.getClass();
            try {
                Object systemService = context.getSystemService("activity");
                ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager != null ? activityManager.getRunningAppProcesses() : null;
                if (runningAppProcesses != null && !runningAppProcesses.isEmpty()) {
                    for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                        if (s.g(runningAppProcessInfo.processName, context.getPackageName()) && runningAppProcessInfo.importance == 100) {
                            z14 = true;
                            return Boolean.valueOf(z14);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
            z14 = false;
            return Boolean.valueOf(z14);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(Context context, String str, e23.a<? extends ad2.d> aVar, e23.a<Boolean> aVar2, SharedPreferences sharedPreferences) {
        context.getClass();
        str.getClass();
        aVar.getClass();
        aVar2.getClass();
        this.f199650a = context;
        this.f199651b = str;
        this.f199652c = aVar;
        this.f199653d = aVar2;
        this.f199654e = sharedPreferences;
    }

    @Override // yt2.d
    public final boolean a() {
        return this.f199653d.invoke().booleanValue();
    }

    @Override // yt2.d
    public final ad2.d b() {
        return this.f199652c.invoke();
    }

    @Override // yt2.d
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Context getF199650a() {
        return this.f199650a;
    }

    @Override // yt2.d
    public final g d() {
        SharedPreferences sharedPreferences = this.f199654e;
        return sharedPreferences != null ? new g(this.f199651b, this.f199650a, sharedPreferences) : new g(this.f199651b, this.f199650a, null, 4, null);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyt2/a$b;", "", "<init>", "()V", "analytics-omt_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(j jVar) {
            this();
        }

        private b() {
        }
    }

    public /* synthetic */ a(Context context, String str, e23.a aVar, e23.a aVar2, SharedPreferences sharedPreferences, int i14, j jVar) {
        this(context, str, aVar, (i14 & 8) != 0 ? new C3735a(context) : aVar2, (i14 & 16) != 0 ? null : sharedPreferences);
    }
}
