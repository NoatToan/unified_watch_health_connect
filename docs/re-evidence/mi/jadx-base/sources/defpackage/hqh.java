package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.bouncycastle.util.io.pem.PemGenerationException;

/* JADX INFO: loaded from: classes3.dex */
public class hqh implements jqh {
    public static final List d = Collections.unmodifiableList(new ArrayList());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f20340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f20341b;
    public byte[] c;

    public hqh(String str, List list, byte[] bArr) {
        this.f20340a = str;
        this.f20341b = Collections.unmodifiableList(list);
        this.c = bArr;
    }

    @Override // defpackage.jqh
    public hqh a() throws PemGenerationException {
        return this;
    }

    public byte[] b() {
        return this.c;
    }

    public List c() {
        return this.f20341b;
    }

    public String d() {
        return this.f20340a;
    }

    public hqh(String str, byte[] bArr) {
        this(str, d, bArr);
    }
}
