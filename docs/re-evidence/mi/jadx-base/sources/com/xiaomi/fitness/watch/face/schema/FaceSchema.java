package com.xiaomi.fitness.watch.face.schema;

import android.content.Context;
import android.net.Uri;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.schema.export.IntentSchemeHandle;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import com.xiaomi.fitness.watch.face.FaceTabListFragment;
import com.xiaomi.fitness.watch.face.export.FaceHelper;
import com.xiaomi.fitness.watch.face.export.FaceHelperExtKt;
import com.xiaomi.fitness.watch.face.export.FaceHelperImpl;
import defpackage.p1j;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0014J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000eH\u0016¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/watch/face/schema/FaceSchema;", "Lcom/xiaomi/fitness/schema/export/IntentSchemeHandle;", "<init>", "()V", "parameterList", "Ljava/util/ArrayList;", "", "pathList", "", "doProcess", "", "context", "Landroid/content/Context;", SportRecordBundleKey.BUNDLE_PARAM_URI, "Landroid/net/Uri;", "canHandle", "", "Companion", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FaceSchema extends IntentSchemeHandle {

    @NotNull
    public static final String FACE_PAGE_MAIN = "main";

    @NotNull
    public static final String FACE_PAGE_TAB = "tab";

    @NotNull
    public static final String FACE_PAGE_TYPE = "face_page";

    @NotNull
    public static final String PAGE_TYPE_FACE_ENTRANCE = "face_entrance";

    @NotNull
    private static final String TAG = "FaceSchema";

    /* JADX WARN: Code duplicated, block: B:6:0x003c  */
    @Override // com.xiaomi.fitness.schema.export.IntentSchemeHandle, defpackage.y0c, defpackage.wfl
    public boolean canHandle(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        ArrayList<String> arrayListParameterList = parameterList();
        String queryParameter = uri.getQueryParameter("pageType");
        if (!Intrinsics.areEqual(getAUTHORITY(), uri.getAuthority())) {
            if (Intrinsics.areEqual(getAUTHORITY() + ".xiaomi.com", uri.getAuthority())) {
                if (!Intrinsics.areEqual(uri.getScheme(), "wearable") && CollectionsKt___CollectionsKt.contains(arrayListParameterList, queryParameter)) {
                    return true;
                }
            }
        } else if (!Intrinsics.areEqual(uri.getScheme(), "wearable")) {
        }
        return false;
    }

    @Override // defpackage.y0c
    public void doProcess(@NotNull Context context, @NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        String queryParameter = uri.getQueryParameter("pageType");
        String queryParameter2 = uri.getQueryParameter(FACE_PAGE_TYPE);
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null || !wearableDeviceModel.getIsDeviceConnected()) {
            Logger.i(TAG, "doProcess return, deviceModel: " + wearableDeviceModel);
            ToastExtKt.toastShort(context, p1j.f);
            return;
        }
        if (Intrinsics.areEqual(queryParameter, PAGE_TYPE_FACE_ENTRANCE)) {
            if (Intrinsics.areEqual(queryParameter2, FACE_PAGE_MAIN)) {
                FaceHelper faceHelperExtKt = FaceHelperExtKt.getInstance(FaceHelper.INSTANCE);
                Intrinsics.checkNotNull(faceHelperExtKt, "null cannot be cast to non-null type com.xiaomi.fitness.watch.face.export.FaceHelperImpl");
                ((FaceHelperImpl) faceHelperExtKt).gotoFacePage(context, "");
            } else if (Intrinsics.areEqual(queryParameter2, FACE_PAGE_TAB)) {
                String queryParameter3 = uri.getQueryParameter(FaceTabListFragment.TAB_ID);
                String str = queryParameter3 != null ? queryParameter3 : "";
                FaceHelper faceHelperExtKt2 = FaceHelperExtKt.getInstance(FaceHelper.INSTANCE);
                Intrinsics.checkNotNull(faceHelperExtKt2, "null cannot be cast to non-null type com.xiaomi.fitness.watch.face.export.FaceHelperImpl");
                ((FaceHelperImpl) faceHelperExtKt2).gotoFaceTabList(context, str, "push", "push");
            }
        }
    }

    @Override // com.xiaomi.fitness.schema.export.IntentSchemeHandle
    @NotNull
    public List<String> pathList() {
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @Override // com.xiaomi.fitness.schema.export.IntentSchemeHandle
    @NotNull
    public ArrayList<String> parameterList() {
        return CollectionsKt__CollectionsKt.arrayListOf(PAGE_TYPE_FACE_ENTRANCE);
    }
}
