package com.xiaomi.hm.health.device.setting.appsort.repo.iddesc;

import android.content.Context;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.device.setting.appsort.AppSortMapFactory;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0016R\u0019\u0010\u000e\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\"\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00030\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/appsort/repo/iddesc/MockAppSortIdDescImpl;", "Lcom/xiaomi/hm/health/device/setting/appsort/repo/iddesc/IdDescApi;", "", "", "ids", "", "parse", "appId", "getDesc", "Landroid/content/Context;", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "", "b", "Ljava/util/Map;", "appSortFactory", "<init>", "(Landroid/content/Context;)V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class MockAppSortIdDescImpl implements IdDescApi {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Map<Integer, String> appSortFactory;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/appsort/repo/iddesc/MockAppSortIdDescImpl$Companion;", "", "", "", "hexStrToInt", "(Ljava/lang/String;)Ljava/lang/Integer;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final Integer hexStrToInt(@NotNull String str) {
            Object objM3845constructorimpl;
            try {
                Result.Companion companion = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl(Integer.valueOf(m.replace$default(str, "^0[x|X]", "", false, 4, (Object) null), 16));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
                objM3845constructorimpl = null;
            }
            return (Integer) objM3845constructorimpl;
        }
    }

    public MockAppSortIdDescImpl(@NotNull Context context) {
        this.context = context;
        this.appSortFactory = new AppSortMapFactory(HMDeviceSource.VDEVICE).createItemNames(context);
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Override // com.xiaomi.hm.health.device.setting.appsort.repo.iddesc.IdDescApi
    @NotNull
    public String getDesc(@NotNull String appId) {
        Object objM3845constructorimpl;
        String str;
        try {
            Result.Companion companion = Result.Companion;
            Integer numHexStrToInt = INSTANCE.hexStrToInt(appId);
            if (numHexStrToInt == null) {
                str = null;
            } else {
                str = this.appSortFactory.get(Integer.valueOf(numHexStrToInt.intValue()));
            }
            objM3845constructorimpl = Result.m3845constructorimpl(str);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        String str2 = (String) (Result.m3850isFailureimpl(objM3845constructorimpl) ? null : objM3845constructorimpl);
        return str2 == null ? appId : str2;
    }

    @Override // com.xiaomi.hm.health.device.setting.appsort.repo.iddesc.IdDescApi
    public boolean parse(@NotNull List<String> ids) {
        return true;
    }
}
