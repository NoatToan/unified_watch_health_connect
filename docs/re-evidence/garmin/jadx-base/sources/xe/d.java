package xe;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;
import ue.u;
import ue.v;

/* JADX INFO: loaded from: classes7.dex */
public class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f190402d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComponentName f190403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue.b f190404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f190405c;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f190406a;

        static {
            int[] iArr = new int[v.values().length];
            f190406a = iArr;
            try {
                iArr[v.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f190406a[v.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f190406a[v.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f190406a[v.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f190406a[v.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        u.b("SystemJobInfoConverter");
    }

    public d(Context context, ue.b bVar, boolean z14) {
        this.f190404b = bVar;
        this.f190403a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
        this.f190405c = z14;
    }
}
