package okio.internal;

import androidx.health.connect.client.records.ExerciseSessionRecord;
import defpackage.createFailure;
import defpackage.yzc;
import defpackage.yze;
import defpackage.zbg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequenceScope;
import okio.FileSystem;
import okio.Path;

/* JADX INFO: renamed from: okio.internal.-FileSystem$commonDeleteRecursively$sequence$1, reason: invalid class name */
/* JADX INFO: loaded from: classes46.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "Lokio/Path;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "okio.internal.-FileSystem$commonDeleteRecursively$sequence$1", f = "FileSystem.kt", i = {}, l = {ExerciseSessionRecord.EXERCISE_TYPE_TABLE_TENNIS}, m = "invokeSuspend", n = {}, s = {})
final class FileSystem$commonDeleteRecursively$sequence$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Path>, Continuation<? super yzc>, Object> {
    final /* synthetic */ Path $fileOrDirectory;
    final /* synthetic */ FileSystem $this_commonDeleteRecursively;
    private /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objA = zbg.a();
        int i = this.label;
        if (i == 0) {
            createFailure.c(obj);
            this.label = 1;
            if (FileSystem.collectRecursively((SequenceScope) this.L$0, this.$this_commonDeleteRecursively, new yze(), this.$fileOrDirectory, false, true, this) == objA) {
                return objA;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            createFailure.c(obj);
        }
        return yzc.e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SequenceScope<? super Path> sequenceScope, Continuation<? super yzc> continuation) {
        return ((FileSystem$commonDeleteRecursively$sequence$1) create(sequenceScope, continuation)).invokeSuspend(yzc.e);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<yzc> create(Object obj, Continuation<?> continuation) {
        FileSystem$commonDeleteRecursively$sequence$1 fileSystem$commonDeleteRecursively$sequence$1 = new FileSystem$commonDeleteRecursively$sequence$1(this.$this_commonDeleteRecursively, this.$fileOrDirectory, continuation);
        fileSystem$commonDeleteRecursively$sequence$1.L$0 = obj;
        return fileSystem$commonDeleteRecursively$sequence$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FileSystem$commonDeleteRecursively$sequence$1(FileSystem fileSystem, Path path, Continuation<? super FileSystem$commonDeleteRecursively$sequence$1> continuation) {
        super(2, continuation);
        this.$this_commonDeleteRecursively = fileSystem;
        this.$fileOrDirectory = path;
    }
}
