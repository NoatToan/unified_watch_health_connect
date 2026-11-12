package com.xiaomi.fitness.electronic.scale.schema;

import android.content.Context;
import android.net.Uri;
import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fitness.electronic.scale.OTALogExtKt;
import com.xiaomi.fitness.electronic.scale.export.EcoDialogHelper;
import com.xiaomi.fitness.electronic.scale.export.EcoShareDialogExtKt;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleRequest;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleRequestExtKt;
import com.xiaomi.fitness.electronic.scale.export.InviteCallback;
import com.xiaomi.fitness.electronic.scale.export.bean.ScaleData;
import com.xiaomi.fitness.electronic.scale.schema.ShareDeviceSchema;
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
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0014J0\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0015H\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/schema/ShareDeviceSchema;", "Lcom/xiaomi/fitness/schema/export/IntentSchemeHandle;", "<init>", "()V", "parameterList", "Ljava/util/ArrayList;", "", "pathList", "", "doProcess", "", "context", "Landroid/content/Context;", SportRecordBundleKey.BUNDLE_PARAM_URI, "Landroid/net/Uri;", "createShare", "baseContext", "userId", "shareUserId", "shareId", "type", "", "Companion", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ShareDeviceSchema extends IntentSchemeHandle {

    @NotNull
    public static final String PAGE_YUN_MAI_MAIN = "ecoLandingPage";
    public static final int TYPE_ACCEPT = 1;
    public static final int TYPE_DENIED = 2;

    @NotNull
    private ArrayList<String> parameterList = CollectionsKt__CollectionsKt.arrayListOf("ecoLandingPage");

    /* JADX INFO: Access modifiers changed from: private */
    public final void createShare(Context baseContext, String userId, String shareUserId, String shareId, int type) {
        ElectronicScaleRequest.DefaultImpls.acceptShare$default(ElectronicScaleRequestExtKt.getInstance(ElectronicScaleRequest.INSTANCE), userId, shareUserId, shareId, type, null, new Function1() { // from class: p5m
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ShareDeviceSchema.createShare$lambda$0((ScaleData) obj);
            }
        }, new Function1() { // from class: q5m
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ShareDeviceSchema.createShare$lambda$1((String) obj);
            }
        }, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createShare$lambda$0(ScaleData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createShare$lambda$1(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    @Override // defpackage.y0c
    public void doProcess(@NotNull final Context context, @NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        final String queryParameter = uri.getQueryParameter("userId");
        final String queryParameter2 = uri.getQueryParameter("shareUserId");
        final String queryParameter3 = uri.getQueryParameter("shareId");
        if (queryParameter != null && queryParameter.length() != 0 && queryParameter3 != null && queryParameter3.length() != 0 && queryParameter2 != null && queryParameter2.length() != 0) {
            EcoShareDialogExtKt.getInstance(EcoDialogHelper.INSTANCE).showDialog((FragmentActivity) context, queryParameter.toString(), "", new InviteCallback() { // from class: com.xiaomi.fitness.electronic.scale.schema.ShareDeviceSchema.doProcess.1
                @Override // com.xiaomi.fitness.electronic.scale.export.InviteCallback
                public void onAccepted() {
                    ShareDeviceSchema.this.createShare(context, queryParameter, queryParameter2, queryParameter3, 1);
                }

                @Override // com.xiaomi.fitness.electronic.scale.export.InviteCallback
                public void onDenied() {
                    ShareDeviceSchema.this.createShare(context, queryParameter, queryParameter2, queryParameter3, 2);
                }
            });
            return;
        }
        OTALogExtKt.loge("ShareDeviceSchema#doProcess, userId:" + queryParameter + ", shareUserId:" + queryParameter2 + ", shareId:" + queryParameter3);
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
