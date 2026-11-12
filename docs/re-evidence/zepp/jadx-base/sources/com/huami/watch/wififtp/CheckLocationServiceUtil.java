package com.huami.watch.wififtp;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.location.LocationManager;
import android.os.Build;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.ui.dialog.AlertDialog;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\nH\u0002J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\n¨\u0006\u000f"}, d2 = {"Lcom/huami/watch/wififtp/CheckLocationServiceUtil;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "a", "Landroid/app/Activity;", "activity", "", "b", "Landroidx/appcompat/app/AppCompatActivity;", "c", "checkLocationServiceReady", "<init>", "()V", "wififtp_release"}, k = 1, mv = {1, 4, 1})
public final class CheckLocationServiceUtil {

    @NotNull
    public static final CheckLocationServiceUtil INSTANCE = new CheckLocationServiceUtil();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/content/DialogInterface;", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "", "onClick", "(Landroid/content/DialogInterface;I)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class a implements DialogInterface.OnClickListener {
        public final /* synthetic */ Activity a;

        public a(Activity activity) {
            this.a = activity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(@Nullable DialogInterface dialogInterface, int i) {
            try {
                this.a.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/content/DialogInterface;", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "", "onClick", "(Landroid/content/DialogInterface;I)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class b implements DialogInterface.OnClickListener {
        public final /* synthetic */ AppCompatActivity a;

        public b(AppCompatActivity appCompatActivity) {
            this.a = appCompatActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(@Nullable DialogInterface dialogInterface, int i) {
            try {
                this.a.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private CheckLocationServiceUtil() {
    }

    private final boolean a(Context context) {
        try {
            LocationManager locationManager = (LocationManager) context.getSystemService("location");
            if (locationManager != null) {
                return locationManager.isProviderEnabled("gps") || locationManager.isProviderEnabled("network");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    private final void b(Activity activity) {
        AlertDialog.setTitle(activity.getString(R.string.loaction_tips)).setMessage(activity.getString(R.string.open_loaction_msg)).setNegativeBtn(activity.getString(R.string.btn_cancel)).setPositiveBtn(activity.getString(R.string.btn_set), new a(activity)).show(activity, "OpenLocationServiceTipDialog");
    }

    private final void c(AppCompatActivity activity) {
        new AlertDialogFragment.Builder(activity).setTitle(activity.getString(R.string.loaction_tips)).setMessage(R.string.open_loaction_msg).setNegativeButton(R.string.btn_cancel, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.btn_set, new b(activity)).show(activity.getSupportFragmentManager(), "OpenLocationServiceTipDialog");
    }

    public final boolean checkLocationServiceReady(@NotNull Activity activity) {
        int i = Build.VERSION.SDK_INT;
        boolean z = i < 23 || ContextCompat.checkSelfPermission(activity, "android.permission.ACCESS_FINE_LOCATION") == 0;
        boolean z2 = i < 28 || a(activity);
        if (z && z2) {
            return true;
        }
        b(activity);
        return false;
    }

    public final boolean checkLocationServiceReady(@NotNull AppCompatActivity activity) {
        int i = Build.VERSION.SDK_INT;
        boolean z = i < 23 || ContextCompat.checkSelfPermission(activity, "android.permission.ACCESS_FINE_LOCATION") == 0;
        boolean z2 = i < 28 || a(activity);
        if (z && z2) {
            return true;
        }
        c(activity);
        return false;
    }
}
