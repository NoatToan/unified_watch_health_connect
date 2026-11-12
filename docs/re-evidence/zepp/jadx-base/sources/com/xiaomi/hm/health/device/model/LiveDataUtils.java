package com.xiaomi.hm.health.device.model;

import android.os.Handler;
import android.os.Looper;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.MutableLiveData;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0010B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\t\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\bJ+\u0010\n\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\n\u0010\bR\u0018\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/hm/health/device/model/LiveDataUtils;", "", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/MutableLiveData;", "mld", GoogleApiAvailabilityLight.a, "", "a", "(Landroidx/lifecycle/MutableLiveData;Ljava/lang/Object;)V", "update", "setValue", "Landroid/os/Handler;", "Landroid/os/Handler;", "sMainHandler", "<init>", "()V", "SetValueRunnable", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class LiveDataUtils {

    @NotNull
    public static final LiveDataUtils INSTANCE = new LiveDataUtils();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private static Handler sMainHandler;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u0000 \u000e*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u000fB\u001f\b\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0004\u001a\u00020\u0003H\u0016R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\u000b\u001a\u00028\u00008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/hm/health/device/model/LiveDataUtils$SetValueRunnable;", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/lang/Runnable;", "", "run", "Landroidx/lifecycle/MutableLiveData;", "a", "Landroidx/lifecycle/MutableLiveData;", "liveData", "b", "Ljava/lang/Object;", "data", "<init>", "(Landroidx/lifecycle/MutableLiveData;Ljava/lang/Object;)V", "c", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class SetValueRunnable<T> implements Runnable {

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final MutableLiveData<T> liveData;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final T data;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0001\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0005\u001a\u00028\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/hm/health/device/model/LiveDataUtils$SetValueRunnable$Companion;", "", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/MutableLiveData;", "liveData", "data", "Lcom/xiaomi/hm/health/device/model/LiveDataUtils$SetValueRunnable;", "create", "(Landroidx/lifecycle/MutableLiveData;Ljava/lang/Object;)Lcom/xiaomi/hm/health/device/model/LiveDataUtils$SetValueRunnable;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final <T> SetValueRunnable<T> create(@NotNull MutableLiveData<T> liveData, T data) {
                return new SetValueRunnable<>(liveData, data, null);
            }
        }

        private SetValueRunnable(MutableLiveData<T> mutableLiveData, T t) {
            this.liveData = mutableLiveData;
            this.data = t;
        }

        public /* synthetic */ SetValueRunnable(MutableLiveData mutableLiveData, Object obj, DefaultConstructorMarker defaultConstructorMarker) {
            this(mutableLiveData, obj);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.liveData.setValue(this.data);
        }
    }

    private LiveDataUtils() {
    }

    private final <T> void a(MutableLiveData<T> mld, T d) {
        if (sMainHandler == null) {
            sMainHandler = new Handler(Looper.getMainLooper());
        }
        Handler handler = sMainHandler;
        if (handler == null) {
            return;
        }
        handler.post(SetValueRunnable.INSTANCE.create(mld, d));
    }

    public final <T> void setValue(@Nullable MutableLiveData<T> mld, T d) {
        if (mld == null) {
            return;
        }
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            mld.setValue(d);
        } else {
            a(mld, d);
        }
    }

    public final <T> void update(@Nullable MutableLiveData<T> mld, T d) {
        if (mld == null) {
            return;
        }
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            mld.setValue(d);
        } else {
            mld.postValue(d);
        }
    }
}
