package com.xiaomi.hm.health.play.card;

import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.LiveData;
import com.xiaomi.hm.health.homepage.status.card.helper.ComputableLiveData;
import com.xiaomi.hm.health.homepage.status.card.helper.HandlerExceptionScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 \u0017*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0017B\u001f\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\t\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0004\u001a\u0004\u0018\u00018\u0000H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\u0007\u001a\u0004\u0018\u00018\u00002\b\u0010\u0006\u001a\u0004\u0018\u00018\u0001H&¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00018\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/hm/health/play/card/InvalidateLiveData;", ExifInterface.GPS_DIRECTION_TRUE, "R", "Lcom/xiaomi/hm/health/homepage/status/card/helper/ComputableLiveData;", "compute", "()Ljava/lang/Object;", "eventData", "loadData", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lcom/xiaomi/hm/health/play/card/DataNotifier;", "g", "Lcom/xiaomi/hm/health/play/card/DataNotifier;", "dataNotifier", "Lcom/xiaomi/hm/health/play/card/DataNotifier$Observer;", "h", "Lcom/xiaomi/hm/health/play/card/DataNotifier$Observer;", "observer", "i", "Ljava/lang/Object;", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "<init>", "(Lcom/xiaomi/hm/health/play/card/DataNotifier;Lkotlinx/coroutines/CoroutineScope;)V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public abstract class InvalidateLiveData<T, R> extends ComputableLiveData<T> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final DataNotifier<R> dataNotifier;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private DataNotifier.Observer<R> observer;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private R eventData;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00020\u0005\"\u0004\b\u0002\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003¨\u0006\t"}, d2 = {"Lcom/xiaomi/hm/health/play/card/InvalidateLiveData$Companion;", "", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/xiaomi/hm/health/play/card/DataNotifier;", "dataNotifier", "Landroidx/lifecycle/LiveData;", "listen", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final <T> LiveData<T> listen(@NotNull final DataNotifier<T> dataNotifier) {
            return new InvalidateLiveData<T, T>(dataNotifier) { // from class: com.xiaomi.hm.health.play.card.InvalidateLiveData$Companion$listen$1
                public final /* synthetic */ DataNotifier<T> j;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(dataNotifier, null, 2, 0 == true ? 1 : 0);
                    this.j = dataNotifier;
                }

                @Override // com.xiaomi.hm.health.play.card.InvalidateLiveData
                @Nullable
                public T loadData(@Nullable T eventData) {
                    return eventData;
                }
            }.asLiveData();
        }
    }

    public /* synthetic */ InvalidateLiveData(DataNotifier dataNotifier, CoroutineScope coroutineScope, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(dataNotifier, (i & 2) != 0 ? new HandlerExceptionScope() : coroutineScope);
    }

    @Override // com.xiaomi.hm.health.homepage.status.card.helper.ComputableLiveData
    @Nullable
    public T compute() {
        if (this.observer == null) {
            DataNotifier.Observer<R> observer = new DataNotifier.Observer<R>(this) { // from class: com.xiaomi.hm.health.play.card.InvalidateLiveData.compute.1
                public final /* synthetic */ InvalidateLiveData<T, R> a;

                {
                    this.a = this;
                }

                @Override // com.xiaomi.hm.health.play.card.DataNotifier.Observer
                public void onInvalidated(R data) {
                    ((InvalidateLiveData) this.a).eventData = data;
                    this.a.invalidate();
                }
            };
            this.dataNotifier.addWeakObserver(observer);
            Unit unit = Unit.INSTANCE;
            this.observer = observer;
        }
        return loadData(this.eventData);
    }

    @Nullable
    public abstract T loadData(@Nullable R eventData);

    public InvalidateLiveData(@NotNull DataNotifier<R> dataNotifier, @NotNull CoroutineScope coroutineScope) {
        super(coroutineScope);
        this.dataNotifier = dataNotifier;
    }
}
