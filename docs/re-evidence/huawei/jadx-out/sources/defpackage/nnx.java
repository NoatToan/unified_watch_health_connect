package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import com.huawei.hwidauth.g.b;

/* JADX INFO: loaded from: classes3.dex */
public class nnx extends AsyncTask<Integer, Integer, Boolean> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Uri f43340b;
    private Context d;
    private b e;

    public nnx(Context context, Uri uri, b bVar) {
        this.d = context;
        this.f43340b = uri;
        this.e = bVar;
    }

    @Override // android.os.AsyncTask
    protected void onPreExecute() {
        super.onPreExecute();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Boolean doInBackground(Integer... numArr) throws Throwable {
        nox.b("CompressPictureCase", "startCompressPic", true);
        if (this.f43340b == null) {
            this.e.b(new Bundle());
            return false;
        }
        nox.b("CompressPictureCase", "startCompressPic mFromUri = " + this.f43340b, false);
        Uri uriE = npb.e(this.d);
        if (uriE == null) {
            this.e.b(new Bundle());
            return false;
        }
        nox.b("CompressPictureCase", "startCompressPic tmpUri = " + uriE, false);
        npb.c(this.d, this.f43340b, uriE, false);
        if (npb.d(this.d, uriE.getPath(), 4096, uriE.getPath())) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("request_pic_uri_tag", uriE);
            this.e.a(bundle);
            nox.b("CompressPictureCase", "startCompressPic onSuccess", true);
            return true;
        }
        this.e.b(new Bundle());
        nox.b("CompressPictureCase", "startCompressPic onError", true);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(Boolean bool) {
        nox.b("CompressPictureCase", "onPostExecute", true);
        super.onPostExecute(bool);
    }
}
