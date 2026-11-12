package okio.internal;

import androidx.media3.extractor.metadata.dvbsi.AppInfoTableDecoder;
import androidx.media3.extractor.ts.TsExtractor;
import com.huawei.operation.ble.BleConstants;
import defpackage.createFailure;
import defpackage.yyl;
import defpackage.yzc;
import defpackage.yze;
import defpackage.yzp;
import defpackage.zbg;
import defpackage.zcp;
import defpackage.zdz;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceScope;
import okio.BufferedSink;
import okio.FileMetadata;
import okio.Okio;
import okio.Path;
import okio.Source;

/* JADX INFO: renamed from: okio.internal.-FileSystem, reason: invalid class name */
/* JADX INFO: loaded from: classes46.dex */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aI\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0080@ø\u0001\u0000¢\u0006\u0002\u0010\f\u001a\u001c\u0010\r\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0003H\u0000\u001a\u001c\u0010\u0010\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\nH\u0000\u001a\u001c\u0010\u0013\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\nH\u0000\u001a\u0014\u0010\u0016\u001a\u00020\n*\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0000\u001a\"\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0018*\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0000\u001a\u0014\u0010\u0019\u001a\u00020\u001a*\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0000\u001a\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u0003*\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"collectRecursively", "", "Lkotlin/sequences/SequenceScope;", "Lokio/Path;", "fileSystem", "Lokio/FileSystem;", "stack", "Lkotlin/collections/ArrayDeque;", BleConstants.KEY_PATH, "followSymlinks", "", "postorder", "(Lkotlin/sequences/SequenceScope;Lokio/FileSystem;Lkotlin/collections/ArrayDeque;Lokio/Path;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "commonCopy", "source", "target", "commonCreateDirectories", "dir", "mustCreate", "commonDeleteRecursively", "fileOrDirectory", "mustExist", "commonExists", "commonListRecursively", "Lkotlin/sequences/Sequence;", "commonMetadata", "Lokio/FileMetadata;", "symlinkTarget", "okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class FileSystem {
    public static final FileMetadata commonMetadata(okio.FileSystem fileSystem, Path path) throws IOException {
        zcp.c(fileSystem, "");
        zcp.c(path, "");
        FileMetadata fileMetadataMetadataOrNull = fileSystem.metadataOrNull(path);
        if (fileMetadataMetadataOrNull != null) {
            return fileMetadataMetadataOrNull;
        }
        throw new FileNotFoundException("no such file: " + path);
    }

    public static final boolean commonExists(okio.FileSystem fileSystem, Path path) throws IOException {
        zcp.c(fileSystem, "");
        zcp.c(path, "");
        return fileSystem.metadataOrNull(path) != null;
    }

    public static final void commonCreateDirectories(okio.FileSystem fileSystem, Path path, boolean z) throws IOException {
        zcp.c(fileSystem, "");
        zcp.c(path, "");
        yze yzeVar = new yze();
        for (Path pathParent = path; pathParent != null && !fileSystem.exists(pathParent); pathParent = pathParent.parent()) {
            yzeVar.addFirst(pathParent);
        }
        if (z && yzeVar.isEmpty()) {
            throw new IOException(path + " already exists.");
        }
        Iterator it = yzeVar.iterator();
        while (it.hasNext()) {
            fileSystem.createDirectory((Path) it.next());
        }
    }

    public static final void commonDeleteRecursively(okio.FileSystem fileSystem, Path path, boolean z) throws IOException {
        zcp.c(fileSystem, "");
        zcp.c(path, "");
        Iterator it = zdz.e(new FileSystem$commonDeleteRecursively$sequence$1(fileSystem, path, null)).iterator();
        while (it.hasNext()) {
            fileSystem.delete((Path) it.next(), z && !it.hasNext());
        }
    }

    /* JADX INFO: renamed from: okio.internal.-FileSystem$commonListRecursively$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "Lokio/Path;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "okio.internal.-FileSystem$commonListRecursively$1", f = "FileSystem.kt", i = {0, 0}, l = {96}, m = "invokeSuspend", n = {"$this$sequence", "stack"}, s = {"L$0", "L$1"})
    static final class C04551 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Path>, Continuation<? super yzc>, Object> {
        final /* synthetic */ Path $dir;
        final /* synthetic */ boolean $followSymlinks;
        final /* synthetic */ okio.FileSystem $this_commonListRecursively;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SequenceScope sequenceScope;
            yze yzeVar;
            Iterator<Path> it;
            Object objA = zbg.a();
            int i = this.label;
            if (i == 0) {
                createFailure.c(obj);
                sequenceScope = (SequenceScope) this.L$0;
                yzeVar = new yze();
                yzeVar.addLast(this.$dir);
                it = this.$this_commonListRecursively.list(this.$dir).iterator();
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) this.L$2;
                yzeVar = (yze) this.L$1;
                sequenceScope = (SequenceScope) this.L$0;
                createFailure.c(obj);
            }
            yze yzeVar2 = yzeVar;
            SequenceScope sequenceScope2 = sequenceScope;
            while (it.hasNext()) {
                Path next = it.next();
                this.L$0 = sequenceScope2;
                this.L$1 = yzeVar2;
                this.L$2 = it;
                this.label = 1;
                if (FileSystem.collectRecursively(sequenceScope2, this.$this_commonListRecursively, yzeVar2, next, this.$followSymlinks, false, this) == objA) {
                    return objA;
                }
            }
            return yzc.e;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SequenceScope<? super Path> sequenceScope, Continuation<? super yzc> continuation) {
            return ((C04551) create(sequenceScope, continuation)).invokeSuspend(yzc.e);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<yzc> create(Object obj, Continuation<?> continuation) {
            C04551 c04551 = new C04551(this.$dir, this.$this_commonListRecursively, this.$followSymlinks, continuation);
            c04551.L$0 = obj;
            return c04551;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C04551(Path path, okio.FileSystem fileSystem, boolean z, Continuation<? super C04551> continuation) {
            super(2, continuation);
            this.$dir = path;
            this.$this_commonListRecursively = fileSystem;
            this.$followSymlinks = z;
        }
    }

    public static final Sequence<Path> commonListRecursively(okio.FileSystem fileSystem, Path path, boolean z) throws IOException {
        zcp.c(fileSystem, "");
        zcp.c(path, "");
        return zdz.e(new C04551(path, fileSystem, z, null));
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00f7 A[Catch: all -> 0x005d, TRY_LEAVE, TryCatch #1 {all -> 0x005d, blocks: (B:17:0x0058, B:48:0x00f1, B:50:0x00f7), top: B:69:0x0058 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0134  */
    /* JADX WARN: Code duplicated, block: B:65:0x014b  */
    /* JADX WARN: Code duplicated, block: B:72:0x0147 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:? A[LOOP:0: B:48:0x00f1->B:74:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0099, code lost:
    
        if (r15.yield(r1, r4) == r5) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0145, code lost:
    
        if (r10.yield(r1, r4) == r5) goto L62;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v6, types: [kotlin.sequences.SequenceScope] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, kotlin.sequences.SequenceScope, kotlin.sequences.SequenceScope<? super okio.Path>] */
    /* JADX WARN: Type inference failed for: r15v1, types: [kotlin.sequences.SequenceScope] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object collectRecursively(SequenceScope<? super Path> sequenceScope, okio.FileSystem fileSystem, yze<Path> yzeVar, Path path, boolean z, boolean z2, Continuation<? super yzc> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        okio.FileSystem fileSystem2;
        yze<Path> yzeVar2;
        boolean z3;
        okio.FileSystem fileSystem3;
        ?? r10;
        boolean z4;
        yze<Path> yzeVar3;
        ?? r11;
        okio.FileSystem fileSystem4;
        Path path2;
        boolean z5;
        boolean z6;
        Iterator<Path> it;
        Path next;
        Path path3 = path;
        boolean z7 = z2;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object obj = anonymousClass1.result;
        Object objA = zbg.a();
        int i = anonymousClass1.label;
        if (i == 0) {
            createFailure.c(obj);
            if (z7) {
                fileSystem2 = fileSystem;
                yzeVar2 = yzeVar;
                z3 = z;
            } else {
                anonymousClass1.L$0 = sequenceScope;
                fileSystem2 = fileSystem;
                anonymousClass1.L$1 = fileSystem2;
                yzeVar2 = yzeVar;
                anonymousClass1.L$2 = yzeVar2;
                anonymousClass1.L$3 = path3;
                z3 = z;
                anonymousClass1.Z$0 = z3;
                anonymousClass1.Z$1 = z7;
                anonymousClass1.label = 1;
            }
            fileSystem3 = fileSystem2;
            boolean z8 = z3;
            r10 = sequenceScope;
            z4 = z8;
        } else {
            if (i != 1) {
                if (i == 2) {
                    z6 = anonymousClass1.Z$1;
                    z5 = anonymousClass1.Z$0;
                    it = (Iterator) anonymousClass1.L$4;
                    path2 = (Path) anonymousClass1.L$3;
                    yzeVar3 = (yze) anonymousClass1.L$2;
                    fileSystem4 = (okio.FileSystem) anonymousClass1.L$1;
                    SequenceScope sequenceScope2 = (SequenceScope) anonymousClass1.L$0;
                    try {
                        createFailure.c(obj);
                        r11 = sequenceScope2;
                        while (it.hasNext()) {
                            next = it.next();
                            anonymousClass1.L$0 = r11;
                            anonymousClass1.L$1 = fileSystem4;
                            anonymousClass1.L$2 = yzeVar3;
                            anonymousClass1.L$3 = path2;
                            anonymousClass1.L$4 = it;
                            anonymousClass1.Z$0 = z5;
                            anonymousClass1.Z$1 = z6;
                            anonymousClass1.label = 2;
                            if (collectRecursively(r11, fileSystem4, yzeVar3, next, z5, z6, anonymousClass1) == objA) {
                                return objA;
                            }
                        }
                        yzeVar3.removeLast();
                        z7 = z6;
                        path3 = path2;
                        r10 = r11;
                        if (z7) {
                            return yzc.e;
                        }
                        anonymousClass1.L$0 = null;
                        anonymousClass1.L$1 = null;
                        anonymousClass1.L$2 = null;
                        anonymousClass1.L$3 = null;
                        anonymousClass1.L$4 = null;
                        anonymousClass1.label = 3;
                    } catch (Throwable th) {
                        th = th;
                        yzeVar3.removeLast();
                        throw th;
                    }
                } else {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    createFailure.c(obj);
                }
                return yzc.e;
            }
            boolean z9 = anonymousClass1.Z$1;
            boolean z10 = anonymousClass1.Z$0;
            Path path4 = (Path) anonymousClass1.L$3;
            yzeVar2 = (yze) anonymousClass1.L$2;
            fileSystem3 = (okio.FileSystem) anonymousClass1.L$1;
            SequenceScope sequenceScope3 = (SequenceScope) anonymousClass1.L$0;
            createFailure.c(obj);
            z7 = z9;
            z4 = z10;
            path3 = path4;
            r10 = sequenceScope3;
        }
        List<Path> listListOrNull = fileSystem3.listOrNull(path3);
        if (listListOrNull == null) {
            listListOrNull = yzp.e();
        }
        if (!listListOrNull.isEmpty()) {
            int i2 = 0;
            Path path5 = path3;
            while (true) {
                if (z4 && yzeVar2.contains(path5)) {
                    throw new IOException("symlink cycle at " + path3);
                }
                Path pathSymlinkTarget = symlinkTarget(fileSystem3, path5);
                if (pathSymlinkTarget == null) {
                    if (z4 || i2 == 0) {
                        yzeVar2.addLast(path5);
                        try {
                            r11 = r10;
                            fileSystem4 = fileSystem3;
                            yzeVar3 = yzeVar2;
                            path2 = path3;
                            z5 = z4;
                            z6 = z7;
                            it = listListOrNull.iterator();
                            while (it.hasNext()) {
                                next = it.next();
                                anonymousClass1.L$0 = r11;
                                anonymousClass1.L$1 = fileSystem4;
                                anonymousClass1.L$2 = yzeVar3;
                                anonymousClass1.L$3 = path2;
                                anonymousClass1.L$4 = it;
                                anonymousClass1.Z$0 = z5;
                                anonymousClass1.Z$1 = z6;
                                anonymousClass1.label = 2;
                                if (collectRecursively(r11, fileSystem4, yzeVar3, next, z5, z6, anonymousClass1) == objA) {
                                }
                            }
                            yzeVar3.removeLast();
                            z7 = z6;
                            path3 = path2;
                            r10 = r11;
                        } catch (Throwable th2) {
                            th = th2;
                            yzeVar3 = yzeVar2;
                            yzeVar3.removeLast();
                            throw th;
                        }
                    }
                    return objA;
                }
                i2++;
                path5 = pathSymlinkTarget;
            }
        }
        if (z7) {
            return yzc.e;
        }
        anonymousClass1.L$0 = null;
        anonymousClass1.L$1 = null;
        anonymousClass1.L$2 = null;
        anonymousClass1.L$3 = null;
        anonymousClass1.L$4 = null;
        anonymousClass1.label = 3;
    }

    public static final Path symlinkTarget(okio.FileSystem fileSystem, Path path) throws IOException {
        zcp.c(fileSystem, "");
        zcp.c(path, "");
        Path symlinkTarget = fileSystem.metadata(path).getSymlinkTarget();
        if (symlinkTarget == null) {
            return null;
        }
        Path pathParent = path.parent();
        zcp.e(pathParent);
        return pathParent.resolve(symlinkTarget);
    }

    public static final void commonCopy(okio.FileSystem fileSystem, Path path, Path path2) throws IOException {
        Long lValueOf;
        Throwable th;
        Long lValueOf2;
        zcp.c(fileSystem, "");
        zcp.c(path, "");
        zcp.c(path2, "");
        Source source = fileSystem.source(path);
        Throwable th2 = null;
        try {
            Source source2 = source;
            BufferedSink bufferedSinkBuffer = Okio.buffer(fileSystem.sink(path2));
            try {
                lValueOf2 = Long.valueOf(bufferedSinkBuffer.writeAll(source2));
                if (bufferedSinkBuffer != null) {
                    try {
                        bufferedSinkBuffer.close();
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                th = null;
            } catch (Throwable th4) {
                if (bufferedSinkBuffer != null) {
                    try {
                        bufferedSinkBuffer.close();
                    } catch (Throwable th5) {
                        yyl.d(th4, th5);
                    }
                }
                th = th4;
                lValueOf2 = null;
            }
            if (th != null) {
                throw th;
            }
            zcp.e(lValueOf2);
            lValueOf = Long.valueOf(lValueOf2.longValue());
            if (source != null) {
                try {
                    source.close();
                } catch (Throwable th6) {
                    th2 = th6;
                }
            }
            if (th2 != null) {
                throw th2;
            }
            zcp.e(lValueOf);
        } catch (Throwable th7) {
            if (source != null) {
                try {
                    source.close();
                } catch (Throwable th8) {
                    yyl.d(th7, th8);
                }
            }
            th2 = th7;
            lValueOf = null;
        }
    }

    /* JADX INFO: renamed from: okio.internal.-FileSystem$collectRecursively$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "okio.internal.-FileSystem", f = "FileSystem.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, TsExtractor.TS_STREAM_TYPE_E_AC3, 145}, m = "collectRecursively", n = {"$this$collectRecursively", "fileSystem", "stack", BleConstants.KEY_PATH, "followSymlinks", "postorder", "$this$collectRecursively", "fileSystem", "stack", BleConstants.KEY_PATH, "followSymlinks", "postorder"}, s = {"L$0", "L$1", "L$2", "L$3", "Z$0", "Z$1", "L$0", "L$1", "L$2", "L$3", "Z$0", "Z$1"})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        boolean Z$0;
        boolean Z$1;
        int label;
        /* synthetic */ Object result;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FileSystem.collectRecursively(null, null, null, null, false, false, this);
        }

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }
    }
}
