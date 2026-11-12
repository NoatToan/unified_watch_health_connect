package defpackage;

import java.nio.charset.Charset;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes4.dex */
public interface pzd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f30934a = Charset.forName("UTF-8");

    void a(MessageDigest messageDigest);

    boolean equals(Object obj);

    int hashCode();
}
