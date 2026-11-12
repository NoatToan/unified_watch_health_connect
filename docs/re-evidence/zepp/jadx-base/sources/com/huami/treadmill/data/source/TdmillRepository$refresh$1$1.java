package com.huami.treadmill.data.source;

import androidx.p008lifecycle.MutableLiveData;
import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.huami.treadmill.api.ApiResponse;
import com.huami.treadmill.api.ApiSuccessResponse;
import com.huami.treadmill.api.Callback;
import com.huami.treadmill.data.Items;
import com.huami.treadmill.data.NetworkState;
import com.huami.treadmill.data.source.TdmillRepository$refresh$1$1;
import com.huami.treadmill.data.source.db.TreadmillDb;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\t"}, d2 = {"com/huami/treadmill/data/source/TdmillRepository$refresh$1$1", "Lcom/huami/treadmill/api/Callback;", "Lcom/huami/treadmill/api/ApiResponse;", AbstractJSONTokenResponse.RESPONSE, "", "onResponse", "", "message", "onFailure", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public final class TdmillRepository$refresh$1$1<R> implements Callback<R> {
    public final /* synthetic */ Function0<Unit> $clearDataInDb;
    public final /* synthetic */ TreadmillDb $db;
    public final /* synthetic */ Function1<R, Unit> $handleDb;
    public final /* synthetic */ MutableLiveData<NetworkState> $networkState;
    public final /* synthetic */ String $pagingKey;
    public final /* synthetic */ TdmillRepository this$0;

    /* JADX WARN: Multi-variable type inference failed */
    public TdmillRepository$refresh$1$1(TdmillRepository tdmillRepository, TreadmillDb treadmillDb, MutableLiveData<NetworkState> mutableLiveData, Function0<Unit> function0, Function1<? super R, Unit> function1, String str) {
        this.this$0 = tdmillRepository;
        this.$db = treadmillDb;
        this.$networkState = mutableLiveData;
        this.$clearDataInDb = function0;
        this.$handleDb = function1;
        this.$pagingKey = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onResponse$lambda-3, reason: not valid java name */
    public static final void m3406onResponse$lambda3(final ApiResponse apiResponse, TreadmillDb treadmillDb, MutableLiveData mutableLiveData, final Function0 function0, final Function1 function1, TdmillRepository tdmillRepository, String str) {
        if (apiResponse instanceof ApiSuccessResponse) {
            if (treadmillDb != null) {
                treadmillDb.runInTransaction(new Runnable() { // from class: lm7
                    @Override // java.lang.Runnable
                    public final void run() {
                        TdmillRepository$refresh$1$1.m3407onResponse$lambda3$lambda0(function0, function1, apiResponse);
                    }
                });
            }
            String next = ((Items) ((ApiSuccessResponse) apiResponse).getBody()).getNext();
            if (next != null) {
                if (!(next.length() > 0)) {
                    next = null;
                }
                if (next != null) {
                    tdmillRepository.pagingKeyCache.put(str, next);
                }
            }
        }
        mutableLiveData.postValue(NetworkState.INSTANCE.getLOADED());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onResponse$lambda-3$lambda-0, reason: not valid java name */
    public static final void m3407onResponse$lambda3$lambda0(Function0 function0, Function1 function1, ApiResponse apiResponse) {
        function0.invoke();
        function1.invoke(((ApiSuccessResponse) apiResponse).getBody());
    }

    @Override // com.huami.treadmill.api.Callback
    public void onFailure(@NotNull String message) {
        this.$networkState.postValue(NetworkState.INSTANCE.error(message));
    }

    @Override // com.huami.treadmill.api.Callback
    public void onResponse(@NotNull final ApiResponse<R> response) {
        Executor executor = this.this$0.ioExecutor;
        final TreadmillDb treadmillDb = this.$db;
        final MutableLiveData<NetworkState> mutableLiveData = this.$networkState;
        final Function0<Unit> function0 = this.$clearDataInDb;
        final Function1<R, Unit> function1 = this.$handleDb;
        final TdmillRepository tdmillRepository = this.this$0;
        final String str = this.$pagingKey;
        executor.execute(new Runnable() { // from class: km7
            @Override // java.lang.Runnable
            public final void run() {
                TdmillRepository$refresh$1$1.m3406onResponse$lambda3(response, treadmillDb, mutableLiveData, function0, function1, tdmillRepository, str);
            }
        });
    }
}
