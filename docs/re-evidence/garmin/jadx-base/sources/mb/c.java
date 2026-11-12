package mb;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteArrayOutputStream f117708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DataOutputStream f117709b;

    public c() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f117708a = byteArrayOutputStream;
        this.f117709b = new DataOutputStream(byteArrayOutputStream);
    }
}
