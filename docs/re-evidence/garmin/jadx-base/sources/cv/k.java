package cv;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import androidx.lifecycle.n0;
import ca0.v0;
import com.google.common.net.HttpHeaders;
import d53.w;
import java.util.Locale;
import o13.t;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcv/k;", "Landroidx/lifecycle/n;", "Landroid/app/Activity;", "activity", "Lkotlin/Function0;", "", "onScreenShotTaken", "<init>", "(Landroid/app/Activity;Le23/a;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k implements androidx.lifecycle.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f55812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f55813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f55814c;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"cv/k$a", "Landroid/database/ContentObserver;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends ContentObserver {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f55816b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e23.a<Unit> aVar, Handler handler) {
            super(handler);
            this.f55816b = aVar;
        }

        @Override // android.database.ContentObserver
        @SuppressLint({HttpHeaders.RANGE})
        public final void onChange(boolean z14, Uri uri) {
            super.onChange(z14, uri);
            if (uri != null) {
                String string = uri.toString();
                string.getClass();
                String string2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString();
                string2.getClass();
                if (w.z(string, string2, false)) {
                    Cursor cursorQuery = null;
                    try {
                        cursorQuery = k.this.f55812a.getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
                        if (cursorQuery != null && cursorQuery.moveToFirst()) {
                            String string3 = cursorQuery.getString(cursorQuery.getColumnIndex("_display_name"));
                            string3.getClass();
                            Locale locale = Locale.getDefault();
                            locale.getClass();
                            String lowerCase = string3.toLowerCase(locale);
                            lowerCase.getClass();
                            if (w.z(lowerCase, "screenshot", false)) {
                                this.f55816b.invoke();
                            }
                        }
                    } finally {
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                    }
                }
            }
        }
    }

    public k(Activity activity, e23.a<Unit> aVar) {
        activity.getClass();
        aVar.getClass();
        this.f55812a = activity;
        this.f55813b = o13.m.b(new v0(aVar, 24));
        this.f55814c = new a(aVar, new Handler(Looper.getMainLooper()));
    }

    @Override // androidx.lifecycle.n
    public final void onStart(n0 n0Var) {
        int i14 = Build.VERSION.SDK_INT;
        Activity activity = this.f55812a;
        if (i14 >= 34) {
            Activity.ScreenCaptureCallback screenCaptureCallbackF = androidx.camera.camera2.internal.compat.g.f(this.f55813b.getValue());
            if (screenCaptureCallbackF != null) {
                activity.registerScreenCaptureCallback(activity.getMainExecutor(), screenCaptureCallbackF);
                return;
            }
            return;
        }
        j22.b bVar = j22.b.f96736a;
        j22.a[] aVarArr = {j22.a.f96721j};
        bVar.getClass();
        if (j22.b.k(aVarArr)) {
            activity.getContentResolver().registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, this.f55814c);
        }
    }

    @Override // androidx.lifecycle.n
    public final void onStop(n0 n0Var) {
        int i14 = Build.VERSION.SDK_INT;
        Activity activity = this.f55812a;
        if (i14 >= 34) {
            Activity.ScreenCaptureCallback screenCaptureCallbackF = androidx.camera.camera2.internal.compat.g.f(this.f55813b.getValue());
            if (screenCaptureCallbackF != null) {
                activity.unregisterScreenCaptureCallback(screenCaptureCallbackF);
                return;
            }
            return;
        }
        j22.b bVar = j22.b.f96736a;
        j22.a[] aVarArr = {j22.a.f96721j};
        bVar.getClass();
        if (j22.b.k(aVarArr)) {
            activity.getContentResolver().unregisterContentObserver(this.f55814c);
        }
    }
}
