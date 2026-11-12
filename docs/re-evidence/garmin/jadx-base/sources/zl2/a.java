package zl2;

import i3.e5;
import kg.f;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import wr.g;
import yl2.e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\tB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lzl2/a;", "Liu2/a;", "", "errorGroupName", "errorType", "errorMessage", "errorStackTrace", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "device-pairing_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class a extends iu2.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C3835a f205191e = new C3835a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f205192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f205193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f205194c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f205195d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, String str2, String str3, String str4) {
        super(str, str2, str3, str4);
        f.p(str, str2, str3, str4);
        this.f205192a = str;
        this.f205193b = str2;
        this.f205194c = str3;
        this.f205195d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f205192a, aVar.f205192a) && s.g(this.f205193b, aVar.f205193b) && s.g(this.f205194c, aVar.f205194c) && s.g(this.f205195d, aVar.f205195d);
    }

    public final int hashCode() {
        return this.f205195d.hashCode() + g.j(g.j(this.f205192a.hashCode() * 31, 31, this.f205193b), 31, this.f205194c);
    }

    public final String toString() {
        return e5.h(p6.b.i("PairingAnalyticError(errorGroupName=", this.f205192a, ", errorType=", this.f205193b, ", errorMessage="), this.f205194c, ", errorStackTrace=", this.f205195d, ")");
    }

    /* JADX INFO: renamed from: zl2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006¨\u0006\u000e"}, d2 = {"Lzl2/a$a;", "", "<init>", "()V", "", "PAIRING_ERROR_TYPE_RESET", "Ljava/lang/String;", "PAIRING_ERROR_TAG_BAD_BLUETOOTH", "PAIRING_ERROR_TAG_CONNECTING_TIMEOUT", "PAIRING_ERROR_TAG_PASSKEY_TIMEOUT", "PAIRING_ERROR_TAG_RESET_FAILURE", "PAIRING_ERROR_TAG_JSON_PARSING_EXCEPTION", "PAIRING_ERROR_TAG_DEVICE_INFO_OBJ_NULL", "PAIRING_ERROR_TAG_DISCOVERY_FAILURE", "device-pairing_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C3835a {

        /* JADX INFO: renamed from: zl2.a$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C3836a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f205196a;

            static {
                int[] iArr = new int[e.values().length];
                try {
                    iArr[e.BAD_BLUETOOTH.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[e.PASSKEY_TIMEOUT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[e.CONNECTION_TIMED_OUT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[e.CONNECTION_FAILURE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[e.DISCONNECTION.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[e.RESET_FAILURE.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[e.DEVICE_INFO_OBJ_NULL.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[e.INVALID_UNIT_ID.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[e.HTTP_CONFLICT_409.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[e.HTTP_INTERNAL_ERROR_500.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[e.NULL_OR_EMPTY_DEVICE_XML_BYTES.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[e.XML_DOWNLOAD_FAILURE.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[e.JSON_PARSING_EXCEPTION.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[e.NO_INTERNET_CONNECTION.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[e.NETWORK.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[e.SYNC_FAILURE.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[e.ABORTED.ordinal()] = 17;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr[e.OTHER_FATAL.ordinal()] = 18;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr[e.DISCOVERY_FAILURE.ordinal()] = 19;
                } catch (NoSuchFieldError unused19) {
                }
                f205196a = iArr;
            }
        }

        public /* synthetic */ C3835a(j jVar) {
            this();
        }

        private C3835a() {
        }
    }
}
