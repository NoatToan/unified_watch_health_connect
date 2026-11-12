package p71;

import com.garmin.android.apps.connectmobile.R;
import n71.g;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lp71/c;", "", "<init>", "(Ljava/lang/String;I)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f136304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f136305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ c[] f136306c;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/performance/viewmodel/filter/FilterCategory.EXERCISE", "Lp71/c;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final g.a f136307d;

        public a(String str, int i14) {
            super(str, i14, null);
            this.f136307d = new g.a(R.string.strength_training_exercises);
        }

        @Override // p71.c
        /* JADX INFO: renamed from: a, reason: from getter */
        public final g.a getF136308d() {
            return this.f136307d;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/performance/viewmodel/filter/FilterCategory.MUSCLE", "Lp71/c;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final g.a f136308d;

        public b(String str, int i14) {
            super(str, i14, null);
            this.f136308d = new g.a(R.string.strength_training_muscles);
        }

        @Override // p71.c
        /* JADX INFO: renamed from: a, reason: from getter */
        public final g.a getF136308d() {
            return this.f136308d;
        }
    }

    static {
        a aVar = new a("EXERCISE", 0);
        f136304a = aVar;
        b bVar = new b("MUSCLE", 1);
        f136305b = bVar;
        f136306c = new c[]{aVar, bVar};
    }

    public /* synthetic */ c(String str, int i14, j jVar) {
        this(str, i14);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f136306c.clone();
    }

    /* JADX INFO: renamed from: a */
    public abstract g.a getF136308d();

    private c(String str, int i14) {
        super(str, i14);
    }
}
