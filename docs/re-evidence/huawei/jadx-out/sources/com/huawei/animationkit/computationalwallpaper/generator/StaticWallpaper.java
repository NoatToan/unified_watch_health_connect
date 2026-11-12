package com.huawei.animationkit.computationalwallpaper.generator;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import defpackage.bdo;
import defpackage.bge;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/* JADX INFO: loaded from: classes23.dex */
public class StaticWallpaper implements Wallpaper {
    public static final Parcelable.Creator<StaticWallpaper> CREATOR = new Parcelable.Creator<StaticWallpaper>() { // from class: com.huawei.animationkit.computationalwallpaper.generator.StaticWallpaper.5
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public StaticWallpaper createFromParcel(Parcel parcel) {
            return new StaticWallpaper(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public StaticWallpaper[] newArray(int i) {
            return new StaticWallpaper[i];
        }
    };
    private static final String PATTERN_TAG = "tag";
    private static final String PREVIEW_PNG = "preview.png";
    private static final String TAG = "StaticWallpaper";
    private static final String WALLPAPER_PNG = "wallpaper.png";
    private static final String XML_FILE = "wallpaper.xml";
    private final Bitmap mBackground;
    private final WatchFaceClock mClock;
    private final String mTag;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public StaticWallpaper(Bitmap bitmap, WatchFaceClock watchFaceClock, String str) {
        this.mBackground = bitmap;
        this.mClock = watchFaceClock;
        this.mTag = str;
    }

    private StaticWallpaper(Parcel parcel) {
        this.mBackground = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        this.mClock = (WatchFaceClock) parcel.readParcelable(WatchFaceClock.class.getClassLoader());
        this.mTag = parcel.readString();
    }

    public Bitmap getBackground() {
        return this.mBackground;
    }

    @Override // com.huawei.animationkit.computationalwallpaper.generator.Wallpaper
    public WatchFaceClock getClock() {
        return this.mClock;
    }

    @Override // com.huawei.animationkit.computationalwallpaper.generator.Wallpaper
    public String getTag() {
        return this.mTag;
    }

    @Override // com.huawei.animationkit.computationalwallpaper.generator.Wallpaper
    public void save(File file) throws bdo {
        Properties properties = new Properties();
        this.mClock.save(properties);
        properties.put("tag", this.mTag);
        saveProperties(properties, file, null);
        saveWallpaper(file, null);
        savePreview(file, null);
    }

    public void save(File file, String str) throws bdo {
        Properties properties = new Properties();
        this.mClock.save(properties);
        properties.put("tag", this.mTag);
        saveProperties(properties, file, str);
        saveWallpaper(file, str);
        savePreview(file, str);
    }

    private void saveProperties(Properties properties, File file, String str) throws bdo {
        String str2 = XML_FILE;
        if (str != null) {
            str2 = str + XML_FILE;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(file, str2));
            try {
                properties.storeToXML(fileOutputStream, null);
                fileOutputStream.close();
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
            Log.e(TAG, "store xml failed, file name: wallpaper.xml");
            throw new bdo("store xml failed, file name: wallpaper.xml");
        }
    }

    private void saveWallpaper(File file, String str) throws bdo {
        String str2 = WALLPAPER_PNG;
        if (str != null) {
            try {
                str2 = str + WALLPAPER_PNG;
            } catch (IOException unused) {
                throw new bdo("save wallpaper failed, file name: wallpaper.png");
            }
        }
        bge.e(file, str2, this.mBackground);
    }

    private void savePreview(File file, String str) throws bdo {
        String str2 = PREVIEW_PNG;
        if (str != null) {
            str2 = str + PREVIEW_PNG;
        }
        try {
            bge.e(file, str2, generatePreviewWithClock());
        } catch (IOException unused) {
            throw new bdo("save preview failed, prefix: " + str);
        }
    }

    private Bitmap generatePreviewWithClock() {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.mBackground.getWidth(), this.mBackground.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawBitmap(this.mBackground, 0.0f, 0.0f, (Paint) null);
        this.mClock.draw(canvas);
        return bitmapCreateBitmap;
    }

    @Override // com.huawei.animationkit.computationalwallpaper.generator.Wallpaper
    public Bitmap toBitmap() {
        return this.mBackground;
    }

    public static StaticWallpaper load(File file) throws bdo {
        Properties propertiesLoadProperties = loadProperties(file);
        WatchFaceClock watchFaceClock = new WatchFaceClock();
        watchFaceClock.load(propertiesLoadProperties);
        return new StaticWallpaper(loadBackground(file), watchFaceClock, propertiesLoadProperties.getProperty("tag"));
    }

    private static Bitmap loadBackground(File file) throws bdo {
        try {
            return bge.e(file, WALLPAPER_PNG);
        } catch (IOException unused) {
            throw new bdo("load background failed, file name: wallpaper.png");
        }
    }

    private static Properties loadProperties(File file) throws bdo {
        Properties properties = new Properties();
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(file, XML_FILE));
            try {
                properties.loadFromXML(fileInputStream);
                fileInputStream.close();
                return properties;
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
            Log.e(TAG, "load xml failed, file name: wallpaper.xml");
            throw new bdo("load xml failed, file name: wallpaper.xml");
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mBackground, i);
        parcel.writeParcelable(this.mClock, i);
        parcel.writeString(this.mTag);
    }
}
