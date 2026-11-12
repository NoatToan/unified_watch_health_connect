package defpackage;

import com.google.android.exoplayer2.metadata.emsg.EventMessage;

/* JADX INFO: loaded from: classes4.dex */
public final class ze8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EventMessage[] f41187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f41188b;
    public final String c;
    public final String d;
    public final long e;

    public ze8(String str, String str2, long j, long[] jArr, EventMessage[] eventMessageArr) {
        this.c = str;
        this.d = str2;
        this.e = j;
        this.f41188b = jArr;
        this.f41187a = eventMessageArr;
    }

    public String a() {
        String str = this.c;
        String str2 = this.d;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("/");
        sb.append(str2);
        return sb.toString();
    }
}
