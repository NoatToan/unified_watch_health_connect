package com.xiaomi.fitness.device.manager;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.mi.health.uri_parser.UriParserExportKt;
import com.mi.health.uri_parser.links.HttpLinkActivity;
import com.xiaomi.fitness.baseui.extension.LaunchExtensionKt;
import com.xiaomi.fitness.device.manager.BindDeviceSchemaHandler;
import com.xiaomi.fitness.schema.export.IntentSchemeHandle;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0014J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0007H\u0014¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/device/manager/BindDeviceSchemaHandler;", "Lcom/xiaomi/fitness/schema/export/IntentSchemeHandle;", "<init>", "()V", "canHandle", "", SportRecordBundleKey.BUNDLE_PARAM_URI, "Landroid/net/Uri;", "parameterList", "", "", "authority", "pathList", "doProcess", "", "context", "Landroid/content/Context;", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BindDeviceSchemaHandler extends IntentSchemeHandle {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit doProcess$lambda$0(Uri uri, Intent it) {
        Intrinsics.checkNotNullParameter(uri, "$uri");
        Intrinsics.checkNotNullParameter(it, "it");
        it.setData(uri);
        it.putExtra(UriParserExportKt.KEY_FROM, 9);
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.schema.export.IntentSchemeHandle, defpackage.y0c
    @NotNull
    /* JADX INFO: renamed from: authority */
    public String getAUTHORITY() {
        return "region.hlth.io.mi.com";
    }

    @Override // com.xiaomi.fitness.schema.export.IntentSchemeHandle, defpackage.y0c, defpackage.wfl
    public boolean canHandle(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return super.canHandle(uri);
    }

    @Override // defpackage.y0c
    public void doProcess(@NotNull Context context, @NotNull final Uri uri) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        com.xiaomi.fit.device.extensions.DeviceModelExtKt.logi("doProcess() called with: context = " + context + ", uri = " + uri);
        LaunchExtensionKt.startActivity(context, (Class<?>) HttpLinkActivity.class, (Function1<? super Intent, Unit>) new Function1() { // from class: uk2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BindDeviceSchemaHandler.doProcess$lambda$0(uri, (Intent) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.schema.export.IntentSchemeHandle
    @NotNull
    public List<String> parameterList() {
        return new ArrayList();
    }

    @Override // com.xiaomi.fitness.schema.export.IntentSchemeHandle
    @NotNull
    public List<String> pathList() {
        return CollectionsKt__CollectionsKt.arrayListOf("/applinks/peripheral/connect");
    }
}
