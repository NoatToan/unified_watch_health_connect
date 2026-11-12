package com.mi.health.qrcode;

import android.app.Activity;
import android.content.Intent;
import defpackage.gzi;
import defpackage.kb;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a>\u0010\t\u001a\u00020\n*\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\u00012\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"SCAN_ACTIVITY_KEY_TITLE", "", "SCAN_ACTIVITY_KEY_SCAN_DES", "SCAN_ACTIVITY_KEY_MY_QR_CODE", "SCAN_ACTIVITY_KEY_CHOOSE_FROM_GALLERY", "SCAN_ACTIVITY_KEY_GO_TO_MY_QR_CODE_INTENT", "PATH_CAPTURE", "REQUEST_QR_SCAN", "", "launchToQRCodeScan", "", "Landroid/app/Activity;", "title", "desc", "displayMyQRCodeBtn", "", "displayChooseFromGalleryBtn", "goToMyQrCodeIntent", "Landroid/content/Intent;", "qrcode_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class QRCodeExportKt {

    @NotNull
    public static final String PATH_CAPTURE = "/qrcode_scan/activity/capture";
    public static final int REQUEST_QR_SCAN = 666;

    @NotNull
    public static final String SCAN_ACTIVITY_KEY_CHOOSE_FROM_GALLERY = "scan_choose_from_gallery";

    @NotNull
    public static final String SCAN_ACTIVITY_KEY_GO_TO_MY_QR_CODE_INTENT = "scan_go_to_my_qr_code";

    @NotNull
    public static final String SCAN_ACTIVITY_KEY_MY_QR_CODE = "scan_my_qr_code";

    @NotNull
    public static final String SCAN_ACTIVITY_KEY_SCAN_DES = "scan_des";

    @NotNull
    public static final String SCAN_ACTIVITY_KEY_TITLE = "scan_title";

    public static final void launchToQRCodeScan(@NotNull Activity activity, @NotNull String title, @NotNull String desc, boolean z, boolean z2, @Nullable Intent intent) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(desc, "desc");
        kb.c().a(PATH_CAPTURE).withString(SCAN_ACTIVITY_KEY_TITLE, title).withString(SCAN_ACTIVITY_KEY_SCAN_DES, desc).withBoolean(SCAN_ACTIVITY_KEY_MY_QR_CODE, z).withBoolean(SCAN_ACTIVITY_KEY_CHOOSE_FROM_GALLERY, z2).withParcelable("scan_go_to_my_qr_code", intent).withAction("com.xiaomi.wearable.scan.action.QRCODE_SCAN").navigation(activity, REQUEST_QR_SCAN);
    }

    public static /* synthetic */ void launchToQRCodeScan$default(Activity activity, String str, String str2, boolean z, boolean z2, Intent intent, int i, Object obj) {
        if ((i & 1) != 0) {
            str = activity.getString(gzi.c);
        }
        if ((i & 2) != 0) {
            str2 = activity.getString(gzi.f19498b);
        }
        String str3 = str2;
        boolean z3 = (i & 4) != 0 ? false : z;
        boolean z4 = (i & 8) == 0 ? z2 : false;
        if ((i & 16) != 0) {
            intent = null;
        }
        launchToQRCodeScan(activity, str, str3, z3, z4, intent);
    }
}
