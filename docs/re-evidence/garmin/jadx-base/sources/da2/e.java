package da2;

import java.util.Collection;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.l0;
import p13.u;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0012B\t\b\u0012¢\u0006\u0004\b\u0002\u0010\u0003BA\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0002\u0010\u000eBG\b\u0017\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0006\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0002\u0010\u0011¨\u0006\u0013"}, d2 = {"Lda2/e;", "", "<init>", "()V", "", "appUuid", "", "Ljava/util/UUID;", "dedicatedGfdiServiceUuids", "", "keepAliveInterval", "bluetoothClassicUuid", "", "shouldAutoOverwriteCustomerGUIDDuringPairing", "(JLjava/util/Set;ILjava/util/UUID;Z)V", "Lma2/l;", "supportedServiceTypes", "(Ljava/util/Set;JLjava/util/Set;ILjava/util/UUID;Z)V", "a", "garmin-fitness-device-interface_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f58888g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Logger f58889h = LoggerFactory.getLogger("GDI#ClientConfiguration");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Set<? extends ma2.l> f58890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f58891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f58892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f58893d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public UUID f58894e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f58895f;

    public e(long j8, Set<UUID> set, int i14, UUID uuid, boolean z14) {
        set.getClass();
        HashSet hashSet = new HashSet();
        this.f58891b = hashSet;
        this.f58893d = 25;
        this.f58895f = true;
        hashSet.addAll(set);
        UUID uuid2 = ma2.h.f117688p;
        uuid2.getClass();
        hashSet.add(uuid2);
        this.f58892c = j8;
        this.f58893d = i14;
        this.f58894e = uuid;
        this.f58895f = z14;
        if (j8 != 0) {
            return;
        }
        f58889h.error("static 'client_uuid' required in client_config.xml");
        vb.h.z("static 'client_uuid' required in client_config.xml");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !e.class.equals(obj.getClass())) {
            return false;
        }
        e eVar = (e) obj;
        return this.f58892c == eVar.f58892c && this.f58893d == eVar.f58893d && s.g(this.f58890a, eVar.f58890a) && s.g(this.f58891b, eVar.f58891b) && s.g(this.f58894e, eVar.f58894e);
    }

    public final int hashCode() {
        return Objects.hash(this.f58890a, this.f58891b, Long.valueOf(this.f58892c), this.f58894e, Integer.valueOf(this.f58893d));
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("clientId: ");
        sb3.append(this.f58892c);
        sb3.append("\n   BTC UUID: ");
        sb3.append(this.f58894e);
        Set<? extends ma2.l> set = this.f58890a;
        set.getClass();
        int i14 = 0;
        Enum[] enumArr = (Enum[]) set.toArray(new Enum[0]);
        if (enumArr != null) {
            sb3.append("\n   serviceTypes: ");
            int length = enumArr.length;
            while (i14 < length) {
                sb3.append(enumArr[i14].name());
                i14++;
                if (i14 != enumArr.length) {
                    sb3.append(",");
                }
            }
            if (enumArr.length == 0) {
                sb3.append("none");
            }
        }
        for (UUID uuid : this.f58891b) {
            sb3.append("\n   Dedicated GFDI UUID: ");
            sb3.append(uuid);
        }
        return sb3.toString();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lda2/e$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "LOGGER", "Lorg/slf4j/Logger;", "garmin-fitness-device-interface_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static e a(e eVar, da2.a aVar) {
            eVar.getClass();
            ma2.l[] lVarArr = aVar.f58875f;
            p005kotlin.jvm.internal.j jVar = null;
            Set<? extends ma2.l> setM0 = lVarArr != null ? u.m0(lVarArr) : null;
            if (setM0 == null) {
                return eVar;
            }
            e eVar2 = new e(jVar);
            eVar2.f58891b.addAll(eVar.f58891b);
            if (setM0.isEmpty()) {
                Set<? extends ma2.l> set = eVar.f58890a;
                if (set != null) {
                    eVar2.f58890a = EnumSet.copyOf((Collection) set);
                }
            } else {
                eVar2.f58890a = setM0;
            }
            eVar2.f58892c = eVar.f58892c;
            eVar2.f58894e = eVar.f58894e;
            eVar2.f58893d = eVar.f58893d;
            return eVar2;
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(long j8, Set<UUID> set) {
        this(j8, set, 0, null, false, 28, null);
        set.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(long j8, Set<UUID> set, int i14) {
        this(j8, set, i14, null, false, 24, null);
        set.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(long j8, Set<UUID> set, int i14, UUID uuid) {
        this(j8, set, i14, uuid, false, 16, null);
        set.getClass();
    }

    public /* synthetic */ e(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    public e(long j8, Set set, int i14, UUID uuid, boolean z14, int i15, p005kotlin.jvm.internal.j jVar) {
        this(j8, (i15 & 2) != 0 ? l0.f134950a : set, (i15 & 4) != 0 ? 25 : i14, (i15 & 8) != 0 ? null : uuid, (i15 & 16) != 0 ? true : z14);
    }

    private e() {
        this.f58891b = new HashSet();
        this.f58893d = 25;
        this.f58895f = true;
    }

    public e(long j8) {
        this(j8, null, 0, null, false, 30, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @o13.e
    public e(Set<? extends ma2.l> set, long j8, Set<UUID> set2, int i14, UUID uuid, boolean z14) {
        this(j8, set2, i14, uuid, z14);
        set.getClass();
        set2.getClass();
        this.f58890a = set;
    }
}
