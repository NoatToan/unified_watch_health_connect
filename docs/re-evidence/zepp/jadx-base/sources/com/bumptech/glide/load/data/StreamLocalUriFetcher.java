package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import androidx.annotation.NonNull;
import com.huami.device.feature.notification.utils.PkgNameConstants;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public class StreamLocalUriFetcher extends LocalUriFetcher<InputStream> {
    private static final int e = 1;
    private static final int f = 2;
    private static final int g = 3;
    private static final int h = 4;
    private static final int i = 5;
    private static final UriMatcher j;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        j = uriMatcher;
        uriMatcher.addURI(PkgNameConstants.CONTACTS_HUAWEI_OPPO, "contacts/lookup/*/#", 1);
        uriMatcher.addURI(PkgNameConstants.CONTACTS_HUAWEI_OPPO, "contacts/lookup/*", 1);
        uriMatcher.addURI(PkgNameConstants.CONTACTS_HUAWEI_OPPO, "contacts/#/photo", 2);
        uriMatcher.addURI(PkgNameConstants.CONTACTS_HUAWEI_OPPO, "contacts/#", 3);
        uriMatcher.addURI(PkgNameConstants.CONTACTS_HUAWEI_OPPO, "contacts/#/display_photo", 4);
        uriMatcher.addURI(PkgNameConstants.CONTACTS_HUAWEI_OPPO, "phone_lookup/*", 5);
    }

    public StreamLocalUriFetcher(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    private InputStream a(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        int iMatch = j.match(uri);
        if (iMatch != 1) {
            if (iMatch == 3) {
                return b(contentResolver, uri);
            }
            if (iMatch != 5) {
                return contentResolver.openInputStream(uri);
            }
        }
        Uri uriLookupContact = ContactsContract.Contacts.lookupContact(contentResolver, uri);
        if (uriLookupContact != null) {
            return b(contentResolver, uriLookupContact);
        }
        throw new FileNotFoundException("Contact cannot be found");
    }

    private InputStream b(ContentResolver contentResolver, Uri uri) {
        return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    @NonNull
    public Class<InputStream> getDataClass() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.LocalUriFetcher
    public void close(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bumptech.glide.load.data.LocalUriFetcher
    public InputStream loadResource(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        InputStream inputStreamA = a(uri, contentResolver);
        if (inputStreamA != null) {
            return inputStreamA;
        }
        throw new FileNotFoundException("InputStream is null for " + uri);
    }
}
