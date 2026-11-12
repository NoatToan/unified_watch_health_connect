package m7;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f117058a;

    public interface b {
    }

    public d(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f117058a = new a(uri, clipDescription, uri2);
    }

    public static d a(InputContentInfo inputContentInfo) {
        if (inputContentInfo == null) {
            return null;
        }
        return new d(new a(inputContentInfo));
    }

    public static final class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InputContentInfo f117059a;

        public a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f117059a = new InputContentInfo(uri, clipDescription, uri2);
        }

        public a(Object obj) {
            this.f117059a = (InputContentInfo) obj;
        }
    }

    private d(b bVar) {
        this.f117058a = bVar;
    }
}
