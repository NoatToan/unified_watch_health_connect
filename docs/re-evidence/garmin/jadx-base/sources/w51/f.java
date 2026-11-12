package w51;

import com.garmin.android.apps.connectmobile.R;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, d2 = {"Lw51/f;", "", "", "message", "<init>", "(Ljava/lang/String;)V", "b", "a", "c", "Lw51/f$a;", "Lw51/f$b;", "Lw51/f$c;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f182255a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw51/f$a;", "Lw51/f;", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f182256b = new a();

        private a() {
            super(hb.a.h((c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null), R.string.msg_some_activities_failed_to_save), null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw51/f$b;", "Lw51/f;", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f182257b = new b();

        private b() {
            super(hb.a.h((c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null), R.string.txt_something_went_wrong_try_again), null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw51/f$c;", "Lw51/f;", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f182258b = new c();

        private c() {
            super(hb.a.h((c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null), R.string.msg_activities_failed_to_delete), null);
        }
    }

    private f(String str) {
        this.f182255a = str;
    }

    public /* synthetic */ f(String str, p005kotlin.jvm.internal.j jVar) {
        this(str);
    }
}
