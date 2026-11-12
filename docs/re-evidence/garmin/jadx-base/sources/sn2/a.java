package sn2;

import com.garmin.feature.garminpay.providers.gpay.NewFitPayException;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import zn2.z;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\n\u000b\f\rB)\b\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t\u0082\u0001\u0004\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lsn2/a;", "", "Lsn2/b;", "dto", "", "termsAndConditionsAccepted", "Lcom/garmin/feature/garminpay/providers/gpay/NewFitPayException;", "exception", "<init>", "(Lsn2/b;Ljava/lang/Boolean;Lcom/garmin/feature/garminpay/providers/gpay/NewFitPayException;)V", "a", "c", "b", "d", "Lsn2/a$a;", "Lsn2/a$b;", "Lsn2/a$c;", "Lsn2/a$d;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sn2.b f160417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f160418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NewFitPayException f160419c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsn2/a$b;", "Lsn2/a;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends a {
        /* JADX WARN: Illegal instructions before constructor call */
        public b() {
            sn2.b bVar = null;
            Boolean bool = null;
            super(bVar, bool, new NewFitPayException("Multiple FP users detected", z.UNABLE_TO_LOAD_FITPAY_ACCOUNT, null, 4, null), 2, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsn2/a$c;", "Lsn2/a;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends a {
        /* JADX WARN: Illegal instructions before constructor call */
        public c() {
            sn2.b bVar = null;
            Boolean bool = null;
            super(bVar, bool, new NewFitPayException("No device with FP user", z.UNABLE_TO_LOAD_FITPAY_ACCOUNT, null, 4, null), 2, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lsn2/a$d;", "Lsn2/a;", "", "message", "<init>", "(Ljava/lang/String;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d extends a {
        /* JADX WARN: Illegal instructions before constructor call */
        public d(String str) {
            str.getClass();
            sn2.b bVar = null;
            Boolean bool = null;
            super(bVar, bool, new NewFitPayException(str, z.UNABLE_TO_LOAD_FITPAY_ACCOUNT, null, 4, null), 2, null);
        }
    }

    private a(sn2.b bVar, Boolean bool, NewFitPayException newFitPayException) {
        this.f160417a = bVar;
        this.f160418b = bool;
        this.f160419c = newFitPayException;
    }

    /* JADX INFO: renamed from: sn2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lsn2/a$a;", "Lsn2/a;", "Lsn2/b;", "fitPayAccountDto", "", "termsAndConditionsAccepted", "<init>", "(Lsn2/b;Ljava/lang/Boolean;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3030a extends a {
        public /* synthetic */ C3030a(sn2.b bVar, Boolean bool, int i14, j jVar) {
            this(bVar, (i14 & 2) != 0 ? null : bool);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C3030a(sn2.b bVar, Boolean bool) {
            super(bVar, bool, null, 0 == true ? 1 : 0);
            bVar.getClass();
        }
    }

    public /* synthetic */ a(sn2.b bVar, Boolean bool, NewFitPayException newFitPayException, j jVar) {
        this(bVar, bool, newFitPayException);
    }

    public /* synthetic */ a(sn2.b bVar, Boolean bool, NewFitPayException newFitPayException, int i14, j jVar) {
        this(bVar, (i14 & 2) != 0 ? null : bool, newFitPayException, null);
    }
}
