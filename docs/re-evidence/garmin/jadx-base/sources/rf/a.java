package rf;

import android.app.ActivityManager;
import android.content.Context;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import e23.l;
import p005kotlin.Unit;
import vp0.k;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f152361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ double f152362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f152363c;

    public /* synthetic */ a(Context context, double d14) {
        this.f152361a = 0;
        this.f152362b = d14;
        this.f152363c = context;
    }

    @Override // e23.a
    public final Object invoke() {
        int largeMemoryClass;
        switch (this.f152361a) {
            case 0:
                Context context = (Context) this.f152363c;
                try {
                    Object systemService = a7.b.getSystemService(context, ActivityManager.class);
                    systemService.getClass();
                    ActivityManager activityManager = (ActivityManager) systemService;
                    largeMemoryClass = (context.getApplicationInfo().flags & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
                    break;
                } catch (Exception unused) {
                    largeMemoryClass = 256;
                }
                return Long.valueOf((long) (this.f152362b * ((long) largeMemoryClass) * 1048576));
            case 1:
                ((l) this.f152363c).invoke(Double.valueOf(this.f152362b));
                return Unit.INSTANCE;
            default:
                k kVar = (k) this.f152363c;
                kVar.f179381o = false;
                Double d14 = kVar.f179369c;
                double d15 = this.f152362b;
                kVar.f179369c = d14 != null ? Double.valueOf(d14.doubleValue() + d15) : null;
                kVar.f179373g.a(Double.valueOf(d15));
                kVar.d();
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ a(Object obj, double d14, int i14) {
        this.f152361a = i14;
        this.f152363c = obj;
        this.f152362b = d14;
    }
}
