package com.huami.ecg.core;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.ecg.core.device.EcgDevice;
import com.huami.ecg.core.web.EcgWebSetting;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b#\u0010$J\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R+\u0010\u0011\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R+\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR+\u0010\"\u001a\u00020\u001c2\u0006\u0010\n\u001a\u00020\u001c8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006%"}, d2 = {"Lcom/huami/ecg/core/EcgCore;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/ecg/core/web/EcgWebSetting;", "ecgWebSetting", "Lcom/huami/ecg/core/device/EcgDevice;", "ecgDevice", "", "initEcg", "<set-?>", "b", "Lkotlin/properties/ReadWriteProperty;", "getWebSetting", "()Lcom/huami/ecg/core/web/EcgWebSetting;", "setWebSetting", "(Lcom/huami/ecg/core/web/EcgWebSetting;)V", "webSetting", "c", "getEcgDevice", "()Lcom/huami/ecg/core/device/EcgDevice;", "setEcgDevice", "(Lcom/huami/ecg/core/device/EcgDevice;)V", GoogleApiAvailabilityLight.a, "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "", "e", "getAppName", "()Ljava/lang/String;", "setAppName", "(Ljava/lang/String;)V", "appName", "<init>", "()V", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
public final class EcgCore {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty webSetting;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty ecgDevice;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty context;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty appName;
    public static final /* synthetic */ KProperty[] a = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(EcgCore.class), "webSetting", "getWebSetting()Lcom/huami/ecg/core/web/EcgWebSetting;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(EcgCore.class), "ecgDevice", "getEcgDevice()Lcom/huami/ecg/core/device/EcgDevice;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(EcgCore.class), DbUtils.Const.Table.CONTEXT, "getContext()Landroid/content/Context;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(EcgCore.class), "appName", "getAppName()Ljava/lang/String;"))};
    public static final EcgCore INSTANCE = new EcgCore();

    static {
        Delegates delegates = Delegates.INSTANCE;
        webSetting = delegates.notNull();
        ecgDevice = delegates.notNull();
        context = delegates.notNull();
        appName = delegates.notNull();
    }

    private EcgCore() {
    }

    @NotNull
    public final String getAppName() {
        return (String) appName.getValue(this, a[3]);
    }

    @NotNull
    public final Context getContext() {
        return (Context) context.getValue(this, a[2]);
    }

    @NotNull
    public final EcgDevice getEcgDevice() {
        return (EcgDevice) ecgDevice.getValue(this, a[1]);
    }

    @NotNull
    public final EcgWebSetting getWebSetting() {
        return (EcgWebSetting) webSetting.getValue(this, a[0]);
    }

    public final void initEcg(@NotNull Context context2, @NotNull EcgWebSetting ecgWebSetting, @NotNull EcgDevice ecgDevice2) {
        setContext(context2);
        setWebSetting(ecgWebSetting);
        setAppName(ecgWebSetting.appName());
        setEcgDevice(ecgDevice2);
    }

    public final void setAppName(@NotNull String str) {
        appName.setValue(this, a[3], str);
    }

    public final void setContext(@NotNull Context context2) {
        context.setValue(this, a[2], context2);
    }

    public final void setEcgDevice(@NotNull EcgDevice ecgDevice2) {
        ecgDevice.setValue(this, a[1], ecgDevice2);
    }

    public final void setWebSetting(@NotNull EcgWebSetting ecgWebSetting) {
        webSetting.setValue(this, a[0], ecgWebSetting);
    }
}
