package defpackage;

import com.nimbusds.jose.JWEHeader;
import com.nimbusds.jose.util.Base64URL;
import net.jcip.annotations.Immutable;

/* JADX INFO: loaded from: classes6.dex */
@Immutable
public final class eqd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JWEHeader f16959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Base64URL f16960b;
    public final Base64URL c;
    public final Base64URL d;
    public final Base64URL e;

    public eqd(JWEHeader jWEHeader, Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3, Base64URL base64URL4) {
        this.f16959a = jWEHeader;
        this.f16960b = base64URL;
        this.c = base64URL2;
        if (base64URL3 == null) {
            throw new IllegalArgumentException("The cipher text must not be null");
        }
        this.d = base64URL3;
        this.e = base64URL4;
    }

    public Base64URL a() {
        return this.e;
    }

    public Base64URL b() {
        return this.d;
    }

    public Base64URL c() {
        return this.f16960b;
    }

    public JWEHeader d() {
        return this.f16959a;
    }

    public Base64URL e() {
        return this.c;
    }
}
