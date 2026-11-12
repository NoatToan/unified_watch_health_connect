package defpackage;

import com.miui.tsmclient.util.Constants;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: da, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u000b\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0019BE\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0017\u0010\bR\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0019\u0010\b¨\u0006\u001c"}, d2 = {"Lda;", "", "", "toString", "", Constants.EXTRA_SESSION_ID, "I", PluginDeviceInfo.FBLUETOOTHPAIR, "()I", "url", "Ljava/lang/String;", PluginDeviceInfo.FLOCALIZATIONS, "()Ljava/lang/String;", "fileName", PluginDeviceInfo.FICONOFF, "fileSize", PluginDeviceInfo.FICONOFFLINE, "", "fileCRC32", "J", PluginDeviceInfo.FICONON, "()J", "compressType", PluginDeviceInfo.FDESC, "compressBufSize", PluginDeviceInfo.FMODEL, "<init>", "(ILjava/lang/String;Ljava/lang/String;IJII)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public class FileRequestInfo {

    @NotNull
    public static final a h = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    public final int sessionID;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    @NotNull
    public final String url;

    /* JADX INFO: renamed from: c, reason: from toString */
    @NotNull
    public final String fileName;

    /* JADX INFO: renamed from: d, reason: from toString */
    public final int fileSize;

    /* JADX INFO: renamed from: e, reason: from toString */
    public final long fileCRC32;
    public final int f;
    public final int g;

    /* JADX INFO: renamed from: da$a */
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lda$a;", "", "", "data", "Lda;", PluginDeviceInfo.FMODEL, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final FileRequestInfo a(@NotNull byte[] data) {
            Object objM886constructorimpl;
            Object objM886constructorimpl2;
            Intrinsics.checkNotNullParameter(data, "data");
            Object obj = 0;
            w2 w2Var = new w2(null, 0, 3, null == true ? 1 : 0);
            w2Var.a(data);
            int iC = w2Var.c();
            String strF = w2Var.f();
            String strF2 = w2Var.f();
            int iB = w2.b(w2Var, 0, 1, null);
            long jD = w2Var.d(4);
            try {
                Result.Companion companion = Result.Companion;
                objM886constructorimpl = Result.m886constructorimpl(Integer.valueOf(w2Var.c()));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM886constructorimpl = Result.m886constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m889exceptionOrNullimpl(objM886constructorimpl) != null) {
                objM886constructorimpl = obj;
            }
            int iIntValue = ((Number) objM886constructorimpl).intValue();
            try {
                objM886constructorimpl2 = Result.m886constructorimpl(Integer.valueOf(w2.b(w2Var, 0, 1, null)));
            } catch (Throwable th2) {
                Result.Companion companion3 = Result.Companion;
                objM886constructorimpl2 = Result.m886constructorimpl(ResultKt.createFailure(th2));
            }
            return new FileRequestInfo(iC, strF, strF2, iB, jD, iIntValue, ((Number) (Result.m889exceptionOrNullimpl(objM886constructorimpl2) == null ? objM886constructorimpl2 : 0)).intValue());
        }
    }

    public FileRequestInfo(int i, @NotNull String url, @NotNull String fileName, int i2, long j, int i3, int i4) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        this.sessionID = i;
        this.url = url;
        this.fileName = fileName;
        this.fileSize = i2;
        this.fileCRC32 = j;
        this.f = i3;
        this.g = i4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getG() {
        return this.g;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getF() {
        return this.f;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getFileCRC32() {
        return this.fileCRC32;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getFileSize() {
        return this.fileSize;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getSessionID() {
        return this.sessionID;
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    public String toString() {
        return "FileRequestInfo(sessionID=" + this.sessionID + ", url='" + this.url + "', fileName='" + this.fileName + "', fileSize=" + this.fileSize + ", fileCRC32=" + this.fileCRC32 + ')';
    }
}
