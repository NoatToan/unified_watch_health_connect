package ui;

import java.nio.charset.Charset;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes7.dex */
public interface e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f171166a = Charset.forName("UTF-8");

    void b(MessageDigest messageDigest);

    boolean equals(Object obj);

    int hashCode();
}
