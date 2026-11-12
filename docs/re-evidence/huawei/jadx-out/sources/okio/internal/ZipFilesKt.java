package okio.internal;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import defpackage.yyz;
import defpackage.yzc;
import defpackage.yzp;
import defpackage.zae;
import defpackage.zay;
import defpackage.zby;
import defpackage.zcp;
import defpackage.zcw;
import defpackage.zek;
import defpackage.zes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okio.BufferedSource;
import okio.FileHandle;
import okio.FileMetadata;
import okio.FileSystem;
import okio.Okio;
import okio.Path;
import okio.ZipFileSystem;

/* JADX INFO: loaded from: classes46.dex */
@Metadata(d1 = {"\u0000j\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\"\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0017H\u0002\u001a\u001f\u0010\u0018\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u0001H\u0002¢\u0006\u0002\u0010\u001b\u001a.\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020 2\u0014\b\u0002\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020#0\"H\u0000\u001a\f\u0010$\u001a\u00020\u0015*\u00020%H\u0000\u001a\f\u0010&\u001a\u00020'*\u00020%H\u0002\u001a.\u0010(\u001a\u00020)*\u00020%2\u0006\u0010*\u001a\u00020\u00012\u0018\u0010+\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020)0,H\u0002\u001a\u0014\u0010-\u001a\u00020.*\u00020%2\u0006\u0010/\u001a\u00020.H\u0000\u001a\u0018\u00100\u001a\u0004\u0018\u00010.*\u00020%2\b\u0010/\u001a\u0004\u0018\u00010.H\u0002\u001a\u0014\u00101\u001a\u00020'*\u00020%2\u0006\u00102\u001a\u00020'H\u0002\u001a\f\u00103\u001a\u00020)*\u00020%H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0018\u0010\u000e\u001a\u00020\u000f*\u00020\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u00064"}, d2 = {"BIT_FLAG_ENCRYPTED", "", "BIT_FLAG_UNSUPPORTED_MASK", "CENTRAL_FILE_HEADER_SIGNATURE", "COMPRESSION_METHOD_DEFLATED", "COMPRESSION_METHOD_STORED", "END_OF_CENTRAL_DIRECTORY_SIGNATURE", "HEADER_ID_EXTENDED_TIMESTAMP", "HEADER_ID_ZIP64_EXTENDED_INFO", "LOCAL_FILE_HEADER_SIGNATURE", "MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE", "", "ZIP64_EOCD_RECORD_SIGNATURE", "ZIP64_LOCATOR_SIGNATURE", "hex", "", "getHex", "(I)Ljava/lang/String;", "buildIndex", "", "Lokio/Path;", "Lokio/internal/ZipEntry;", "entries", "", "dosDateTimeToEpochMillis", "date", "time", "(II)Ljava/lang/Long;", "openZip", "Lokio/ZipFileSystem;", "zipPath", "fileSystem", "Lokio/FileSystem;", "predicate", "Lkotlin/Function1;", "", "readEntry", "Lokio/BufferedSource;", "readEocdRecord", "Lokio/internal/EocdRecord;", "readExtra", "", "extraSize", "block", "Lkotlin/Function2;", "readLocalHeader", "Lokio/FileMetadata;", "basicMetadata", "readOrSkipLocalHeader", "readZip64EocdRecord", "regularRecord", "skipLocalHeader", "okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ZipFilesKt {
    private static final int BIT_FLAG_ENCRYPTED = 1;
    private static final int BIT_FLAG_UNSUPPORTED_MASK = 1;
    private static final int CENTRAL_FILE_HEADER_SIGNATURE = 33639248;
    public static final int COMPRESSION_METHOD_DEFLATED = 8;
    public static final int COMPRESSION_METHOD_STORED = 0;
    private static final int END_OF_CENTRAL_DIRECTORY_SIGNATURE = 101010256;
    private static final int HEADER_ID_EXTENDED_TIMESTAMP = 21589;
    private static final int HEADER_ID_ZIP64_EXTENDED_INFO = 1;
    private static final int LOCAL_FILE_HEADER_SIGNATURE = 67324752;
    private static final long MAX_ZIP_ENTRY_AND_ARCHIVE_SIZE = 4294967295L;
    private static final int ZIP64_EOCD_RECORD_SIGNATURE = 101075792;
    private static final int ZIP64_LOCATOR_SIGNATURE = 117853008;

    public static /* synthetic */ ZipFileSystem openZip$default(Path path, FileSystem fileSystem, Function1 function1, int i, Object obj) throws IOException {
        if ((i & 4) != 0) {
            function1 = new Function1<ZipEntry, Boolean>() { // from class: okio.internal.ZipFilesKt.openZip.1
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(ZipEntry zipEntry) {
                    zcp.c(zipEntry, "");
                    return true;
                }
            };
        }
        return openZip(path, fileSystem, function1);
    }

    public static final ZipFileSystem openZip(Path path, FileSystem fileSystem, Function1<? super ZipEntry, Boolean> function1) throws IOException {
        zcp.c(path, "");
        zcp.c(fileSystem, "");
        zcp.c(function1, "");
        FileHandle fileHandleOpenReadOnly = fileSystem.openReadOnly(path);
        try {
            FileHandle fileHandle = fileHandleOpenReadOnly;
            long size = fileHandle.size() - ((long) 22);
            long j = 0;
            if (size < 0) {
                throw new IOException("not a zip: size=" + fileHandle.size());
            }
            long jMax = Math.max(size - 65536, 0L);
            while (true) {
                BufferedSource bufferedSourceBuffer = Okio.buffer(fileHandle.source(size));
                try {
                    if (bufferedSourceBuffer.readIntLe() == END_OF_CENTRAL_DIRECTORY_SIGNATURE) {
                        EocdRecord eocdRecord = readEocdRecord(bufferedSourceBuffer);
                        String utf8 = bufferedSourceBuffer.readUtf8(eocdRecord.getCommentByteCount());
                        bufferedSourceBuffer.close();
                        long j2 = size - ((long) 20);
                        if (j2 > j) {
                            BufferedSource bufferedSourceBuffer2 = Okio.buffer(fileHandle.source(j2));
                            try {
                                BufferedSource bufferedSource = bufferedSourceBuffer2;
                                if (bufferedSource.readIntLe() == ZIP64_LOCATOR_SIGNATURE) {
                                    int intLe = bufferedSource.readIntLe();
                                    long longLe = bufferedSource.readLongLe();
                                    if (bufferedSource.readIntLe() != 1 || intLe != 0) {
                                        throw new IOException("unsupported zip: spanned");
                                    }
                                    BufferedSource bufferedSourceBuffer3 = Okio.buffer(fileHandle.source(longLe));
                                    try {
                                        BufferedSource bufferedSource2 = bufferedSourceBuffer3;
                                        int intLe2 = bufferedSource2.readIntLe();
                                        if (intLe2 != ZIP64_EOCD_RECORD_SIGNATURE) {
                                            throw new IOException("bad zip: expected " + getHex(ZIP64_EOCD_RECORD_SIGNATURE) + " but was " + getHex(intLe2));
                                        }
                                        EocdRecord zip64EocdRecord = readZip64EocdRecord(bufferedSource2, eocdRecord);
                                        yzc yzcVar = yzc.e;
                                        zby.d(bufferedSourceBuffer3, null);
                                        eocdRecord = zip64EocdRecord;
                                    } catch (Throwable th) {
                                        try {
                                            throw th;
                                        } catch (Throwable th2) {
                                            zby.d(bufferedSourceBuffer3, th);
                                            throw th2;
                                        }
                                    }
                                    try {
                                        throw th;
                                    } catch (Throwable th3) {
                                        zby.d(fileHandleOpenReadOnly, th);
                                        throw th3;
                                    }
                                }
                                yzc yzcVar2 = yzc.e;
                                zby.d(bufferedSourceBuffer2, null);
                            } catch (Throwable th4) {
                                try {
                                    throw th4;
                                } catch (Throwable th5) {
                                    zby.d(bufferedSourceBuffer2, th4);
                                    throw th5;
                                }
                            }
                        }
                        ArrayList arrayList = new ArrayList();
                        BufferedSource bufferedSourceBuffer4 = Okio.buffer(fileHandle.source(eocdRecord.getCentralDirectoryOffset()));
                        try {
                            BufferedSource bufferedSource3 = bufferedSourceBuffer4;
                            long entryCount = eocdRecord.getEntryCount();
                            for (long j3 = 0; j3 < entryCount; j3++) {
                                ZipEntry entry = readEntry(bufferedSource3);
                                if (entry.getOffset() >= eocdRecord.getCentralDirectoryOffset()) {
                                    throw new IOException("bad zip: local file header offset >= central directory offset");
                                }
                                if (function1.invoke(entry).booleanValue()) {
                                    arrayList.add(entry);
                                }
                            }
                            yzc yzcVar3 = yzc.e;
                            zby.d(bufferedSourceBuffer4, null);
                            ZipFileSystem zipFileSystem = new ZipFileSystem(path, fileSystem, buildIndex(arrayList), utf8);
                            zby.d(fileHandleOpenReadOnly, null);
                            return zipFileSystem;
                        } catch (Throwable th6) {
                            try {
                                throw th6;
                            } catch (Throwable th7) {
                                zby.d(bufferedSourceBuffer4, th6);
                                throw th7;
                            }
                        }
                    }
                    bufferedSourceBuffer.close();
                    size--;
                    if (size < jMax) {
                        throw new IOException("not a zip: end of central directory signature not found");
                    }
                    j = 0;
                } catch (Throwable th8) {
                    bufferedSourceBuffer.close();
                    throw th8;
                }
            }
        } catch (Throwable th9) {
            throw th9;
        }
    }

    private static final Map<Path, ZipEntry> buildIndex(List<ZipEntry> list) {
        Path path = Path.Companion.get$default(Path.INSTANCE, "/", false, 1, (Object) null);
        Map<Path, ZipEntry> mapA = zae.a(yyz.c(path, new ZipEntry(path, true, null, 0L, 0L, 0L, 0, null, 0L, TypedValues.PositionType.TYPE_CURVE_FIT, null)));
        for (ZipEntry zipEntry : yzp.e((Iterable) list, new Comparator() { // from class: okio.internal.ZipFilesKt$buildIndex$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return zay.d(((ZipEntry) t).getCanonicalPath(), ((ZipEntry) t2).getCanonicalPath());
            }
        })) {
            if (mapA.put(zipEntry.getCanonicalPath(), zipEntry) == null) {
                while (true) {
                    Path pathParent = zipEntry.getCanonicalPath().parent();
                    if (pathParent == null) {
                        break;
                    }
                    ZipEntry zipEntry2 = mapA.get(pathParent);
                    if (zipEntry2 != null) {
                        zipEntry2.getChildren().add(zipEntry.getCanonicalPath());
                        break;
                    }
                    ZipEntry zipEntry3 = new ZipEntry(pathParent, true, null, 0L, 0L, 0L, 0, null, 0L, TypedValues.PositionType.TYPE_CURVE_FIT, null);
                    mapA.put(pathParent, zipEntry3);
                    zipEntry3.getChildren().add(zipEntry.getCanonicalPath());
                    zipEntry = zipEntry3;
                }
            }
        }
        return mapA;
    }

    public static final ZipEntry readEntry(final BufferedSource bufferedSource) throws IOException {
        zcp.c(bufferedSource, "");
        int intLe = bufferedSource.readIntLe();
        if (intLe != CENTRAL_FILE_HEADER_SIGNATURE) {
            throw new IOException("bad zip: expected " + getHex(CENTRAL_FILE_HEADER_SIGNATURE) + " but was " + getHex(intLe));
        }
        bufferedSource.skip(4L);
        short shortLe = bufferedSource.readShortLe();
        if ((shortLe & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + getHex(shortLe & 65535));
        }
        short shortLe2 = bufferedSource.readShortLe();
        Long lDosDateTimeToEpochMillis = dosDateTimeToEpochMillis(bufferedSource.readShortLe() & 65535, bufferedSource.readShortLe() & 65535);
        long intLe2 = bufferedSource.readIntLe();
        final zcw.c cVar = new zcw.c();
        cVar.f53981a = ((long) bufferedSource.readIntLe()) & 4294967295L;
        final zcw.c cVar2 = new zcw.c();
        cVar2.f53981a = ((long) bufferedSource.readIntLe()) & 4294967295L;
        short shortLe3 = bufferedSource.readShortLe();
        short shortLe4 = bufferedSource.readShortLe();
        short shortLe5 = bufferedSource.readShortLe();
        bufferedSource.skip(8L);
        final zcw.c cVar3 = new zcw.c();
        cVar3.f53981a = ((long) bufferedSource.readIntLe()) & 4294967295L;
        String utf8 = bufferedSource.readUtf8(shortLe3 & 65535);
        if (zes.b((CharSequence) utf8, (char) 0, false, 2, (Object) null)) {
            throw new IOException("bad zip: filename contains 0x00");
        }
        long j = cVar2.f53981a == 4294967295L ? 8 : 0L;
        if (cVar.f53981a == 4294967295L) {
            j += (long) 8;
        }
        if (cVar3.f53981a == 4294967295L) {
            j += (long) 8;
        }
        final long j2 = j;
        final zcw.b bVar = new zcw.b();
        readExtra(bufferedSource, shortLe4 & 65535, new Function2<Integer, Long, yzc>() { // from class: okio.internal.ZipFilesKt.readEntry.1
            @Override // kotlin.jvm.functions.Function2
            public /* synthetic */ yzc invoke(Integer num, Long l) throws IOException {
                invoke(num.intValue(), l.longValue());
                return yzc.e;
            }

            public final void invoke(int i, long j3) throws IOException {
                if (i == 1) {
                    if (bVar.d) {
                        throw new IOException("bad zip: zip64 extra repeated");
                    }
                    bVar.d = true;
                    if (j3 < j2) {
                        throw new IOException("bad zip: zip64 extra too short");
                    }
                    zcw.c cVar4 = cVar2;
                    cVar4.f53981a = cVar4.f53981a == 4294967295L ? bufferedSource.readLongLe() : cVar2.f53981a;
                    zcw.c cVar5 = cVar;
                    cVar5.f53981a = cVar5.f53981a == 4294967295L ? bufferedSource.readLongLe() : 0L;
                    zcw.c cVar6 = cVar3;
                    cVar6.f53981a = cVar6.f53981a == 4294967295L ? bufferedSource.readLongLe() : 0L;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }
        });
        if (j2 > 0 && !bVar.d) {
            throw new IOException("bad zip: zip64 extra required but absent");
        }
        return new ZipEntry(Path.Companion.get$default(Path.INSTANCE, "/", false, 1, (Object) null).resolve(utf8), zes.c(utf8, "/", false, 2, (Object) null), bufferedSource.readUtf8(shortLe5 & 65535), intLe2 & 4294967295L, cVar.f53981a, cVar2.f53981a, shortLe2 & 65535, lDosDateTimeToEpochMillis, cVar3.f53981a);
    }

    private static final EocdRecord readEocdRecord(BufferedSource bufferedSource) throws IOException {
        short shortLe = bufferedSource.readShortLe();
        short shortLe2 = bufferedSource.readShortLe();
        long shortLe3 = bufferedSource.readShortLe() & 65535;
        if (shortLe3 != (bufferedSource.readShortLe() & 65535) || (shortLe & 65535) != 0 || (shortLe2 & 65535) != 0) {
            throw new IOException("unsupported zip: spanned");
        }
        bufferedSource.skip(4L);
        return new EocdRecord(shortLe3, 4294967295L & ((long) bufferedSource.readIntLe()), bufferedSource.readShortLe() & 65535);
    }

    private static final EocdRecord readZip64EocdRecord(BufferedSource bufferedSource, EocdRecord eocdRecord) throws IOException {
        bufferedSource.skip(12L);
        int intLe = bufferedSource.readIntLe();
        int intLe2 = bufferedSource.readIntLe();
        long longLe = bufferedSource.readLongLe();
        if (longLe != bufferedSource.readLongLe() || intLe != 0 || intLe2 != 0) {
            throw new IOException("unsupported zip: spanned");
        }
        bufferedSource.skip(8L);
        return new EocdRecord(longLe, bufferedSource.readLongLe(), eocdRecord.getCommentByteCount());
    }

    private static final void readExtra(BufferedSource bufferedSource, int i, Function2<? super Integer, ? super Long, yzc> function2) throws IOException {
        long j = i;
        while (j != 0) {
            if (j < 4) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            int shortLe = bufferedSource.readShortLe() & 65535;
            long shortLe2 = ((long) bufferedSource.readShortLe()) & 65535;
            long j2 = j - ((long) 4);
            if (j2 < shortLe2) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            bufferedSource.require(shortLe2);
            long size = bufferedSource.getBuffer().size();
            function2.invoke(Integer.valueOf(shortLe), Long.valueOf(shortLe2));
            long size2 = (bufferedSource.getBuffer().size() + shortLe2) - size;
            if (size2 < 0) {
                throw new IOException("unsupported zip: too many bytes processed for " + shortLe);
            }
            if (size2 > 0) {
                bufferedSource.getBuffer().skip(size2);
            }
            j = j2 - shortLe2;
        }
    }

    public static final void skipLocalHeader(BufferedSource bufferedSource) throws IOException {
        zcp.c(bufferedSource, "");
        readOrSkipLocalHeader(bufferedSource, null);
    }

    public static final FileMetadata readLocalHeader(BufferedSource bufferedSource, FileMetadata fileMetadata) throws IOException {
        zcp.c(bufferedSource, "");
        zcp.c(fileMetadata, "");
        FileMetadata orSkipLocalHeader = readOrSkipLocalHeader(bufferedSource, fileMetadata);
        zcp.e(orSkipLocalHeader);
        return orSkipLocalHeader;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final FileMetadata readOrSkipLocalHeader(final BufferedSource bufferedSource, FileMetadata fileMetadata) throws IOException {
        final zcw.e eVar = new zcw.e();
        eVar.f53983c = fileMetadata != null ? fileMetadata.getLastModifiedAtMillis() : 0;
        final zcw.e eVar2 = new zcw.e();
        final zcw.e eVar3 = new zcw.e();
        int intLe = bufferedSource.readIntLe();
        if (intLe != LOCAL_FILE_HEADER_SIGNATURE) {
            throw new IOException("bad zip: expected " + getHex(LOCAL_FILE_HEADER_SIGNATURE) + " but was " + getHex(intLe));
        }
        bufferedSource.skip(2L);
        short shortLe = bufferedSource.readShortLe();
        if ((shortLe & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + getHex(shortLe & 65535));
        }
        bufferedSource.skip(18L);
        long shortLe2 = bufferedSource.readShortLe();
        int shortLe3 = 65535 & bufferedSource.readShortLe();
        bufferedSource.skip(shortLe2 & 65535);
        if (fileMetadata == null) {
            bufferedSource.skip(shortLe3);
            return null;
        }
        readExtra(bufferedSource, shortLe3, new Function2<Integer, Long, yzc>() { // from class: okio.internal.ZipFilesKt.readOrSkipLocalHeader.1
            @Override // kotlin.jvm.functions.Function2
            public /* synthetic */ yzc invoke(Integer num, Long l) throws IOException {
                invoke(num.intValue(), l.longValue());
                return yzc.e;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [T, java.lang.Long] */
            /* JADX WARN: Type inference failed for: r10v11, types: [T, java.lang.Long] */
            /* JADX WARN: Type inference failed for: r11v3, types: [T, java.lang.Long] */
            public final void invoke(int i, long j) throws IOException {
                if (i == ZipFilesKt.HEADER_ID_EXTENDED_TIMESTAMP) {
                    if (j < 1) {
                        throw new IOException("bad zip: extended timestamp extra too short");
                    }
                    byte b2 = bufferedSource.readByte();
                    boolean z = (b2 & 1) == 1;
                    boolean z2 = (b2 & 2) == 2;
                    boolean z3 = (b2 & 4) == 4;
                    BufferedSource bufferedSource2 = bufferedSource;
                    long j2 = z ? 5L : 1L;
                    if (z2) {
                        j2 += 4;
                    }
                    if (z3) {
                        j2 += 4;
                    }
                    if (j < j2) {
                        throw new IOException("bad zip: extended timestamp extra too short");
                    }
                    if (z) {
                        eVar.f53983c = Long.valueOf(((long) bufferedSource2.readIntLe()) * 1000);
                    }
                    if (z2) {
                        eVar2.f53983c = Long.valueOf(((long) bufferedSource.readIntLe()) * 1000);
                    }
                    if (z3) {
                        eVar3.f53983c = Long.valueOf(((long) bufferedSource.readIntLe()) * 1000);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }
        });
        return new FileMetadata(fileMetadata.getIsRegularFile(), fileMetadata.getIsDirectory(), null, fileMetadata.getSize(), (Long) eVar3.f53983c, (Long) eVar.f53983c, (Long) eVar2.f53983c, null, 128, null);
    }

    private static final Long dosDateTimeToEpochMillis(int i, int i2) {
        if (i2 == -1) {
            return null;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(14, 0);
        gregorianCalendar.set(((i >> 9) & 127) + 1980, ((i >> 5) & 15) - 1, i & 31, (i2 >> 11) & 31, (i2 >> 5) & 63, (i2 & 31) << 1);
        return Long.valueOf(gregorianCalendar.getTime().getTime());
    }

    private static final String getHex(int i) {
        StringBuilder sb = new StringBuilder("0x");
        String string = Integer.toString(i, zek.e(16));
        zcp.b((Object) string, "");
        sb.append(string);
        return sb.toString();
    }
}
