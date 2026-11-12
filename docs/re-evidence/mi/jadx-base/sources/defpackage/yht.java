package defpackage;

import android.content.res.AssetManager;
import com.mibi.sdk.common.CommonConstants;
import java.io.File;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes5.dex */
public final class yht {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tht f40196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public XmlPullParser f40197b;

    public yht(tht thtVar) {
        this.f40196a = thtVar;
    }

    public final long a() throws XmlPullParserException, IOException {
        int next;
        if (this.f40197b == null) {
            throw new XmlPullParserException("Manifest file needs to be loaded before parsing.");
        }
        do {
            next = this.f40197b.next();
            if (next == 2) {
                if (!this.f40197b.getName().equals("manifest")) {
                    break;
                }
                String attributeValue = this.f40197b.getAttributeValue("http://schemas.android.com/apk/res/android", CommonConstants.KEY_VERSION_CODE);
                String attributeValue2 = this.f40197b.getAttributeValue("http://schemas.android.com/apk/res/android", "versionCodeMajor");
                if (attributeValue == null) {
                    throw new XmlPullParserException("Manifest entry doesn't contain 'versionCode' attribute.");
                }
                try {
                    int i = Integer.parseInt(attributeValue);
                    if (attributeValue2 == null) {
                        return i;
                    }
                    try {
                        return (((long) Integer.parseInt(attributeValue2)) << 32) | (((long) i) & 4294967295L);
                    } catch (NumberFormatException e) {
                        throw new XmlPullParserException(String.format("Couldn't parse versionCodeMajor to int: %s", e.getMessage()));
                    }
                } catch (NumberFormatException e2) {
                    throw new XmlPullParserException(String.format("Couldn't parse versionCode to int: %s", e2.getMessage()));
                }
            }
        } while (next != 1);
        throw new XmlPullParserException("Couldn't find manifest entry at top-level.");
    }

    public final void b(AssetManager assetManager, File file) throws IOException {
        this.f40197b = assetManager.openXmlResourceParser(tht.b(assetManager, file), "AndroidManifest.xml");
    }
}
