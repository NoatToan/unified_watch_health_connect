package com.xiaomi.fitness.watch.face.export;

import android.content.Context;
import android.widget.ImageView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.watch.face.FaceInfoBase;
import com.xiaomi.fitness.watch.face.data.FaceEntranceRespV4;
import com.xiaomi.fitness.watch.face.export.data.FaceData;
import com.xiaomi.fitness.watch.face.export.data.WatchFace;
import com.xiaomi.fitness.watch.face.export.exportview.FaceInfoView;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 <2\u00020\u0001:\u0001<J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J0\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H&J\u001a\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\nH&J\u001a\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u0005H&J\u0012\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\nH&J8\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001d2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00030\u001f2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u001fH&JB\u0010\"\u001a\u00020\u00032\b\u0010#\u001a\u0004\u0018\u00010\n2\b\u0010$\u001a\u0004\u0018\u00010\n2\u0006\u0010%\u001a\u00020\n2\b\b\u0002\u0010&\u001a\u00020\f2\b\b\u0002\u0010'\u001a\u00020\n2\b\b\u0002\u0010(\u001a\u00020\nH&J \u0010)\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010*\u001a\u00020+2\u0006\u0010&\u001a\u00020\fH&J*\u0010,\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010-\u001a\u00020\n2\u0006\u0010%\u001a\u00020\n2\b\b\u0002\u0010(\u001a\u00020\nH&J\u0012\u0010.\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\nH&J\u0010\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\nH&J\u0018\u00102\u001a\u00020\u00032\u0006\u00101\u001a\u00020\n2\u0006\u00103\u001a\u000204H&J\u0010\u00105\u001a\u0002042\u0006\u00101\u001a\u00020\nH&J\u0014\u00106\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020807H&J\u0010\u00109\u001a\u00020\u00032\u0006\u00103\u001a\u000204H&J\b\u0010:\u001a\u000204H&J\b\u0010;\u001a\u00020\u0003H&¨\u0006="}, d2 = {"Lcom/xiaomi/fitness/watch/face/export/FaceHelper;", "", "loadFace", "", "bottomIcon", "Lcom/xiaomi/fitness/watch/face/export/exportview/FaceInfoView;", "topIcon", "view", "Landroid/widget/ImageView;", "url", "", Constants.DEVICE_TYPE_WEAR, "", "h", "radius", "addFaceEventListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/xiaomi/fitness/watch/face/export/IFaceListener;", "removeFaceEventListener", "gotoFacePage", "context", "Landroid/content/Context;", "newRoute", "loadFaceEntranceImg", "icon", "notifyFaceChanged", FaceInfoBase.FACE_ID, "requestLoadFaceEntranceV4", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "success", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/watch/face/data/FaceEntranceRespV4;", "fail", "gotoFaceDetail", "model", "id", "source", "positionId", "contentSource", "exposeSource", "gotoFaceFromDeviceTab", "faceData", "Lcom/xiaomi/fitness/watch/face/export/data/FaceData;", "gotoFaceTabList", "tabId", "signWatchFace", "getEnterFaceEntranceTime", "", "did", "setFaceEntranceRedPoint", "show", "", "getFaceEntranceRedPoint", "getFaceList", "", "Lcom/xiaomi/fitness/watch/face/export/data/WatchFace;", "showOldMarket", "supportImageSegment", "testDeleteAll", "Companion", "watch-face-export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface FaceHelper {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/watch/face/export/FaceHelper$Companion;", "", "<init>", "()V", "watch-face-export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void gotoFaceDetail$default(FaceHelper faceHelper, String str, String str2, String str3, int i, String str4, String str5, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: gotoFaceDetail");
            }
            if ((i2 & 8) != 0) {
                i = 0;
            }
            faceHelper.gotoFaceDetail(str, str2, str3, i, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? "" : str5);
        }

        public static /* synthetic */ void gotoFacePage$default(FaceHelper faceHelper, Context context, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: gotoFacePage");
            }
            if ((i & 2) != 0) {
                str = "";
            }
            faceHelper.gotoFacePage(context, str);
        }

        public static /* synthetic */ void gotoFaceTabList$default(FaceHelper faceHelper, Context context, String str, String str2, String str3, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: gotoFaceTabList");
            }
            if ((i & 8) != 0) {
                str3 = "";
            }
            faceHelper.gotoFaceTabList(context, str, str2, str3);
        }
    }

    void addFaceEventListener(@NotNull IFaceListener listener);

    long getEnterFaceEntranceTime(@NotNull String did);

    boolean getFaceEntranceRedPoint(@NotNull String did);

    @NotNull
    Map<String, WatchFace> getFaceList();

    void gotoFaceDetail(@Nullable String model, @Nullable String id, @NotNull String source, int positionId, @NotNull String contentSource, @NotNull String exposeSource);

    void gotoFaceFromDeviceTab(@NotNull Context context, @NotNull FaceData faceData, int positionId);

    void gotoFacePage(@NotNull Context context, @NotNull String newRoute);

    void gotoFaceTabList(@NotNull Context context, @NotNull String tabId, @NotNull String source, @NotNull String exposeSource);

    void loadFace(@NotNull ImageView view, @NotNull String url, int w, int h, int radius);

    void loadFace(@NotNull FaceInfoView bottomIcon, @NotNull FaceInfoView topIcon);

    void loadFaceEntranceImg(@Nullable String icon, @NotNull FaceInfoView view);

    void notifyFaceChanged(@Nullable String faceId);

    void removeFaceEventListener(@NotNull IFaceListener listener);

    void requestLoadFaceEntranceV4(@NotNull WearableDeviceModel deviceModel, @NotNull Function1<? super FaceEntranceRespV4, Unit> success, @NotNull Function1<? super Integer, Unit> fail);

    void setFaceEntranceRedPoint(@NotNull String did, boolean show);

    void showOldMarket(boolean show);

    void signWatchFace(@Nullable String faceId);

    boolean supportImageSegment();

    void testDeleteAll();
}
