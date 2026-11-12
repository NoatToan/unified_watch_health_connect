package com.xiaomi.hm.health.webapi;

import android.content.Context;
import com.android.volley.toolbox.Volley;
import com.huami.passport.net.RequestQueueHolder;
import com.huami.passport.utils.OkHttp3Stack;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.httpkit.HeaderInterceptor;
import com.xiaomi.hm.health.httpkit.RequestConfigKt;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/webapi/PassportApiInit;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", PointCategory.INIT, "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class PassportApiInit {

    @NotNull
    public static final PassportApiInit INSTANCE = new PassportApiInit();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Map<String, ? extends String>> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Map<String, ? extends String> invoke() {
            return RequestConfigKt.getPassportHeader();
        }
    }

    private PassportApiInit() {
    }

    @JvmStatic
    public static final void init(@NotNull Context context) {
        RequestQueueHolder.setRequestQueue(Volley.newRequestQueue(context, new OkHttp3Stack(new OkHttpClient.Builder().followRedirects(false).followSslRedirects(false).addInterceptor(new HeaderInterceptor(a.a)).build())));
    }
}
