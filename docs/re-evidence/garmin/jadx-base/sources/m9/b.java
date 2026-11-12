package m9;

import android.content.Context;
import android.os.Binder;
import java.util.Arrays;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class b extends g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f117215c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f117216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f117217b;

    public b(Context context, Executor executor) {
        this.f117216a = context;
        this.f117217b = executor;
    }

    public final void k0(String str) {
        String[] packagesForUid = this.f117216a.getPackageManager().getPackagesForUid(Binder.getCallingUid());
        if (str == null || packagesForUid == null || Arrays.stream(packagesForUid).noneMatch(new a(str, 0))) {
            com.garmin.proto.generated.a.h("Invalid package name!");
        } else {
            if ("com.google.android.apps.healthdata".equals(str)) {
                return;
            }
            com.garmin.proto.generated.a.h("Not allowed!");
        }
    }
}
