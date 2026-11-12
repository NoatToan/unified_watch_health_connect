package com.huami.devicerecorder.repository;

import com.huami.devicerecorder.model.IRecorderDB;
import com.huami.devicerecorder.model.RecordFile;
import com.huami.tools.log.HMLog;
import com.huami.watch.notification.TransportUri;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ!\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u000bJ\u001b\u0010\f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\tJ!\u0010\f\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lcom/huami/devicerecorder/repository/LocalRecordRepo;", "", "", "Lcom/huami/devicerecorder/model/RecordFile;", "queryAll", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "recordFile", "", "delete", "(Lcom/huami/devicerecorder/model/RecordFile;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "recordFiles", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", TransportUri.ACTION_ADD, "Lcom/huami/devicerecorder/model/IRecorderDB;", "a", "Lcom/huami/devicerecorder/model/IRecorderDB;", "dao", "<init>", "(Lcom/huami/devicerecorder/model/IRecorderDB;)V", "b", "device-recorder_release"}, k = 1, mv = {1, 5, 1})
public final class LocalRecordRepo {

    @NotNull
    private static final a b = new a(null);

    @Deprecated
    @NotNull
    private static final String c = "LocalRecordRepo";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final IRecorderDB dao;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/huami/devicerecorder/repository/LocalRecordRepo$a", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "device-recorder_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "query all null";
        }
    }

    public LocalRecordRepo(@NotNull IRecorderDB iRecorderDB) {
        this.dao = iRecorderDB;
    }

    @Nullable
    public final Object add(@NotNull RecordFile recordFile, @NotNull Continuation<? super Boolean> continuation) {
        IRecorderDB iRecorderDB = this.dao;
        if (iRecorderDB != null) {
            iRecorderDB.insert(recordFile);
        }
        return Boxing.boxBoolean(true);
    }

    @Nullable
    public final Object delete(@NotNull RecordFile recordFile, @NotNull Continuation<? super Boolean> continuation) {
        IRecorderDB iRecorderDB = this.dao;
        if (iRecorderDB != null) {
            iRecorderDB.delete(recordFile);
        }
        return Boxing.boxBoolean(true);
    }

    @Nullable
    public final Object queryAll(@NotNull Continuation<? super List<RecordFile>> continuation) {
        List<RecordFile> listQueryAll = this.dao.queryAll();
        if (listQueryAll != null) {
            return listQueryAll;
        }
        HMLog.info$default(null, b.a, 1, null);
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @Nullable
    public final Object add(@NotNull List<RecordFile> list, @NotNull Continuation<? super Boolean> continuation) {
        IRecorderDB iRecorderDB = this.dao;
        if (iRecorderDB != null) {
            iRecorderDB.insert(list);
        }
        return Boxing.boxBoolean(true);
    }

    @Nullable
    public final Object delete(@NotNull List<RecordFile> list, @NotNull Continuation<? super Boolean> continuation) {
        IRecorderDB iRecorderDB = this.dao;
        if (iRecorderDB != null) {
            iRecorderDB.delete(list);
        }
        return Boxing.boxBoolean(true);
    }
}
