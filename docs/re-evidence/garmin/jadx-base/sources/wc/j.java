package wc;

import ch.qos.logback.core.CoreConstants;
import ds.e0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lwc/j;", "", "<init>", "()V", "b", "c", "a", "Lwc/j$b;", "Lwc/j$c;", "navigationevent"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class j {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwc/j$b;", "Lwc/j;", "<init>", "()V", "navigationevent"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f184258a = new b();

        private b() {
            super(null);
        }

        public final String toString() {
            return "Idle()";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lwc/j$c;", "Lwc/j;", "Lwc/b;", "latestEvent", "", "direction", "<init>", "(Lwc/b;I)V", "navigationevent"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c extends j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final wc.b f184259a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f184260b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(wc.b bVar, int i14) {
            super(null);
            bVar.getClass();
            this.f184259a = bVar;
            this.f184260b = i14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            return this.f184260b == cVar.f184260b && s.g(this.f184259a, cVar.f184259a);
        }

        public final int hashCode() {
            return this.f184259a.hashCode() + (this.f184260b * 31);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("InProgress(latestEvent=");
            sb3.append(this.f184259a);
            sb3.append(", direction=");
            return e0.j(sb3, this.f184260b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    static {
        new a(null);
    }

    public /* synthetic */ j(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lwc/j$a;", "", "<init>", "()V", "", "TRANSITIONING_UNKNOWN", "I", "TRANSITIONING_FORWARD", "TRANSITIONING_BACK", "navigationevent"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    private j() {
    }
}
