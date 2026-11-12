package com.squareup.picasso;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import android.os.Build;
import android.provider.ContactsContract;
import com.huami.device.feature.notification.utils.PkgNameConstants;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes18.dex */
class d extends RequestHandler {
    private static final int b = 1;
    private static final int c = 2;
    private static final int d = 3;
    private static final int e = 4;
    private static final UriMatcher f;
    private final Context a;

    @TargetApi(14)
    public static class a {
        private a() {
        }

        public static InputStream a(ContentResolver contentResolver, Uri uri) {
            return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
        }
    }

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f = uriMatcher;
        uriMatcher.addURI(PkgNameConstants.CONTACTS_HUAWEI_OPPO, "contacts/lookup/*/#", 1);
        uriMatcher.addURI(PkgNameConstants.CONTACTS_HUAWEI_OPPO, "contacts/lookup/*", 1);
        uriMatcher.addURI(PkgNameConstants.CONTACTS_HUAWEI_OPPO, "contacts/#/photo", 2);
        uriMatcher.addURI(PkgNameConstants.CONTACTS_HUAWEI_OPPO, "contacts/#", 3);
        uriMatcher.addURI(PkgNameConstants.CONTACTS_HUAWEI_OPPO, "display_photo/#", 4);
    }

    public d(Context context) {
        this.a = context;
    }

    private InputStream h(Request request) throws IOException {
        ContentResolver contentResolver = this.a.getContentResolver();
        Uri uriLookupContact = request.uri;
        int iMatch = f.match(uriLookupContact);
        if (iMatch != 1) {
            if (iMatch != 2) {
                if (iMatch != 3) {
                    if (iMatch != 4) {
                        throw new IllegalStateException("Invalid uri: " + uriLookupContact);
                    }
                }
            }
            return contentResolver.openInputStream(uriLookupContact);
        }
        uriLookupContact = ContactsContract.Contacts.lookupContact(contentResolver, uriLookupContact);
        if (uriLookupContact == null) {
            return null;
        }
        return Build.VERSION.SDK_INT < 14 ? ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uriLookupContact) : a.a(contentResolver, uriLookupContact);
    }

    @Override // com.squareup.picasso.RequestHandler
    public boolean canHandleRequest(Request request) {
        Uri uri = request.uri;
        return "content".equals(uri.getScheme()) && ContactsContract.Contacts.CONTENT_URI.getHost().equals(uri.getHost()) && f.match(request.uri) != -1;
    }

    @Override // com.squareup.picasso.RequestHandler
    public RequestHandler.Result load(Request request, int i) throws IOException {
        InputStream inputStreamH = h(request);
        if (inputStreamH != null) {
            return new RequestHandler.Result(inputStreamH, Picasso.LoadedFrom.DISK);
        }
        return null;
    }
}
