package gy2;

import java.util.LinkedHashMap;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lgy2/c;", "", "<init>", "()V", "a", "b", "util_sync_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class c implements Comparable<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Long f80290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f80291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f80292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Long f80293d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public h f80294e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public g f80295f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b f80296g;

    static {
        new a(null);
    }

    public final long a() {
        Long l14 = this.f80290a;
        if (l14 != null) {
            return l14.longValue();
        }
        return -1L;
    }

    public final String b() {
        h hVar = this.f80294e;
        if (hVar != null) {
            return hVar.f80333g;
        }
        return null;
    }

    public final long c() {
        Long l14;
        h hVar = this.f80294e;
        if (hVar == null || (l14 = hVar.f80330d) == null) {
            return -1L;
        }
        return l14.longValue();
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0061 A[ADDED_TO_REGION, RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x0062 A[RETURN] */
    @Override // java.lang.Comparable
    public final int compareTo(c cVar) {
        c cVar2 = cVar;
        cVar2.getClass();
        h hVar = this.f80294e;
        h hVar2 = cVar2.f80294e;
        if (hVar == null || hVar.f80342p == null) {
            if (hVar2 != null && hVar2.f80342p != null) {
                return 1;
            }
            Long l14 = this.f80293d;
            l14.getClass();
            long jLongValue = l14.longValue();
            Long l15 = cVar2.f80293d;
            l15.getClass();
            if (jLongValue < l15.longValue()) {
                return -1;
            }
            return 1;
        }
        if (hVar2 == null || hVar2.f80342p == null) {
            return -1;
        }
        if (hVar.a() != hVar2.a()) {
            if (hVar.a() < hVar2.a()) {
                return -1;
            }
            return 1;
        }
        Long l16 = this.f80293d;
        l16.getClass();
        long jLongValue2 = l16.longValue();
        Long l17 = cVar2.f80293d;
        l17.getClass();
        if (jLongValue2 < l17.longValue()) {
            return -1;
        }
        return 1;
    }

    public final long d() {
        Long l14 = this.f80293d;
        if (l14 != null) {
            return l14.longValue();
        }
        return -1L;
    }

    public final String e() {
        h hVar = this.f80294e;
        if (hVar != null) {
            return hVar.f80341o;
        }
        return null;
    }

    public final String f() {
        h hVar = this.f80294e;
        if (hVar != null) {
            return hVar.f80340n;
        }
        return null;
    }

    public final String g() {
        h hVar = this.f80294e;
        String str = hVar != null ? hVar.f80332f : null;
        if (str != null && str.length() != 0) {
            return str;
        }
        h hVar2 = this.f80294e;
        if (hVar2 != null) {
            return hVar2.f80331e;
        }
        return null;
    }

    public final boolean h() {
        String strB = b();
        return !(strB == null || strB.length() == 0);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lgy2/c$b;", "", "", "number", "", "value", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "a", "util_sync_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum b {
        NEW(0, "new"),
        /* JADX INFO: Fake field, exist only in values array */
        DISCARDED(1, "discarded"),
        /* JADX INFO: Fake field, exist only in values array */
        RECEIVED_SYNC(2, "received_sync"),
        /* JADX INFO: Fake field, exist only in values array */
        DISCARDED_SYNC(3, "discarded_sync"),
        /* JADX INFO: Fake field, exist only in values array */
        ERROR_SYNC(4, "error_sync"),
        UNKNOWN_STATUS(5, "unknown_status");


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f80297b = new a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final LinkedHashMap f80298c = new LinkedHashMap();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f80302a;

        static {
            for (b bVar : values()) {
                f80298c.put(bVar.f80302a, bVar);
            }
        }

        b(int i14, String str) {
            this.f80302a = str;
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lgy2/c$b$a;", "", "<init>", "()V", "", "", "Lgy2/c$b;", "lookupByName", "Ljava/util/Map;", "util_sync_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(j jVar) {
                this();
            }

            private a() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006¨\u0006\u0011"}, d2 = {"Lgy2/c$a;", "", "<init>", "()V", "", "APPLICATION_KEY", "Ljava/lang/String;", "DELIVERY_RESTRICTION_TYPE_BLE", "DELIVERY_RESTRICTION_TYPE_BTC", "DEVICE_ID", "DEVICE_NAME", "DEVICE_XML_DATA_TYPE", "FIRMWARE_VERSION", "MESSAGE_ID", "MESSAGE_STATUS", "MESSAGE_TYPE", "META_DATA", "util_sync_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
