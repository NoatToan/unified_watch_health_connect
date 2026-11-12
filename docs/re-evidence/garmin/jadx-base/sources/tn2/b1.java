package tn2;

import com.garmin.feature.garminpay.providers.felica.exception.server.FNValidateException;
import p005kotlin.Metadata;
import pn2.d;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001\u0007B\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Ltn2/b1;", "Lpn2/d;", "T", "", "payload", "<init>", "(Lpn2/d;)V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b1<T extends pn2.d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f165529a;

    static {
        new a(null);
    }

    public b1(T t7) {
        t7.getClass();
        this.f165529a = t7;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void a(String str, String str2) throws FNValidateException {
        switch (str.hashCode()) {
            case 1477632:
                if (str.equals("0000")) {
                    return;
                }
                break;
            case 1596796:
                if (str.equals("4000")) {
                    throw new FNValidateException("Failed. The API execution is failure. The use case is failure.", str, str2);
                }
                break;
            case 1596797:
                if (str.equals("4001")) {
                    throw new FNValidateException("Processing result is unknown. MFI server can’t judge the command execution result.", str, str2);
                }
                break;
            case 1656378:
                if (str.equals("6000")) {
                    throw new FNValidateException("SP’s Business Reason Error. (Other error)", str, str2);
                }
                break;
        }
        throw new FNValidateException("Other error in payload", str, str2);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Ltn2/b1$a;", "", "<init>", "()V", "", "SUCCESS", "Ljava/lang/String;", "EXECUTION_ERROR", "CANNOT_JUDGE", "SP_ERROR", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
