package j31;

import android.content.Context;
import com.garmin.android.apps.connectmobile.s2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public interface z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f96953a = 0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lj31/z0$a;", "", "<init>", "()V", "gcm-onboarding_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f96954a = 0;

        static {
            new a();
        }

        private a() {
        }
    }

    static {
        int i14 = a.f96954a;
    }

    static /* synthetic */ void b(z0 z0Var, Context context, s2 s2Var, long j8, String str, String str2, int i14) {
        if ((i14 & 4) != 0) {
            j8 = 0;
        }
        z0Var.d(context, j8, (i14 & 8) != 0 ? "" : str, (i14 & 16) != 0 ? "" : str2);
    }

    default boolean a() {
        return false;
    }

    default Object c(long j8, v13.c cVar) {
        return Unit.INSTANCE;
    }

    void d(Context context, long j8, String str, String str2);
}
