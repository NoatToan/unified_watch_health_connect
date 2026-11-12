package com.xiaomi.hm.health.homepage.status.card;

import androidx.arch.core.util.Function;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.Transformations;
import com.xiaomi.hm.health.homepage.status.card.helper.ComputableLiveData;
import com.xiaomi.hm.health.homepage.status.card.helper.HandlerExceptionScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 \u0012*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0012B\u0019\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0003\u001a\u0004\u0018\u00018\u0000H\u0014¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0004\b\u0005\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0018\u0010\r\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/hm/health/homepage/status/card/InvalidateLiveData;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/xiaomi/hm/health/homepage/status/card/helper/ComputableLiveData;", "compute", "()Ljava/lang/Object;", "loadData", "Lcom/xiaomi/hm/health/homepage/status/card/DataNotifier;", "g", "Lcom/xiaomi/hm/health/homepage/status/card/DataNotifier;", "dataNotifier", "Lcom/xiaomi/hm/health/homepage/status/card/DataNotifier$Observer;", "h", "Lcom/xiaomi/hm/health/homepage/status/card/DataNotifier$Observer;", "observer", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "<init>", "(Lcom/xiaomi/hm/health/homepage/status/card/DataNotifier;Lkotlinx/coroutines/CoroutineScope;)V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public abstract class InvalidateLiveData<T> extends ComputableLiveData<T> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final DataNotifier dataNotifier;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private DataNotifier.Observer observer;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\t"}, d2 = {"Lcom/xiaomi/hm/health/homepage/status/card/InvalidateLiveData$Companion;", "", "Lcom/xiaomi/hm/health/homepage/status/card/DataNotifier;", "dataNotifier", "Landroidx/lifecycle/LiveData;", "", "listen", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final LiveData<Unit> listen(@NotNull final DataNotifier dataNotifier) {
            return Transformations.map(new InvalidateLiveData<Unit>() { // from class: com.xiaomi.hm.health.homepage.status.card.InvalidateLiveData$Companion$listen$1
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(this.i, null, 2, 0 == true ? 1 : 0);
                }

                @Override // com.xiaomi.hm.health.homepage.status.card.InvalidateLiveData
                public /* bridge */ /* synthetic */ Unit loadData() {
                    loadData2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: loadData, reason: avoid collision after fix types in other method */
                public void loadData2() {
                }
            }.asLiveData(), new Function<Unit, Unit>() { // from class: com.xiaomi.hm.health.homepage.status.card.InvalidateLiveData$Companion$listen$$inlined$map$1
                @Override // androidx.arch.core.util.Function
                public final Unit apply(Unit unit) {
                    return Unit.INSTANCE;
                }
            });
        }
    }

    public /* synthetic */ InvalidateLiveData(DataNotifier dataNotifier, CoroutineScope coroutineScope, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(dataNotifier, (i & 2) != 0 ? new HandlerExceptionScope() : coroutineScope);
    }

    @Override // com.xiaomi.hm.health.homepage.status.card.helper.ComputableLiveData
    @Nullable
    public T compute() {
        if (this.observer == null) {
            DataNotifier.Observer observer = new DataNotifier.Observer(this) { // from class: com.xiaomi.hm.health.homepage.status.card.InvalidateLiveData.compute.1
                public final /* synthetic */ InvalidateLiveData<T> a;

                {
                    this.a = this;
                }

                @Override // com.xiaomi.hm.health.homepage.status.card.DataNotifier.Observer
                public void onInvalidated() {
                    this.a.invalidate();
                }
            };
            this.dataNotifier.addWeakObserver(observer);
            Unit unit = Unit.INSTANCE;
            this.observer = observer;
        }
        return loadData();
    }

    @Nullable
    public abstract T loadData();

    public InvalidateLiveData(@NotNull DataNotifier dataNotifier, @NotNull CoroutineScope coroutineScope) {
        super(coroutineScope);
        this.dataNotifier = dataNotifier;
    }
}
