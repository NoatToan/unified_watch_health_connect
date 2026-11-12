package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public class bje extends ake {
    public static final String[] d = {"_id", "_data"};
    public final ContentResolver c;

    public bje(Executor executor, n3i n3iVar, ContentResolver contentResolver) {
        super(executor, n3iVar);
        this.c = contentResolver;
    }

    public static int h(String str) {
        if (str == null) {
            return -1;
        }
        return (int) new File(str).length();
    }

    @Override // defpackage.ake
    public o98 d(ImageRequest imageRequest) throws IOException {
        o98 o98VarG;
        InputStream inputStreamCreateInputStream;
        Uri uriQ = imageRequest.q();
        if (!idq.g(uriQ)) {
            return (!idq.f(uriQ) || (o98VarG = g(uriQ)) == null) ? e(this.c.openInputStream(uriQ), -1) : o98VarG;
        }
        if (uriQ.toString().endsWith("/photo")) {
            inputStreamCreateInputStream = this.c.openInputStream(uriQ);
        } else if (uriQ.toString().endsWith("/display_photo")) {
            try {
                inputStreamCreateInputStream = this.c.openAssetFileDescriptor(uriQ, "r").createInputStream();
            } catch (IOException unused) {
                throw new IOException("Contact photo does not exist: " + uriQ);
            }
        } else {
            InputStream inputStreamOpenContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(this.c, uriQ);
            if (inputStreamOpenContactPhotoInputStream == null) {
                throw new IOException("Contact photo does not exist: " + uriQ);
            }
            inputStreamCreateInputStream = inputStreamOpenContactPhotoInputStream;
        }
        return e(inputStreamCreateInputStream, -1);
    }

    @Override // defpackage.ake
    public String f() {
        return "LocalContentUriFetchProducer";
    }

    public final o98 g(Uri uri) throws IOException {
        Cursor cursorQuery = this.c.query(uri, d, null, null, null);
        if (cursorQuery == null) {
            return null;
        }
        try {
            if (cursorQuery.getCount() == 0) {
                return null;
            }
            cursorQuery.moveToFirst();
            String string = cursorQuery.getString(cursorQuery.getColumnIndex("_data"));
            if (string != null) {
                return e(new FileInputStream(string), h(string));
            }
            return null;
        } finally {
            cursorQuery.close();
        }
    }
}
