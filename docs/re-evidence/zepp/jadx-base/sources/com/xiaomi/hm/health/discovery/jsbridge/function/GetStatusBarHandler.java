package com.xiaomi.hm.health.discovery.jsbridge.function;

import android.content.Context;
import android.util.TypedValue;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.discovery.bridge.jsbridge.JsCallBackFunction;
import com.huami.discovery.bridge.jsbridge.api.ApiHandler;
import com.huami.discovery.bridge.jsbridge.common.ErrorMessage;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.IdGetter;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\t\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u001c\u0010\u0005\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u0019\u0010\u0010\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0015\u001a\u00020\u00118B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001d\u0010\u0019\u001a\u00020\u00168B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\f\u0010\u0018R\u001d\u0010\u001b\u001a\u00020\u00118B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u0017\u0010\u0014¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/hm/health/discovery/jsbridge/function/GetStatusBarHandler;", "Lcom/huami/discovery/bridge/jsbridge/api/ApiHandler;", "", "data", "", "handleData", "Lcom/huami/discovery/bridge/jsbridge/JsCallBackFunction;", "function", "", "Lcom/huami/discovery/bridge/jsbridge/common/ErrorMessage;", "getFailedResult", "Landroid/content/Context;", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "b", "Lkotlin/Lazy;", "()I", "mStatusBarHeight", "", "c", "()F", "mDensity", GoogleApiAvailabilityLight.a, "sPxOfDp48", "<init>", "(Landroid/content/Context;)V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class GetStatusBarHandler implements ApiHandler {

    @NotNull
    private static final String e = "GetStatusBarHandler";

    @NotNull
    private static final String f = "pxHeight";

    @NotNull
    private static final String g = "ptHeight";

    @NotNull
    private static final String h = "status_bar_height";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy mStatusBarHeight = LazyKt__LazyJVMKt.lazy(new b());

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy mDensity = LazyKt__LazyJVMKt.lazy(new a());

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy sPxOfDp48 = LazyKt__LazyJVMKt.lazy(new c());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0007\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Float> {
        public a() {
            super(0);
        }

        public final float a() {
            return GetStatusBarHandler.this.getContext().getResources().getDisplayMetrics().density;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Float invoke() {
            return Float.valueOf(a());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Integer> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ Exception a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Exception exc) {
                super(0);
                this.a = exc;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "通过id：status_bar_height获取高度报错：" + this.a.getMessage();
            }
        }

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Integer invoke() {
            return Integer.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final int invoke2() {
            try {
                return GetStatusBarHandler.this.getContext().getResources().getDimensionPixelSize(IdGetter.getIdSys(GetStatusBarHandler.this.getContext(), GetStatusBarHandler.h, "dimen"));
            } catch (Exception e) {
                HMLog.error$default(GetStatusBarHandler.e, null, null, new a(e), 6, null);
                return GetStatusBarHandler.this.c();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Integer> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Integer invoke() {
            return Integer.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final int invoke2() {
            return Math.round(TypedValue.applyDimension(1, 48.0f, GetStatusBarHandler.this.getContext().getResources().getDisplayMetrics()));
        }
    }

    public GetStatusBarHandler(@NotNull Context context) {
        this.context = context;
    }

    private final float a() {
        return ((Number) this.mDensity.getValue()).floatValue();
    }

    private final int b() {
        return ((Number) this.mStatusBarHeight.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int c() {
        return ((Number) this.sPxOfDp48.getValue()).intValue();
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Override // com.huami.discovery.bridge.jsbridge.api.ApiHandler
    @NotNull
    public ErrorMessage getFailedResult() {
        return new ErrorMessage(null);
    }

    @Override // com.huami.discovery.bridge.jsbridge.api.ApiHandler
    public void handleData(@Nullable String data, @Nullable JsCallBackFunction function) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(f, b());
        jSONObject.put(g, Float.valueOf(b() / a()));
        if (function == null) {
            return;
        }
        function.onCallBack(jSONObject.toString());
    }

    @Override // com.huami.discovery.bridge.jsbridge.api.ApiHandler
    public boolean handleData(@Nullable String data) {
        return false;
    }
}
