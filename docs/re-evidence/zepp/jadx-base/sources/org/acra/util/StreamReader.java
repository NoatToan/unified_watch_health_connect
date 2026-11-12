package org.acra.util;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import org.acra.collections.BoundedLinkedList;

/* JADX INFO: loaded from: classes23.dex */
public class StreamReader {
    private static final int e = -1;
    private static final int f = -1;
    private final InputStream a;
    private int b;
    private int c;
    private Predicate<String> d;

    public StreamReader(@NonNull String str) throws FileNotFoundException {
        this(new File(str));
    }

    private int a(@NonNull byte[] bArr, long j) throws IOException {
        int i = 0;
        while (System.currentTimeMillis() < j && i < bArr.length) {
            InputStream inputStream = this.a;
            int i2 = inputStream.read(bArr, i, Math.min(inputStream.available(), bArr.length - i));
            if (i2 == -1) {
                break;
            }
            i += i2;
        }
        return i;
    }

    @NonNull
    private String b() throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(this.a);
        try {
            StringWriter stringWriter = new StringWriter();
            char[] cArr = new char[8192];
            while (true) {
                int i = inputStreamReader.read(cArr);
                if (i == -1) {
                    return stringWriter.toString();
                }
                stringWriter.write(cArr, 0, i);
            }
        } finally {
            IOUtils.safeClose(inputStreamReader);
        }
    }

    @NonNull
    private String c() throws IOException {
        long jCurrentTimeMillis = System.currentTimeMillis() + ((long) this.c);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[8192];
            while (true) {
                int iA = a(bArr, jCurrentTimeMillis);
                if (iA == -1) {
                    return byteArrayOutputStream.toString();
                }
                byteArrayOutputStream.write(bArr, 0, iA);
            }
        } finally {
            IOUtils.safeClose(this.a);
        }
    }

    @NonNull
    public String read() throws IOException {
        String strB = this.c == -1 ? b() : c();
        if (this.d == null) {
            if (this.b == -1) {
                return strB;
            }
            String[] strArrSplit = strB.split("\\r?\\n");
            int length = strArrSplit.length;
            int i = this.b;
            return length <= i ? strB : TextUtils.join("\n", Arrays.copyOfRange(strArrSplit, strArrSplit.length - i, strArrSplit.length));
        }
        String[] strArrSplit2 = strB.split("\\r?\\n");
        List linkedList = this.b == -1 ? new LinkedList() : new BoundedLinkedList(this.b);
        for (String str : strArrSplit2) {
            if (this.d.apply(str)) {
                linkedList.add(str);
            }
        }
        return TextUtils.join("\n", linkedList);
    }

    @NonNull
    public StreamReader setFilter(Predicate<String> predicate) {
        this.d = predicate;
        return this;
    }

    @NonNull
    public StreamReader setLimit(int i) {
        this.b = i;
        return this;
    }

    @NonNull
    public StreamReader setTimeout(int i) {
        this.c = i;
        return this;
    }

    public StreamReader(@NonNull File file) throws FileNotFoundException {
        this(new FileInputStream(file));
    }

    public StreamReader(@NonNull InputStream inputStream) {
        this.b = -1;
        this.c = -1;
        this.d = null;
        this.a = inputStream;
    }
}
