package com.xiaomi.fitness.electronic.scale.schema;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.xiaomi.fitness.electronic.scale.MainActivity;
import com.xiaomi.fitness.schema.export.IntentSchemeHandle;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0014R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/schema/YunMaiPageScheme;", "Lcom/xiaomi/fitness/schema/export/IntentSchemeHandle;", "<init>", "()V", "parameterList", "Ljava/util/ArrayList;", "", "pathList", "", "doProcess", "", "context", "Landroid/content/Context;", SportRecordBundleKey.BUNDLE_PARAM_URI, "Landroid/net/Uri;", "Companion", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class YunMaiPageScheme extends IntentSchemeHandle {

    @NotNull
    public static final String PAGE_YUN_MAI_MAIN = "ecoLandingPage";

    @NotNull
    private ArrayList<String> parameterList = CollectionsKt__CollectionsKt.arrayListOf("ecoLandingPage");

    @Override // defpackage.y0c
    public void doProcess(@NotNull Context context, @NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        String queryParameter = uri.getQueryParameter("pageType");
        String queryParameter2 = uri.getQueryParameter("did");
        String queryParameter3 = uri.getQueryParameter("model");
        if (queryParameter2 == null || queryParameter2.length() == 0 || queryParameter3 == null || queryParameter3.length() == 0 || !Intrinsics.areEqual(queryParameter, "ecoLandingPage")) {
            return;
        }
        Intent intent = new Intent();
        intent.setClass(context, MainActivity.class);
        intent.putExtra("did", queryParameter2.toString());
        intent.putExtra("mode", queryParameter3.toString());
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    @Override // com.xiaomi.fitness.schema.export.IntentSchemeHandle
    @NotNull
    public List<String> pathList() {
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @Override // com.xiaomi.fitness.schema.export.IntentSchemeHandle
    @NotNull
    public ArrayList<String> parameterList() {
        return this.parameterList;
    }
}
