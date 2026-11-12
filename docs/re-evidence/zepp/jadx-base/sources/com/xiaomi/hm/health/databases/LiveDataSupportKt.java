package com.xiaomi.hm.health.databases;

import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.LiveData;
import com.xiaomi.hm.health.databases.invalidation.Observer;
import java.util.Arrays;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a?\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0006\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0001\"\u00020\u00022\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "", "tableNames", "Lkotlin/Function0;", "query", "Landroidx/lifecycle/LiveData;", "queryByLiveData", "([Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Landroidx/lifecycle/LiveData;", "database_release"}, k = 2, mv = {1, 5, 1})
public final class LiveDataSupportKt {
    @NotNull
    public static final <T> LiveData<T> queryByLiveData(@NotNull final String[] strArr, @NotNull final Function0<? extends T> function0) {
        return new ComputableLiveData<T>() { // from class: com.xiaomi.hm.health.databases.LiveDataSupportKt.queryByLiveData.1

            /* JADX INFO: renamed from: g, reason: from kotlin metadata */
            @Nullable
            private Observer observer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(null, 1, 0 == true ? 1 : 0);
            }

            @Override // com.xiaomi.hm.health.databases.ComputableLiveData
            @Nullable
            public T compute() {
                if (this.observer == null) {
                    String[] strArr2 = strArr;
                    final Object[] objArrCopyOf = Arrays.copyOf(strArr2, strArr2.length);
                    Observer observer = new Observer(objArrCopyOf) { // from class: com.xiaomi.hm.health.databases.LiveDataSupportKt$queryByLiveData$1$compute$1
                        {
                            super((String[]) objArrCopyOf);
                        }

                        @Override // com.xiaomi.hm.health.databases.invalidation.Observer
                        public void onInvalidated(@NotNull Set<String> tables) {
                            invalidate();
                        }
                    };
                    HMDaoManager.getInstance().getInvalidationTracker().addWeakObserver(observer);
                    Unit unit = Unit.INSTANCE;
                    this.observer = observer;
                }
                return function0.invoke();
            }
        }.asLiveData();
    }
}
