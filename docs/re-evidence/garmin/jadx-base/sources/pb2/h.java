package pb2;

import androidx.room.a0;
import ch.qos.logback.core.CoreConstants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.List;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import qb2.a1;
import qb2.b1;
import vh.l0;
import vh.q;
import vh.s0;
import vh.w;
import vh.z;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\n\u000bB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lpb2/h;", "Lvh/s0;", "Lpb2/h$b;", "Lorg/joda/time/DateTime;", "date", "", RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, "firstDayOfWeek", "<init>", "(Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;)V", "a", "b", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class h implements s0<b> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f137155d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateTime f137156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f137157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f137158c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lpb2/h$b;", "Lvh/s0$a;", "", "trainingPlanScalar", "<init>", "(Ljava/lang/Object;)V", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class b implements s0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f137159a;

        public b(Object obj) {
            this.f137159a = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && s.g(this.f137159a, ((b) obj).f137159a);
        }

        public final int hashCode() {
            Object obj = this.f137159a;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public final String toString() {
            return wr.g.p(new StringBuilder("Data(trainingPlanScalar="), this.f137159a, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    public h(DateTime dateTime, String str, String str2) {
        dateTime.getClass();
        str.getClass();
        str2.getClass();
        this.f137156a = dateTime;
        this.f137157b = str;
        this.f137158c = str2;
    }

    @Override // vh.e0
    public final l0 a() {
        return vh.c.b(a1.f144194a, false);
    }

    @Override // vh.e0
    public final q b() {
        ub2.s0.f169891a.getClass();
        q.a aVar = new q.a("data", ub2.s0.f169892b);
        tb2.h.f163800a.getClass();
        List<w> list = tb2.h.f163801b;
        list.getClass();
        aVar.f178381f = list;
        return aVar.c();
    }

    @Override // vh.e0
    public final void c(zh.g gVar, z zVar) {
        zVar.getClass();
        b1.f144200a.getClass();
        b1.c(gVar, zVar, this);
    }

    @Override // vh.n0
    public final String d() {
        f137155d.getClass();
        return "query Training($date: Date!, $languageCode: String!, $firstDayOfWeek: String!) { trainingPlanScalar(calendarDate: $date, lang: $languageCode, firstDayOfWeek: $firstDayOfWeek) }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f137156a.equals(hVar.f137156a) && this.f137157b.equals(hVar.f137157b) && this.f137158c.equals(hVar.f137158c);
    }

    public final int hashCode() {
        return this.f137158c.hashCode() + wr.g.j(this.f137156a.hashCode() * 31, 31, this.f137157b);
    }

    @Override // vh.n0
    public final String id() {
        return "572d21268722fec3c60fae896537a3ee21d82f6054cd6a6d7aef66ad98367b5a";
    }

    @Override // vh.n0
    public final String name() {
        return "Training";
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("TrainingQuery(date=");
        sb3.append(this.f137156a);
        sb3.append(", languageCode=");
        sb3.append(this.f137157b);
        sb3.append(", firstDayOfWeek=");
        return a0.m(sb3, this.f137158c, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lpb2/h$a;", "", "<init>", "()V", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "graphql-gateway-schemas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
