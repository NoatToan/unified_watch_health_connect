package com.huami.feedback.datasource;

import android.os.Parcel;
import android.os.Parcelable;
import com.huami.feedback.entity.Issue;
import com.huami.feedback.util.ConstantsKt;
import com.huami.utils.persistence.kvkit.KvKit;
import com.huami.utils.persistence.kvkit.KvPersistence;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0013B\u0011\u0012\b\b\u0002\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0019\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lcom/huami/feedback/datasource/IssueLocalDataSourceImpl;", "Lcom/huami/feedback/datasource/IssueLocalDataSource;", "", "Lcom/huami/feedback/entity/Issue;", "issues", "", "saveIssue", "issue", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/CoroutineDispatcher;", "a", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "Lcom/huami/utils/persistence/kvkit/KvPersistence;", "b", "Lcom/huami/utils/persistence/kvkit/KvPersistence;", "kv", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;)V", "IssueWrapper", "feedback-impl_release"}, k = 1, mv = {1, 5, 1})
public final class IssueLocalDataSourceImpl implements IssueLocalDataSource {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final CoroutineDispatcher dispatcher;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final KvPersistence kv;

    @Parcelize
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\u0019\u0010\u0006\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\u000f\u001a\u00020\tHÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\tHÖ\u0001R\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/huami/feedback/datasource/IssueLocalDataSourceImpl$IssueWrapper;", "Landroid/os/Parcelable;", "", "Lcom/huami/feedback/entity/Issue;", "component1", "issues", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", DataCacher.j, "", "writeToParcel", "a", "Ljava/util/List;", "getIssues", "()Ljava/util/List;", "<init>", "(Ljava/util/List;)V", "feedback-impl_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class IssueWrapper implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<IssueWrapper> CREATOR = new Creator();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        private final List<Issue> issues;

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
        public static final class Creator implements Parcelable.Creator<IssueWrapper> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final IssueWrapper createFromParcel(@NotNull Parcel parcel) {
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(Issue.CREATOR.createFromParcel(parcel));
                }
                return new IssueWrapper(arrayList);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final IssueWrapper[] newArray(int i) {
                return new IssueWrapper[i];
            }
        }

        public IssueWrapper(@NotNull List<Issue> list) {
            this.issues = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ IssueWrapper copy$default(IssueWrapper issueWrapper, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = issueWrapper.issues;
            }
            return issueWrapper.copy(list);
        }

        @NotNull
        public final List<Issue> component1() {
            return this.issues;
        }

        @NotNull
        public final IssueWrapper copy(@NotNull List<Issue> issues) {
            return new IssueWrapper(issues);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof IssueWrapper) && Intrinsics.areEqual(this.issues, ((IssueWrapper) other).issues);
        }

        @NotNull
        public final List<Issue> getIssues() {
            return this.issues;
        }

        public int hashCode() {
            return this.issues.hashCode();
        }

        @NotNull
        public String toString() {
            return "IssueWrapper(issues=" + this.issues + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            List<Issue> list = this.issues;
            parcel.writeInt(list.size());
            Iterator<Issue> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, flags);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "Lcom/huami/feedback/entity/Issue;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.feedback.datasource.IssueLocalDataSourceImpl$issue$2", f = "IssueLocalDataSourceImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends Issue>>, Object> {
        public int a;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return IssueLocalDataSourceImpl.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends Issue>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<Issue>>) continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super List<Issue>> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            IssueWrapper issueWrapper = (IssueWrapper) IssueLocalDataSourceImpl.this.kv.getParcelableValue(ConstantsKt.FEEDBACK_ISSUES, IssueWrapper.class);
            return issueWrapper == null ? CollectionsKt__CollectionsKt.emptyList() : issueWrapper.getIssues();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.feedback.datasource.IssueLocalDataSourceImpl$saveIssue$1", f = "IssueLocalDataSourceImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ List<Issue> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List<Issue> list, Continuation<? super b> continuation) {
            super(2, continuation);
            this.c = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return IssueLocalDataSourceImpl.this.new b(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            IssueLocalDataSourceImpl.this.kv.setValue(ConstantsKt.FEEDBACK_ISSUES, new IssueWrapper(this.c));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IssueLocalDataSourceImpl() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public IssueLocalDataSourceImpl(@NotNull CoroutineDispatcher coroutineDispatcher) {
        this.dispatcher = coroutineDispatcher;
        this.kv = KvKit.getKvPersistence$default(ConstantsKt.FEEDBACK_KV_FILE, false, 2, null);
    }

    @Override // com.huami.feedback.datasource.IssueLocalDataSource
    @Nullable
    public Object issue(@NotNull Continuation<? super List<Issue>> continuation) {
        return BuildersKt.withContext(this.dispatcher, new a(null), continuation);
    }

    @Override // com.huami.feedback.datasource.IssueLocalDataSource
    public void saveIssue(@NotNull List<Issue> issues) {
        e.f(CoroutineScopeKt.CoroutineScope(this.dispatcher), null, null, new b(issues, null), 3, null);
    }

    public /* synthetic */ IssueLocalDataSourceImpl(CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Dispatchers.getIO() : coroutineDispatcher);
    }
}
