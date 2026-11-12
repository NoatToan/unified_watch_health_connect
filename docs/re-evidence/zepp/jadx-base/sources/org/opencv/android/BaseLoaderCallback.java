package org.opencv.android;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.util.Log;
import com.xiaomi.hm.health.traininglib.util.TrainingAnalytics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class BaseLoaderCallback implements LoaderCallbackInterface {
    private static final String a = "OCV/BaseLoaderCallback";
    public Context mAppContext;

    public class a implements DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            BaseLoaderCallback.this.a();
        }
    }

    public class b implements DialogInterface.OnClickListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            BaseLoaderCallback.this.a();
        }
    }

    public class c implements DialogInterface.OnClickListener {
        public c() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            BaseLoaderCallback.this.a();
        }
    }

    public class d implements DialogInterface.OnClickListener {
        public final /* synthetic */ InstallCallbackInterface a;

        public d(InstallCallbackInterface installCallbackInterface) {
            this.a = installCallbackInterface;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            this.a.install();
        }
    }

    public class e implements DialogInterface.OnClickListener {
        public final /* synthetic */ InstallCallbackInterface a;

        public e(InstallCallbackInterface installCallbackInterface) {
            this.a = installCallbackInterface;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            this.a.cancel();
        }
    }

    public class f implements DialogInterface.OnClickListener {
        public final /* synthetic */ InstallCallbackInterface a;

        public f(InstallCallbackInterface installCallbackInterface) {
            this.a = installCallbackInterface;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            this.a.wait_install();
        }
    }

    public class g implements DialogInterface.OnClickListener {
        public final /* synthetic */ InstallCallbackInterface a;

        public g(InstallCallbackInterface installCallbackInterface) {
            this.a = installCallbackInterface;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            this.a.cancel();
        }
    }

    public BaseLoaderCallback(Context context) {
        this.mAppContext = context;
    }

    public void a() {
        ((Activity) this.mAppContext).finish();
    }

    @Override // org.opencv.android.LoaderCallbackInterface
    public void onManagerConnected(int i) {
        if (i != 0) {
            if (i == 2) {
                Log.e(a, "Package installation failed!");
                AlertDialog alertDialogCreate = new AlertDialog.Builder(this.mAppContext).create();
                alertDialogCreate.setTitle("OpenCV Manager");
                alertDialogCreate.setMessage("Package installation failed!");
                alertDialogCreate.setCancelable(false);
                alertDialogCreate.setButton(-1, "OK", new a());
                alertDialogCreate.show();
                return;
            }
            if (i == 3) {
                Log.d(a, "OpenCV library installation was canceled by user");
                a();
                return;
            }
            if (i != 4) {
                Log.e(a, "OpenCV loading failed!");
                AlertDialog alertDialogCreate2 = new AlertDialog.Builder(this.mAppContext).create();
                alertDialogCreate2.setTitle("OpenCV error");
                alertDialogCreate2.setMessage("OpenCV was not initialised correctly. Application will be shut down");
                alertDialogCreate2.setCancelable(false);
                alertDialogCreate2.setButton(-1, "OK", new c());
                alertDialogCreate2.show();
                return;
            }
            Log.d(a, "OpenCV Manager Service is uncompatible with this app!");
            AlertDialog alertDialogCreate3 = new AlertDialog.Builder(this.mAppContext).create();
            alertDialogCreate3.setTitle("OpenCV Manager");
            alertDialogCreate3.setMessage("OpenCV Manager service is incompatible with this app. Try to update it via Google Play.");
            alertDialogCreate3.setCancelable(false);
            alertDialogCreate3.setButton(-1, "OK", new b());
            alertDialogCreate3.show();
        }
    }

    @Override // org.opencv.android.LoaderCallbackInterface
    public void onPackageInstall(int i, InstallCallbackInterface installCallbackInterface) {
        if (i != 0) {
            if (i != 1) {
                return;
            }
            AlertDialog alertDialogCreate = new AlertDialog.Builder(this.mAppContext).create();
            alertDialogCreate.setTitle("OpenCV is not ready");
            alertDialogCreate.setMessage("Installation is in progress. Wait or exit?");
            alertDialogCreate.setCancelable(false);
            alertDialogCreate.setButton(-1, "Wait", new f(installCallbackInterface));
            alertDialogCreate.setButton(-2, "Exit", new g(installCallbackInterface));
            alertDialogCreate.show();
            return;
        }
        AlertDialog alertDialogCreate2 = new AlertDialog.Builder(this.mAppContext).create();
        alertDialogCreate2.setTitle("Package not found");
        alertDialogCreate2.setMessage(installCallbackInterface.getPackageName() + " package was not found! Try to install it?");
        alertDialogCreate2.setCancelable(false);
        alertDialogCreate2.setButton(-1, TrainingAnalytics.ParamValue.ContinuePlaying.YES, new d(installCallbackInterface));
        alertDialogCreate2.setButton(-2, "No", new e(installCallbackInterface));
        alertDialogCreate2.show();
    }
}
