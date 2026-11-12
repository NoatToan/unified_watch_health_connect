package qg1;

import c83.a0;
import com.nimbusds.jose.jwk.JWKParameterNames;
import i83.f;
import i83.o;
import i83.s;
import java.util.List;
import p005kotlin.Metadata;
import t13.d;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J&\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\t\u0010\nJ*\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u00072\b\b\u0001\u0010\f\u001a\u00020\u0007H§@¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u0007H§@¢\u0006\u0004\b\u0010\u0010\nJ\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0002H§@¢\u0006\u0004\b\u0012\u0010\u0006¨\u0006\u0013À\u0006\u0003"}, d2 = {"Lqg1/a;", "", "Lc83/a0;", "", "Lqg1/b;", "b", "(Lt13/d;)Ljava/lang/Object;", "", "unitId", "a", "(JLt13/d;)Ljava/lang/Object;", "targetUnitId", "backupId", "d", "(JJLt13/d;)Ljava/lang/Object;", "deviceId", JWKParameterNames.RSA_EXPONENT, "Lqg1/c;", "c", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @f("/devicebackup-service/backup/{unitId}")
    Object a(@s("unitId") long j8, d<? super a0<List<b>>> dVar);

    @f("/devicebackup-service/backup")
    Object b(d<? super a0<List<b>>> dVar);

    @f("/devicebackup-service/backup/summary")
    Object c(d<? super a0<c>> dVar);

    @o("/devicebackup-service/backup/restoreDevice/{targetDeviceId}/{backupId}")
    Object d(@s("targetDeviceId") long j8, @s("backupId") long j14, d<? super a0<Object>> dVar);

    @i83.b("/devicebackup-service/backup/{deviceId}")
    Object e(@s("deviceId") long j8, d<? super a0<Object>> dVar);
}
