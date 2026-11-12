package com.facebook;

import android.os.Handler;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.watch.companion.event.WatchFaceArrivingEvent;
import com.huami.watch.notification.TransportUri;
import com.tekartik.sqflite.Constant;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0017\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\u0018\u0000 D2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003EDFB\t\b\u0016¢\u0006\u0004\b=\u0010>B\u0017\b\u0016\u0012\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00020?¢\u0006\u0004\b=\u0010@B\u001d\b\u0016\u0012\u0012\u0010-\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020A\"\u00020\u0002¢\u0006\u0004\b=\u0010BB\u0011\b\u0016\u0012\u0006\u0010-\u001a\u00020\u0000¢\u0006\u0004\b=\u0010CJ\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bJ\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u0018\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u0002H\u0016J\b\u0010\u0012\u001a\u00020\nH\u0016J\u0011\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0096\u0002J\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0019\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u0002H\u0096\u0002J\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003J\u0006\u0010\u0017\u001a\u00020\u0006R$\u0010\u001e\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u001fR\u0019\u0010&\u001a\u00020!8\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R0\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00020'2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00020'8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R0\u00100\u001a\b\u0012\u0004\u0012\u00020\b0'2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\b0'8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b.\u0010*\u001a\u0004\b/\u0010,R$\u00105\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010#\u001a\u0004\b2\u0010%\"\u0004\b3\u00104R$\u0010:\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u00108F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u0016\u0010<\u001a\u00020\u00108V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u00107¨\u0006G"}, d2 = {"Lcom/facebook/GraphRequestBatch;", "Ljava/util/AbstractList;", "Lcom/facebook/GraphRequest;", "", "Lcom/facebook/GraphResponse;", "a", "Lcom/facebook/GraphRequestAsyncTask;", "b", "Lcom/facebook/GraphRequestBatch$Callback;", "callback", "", "addCallback", "removeCallback", "element", "", TransportUri.ACTION_ADD, "", "index", "clear", "get", "removeAt", WatchFaceArrivingEvent.CMD_SET, "executeAndWait", "executeAsync", "Landroid/os/Handler;", "Landroid/os/Handler;", "getCallbackHandler", "()Landroid/os/Handler;", "setCallbackHandler", "(Landroid/os/Handler;)V", "callbackHandler", LogUtil.I, "timeoutInMilliseconds", "", "c", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "", "<set-?>", GoogleApiAvailabilityLight.a, "Ljava/util/List;", "getRequests", "()Ljava/util/List;", "requests", "e", "getCallbacks", "callbacks", "f", "getBatchApplicationId", "setBatchApplicationId", "(Ljava/lang/String;)V", "batchApplicationId", "getTimeout", "()I", "setTimeout", "(I)V", "timeout", "getSize", "size", "<init>", "()V", "", "(Ljava/util/Collection;)V", "", "([Lcom/facebook/GraphRequest;)V", "(Lcom/facebook/GraphRequestBatch;)V", "Companion", "Callback", "OnProgressCallback", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class GraphRequestBatch extends AbstractList<GraphRequest> {
    private static final AtomicInteger g = new AtomicInteger();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private Handler callbackHandler;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int timeoutInMilliseconds;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private List<GraphRequest> requests;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private List<Callback> callbacks;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private String batchApplicationId;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/facebook/GraphRequestBatch$Callback;", "", "Lcom/facebook/GraphRequestBatch;", Constant.METHOD_BATCH, "", "onBatchCompleted", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public interface Callback {
        void onBatchCompleted(@NotNull GraphRequestBatch batch);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H&¨\u0006\t"}, d2 = {"Lcom/facebook/GraphRequestBatch$OnProgressCallback;", "Lcom/facebook/GraphRequestBatch$Callback;", "Lcom/facebook/GraphRequestBatch;", Constant.METHOD_BATCH, "", "current", "max", "", "onBatchProgress", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public interface OnProgressCallback extends Callback {
        void onBatchProgress(@NotNull GraphRequestBatch batch, long current, long max);
    }

    public GraphRequestBatch() {
        this.id = String.valueOf(g.incrementAndGet());
        this.callbacks = new ArrayList();
        this.requests = new ArrayList();
    }

    private final List<GraphResponse> a() {
        return GraphRequest.INSTANCE.executeBatchAndWait(this);
    }

    private final GraphRequestAsyncTask b() {
        return GraphRequest.INSTANCE.executeBatchAsync(this);
    }

    public final void addCallback(@NotNull Callback callback) {
        if (this.callbacks.contains(callback)) {
            return;
        }
        this.callbacks.add(callback);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.requests.clear();
    }

    public /* bridge */ boolean contains(GraphRequest graphRequest) {
        return super.contains((Object) graphRequest);
    }

    @NotNull
    public final List<GraphResponse> executeAndWait() {
        return a();
    }

    @NotNull
    public final GraphRequestAsyncTask executeAsync() {
        return b();
    }

    @Nullable
    public final String getBatchApplicationId() {
        return this.batchApplicationId;
    }

    @Nullable
    public final Handler getCallbackHandler() {
        return this.callbackHandler;
    }

    @NotNull
    public final List<Callback> getCallbacks() {
        return this.callbacks;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final List<GraphRequest> getRequests() {
        return this.requests;
    }

    public int getSize() {
        return this.requests.size();
    }

    /* JADX INFO: renamed from: getTimeout, reason: from getter */
    public final int getTimeoutInMilliseconds() {
        return this.timeoutInMilliseconds;
    }

    public /* bridge */ int indexOf(GraphRequest graphRequest) {
        return super.indexOf((Object) graphRequest);
    }

    public /* bridge */ int lastIndexOf(GraphRequest graphRequest) {
        return super.lastIndexOf((Object) graphRequest);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ GraphRequest remove(int i) {
        return remove(i);
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    /* JADX INFO: renamed from: removeAt, reason: merged with bridge method [inline-methods] */
    public GraphRequest remove(int index) {
        return this.requests.remove(index);
    }

    public final void removeCallback(@NotNull Callback callback) {
        this.callbacks.remove(callback);
    }

    public final void setBatchApplicationId(@Nullable String str) {
        this.batchApplicationId = str;
    }

    public final void setCallbackHandler(@Nullable Handler handler) {
        this.callbackHandler = handler;
    }

    public final void setTimeout(int i) {
        if (!(i >= 0)) {
            throw new IllegalArgumentException("Argument timeoutInMilliseconds must be >= 0.".toString());
        }
        this.timeoutInMilliseconds = i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj != null ? obj instanceof GraphRequest : true) {
            return contains((GraphRequest) obj);
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public GraphRequest get(int index) {
        return this.requests.get(index);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj != null ? obj instanceof GraphRequest : true) {
            return indexOf((GraphRequest) obj);
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj != null ? obj instanceof GraphRequest : true) {
            return lastIndexOf((GraphRequest) obj);
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public GraphRequest set(int index, @NotNull GraphRequest element) {
        return this.requests.set(index, element);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(@NotNull GraphRequest element) {
        return this.requests.add(element);
    }

    public /* bridge */ boolean remove(GraphRequest graphRequest) {
        return super.remove((Object) graphRequest);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int index, @NotNull GraphRequest element) {
        this.requests.add(index, element);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj != null ? obj instanceof GraphRequest : true) {
            return remove((GraphRequest) obj);
        }
        return false;
    }

    public GraphRequestBatch(@NotNull Collection<GraphRequest> collection) {
        this.id = String.valueOf(g.incrementAndGet());
        this.callbacks = new ArrayList();
        this.requests = new ArrayList(collection);
    }

    public GraphRequestBatch(@NotNull GraphRequest... graphRequestArr) {
        this.id = String.valueOf(g.incrementAndGet());
        this.callbacks = new ArrayList();
        this.requests = new ArrayList(ArraysKt___ArraysJvmKt.asList(graphRequestArr));
    }

    public GraphRequestBatch(@NotNull GraphRequestBatch graphRequestBatch) {
        this.id = String.valueOf(g.incrementAndGet());
        this.callbacks = new ArrayList();
        this.requests = new ArrayList(graphRequestBatch);
        this.callbackHandler = graphRequestBatch.callbackHandler;
        this.timeoutInMilliseconds = graphRequestBatch.timeoutInMilliseconds;
        this.callbacks = new ArrayList(graphRequestBatch.callbacks);
    }
}
