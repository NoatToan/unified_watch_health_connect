package vc2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lvc2/d;", "", "", "priority", "<init>", "(Ljava/lang/String;ID)V", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum d {
    UNKNOWN(0.0d),
    METERED(1.0d),
    TEMPORARILY_NOT_METERED(2.0d),
    NOT_METERED(3.0d);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f177102a;

    d(double d14) {
        this.f177102a = d14;
    }
}
