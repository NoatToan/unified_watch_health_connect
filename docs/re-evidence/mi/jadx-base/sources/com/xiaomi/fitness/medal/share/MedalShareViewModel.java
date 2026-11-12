package com.xiaomi.fitness.medal.share;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.lifecycle.MutableLiveData;
import com.xiaomi.fitness.about.utils.MedalUrlsKt;
import com.xiaomi.fitness.account.manager.AccountCoreInfo;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.baseui.BaseViewModel;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.medal.medallist.MedalModel;
import com.xiaomi.fitness.medal.share.MedalShareViewModel;
import defpackage.kfi;
import defpackage.tni;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u001c\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00132\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002J\u0006\u0010\u001e\u001a\u00020\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\f¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/medal/share/MedalShareViewModel;", "Lcom/xiaomi/fitness/baseui/BaseViewModel;", "Lcom/xiaomi/fitness/medal/medallist/MedalModel;", "<init>", "()V", "mUserInfoManager", "Lcom/xiaomi/fitness/account/user/UserInfoManager;", "getMUserInfoManager", "()Lcom/xiaomi/fitness/account/user/UserInfoManager;", "setMUserInfoManager", "(Lcom/xiaomi/fitness/account/user/UserInfoManager;)V", "xiaomiCoreInfo", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/fitness/account/manager/AccountCoreInfo;", "getXiaomiCoreInfo", "()Landroidx/lifecycle/MutableLiveData;", "setXiaomiCoreInfo", "(Landroidx/lifecycle/MutableLiveData;)V", "bitmapQR", "Landroid/graphics/Bitmap;", "getBitmapQR", "createQRBitmap", "", "resources", "Landroid/content/res/Resources;", "saveBitmap", "", "bmp", "file", "", "getAccountCoreInfo", "Companion", "medal_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MedalShareViewModel extends BaseViewModel<MedalModel> {

    @NotNull
    private static final String QR_DIR = "qr";

    @NotNull
    public static final String TAG = "MedalSharePresenter";
    public UserInfoManager mUserInfoManager;

    @NotNull
    private MutableLiveData<AccountCoreInfo> xiaomiCoreInfo = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<Bitmap> bitmapQR = new MutableLiveData<>();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getAccountCoreInfo$lambda$0(MedalShareViewModel this$0, AccountCoreInfo accountCoreInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.d(this$0.getTAG(), "getAccountCoreInfo is " + accountCoreInfo);
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new MedalShareViewModel$getAccountCoreInfo$1$1(this$0, accountCoreInfo, null), 3, null);
        return Unit.INSTANCE;
    }

    private final boolean saveBitmap(Bitmap bmp, String file) throws Throwable {
        if (bmp == null) {
            return false;
        }
        FileOutputStream fileOutputStream = null;
        try {
            try {
                File file2 = new File(file);
                File parentFile = file2.getParentFile();
                if (!parentFile.exists() && !parentFile.mkdirs()) {
                    return false;
                }
                FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
                try {
                    bmp.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream2);
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e) {
                        Logger.e("BitmapUtil", "saveBitmap: ", e.getStackTrace());
                    }
                    return true;
                } catch (Exception e2) {
                    e = e2;
                    fileOutputStream = fileOutputStream2;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e3) {
                            Logger.e("BitmapUtil", "saveBitmap: ", e3.getStackTrace());
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e4) {
            e = e4;
        }
        Logger.e("BitmapUtil", "saveBitmap: ", e.getStackTrace());
        if (fileOutputStream != null) {
            try {
                fileOutputStream.close();
            } catch (IOException e5) {
                Logger.e("BitmapUtil", "saveBitmap: ", e5.getStackTrace());
            }
        }
        return false;
    }

    public final void createQRBitmap(@NotNull Resources resources) throws Throwable {
        Intrinsics.checkNotNullParameter(resources, "resources");
        File externalFilesDir = ApplicationExtKt.getApplication().getExternalFilesDir("qr");
        Intrinsics.checkNotNull(externalFilesDir);
        String str = externalFilesDir.getAbsolutePath() + File.separator + "qrLogo.jpg";
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str);
        if (bitmapDecodeFile != null) {
            Logger.d(getTAG(), " Get QR_Logo bitmap from file exist!");
            this.bitmapQR.setValue(bitmapDecodeFile);
            return;
        }
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(resources, tni.f34875b);
        Logger.d(getTAG(), "logoBitmap == " + bitmapDecodeResource);
        Bitmap bitmapC = kfi.c(MedalUrlsKt.getQRCodeDownloadHtmlUrl(), ExtUtilsKt.getDp(Float.valueOf(80.0f)), -16777216, bitmapDecodeResource);
        saveBitmap(bitmapC, str);
        this.bitmapQR.setValue(bitmapC);
        Logger.d(getTAG(), " Get QR_Logo bitmap from file failed need download!");
    }

    public final void getAccountCoreInfo() {
        UserInfoManager.getAccountCoreInfo$default(getMUserInfoManager(), false, new Function1() { // from class: qhf
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MedalShareViewModel.getAccountCoreInfo$lambda$0(this.f31523a, (AccountCoreInfo) obj);
            }
        }, 1, null);
    }

    @NotNull
    public final MutableLiveData<Bitmap> getBitmapQR() {
        return this.bitmapQR;
    }

    @NotNull
    public final UserInfoManager getMUserInfoManager() {
        UserInfoManager userInfoManager = this.mUserInfoManager;
        if (userInfoManager != null) {
            return userInfoManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mUserInfoManager");
        return null;
    }

    @NotNull
    public final MutableLiveData<AccountCoreInfo> getXiaomiCoreInfo() {
        return this.xiaomiCoreInfo;
    }

    public final void setMUserInfoManager(@NotNull UserInfoManager userInfoManager) {
        Intrinsics.checkNotNullParameter(userInfoManager, "<set-?>");
        this.mUserInfoManager = userInfoManager;
    }

    public final void setXiaomiCoreInfo(@NotNull MutableLiveData<AccountCoreInfo> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.xiaomiCoreInfo = mutableLiveData;
    }
}
