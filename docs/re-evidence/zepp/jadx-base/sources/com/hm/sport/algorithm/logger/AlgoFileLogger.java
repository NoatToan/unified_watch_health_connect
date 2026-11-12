package com.hm.sport.algorithm.logger;

import com.huami.mifit.sportlib.common.Constants;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import org.cybergarage.http.HTTP;

/* JADX INFO: loaded from: classes4.dex */
public class AlgoFileLogger {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public final File mAllFile;
    public final File mAllNormFile;
    public final CrowdsourceTypes mDataType;
    public final File mFeatureFile;
    public final String mFileHeader;
    public final boolean mIsForCrowdSrc;
    public boolean mIsHeaderPrinted;
    public String mPrintHeader;
    public final File mStorage_dir;
    public File mTempFile;
    public final File mTestFile;

    /* JADX INFO: renamed from: com.hm.sport.algorithm.logger.AlgoFileLogger$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$hm$sport$algorithm$logger$AlgoFileLogger$CrowdsourceTypes;

        static {
            int[] iArr = new int[CrowdsourceTypes.values().length];
            $SwitchMap$com$hm$sport$algorithm$logger$AlgoFileLogger$CrowdsourceTypes = iArr;
            try {
                iArr[CrowdsourceTypes.ACCELERATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$hm$sport$algorithm$logger$AlgoFileLogger$CrowdsourceTypes[CrowdsourceTypes.GPS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$hm$sport$algorithm$logger$AlgoFileLogger$CrowdsourceTypes[CrowdsourceTypes.HEART.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum CrowdsourceTypes {
        ACCELERATION,
        GPS,
        HEART
    }

    public AlgoFileLogger(String str, CrowdsourceTypes crowdsourceTypes, boolean z) {
        File file = new File(str);
        this.mStorage_dir = file;
        if (!file.exists()) {
            file.mkdir();
        }
        this.mDataType = crowdsourceTypes;
        int i = AnonymousClass1.$SwitchMap$com$hm$sport$algorithm$logger$AlgoFileLogger$CrowdsourceTypes[crowdsourceTypes.ordinal()];
        if (i == 1) {
            this.mFileHeader = "acc";
        } else if (i == 2) {
            this.mFileHeader = "gps";
        } else if (i != 3) {
            this.mFileHeader = "error";
        } else {
            this.mFileHeader = Constants.DATA_KEY_HR;
        }
        this.mAllFile = new File(file.getAbsolutePath(), this.mFileHeader + "_cs_all.bin");
        this.mTempFile = new File(file.getAbsolutePath(), this.mFileHeader + "_cs_temp.bin");
        this.mAllNormFile = new File(file.getAbsolutePath(), this.mFileHeader + "_cs_all.txt");
        this.mTestFile = new File(file.getAbsolutePath(), this.mFileHeader + "_cs_test.txt");
        this.mFeatureFile = new File(file.getAbsolutePath(), this.mFileHeader + "_cs_feature.txt");
        this.mIsForCrowdSrc = z;
    }

    public void cleanStorage() {
        if (this.mAllFile.exists()) {
            this.mAllFile.delete();
        }
        if (this.mAllNormFile.exists()) {
            this.mAllNormFile.delete();
        }
        if (this.mTempFile.exists()) {
            this.mTempFile.delete();
        }
        if (this.mTestFile.exists()) {
            this.mTestFile.delete();
        }
        if (this.mFeatureFile.exists()) {
            this.mFeatureFile.delete();
        }
    }

    public void endWritingSport() throws IOException {
        if (this.mDataType == CrowdsourceTypes.ACCELERATION) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((short) 4095);
            arrayList.add((short) 4095);
            arrayList.add((short) 4095);
            int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            arrayList.add(Short.valueOf((short) (iCurrentTimeMillis & 4095)));
            int i = iCurrentTimeMillis >> 12;
            arrayList.add(Short.valueOf((short) (i & 4095)));
            arrayList.add(Short.valueOf((short) (4095 & (i >> 12))));
            writeValues(arrayList);
        }
        if (this.mIsForCrowdSrc) {
            return;
        }
        FileInputStream fileInputStream = new FileInputStream(this.mTempFile);
        byte[] bArr = new byte[fileInputStream.available()];
        fileInputStream.read(bArr);
        fileInputStream.close();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(this.mAllFile, true));
        dataOutputStream.write(bArr);
        int i2 = AnonymousClass1.$SwitchMap$com$hm$sport$algorithm$logger$AlgoFileLogger$CrowdsourceTypes[this.mDataType.ordinal()];
        if (i2 == 1) {
            dataOutputStream.writeShort(-32768);
        } else if (i2 == 2) {
            dataOutputStream.writeLong(-1L);
        }
        dataOutputStream.flush();
        dataOutputStream.close();
    }

    public File getAllFile() {
        return this.mAllFile;
    }

    public File getAllNormFile() {
        return this.mAllNormFile;
    }

    public int getAllStorageFileLength() throws IOException {
        if (!this.mAllFile.exists()) {
            throw new FileNotFoundException(this.mAllFile.getAbsolutePath());
        }
        FileInputStream fileInputStream = new FileInputStream(this.mAllFile);
        int iAvailable = fileInputStream.available();
        fileInputStream.read(new byte[iAvailable]);
        fileInputStream.close();
        return iAvailable;
    }

    public File getFeatureFile() {
        return this.mFeatureFile;
    }

    public File getTempFile() {
        return this.mTempFile;
    }

    public File getTestFile() {
        return this.mTestFile;
    }

    public void setIsHeaderPrinted(boolean z) {
        this.mIsHeaderPrinted = z;
    }

    public void startWriteSport(String str, String str2, String str3, String str4) throws ParseException {
        this.mPrintHeader = "Activity Name: " + str2 + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + str3 + "\nUserID: " + str + "\nStartTime: " + str4 + "\n";
        CrowdsourceTypes crowdsourceTypes = this.mDataType;
        if (crowdsourceTypes == CrowdsourceTypes.ACCELERATION) {
            this.mPrintHeader += "x\ty\tz\n";
        } else if (crowdsourceTypes == CrowdsourceTypes.GPS) {
            this.mPrintHeader += "TimeStamp, Longitude, Latitude, Altitude, Accuracy\n";
        }
        int time = ((int) new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(str4).getTime()) % 5;
        if (this.mIsForCrowdSrc) {
            this.mTempFile = new File(this.mStorage_dir.getAbsolutePath(), this.mFileHeader + "_cs_" + str + "_" + str2 + "_" + time + ".sbin");
        }
        this.mIsHeaderPrinted = false;
    }

    public File transferAllFileToNormalFile() throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(this.mAllFile));
        FileOutputStream fileOutputStream = new FileOutputStream(this.mAllNormFile);
        while (true) {
            int i = 1;
            while (true) {
                boolean z = true;
                while (true) {
                    try {
                        if (dataInputStream.available() < 6) {
                            fileOutputStream.flush();
                            fileOutputStream.close();
                            dataInputStream.close();
                            return this.mAllNormFile;
                        }
                        if (z) {
                            fileOutputStream.write(dataInputStream.readUTF().getBytes());
                            z = false;
                        } else {
                            int i2 = AnonymousClass1.$SwitchMap$com$hm$sport$algorithm$logger$AlgoFileLogger$CrowdsourceTypes[this.mDataType.ordinal()];
                            if (i2 == i) {
                                short s = dataInputStream.readShort();
                                if (s == Short.MIN_VALUE) {
                                    break;
                                }
                                fileOutputStream.write((((int) s) + HTTP.TAB + ((int) dataInputStream.readShort()) + HTTP.TAB + ((int) dataInputStream.readShort()) + "\n").getBytes());
                            } else if (i2 == 2) {
                                long j = dataInputStream.readLong();
                                if (j == -1) {
                                    fileOutputStream.write("\n".getBytes());
                                } else {
                                    fileOutputStream.write((j + ", " + dataInputStream.readDouble() + ", " + dataInputStream.readDouble() + ", " + dataInputStream.readFloat() + ", " + dataInputStream.readFloat() + "\n").getBytes());
                                }
                            }
                            i = 1;
                        }
                    } catch (IOException e) {
                        throw e;
                    }
                }
            }
            fileOutputStream.write("\n".getBytes());
        }
    }

    public void writeBinaryString(String str, boolean z) throws IOException {
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(getTempFile(), z));
        dataOutputStream.writeUTF(str);
        dataOutputStream.flush();
        dataOutputStream.close();
    }

    public void writeNormalString(String str, boolean z, File file) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file, z);
        fileOutputStream.write(str.getBytes());
        fileOutputStream.flush();
        fileOutputStream.close();
    }

    public void writeValues(List list) throws IOException {
        if (!this.mIsHeaderPrinted) {
            writeBinaryString(this.mPrintHeader, false);
            this.mIsHeaderPrinted = true;
        }
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(getTempFile(), true));
        int i = AnonymousClass1.$SwitchMap$com$hm$sport$algorithm$logger$AlgoFileLogger$CrowdsourceTypes[this.mDataType.ordinal()];
        for (int i2 = 0; i2 < list.size(); i2++) {
            int i3 = AnonymousClass1.$SwitchMap$com$hm$sport$algorithm$logger$AlgoFileLogger$CrowdsourceTypes[this.mDataType.ordinal()];
            if (i3 == 1) {
                dataOutputStream.writeShort(((Short) list.get(i2)).shortValue());
            } else if (i3 == 2) {
                int i4 = i2 % 5;
                if (i4 == 0) {
                    dataOutputStream.writeLong(((Long) list.get(i2)).longValue());
                } else if (i4 == 4) {
                    dataOutputStream.writeFloat(((Float) list.get(i2)).floatValue());
                } else if (i4 == 3) {
                    dataOutputStream.writeFloat(((Float) list.get(i2)).floatValue());
                } else {
                    dataOutputStream.writeDouble(((Double) list.get(i2)).doubleValue());
                }
            }
        }
        dataOutputStream.flush();
        dataOutputStream.close();
    }
}
