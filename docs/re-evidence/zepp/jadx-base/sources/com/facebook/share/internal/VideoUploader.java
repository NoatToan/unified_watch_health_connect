package com.facebook.share.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.AccessTokenTracker;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookGraphResponseException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.HttpMethod;
import com.facebook.gamingservices.internal.TournamentShareDialogURIBuilder;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import com.facebook.internal.WorkQueue;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.share.Sharer;
import com.facebook.share.model.ShareVideo;
import com.facebook.share.model.ShareVideoContent;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class VideoUploader {
    private static final String a = "VideoUploader";
    private static final String b = "upload_phase";
    private static final String c = "start";
    private static final String d = "transfer";
    private static final String e = "finish";
    private static final String f = "title";
    private static final String g = "description";
    private static final String h = "ref";
    private static final String i = "file_size";
    private static final String j = "upload_session_id";
    private static final String k = "video_id";
    private static final String l = "start_offset";
    private static final String m = "end_offset";
    private static final String n = "video_file_chunk";
    private static final String o = "Video upload failed";
    private static final String p = "Unexpected error in server response";
    private static final int q = 8;
    private static final int r = 2;
    private static final int s = 5000;
    private static final int t = 3;
    private static boolean u;
    private static Handler v;
    private static WorkQueue w = new WorkQueue(8);
    private static Set<e> x = new HashSet();
    private static AccessTokenTracker y;

    public static class a extends AccessTokenTracker {
        @Override // com.facebook.AccessTokenTracker
        public void onCurrentAccessTokenChanged(AccessToken accessToken, AccessToken accessToken2) {
            if (accessToken == null) {
                return;
            }
            if (accessToken2 == null || !Utility.areObjectsEqual(accessToken2.getUserId(), accessToken.getUserId())) {
                VideoUploader.i();
            }
        }
    }

    public static class b extends f {
        public static final Set<Integer> d = new a();

        public static class a extends HashSet<Integer> {
            public a() {
                add(1363011);
            }
        }

        public b(e eVar, int i) {
            super(eVar, i);
        }

        @Override // com.facebook.share.internal.VideoUploader.f
        public void c(int i) {
            VideoUploader.l(this.a, i);
        }

        @Override // com.facebook.share.internal.VideoUploader.f
        public Bundle e() {
            Bundle bundle = new Bundle();
            Bundle bundle2 = this.a.p;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            bundle.putString(VideoUploader.b, "finish");
            bundle.putString(VideoUploader.j, this.a.i);
            Utility.putNonEmptyString(bundle, "title", this.a.b);
            Utility.putNonEmptyString(bundle, "description", this.a.c);
            Utility.putNonEmptyString(bundle, VideoUploader.h, this.a.d);
            return bundle;
        }

        @Override // com.facebook.share.internal.VideoUploader.f
        public Set<Integer> f() {
            return d;
        }

        @Override // com.facebook.share.internal.VideoUploader.f
        public void g(FacebookException facebookException) {
            VideoUploader.q(facebookException, "Video '%s' failed to finish uploading", this.a.j);
            b(facebookException);
        }

        @Override // com.facebook.share.internal.VideoUploader.f
        public void h(JSONObject jSONObject) throws JSONException {
            if (jSONObject.getBoolean("success")) {
                i(null, this.a.j);
            } else {
                g(new FacebookException(VideoUploader.p));
            }
        }
    }

    public static class c extends f {
        public static final Set<Integer> d = new a();

        public static class a extends HashSet<Integer> {
            public a() {
                add(6000);
            }
        }

        public c(e eVar, int i) {
            super(eVar, i);
        }

        @Override // com.facebook.share.internal.VideoUploader.f
        public void c(int i) {
            VideoUploader.m(this.a, i);
        }

        @Override // com.facebook.share.internal.VideoUploader.f
        public Bundle e() {
            Bundle bundle = new Bundle();
            bundle.putString(VideoUploader.b, "start");
            bundle.putLong(VideoUploader.i, this.a.l);
            return bundle;
        }

        @Override // com.facebook.share.internal.VideoUploader.f
        public Set<Integer> f() {
            return d;
        }

        @Override // com.facebook.share.internal.VideoUploader.f
        public void g(FacebookException facebookException) {
            VideoUploader.q(facebookException, "Error starting video upload", new Object[0]);
            b(facebookException);
        }

        @Override // com.facebook.share.internal.VideoUploader.f
        public void h(JSONObject jSONObject) throws JSONException {
            this.a.i = jSONObject.getString(VideoUploader.j);
            this.a.j = jSONObject.getString(VideoUploader.k);
            String string = jSONObject.getString(VideoUploader.l);
            String string2 = jSONObject.getString(VideoUploader.m);
            if (this.a.h != null) {
                long j = Long.parseLong(string);
                e eVar = this.a;
                eVar.h.onProgress(j, eVar.l);
            }
            VideoUploader.k(this.a, string, string2, 0);
        }
    }

    public static class d extends f {
        public static final Set<Integer> f = new a();
        private String d;
        private String e;

        public static class a extends HashSet<Integer> {
            public a() {
                add(1363019);
                add(1363021);
                add(1363030);
                add(1363033);
                add(1363041);
            }
        }

        public d(e eVar, String str, String str2, int i) {
            super(eVar, i);
            this.d = str;
            this.e = str2;
        }

        @Override // com.facebook.share.internal.VideoUploader.f
        public void c(int i) {
            VideoUploader.k(this.a, this.d, this.e, i);
        }

        @Override // com.facebook.share.internal.VideoUploader.f
        public Bundle e() throws IOException {
            Bundle bundle = new Bundle();
            bundle.putString(VideoUploader.b, VideoUploader.d);
            bundle.putString(VideoUploader.j, this.a.i);
            bundle.putString(VideoUploader.l, this.d);
            byte[] bArrN = VideoUploader.n(this.a, this.d, this.e);
            if (bArrN == null) {
                throw new FacebookException("Error reading video");
            }
            bundle.putByteArray(VideoUploader.n, bArrN);
            return bundle;
        }

        @Override // com.facebook.share.internal.VideoUploader.f
        public Set<Integer> f() {
            return f;
        }

        @Override // com.facebook.share.internal.VideoUploader.f
        public void g(FacebookException facebookException) {
            VideoUploader.q(facebookException, "Error uploading video '%s'", this.a.j);
            b(facebookException);
        }

        @Override // com.facebook.share.internal.VideoUploader.f
        public void h(JSONObject jSONObject) throws JSONException {
            String string = jSONObject.getString(VideoUploader.l);
            String string2 = jSONObject.getString(VideoUploader.m);
            if (this.a.h != null) {
                long j = Long.parseLong(string);
                e eVar = this.a;
                eVar.h.onProgress(j, eVar.l);
            }
            if (Utility.areObjectsEqual(string, string2)) {
                VideoUploader.l(this.a, 0);
            } else {
                VideoUploader.k(this.a, string, string2, 0);
            }
        }
    }

    public static class e {
        public final Uri a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final AccessToken f;
        public final FacebookCallback<Sharer.Result> g;
        public final GraphRequest.OnProgressCallback h;
        public String i;
        public String j;
        public InputStream k;
        public long l;
        public String m;
        public boolean n;
        public WorkQueue.WorkItem o;
        public Bundle p;

        public /* synthetic */ e(ShareVideoContent shareVideoContent, String str, FacebookCallback facebookCallback, GraphRequest.OnProgressCallback onProgressCallback, a aVar) {
            this(shareVideoContent, str, facebookCallback, onProgressCallback);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b() throws FileNotFoundException {
            try {
                if (Utility.isFileUri(this.a)) {
                    ParcelFileDescriptor parcelFileDescriptorOpen = ParcelFileDescriptor.open(new File(this.a.getPath()), 268435456);
                    this.l = parcelFileDescriptorOpen.getStatSize();
                    this.k = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptorOpen);
                } else {
                    if (!Utility.isContentUri(this.a)) {
                        throw new FacebookException("Uri must be a content:// or file:// uri");
                    }
                    this.l = Utility.getContentSize(this.a);
                    this.k = FacebookSdk.getApplicationContext().getContentResolver().openInputStream(this.a);
                }
            } catch (FileNotFoundException e) {
                Utility.closeQuietly(this.k);
                throw e;
            }
        }

        private e(ShareVideoContent shareVideoContent, String str, FacebookCallback<Sharer.Result> facebookCallback, GraphRequest.OnProgressCallback onProgressCallback) {
            this.m = "0";
            this.f = AccessToken.getCurrentAccessToken();
            this.a = shareVideoContent.getVideo().getLocalUrl();
            this.b = shareVideoContent.getContentTitle();
            this.c = shareVideoContent.getContentDescription();
            this.d = shareVideoContent.getRef();
            this.e = str;
            this.g = facebookCallback;
            this.h = onProgressCallback;
            this.p = shareVideoContent.getVideo().getParameters();
            if (!Utility.isNullOrEmpty(shareVideoContent.getPeopleIds())) {
                this.p.putString("tags", TextUtils.join(", ", shareVideoContent.getPeopleIds()));
            }
            if (!Utility.isNullOrEmpty(shareVideoContent.getPlaceId())) {
                this.p.putString("place", shareVideoContent.getPlaceId());
            }
            if (Utility.isNullOrEmpty(shareVideoContent.getRef())) {
                return;
            }
            this.p.putString(VideoUploader.h, shareVideoContent.getRef());
        }
    }

    public static abstract class f implements Runnable {
        public e a;
        public int b;
        public GraphResponse c;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (CrashShieldHandler.isObjectCrashing(this)) {
                    return;
                }
                try {
                    f fVar = f.this;
                    fVar.c(fVar.b + 1);
                } catch (Throwable th) {
                    CrashShieldHandler.handleThrowable(th, this);
                }
            }
        }

        public class b implements Runnable {
            public final /* synthetic */ FacebookException a;
            public final /* synthetic */ String b;

            public b(FacebookException facebookException, String str) {
                this.a = facebookException;
                this.b = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (CrashShieldHandler.isObjectCrashing(this)) {
                    return;
                }
                try {
                    f fVar = f.this;
                    VideoUploader.p(fVar.a, this.a, fVar.c, this.b);
                } catch (Throwable th) {
                    CrashShieldHandler.handleThrowable(th, this);
                }
            }
        }

        public f(e eVar, int i) {
            this.a = eVar;
            this.b = i;
        }

        private boolean a(int i) {
            if (this.b >= 2 || !f().contains(Integer.valueOf(i))) {
                return false;
            }
            VideoUploader.o().postDelayed(new a(), ((int) Math.pow(3.0d, this.b)) * 5000);
            return true;
        }

        public void b(FacebookException facebookException) {
            i(facebookException, null);
        }

        public abstract void c(int i);

        public void d(Bundle bundle) {
            e eVar = this.a;
            GraphResponse graphResponseExecuteAndWait = new GraphRequest(eVar.f, String.format(Locale.ROOT, "%s/videos", eVar.e), bundle, HttpMethod.POST, null).executeAndWait();
            this.c = graphResponseExecuteAndWait;
            if (graphResponseExecuteAndWait == null) {
                g(new FacebookException(VideoUploader.p));
                return;
            }
            FacebookRequestError error = graphResponseExecuteAndWait.getError();
            JSONObject graphObject = this.c.getGraphObject();
            if (error != null) {
                if (a(error.getSubErrorCode())) {
                    return;
                }
                g(new FacebookGraphResponseException(this.c, VideoUploader.o));
            } else {
                if (graphObject == null) {
                    g(new FacebookException(VideoUploader.p));
                    return;
                }
                try {
                    h(graphObject);
                } catch (JSONException e) {
                    b(new FacebookException(VideoUploader.p, e));
                }
            }
        }

        public abstract Bundle e() throws Exception;

        public abstract Set<Integer> f();

        public abstract void g(FacebookException facebookException);

        public abstract void h(JSONObject jSONObject) throws JSONException;

        public void i(FacebookException facebookException, String str) {
            VideoUploader.o().post(new b(facebookException, str));
        }

        @Override // java.lang.Runnable
        public void run() {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                if (this.a.n) {
                    b(null);
                    return;
                }
                try {
                    d(e());
                } catch (FacebookException e) {
                    b(e);
                } catch (Exception e2) {
                    b(new FacebookException(VideoUploader.o, e2));
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void i() {
        Iterator<e> it2 = x.iterator();
        while (it2.hasNext()) {
            it2.next().n = true;
        }
    }

    private static synchronized void j(e eVar, Runnable runnable) {
        eVar.o = w.addActiveWorkItem(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void k(e eVar, String str, String str2, int i2) {
        j(eVar, new d(eVar, str, str2, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void l(e eVar, int i2) {
        j(eVar, new b(eVar, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void m(e eVar, int i2) {
        j(eVar, new c(eVar, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] n(e eVar, String str, String str2) throws IOException {
        int i2;
        if (!Utility.areObjectsEqual(str, eVar.m)) {
            q(null, "Error reading video chunk. Expected chunk '%s'. Requested chunk '%s'.", eVar.m, str);
            return null;
        }
        int i3 = (int) (Long.parseLong(str2) - Long.parseLong(str));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[Math.min(8192, i3)];
        do {
            i2 = eVar.k.read(bArr);
            if (i2 != -1) {
                byteArrayOutputStream.write(bArr, 0, i2);
                i3 -= i2;
                if (i3 == 0) {
                }
            }
            eVar.m = str2;
            return byteArrayOutputStream.toByteArray();
        } while (i3 >= 0);
        q(null, "Error reading video chunk. Expected buffer length - '%d'. Actual - '%d'.", Integer.valueOf(i3 + i2), Integer.valueOf(i2));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized Handler o() {
        if (v == null) {
            v = new Handler(Looper.getMainLooper());
        }
        return v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void p(e eVar, FacebookException facebookException, GraphResponse graphResponse, String str) {
        s(eVar);
        Utility.closeQuietly(eVar.k);
        FacebookCallback<Sharer.Result> facebookCallback = eVar.g;
        if (facebookCallback != null) {
            if (facebookException != null) {
                ShareInternalUtility.f(facebookCallback, facebookException);
            } else if (eVar.n) {
                ShareInternalUtility.e(facebookCallback);
            } else {
                ShareInternalUtility.i(facebookCallback, str);
            }
        }
        if (eVar.h != null) {
            if (graphResponse != null) {
                try {
                    if (graphResponse.getGraphObject() != null) {
                        graphResponse.getGraphObject().put(k, str);
                    }
                } catch (JSONException unused) {
                }
            }
            eVar.h.onCompleted(graphResponse);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void q(Exception exc, String str, Object... objArr) {
        Log.e(a, String.format(Locale.ROOT, str, objArr), exc);
    }

    private static void r() {
        y = new a();
    }

    private static synchronized void s(e eVar) {
        x.remove(eVar);
    }

    private static synchronized void t(ShareVideoContent shareVideoContent, String str, FacebookCallback<Sharer.Result> facebookCallback, GraphRequest.OnProgressCallback onProgressCallback) throws FileNotFoundException {
        if (!u) {
            r();
            u = true;
        }
        Validate.notNull(shareVideoContent, "videoContent");
        Validate.notNull(str, "graphNode");
        ShareVideo video = shareVideoContent.getVideo();
        Validate.notNull(video, "videoContent.video");
        Validate.notNull(video.getLocalUrl(), "videoContent.video.localUrl");
        e eVar = new e(shareVideoContent, str, facebookCallback, onProgressCallback, null);
        eVar.b();
        x.add(eVar);
        m(eVar, 0);
    }

    public static synchronized void uploadAsync(ShareVideoContent shareVideoContent, String str, FacebookCallback<Sharer.Result> facebookCallback) throws FileNotFoundException {
        t(shareVideoContent, str, facebookCallback, null);
    }

    public static synchronized void uploadAsyncWithProgressCallback(ShareVideoContent shareVideoContent, GraphRequest.OnProgressCallback onProgressCallback) throws FileNotFoundException {
        t(shareVideoContent, TournamentShareDialogURIBuilder.me, null, onProgressCallback);
    }

    public static synchronized void uploadAsyncWithProgressCallback(ShareVideoContent shareVideoContent, String str, GraphRequest.OnProgressCallback onProgressCallback) throws FileNotFoundException {
        t(shareVideoContent, str, null, onProgressCallback);
    }
}
