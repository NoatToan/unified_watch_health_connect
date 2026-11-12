package ke0;

import c83.a0;
import com.garmin.android.gncs.NotificationConstants;
import com.nimbusds.jose.jwk.JWKParameterNames;
import fz0.e;
import i83.f;
import i83.o;
import i83.p;
import i83.s;
import i83.t;
import java.util.List;
import je0.h;
import je0.i;
import p005kotlin.Metadata;
import t13.d;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\n\u0010\u000bJ \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\f\u0010\rJ(\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00100\u00042\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u000eH§@¢\u0006\u0004\b\u0011\u0010\u0012JD\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00100\u00042\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u00132\u000e\b\u0001\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0010H§@¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00042\u000e\b\u0001\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010H§@¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001eÀ\u0006\u0003"}, d2 = {"Lke0/a;", "", "Lje0/b;", "request", "Lc83/a0;", "Lje0/c;", "a", "(Lje0/b;Lt13/d;)Ljava/lang/Object;", "", "animalProfileId", "f", "(JLje0/b;Lt13/d;)Ljava/lang/Object;", "c", "(JLt13/d;)Ljava/lang/Object;", "", NotificationConstants.KEY_DATA_MIME_TYPE, "", JWKParameterNames.RSA_EXPONENT, "(Ljava/lang/String;Lt13/d;)Ljava/lang/Object;", "Lfz0/e;", "startDate", "endDate", "dogProfileIds", "Lje0/i;", "d", "(Lfz0/e;Lfz0/e;Ljava/util/List;Lt13/d;)Ljava/lang/Object;", "metrics", "Lje0/h;", "b", "(Ljava/util/List;Lt13/d;)Ljava/lang/Object;", "gcm-domain-dogs_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @o("/animal-service/animal")
    Object a(@i83.a je0.b bVar, d<? super a0<je0.c>> dVar);

    @f("/fitnessstats-service/activity-animal/dog/stats/lifetime")
    Object b(@t("metric") List<String> list, d<? super a0<h>> dVar);

    @f("/animal-service/animal/{animalProfileId}")
    Object c(@s("animalProfileId") long j8, d<? super a0<je0.c>> dVar);

    @o("/fitnessstats-service/activity-animal/dog/stats/bulk")
    Object d(@t("startDate") e eVar, @t("endDate") e eVar2, @i83.a List<Long> list, d<? super a0<List<i>>> dVar);

    @f("/animal-service/animal")
    Object e(@t(NotificationConstants.KEY_DATA_MIME_TYPE) String str, d<? super a0<List<je0.c>>> dVar);

    @p("/animal-service/animal/{animalProfileId}")
    Object f(@s("animalProfileId") long j8, @i83.a je0.b bVar, d<? super a0<je0.c>> dVar);
}
