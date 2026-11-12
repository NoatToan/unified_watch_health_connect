package s5;

import ch.qos.logback.core.CoreConstants;
import com.nimbusds.jose.HeaderParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Ls5/m;", "Ls5/c$a;", "<init>", "()V", "b", "a", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class m implements c.a {
    public /* synthetic */ m(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    /* JADX INFO: renamed from: a */
    public abstract n getF157244c();

    /* JADX INFO: renamed from: b */
    public abstract r0 getF157243b();

    private m() {
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ls5/m$a;", "Ls5/m;", "", HeaderParameterNames.AUTHENTICATION_TAG, "Ls5/r0;", "styles", "Ls5/n;", "linkInteractionListener", "<init>", "(Ljava/lang/String;Ls5/r0;Ls5/n;)V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f157239a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final r0 f157240b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final n f157241c;

        public a(String str, r0 r0Var, n nVar) {
            super(null);
            this.f157239a = str;
            this.f157240b = r0Var;
            this.f157241c = nVar;
        }

        @Override // s5.m
        /* JADX INFO: renamed from: a, reason: from getter */
        public final n getF157244c() {
            return this.f157241c;
        }

        @Override // s5.m
        /* JADX INFO: renamed from: b, reason: from getter */
        public final r0 getF157243b() {
            return this.f157240b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p005kotlin.jvm.internal.s.g(this.f157239a, aVar.f157239a) && p005kotlin.jvm.internal.s.g(this.f157240b, aVar.f157240b) && p005kotlin.jvm.internal.s.g(this.f157241c, aVar.f157241c);
        }

        public final int hashCode() {
            int iHashCode = this.f157239a.hashCode() * 31;
            r0 r0Var = this.f157240b;
            int iHashCode2 = (iHashCode + (r0Var != null ? r0Var.hashCode() : 0)) * 31;
            n nVar = this.f157241c;
            return iHashCode2 + (nVar != null ? nVar.hashCode() : 0);
        }

        public final String toString() {
            return androidx.room.a0.m(new StringBuilder("LinkAnnotation.Clickable(tag="), this.f157239a, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }

        public /* synthetic */ a(String str, r0 r0Var, n nVar, int i14, p005kotlin.jvm.internal.j jVar) {
            this(str, (i14 & 2) != 0 ? null : r0Var, nVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ls5/m$b;", "Ls5/m;", "", "url", "Ls5/r0;", "styles", "Ls5/n;", "linkInteractionListener", "<init>", "(Ljava/lang/String;Ls5/r0;Ls5/n;)V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f157242a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final r0 f157243b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final n f157244c;

        public /* synthetic */ b(String str, r0 r0Var, n nVar, int i14, p005kotlin.jvm.internal.j jVar) {
            this(str, (i14 & 2) != 0 ? null : r0Var, (i14 & 4) != 0 ? null : nVar);
        }

        @Override // s5.m
        /* JADX INFO: renamed from: a, reason: from getter */
        public final n getF157244c() {
            return this.f157244c;
        }

        @Override // s5.m
        /* JADX INFO: renamed from: b, reason: from getter */
        public final r0 getF157243b() {
            return this.f157243b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return p005kotlin.jvm.internal.s.g(this.f157242a, bVar.f157242a) && p005kotlin.jvm.internal.s.g(this.f157243b, bVar.f157243b) && p005kotlin.jvm.internal.s.g(this.f157244c, bVar.f157244c);
        }

        public final int hashCode() {
            int iHashCode = this.f157242a.hashCode() * 31;
            r0 r0Var = this.f157243b;
            int iHashCode2 = (iHashCode + (r0Var != null ? r0Var.hashCode() : 0)) * 31;
            n nVar = this.f157244c;
            return iHashCode2 + (nVar != null ? nVar.hashCode() : 0);
        }

        public final String toString() {
            return androidx.room.a0.m(new StringBuilder("LinkAnnotation.Url(url="), this.f157242a, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }

        public b(String str, r0 r0Var, n nVar) {
            super(null);
            this.f157242a = str;
            this.f157243b = r0Var;
            this.f157244c = nVar;
        }
    }
}
