package androidx.datastore.core;

import androidx.annotation.GuardedBy;
import androidx.datastore.core.handlers.NoOpCorruptionHandler;
import com.miui.tsmclient.util.Constants;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.ai.api.intent.AIApiConstants;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import com.xiaomi.smarthome.library.bluetooth.channel.packet.Packet;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DebugKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 F*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0003FGHB\u007f\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012?\b\u0002\u0010\b\u001a9\u00125\u00123\b\u0001\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\n0\t\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015ø\u0001\u0000¢\u0006\u0002\u0010\u0016J\u001f\u0010+\u001a\u00020\u00102\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000-H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010.J\u001f\u0010/\u001a\u00020\u00102\f\u00100\u001a\b\u0012\u0004\u0012\u00028\u000001H\u0082@ø\u0001\u0000¢\u0006\u0002\u00102J\u0011\u00103\u001a\u00020\u0010H\u0082@ø\u0001\u0000¢\u0006\u0002\u00104J\u0011\u00105\u001a\u00020\u0010H\u0082@ø\u0001\u0000¢\u0006\u0002\u00104J\u0011\u00106\u001a\u00020\u0010H\u0082@ø\u0001\u0000¢\u0006\u0002\u00104J\u0011\u00107\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0002\u00104J\u0011\u00108\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0002\u00104JL\u00109\u001a\u00028\u000021\u0010:\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(;\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\n2\u0006\u0010<\u001a\u00020=H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010>JD\u0010?\u001a\u00028\u000021\u0010:\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(;\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\nH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010@J\u001b\u0010A\u001a\u00020\u00102\u0006\u0010B\u001a\u00028\u0000H\u0080@ø\u0001\u0000¢\u0006\u0004\bC\u0010DJ\f\u0010E\u001a\u00020\u0010*\u00020\u0005H\u0002R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082D¢\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001b0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR \u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\"0!X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b#\u0010$R\u001b\u0010%\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b&\u0010'RJ\u0010*\u001a;\u00125\u00123\b\u0001\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\n\u0018\u00010\tX\u0082\u000eø\u0001\u0000¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006I"}, d2 = {"Landroidx/datastore/core/SingleProcessDataStore;", "T", "Landroidx/datastore/core/DataStore;", "produceFile", "Lkotlin/Function0;", "Ljava/io/File;", "serializer", "Landroidx/datastore/core/Serializer;", "initTasksList", "", "Lkotlin/Function2;", "Landroidx/datastore/core/InitializerApi;", "Lkotlin/ParameterName;", "name", "api", "Lkotlin/coroutines/Continuation;", "", "", "corruptionHandler", "Landroidx/datastore/core/CorruptionHandler;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "(Lkotlin/jvm/functions/Function0;Landroidx/datastore/core/Serializer;Ljava/util/List;Landroidx/datastore/core/CorruptionHandler;Lkotlinx/coroutines/CoroutineScope;)V", "SCRATCH_SUFFIX", "", "actor", "Landroidx/datastore/core/SimpleActor;", "Landroidx/datastore/core/SingleProcessDataStore$Message;", "data", "Lkotlinx/coroutines/flow/Flow;", "getData", "()Lkotlinx/coroutines/flow/Flow;", "downstreamFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Landroidx/datastore/core/State;", "getDownstreamFlow$annotations", "()V", "file", "getFile", "()Ljava/io/File;", "file$delegate", "Lkotlin/Lazy;", "initTasks", "handleRead", "read", "Landroidx/datastore/core/SingleProcessDataStore$Message$Read;", "(Landroidx/datastore/core/SingleProcessDataStore$Message$Read;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleUpdate", "update", "Landroidx/datastore/core/SingleProcessDataStore$Message$Update;", "(Landroidx/datastore/core/SingleProcessDataStore$Message$Update;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readAndInit", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readAndInitOrPropagateAndThrowFailure", "readAndInitOrPropagateFailure", "readData", "readDataOrHandleCorruption", "transformAndWrite", "transform", DeviceTagInterface.CUSTOM_TAG_TYPE, "callerContext", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateData", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeData", "newData", "writeData$datastore_core", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createParentDirectories", "Companion", AIApiConstants.Message.NAME, "UncloseableOutputStream", "datastore-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class SingleProcessDataStore<T> implements DataStore<T> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @GuardedBy("activeFilesLock")
    @NotNull
    private static final Set<String> activeFiles = new LinkedHashSet();

    @NotNull
    private static final Object activeFilesLock = new Object();

    @NotNull
    private final String SCRATCH_SUFFIX;

    @NotNull
    private final SimpleActor<Message<T>> actor;

    @NotNull
    private final CorruptionHandler<T> corruptionHandler;

    @NotNull
    private final Flow<T> data;

    @NotNull
    private final MutableStateFlow<State<T>> downstreamFlow;

    /* JADX INFO: renamed from: file$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy file;

    @Nullable
    private List<? extends Function2<? super InitializerApi<T>, ? super Continuation<? super Unit>, ? extends Object>> initTasks;

    @NotNull
    private final Function0<File> produceFile;

    @NotNull
    private final CoroutineScope scope;

    @NotNull
    private final Serializer<T> serializer;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0081\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/datastore/core/SingleProcessDataStore$Companion;", "", "()V", "activeFiles", "", "", "getActiveFiles$datastore_core", "()Ljava/util/Set;", "activeFilesLock", "getActiveFilesLock$datastore_core", "()Ljava/lang/Object;", "datastore-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Set<String> getActiveFiles$datastore_core() {
            return SingleProcessDataStore.activeFiles;
        }

        @NotNull
        public final Object getActiveFilesLock$datastore_core() {
            return SingleProcessDataStore.activeFilesLock;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002:\u0002\b\tB\u0007\b\u0004¢\u0006\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Landroidx/datastore/core/SingleProcessDataStore$Message;", "T", "", "()V", "lastState", "Landroidx/datastore/core/State;", "getLastState", "()Landroidx/datastore/core/State;", "Read", "Update", "Landroidx/datastore/core/SingleProcessDataStore$Message$Read;", "Landroidx/datastore/core/SingleProcessDataStore$Message$Update;", "datastore-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static abstract class Message<T> {

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0015\u0012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005R\u001c\u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/datastore/core/SingleProcessDataStore$Message$Read;", "T", "Landroidx/datastore/core/SingleProcessDataStore$Message;", "lastState", "Landroidx/datastore/core/State;", "(Landroidx/datastore/core/State;)V", "getLastState", "()Landroidx/datastore/core/State;", "datastore-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class Read<T> extends Message<T> {

            @Nullable
            private final State<T> lastState;

            public Read(@Nullable State<T> state) {
                super(null);
                this.lastState = state;
            }

            @Override // androidx.datastore.core.SingleProcessDataStore.Message
            @Nullable
            public State<T> getLastState() {
                return this.lastState;
            }
        }

        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002Ba\u00121\u0010\u0003\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00020\u000b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0002\u0010\u0010R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016RA\u0010\u0003\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Landroidx/datastore/core/SingleProcessDataStore$Message$Update;", "T", "Landroidx/datastore/core/SingleProcessDataStore$Message;", "transform", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", DeviceTagInterface.CUSTOM_TAG_TYPE, "Lkotlin/coroutines/Continuation;", "", Packet.ACK, "Lkotlinx/coroutines/CompletableDeferred;", "lastState", "Landroidx/datastore/core/State;", "callerContext", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlin/jvm/functions/Function2;Lkotlinx/coroutines/CompletableDeferred;Landroidx/datastore/core/State;Lkotlin/coroutines/CoroutineContext;)V", "getAck", "()Lkotlinx/coroutines/CompletableDeferred;", "getCallerContext", "()Lkotlin/coroutines/CoroutineContext;", "getLastState", "()Landroidx/datastore/core/State;", "getTransform", "()Lkotlin/jvm/functions/Function2;", "Lkotlin/jvm/functions/Function2;", "datastore-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class Update<T> extends Message<T> {

            @NotNull
            private final CompletableDeferred<T> ack;

            @NotNull
            private final CoroutineContext callerContext;

            @Nullable
            private final State<T> lastState;

            @NotNull
            private final Function2<T, Continuation<? super T>, Object> transform;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public Update(@NotNull Function2<? super T, ? super Continuation<? super T>, ? extends Object> transform, @NotNull CompletableDeferred<T> ack, @Nullable State<T> state, @NotNull CoroutineContext callerContext) {
                super(null);
                Intrinsics.checkNotNullParameter(transform, "transform");
                Intrinsics.checkNotNullParameter(ack, "ack");
                Intrinsics.checkNotNullParameter(callerContext, "callerContext");
                this.transform = transform;
                this.ack = ack;
                this.lastState = state;
                this.callerContext = callerContext;
            }

            @NotNull
            public final CompletableDeferred<T> getAck() {
                return this.ack;
            }

            @NotNull
            public final CoroutineContext getCallerContext() {
                return this.callerContext;
            }

            @Override // androidx.datastore.core.SingleProcessDataStore.Message
            @Nullable
            public State<T> getLastState() {
                return this.lastState;
            }

            @NotNull
            public final Function2<T, Continuation<? super T>, Object> getTransform() {
                return this.transform;
            }
        }

        private Message() {
        }

        public /* synthetic */ Message(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public abstract State<T> getLastState();
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0016J \u0010\n\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u000fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Landroidx/datastore/core/SingleProcessDataStore$UncloseableOutputStream;", "Ljava/io/OutputStream;", "fileOutputStream", "Ljava/io/FileOutputStream;", "(Ljava/io/FileOutputStream;)V", "getFileOutputStream", "()Ljava/io/FileOutputStream;", Constants.EXTRA_CLOSE_TAI, "", "flush", "write", PluginDeviceInfo.FDESC, "", "bytes", DebugKt.DEBUG_PROPERTY_VALUE_OFF, "", "len", "datastore-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class UncloseableOutputStream extends OutputStream {

        @NotNull
        private final FileOutputStream fileOutputStream;

        public UncloseableOutputStream(@NotNull FileOutputStream fileOutputStream) {
            Intrinsics.checkNotNullParameter(fileOutputStream, "fileOutputStream");
            this.fileOutputStream = fileOutputStream;
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            this.fileOutputStream.flush();
        }

        @NotNull
        public final FileOutputStream getFileOutputStream() {
            return this.fileOutputStream;
        }

        @Override // java.io.OutputStream
        public void write(int b2) throws IOException {
            this.fileOutputStream.write(b2);
        }

        @Override // java.io.OutputStream
        public void write(@NotNull byte[] b2) throws IOException {
            Intrinsics.checkNotNullParameter(b2, "b");
            this.fileOutputStream.write(b2);
        }

        @Override // java.io.OutputStream
        public void write(@NotNull byte[] bytes, int off, int len) throws IOException {
            Intrinsics.checkNotNullParameter(bytes, "bytes");
            this.fileOutputStream.write(bytes, off, len);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.SingleProcessDataStore$handleUpdate$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    @DebugMetadata(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", i = {1, 1}, l = {276, 281, 284}, m = "handleUpdate", n = {"update", "$this$handleUpdate_u24lambda_u2d0"}, s = {"L$0", "L$1"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SingleProcessDataStore<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SingleProcessDataStore<T> singleProcessDataStore, Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
            this.this$0 = singleProcessDataStore;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.handleUpdate(null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.SingleProcessDataStore$readAndInit$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    @DebugMetadata(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", i = {0, 0, 1, 1, 1, 2}, l = {322, 348, 505}, m = "readAndInit", n = {"updateLock", "initData", "updateLock", "initData", "initializationComplete", "$this$withLock_u24default$iv"}, s = {"L$1", "L$2", "L$1", "L$2", "L$3", "L$3"})
    public static final class C11901 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SingleProcessDataStore<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11901(SingleProcessDataStore<T> singleProcessDataStore, Continuation<? super C11901> continuation) {
            super(continuation);
            this.this$0 = singleProcessDataStore;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.readAndInit(this);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    @DebugMetadata(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", i = {0}, l = {302}, m = "readAndInitOrPropagateAndThrowFailure", n = {"this"}, s = {"L$0"})
    public static final class C11911 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SingleProcessDataStore<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11911(SingleProcessDataStore<T> singleProcessDataStore, Continuation<? super C11911> continuation) {
            super(continuation);
            this.this$0 = singleProcessDataStore;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.readAndInitOrPropagateAndThrowFailure(this);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.SingleProcessDataStore$readAndInitOrPropagateFailure$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    @DebugMetadata(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", i = {0}, l = {311}, m = "readAndInitOrPropagateFailure", n = {"this"}, s = {"L$0"})
    public static final class C11921 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SingleProcessDataStore<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11921(SingleProcessDataStore<T> singleProcessDataStore, Continuation<? super C11921> continuation) {
            super(continuation);
            this.this$0 = singleProcessDataStore;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.readAndInitOrPropagateFailure(this);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.SingleProcessDataStore$readData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    @DebugMetadata(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", i = {0}, l = {381}, m = "readData", n = {"this"}, s = {"L$0"})
    public static final class C11931 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SingleProcessDataStore<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11931(SingleProcessDataStore<T> singleProcessDataStore, Continuation<? super C11931> continuation) {
            super(continuation);
            this.this$0 = singleProcessDataStore;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.readData(this);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.SingleProcessDataStore$readDataOrHandleCorruption$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    @DebugMetadata(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", i = {0, 1, 2, 2}, l = {359, 362, 365}, m = "readDataOrHandleCorruption", n = {"this", "ex", "ex", "newData"}, s = {"L$0", "L$1", "L$0", "L$1"})
    public static final class C11941 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SingleProcessDataStore<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11941(SingleProcessDataStore<T> singleProcessDataStore, Continuation<? super C11941> continuation) {
            super(continuation);
            this.this$0 = singleProcessDataStore;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.readDataOrHandleCorruption(this);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.SingleProcessDataStore$transformAndWrite$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    @DebugMetadata(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", i = {0, 0, 0}, l = {402, 410}, m = "transformAndWrite", n = {"this", "curDataAndHash", "curData"}, s = {"L$0", "L$1", "L$2"})
    public static final class C11951 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SingleProcessDataStore<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11951(SingleProcessDataStore<T> singleProcessDataStore, Continuation<? super C11951> continuation) {
            super(continuation);
            this.this$0 = singleProcessDataStore;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.transformAndWrite(null, null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SingleProcessDataStore(@NotNull Function0<? extends File> produceFile, @NotNull Serializer<T> serializer, @NotNull List<? extends Function2<? super InitializerApi<T>, ? super Continuation<? super Unit>, ? extends Object>> initTasksList, @NotNull CorruptionHandler<T> corruptionHandler, @NotNull CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(initTasksList, "initTasksList");
        Intrinsics.checkNotNullParameter(corruptionHandler, "corruptionHandler");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.produceFile = produceFile;
        this.serializer = serializer;
        this.corruptionHandler = corruptionHandler;
        this.scope = scope;
        this.data = FlowKt.flow(new SingleProcessDataStore$data$1(this, null));
        this.SCRATCH_SUFFIX = ".tmp";
        this.file = LazyKt__LazyJVMKt.lazy(new Function0<File>(this) { // from class: androidx.datastore.core.SingleProcessDataStore$file$2
            final /* synthetic */ SingleProcessDataStore<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final File invoke() {
                File file = (File) ((SingleProcessDataStore) this.this$0).produceFile.invoke();
                String it = file.getAbsolutePath();
                SingleProcessDataStore.Companion companion = SingleProcessDataStore.INSTANCE;
                synchronized (companion.getActiveFilesLock$datastore_core()) {
                    if (!(!companion.getActiveFiles$datastore_core().contains(it))) {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + file + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                    Set<String> activeFiles$datastore_core = companion.getActiveFiles$datastore_core();
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    activeFiles$datastore_core.add(it);
                }
                return file;
            }
        });
        this.downstreamFlow = StateFlowKt.MutableStateFlow(UnInitialized.INSTANCE);
        this.initTasks = CollectionsKt___CollectionsKt.toList(initTasksList);
        this.actor = new SimpleActor<>(scope, new Function1<Throwable, Unit>(this) { // from class: androidx.datastore.core.SingleProcessDataStore$actor$1
            final /* synthetic */ SingleProcessDataStore<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit invoke2(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable Throwable th) {
                if (th != null) {
                    ((SingleProcessDataStore) this.this$0).downstreamFlow.setValue(new Final(th));
                }
                SingleProcessDataStore.Companion companion = SingleProcessDataStore.INSTANCE;
                Object activeFilesLock$datastore_core = companion.getActiveFilesLock$datastore_core();
                SingleProcessDataStore<T> singleProcessDataStore = this.this$0;
                synchronized (activeFilesLock$datastore_core) {
                    companion.getActiveFiles$datastore_core().remove(singleProcessDataStore.getFile().getAbsolutePath());
                    Unit unit = Unit.INSTANCE;
                }
            }
        }, new Function2<Message<T>, Throwable, Unit>() { // from class: androidx.datastore.core.SingleProcessDataStore$actor$2
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Object obj, Throwable th) {
                invoke((SingleProcessDataStore.Message) obj, th);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull SingleProcessDataStore.Message<T> msg, @Nullable Throwable th) {
                Intrinsics.checkNotNullParameter(msg, "msg");
                if (msg instanceof SingleProcessDataStore.Message.Update) {
                    CompletableDeferred<T> ack = ((SingleProcessDataStore.Message.Update) msg).getAck();
                    if (th == null) {
                        th = new CancellationException("DataStore scope was cancelled before updateData could complete");
                    }
                    ack.completeExceptionally(th);
                }
            }
        }, new SingleProcessDataStore$actor$3(this, null));
    }

    private final void createParentDirectories(File file) throws IOException {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (!parentFile.isDirectory()) {
            throw new IOException(Intrinsics.stringPlus("Unable to create parent directories of ", file));
        }
    }

    private static /* synthetic */ void getDownstreamFlow$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File getFile() {
        return (File) this.file.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handleRead(Message.Read<T> read, Continuation<? super Unit> continuation) {
        State<T> value = this.downstreamFlow.getValue();
        if (!(value instanceof Data)) {
            if (value instanceof ReadException) {
                if (value == read.getLastState()) {
                    Object andInitOrPropagateFailure = readAndInitOrPropagateFailure(continuation);
                    return andInitOrPropagateFailure == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? andInitOrPropagateFailure : Unit.INSTANCE;
                }
            } else {
                if (Intrinsics.areEqual(value, UnInitialized.INSTANCE)) {
                    Object andInitOrPropagateFailure2 = readAndInitOrPropagateFailure(continuation);
                    return andInitOrPropagateFailure2 == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? andInitOrPropagateFailure2 : Unit.INSTANCE;
                }
                if (value instanceof Final) {
                    throw new IllegalStateException("Can't read in final state.".toString());
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [androidx.datastore.core.SingleProcessDataStore] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r8v0, types: [androidx.datastore.core.SingleProcessDataStore, androidx.datastore.core.SingleProcessDataStore<T>, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [androidx.datastore.core.SingleProcessDataStore$Message$Update, androidx.datastore.core.SingleProcessDataStore$Message$Update<T>, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15, types: [androidx.datastore.core.SingleProcessDataStore$Message$Update] */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r9v32 */
    /* JADX WARN: Type inference failed for: r9v33 */
    /* JADX WARN: Type inference failed for: r9v34 */
    /* JADX WARN: Type inference failed for: r9v35 */
    /* JADX WARN: Type inference failed for: r9v36 */
    /* JADX WARN: Type inference failed for: r9v6 */
    public final Object handleUpdate(Message.Update<T> update, Continuation<? super Unit> continuation) {
        AnonymousClass1 anonymousClass1;
        Object objM886constructorimpl;
        ?? r9;
        CompletableDeferred ack;
        ?? r2;
        Object objTransformAndWrite;
        ?? r10;
        CompletableDeferred completableDeferred;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(this, continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(this, continuation);
        }
        Object obj = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    completableDeferred = (CompletableDeferred) anonymousClass1.L$0;
                } else if (i2 == 2) {
                    CompletableDeferred completableDeferred2 = (CompletableDeferred) anonymousClass1.L$2;
                    SingleProcessDataStore singleProcessDataStore = (SingleProcessDataStore) anonymousClass1.L$1;
                    Message.Update update2 = (Message.Update) anonymousClass1.L$0;
                    ResultKt.throwOnFailure(obj);
                    ack = completableDeferred2;
                    r2 = singleProcessDataStore;
                    r10 = (Message.Update<T>) update2;
                } else {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    completableDeferred = (Message.Update<T>) ((CompletableDeferred) anonymousClass1.L$0);
                }
                ResultKt.throwOnFailure(obj);
                update = completableDeferred;
                objM886constructorimpl = Result.m886constructorimpl(obj);
                r9 = update;
                CompletableDeferredKt.completeWith(r9, objM886constructorimpl);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            ack = update.getAck();
            try {
                Result.Companion companion = Result.Companion;
                State<T> value = this.downstreamFlow.getValue();
                if (value instanceof Data) {
                    Function2 transform = update.getTransform();
                    CoroutineContext callerContext = update.getCallerContext();
                    anonymousClass1.L$0 = ack;
                    anonymousClass1.label = 1;
                    objTransformAndWrite = transformAndWrite(transform, callerContext, anonymousClass1);
                    if (objTransformAndWrite == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (!(value instanceof ReadException) && !(value instanceof UnInitialized)) {
                        if (value instanceof Final) {
                            throw ((Final) value).getFinalException();
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    if (value != update.getLastState()) {
                        throw ((ReadException) value).getReadException();
                    }
                    anonymousClass1.L$0 = update;
                    anonymousClass1.L$1 = this;
                    anonymousClass1.L$2 = ack;
                    anonymousClass1.label = 2;
                    if (readAndInitOrPropagateAndThrowFailure(anonymousClass1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    r2 = this;
                    r10 = update;
                }
                CompletableDeferred completableDeferred3 = ack;
                obj = objTransformAndWrite;
                update = completableDeferred3;
                objM886constructorimpl = Result.m886constructorimpl(obj);
                r9 = update;
            } catch (Throwable th) {
                th = th;
                update = ack;
                Result.Companion companion2 = Result.Companion;
                objM886constructorimpl = Result.m886constructorimpl(ResultKt.createFailure(th));
                r9 = update;
            }
            CompletableDeferredKt.completeWith(r9, objM886constructorimpl);
            return Unit.INSTANCE;
            Function2 transform2 = r10.getTransform();
            CoroutineContext callerContext2 = r10.getCallerContext();
            anonymousClass1.L$0 = ack;
            anonymousClass1.L$1 = null;
            anonymousClass1.L$2 = null;
            anonymousClass1.label = 3;
            objTransformAndWrite = r2.transformAndWrite(transform2, callerContext2, anonymousClass1);
            if (objTransformAndWrite == coroutine_suspended) {
                return coroutine_suspended;
            }
            CompletableDeferred completableDeferred4 = ack;
            obj = objTransformAndWrite;
            update = completableDeferred4;
            objM886constructorimpl = Result.m886constructorimpl(obj);
            r9 = update;
        } catch (Throwable th2) {
            th = th2;
        }
        CompletableDeferredKt.completeWith(r9, objM886constructorimpl);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:36:0x00de  */
    /* JADX WARN: Code duplicated, block: B:42:0x0114 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:43:0x0115  */
    /* JADX WARN: Code duplicated, block: B:47:0x0126  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:? A[LOOP:0: B:34:0x00d8->B:60:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [androidx.datastore.core.SingleProcessDataStore, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [androidx.datastore.core.SingleProcessDataStore] */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [androidx.datastore.core.SingleProcessDataStore] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r13v0, types: [androidx.datastore.core.SingleProcessDataStore, androidx.datastore.core.SingleProcessDataStore<T>, java.lang.Object] */
    public final Object readAndInit(Continuation<? super Unit> continuation) {
        C11901 c11901;
        Mutex mutexMutex$default;
        Ref.ObjectRef objectRef;
        ?? r10;
        Ref.ObjectRef objectRef2;
        ?? r12;
        Ref.ObjectRef objectRef3;
        SingleProcessDataStore$readAndInit$api$1 singleProcessDataStore$readAndInit$api$1;
        Iterator<T> it;
        Mutex mutex;
        Ref.BooleanRef booleanRef;
        Ref.BooleanRef booleanRef2;
        ?? r0;
        Ref.ObjectRef objectRef4;
        Mutex mutex2;
        Function2 function2;
        ?? r1;
        if (continuation instanceof C11901) {
            c11901 = (C11901) continuation;
            int i = c11901.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c11901.label = i - Integer.MIN_VALUE;
            } else {
                c11901 = new C11901(this, continuation);
            }
        } else {
            c11901 = new C11901(this, continuation);
        }
        T t = (T) c11901.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c11901.label;
        if (i2 != 0) {
            if (i2 == 1) {
                objectRef = (Ref.ObjectRef) c11901.L$3;
                objectRef2 = (Ref.ObjectRef) c11901.L$2;
                mutexMutex$default = (Mutex) c11901.L$1;
                SingleProcessDataStore singleProcessDataStore = (SingleProcessDataStore) c11901.L$0;
                ResultKt.throwOnFailure(t);
                r10 = singleProcessDataStore;
            } else if (i2 == 2) {
                it = (Iterator) c11901.L$5;
                singleProcessDataStore$readAndInit$api$1 = (SingleProcessDataStore$readAndInit$api$1) c11901.L$4;
                booleanRef = (Ref.BooleanRef) c11901.L$3;
                objectRef3 = (Ref.ObjectRef) c11901.L$2;
                mutex = (Mutex) c11901.L$1;
                SingleProcessDataStore singleProcessDataStore2 = (SingleProcessDataStore) c11901.L$0;
                ResultKt.throwOnFailure(t);
                r12 = singleProcessDataStore2;
                while (it.hasNext()) {
                    function2 = (Function2) it.next();
                    c11901.L$0 = r12;
                    c11901.L$1 = mutex;
                    c11901.L$2 = objectRef3;
                    c11901.L$3 = booleanRef;
                    c11901.L$4 = singleProcessDataStore$readAndInit$api$1;
                    c11901.L$5 = it;
                    c11901.label = 2;
                    if (function2.invoke(singleProcessDataStore$readAndInit$api$1, c11901) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                booleanRef2 = booleanRef;
                objectRef2 = objectRef3;
                mutexMutex$default = mutex;
                r0 = r12;
                r0.initTasks = null;
                c11901.L$0 = r0;
                c11901.L$1 = objectRef2;
                c11901.L$2 = booleanRef2;
                c11901.L$3 = mutexMutex$default;
                c11901.L$4 = null;
                c11901.L$5 = null;
                c11901.label = 3;
                if (mutexMutex$default.lock(null, c11901) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                objectRef4 = objectRef2;
                mutex2 = mutexMutex$default;
                r1 = r0;
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutex2 = (Mutex) c11901.L$3;
                booleanRef2 = (Ref.BooleanRef) c11901.L$2;
                objectRef4 = (Ref.ObjectRef) c11901.L$1;
                SingleProcessDataStore singleProcessDataStore3 = (SingleProcessDataStore) c11901.L$0;
                ResultKt.throwOnFailure(t);
                r1 = singleProcessDataStore3;
            }
            try {
                booleanRef2.element = true;
                Unit unit = Unit.INSTANCE;
                mutex2.unlock(null);
                MutableStateFlow<State<T>> mutableStateFlow = r1.downstreamFlow;
                T t2 = objectRef4.element;
                mutableStateFlow.setValue(new Data(t2, t2 != null ? t2.hashCode() : 0));
                return Unit.INSTANCE;
            } catch (Throwable th) {
                mutex2.unlock(null);
                throw th;
            }
        }
        ResultKt.throwOnFailure(t);
        if (!(Intrinsics.areEqual(this.downstreamFlow.getValue(), UnInitialized.INSTANCE) || (this.downstreamFlow.getValue() instanceof ReadException))) {
            throw new IllegalStateException("Check failed.".toString());
        }
        mutexMutex$default = MutexKt.Mutex$default(false, 1, null);
        objectRef = new Ref.ObjectRef();
        c11901.L$0 = this;
        c11901.L$1 = mutexMutex$default;
        c11901.L$2 = objectRef;
        c11901.L$3 = objectRef;
        c11901.label = 1;
        t = (T) readDataOrHandleCorruption(c11901);
        if (t == coroutine_suspended) {
            return coroutine_suspended;
        }
        r10 = this;
        objectRef2 = objectRef;
        objectRef.element = t;
        Ref.BooleanRef booleanRef3 = new Ref.BooleanRef();
        SingleProcessDataStore$readAndInit$api$1 singleProcessDataStore$readAndInit$api$2 = new SingleProcessDataStore$readAndInit$api$1(mutexMutex$default, booleanRef3, objectRef2, r10);
        List<? extends Function2<? super InitializerApi<T>, ? super Continuation<? super Unit>, ? extends Object>> list = r10.initTasks;
        if (list == null) {
            booleanRef2 = booleanRef3;
            r0 = r10;
        } else {
            r12 = r10;
            objectRef3 = objectRef2;
            singleProcessDataStore$readAndInit$api$1 = singleProcessDataStore$readAndInit$api$2;
            it = list.iterator();
            mutex = mutexMutex$default;
            booleanRef = booleanRef3;
            while (it.hasNext()) {
                function2 = (Function2) it.next();
                c11901.L$0 = r12;
                c11901.L$1 = mutex;
                c11901.L$2 = objectRef3;
                c11901.L$3 = booleanRef;
                c11901.L$4 = singleProcessDataStore$readAndInit$api$1;
                c11901.L$5 = it;
                c11901.label = 2;
                if (function2.invoke(singleProcessDataStore$readAndInit$api$1, c11901) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            booleanRef2 = booleanRef;
            objectRef2 = objectRef3;
            mutexMutex$default = mutex;
            r0 = r12;
        }
        r0.initTasks = null;
        c11901.L$0 = r0;
        c11901.L$1 = objectRef2;
        c11901.L$2 = booleanRef2;
        c11901.L$3 = mutexMutex$default;
        c11901.L$4 = null;
        c11901.L$5 = null;
        c11901.label = 3;
        if (mutexMutex$default.lock(null, c11901) == coroutine_suspended) {
            return coroutine_suspended;
        }
        objectRef4 = objectRef2;
        mutex2 = mutexMutex$default;
        r1 = r0;
        booleanRef2.element = true;
        Unit unit2 = Unit.INSTANCE;
        mutex2.unlock(null);
        MutableStateFlow<State<T>> mutableStateFlow2 = r1.downstreamFlow;
        T t3 = objectRef4.element;
        mutableStateFlow2.setValue(new Data(t3, t3 != null ? t3.hashCode() : 0));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object readAndInitOrPropagateAndThrowFailure(Continuation<? super Unit> continuation) throws Throwable {
        C11911 c11911;
        SingleProcessDataStore singleProcessDataStore;
        if (continuation instanceof C11911) {
            c11911 = (C11911) continuation;
            int i = c11911.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c11911.label = i - Integer.MIN_VALUE;
            } else {
                c11911 = new C11911(this, continuation);
            }
        } else {
            c11911 = new C11911(this, continuation);
        }
        Object obj = c11911.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c11911.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            singleProcessDataStore = (SingleProcessDataStore) c11911.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                th = th;
                singleProcessDataStore.downstreamFlow.setValue(new ReadException(th));
                throw th;
            }
        }
        ResultKt.throwOnFailure(obj);
        try {
            c11911.L$0 = this;
            c11911.label = 1;
            if (readAndInit(c11911) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            th = th2;
            singleProcessDataStore = this;
            singleProcessDataStore.downstreamFlow.setValue(new ReadException(th));
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object readAndInitOrPropagateFailure(Continuation<? super Unit> continuation) {
        C11921 c11921;
        SingleProcessDataStore singleProcessDataStore;
        if (continuation instanceof C11921) {
            c11921 = (C11921) continuation;
            int i = c11921.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c11921.label = i - Integer.MIN_VALUE;
            } else {
                c11921 = new C11921(this, continuation);
            }
        } else {
            c11921 = new C11921(this, continuation);
        }
        Object obj = c11921.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c11921.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                c11921.L$0 = this;
                c11921.label = 1;
                if (readAndInit(c11921) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (Throwable th) {
                th = th;
                singleProcessDataStore = this;
                singleProcessDataStore.downstreamFlow.setValue(new ReadException(th));
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            singleProcessDataStore = (SingleProcessDataStore) c11921.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable th2) {
                th = th2;
                singleProcessDataStore.downstreamFlow.setValue(new ReadException(th));
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [androidx.datastore.core.SingleProcessDataStore] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.datastore.core.SingleProcessDataStore$readData$1, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.datastore.core.SingleProcessDataStore] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.FileInputStream, java.io.InputStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r6v9, types: [androidx.datastore.core.Serializer, androidx.datastore.core.Serializer<T>] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Object readData(Continuation<? super T> continuation) throws FileNotFoundException {
        ?? c11931;
        ?? fileInputStream;
        Throwable th;
        ?? r2;
        if (continuation instanceof C11931) {
            C11931 c11932 = (C11931) continuation;
            int i = c11932.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c11932.label = i - Integer.MIN_VALUE;
                c11931 = c11932;
            } else {
                c11931 = new C11931(this, continuation);
            }
        } else {
            c11931 = new C11931(this, continuation);
        }
        Object from = c11931.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c11931.label;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th = (Throwable) c11931.L$2;
                fileInputStream = (Closeable) c11931.L$1;
                c11931 = (SingleProcessDataStore) c11931.L$0;
                try {
                    ResultKt.throwOnFailure(from);
                    r2 = fileInputStream;
                    CloseableKt.closeFinally(r2, th);
                    return from;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        throw th;
                    } catch (Throwable th3) {
                        CloseableKt.closeFinally(fileInputStream, th);
                        throw th3;
                    }
                }
            }
            ResultKt.throwOnFailure(from);
            try {
                fileInputStream = new FileInputStream(getFile());
                try {
                    Serializer<T> serializer = this.serializer;
                    c11931.L$0 = this;
                    c11931.L$1 = fileInputStream;
                    c11931.L$2 = null;
                    c11931.label = 1;
                    from = serializer.readFrom(fileInputStream, c11931);
                    if (from == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    th = null;
                    r2 = fileInputStream;
                    CloseableKt.closeFinally(r2, th);
                    return from;
                } catch (Throwable th4) {
                    th = th4;
                    c11931 = this;
                    throw th;
                }
            } catch (FileNotFoundException e) {
                e = e;
                c11931 = this;
                if (c11931.getFile().exists()) {
                    throw e;
                }
                return c11931.serializer.getDefaultValue();
            }
        } catch (FileNotFoundException e2) {
            e = e2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:35:0x0074 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x0075  */
    /* JADX WARN: Code duplicated, block: B:39:0x0085 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x0086  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.datastore.core.SingleProcessDataStore, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [androidx.datastore.core.SingleProcessDataStore] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [androidx.datastore.core.SingleProcessDataStore] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r7v0, types: [androidx.datastore.core.SingleProcessDataStore, androidx.datastore.core.SingleProcessDataStore<T>, java.lang.Object] */
    public final Object readDataOrHandleCorruption(Continuation<? super T> continuation) throws CorruptionException, FileNotFoundException {
        C11941 c11941;
        ?? r2;
        Object objHandleCorruption;
        CorruptionException corruptionException;
        ?? r4;
        CorruptionException corruptionException2;
        if (continuation instanceof C11941) {
            c11941 = (C11941) continuation;
            int i = c11941.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c11941.label = i - Integer.MIN_VALUE;
            } else {
                c11941 = new C11941(this, continuation);
            }
        } else {
            c11941 = new C11941(this, continuation);
        }
        Object data = c11941.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c11941.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(data);
            try {
                c11941.L$0 = this;
                c11941.label = 1;
                data = readData(c11941);
                return data == coroutine_suspended ? coroutine_suspended : data;
            } catch (CorruptionException e) {
                e = e;
                r2 = this;
                CorruptionHandler<T> corruptionHandler = r2.corruptionHandler;
                c11941.L$0 = r2;
                c11941.L$1 = e;
                c11941.label = 2;
                objHandleCorruption = corruptionHandler.handleCorruption(e, c11941);
                if (objHandleCorruption == coroutine_suspended) {
                    return coroutine_suspended;
                }
                ?? r6 = r2;
                corruptionException = e;
                data = objHandleCorruption;
                r4 = r6;
                c11941.L$0 = corruptionException;
                c11941.L$1 = data;
                c11941.label = 3;
                if (r4.writeData$datastore_core(data, c11941) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return data;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                corruptionException = (CorruptionException) c11941.L$1;
                SingleProcessDataStore singleProcessDataStore = (SingleProcessDataStore) c11941.L$0;
                ResultKt.throwOnFailure(data);
                r4 = singleProcessDataStore;
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Object obj = c11941.L$1;
                corruptionException2 = (CorruptionException) c11941.L$0;
                try {
                    ResultKt.throwOnFailure(data);
                    return obj;
                } catch (IOException e2) {
                    e = e2;
                }
            }
            ExceptionsKt__ExceptionsKt.addSuppressed(corruptionException2, e);
            throw corruptionException2;
        }
        r2 = (SingleProcessDataStore) c11941.L$0;
        try {
            ResultKt.throwOnFailure(data);
        } catch (CorruptionException e3) {
            e = e3;
            CorruptionHandler<T> corruptionHandler2 = r2.corruptionHandler;
            c11941.L$0 = r2;
            c11941.L$1 = e;
            c11941.label = 2;
            objHandleCorruption = corruptionHandler2.handleCorruption(e, c11941);
            if (objHandleCorruption == coroutine_suspended) {
                return coroutine_suspended;
            }
            ?? r7 = r2;
            corruptionException = e;
            data = objHandleCorruption;
            r4 = r7;
            c11941.L$0 = corruptionException;
            c11941.L$1 = data;
            c11941.label = 3;
            if (r4.writeData$datastore_core(data, c11941) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return data;
        }
        try {
            c11941.L$0 = corruptionException;
            c11941.L$1 = data;
            c11941.label = 3;
            if (r4.writeData$datastore_core(data, c11941) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return data;
        } catch (IOException e4) {
            e = e4;
            corruptionException2 = corruptionException;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:29:0x0094  */
    /* JADX WARN: Code duplicated, block: B:30:0x0099  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object transformAndWrite(Function2<? super T, ? super Continuation<? super T>, ? extends Object> function2, CoroutineContext coroutineContext, Continuation<? super T> continuation) {
        C11951 c11951;
        Data data;
        Object obj;
        SingleProcessDataStore singleProcessDataStore;
        SingleProcessDataStore singleProcessDataStore2;
        int iHashCode;
        if (continuation instanceof C11951) {
            c11951 = (C11951) continuation;
            int i = c11951.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c11951.label = i - Integer.MIN_VALUE;
            } else {
                c11951 = new C11951(this, continuation);
            }
        } else {
            c11951 = new C11951(this, continuation);
        }
        Object obj2 = c11951.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c11951.label;
        if (i2 != 0) {
            if (i2 == 1) {
                obj = c11951.L$2;
                data = (Data) c11951.L$1;
                SingleProcessDataStore singleProcessDataStore3 = (SingleProcessDataStore) c11951.L$0;
                ResultKt.throwOnFailure(obj2);
                singleProcessDataStore = singleProcessDataStore3;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj = c11951.L$1;
                SingleProcessDataStore singleProcessDataStore4 = (SingleProcessDataStore) c11951.L$0;
                ResultKt.throwOnFailure(obj2);
                singleProcessDataStore2 = singleProcessDataStore4;
            }
            MutableStateFlow<State<T>> mutableStateFlow = singleProcessDataStore2.downstreamFlow;
            if (obj != null) {
                iHashCode = obj.hashCode();
            } else {
                iHashCode = 0;
            }
            mutableStateFlow.setValue(new Data(obj, iHashCode));
            return obj;
        }
        ResultKt.throwOnFailure(obj2);
        Data data2 = (Data) this.downstreamFlow.getValue();
        data2.checkHashCode();
        Object value = data2.getValue();
        SingleProcessDataStore$transformAndWrite$newData$1 singleProcessDataStore$transformAndWrite$newData$1 = new SingleProcessDataStore$transformAndWrite$newData$1(function2, value, null);
        c11951.L$0 = this;
        c11951.L$1 = data2;
        c11951.L$2 = value;
        c11951.label = 1;
        Object objWithContext = BuildersKt.withContext(coroutineContext, singleProcessDataStore$transformAndWrite$newData$1, c11951);
        if (objWithContext == coroutine_suspended) {
            return coroutine_suspended;
        }
        data = data2;
        obj2 = objWithContext;
        obj = value;
        singleProcessDataStore = this;
        data.checkHashCode();
        if (!Intrinsics.areEqual(obj, obj2)) {
            c11951.L$0 = singleProcessDataStore;
            c11951.L$1 = obj2;
            c11951.L$2 = null;
            c11951.label = 2;
            if (singleProcessDataStore.writeData$datastore_core(obj2, c11951) == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj = obj2;
            singleProcessDataStore2 = singleProcessDataStore;
            MutableStateFlow<State<T>> mutableStateFlow2 = singleProcessDataStore2.downstreamFlow;
            if (obj != null) {
                iHashCode = obj.hashCode();
            } else {
                iHashCode = 0;
            }
            mutableStateFlow2.setValue(new Data(obj, iHashCode));
        }
        return obj;
    }

    @Override // androidx.datastore.core.DataStore
    @NotNull
    public Flow<T> getData() {
        return this.data;
    }

    @Override // androidx.datastore.core.DataStore
    @Nullable
    public Object updateData(@NotNull Function2<? super T, ? super Continuation<? super T>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) {
        CompletableDeferred completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        this.actor.offer(new Message.Update(function2, completableDeferredCompletableDeferred$default, this.downstreamFlow.getValue(), continuation.getContext()));
        return completableDeferredCompletableDeferred$default.await(continuation);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.FileOutputStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.io.File, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.io.File, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.StringBuilder] */
    @Nullable
    public final Object writeData$datastore_core(T t, @NotNull Continuation<? super Unit> continuation) throws IOException {
        SingleProcessDataStore$writeData$1 singleProcessDataStore$writeData$1;
        ?? file;
        ?? fileOutputStream;
        SingleProcessDataStore<T> singleProcessDataStore;
        ?? r8;
        Throwable th;
        if (continuation instanceof SingleProcessDataStore$writeData$1) {
            singleProcessDataStore$writeData$1 = (SingleProcessDataStore$writeData$1) continuation;
            int i = singleProcessDataStore$writeData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                singleProcessDataStore$writeData$1.label = i - Integer.MIN_VALUE;
            } else {
                singleProcessDataStore$writeData$1 = new SingleProcessDataStore$writeData$1(this, continuation);
            }
        } else {
            singleProcessDataStore$writeData$1 = new SingleProcessDataStore$writeData$1(this, continuation);
        }
        Object obj = singleProcessDataStore$writeData$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = singleProcessDataStore$writeData$1.label;
        ?? r3 = 1;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                createParentDirectories(getFile());
                file = new File(Intrinsics.stringPlus(getFile().getAbsolutePath(), this.SCRATCH_SUFFIX));
                try {
                    fileOutputStream = new FileOutputStream((File) file);
                    try {
                        Serializer<T> serializer = this.serializer;
                        UncloseableOutputStream uncloseableOutputStream = new UncloseableOutputStream(fileOutputStream);
                        singleProcessDataStore$writeData$1.L$0 = this;
                        singleProcessDataStore$writeData$1.L$1 = file;
                        singleProcessDataStore$writeData$1.L$2 = fileOutputStream;
                        singleProcessDataStore$writeData$1.L$3 = null;
                        singleProcessDataStore$writeData$1.L$4 = fileOutputStream;
                        singleProcessDataStore$writeData$1.label = 1;
                        if (serializer.writeTo(t, uncloseableOutputStream, singleProcessDataStore$writeData$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        singleProcessDataStore = this;
                        r3 = file;
                        r8 = fileOutputStream;
                        th = null;
                        fileOutputStream = fileOutputStream;
                    } catch (Throwable th2) {
                        th = th2;
                        r3 = file;
                        throw th;
                    }
                } catch (IOException e) {
                    e = e;
                    if (file.exists()) {
                        file.delete();
                    }
                    throw e;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                FileOutputStream fileOutputStream2 = (FileOutputStream) singleProcessDataStore$writeData$1.L$4;
                th = (Throwable) singleProcessDataStore$writeData$1.L$3;
                fileOutputStream = (Closeable) singleProcessDataStore$writeData$1.L$2;
                r3 = (File) singleProcessDataStore$writeData$1.L$1;
                singleProcessDataStore = (SingleProcessDataStore) singleProcessDataStore$writeData$1.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    fileOutputStream = fileOutputStream;
                    r3 = r3;
                    r8 = fileOutputStream2;
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        throw th;
                    } catch (Throwable th4) {
                        CloseableKt.closeFinally(fileOutputStream, th);
                        throw th4;
                    }
                }
            }
            r8.getFD().sync();
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(fileOutputStream, th);
            if (r3.renameTo(singleProcessDataStore.getFile())) {
                return Unit.INSTANCE;
            }
            throw new IOException("Unable to rename " + r3 + ".This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
        } catch (IOException e2) {
            e = e2;
            file = r3;
            if (file.exists()) {
                file.delete();
            }
            throw e;
        }
    }

    public /* synthetic */ SingleProcessDataStore(Function0 function0, Serializer serializer, List list, CorruptionHandler corruptionHandler, CoroutineScope coroutineScope, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, serializer, (i & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 8) != 0 ? new NoOpCorruptionHandler() : corruptionHandler, (i & 16) != 0 ? CoroutineScopeKt.CoroutineScope(Dispatchers.getIO().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null))) : coroutineScope);
    }
}
