package vj2;

import com.garmin.proto.generated.GDIConnectIQHTTPProto;
import com.google.android.exoplayer2.metadata.id3.InternalFrame;
import o13.m;
import o13.t;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lvj2/c;", "", "Lcom/garmin/proto/generated/GDIConnectIQHTTPProto$RawResourceRequest;", "request", "Lzj2/e;", "dataTransfer", "", "deviceId", "<init>", "(Lcom/garmin/proto/generated/GDIConnectIQHTTPProto$RawResourceRequest;Lzj2/e;J)V", "a", "ciq-http-raw-resource-request_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f178485f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GDIConnectIQHTTPProto.RawResourceRequest f178486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zj2.e f178487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f178488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f178489d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f178490e;

    static {
        new a(null);
    }

    public c(GDIConnectIQHTTPProto.RawResourceRequest rawResourceRequest, zj2.e eVar, long j8) {
        rawResourceRequest.getClass();
        eVar.getClass();
        this.f178486a = rawResourceRequest;
        this.f178487b = eVar;
        this.f178488c = org.apache.commons.lang3.e.e(j8, "deviceID ");
        this.f178489d = org.apache.commons.lang3.e.e(System.currentTimeMillis(), InternalFrame.ID);
        this.f178490e = m.b(new vd1.c(9));
    }

    public final b a(GDIConnectIQHTTPProto.RawResourceRequest.MultipartForm multipartForm, byte[] bArr) {
        String name = multipartForm.getName();
        name.getClass();
        b bVar = new b(name, multipartForm.getFilename(), multipartForm.getContentType(), bArr);
        Object value = this.f178490e.getValue();
        value.getClass();
        ((Logger) value).debug("createFilePart: " + this.f178488c + StringUtils.SPACE + bVar);
        return bVar;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0088  */
    /* JADX WARN: Code duplicated, block: B:18:0x0098  */
    /* JADX WARN: Code duplicated, block: B:19:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:21:0x00df A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:28:0x012a  */
    /* JADX WARN: Code duplicated, block: B:29:0x012d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0135  */
    /* JADX WARN: Code duplicated, block: B:35:0x0169  */
    /* JADX WARN: Code duplicated, block: B:38:0x018a  */
    /* JADX WARN: Code duplicated, block: B:39:0x019e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r0v16, types: [byte[], java.io.Serializable, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00e0 -> B:23:0x00e8). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:16:0x0088
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.io.Serializable b(v13.c r22) {
        /*
            Method dump skipped, instruction units count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vj2.c.b(v13.c):java.io.Serializable");
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lvj2/c$a;", "", "<init>", "()V", "", "LINE_FEED", "Ljava/lang/String;", "TWO_HYPHENS", "ciq-http-raw-resource-request_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
