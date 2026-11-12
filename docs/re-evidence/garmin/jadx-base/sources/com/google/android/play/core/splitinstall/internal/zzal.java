package com.google.android.play.core.splitinstall.internal;

import android.content.res.AssetManager;
import fb1.c;
import java.io.File;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes14.dex */
public final class zzal {
    private final com.google.android.play.core.splitcompat.zza zza;
    private XmlPullParser zzb;

    public zzal(com.google.android.play.core.splitcompat.zza zzaVar) {
        this.zza = zzaVar;
    }

    public final long zza() throws XmlPullParserException, IOException {
        int next;
        if (this.zzb == null) {
            throw new XmlPullParserException("Manifest file needs to be loaded before parsing.");
        }
        do {
            next = this.zzb.next();
            if (next == 2) {
                if (!this.zzb.getName().equals("manifest")) {
                    break;
                }
                String attributeValue = this.zzb.getAttributeValue("http://schemas.android.com/apk/res/android", "versionCode");
                String attributeValue2 = this.zzb.getAttributeValue("http://schemas.android.com/apk/res/android", "versionCodeMajor");
                if (attributeValue == null) {
                    throw new XmlPullParserException("Manifest entry doesn't contain 'versionCode' attribute.");
                }
                try {
                    int i14 = Integer.parseInt(attributeValue);
                    if (attributeValue2 == null) {
                        return i14;
                    }
                    try {
                        return (((long) Integer.parseInt(attributeValue2)) << 32) | (((long) i14) & 4294967295L);
                    } catch (NumberFormatException e4) {
                        throw new XmlPullParserException(c.n("Couldn't parse versionCodeMajor to int: ", e4.getMessage()));
                    }
                } catch (NumberFormatException e14) {
                    throw new XmlPullParserException(c.n("Couldn't parse versionCode to int: ", e14.getMessage()));
                }
            }
        } while (next != 1);
        throw new XmlPullParserException("Couldn't find manifest entry at top-level.");
    }

    public final void zzb(AssetManager assetManager, File file) {
        this.zzb = assetManager.openXmlResourceParser(com.google.android.play.core.splitcompat.zza.zzc(assetManager, file), "AndroidManifest.xml");
    }
}
