package ws2;

import com.google.common.primitives.UnsignedBytes;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Set;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lws2/c;", "", "", FirebaseAnalytics.Param.INDEX, "dataType", "", "identifier", "", "Lcom/garmin/gfdi/file/e;", "flags", "size", "", "timestamp", "", "xmlDataType", "<init>", "(II[BLjava/util/Set;IJLjava/lang/String;)V", "gfdi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f186963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f186964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f186965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set<com.garmin.gfdi.file.e> f186966d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f186967e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f186968f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f186969g;

    /* JADX WARN: Multi-variable type inference failed */
    public c(int i14, int i15, byte[] bArr, Set<? extends com.garmin.gfdi.file.e> set, int i16, long j8, String str) {
        bArr.getClass();
        set.getClass();
        this.f186963a = i14;
        this.f186964b = i15;
        this.f186965c = bArr;
        this.f186966d = set;
        this.f186967e = i16;
        this.f186968f = str;
        this.f186969g = bArr[0] & UnsignedBytes.MAX_VALUE;
        jg.b.K(1, bArr);
    }
}
