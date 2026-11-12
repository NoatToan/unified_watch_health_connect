package defpackage;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import com.xiaomi.fitness.userinfo.medicalid.view.MedicalIdEditActivity;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public class uio extends rne<InputStream> {
    public static final UriMatcher d;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        d = uriMatcher;
        uriMatcher.addURI(MedicalIdEditActivity.SYSTEM_CONTACT_PACKAGE, "contacts/lookup/*/#", 1);
        uriMatcher.addURI(MedicalIdEditActivity.SYSTEM_CONTACT_PACKAGE, "contacts/lookup/*", 1);
        uriMatcher.addURI(MedicalIdEditActivity.SYSTEM_CONTACT_PACKAGE, "contacts/#/photo", 2);
        uriMatcher.addURI(MedicalIdEditActivity.SYSTEM_CONTACT_PACKAGE, "contacts/#", 3);
        uriMatcher.addURI(MedicalIdEditActivity.SYSTEM_CONTACT_PACKAGE, "contacts/#/display_photo", 4);
        uriMatcher.addURI(MedicalIdEditActivity.SYSTEM_CONTACT_PACKAGE, "phone_lookup/*", 5);
    }

    public uio(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @Override // defpackage.jl5
    public Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // defpackage.rne
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void e(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    @Override // defpackage.rne
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public InputStream f(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        InputStream inputStreamI = i(uri, contentResolver);
        if (inputStreamI != null) {
            return inputStreamI;
        }
        throw new FileNotFoundException("InputStream is null for " + uri);
    }

    public final InputStream i(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        int iMatch = d.match(uri);
        if (iMatch != 1) {
            if (iMatch == 3) {
                return j(contentResolver, uri);
            }
            if (iMatch != 5) {
                return contentResolver.openInputStream(uri);
            }
        }
        Uri uriLookupContact = ContactsContract.Contacts.lookupContact(contentResolver, uri);
        if (uriLookupContact != null) {
            return j(contentResolver, uriLookupContact);
        }
        throw new FileNotFoundException("Contact cannot be found");
    }

    public final InputStream j(ContentResolver contentResolver, Uri uri) {
        return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }
}
