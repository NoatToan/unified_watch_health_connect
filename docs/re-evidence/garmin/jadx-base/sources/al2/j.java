package al2;

import com.garmin.device.filetransfer.core.util.CoreTransferException;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import pk2.x;
import pk2.y;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\rB!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB#\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\f¨\u0006\u000e"}, d2 = {"Lal2/j;", "", "Lwk2/f;", TtmlNode.TAG_METADATA, "", "willRetry", "Lcom/garmin/device/filetransfer/core/util/CoreTransferException;", "result", "<init>", "(Lwk2/f;ZLcom/garmin/device/filetransfer/core/util/CoreTransferException;)V", "Lpk2/y;", "status", "(Lwk2/f;Lpk2/y;Lcom/garmin/device/filetransfer/core/util/CoreTransferException;)V", "a", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f3803d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wk2.f f3804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f3805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CoreTransferException f3806c;

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3807a;

        static {
            int[] iArr = new int[ok2.e.values().length];
            try {
                iArr[ok2.e.f132641i.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ok2.e.f132648p.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ok2.e.F.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ok2.e.E.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f3807a = iArr;
        }
    }

    public j(wk2.f fVar, boolean z14, CoreTransferException coreTransferException) {
        coreTransferException.getClass();
        this.f3804a = fVar;
        this.f3805b = z14;
        this.f3806c = coreTransferException;
    }

    public final boolean a() {
        if (!this.f3805b) {
            return false;
        }
        int i14 = b.f3807a[this.f3806c.getFailure().ordinal()];
        return (i14 == 1 || i14 == 2 || i14 == 3 || i14 == 4) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return s.g(this.f3804a, jVar.f3804a) && this.f3805b == jVar.f3805b && s.g(this.f3806c, jVar.f3806c);
    }

    public final int hashCode() {
        wk2.f fVar = this.f3804a;
        return this.f3806c.hashCode() + q6.f.g((fVar == null ? 0 : fVar.hashCode()) * 31, 31, this.f3805b);
    }

    public final String toString() {
        return "FailedFile(metadata=" + this.f3804a + ", willRetry=" + this.f3805b + ", result=" + this.f3806c + ")";
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lal2/j$a;", "", "<init>", "()V", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static j a(wk2.f fVar, x xVar) {
            fVar.getClass();
            xVar.getClass();
            CoreTransferException coreTransferException = xVar.f138497b;
            if (coreTransferException == null) {
                ok2.e eVar = xVar.f138498c;
                if (eVar == null) {
                    eVar = ok2.e.f132644l;
                }
                coreTransferException = new CoreTransferException(eVar, xVar.f138499d, null, 4, null);
            }
            return new j(fVar, xVar.f138496a, coreTransferException);
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(wk2.f fVar, y yVar, CoreTransferException coreTransferException) {
        this(fVar, yVar.f138508a, coreTransferException);
        yVar.getClass();
        coreTransferException.getClass();
    }
}
