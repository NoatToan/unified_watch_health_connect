package kotlin.io.path;

import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import java.nio.file.FileSystemLoopException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt__SequenceBuilderKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class PathTreeWalk implements Sequence<Path> {

    @NotNull
    private final PathWalkOption[] options;

    @NotNull
    private final Path start;

    /* JADX INFO: renamed from: kotlin.io.path.PathTreeWalk$bfsIterator$1, reason: invalid class name */
    @DebugMetadata(c = "kotlin.io.path.PathTreeWalk$bfsIterator$1", f = "PathTreeWalk.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1}, l = {SportReportBaseParser.ReportType.minWaterTemperature, SportReportBaseParser.ReportType.noFlyDuration}, m = "invokeSuspend", n = {"$this$iterator", "queue", "entriesReader", "pathNode", "this_$iv", "path$iv", "$this$iterator", "queue", "entriesReader"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2"})
    @SourceDebugExtension({"SMAP\nPathTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk$bfsIterator$1\n+ 2 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk\n*L\n1#1,180:1\n44#2,19:181\n*S KotlinDebug\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk$bfsIterator$1\n*L\n101#1:181,19\n*E\n"})
    public static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Path>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = PathTreeWalk.this.new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0084  */
        /* JADX WARN: Code duplicated, block: B:15:0x0096  */
        /* JADX WARN: Code duplicated, block: B:20:0x00b7  */
        /* JADX WARN: Code duplicated, block: B:22:0x00bd  */
        /* JADX WARN: Code duplicated, block: B:24:0x00d1 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:25:0x00d2  */
        /* JADX WARN: Code duplicated, block: B:27:0x00e0 A[PHI: r1 r5 r6 r7 r8 r13
          0x00e0: PHI (r1v3 kotlin.io.path.DirectoryEntriesReader) = (r1v5 kotlin.io.path.DirectoryEntriesReader), (r1v6 kotlin.io.path.DirectoryEntriesReader) binds: [B:26:0x00d9, B:21:0x00bb] A[DONT_GENERATE, DONT_INLINE]
          0x00e0: PHI (r5v2 kotlin.collections.ArrayDeque) = (r5v4 kotlin.collections.ArrayDeque), (r5v5 kotlin.collections.ArrayDeque) binds: [B:26:0x00d9, B:21:0x00bb] A[DONT_GENERATE, DONT_INLINE]
          0x00e0: PHI (r6v4 kotlin.sequences.SequenceScope) = (r6v6 kotlin.sequences.SequenceScope), (r6v7 kotlin.sequences.SequenceScope) binds: [B:26:0x00d9, B:21:0x00bb] A[DONT_GENERATE, DONT_INLINE]
          0x00e0: PHI (r7v2 kotlin.io.path.PathTreeWalk) = (r7v10 kotlin.io.path.PathTreeWalk), (r7v11 kotlin.io.path.PathTreeWalk) binds: [B:26:0x00d9, B:21:0x00bb] A[DONT_GENERATE, DONT_INLINE]
          0x00e0: PHI (r8v3 java.nio.file.Path) = (r8v5 java.nio.file.Path), (r8v6 java.nio.file.Path) binds: [B:26:0x00d9, B:21:0x00bb] A[DONT_GENERATE, DONT_INLINE]
          0x00e0: PHI (r13v3 kotlin.io.path.PathNode) = (r13v6 kotlin.io.path.PathNode), (r13v11 kotlin.io.path.PathNode) binds: [B:26:0x00d9, B:21:0x00bb] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:29:0x00f8  */
        /* JADX WARN: Code duplicated, block: B:30:0x0103  */
        /* JADX WARN: Code duplicated, block: B:32:0x010d  */
        /* JADX WARN: Code duplicated, block: B:39:0x011f A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:40:0x00b1 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:42:0x0133 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:44:0x007d A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:45:0x007d A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00f6 -> B:11:0x007d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00f8 -> B:11:0x007d). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:32:0x010d
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instruction units count: 311
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.io.path.PathTreeWalk.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SequenceScope<? super Path> sequenceScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: kotlin.io.path.PathTreeWalk$dfsIterator$1, reason: invalid class name and case insensitive filesystem */
    @DebugMetadata(c = "kotlin.io.path.PathTreeWalk$dfsIterator$1", f = "PathTreeWalk.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3}, l = {SportReportBaseParser.ReportType.minWaterTemperature, SportReportBaseParser.ReportType.noFlyDuration, 210, 216}, m = "invokeSuspend", n = {"$this$iterator", "stack", "entriesReader", "startNode", "this_$iv", "path$iv", "$this$iterator", "stack", "entriesReader", "$this$iterator", "stack", "entriesReader", "pathNode", "this_$iv", "path$iv", "$this$iterator", "stack", "entriesReader"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2"})
    @SourceDebugExtension({"SMAP\nPathTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk$dfsIterator$1\n+ 2 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk\n*L\n1#1,180:1\n44#2,19:181\n44#2,19:200\n*S KotlinDebug\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk$dfsIterator$1\n*L\n70#1:181,19\n81#1:200,19\n*E\n"})
    public static final class C35281 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Path>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        public C35281(Continuation<? super C35281> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C35281 c35281 = PathTreeWalk.this.new C35281(continuation);
            c35281.L$0 = obj;
            return c35281;
        }

        /* JADX WARN: Code duplicated, block: B:41:0x014c  */
        /* JADX WARN: Code duplicated, block: B:45:0x0171  */
        /* JADX WARN: Code duplicated, block: B:50:0x0192  */
        /* JADX WARN: Code duplicated, block: B:52:0x0198  */
        /* JADX WARN: Code duplicated, block: B:54:0x01ac A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:55:0x01ad  */
        /* JADX WARN: Code duplicated, block: B:57:0x01bb A[PHI: r1 r4 r7 r8 r9 r15
          0x01bb: PHI (r1v9 kotlin.io.path.DirectoryEntriesReader) = (r1v7 kotlin.io.path.DirectoryEntriesReader), (r1v11 kotlin.io.path.DirectoryEntriesReader) binds: [B:51:0x0196, B:56:0x01b4] A[DONT_GENERATE, DONT_INLINE]
          0x01bb: PHI (r4v18 kotlin.collections.ArrayDeque) = (r4v16 kotlin.collections.ArrayDeque), (r4v20 kotlin.collections.ArrayDeque) binds: [B:51:0x0196, B:56:0x01b4] A[DONT_GENERATE, DONT_INLINE]
          0x01bb: PHI (r7v9 kotlin.sequences.SequenceScope) = (r7v7 kotlin.sequences.SequenceScope), (r7v11 kotlin.sequences.SequenceScope) binds: [B:51:0x0196, B:56:0x01b4] A[DONT_GENERATE, DONT_INLINE]
          0x01bb: PHI (r8v15 kotlin.io.path.PathTreeWalk) = (r8v13 kotlin.io.path.PathTreeWalk), (r8v25 kotlin.io.path.PathTreeWalk) binds: [B:51:0x0196, B:56:0x01b4] A[DONT_GENERATE, DONT_INLINE]
          0x01bb: PHI (r9v11 java.nio.file.Path) = (r9v9 java.nio.file.Path), (r9v13 java.nio.file.Path) binds: [B:51:0x0196, B:56:0x01b4] A[DONT_GENERATE, DONT_INLINE]
          0x01bb: PHI (r15v22 kotlin.io.path.PathNode) = (r15v14 kotlin.io.path.PathNode), (r15v23 kotlin.io.path.PathNode) binds: [B:51:0x0196, B:56:0x01b4] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:59:0x01d3  */
        /* JADX WARN: Code duplicated, block: B:60:0x01e3  */
        /* JADX WARN: Code duplicated, block: B:73:0x018c A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:75:0x015f A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x01d1 -> B:39:0x0145). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x01d3 -> B:39:0x0145). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instruction units count: 540
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.io.path.PathTreeWalk.C35281.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SequenceScope<? super Path> sequenceScope, Continuation<? super Unit> continuation) {
            return ((C35281) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public PathTreeWalk(@NotNull Path start, @NotNull PathWalkOption[] options) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(options, "options");
        this.start = start;
        this.options = options;
    }

    private final Iterator<Path> bfsIterator() {
        return SequencesKt__SequenceBuilderKt.iterator(new AnonymousClass1(null));
    }

    private final Iterator<Path> dfsIterator() {
        return SequencesKt__SequenceBuilderKt.iterator(new C35281(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getFollowLinks() {
        return ArraysKt___ArraysKt.contains(this.options, PathWalkOption.FOLLOW_LINKS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getIncludeDirectories() {
        return ArraysKt___ArraysKt.contains(this.options, PathWalkOption.INCLUDE_DIRECTORIES);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LinkOption[] getLinkOptions() {
        return LinkFollowing.INSTANCE.toLinkOptions(getFollowLinks());
    }

    private final boolean isBFS() {
        return ArraysKt___ArraysKt.contains(this.options, PathWalkOption.BREADTH_FIRST);
    }

    private final Object yieldIfNeeded(SequenceScope<? super Path> sequenceScope, PathNode pathNode, DirectoryEntriesReader directoryEntriesReader, Function1<? super List<PathNode>, Unit> function1, Continuation<? super Unit> continuation) throws FileSystemLoopException {
        Path path = pathNode.getPath();
        if (pathNode.getParent() != null) {
            PathsKt__PathRecursiveFunctionsKt.checkFileName(path);
        }
        LinkOption[] linkOptions = getLinkOptions();
        LinkOption[] linkOptionArr = (LinkOption[]) Arrays.copyOf(linkOptions, linkOptions.length);
        if (Files.isDirectory(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length))) {
            if (PathTreeWalkKt.createsCycle(pathNode)) {
                throw new FileSystemLoopException(path.toString());
            }
            if (getIncludeDirectories()) {
                InlineMarker.mark(0);
                sequenceScope.yield(path, continuation);
                InlineMarker.mark(1);
            }
            LinkOption[] linkOptions2 = getLinkOptions();
            LinkOption[] linkOptionArr2 = (LinkOption[]) Arrays.copyOf(linkOptions2, linkOptions2.length);
            if (Files.isDirectory(path, (LinkOption[]) Arrays.copyOf(linkOptionArr2, linkOptionArr2.length))) {
                function1.invoke2(directoryEntriesReader.readEntries(pathNode));
            }
        } else if (Files.exists(path, (LinkOption[]) Arrays.copyOf(new LinkOption[]{LinkOption.NOFOLLOW_LINKS}, 1))) {
            InlineMarker.mark(0);
            sequenceScope.yield(path, continuation);
            InlineMarker.mark(1);
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<Path> iterator() {
        return isBFS() ? bfsIterator() : dfsIterator();
    }
}
