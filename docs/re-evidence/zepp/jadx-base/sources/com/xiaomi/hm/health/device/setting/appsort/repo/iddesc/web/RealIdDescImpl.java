package com.xiaomi.hm.health.device.setting.appsort.repo.iddesc.web;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.device.core.agps.api.bean.AppInfo;
import com.huami.device.feature.quickcards.cloud.resouce.ResourceFactoryBuilder;
import com.huami.device.feature.quickcards.cloud.resouce.api.CloudResourceApi;
import com.huami.device.feature.quickcards.cloud.resouce.api.bean.RequestBean;
import com.huami.device.feature.quickcards.cloud.resouce.api.bean.ResponseBean;
import com.huami.device.feature.quickcards.cloud.resouce.impl.bean.ResponseItem;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.device.agps.MifitAppInfoFactory;
import com.xiaomi.hm.health.device.setting.appsort.repo.iddesc.IdDescApi;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u001b\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016R\u0019\u0010\u000f\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R2\u0010\u0019\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0015j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005`\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/appsort/repo/iddesc/web/RealIdDescImpl;", "Lcom/xiaomi/hm/health/device/setting/appsort/repo/iddesc/IdDescApi;", "", "a", "", "", "ids", "", "parse", "appId", "getDesc", "", LogUtil.I, "getType", "()I", "type", "b", "Ljava/lang/Integer;", "getSource", "()Ljava/lang/Integer;", "source", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "c", "Ljava/util/HashMap;", "idDescMap", "<init>", "(ILjava/lang/Integer;)V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class RealIdDescImpl implements IdDescApi {

    @NotNull
    private static final String d = "RealIdDescImpl";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private final Integer source;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final HashMap<String, String> idDescMap;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "parse exception: " + this.a;
        }
    }

    public RealIdDescImpl(int i, @Nullable Integer num) {
        this.type = i;
        this.source = num;
        this.idDescMap = new HashMap<>();
    }

    private final void a() {
        ResourceFactoryBuilder resourceFactoryBuilder = ResourceFactoryBuilder.INSTANCE;
        AppInfo appInfoCreateInfo = new MifitAppInfoFactory().createInfo();
        String host = appInfoCreateInfo.getHost();
        String token = appInfoCreateInfo.getToken();
        String appName = appInfoCreateInfo.getAppName();
        String userId = appInfoCreateInfo.getUserId();
        if (userId == null) {
            userId = "";
        }
        resourceFactoryBuilder.setAppInfo(new CloudResourceApi.AppInfo(host, appName, userId, Locale.getDefault().toString(), token));
    }

    @Override // com.xiaomi.hm.health.device.setting.appsort.repo.iddesc.IdDescApi
    @NotNull
    public String getDesc(@NotNull String appId) {
        String str = this.idDescMap.get(appId);
        return str == null ? "" : str;
    }

    @Nullable
    public final Integer getSource() {
        return this.source;
    }

    public final int getType() {
        return this.type;
    }

    @Override // com.xiaomi.hm.health.device.setting.appsort.repo.iddesc.IdDescApi
    public boolean parse(@NotNull List<String> ids) {
        Object objM3845constructorimpl;
        CloudResourceApi<RequestBean, ResponseBean<ResponseItem>> cloudResourceApiBuildAppSortFactory;
        try {
            Result.Companion companion = Result.Companion;
            this.idDescMap.clear();
            a();
            int type = getType();
            if (type == 1) {
                cloudResourceApiBuildAppSortFactory = ResourceFactoryBuilder.INSTANCE.buildAppSortFactory();
            } else {
                if (type != 2) {
                    throw new IllegalArgumentException("unknown type: " + getType());
                }
                cloudResourceApiBuildAppSortFactory = ResourceFactoryBuilder.INSTANCE.buildQuickScreenApi();
            }
            for (ResponseItem responseItem : cloudResourceApiBuildAppSortFactory.queryData(new NormalRequestBean(ids), getSource()).loadItems()) {
                String name = responseItem.getName();
                if (!(name == null || m.isBlank(name))) {
                    this.idDescMap.put(responseItem.getId(), responseItem.getName());
                }
            }
            objM3845constructorimpl = Result.m3845constructorimpl(Boolean.TRUE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            HMLog.error$default(d, null, null, new a(thM3848exceptionOrNullimpl), 6, null);
        }
        Boolean bool = Boolean.FALSE;
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = bool;
        }
        return ((Boolean) objM3845constructorimpl).booleanValue();
    }

    public /* synthetic */ RealIdDescImpl(int i, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : num);
    }
}
