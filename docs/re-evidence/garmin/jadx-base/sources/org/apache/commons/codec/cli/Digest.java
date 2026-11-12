package org.apache.commons.codec.cli;

import am.j;
import i3.e5;
import java.io.File;
import java.io.PrintStream;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;
import org.apache.commons.codec.binary.Hex;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import org.apache.commons.codec.language.bm.Rule;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Marker;
import tn.k;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class Digest {
    private final String algorithm;
    private final String[] args;
    private final String[] inputs;

    private Digest(String[] strArr) {
        Objects.requireNonNull(strArr);
        int length = strArr.length;
        if (length == 0) {
            h.s(j.m("Usage: java ", Digest.class.getName(), " [algorithm] [FILE|DIRECTORY|string] ..."));
            throw null;
        }
        this.args = strArr;
        this.algorithm = strArr[0];
        if (length <= 1) {
            this.inputs = null;
        } else {
            this.inputs = (String[]) Arrays.copyOfRange(strArr, 1, length);
        }
    }

    public static void main(String[] strArr) {
        new Digest(strArr).run();
    }

    private void println(String str, byte[] bArr, String str2) {
        PrintStream printStream = System.out;
        StringBuilder sbK = e5.k(str);
        sbK.append(Hex.encodeHexString(bArr));
        sbK.append(str2 != null ? "  ".concat(str2) : "");
        printStream.println(sbK.toString());
    }

    private void run(String str, MessageDigest messageDigest) {
        String[] strArr = this.inputs;
        if (strArr == null) {
            println(str, DigestUtils.digest(messageDigest, System.in));
            return;
        }
        for (String str2 : strArr) {
            File file = new File(str2);
            if (file.isFile()) {
                println(str, DigestUtils.digest(messageDigest, file), str2);
            } else if (file.isDirectory()) {
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles != null) {
                    run(str, messageDigest, fileArrListFiles);
                }
            } else {
                println(str, DigestUtils.digest(messageDigest, str2.getBytes(Charset.defaultCharset())));
            }
        }
    }

    public String toString() {
        return e5.g(super.toString(), StringUtils.SPACE, Arrays.toString(this.args));
    }

    private void println(String str, byte[] bArr) {
        println(str, bArr, null);
    }

    private void run() {
        if (!this.algorithm.equalsIgnoreCase(Rule.ALL) && !this.algorithm.equals(Marker.ANY_MARKER)) {
            MessageDigest digest = DigestUtils.getDigest(this.algorithm, null);
            if (digest == null) {
                run("", DigestUtils.getDigest(this.algorithm.toUpperCase(Locale.ROOT)));
                return;
            } else {
                run("", digest);
                return;
            }
        }
        run(MessageDigestAlgorithms.values());
    }

    private void run(String str, MessageDigest messageDigest, File[] fileArr) {
        for (File file : fileArr) {
            if (file.isFile()) {
                println(str, DigestUtils.digest(messageDigest, file), file.getName());
            }
        }
    }

    private void run(String str, String str2) {
        run(str, DigestUtils.getDigest(str2));
    }

    private void run(String[] strArr) {
        for (String str : strArr) {
            if (DigestUtils.isAvailable(str)) {
                run(k.g(str, StringUtils.SPACE), str);
            }
        }
    }
}
