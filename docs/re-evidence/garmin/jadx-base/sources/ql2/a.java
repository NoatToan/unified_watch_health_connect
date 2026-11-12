package ql2;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import pi2.f;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0006\u0007\b\tB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0004\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lql2/a;", "Lpi2/f;", "", "eventName", "<init>", "(Ljava/lang/String;)V", "d", "c", "a", "b", "Lql2/a$a;", "Lql2/a$b;", "Lql2/a$c;", "Lql2/a$d;", "nfc_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a extends f {

    /* JADX INFO: renamed from: ql2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lql2/a$a;", "Lql2/a;", "", "deviceUnitId", "", "macAddress", "<init>", "(JLjava/lang/String;)V", "nfc_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2739a extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f145237a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2739a(long j8, String str) {
            super("DeviceDisconnectedNfcEvent", null);
            str.getClass();
            this.f145237a = j8;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lql2/a$b;", "Lql2/a;", "", "deviceUnitId", "", "deviceAdded", "<init>", "(JZ)V", "nfc_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f145238a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f145239b;

        public b(long j8, boolean z14) {
            super("NfcDeviceAddedOrRemovedEvent", null);
            this.f145238a = j8;
            this.f145239b = z14;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lql2/a$d;", "Lql2/a;", "", "macAddress", "", "deviceUnitId", "", "deviceAdded", "Lpl2/f;", "deviceCapabilitiesResponse", "<init>", "(Ljava/lang/String;JZLpl2/f;)V", "nfc_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f145242a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f145243b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f145244c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final pl2.f f145245d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, long j8, boolean z14, pl2.f fVar) {
            super("NfcStartedEvent", null);
            str.getClass();
            this.f145242a = str;
            this.f145243b = j8;
            this.f145244c = z14;
            this.f145245d = fVar;
        }
    }

    private a(String str) {
        super(str, null, 0, 0L, 14, null);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lql2/a$c;", "Lql2/a;", "", "deviceUnitId", "Lrl2/a;", "failureReason", "<init>", "(JLrl2/a;)V", "nfc_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f145240a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final rl2.a f145241b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j8, rl2.a aVar) {
            super("NfcFailedEvent", null);
            aVar.getClass();
            this.f145240a = j8;
            this.f145241b = aVar;
        }

        public /* synthetic */ c(long j8, rl2.a aVar, int i14, j jVar) {
            this(j8, (i14 & 2) != 0 ? rl2.a.UNKNOWN : aVar);
        }
    }

    public /* synthetic */ a(String str, j jVar) {
        this(str);
    }
}
