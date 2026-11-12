package com.huami.sleepassistant.lib.ui.base;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.exifinterface.media.ExifInterface;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.sleepassistant.lib.R;
import com.huami.sleepassistant.lib.ui.base.BasePermissionActivity;
import com.huami.sleepassistant.lib.ui.base.ext.ViewExKt;
import com.huami.view.basetitle.BaseTitleActivity;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.Objects;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b&\u0010'J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0002J'\u0010\r\u001a\u00020\f2\u000e\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014J/\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\u000e\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010#\u001a\u00020\u00128\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010%\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\"¨\u0006("}, d2 = {"Lcom/huami/sleepassistant/lib/ui/base/BasePermissionActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "", "", b.r, "()[Ljava/lang/String;", "", DTransferConstants.SEARCH_KEY, "o", "permissions", "", "grantResults", "", GoogleApiAvailabilityLight.b, "([Ljava/lang/String;[I)Z", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "", "requestCode", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "Ljava/lang/Runnable;", "x", "Ljava/lang/Runnable;", "runnable", "y", "[Ljava/lang/String;", "permissionArray", "Landroid/view/View;", "z", "Landroid/view/View;", "noPermissionFrame", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, LogUtil.I, "requestPermissionCode", "B", "text", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public class BasePermissionActivity extends BaseTitleActivity {

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private int text;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @Nullable
    private Runnable runnable;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private View noPermissionFrame;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    private String[] permissionArray = new String[0];

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final int requestPermissionCode = 4097;

    private final boolean n(String[] permissions, int[] grantResults) {
        int length = grantResults.length;
        int i = 0;
        while (i < length) {
            int i2 = grantResults[i];
            i++;
            if (i2 != 0) {
                return false;
            }
        }
        return true;
    }

    private final void o() {
        if (Build.VERSION.SDK_INT >= 23) {
            requestPermissions(getPermissionArray(), this.requestPermissionCode);
        }
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    private final String[] getPermissionArray() {
        return this.permissionArray;
    }

    private final void q() {
        View view = this.noPermissionFrame;
        Objects.requireNonNull(view);
        ViewExKt.setVisible(view, true);
        View view2 = this.noPermissionFrame;
        Objects.requireNonNull(view2);
        ((AppCompatImageView) view2.findViewById(R.id.iv_close)).setOnClickListener(new View.OnClickListener() { // from class: xq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                BasePermissionActivity.r(this.a, view3);
            }
        });
        View view3 = this.noPermissionFrame;
        Objects.requireNonNull(view3);
        ((TextView) view3.findViewById(R.id.btn_open_permission)).setOnClickListener(new View.OnClickListener() { // from class: yq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                BasePermissionActivity.s(this.a, view4);
            }
        });
        View view4 = this.noPermissionFrame;
        Objects.requireNonNull(view4);
        ((TextView) view4.findViewById(R.id.tv_message)).setText(this.text);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(BasePermissionActivity basePermissionActivity, View view) {
        View view2 = basePermissionActivity.noPermissionFrame;
        Objects.requireNonNull(view2);
        ViewExKt.setVisible(view2, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(BasePermissionActivity basePermissionActivity, View view) {
        basePermissionActivity.o();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.noPermissionFrame = View.inflate(this, R.layout.sls_fragment_request_permission, null);
        FrameLayout frameLayout = (FrameLayout) getWindow().getDecorView();
        View view = this.noPermissionFrame;
        Objects.requireNonNull(view);
        frameLayout.addView(view);
        View view2 = this.noPermissionFrame;
        Objects.requireNonNull(view2);
        ViewExKt.setVisible(view2, false);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int requestCode, @NotNull String[] permissions, @NotNull int[] grantResults) {
        if (requestCode != this.requestPermissionCode || !n(permissions, grantResults)) {
            q();
            View view = this.noPermissionFrame;
            Objects.requireNonNull(view);
            ViewExKt.setVisible(view, false);
            return;
        }
        View view2 = this.noPermissionFrame;
        Objects.requireNonNull(view2);
        ViewExKt.setVisible(view2, false);
        Runnable runnable = this.runnable;
        if (runnable == null) {
            return;
        }
        runnable.run();
    }
}
