package pk2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lpk2/y;", "", "", "willRetry", "<init>", "(Ljava/lang/String;IZ)V", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum y {
    SUCCESS(false),
    TREAT_AS_SUCCESS(false),
    NO_RETRY_FAILURE(false),
    FILE_TYPE_BLOCKING_FAILURE(false, 1, null),
    NON_BLOCKING_FAILURE(false, 1, null);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f138508a;

    /* synthetic */ y(boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? true : z14);
    }

    y(boolean z14) {
        this.f138508a = z14;
    }
}
