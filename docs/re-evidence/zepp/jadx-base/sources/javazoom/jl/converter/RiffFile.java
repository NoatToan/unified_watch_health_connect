package javazoom.jl.converter;

import androidx.core.internal.view.SupportMenu;
import androidx.recyclerview.widget.ItemTouchHelper;
import java.io.IOException;
import java.io.RandomAccessFile;
import kotlin.UShort;

/* JADX INFO: loaded from: classes22.dex */
public class RiffFile {
    public static final int DDC_FAILURE = 1;
    public static final int DDC_FILE_ERROR = 3;
    public static final int DDC_INVALID_CALL = 4;
    public static final int DDC_INVALID_FILE = 6;
    public static final int DDC_OUT_OF_MEMORY = 2;
    public static final int DDC_SUCCESS = 0;
    public static final int DDC_USER_ABORT = 5;
    public static final int RFM_READ = 2;
    public static final int RFM_UNKNOWN = 0;
    public static final int RFM_WRITE = 1;
    private a a;
    public RandomAccessFile file = null;
    public int fmode = 0;

    public class a {
        public int a = 0;
        public int b = 0;

        public a() {
        }
    }

    public RiffFile() {
        a aVar = new a();
        this.a = aVar;
        aVar.a = FourCC("RIFF");
        this.a.b = 0;
    }

    public static int FourCC(String str) {
        byte[] bArr = {32, 32, 32, 32};
        str.getBytes(0, 4, bArr, 0);
        return ((bArr[0] << 24) & (-16777216)) | ((bArr[1] << 16) & ItemTouchHelper.ACTION_MODE_DRAG_MASK) | ((bArr[2] << 8) & 65280) | (bArr[3] & 255);
    }

    private String a(int i) {
        switch (i) {
            case 0:
                return "DDC_SUCCESS";
            case 1:
                return "DDC_FAILURE";
            case 2:
                return "DDC_OUT_OF_MEMORY";
            case 3:
                return "DDC_FILE_ERROR";
            case 4:
                return "DDC_INVALID_CALL";
            case 5:
                return "DDC_USER_ABORT";
            case 6:
                return "DDC_INVALID_FILE";
            default:
                return "Unknown Error";
        }
    }

    public int Backpatch(long j, a aVar, int i) {
        RandomAccessFile randomAccessFile = this.file;
        if (randomAccessFile == null) {
            return 4;
        }
        try {
            randomAccessFile.seek(j);
            return Write(aVar, i);
        } catch (IOException unused) {
            return 3;
        }
    }

    public int Close() {
        int i = this.fmode;
        int i2 = 3;
        try {
            if (i != 1) {
                if (i == 2) {
                    this.file.close();
                }
                i2 = 0;
                this.file = null;
                this.fmode = 0;
                return i2;
            }
            this.file.seek(0L);
            a aVar = this.a;
            int i3 = aVar.a;
            int i4 = aVar.b;
            this.file.write(new byte[]{(byte) ((i3 >>> 24) & 255), (byte) ((i3 >>> 16) & 255), (byte) ((i3 >>> 8) & 255), (byte) (i3 & 255), (byte) (i4 & 255), (byte) ((i4 >>> 8) & 255), (byte) ((i4 >>> 16) & 255), (byte) ((i4 >>> 24) & 255)}, 0, 8);
            this.file.close();
            i2 = 0;
        } catch (IOException unused) {
        }
        this.file = null;
        this.fmode = 0;
        return i2;
    }

    public int CurrentFileMode() {
        return this.fmode;
    }

    public long CurrentFilePosition() {
        try {
            return this.file.getFilePointer();
        } catch (IOException unused) {
            return -1L;
        }
    }

    public int Expect(String str, int i) {
        int i2 = 0;
        while (true) {
            int i3 = i - 1;
            if (i == 0) {
                return 0;
            }
            try {
                int i4 = i2 + 1;
                if (this.file.readByte() != str.charAt(i2)) {
                    return 3;
                }
                i = i3;
                i2 = i4;
            } catch (IOException unused) {
                return 3;
            }
        }
    }

    public int Open(String str, int i) {
        int iClose = this.fmode != 0 ? Close() : 0;
        if (iClose != 0) {
            return iClose;
        }
        if (i == 1) {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(str, "rw");
                this.file = randomAccessFile;
                try {
                    a aVar = this.a;
                    int i2 = aVar.a;
                    int i3 = aVar.b;
                    randomAccessFile.write(new byte[]{(byte) ((i2 >>> 24) & 255), (byte) ((i2 >>> 16) & 255), (byte) ((i2 >>> 8) & 255), (byte) (i2 & 255), (byte) (i3 & 255), (byte) ((i3 >>> 8) & 255), (byte) ((i3 >>> 16) & 255), (byte) ((i3 >>> 24) & 255)}, 0, 8);
                    this.fmode = 1;
                } catch (IOException unused) {
                    this.file.close();
                    this.fmode = 0;
                }
                return iClose;
            } catch (IOException unused2) {
                this.fmode = 0;
            }
        } else {
            if (i != 2) {
                return 4;
            }
            try {
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(str, "r");
                this.file = randomAccessFile2;
                try {
                    byte[] bArr = new byte[8];
                    randomAccessFile2.read(bArr, 0, 8);
                    this.fmode = 2;
                    a aVar2 = this.a;
                    aVar2.a = ((bArr[2] << 8) & 65280) | ((bArr[1] << 16) & ItemTouchHelper.ACTION_MODE_DRAG_MASK) | ((bArr[0] << 24) & (-16777216)) | (bArr[3] & 255);
                    aVar2.b = (bArr[7] & 255) | ((bArr[4] << 24) & (-16777216)) | ((bArr[5] << 16) & ItemTouchHelper.ACTION_MODE_DRAG_MASK) | ((bArr[6] << 8) & 65280);
                    return iClose;
                } catch (IOException unused3) {
                    this.file.close();
                    this.fmode = 0;
                    return iClose;
                }
            } catch (IOException unused4) {
                this.fmode = 0;
            }
        }
        return 3;
    }

    public int Read(byte[] bArr, int i) {
        try {
            this.file.read(bArr, 0, i);
            return 0;
        } catch (IOException unused) {
            return 3;
        }
    }

    public int Seek(long j) {
        try {
            this.file.seek(j);
            return 0;
        } catch (IOException unused) {
            return 3;
        }
    }

    public int Write(byte[] bArr, int i) {
        if (this.fmode != 1) {
            return 4;
        }
        try {
            this.file.write(bArr, 0, i);
            this.fmode = 1;
            this.a.b += i;
            return 0;
        } catch (IOException unused) {
            return 3;
        }
    }

    public int Backpatch(long j, byte[] bArr, int i) {
        RandomAccessFile randomAccessFile = this.file;
        if (randomAccessFile == null) {
            return 4;
        }
        try {
            randomAccessFile.seek(j);
            return Write(bArr, i);
        } catch (IOException unused) {
            return 3;
        }
    }

    public int Write(short[] sArr, int i) {
        byte[] bArr = new byte[i];
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            bArr[i2] = (byte) (sArr[i3] & 255);
            bArr[i2 + 1] = (byte) ((sArr[i3] >>> 8) & 255);
            i2 += 2;
            i3++;
        }
        if (this.fmode != 1) {
            return 4;
        }
        try {
            this.file.write(bArr, 0, i);
            this.fmode = 1;
            this.a.b += i;
            return 0;
        } catch (IOException unused) {
            return 3;
        }
    }

    public int Write(a aVar, int i) {
        int i2 = aVar.a;
        int i3 = aVar.b;
        byte[] bArr = {(byte) ((i2 >>> 24) & 255), (byte) ((i2 >>> 16) & 255), (byte) ((i2 >>> 8) & 255), (byte) (i2 & 255), (byte) (i3 & 255), (byte) ((i3 >>> 8) & 255), (byte) ((i3 >>> 16) & 255), (byte) ((i3 >>> 24) & 255)};
        if (this.fmode != 1) {
            return 4;
        }
        try {
            this.file.write(bArr, 0, i);
            this.fmode = 1;
            this.a.b += i;
            return 0;
        } catch (IOException unused) {
            return 3;
        }
    }

    public int Write(short s, int i) {
        short s2 = (short) (((s << 8) & 65280) | ((s >>> 8) & 255));
        if (this.fmode != 1) {
            return 4;
        }
        try {
            this.file.writeShort(s2);
            this.fmode = 1;
            this.a.b += i;
            return 0;
        } catch (IOException unused) {
            return 3;
        }
    }

    public int Write(int i, int i2) {
        short s = (short) ((i >>> 16) & 65535);
        short s2 = (short) (i & 65535);
        int i3 = ((((short) (((s2 << 8) & 65280) | ((s2 >>> 8) & 255))) << 16) & SupportMenu.CATEGORY_MASK) | (((short) (((s << 8) & 65280) | ((s >>> 8) & 255))) & UShort.MAX_VALUE);
        if (this.fmode != 1) {
            return 4;
        }
        try {
            this.file.writeInt(i3);
            this.fmode = 1;
            this.a.b += i2;
            return 0;
        } catch (IOException unused) {
            return 3;
        }
    }
}
