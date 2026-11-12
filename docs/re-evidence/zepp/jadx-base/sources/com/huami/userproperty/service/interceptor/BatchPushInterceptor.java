package com.huami.userproperty.service.interceptor;

import com.huami.userproperty.service.entity.local.LocalProperty;
import com.huami.userproperty.service.entity.remote.BatchPushResult;
import com.huami.userproperty.service.entity.remote.ResultFuture;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001¨\u0006\u0006"}, d2 = {"Lcom/huami/userproperty/service/interceptor/BatchPushInterceptor;", "Lcom/huami/userproperty/service/interceptor/Interceptor;", "", "Lcom/huami/userproperty/service/entity/local/LocalProperty;", "Lcom/huami/userproperty/service/entity/remote/ResultFuture;", "Lcom/huami/userproperty/service/entity/remote/BatchPushResult;", "service_release"}, k = 1, mv = {1, 5, 1})
public interface BatchPushInterceptor extends Interceptor<List<? extends LocalProperty>, ResultFuture<BatchPushResult>> {
}
