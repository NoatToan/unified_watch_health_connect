package com.huami.applet.jsengine.plugin;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.Gson;
import com.huami.applet.ConstantKt;
import com.huami.applet.extension.BooleanExt;
import com.huami.applet.extension.ContextExtKt;
import com.huami.applet.extension.JavascriptExecuteExtKt;
import com.huami.applet.extension.Otherwise;
import com.huami.applet.extension.WithData;
import com.huami.tools.log.HMLog;
import com.huami.utils.persistence.kvkit.KvKit;
import com.huami.utils.persistence.kvkit.KvPersistence;
import com.xiaomi.hm.health.device.watchskinstore.ui.LargeWatchSkinActivity;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.cybergarage.upnp.Argument;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b)\u0010*J\u001c\u0010\b\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J.\u0010\f\u001a\u00020\u0007*\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH\u0002J\u0018\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0002J \u0010\u0014\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0002J\u0018\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0003H\u0014J\u001c\u0010\u0019\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0014J\u001c\u0010\u001a\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0014J\u001c\u0010\u001b\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0014J\u001c\u0010\u001c\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0014J\u0018\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001dH\u0014R\u0016\u0010\"\u001a\u00020 8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000e\u0010!R\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\f\u0010!R\u001c\u0010(\u001a\u00020$8\u0004@\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010'¨\u0006+"}, d2 = {"Lcom/huami/applet/jsengine/plugin/AbsStorage;", "Lcom/huami/applet/jsengine/plugin/AppletPlugin;", "Lcom/huami/utils/persistence/kvkit/KvPersistence;", "Lcom/huami/applet/jsengine/plugin/StorageBean;", LargeWatchSkinActivity.KEY_BEAN, "Lcom/huami/applet/jsengine/plugin/JavascriptExecuteInterface;", "result", "", "c", "", "key", "amendValue", "b", "value", "a", "requestId", "content", GoogleApiAvailabilityLight.a, "id", "errorMsg", "e", Argument.ELEM_NAME, "invokeMethod", "storageBean", "fileName", "removeStorageValue", "clearStorageValues", "setStorageValue", "getStorageValue", "Lcom/huami/applet/jsengine/plugin/Params;", "params", "packSetRemoveClearNotify", "", LogUtil.I, "singleAppMaxNumber", "singleValueMaxSize", "Lcom/google/gson/Gson;", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "gson", "<init>", "()V", "applet_release"}, k = 1, mv = {1, 5, 1})
public abstract class AbsStorage implements AppletPlugin {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int singleAppMaxNumber = 500;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int singleValueMaxSize = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Gson gson = new Gson();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "存储数据过长，超过" + AbsStorage.this.singleValueMaxSize + "个字符，自动裁剪";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ StorageBean a;
        public final /* synthetic */ AbsStorage b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(StorageBean storageBean, AbsStorage absStorage) {
            super(0);
            this.a = storageBean;
            this.b = absStorage;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a.getParams().getAppId() + "的数量超过" + this.b.singleAppMaxNumber + "条了，不允许继续存储了";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2) {
            super(0);
            this.a = str;
            this.b = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "AbsStorage-addOrUpdate: key=" + ((Object) this.a) + ",value=" + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "AbsStorage：数据保存失败";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "invoke removeStorageValue";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "未匹配到对应Storage action";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public static final g a = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "invoke getStorageValue";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("actionMsg：", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public final /* synthetic */ StorageBean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(StorageBean storageBean) {
            super(0);
            this.a = storageBean;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("StorageBean：", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a.getMessage();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<String> {
        public static final k a = new k();

        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "invoke clearStorageValues";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function0<String> {
        public static final l a = new l();

        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "invoke setStorageValue";
        }
    }

    private final String a(String value) {
        Object data;
        BooleanExt withData = value.length() < this.singleValueMaxSize ? new WithData(value) : Otherwise.INSTANCE;
        if (withData instanceof Otherwise) {
            HMLog.warn$default(ConstantKt.TAG_APPLET, null, new a(), 2, null);
            data = value.substring(0, this.singleValueMaxSize);
        } else {
            if (!(withData instanceof WithData)) {
                throw new NoWhenBranchMatchedException();
            }
            data = ((WithData) withData).getData();
        }
        return (String) data;
    }

    private final void b(KvPersistence kvPersistence, String str, StorageBean storageBean, String str2, JavascriptExecuteInterface javascriptExecuteInterface) {
        BooleanExt withData;
        BooleanExt withData2;
        if (kvPersistence.getAllKeys().length > this.singleAppMaxNumber && !kvPersistence.isContainKey(str)) {
            JavascriptExecuteExtKt.onRpcMessage(javascriptExecuteInterface, e(storageBean.getId(), "", storageBean.getParams().getAppId() + "的数量超过" + this.singleAppMaxNumber + "条了，不允许继续存储了"));
            HMLog.error$default(ConstantKt.TAG_APPLET, ConstantKt.CODE_PLUGIN, null, new b(storageBean, this), 4, null);
            withData = new WithData(Unit.INSTANCE);
        } else {
            withData = Otherwise.INSTANCE;
        }
        if (!(withData instanceof Otherwise)) {
            if (!(withData instanceof WithData)) {
                throw new NoWhenBranchMatchedException();
            }
            ((WithData) withData).getData();
            return;
        }
        HMLog.info(ConstantKt.TAG_APPLET, new c(str, str2));
        if (kvPersistence.setValue(str, str2)) {
            JavascriptExecuteExtKt.onRpcMessage(javascriptExecuteInterface, e(storageBean.getId(), "success", ""));
            packSetRemoveClearNotify(javascriptExecuteInterface, storageBean.getParams());
            withData2 = new WithData(Unit.INSTANCE);
        } else {
            withData2 = Otherwise.INSTANCE;
        }
        if (withData2 instanceof Otherwise) {
            JavascriptExecuteExtKt.onRpcMessage(javascriptExecuteInterface, e(storageBean.getId(), "", "数据保存失败"));
            HMLog.warn$default(ConstantKt.TAG_APPLET, null, d.a, 2, null);
        } else {
            if (!(withData2 instanceof WithData)) {
                throw new NoWhenBranchMatchedException();
            }
            ((WithData) withData2).getData();
        }
    }

    private final void c(KvPersistence kvPersistence, StorageBean storageBean, JavascriptExecuteInterface javascriptExecuteInterface) throws JSONException {
        String[] strArrActionNames = actionNames();
        String str = strArrActionNames[0];
        String str2 = strArrActionNames[1];
        String str3 = strArrActionNames[2];
        String str4 = strArrActionNames[3];
        String action = storageBean.getMethod().getAction();
        if (Intrinsics.areEqual(action, str)) {
            getStorageValue(kvPersistence, storageBean, javascriptExecuteInterface);
            return;
        }
        if (Intrinsics.areEqual(action, str2)) {
            setStorageValue(kvPersistence, storageBean, javascriptExecuteInterface);
            return;
        }
        if (Intrinsics.areEqual(action, str3)) {
            removeStorageValue(kvPersistence, storageBean, javascriptExecuteInterface);
        } else if (Intrinsics.areEqual(action, str4)) {
            clearStorageValues(kvPersistence, storageBean, javascriptExecuteInterface);
        } else {
            HMLog.error$default(ConstantKt.TAG_APPLET, ConstantKt.CODE_PLUGIN, null, f.a, 4, null);
        }
    }

    private final String d(String requestId, String content) {
        return "{\"jsonrpc\":\"hmV1.0\",\"id\":\"" + requestId + "\",\"result\":" + content + '}';
    }

    private final String e(String id, String result, String errorMsg) {
        if (result.length() == 0) {
            return "{\"jsonrpc\":\"hmV1.0\",\"id\":\"" + id + "\",\"error\": {\"message\":\"" + errorMsg + "\"}}";
        }
        return "{\"jsonrpc\":\"hmV1.0\",\"id\":\"" + id + "\",\"result\":\"" + result + "\"}";
    }

    @Override // com.huami.applet.jsengine.plugin.AppletPlugin
    @NotNull
    public String[] actionNames() {
        return AppletPlugin.DefaultImpls.actionNames(this);
    }

    public void clearStorageValues(@NotNull KvPersistence kvPersistence, @NotNull StorageBean storageBean, @NotNull JavascriptExecuteInterface javascriptExecuteInterface) {
        HMLog.info(ConstantKt.TAG_APPLET, e.a);
        kvPersistence.clear();
        JavascriptExecuteExtKt.onRpcMessage(javascriptExecuteInterface, e(storageBean.getId(), "success", ""));
        packSetRemoveClearNotify(javascriptExecuteInterface, storageBean.getParams());
    }

    @NotNull
    public String fileName(@NotNull StorageBean storageBean) {
        return String.valueOf(storageBean.getParams().getAppId());
    }

    @NotNull
    public final Gson getGson() {
        return this.gson;
    }

    public void getStorageValue(@NotNull KvPersistence kvPersistence, @NotNull StorageBean storageBean, @NotNull JavascriptExecuteInterface javascriptExecuteInterface) throws JSONException {
        HMLog.info(ConstantKt.TAG_APPLET, g.a);
        JSONObject jSONObject = new JSONObject();
        for (String str : kvPersistence.getAllKeys()) {
            jSONObject.put(str, (String) kvPersistence.getValue(str, ""));
        }
        JavascriptExecuteExtKt.onRpcMessage(javascriptExecuteInterface, d(storageBean.getId(), jSONObject.toString()));
    }

    @Override // com.huami.applet.jsengine.plugin.AppletPlugin
    public void invokeMethod(@NotNull String argument, @NotNull JavascriptExecuteInterface result) {
        Object objM3845constructorimpl;
        HMLog.info(ConstantKt.TAG_APPLET, new h(argument));
        try {
            kotlin.Result.Companion companion = kotlin.Result.Companion;
            StorageBean storageBean = (StorageBean) getGson().fromJson(argument, StorageBean.class);
            Unit unit = null;
            if (storageBean != null) {
                HMLog.info(ConstantKt.TAG_APPLET, new i(storageBean));
                c(KvKit.getKvPersistence$default(fileName(storageBean), ContextExtKt.getAppletKVDir(result.context(), String.valueOf(storageBean.getParams().getAppId())).getAbsolutePath(), false, 4, null), storageBean, result);
                unit = Unit.INSTANCE;
            }
            objM3845constructorimpl = kotlin.Result.m3845constructorimpl(unit);
        } catch (Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.Companion;
            objM3845constructorimpl = kotlin.Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = kotlin.Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            thM3848exceptionOrNullimpl.printStackTrace();
            HMLog.error(ConstantKt.TAG_APPLET, ConstantKt.CODE_PLUGIN, thM3848exceptionOrNullimpl, new j(thM3848exceptionOrNullimpl));
        }
    }

    @Override // com.huami.applet.jsengine.plugin.AppletPlugin
    @NotNull
    public String[] moduleName() {
        return AppletPlugin.DefaultImpls.moduleName(this);
    }

    public void packSetRemoveClearNotify(@NotNull JavascriptExecuteInterface result, @NotNull Params params) {
    }

    public void removeStorageValue(@NotNull KvPersistence kvPersistence, @NotNull StorageBean storageBean, @NotNull JavascriptExecuteInterface javascriptExecuteInterface) {
        HMLog.info(ConstantKt.TAG_APPLET, k.a);
        kvPersistence.removeValuesForKeys(storageBean.getParams().getKey());
        JavascriptExecuteExtKt.onRpcMessage(javascriptExecuteInterface, e(storageBean.getId(), "success", ""));
        packSetRemoveClearNotify(javascriptExecuteInterface, storageBean.getParams());
    }

    public void setStorageValue(@NotNull KvPersistence kvPersistence, @NotNull StorageBean storageBean, @NotNull JavascriptExecuteInterface javascriptExecuteInterface) {
        HMLog.info(ConstantKt.TAG_APPLET, l.a);
        String key = storageBean.getParams().getKey();
        String newValue = storageBean.getParams().getNewValue();
        if (key == null || newValue == null) {
            JavascriptExecuteExtKt.onRpcMessage(javascriptExecuteInterface, e(storageBean.getId(), "", "key or value is null"));
        } else {
            b(kvPersistence, key, storageBean, a(newValue), javascriptExecuteInterface);
        }
    }
}
