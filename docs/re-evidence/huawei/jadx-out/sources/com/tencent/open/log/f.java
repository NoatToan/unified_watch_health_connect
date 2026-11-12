package com.tencent.open.log;

import java.io.IOException;
import java.io.Writer;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes20.dex */
public class f implements Iterable<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ConcurrentLinkedQueue<String> f31082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AtomicInteger f31083b;

    public f() {
        this.f31082a = null;
        this.f31083b = null;
        this.f31082a = new ConcurrentLinkedQueue<>();
        this.f31083b = new AtomicInteger(0);
    }

    public int a(String str) {
        int length = str.length();
        this.f31082a.add(str);
        return this.f31083b.addAndGet(length);
    }

    public void a(Writer writer, char[] cArr) throws IOException {
        if (writer == null || cArr == null || cArr.length == 0) {
            return;
        }
        int length = cArr.length;
        int i = length;
        int i2 = 0;
        for (String str : this) {
            int length2 = str.length();
            int i3 = 0;
            while (length2 > 0) {
                int i4 = i > length2 ? length2 : i;
                int i5 = i3 + i4;
                str.getChars(i3, i5, cArr, i2);
                i -= i4;
                i2 += i4;
                length2 -= i4;
                if (i == 0) {
                    if (writer != null) {
                        try {
                            writer.write(cArr, 0, length);
                        } catch (Exception unused) {
                        }
                    }
                    i = length;
                    i2 = 0;
                }
                i3 = i5;
            }
        }
        if (i2 > 0 && writer != null) {
            try {
                writer.write(cArr, 0, i2);
            } catch (Exception unused2) {
            }
        }
        if (writer != null) {
            try {
                writer.flush();
            } catch (Exception unused3) {
            }
        }
    }

    public int a() {
        return this.f31083b.get();
    }

    public void b() {
        this.f31082a.clear();
        this.f31083b.set(0);
    }

    @Override // java.lang.Iterable
    public Iterator<String> iterator() {
        return this.f31082a.iterator();
    }
}
