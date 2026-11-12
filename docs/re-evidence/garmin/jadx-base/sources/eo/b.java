package eo;

import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\b\t\nB\u001b\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\u000b\f¨\u0006\r"}, d2 = {"Leo/b;", "", "", "displayLabelRes", "", Action.KEY_ATTRIBUTE, "<init>", "(ILjava/lang/String;)V", "a", "c", "b", "Leo/b$a;", "Leo/b$c;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1377b f64755c = new C1377b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f64756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f64757b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Leo/b$a;", "Leo/b;", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f64758d = new a();

        /* JADX WARN: Multi-variable type inference failed */
        private a() {
            super(R.string.lbl_any, null, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1354877554;
        }

        public final String toString() {
            return "Any";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Leo/b$c;", "Leo/b;", "Lqs/g;", "eventType", "<init>", "(Lqs/g;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c extends b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final qs.g f64759d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(qs.g gVar) {
            super(gVar.f147087d, gVar.f147086c, null);
            gVar.getClass();
            this.f64759d = gVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f64759d == ((c) obj).f64759d;
        }

        public final int hashCode() {
            return this.f64759d.hashCode();
        }

        public final String toString() {
            return "Specific(eventType=" + this.f64759d + ")";
        }
    }

    private b(int i14, String str) {
        this.f64756a = i14;
        this.f64757b = str;
    }

    /* JADX INFO: renamed from: eo.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Leo/b$b;", "", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1377b {
        public /* synthetic */ C1377b(j jVar) {
            this();
        }

        private C1377b() {
        }
    }

    public /* synthetic */ b(int i14, String str, j jVar) {
        this(i14, str);
    }
}
