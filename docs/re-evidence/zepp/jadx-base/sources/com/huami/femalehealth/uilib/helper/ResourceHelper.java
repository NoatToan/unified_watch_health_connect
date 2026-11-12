package com.huami.femalehealth.uilib.helper;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.widget.Toast;
import com.huami.femalehealth.uilib.koin.ScopesAndQualifersKt;
import com.xiaomi.hm.health.Constant;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0019B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002J\b\u0010\n\u001a\u0004\u0018\u00010\tJ\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004J\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004J\u0006\u0010\u0010\u001a\u00020\u000fJ\u0006\u0010\u0012\u001a\u00020\u0011R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, d2 = {"Lcom/huami/femalehealth/uilib/helper/ResourceHelper;", "Lorg/koin/core/component/KoinComponent;", "", "dimenId", "", "getDimen", "stringId", "", "getString", "Landroid/content/res/Resources;", "getResources", Constant.PAI_KEY_DAILY_PAI, "dp2px", "sp", "spToPx", "Landroid/graphics/Point;", "findScreenWH", "", "isRTL", "Lcom/huami/femalehealth/uilib/helper/ContextHolder;", "a", "Lcom/huami/femalehealth/uilib/helper/ContextHolder;", "contextHolder", "<init>", "()V", "ToastUtil", "uilib_release"}, k = 1, mv = {1, 5, 1})
public final class ResourceHelper implements KoinComponent {

    @NotNull
    public static final ResourceHelper INSTANCE;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final ContextHolder contextHolder;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007R\"\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/huami/femalehealth/uilib/helper/ResourceHelper$ToastUtil;", "", "Landroid/content/Context;", "cxt", "", "msg", "", "len", "", "showToastOnce", "", "Landroid/widget/Toast;", "a", "Ljava/util/Map;", "toastMap", "<init>", "()V", "uilib_release"}, k = 1, mv = {1, 5, 1})
    public static final class ToastUtil {

        @NotNull
        public static final ToastUtil INSTANCE = new ToastUtil();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private static Map<String, Toast> toastMap = new LinkedHashMap();

        private ToastUtil() {
        }

        @SuppressLint({"ShowToast"})
        public final void showToastOnce(@NotNull Context cxt, @NotNull String msg, int len) {
            Toast toastMakeText;
            if (toastMap.get(msg) != null) {
                toastMakeText = toastMap.get(msg);
            } else {
                toastMakeText = Toast.makeText(cxt, msg, len);
                toastMap.put(msg, toastMakeText);
            }
            toastMakeText.show();
        }
    }

    static {
        ResourceHelper resourceHelper = new ResourceHelper();
        INSTANCE = resourceHelper;
        contextHolder = (ContextHolder) ScopesAndQualifersKt.femaleHealthContextScope(resourceHelper.getKoin()).get(Reflection.getOrCreateKotlinClass(ContextHolder.class), null, null);
    }

    private ResourceHelper() {
    }

    public final float dp2px(float dp) {
        return contextHolder.dp2px(dp);
    }

    @NotNull
    public final Point findScreenWH() {
        return contextHolder.findScreenWH();
    }

    public final float getDimen(int dimenId) {
        return contextHolder.getDimen(dimenId);
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Nullable
    public final Resources getResources() {
        return contextHolder.getResources();
    }

    @NotNull
    public final String getString(int stringId) {
        return contextHolder.getString(stringId);
    }

    public final boolean isRTL() {
        Configuration configuration;
        Resources resources = contextHolder.getResources();
        return (resources == null || (configuration = resources.getConfiguration()) == null || configuration.getLayoutDirection() != 1) ? false : true;
    }

    public final float spToPx(float sp) {
        return contextHolder.spToPx(sp);
    }
}
