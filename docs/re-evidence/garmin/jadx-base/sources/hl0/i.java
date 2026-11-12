package hl0;

import android.text.TextUtils;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lhl0/i;", "", "", "partNumber", "", "globalID", "", "deviceID", "<init>", "(Ljava/lang/String;IJ)V", "a", "gcm-golf_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f84291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f84292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f84293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f84294d;

    static {
        new a(null);
    }

    public i(String str, int i14, long j8) {
        str.getClass();
        this.f84291a = str;
        this.f84292b = i14;
        this.f84293c = j8;
    }

    public static final boolean a(i iVar, sd2.g gVar) {
        iVar.getClass();
        if (gVar.f158650a < 1) {
            iVar.f84294d = "'UnitId' is missing";
            return false;
        }
        if (gVar.f158651b < 1) {
            iVar.f84294d = "'GlobalLayoutId' is missing from the DTO";
            return false;
        }
        if (TextUtils.isEmpty(gVar.f158654e)) {
            iVar.f84294d = "'PartNumber' is missing from the DTO";
            return false;
        }
        byte[] bArr = gVar.f158655f;
        if (bArr == null || bArr.length <= 0) {
            iVar.f84294d = "'Image' is missing from the DTO";
            return false;
        }
        byte[] bArr2 = gVar.f158656g;
        if (bArr2 == null || bArr2.length <= 0) {
            iVar.f84294d = "'Gma' is missing from the DTO";
            return false;
        }
        byte[] bArr3 = gVar.f158657h;
        if (bArr3 != null && bArr3.length > 0) {
            return true;
        }
        iVar.f84294d = "'Unlock' is missing from the DTO";
        return false;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lhl0/i$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-golf_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
