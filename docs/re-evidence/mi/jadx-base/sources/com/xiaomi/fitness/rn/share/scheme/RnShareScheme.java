package com.xiaomi.fitness.rn.share.scheme;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.main.export.MainExtKt;
import com.xiaomi.fitness.main.export.MainTab;
import com.xiaomi.fitness.schema.export.IntentSchemeHandle;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\fH\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\fH\u0016J\b\u0010\u000e\u001a\u00020\u0006H\u0014J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\nH\u0014R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/rn/share/scheme/RnShareScheme;", "Lcom/xiaomi/fitness/schema/export/IntentSchemeHandle;", "<init>", "()V", "pageList", "Ljava/util/ArrayList;", "", "canHandle", "", SportRecordBundleKey.BUNDLE_PARAM_URI, "Landroid/net/Uri;", "parameterList", "", "pathList", "authority", "doProcess", "", "context", "Landroid/content/Context;", "Companion", "share_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RnShareScheme extends IntentSchemeHandle {

    @NotNull
    private ArrayList<String> pageList = CollectionsKt__CollectionsKt.arrayListOf("shareDevices");

    @Override // com.xiaomi.fitness.schema.export.IntentSchemeHandle, defpackage.y0c
    @NotNull
    /* JADX INFO: renamed from: authority */
    public String getAUTHORITY() {
        return IntentSchemeHandle.INSTANCE.getSAuthority();
    }

    @Override // com.xiaomi.fitness.schema.export.IntentSchemeHandle, defpackage.y0c, defpackage.wfl
    public boolean canHandle(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return super.canHandle(uri) && CollectionsKt___CollectionsKt.contains(this.pageList, uri.getQueryParameter("pageType"));
    }

    @Override // defpackage.y0c
    public void doProcess(@NotNull Context context, @NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        String queryParameter = uri.getQueryParameter("pageType");
        String queryParameter2 = uri.getQueryParameter("son_page");
        Bundle bundle = new Bundle();
        bundle.putString(MainTab.PAGE_TYPE, queryParameter);
        bundle.putString(MainTab.SON_PAGE_TYPE, queryParameter2);
        bundle.putInt("key_tab", MainTab.INSTANCE.getINDEX_DEVICE());
        MainExtKt.showMainActivity(AppUtil.getApp(), null, bundle);
    }

    @Override // com.xiaomi.fitness.schema.export.IntentSchemeHandle
    @NotNull
    public List<String> parameterList() {
        return this.pageList;
    }

    @Override // com.xiaomi.fitness.schema.export.IntentSchemeHandle
    @NotNull
    public List<String> pathList() {
        return new ArrayList();
    }
}
