package org.opencv.android;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import java.io.File;
import java.util.StringTokenizer;
import org.opencv.core.Core;
import org.opencv.engine.OpenCVEngineInterface;

/* JADX INFO: loaded from: classes23.dex */
class a {
    public static final String f = "OpenCVManager/Helper";
    public static final int g = 2;
    public static boolean h = false;
    public static boolean i = false;
    public static final String j = "market://details?id=org.opencv.engine";
    public OpenCVEngineInterface a;
    public LoaderCallbackInterface b;
    public String c;
    public Context d;
    public ServiceConnection e = new c();

    /* JADX INFO: renamed from: org.opencv.android.a$a, reason: collision with other inner class name */
    public class C1207a implements InstallCallbackInterface {
        private LoaderCallbackInterface a;
        public final /* synthetic */ LoaderCallbackInterface b;
        public final /* synthetic */ Context c;

        public C1207a(LoaderCallbackInterface loaderCallbackInterface, Context context) {
            this.b = loaderCallbackInterface;
            this.c = context;
            this.a = loaderCallbackInterface;
        }

        @Override // org.opencv.android.InstallCallbackInterface
        public void cancel() {
            Log.d(a.f, "OpenCV library installation was canceled");
            Log.d(a.f, "Init finished with status 3");
            Log.d(a.f, "Calling using callback");
            this.a.onManagerConnected(3);
        }

        @Override // org.opencv.android.InstallCallbackInterface
        public String getPackageName() {
            return "OpenCV Manager";
        }

        @Override // org.opencv.android.InstallCallbackInterface
        public void install() {
            Log.d(a.f, "Trying to install OpenCV Manager via Google Play");
            if (a.b(this.c)) {
                a.h = true;
                Log.d(a.f, "Package installation started");
                return;
            }
            Log.d(a.f, "OpenCV package was not installed!");
            Log.d(a.f, "Init finished with status 2");
            Log.d(a.f, "Unbind from service");
            Log.d(a.f, "Calling using callback");
            this.a.onManagerConnected(2);
        }

        @Override // org.opencv.android.InstallCallbackInterface
        public void wait_install() {
            Log.e(a.f, "Installation was not started! Nothing to wait!");
        }
    }

    public class b implements InstallCallbackInterface {
        private LoaderCallbackInterface a;
        public final /* synthetic */ LoaderCallbackInterface b;
        public final /* synthetic */ Context c;

        public b(LoaderCallbackInterface loaderCallbackInterface, Context context) {
            this.b = loaderCallbackInterface;
            this.c = context;
            this.a = loaderCallbackInterface;
        }

        @Override // org.opencv.android.InstallCallbackInterface
        public void cancel() {
            Log.d(a.f, "Waiting for OpenCV canceled by user");
            a.h = false;
            Log.d(a.f, "Init finished with status 3");
            Log.d(a.f, "Calling using callback");
            this.a.onManagerConnected(3);
        }

        @Override // org.opencv.android.InstallCallbackInterface
        public String getPackageName() {
            return "OpenCV Manager";
        }

        @Override // org.opencv.android.InstallCallbackInterface
        public void install() {
            Log.e(a.f, "Nothing to install we just wait current installation");
        }

        @Override // org.opencv.android.InstallCallbackInterface
        public void wait_install() {
            a.b(this.c);
        }
    }

    public class c implements ServiceConnection {

        /* JADX INFO: renamed from: org.opencv.android.a$c$a, reason: collision with other inner class name */
        public class C1208a implements InstallCallbackInterface {
            public C1208a() {
            }

            @Override // org.opencv.android.InstallCallbackInterface
            public void cancel() {
                Log.d(a.f, "OpenCV library installation was canceled");
                Log.d(a.f, "Init finished with status 3");
                Log.d(a.f, "Unbind from service");
                a aVar = a.this;
                aVar.d.unbindService(aVar.e);
                Log.d(a.f, "Calling using callback");
                a.this.b.onManagerConnected(3);
            }

            @Override // org.opencv.android.InstallCallbackInterface
            public String getPackageName() {
                return "OpenCV library";
            }

            @Override // org.opencv.android.InstallCallbackInterface
            public void install() {
                Log.d(a.f, "Trying to install OpenCV lib via Google Play");
                try {
                    a aVar = a.this;
                    if (aVar.a.installVersion(aVar.c)) {
                        a.i = true;
                        Log.d(a.f, "Package installation started");
                        Log.d(a.f, "Unbind from service");
                        a aVar2 = a.this;
                        aVar2.d.unbindService(aVar2.e);
                    } else {
                        Log.d(a.f, "OpenCV package was not installed!");
                        Log.d(a.f, "Init finished with status 2");
                        Log.d(a.f, "Unbind from service");
                        a aVar3 = a.this;
                        aVar3.d.unbindService(aVar3.e);
                        Log.d(a.f, "Calling using callback");
                        a.this.b.onManagerConnected(2);
                    }
                } catch (RemoteException e) {
                    e.printStackTrace();
                    Log.d(a.f, "Init finished with status 255");
                    Log.d(a.f, "Unbind from service");
                    a aVar4 = a.this;
                    aVar4.d.unbindService(aVar4.e);
                    Log.d(a.f, "Calling using callback");
                    a.this.b.onManagerConnected(255);
                }
            }

            @Override // org.opencv.android.InstallCallbackInterface
            public void wait_install() {
                Log.e(a.f, "Installation was not started! Nothing to wait!");
            }
        }

        public class b implements InstallCallbackInterface {
            public b() {
            }

            @Override // org.opencv.android.InstallCallbackInterface
            public void cancel() {
                Log.d(a.f, "OpenCV library installation was canceled");
                a.i = false;
                Log.d(a.f, "Init finished with status 3");
                Log.d(a.f, "Unbind from service");
                a aVar = a.this;
                aVar.d.unbindService(aVar.e);
                Log.d(a.f, "Calling using callback");
                a.this.b.onManagerConnected(3);
            }

            @Override // org.opencv.android.InstallCallbackInterface
            public String getPackageName() {
                return "OpenCV library";
            }

            @Override // org.opencv.android.InstallCallbackInterface
            public void install() {
                Log.e(a.f, "Nothing to install we just wait current installation");
            }

            @Override // org.opencv.android.InstallCallbackInterface
            public void wait_install() {
                Log.d(a.f, "Waiting for current installation");
                try {
                    a aVar = a.this;
                    if (aVar.a.installVersion(aVar.c)) {
                        Log.d(a.f, "Waiting for package installation");
                    } else {
                        Log.d(a.f, "OpenCV package was not installed!");
                        Log.d(a.f, "Init finished with status 2");
                        Log.d(a.f, "Calling using callback");
                        a.this.b.onManagerConnected(2);
                    }
                    Log.d(a.f, "Unbind from service");
                    a aVar2 = a.this;
                    aVar2.d.unbindService(aVar2.e);
                } catch (RemoteException e) {
                    e.printStackTrace();
                    Log.d(a.f, "Init finished with status 255");
                    Log.d(a.f, "Unbind from service");
                    a aVar3 = a.this;
                    aVar3.d.unbindService(aVar3.e);
                    Log.d(a.f, "Calling using callback");
                    a.this.b.onManagerConnected(255);
                }
            }
        }

        public c() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Log.d(a.f, "Service connection created");
            a.this.a = OpenCVEngineInterface.Stub.asInterface(iBinder);
            OpenCVEngineInterface openCVEngineInterface = a.this.a;
            if (openCVEngineInterface == null) {
                Log.d(a.f, "OpenCV Manager Service connection fails. May be service was not installed?");
                a aVar = a.this;
                a.a(aVar.d, aVar.b);
                return;
            }
            int i = 0;
            a.h = false;
            try {
                if (openCVEngineInterface.getEngineVersion() < 2) {
                    Log.d(a.f, "Init finished with status 4");
                    Log.d(a.f, "Unbind from service");
                    a aVar2 = a.this;
                    aVar2.d.unbindService(aVar2.e);
                    Log.d(a.f, "Calling using callback");
                    a.this.b.onManagerConnected(4);
                    return;
                }
                Log.d(a.f, "Trying to get library path");
                a aVar3 = a.this;
                String libPathByVersion = aVar3.a.getLibPathByVersion(aVar3.c);
                if (libPathByVersion != null && libPathByVersion.length() != 0) {
                    Log.d(a.f, "Trying to get library list");
                    a.i = false;
                    a aVar4 = a.this;
                    String libraryList = aVar4.a.getLibraryList(aVar4.c);
                    Log.d(a.f, "Library list: \"" + libraryList + "\"");
                    Log.d(a.f, "First attempt to load libs");
                    if (a.this.e(libPathByVersion, libraryList)) {
                        Log.d(a.f, "First attempt to load libs is OK");
                        for (String str : Core.getBuildInformation().split(System.getProperty("line.separator"))) {
                            Log.i(a.f, str);
                        }
                    } else {
                        Log.d(a.f, "First attempt to load libs fails");
                        i = 255;
                    }
                    Log.d(a.f, "Init finished with status " + i);
                    Log.d(a.f, "Unbind from service");
                    a aVar5 = a.this;
                    aVar5.d.unbindService(aVar5.e);
                    Log.d(a.f, "Calling using callback");
                    a.this.b.onManagerConnected(i);
                    return;
                }
                if (a.i) {
                    a.this.b.onPackageInstall(1, new b());
                } else {
                    a.this.b.onPackageInstall(0, new C1208a());
                }
            } catch (RemoteException e) {
                e.printStackTrace();
                Log.d(a.f, "Init finished with status 255");
                Log.d(a.f, "Unbind from service");
                a aVar6 = a.this;
                aVar6.d.unbindService(aVar6.e);
                Log.d(a.f, "Calling using callback");
                a.this.b.onManagerConnected(255);
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            a.this.a = null;
        }
    }

    public a(String str, Context context, LoaderCallbackInterface loaderCallbackInterface) {
        this.c = str;
        this.b = loaderCallbackInterface;
        this.d = context;
    }

    public static void a(Context context, LoaderCallbackInterface loaderCallbackInterface) {
        if (h) {
            Log.d(f, "Waiting current installation process");
            loaderCallbackInterface.onPackageInstall(1, new b(loaderCallbackInterface, context));
        } else {
            Log.d(f, "Request new service installation");
            loaderCallbackInterface.onPackageInstall(0, new C1207a(loaderCallbackInterface, context));
        }
    }

    public static boolean b(Context context) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(j));
            intent.addFlags(268435456);
            context.startActivity(intent);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean d(String str, Context context, LoaderCallbackInterface loaderCallbackInterface) {
        a aVar = new a(str, context, loaderCallbackInterface);
        Intent intent = new Intent("org.opencv.engine.BIND");
        intent.setPackage("org.opencv.engine");
        if (context.bindService(intent, aVar.e, 1)) {
            return true;
        }
        context.unbindService(aVar.e);
        a(context, loaderCallbackInterface);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(String str, String str2) {
        Log.d(f, "Trying to init OpenCV libs");
        if (str == null || str.length() == 0) {
            Log.d(f, "Library path \"" + str + "\" is empty");
            return false;
        }
        boolean zF = true;
        if (str2 == null || str2.length() == 0) {
            return f(str + File.separator + "libopencv_java4.so");
        }
        Log.d(f, "Trying to load libs by dependency list");
        StringTokenizer stringTokenizer = new StringTokenizer(str2, ";");
        while (stringTokenizer.hasMoreTokens()) {
            zF &= f(str + File.separator + stringTokenizer.nextToken());
        }
        return zF;
    }

    private boolean f(String str) {
        Log.d(f, "Trying to load library " + str);
        try {
            System.load(str);
            Log.d(f, "OpenCV libs init was ok!");
            return true;
        } catch (UnsatisfiedLinkError e) {
            Log.d(f, "Cannot load library \"" + str + "\"");
            e.printStackTrace();
            return false;
        }
    }
}
