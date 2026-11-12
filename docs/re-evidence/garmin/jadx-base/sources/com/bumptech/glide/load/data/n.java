package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes7.dex */
public class n extends l<InputStream> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final UriMatcher f28562e;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f28562e = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        uriMatcher.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    public n(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @Override // com.bumptech.glide.load.data.d
    public final Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.l
    public final void c(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0060  */
    /* JADX WARN: Code duplicated, block: B:35:0x0073  */
    @Override // com.bumptech.glide.load.data.l
    public final Object e(ContentResolver contentResolver, Uri uri) throws FileNotFoundException {
        Uri uriLookupContact;
        InputStream inputStreamOpenContactPhotoInputStream;
        int iMatch = f28562e.match(uri);
        if (iMatch == 1) {
            uriLookupContact = ContactsContract.Contacts.lookupContact(contentResolver, uri);
            if (uriLookupContact != null) {
                throw new FileNotFoundException("Contact cannot be found");
            }
            inputStreamOpenContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uriLookupContact, true);
        } else if (iMatch == 3) {
            inputStreamOpenContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
        } else if (iMatch == 5) {
            uriLookupContact = ContactsContract.Contacts.lookupContact(contentResolver, uri);
            if (uriLookupContact != null) {
                throw new FileNotFoundException("Contact cannot be found");
            }
            inputStreamOpenContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uriLookupContact, true);
        } else if (!this.f28558a || !vi.b.a(uri) || Build.VERSION.SDK_INT < 30 || SdkExtensions.getExtensionVersion(30) < 17) {
            inputStreamOpenContactPhotoInputStream = contentResolver.openInputStream(uri);
        } else {
            AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = MediaStore.openAssetFileDescriptor(contentResolver, uri, JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, null);
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new FileNotFoundException(am.j.j(uri, "FileDescriptor is null for: "));
            }
            try {
                inputStreamOpenContactPhotoInputStream = assetFileDescriptorOpenAssetFileDescriptor.createInputStream();
            } catch (IOException e4) {
                try {
                    assetFileDescriptorOpenAssetFileDescriptor.close();
                } catch (Exception unused) {
                }
                throw ((FileNotFoundException) new FileNotFoundException("Unable to create stream").initCause(e4));
            }
        }
        if (inputStreamOpenContactPhotoInputStream != null) {
            return inputStreamOpenContactPhotoInputStream;
        }
        throw new FileNotFoundException(am.j.j(uri, "InputStream is null for "));
    }

    public n(ContentResolver contentResolver, Uri uri, boolean z14) {
        super(contentResolver, uri, z14);
    }
}
