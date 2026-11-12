package com.huawei.haf.router.core;

import android.content.Context;
import com.google.gson.Gson;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.router.facade.service.SerializationService;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes2.dex */
final class AppRouterSerializationService implements SerializationService {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SerializationService f6060c;

    AppRouterSerializationService() {
        init(BaseApplication.b());
    }

    @Override // com.huawei.haf.router.facade.service.SerializationService
    public String object2Json(Object obj) {
        SerializationService serializationService = this.f6060c;
        if (serializationService != null) {
            return serializationService.object2Json(obj);
        }
        return new Gson().toJson(obj);
    }

    @Override // com.huawei.haf.router.facade.service.SerializationService
    public <T> T parseObject(String str, Type type) {
        SerializationService serializationService = this.f6060c;
        if (serializationService != null) {
            return (T) serializationService.parseObject(str, type);
        }
        return (T) new Gson().fromJson(str, type);
    }

    @Override // com.huawei.haf.router.facade.template.ServiceProvider
    public void init(Context context) {
        this.f6060c = (SerializationService) AppRouterHelper.a(SerializationService.class);
    }
}
