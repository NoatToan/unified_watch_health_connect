package com.xiaomi.hm.health.devicex.factory;

import android.content.Context;
import com.google.android.gms.fitness.data.WorkoutExercises;
import com.huami.devicex.injection.other.QQLoginApi;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.thirdbind.tencent.QQLogin;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016R\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR%\u0010\u0016\u001a\n \u0012*\u0004\u0018\u00010\u00110\u00118B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000e\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/hm/health/devicex/factory/QQLoginImpl;", "Lcom/huami/devicex/injection/other/QQLoginApi;", "", "isQQLoginInvalid", "isQQLoginValid", "", "getAppId", "getOpenId", "getAccessToken", "", "getExpiresIn", "", WorkoutExercises.CLEAN, "Landroid/content/Context;", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/xiaomi/hm/health/thirdbind/tencent/QQLogin;", "kotlin.jvm.PlatformType", "b", "Lkotlin/Lazy;", "()Lcom/xiaomi/hm/health/thirdbind/tencent/QQLogin;", "qqLogin", "<init>", "(Landroid/content/Context;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class QQLoginImpl implements QQLoginApi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy qqLogin = LazyKt__LazyJVMKt.lazy(new a());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/thirdbind/tencent/QQLogin;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<QQLogin> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final QQLogin invoke() {
            return QQLogin.getInstance(QQLoginImpl.this.context);
        }
    }

    public QQLoginImpl(@NotNull Context context) {
        this.context = context;
    }

    private final QQLogin a() {
        return (QQLogin) this.qqLogin.getValue();
    }

    @Override // com.huami.devicex.injection.other.QQLoginApi
    public void clean() {
        a().clean(true);
    }

    @Override // com.huami.devicex.injection.other.QQLoginApi
    @NotNull
    public String getAccessToken() {
        return a().getTencent().getAccessToken();
    }

    @Override // com.huami.devicex.injection.other.QQLoginApi
    @NotNull
    public String getAppId() {
        return "1105651418";
    }

    @Override // com.huami.devicex.injection.other.QQLoginApi
    public long getExpiresIn() {
        return a().getTencent().getExpiresIn();
    }

    @Override // com.huami.devicex.injection.other.QQLoginApi
    @NotNull
    public String getOpenId() {
        return a().getTencent().getOpenId();
    }

    @Override // com.huami.devicex.injection.other.QQLoginApi
    public boolean isQQLoginInvalid() {
        return QQLogin.getInstance(this.context) == null || !QQLogin.getInstance(this.context).isLoginValid();
    }

    @Override // com.huami.devicex.injection.other.QQLoginApi
    public boolean isQQLoginValid() {
        return false;
    }
}
