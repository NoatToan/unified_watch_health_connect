package defpackage;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Environment;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.mipay.sdk.app.MipayWebActivity;
import com.mipay.sdk.app.PermissionUtils;
import com.mipay.sdk.app.WebConstants;
import com.xiaomi.wearable.hm.BroadcastsKt;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import miuipub.hybrid.HybridFeature;
import miuipub.hybrid.LifecycleListener;
import miuipub.hybrid.NativeInterface;
import miuipub.hybrid.Request;
import miuipub.hybrid.Response;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class u5d implements HybridFeature {
    public static final String[] f = {"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f35401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Request f35402b;
    public boolean d;
    public boolean c = false;
    public LifecycleListener e = new b();

    public class a extends LifecycleListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ NativeInterface f35403a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Activity f35404b;
        public final /* synthetic */ Uri c;
        public final /* synthetic */ Request d;

        public a(NativeInterface nativeInterface, Activity activity, Uri uri, Request request) {
            this.f35403a = nativeInterface;
            this.f35404b = activity;
            this.c = uri;
            this.d = request;
        }

        @Override // miuipub.hybrid.LifecycleListener
        public void onActivityResult(int i, int i2, Intent intent) {
            Response response;
            if (i == 1004) {
                this.f35403a.removeLifecycleListener(this);
                u5d u5dVar = u5d.this;
                String strT = u5dVar.t(this.f35404b, intent, this.c, u5dVar.s(this.d.getRawParams()));
                if (i2 != -1 || TextUtils.isEmpty(strT)) {
                    response = i2 == 0 ? new Response(100, BroadcastsKt.SILENT_PUSHING_CANCEL) : new Response(200);
                } else {
                    response = new Response(u5d.this.x(strT, this.d.getRawParams()));
                }
                StringBuilder sb = new StringBuilder();
                sb.append("select image result: ");
                sb.append(i2);
                sb.append(", content is null: ");
                sb.append(TextUtils.isEmpty(strT));
                this.d.getCallback().callback(response);
            }
        }
    }

    public class b extends LifecycleListener {

        public class a implements f {
            public a() {
            }

            @Override // u5d.f
            public void a(int i) {
                u5d.this.A();
                u5d.this.y();
            }

            @Override // u5d.f
            public void b(int i) {
            }
        }

        public b() {
        }

        @Override // miuipub.hybrid.LifecycleListener
        public void onActivityResult(int i, int i2, Intent intent) {
            super.onActivityResult(i, i2, intent);
            if (i == 1003) {
                if (PermissionUtils.hasPermissions(u5d.this.f35402b.getNativeInterface().getActivity(), u5d.f)) {
                    u5d u5dVar = u5d.this;
                    u5dVar.w(u5dVar.f35402b);
                } else {
                    u5d.this.A();
                }
                u5d.this.y();
            }
        }

        @Override // miuipub.hybrid.LifecycleListener
        public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
            super.onRequestPermissionsResult(i, strArr, iArr);
            if (i != 1002) {
                if (u5d.this.c || strArr.length <= 0 || u5d.this.D(strArr).length <= 0) {
                    return;
                }
                u5d.this.z();
                return;
            }
            if (strArr.length > 0) {
                u5d.this.c = true;
                if (PermissionUtils.isAllGranted(iArr)) {
                    u5d u5dVar = u5d.this;
                    u5dVar.w(u5dVar.f35402b);
                    u5d.this.y();
                    return;
                }
                Activity activity = u5d.this.f35402b.getNativeInterface().getActivity();
                List<String> permanentlyDeniedPermissions = PermissionUtils.getPermanentlyDeniedPermissions(activity, PermissionUtils.getUngrantedPermissions(activity, strArr));
                if (permanentlyDeniedPermissions.size() == 0) {
                    u5d.this.A();
                    u5d.this.y();
                } else {
                    u5d u5dVar2 = u5d.this;
                    u5dVar2.C(1003, u5dVar2.r(permanentlyDeniedPermissions), new a());
                }
            }
        }
    }

    public class c implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f35407a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f35408b;

        public c(f fVar, int i) {
            this.f35407a = fVar;
            this.f35408b = i;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            f fVar = this.f35407a;
            if (fVar != null) {
                fVar.a(this.f35408b);
            }
        }
    }

    public class d implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f35409a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f35410b;

        public d(int i, f fVar) {
            this.f35409a = i;
            this.f35410b = fVar;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            u5d.this.v(this.f35409a);
            f fVar = this.f35410b;
            if (fVar != null) {
                fVar.b(this.f35409a);
            }
            dialogInterface.dismiss();
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f35411a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f35412b;
    }

    public interface f {
        void a(int i);

        void b(int i);
    }

    public static final String p(byte[] bArr) {
        return Base64.encodeToString(bArr, 2);
    }

    public final void A() {
        this.f35402b.getCallback().callback(new Response(100, BroadcastsKt.SILENT_PUSHING_CANCEL));
    }

    public final void B(Activity activity, Uri uri, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("select image can use camera: ");
        sb.append(z);
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction("android.intent.action.GET_CONTENT");
        Intent intent2 = new Intent("android.intent.action.CHOOSER");
        if (z) {
            ArrayList arrayList = new ArrayList();
            Intent intent3 = new Intent();
            intent3.setAction("android.media.action.IMAGE_CAPTURE");
            intent3.putExtra("output", uri);
            arrayList.add(intent3);
            intent2.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[arrayList.size()]));
        }
        intent2.putExtra("android.intent.extra.INTENT", intent);
        activity.startActivityForResult(intent2, 1004);
    }

    public final void C(int i, String str, f fVar) {
        AlertDialog alertDialogCreate = new AlertDialog.Builder(this.f35402b.getNativeInterface().getActivity()).setMessage(str).setPositiveButton(R.string.ok, new d(i, fVar)).setNegativeButton(R.string.cancel, new c(fVar, i)).create();
        alertDialogCreate.setCancelable(false);
        alertDialogCreate.show();
    }

    public final String[] D(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : f) {
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    arrayList.add(str);
                    break;
                }
                if (str.equals(strArr[i])) {
                    break;
                }
                i++;
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    @Override // miuipub.hybrid.HybridFeature
    public HybridFeature.Mode getInvocationMode(Request request) {
        if (TextUtils.equals(request.getAction(), "select")) {
            return HybridFeature.Mode.CALLBACK;
        }
        return null;
    }

    @Override // miuipub.hybrid.HybridFeature
    public Response invoke(Request request) {
        if (!"select".equals(request.getAction())) {
            return new Response(204, "no such action");
        }
        this.f35402b = request;
        z();
        return null;
    }

    public final Uri o(String str) {
        try {
            File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM);
            StringBuilder sb = new StringBuilder();
            sb.append(externalStoragePublicDirectory.getAbsolutePath());
            String str2 = File.separator;
            sb.append(str2);
            sb.append("captured_media");
            File file = new File(sb.toString());
            file.mkdirs();
            return Uri.fromFile(new File(file.getAbsolutePath() + str2 + System.currentTimeMillis() + "." + str));
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    public e q(Context context) {
        e eVar = this.f35401a;
        if (eVar != null) {
            return eVar;
        }
        this.f35401a = new e();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        e eVar2 = this.f35401a;
        eVar2.f35412b = displayMetrics.heightPixels;
        eVar2.f35411a = displayMetrics.widthPixels;
        return eVar2;
    }

    public final String r(List<String> list) {
        if (list.size() == 1) {
            return f[0].equals(list.get(0)) ? WebConstants.getString(WebConstants.ID_CAMERA_TEXT) : WebConstants.getString(WebConstants.ID_STORAGE_TEXT);
        }
        return WebConstants.getString(WebConstants.ID_CAMERA_STORAGE_TEXT);
    }

    public final int s(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return new JSONObject(str).getInt("quality");
            } catch (JSONException unused) {
            }
        }
        return 80;
    }

    public final String t(Context context, Intent intent, Uri uri, int i) {
        Bitmap bitmapF;
        Uri uriU = u(intent, uri);
        if (uriU == null) {
            return null;
        }
        try {
            bitmapF = z5d.f(z5d.c(context, uriU, q(context).f35411a, q(context).f35412b), z5d.e(z5d.d(uriU)));
        } catch (IOException unused) {
            bitmapF = null;
        }
        if (bitmapF == null) {
            return null;
        }
        String strP = p(z5d.a(bitmapF, i));
        bitmapF.recycle();
        return strP;
    }

    public final Uri u(Intent intent, Uri uri) {
        if (intent == null || intent.getData() == null) {
            return uri;
        }
        String action = intent.getAction();
        return (action == null || !action.equals("android.media.action.IMAGE_CAPTURE")) ? intent.getData() : uri;
    }

    public final void v(int i) {
        this.f35402b.getNativeInterface().getActivity().startActivityForResult(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(Uri.fromParts("package", this.f35402b.getNativeInterface().getActivity().getPackageName(), null)), i);
    }

    public Response w(Request request) {
        if (!TextUtils.equals(Environment.getExternalStorageState(), "mounted")) {
            return new Response(200, "storage not ready");
        }
        Uri uriO = o("jpg");
        NativeInterface nativeInterface = request.getNativeInterface();
        Activity activity = nativeInterface.getActivity();
        nativeInterface.addLifecycleListener(new a(nativeInterface, activity, uriO, request));
        B(activity, uriO, true);
        return null;
    }

    public final JSONObject x(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("params", str2);
            }
            if (TextUtils.isEmpty(str)) {
                return jSONObject;
            }
            jSONObject.put("image", str);
            return jSONObject;
        } catch (JSONException unused) {
            return new JSONObject();
        }
    }

    public final void y() {
        this.f35402b.getNativeInterface().removeLifecycleListener(this.e);
        this.d = false;
    }

    public final void z() {
        NativeInterface nativeInterface = this.f35402b.getNativeInterface();
        if (!this.d) {
            this.d = true;
            nativeInterface.addLifecycleListener(this.e);
        }
        ((MipayWebActivity) nativeInterface.getActivity()).requestPerms(f, 1002);
    }
}
