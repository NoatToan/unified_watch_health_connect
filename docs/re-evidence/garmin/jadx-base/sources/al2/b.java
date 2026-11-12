package al2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lal2/b;", "", "", "isComplete", "<init>", "(Ljava/lang/String;IZ)V", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum b {
    STARTED(false),
    REJECTED(false),
    NO_ITEMS(true),
    FAILURE(true),
    INTERRUPTED(true),
    SUCCESS(true);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f3774a;

    b(boolean z14) {
        this.f3774a = z14;
    }
}
