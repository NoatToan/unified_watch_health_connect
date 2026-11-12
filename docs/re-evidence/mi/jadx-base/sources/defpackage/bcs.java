package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes5.dex */
public final class bcs extends r6s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f4068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f4069b;
    public final NavigableMap c = new TreeMap();

    public bcs(File file, File file2) throws IOException {
        this.f4068a = file;
        this.f4069b = file2;
        List<File> listA = lps.a(file, file2);
        if (listA.isEmpty()) {
            throw new ugs(String.format("Virtualized slice archive empty for %s, %s", file, file2));
        }
        long length = 0;
        for (File file3 : listA) {
            this.c.put(Long.valueOf(length), file3);
            length += file3.length();
        }
    }

    @Override // defpackage.r6s
    public final long a() {
        Map.Entry entryLastEntry = this.c.lastEntry();
        return ((Long) entryLastEntry.getKey()).longValue() + ((File) entryLastEntry.getValue()).length();
    }

    @Override // defpackage.r6s
    public final InputStream b(long j, long j2) throws IOException {
        if (j < 0 || j2 < 0) {
            throw new ugs(String.format("Invalid input parameters %s, %s", Long.valueOf(j), Long.valueOf(j2)));
        }
        long j3 = j + j2;
        if (j3 > a()) {
            throw new ugs(String.format("Trying to access archive out of bounds. Archive ends at: %s. Tried accessing: %s", Long.valueOf(a()), Long.valueOf(j3)));
        }
        Long l = (Long) this.c.floorKey(Long.valueOf(j));
        Long l2 = (Long) this.c.floorKey(Long.valueOf(j3));
        if (l.equals(l2)) {
            return new ybs(d(j, l), j2);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(d(j, l));
        Collection collectionValues = this.c.subMap(l, false, l2, false).values();
        if (!collectionValues.isEmpty()) {
            arrayList.add(new ols(Collections.enumeration(collectionValues)));
        }
        arrayList.add(new ybs(new FileInputStream((File) this.c.get(l2)), j2 - (l2.longValue() - j)));
        return new SequenceInputStream(Collections.enumeration(arrayList));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public final InputStream d(long j, Long l) throws IOException {
        FileInputStream fileInputStream = new FileInputStream((File) this.c.get(l));
        if (fileInputStream.skip(j - l.longValue()) == j - l.longValue()) {
            return fileInputStream;
        }
        throw new ugs(String.format("Virtualized slice archive corrupt, could not skip in file with key %s", l));
    }
}
