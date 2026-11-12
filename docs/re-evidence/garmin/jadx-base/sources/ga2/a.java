package ga2;

import java.util.Set;
import o13.e;
import p005kotlin.Metadata;
import p13.l0;
import rs2.c;
import rs2.v;

/* JADX INFO: loaded from: classes7.dex */
@e
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lga2/a;", "Lbt2/a;", "<init>", "()V", "legacy-device-interface_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class a implements bt2.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f76618b;

    @Override // rs2.h
    public final void close(String str) {
        str.getClass();
    }

    @Override // rs2.h
    public final Set<Integer> getConfiguration() {
        return l0.f134950a;
    }

    @Override // bt2.a
    public final void setSessionKey(byte[] bArr) {
        this.f76618b = bArr;
    }

    @Override // rs2.h
    public final void start(c cVar, v vVar) {
        cVar.getClass();
        vVar.getClass();
    }
}
