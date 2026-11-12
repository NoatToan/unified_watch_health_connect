package com.huami.device.feature.health.user;

import com.huami.watch.transport.httpsupport.model.DataItem;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subjects.BehaviorSubject;
import io.reactivex.subjects.Subject;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006R#\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\t8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/huami/device/feature/health/user/HealthConfigObserve;", "", "Lcom/huami/device/feature/health/user/HealthSettingConfig;", "config", "", DataItem.HTTP_METHOD_POST, "Lio/reactivex/Observable;", "Lcom/huami/device/feature/health/user/HealthConfig;", "toObservable", "Lio/reactivex/subjects/Subject;", "a", "Lkotlin/Lazy;", "()Lio/reactivex/subjects/Subject;", "bus", "<init>", "()V", "Companion", "health-base_release"}, k = 1, mv = {1, 5, 1})
public final class HealthConfigObserve {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private static volatile HealthConfigObserve b;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy bus = LazyKt__LazyJVMKt.lazy(a.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u00020\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/huami/device/feature/health/user/HealthConfigObserve$Companion;", "", "Lcom/huami/device/feature/health/user/HealthConfigObserve;", "getDefault", "()Lcom/huami/device/feature/health/user/HealthConfigObserve;", "default", "defaultInstance", "Lcom/huami/device/feature/health/user/HealthConfigObserve;", "<init>", "()V", "health-base_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final HealthConfigObserve getDefault() {
            if (HealthConfigObserve.b == null) {
                synchronized (HealthConfigObserve.class) {
                    if (HealthConfigObserve.b == null) {
                        Companion companion = HealthConfigObserve.INSTANCE;
                        HealthConfigObserve.b = new HealthConfigObserve();
                    }
                    Unit unit = Unit.INSTANCE;
                }
            }
            return HealthConfigObserve.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n"}, d2 = {"Lio/reactivex/subjects/BehaviorSubject;", "Lcom/huami/device/feature/health/user/HealthConfig;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<BehaviorSubject<HealthConfig>> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BehaviorSubject<HealthConfig> invoke() {
            return BehaviorSubject.createDefault(new HealthConfig(null, 1, 0 == true ? 1 : 0));
        }
    }

    private final Subject<HealthConfig> a() {
        return (Subject) this.bus.getValue();
    }

    public final void post(@NotNull HealthSettingConfig config) {
        a().onNext(new HealthConfig(config));
    }

    @NotNull
    public final Observable<HealthConfig> toObservable() {
        return a().ofType(HealthConfig.class).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
    }
}
