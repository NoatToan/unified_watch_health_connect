package com.huami.member_card;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AlertDialog;
import androidx.exifinterface.media.ExifInterface;
import com.amap.api.mapcore.util.hl;
import com.huami.bluetooth.profile.channel.module.member_card.BarcodeType;
import com.huami.lib.qrcode.QRCodeActivity;
import com.huami.lib.qrcode.gallery.QRCodeGalleryActivity;
import com.huami.member_card.MemberQRCodeActivity;
import com.huami.member_card.bean.HmFormatCodeType;
import com.huami.member_card.databinding.MembershipAlerNotificationDialogBinding;
import com.huami.member_card.fragment.MembershipHomeFragment;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.tools.log.HMLog;
import com.huami.utils.easypermission.EasyPermissions;
import com.huami.utils.easypermission.PermissionDialogFragmentCompat;
import com.loc.z;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0007\u0018\u0000 *2\u00020\u0001:\u0001*B\u0007¢\u0006\u0004\b(\u0010)J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\b\u0010\u0007\u001a\u00020\u0002H\u0014J\b\u0010\b\u001a\u00020\u0002H\u0014J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u00020\u0002H\u0017J\u001e\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u0010H\u0017J\b\u0010\u0013\u001a\u00020\u0002H\u0014J\u0010\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0014J\b\u0010\u0017\u001a\u00020\u0002H\u0014R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006+"}, d2 = {"Lcom/huami/member_card/MemberQRCodeActivity;", "Lcom/huami/lib/qrcode/QRCodeActivity;", "", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onResume", "onPause", "", "getScanTips", "", "shouldShowGalleryEntryPoint", "showPermissionDescriptionDialog", "", "requestCode", "", "permissions", "onPermissionsDenied", "gotoGallery", "Landroid/content/Intent;", "intent", "handleResult", "onDestroy", "Landroidx/appcompat/app/AlertDialog;", "h", "Landroidx/appcompat/app/AlertDialog;", "failedDialog", "Landroid/os/CountDownTimer;", "i", "Landroid/os/CountDownTimer;", "countDownTimer", "", z.j, "J", "millisInFuture", "", hl.k, "[I", "supportCodeArray", "<init>", "()V", "Companion", "member_card_release"}, k = 1, mv = {1, 5, 1})
public final class MemberQRCodeActivity extends QRCodeActivity {
    private static final long l = 1000;

    @NotNull
    private static final String m = "MemberQRCodeActivity";

    @NotNull
    private static final String n = "member_scan_gallery";

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private AlertDialog failedDialog;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private CountDownTimer countDownTimer;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final long millisInFuture = 60000;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private int[] supportCodeArray;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Integer a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Integer num) {
            super(0);
            this.a = num;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "not support code type " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "not support code data length";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A() {
        boolean z = false;
        if (this.failedDialog == null) {
            MembershipAlerNotificationDialogBinding membershipAlerNotificationDialogBindingInflate = MembershipAlerNotificationDialogBinding.inflate(getLayoutInflater(), null, false);
            this.failedDialog = new AlertDialog.Builder(this).setView(membershipAlerNotificationDialogBindingInflate.getRoot()).setCancelable(false).create();
            membershipAlerNotificationDialogBindingInflate.memberCardAlertMsg.setText(getString(R.string.scan_failed));
            membershipAlerNotificationDialogBindingInflate.memberBtnKnown.setText(getString(R.string.i_know));
            Button button = membershipAlerNotificationDialogBindingInflate.memberBtnKnown;
            if (button != null) {
                button.setOnClickListener(new View.OnClickListener() { // from class: ty4
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        MemberQRCodeActivity.B(this.a, view);
                    }
                });
            }
        }
        AlertDialog alertDialog = this.failedDialog;
        if (alertDialog != null && !alertDialog.isShowing()) {
            z = true;
        }
        if (z) {
            AlertDialog alertDialog2 = this.failedDialog;
            if (alertDialog2 != null) {
                alertDialog2.show();
            }
            Analytics.recordEvent(new CountEventBuilder(MemberStatisticalKt.EVENTID_MEMBERSHIPCARD_ADD_FAILED_C));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(MemberQRCodeActivity memberQRCodeActivity, View view) {
        AlertDialog alertDialog = memberQRCodeActivity.failedDialog;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        memberQRCodeActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(MemberQRCodeActivity memberQRCodeActivity) {
        memberQRCodeActivity.A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(MemberQRCodeActivity memberQRCodeActivity) {
        memberQRCodeActivity.A();
    }

    @Override // com.huami.lib.qrcode.QRCodeActivity
    @NotNull
    public String getScanTips() {
        return getString(R.string.member_scan_tips);
    }

    @Override // com.huami.lib.qrcode.QRCodeActivity
    public void gotoGallery() {
        super.gotoGallery();
        Analytics.recordEvent(new CountEventBuilder(MemberStatisticalKt.EVENTID_MEMBERSHIPCARD_SCAN_CODE_C).addExtra("type", "1"));
    }

    @Override // com.huami.lib.qrcode.QRCodeActivity
    public boolean handleResult(@NotNull Intent intent) {
        byte[] bytes;
        String stringExtra = intent.getStringExtra("SCAN_RESULT_FORMAT");
        Integer numDes2Value = stringExtra == null ? null : HmFormatCodeType.INSTANCE.des2Value(stringExtra);
        if (numDes2Value != null) {
            int[] iArr = this.supportCodeArray;
            if (ArraysKt___ArraysKt.contains(iArr != null ? iArr : null, numDes2Value.intValue())) {
                String stringExtra2 = intent.getStringExtra("SCAN_RESULT");
                int length = 0;
                if (stringExtra2 != null && (bytes = stringExtra2.getBytes(Charsets.UTF_8)) != null) {
                    length = bytes.length;
                }
                if (length <= 512) {
                    return super.handleResult(intent);
                }
                HMLog.info(m, b.a);
                runOnUiThread(new Runnable() { // from class: uy4
                    @Override // java.lang.Runnable
                    public final void run() {
                        MemberQRCodeActivity.z(this.a);
                    }
                });
                return true;
            }
        }
        HMLog.info(m, new a(numDes2Value));
        runOnUiThread(new Runnable() { // from class: vy4
            @Override // java.lang.Runnable
            public final void run() {
                MemberQRCodeActivity.y(this.a);
            }
        });
        return true;
    }

    @Override // com.huami.lib.qrcode.QRCodeActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.countDownTimer = new CountDownTimer(this.millisInFuture) { // from class: com.huami.member_card.MemberQRCodeActivity.onCreate.1
            @Override // android.os.CountDownTimer
            public void onFinish() {
                MemberQRCodeActivity.this.A();
            }

            @Override // android.os.CountDownTimer
            public void onTick(long millisUntilFinished) {
            }
        };
        Analytics.recordEvent(new CountEventBuilder(MemberStatisticalKt.EVENTID_MEMBERSHIPCARD_SCAN_CODE_C).addExtra("type", "0"));
        int[] intArrayExtra = getIntent().getIntArrayExtra(MembershipHomeFragment.SUPPORT_CODE_LIST);
        if (intArrayExtra == null) {
            BarcodeType[] barcodeTypeArrValues = BarcodeType.values();
            ArrayList arrayList = new ArrayList(barcodeTypeArrValues.length);
            for (BarcodeType barcodeType : barcodeTypeArrValues) {
                arrayList.add(Integer.valueOf(barcodeType.getValue()));
            }
            intArrayExtra = CollectionsKt___CollectionsKt.toIntArray(arrayList);
        }
        this.supportCodeArray = intArrayExtra;
    }

    @Override // com.huami.lib.qrcode.QRCodeActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        AlertDialog alertDialog = this.failedDialog;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        super.onDestroy();
    }

    @Override // com.huami.lib.qrcode.QRCodeActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        CountDownTimer countDownTimer = this.countDownTimer;
        if (countDownTimer == null) {
            return;
        }
        countDownTimer.cancel();
    }

    @Override // com.huami.lib.qrcode.QRCodeActivity
    @SuppressLint({"RestrictedApi"})
    public void onPermissionsDenied(int requestCode, @NotNull List<String> permissions) {
        if (EasyPermissions.somePermissionPermanentlyDenied(this, permissions)) {
            new PermissionDialogFragmentCompat.Builder().setMessage(getString(R.string.relatives_qrcode_photo_permission_text)).setRequestKey(n).create().show(getSupportFragmentManager(), "");
        }
    }

    @Override // com.huami.lib.qrcode.QRCodeActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        CountDownTimer countDownTimer = this.countDownTimer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        CountDownTimer countDownTimer2 = this.countDownTimer;
        if (countDownTimer2 == null) {
            return;
        }
        countDownTimer2.start();
    }

    @Override // com.huami.lib.qrcode.QRCodeActivity
    public boolean shouldShowGalleryEntryPoint() {
        return true;
    }

    @Override // com.huami.lib.qrcode.QRCodeActivity
    @SuppressLint({"RestrictedApi"})
    public void showPermissionDescriptionDialog() {
        EasyPermissions.requestPermissions(this, getString(R.string.relatives_qrcode_photo_permission_text), QRCodeGalleryActivity.REQUEST_PERMISSION_CODE_STORAGE, n, "android.permission.READ_EXTERNAL_STORAGE");
    }
}
