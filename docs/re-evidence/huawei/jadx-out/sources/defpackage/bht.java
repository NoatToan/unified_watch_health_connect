package defpackage;

import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.provider.Settings;
import android.util.Log;
import com.huawei.hmf.tasks.Task;
import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hmf.tasks.Tasks;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public class bht {
    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Context context) {
        try {
            context.getContentResolver().registerContentObserver(Settings.Secure.getUriFor("appgallery_service_homecountry"), false, new b(context, null));
        } catch (Exception unused) {
            Log.e("HomeCountryImpl", "registerHomeCountryObserver exception");
        }
    }

    static class a implements Callable<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f1112a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final TaskCompletionSource<String> f1113b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Context f1114c;
        private final String d;

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void call() throws Throwable {
            if (this.f1112a) {
                Log.i("HomeCountryImpl", "force homeCountry");
                bhx.a(this.f1113b, this.f1114c, this.d);
                return null;
            }
            String strB = bib.b(this.f1114c).b();
            if (strB != null) {
                Log.i("HomeCountryImpl", "homeCountry from cache");
                if (System.currentTimeMillis() - bib.b(this.f1114c).j() < bib.b(this.f1114c).a()) {
                    Log.i("HomeCountryImpl", "current homeCountry is valid");
                    this.f1113b.setResult(strB);
                    return null;
                }
            }
            String strE = bht.e(this.f1114c);
            if (strE != null) {
                Log.i("HomeCountryImpl", "homeCountry from settings");
                bht.c(this.f1114c);
                bib.b(this.f1114c).e(strE);
                this.f1113b.setResult(strE);
                return null;
            }
            String strE2 = bib.b(this.f1114c).e();
            if (strE2 != null) {
                Log.i("HomeCountryImpl", "homeCountry from sp");
                if (System.currentTimeMillis() - bib.b(this.f1114c).d() < bib.b(this.f1114c).a()) {
                    Log.i("HomeCountryImpl", "current homeCountry is valid");
                    this.f1113b.setResult(strE2);
                    return null;
                }
            }
            bhx.a(this.f1113b, this.f1114c, this.d);
            return null;
        }

        public a(TaskCompletionSource<String> taskCompletionSource, Context context, String str, boolean z) {
            this.f1114c = context;
            this.d = str;
            this.f1112a = z;
            this.f1113b = taskCompletionSource;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String e(Context context) {
        try {
            return Settings.Secure.getString(context.getContentResolver(), "appgallery_service_homecountry");
        } catch (Exception unused) {
            Log.e("HomeCountryImpl", "getHomeCountryBySettings exception");
            return null;
        }
    }

    static class b extends ContentObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f1115a;

        @Override // android.database.ContentObserver
        public void onChange(boolean z, Uri uri) {
            super.onChange(z, uri);
            Log.d("HomeCountryImpl", "homeCountry changed");
            if (uri.equals(Settings.Secure.getUriFor("appgallery_service_homecountry"))) {
                bib.b(this.f1115a).e(bht.e(this.f1115a));
            }
        }

        public b(Context context, Handler handler) {
            super(handler);
            this.f1115a = context;
        }
    }

    public static Task<String> c(Context context, String str, boolean z) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        if (context == null) {
            taskCompletionSource.setException(new Exception("context is null"));
        } else {
            Tasks.callInBackground(new a(taskCompletionSource, context, str, z));
        }
        return taskCompletionSource.getTask();
    }
}
