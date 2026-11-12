package com.xiaomi.fitness.main.scheme;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.main.export.MainExtKt;
import com.xiaomi.fitness.main.export.MainTab;
import com.xiaomi.fitness.schema.export.IntentSchemeHandle;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\rH\u0016J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\rH\u0016J\b\u0010\u000f\u001a\u00020\u0006H\u0014J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u000bH\u0014R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/main/scheme/MainPageScheme;", "Lcom/xiaomi/fitness/schema/export/IntentSchemeHandle;", "<init>", "()V", "map", "", "", "", "canHandle", "", SportRecordBundleKey.BUNDLE_PARAM_URI, "Landroid/net/Uri;", "parameterList", "", "pathList", "authority", "doProcess", "", "context", "Landroid/content/Context;", "Companion", "main_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MainPageScheme extends IntentSchemeHandle {

    @NotNull
    private Map<String, Integer> map;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String sAuthority = "intent";

    @NotNull
    private static final String sPathStatustab = "statustab";

    @NotNull
    private static final String sPathSporttab = "sporttab";

    @NotNull
    private static final String sPathHealthtab = "healthtab";

    @NotNull
    private static final String sPathMinetab = "minetab";

    @NotNull
    private static final String sPathDevicetab = "devicetab";

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/main/scheme/MainPageScheme$Companion;", "", "<init>", "()V", "sAuthority", "", "getSAuthority", "()Ljava/lang/String;", "sPathStatustab", "getSPathStatustab", "sPathSporttab", "getSPathSporttab", "sPathHealthtab", "getSPathHealthtab", "sPathMinetab", "getSPathMinetab", "sPathDevicetab", "getSPathDevicetab", "main_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getSAuthority() {
            return MainPageScheme.sAuthority;
        }

        @NotNull
        public final String getSPathDevicetab() {
            return MainPageScheme.sPathDevicetab;
        }

        @NotNull
        public final String getSPathHealthtab() {
            return MainPageScheme.sPathHealthtab;
        }

        @NotNull
        public final String getSPathMinetab() {
            return MainPageScheme.sPathMinetab;
        }

        @NotNull
        public final String getSPathSporttab() {
            return MainPageScheme.sPathSporttab;
        }

        @NotNull
        public final String getSPathStatustab() {
            return MainPageScheme.sPathStatustab;
        }
    }

    public MainPageScheme() {
        String str = sPathStatustab;
        MainTab.Companion companion = MainTab.INSTANCE;
        this.map = MapsKt__MapsKt.mapOf(TuplesKt.to(str, Integer.valueOf(companion.getINDEX_HEALTH())), TuplesKt.to(sPathSporttab, Integer.valueOf(companion.getINDEX_SPORT())), TuplesKt.to(sPathHealthtab, Integer.valueOf(companion.getINDEX_HEALTH())), TuplesKt.to(sPathMinetab, Integer.valueOf(companion.getINDEX_ME())), TuplesKt.to(sPathDevicetab, Integer.valueOf(companion.getINDEX_DEVICE())));
    }

    @Override // com.xiaomi.fitness.schema.export.IntentSchemeHandle, defpackage.y0c
    @NotNull
    /* JADX INFO: renamed from: authority */
    public String getAUTHORITY() {
        return sAuthority;
    }

    @Override // com.xiaomi.fitness.schema.export.IntentSchemeHandle, defpackage.y0c, defpackage.wfl
    public boolean canHandle(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return super.canHandle(uri) && CollectionsKt___CollectionsKt.contains(this.map.keySet(), uri.getQueryParameter("pageType"));
    }

    @Override // defpackage.y0c
    public void doProcess(@NotNull Context context, @NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        String queryParameter = uri.getQueryParameter("pageType");
        String queryParameter2 = uri.getQueryParameter("nfc");
        Integer num = this.map.get(queryParameter);
        Bundle bundle = new Bundle();
        if (Intrinsics.areEqual("1", queryParameter2)) {
            String queryParameter3 = uri.getQueryParameter("act");
            String queryParameter4 = uri.getQueryParameter("card_name");
            if (Intrinsics.areEqual(queryParameter3, "0")) {
                String queryParameter5 = uri.getQueryParameter("mailbox_id");
                Logger.i("FITNESS.PUSH", "mailboxId:" + queryParameter5);
                if (queryParameter5 == null) {
                    Logger.i("FITNESS.PUSH", "mailboxId is null");
                    return;
                } else {
                    bundle.putString("mailbox_id", queryParameter5);
                    bundle.putBoolean("nfc", true);
                    bundle.putInt("act", 0);
                }
            } else if (Intrinsics.areEqual(queryParameter3, "1")) {
                bundle.putBoolean("nfc", true);
                bundle.putInt("act", 1);
                bundle.putString("card_name", queryParameter4);
            }
        }
        bundle.putInt("key_tab", num != null ? num.intValue() : MainTab.INSTANCE.getINDEX_HEALTH());
        MainExtKt.showMainActivity(AppUtil.getApp(), null, bundle);
    }

    @Override // com.xiaomi.fitness.schema.export.IntentSchemeHandle
    @NotNull
    public List<String> parameterList() {
        return CollectionsKt___CollectionsKt.toList(this.map.keySet());
    }

    @Override // com.xiaomi.fitness.schema.export.IntentSchemeHandle
    @NotNull
    public List<String> pathList() {
        return new ArrayList();
    }
}
