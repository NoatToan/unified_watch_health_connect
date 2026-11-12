package com.huawei.featureuserprofile.route.navigationgenerator;

import com.huawei.featureuserprofile.route.hwgpxmodel.xmlparser.Obj2XmlSerializer;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.route.TrackInfoModel;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class BaseGenerator<T> {
    private static final String GPX = "gpx";
    private static final String KML = "kml";
    private static final String TAG = "BaseGenerator";
    private static final String TCX = "tcx";

    /* JADX WARN: Code duplicated, block: B:19:0x0037  */
    public static File makeTrackFile(TrackInfoModel trackInfoModel, String str, String str2) {
        byte b2;
        str.hashCode();
        int iHashCode = str.hashCode();
        if (iHashCode != 102575) {
            if (iHashCode != 106314) {
                if (iHashCode == 114665 && str.equals("tcx")) {
                    b2 = 2;
                } else {
                    b2 = -1;
                }
            } else if (str.equals("kml")) {
                b2 = 1;
            } else {
                b2 = -1;
            }
        } else if (str.equals("gpx")) {
            b2 = 0;
        } else {
            b2 = -1;
        }
        if (b2 == 0) {
            return new GpxFileGenerator().makeGpxFile(trackInfoModel, str2);
        }
        if (b2 == 1) {
            return new KmlFileGenerator().makeKmlFile(trackInfoModel, str2);
        }
        if (b2 == 2) {
            return new TcxFileGenerator().makeTcxFile(trackInfoModel, str2);
        }
        LogUtil.e(TAG, "File generation in this format is not supported.");
        return null;
    }

    protected File makeFile(T t, String str) {
        Obj2XmlSerializer obj2XmlSerializer = new Obj2XmlSerializer();
        File file = new File(str);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file, true);
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
                try {
                    bufferedOutputStream.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>".getBytes(Charset.defaultCharset()));
                    obj2XmlSerializer.toXml(t, bufferedOutputStream);
                    bufferedOutputStream.close();
                    fileOutputStream.close();
                    return file;
                } catch (Throwable th) {
                    try {
                        bufferedOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (IOException | XmlPullParserException unused) {
            if (!file.exists() || file.delete()) {
                return null;
            }
            LogUtil.e(TAG, "delete trackFile error.");
            return null;
        }
    }
}
