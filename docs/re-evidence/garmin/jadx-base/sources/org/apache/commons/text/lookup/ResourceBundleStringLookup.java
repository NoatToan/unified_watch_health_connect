package org.apache.commons.text.lookup;

import am.j;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/* JADX INFO: loaded from: classes3.dex */
final class ResourceBundleStringLookup extends AbstractStringLookup {
    static final ResourceBundleStringLookup INSTANCE = new ResourceBundleStringLookup();
    private final String bundleName;

    public ResourceBundleStringLookup(String str) {
        this.bundleName = str;
    }

    public ResourceBundle getBundle(String str) {
        return ResourceBundle.getBundle(str);
    }

    public String getString(String str, String str2) {
        return getBundle(str).getString(str2);
    }

    @Override // org.apache.commons.text.lookup.StringLookup
    public String lookup(String str) {
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split(AbstractStringLookup.SPLIT_STR);
        int length = strArrSplit.length;
        String str2 = this.bundleName;
        boolean z14 = str2 == null;
        if (z14 && length != 2) {
            throw IllegalArgumentExceptions.format("Bad resource bundle key format [%s]; expected format is BundleName:KeyName.", str);
        }
        if (str2 != null && length != 1) {
            throw IllegalArgumentExceptions.format("Bad resource bundle key format [%s]; expected format is KeyName.", str);
        }
        if (z14) {
            str2 = strArrSplit[0];
        }
        String str3 = z14 ? strArrSplit[1] : strArrSplit[0];
        try {
            return getString(str2, str3);
        } catch (MissingResourceException unused) {
            return null;
        } catch (Exception e4) {
            throw IllegalArgumentExceptions.format(e4, "Error looking up resource bundle [%s] and key [%s].", str2, str3);
        }
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(super.toString());
        sb3.append(" [bundleName=");
        return j.o(this.bundleName, "]", sb3);
    }

    public ResourceBundleStringLookup() {
        this(null);
    }
}
