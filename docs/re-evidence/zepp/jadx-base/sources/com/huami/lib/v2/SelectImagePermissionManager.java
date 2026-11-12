package com.huami.lib.v2;

import androidx.fragment.app.FragmentActivity;
import com.huami.lib.SelectImagePage;
import com.huami.utils.permissionx.business.PermissionXKt;
import com.huami.utils.permissionx.dsl.RequestPermissionDsl;
import com.huami.watch.notification.TransportUri;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\"\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004H\u0002J:\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0017\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b0\u0010¢\u0006\u0002\b\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J:\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0017\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b0\u0010¢\u0006\u0002\b\u0012H\u0007¢\u0006\u0004\b\u0016\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/huami/lib/v2/SelectImagePermissionManager;", "", "Landroidx/fragment/app/FragmentActivity;", "activity", "Lcom/huami/lib/SelectImagePage;", "selectImagePage", "Lcom/huami/lib/v2/RequestPermissionCallback;", "callback", "", "checkStoragePermission", "checkCameraPermission", "", "isCamera", DTransferConstants.PAGE, "", "a", "Lkotlin/Function1;", "Lcom/huami/utils/permissionx/dsl/RequestPermissionDsl;", "Lkotlin/ExtensionFunctionType;", TransportUri.ACTION_BLOCK, "_checkStoragePermission", "(Landroidx/fragment/app/FragmentActivity;Lcom/huami/lib/SelectImagePage;Lkotlin/jvm/functions/Function1;)V", "_checkCameraPermission", "<init>", "()V", "zeppPermission_release"}, k = 1, mv = {1, 5, 1})
public final class SelectImagePermissionManager {

    @NotNull
    public static final SelectImagePermissionManager INSTANCE = new SelectImagePermissionManager();

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SelectImagePage.values().length];
            iArr[SelectImagePage.BASE.ordinal()] = 1;
            iArr[SelectImagePage.WATCH_FACE.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private SelectImagePermissionManager() {
    }

    public static /* synthetic */ void _checkCameraPermission$default(SelectImagePermissionManager selectImagePermissionManager, FragmentActivity fragmentActivity, SelectImagePage selectImagePage, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            selectImagePage = SelectImagePage.BASE;
        }
        selectImagePermissionManager._checkCameraPermission(fragmentActivity, selectImagePage, function1);
    }

    public static /* synthetic */ void _checkStoragePermission$default(SelectImagePermissionManager selectImagePermissionManager, FragmentActivity fragmentActivity, SelectImagePage selectImagePage, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            selectImagePage = SelectImagePage.BASE;
        }
        selectImagePermissionManager._checkStoragePermission(fragmentActivity, selectImagePage, function1);
    }

    private final String a(boolean isCamera, SelectImagePage page) {
        int i = WhenMappings.$EnumSwitchMapping$0[page.ordinal()];
        if (i == 1) {
            return isCamera ? "key_image_select_camera" : "key_image_select_photo";
        }
        if (i == 2) {
            return isCamera ? "key_image_select_camera_watch_face" : "key_image_select_photo_watch_face";
        }
        throw new NoWhenBranchMatchedException();
    }

    @JvmStatic
    @JvmOverloads
    public static final void checkCameraPermission(@NotNull FragmentActivity activity, @NotNull SelectImagePage selectImagePage, @NotNull RequestPermissionCallback callback) {
        INSTANCE._checkCameraPermission(activity, selectImagePage, RequestPermissionCallbackKt.requestDslToCallback(callback, "android.permission.CAMERA"));
    }

    @JvmStatic
    @JvmOverloads
    public static final void checkCameraPermission(@NotNull FragmentActivity fragmentActivity, @NotNull RequestPermissionCallback requestPermissionCallback) {
        checkCameraPermission$default(fragmentActivity, null, requestPermissionCallback, 2, null);
    }

    public static /* synthetic */ void checkCameraPermission$default(FragmentActivity fragmentActivity, SelectImagePage selectImagePage, RequestPermissionCallback requestPermissionCallback, int i, Object obj) {
        if ((i & 2) != 0) {
            selectImagePage = SelectImagePage.BASE;
        }
        checkCameraPermission(fragmentActivity, selectImagePage, requestPermissionCallback);
    }

    @JvmStatic
    @JvmOverloads
    public static final void checkStoragePermission(@NotNull FragmentActivity activity, @NotNull SelectImagePage selectImagePage, @NotNull RequestPermissionCallback callback) {
        INSTANCE._checkStoragePermission(activity, selectImagePage, RequestPermissionCallbackKt.requestDslToCallback(callback, "android.permission.WRITE_EXTERNAL_STORAGE"));
    }

    @JvmStatic
    @JvmOverloads
    public static final void checkStoragePermission(@NotNull FragmentActivity fragmentActivity, @NotNull RequestPermissionCallback requestPermissionCallback) {
        checkStoragePermission$default(fragmentActivity, null, requestPermissionCallback, 2, null);
    }

    public static /* synthetic */ void checkStoragePermission$default(FragmentActivity fragmentActivity, SelectImagePage selectImagePage, RequestPermissionCallback requestPermissionCallback, int i, Object obj) {
        if ((i & 2) != 0) {
            selectImagePage = SelectImagePage.BASE;
        }
        checkStoragePermission(fragmentActivity, selectImagePage, requestPermissionCallback);
    }

    @JvmName(name = "_checkCameraPermission")
    public final void _checkCameraPermission(@NotNull FragmentActivity activity, @NotNull SelectImagePage selectImagePage, @NotNull Function1<? super RequestPermissionDsl, Unit> block) {
        PermissionXKt.withPermission$default(activity, "android.permission.CAMERA", a(true, selectImagePage), null, null, block, 12, null);
    }

    @JvmName(name = "_checkStoragePermission")
    public final void _checkStoragePermission(@NotNull FragmentActivity activity, @NotNull SelectImagePage selectImagePage, @NotNull Function1<? super RequestPermissionDsl, Unit> block) {
        PermissionXKt.withPermission$default(activity, "android.permission.WRITE_EXTERNAL_STORAGE", a(false, selectImagePage), null, null, block, 12, null);
    }
}
