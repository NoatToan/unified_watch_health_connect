package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.spongycastle.util.io.pem.PemGenerationException;

/* JADX INFO: loaded from: classes3.dex */
public class gqh implements iqh {
    public static final List d = Collections.unmodifiableList(new ArrayList());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f19237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f19238b;
    public byte[] c;

    public gqh(String str, byte[] bArr) {
        this(str, d, bArr);
    }

    @Override // defpackage.iqh
    public gqh a() throws PemGenerationException {
        return this;
    }

    public byte[] b() {
        return this.c;
    }

    public List c() {
        return this.f19238b;
    }

    public String d() {
        return this.f19237a;
    }

    public gqh(String str, List list, byte[] bArr) {
        this.f19237a = str;
        this.f19238b = Collections.unmodifiableList(list);
        this.c = bArr;
    }
}
