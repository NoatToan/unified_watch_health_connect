package com.xiaomi.ai.streamplayer;

import com.airoha.android.lib.fota.fotaState.StageEnum;
import com.google.android.exoplayer2.audio.OpusUtil;
import com.xiaomi.ai.utils.Log;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.PipedInputStream;
import java.util.HashMap;

/* JADX INFO: loaded from: classes18.dex */
class b extends i {
    public static final String a = "MiSpeechSDK:FrameParser";
    private static final String e = "Layer I";
    private static final String f = "Layer II";
    private static final String g = "Layer III";
    private static final String h = "MPEG2.5";
    private static final String i = "MPEG2";
    private static final String j = "MPEG1";
    private static final String k = "MPEG_UNKNOW";
    private static final String l = "Check bit 1";
    private static final String m = "Check bit 0";
    private static final String n = "Layer unkown";
    private static final char o = '1';
    private static final char p = '0';
    private static final int q = 1;
    private static final int r = 2;
    private static final int s = 0;
    private static final HashMap<String, Integer> t;
    private static final HashMap<String, Integer> u;
    private Thread v = new c(this);

    public static class a {
        public String a;
        public String b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;

        public boolean a() {
            return this.a != b.n && this.b != b.k && this.f > 0 && this.c > 0 && this.d > 0 && this.g > 0 && this.e > 0;
        }

        public String toString() {
            return "layer=" + this.a + ";mpeg=" + this.b + ";sampleRate=" + this.c + ";bitrate=" + this.d + ";sampleRateCount=" + this.e + ";frameSize=" + this.f + "channel=" + this.g;
        }
    }

    static {
        HashMap<String, Integer> map = new HashMap<>();
        t = map;
        HashMap<String, Integer> map2 = new HashMap<>();
        u = map2;
        map.put(a(g, i, new char[]{p, p, o, o}, 0, 4), 128000);
        map.put(a(g, i, new char[]{p, o, p, p}, 0, 4), 16000);
        map.put(a(g, i, new char[]{p, p, o, p}, 0, 4), 32000);
        map2.put(a(g, j, null, 0, 0), 1152);
        String strA = a(g, i, null, 0, 0);
        Integer numValueOf = Integer.valueOf(StageEnum.APP_RESULT_FOTA_NV_SUCCESS);
        map2.put(strA, numValueOf);
        map2.put(a(g, h, null, 0, 0), numValueOf);
    }

    private static String a(byte b) {
        String binaryString = Integer.toBinaryString(b | 256);
        int length = binaryString.length();
        return binaryString.substring(length - 8, length);
    }

    public static String a(String str, String str2, char[] cArr, int i2, int i3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            sb.append(cArr[i4]);
        }
        return sb.toString();
    }

    private static boolean a(char[] cArr) {
        for (int i2 = 21; i2 < 31; i2++) {
            if (cArr[i2] != '1') {
                return false;
            }
        }
        return true;
    }

    private static char[] a(byte[] bArr) {
        char[] cArrB = b(bArr);
        char[] cArr = new char[cArrB.length];
        for (int i2 = 0; i2 < cArrB.length; i2++) {
            cArr[(cArrB.length - i2) - 1] = cArrB[i2];
        }
        return cArr;
    }

    private static int b(char[] cArr) {
        if (cArr[7] == '0' && cArr[6] == '0') {
            return 2;
        }
        return (cArr[7] == '1' && cArr[6] == '1') ? 1 : 0;
    }

    private static char[] b(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            sb.append(String.format("%s", a(b)));
        }
        return sb.toString().toCharArray();
    }

    private static int c(char[] cArr) {
        Integer num = u.get(a(g(cArr), i(cArr), null, 0, 0));
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    private static int d(char[] cArr) {
        Integer num = t.get(a(g(cArr), i(cArr), cArr, 12, 4));
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:25:0x006b A[Catch: all -> 0x00dd, IOException -> 0x00df, TryCatch #0 {IOException -> 0x00df, blocks: (B:3:0x0005, B:5:0x000b, B:6:0x000e, B:7:0x0012, B:13:0x001f, B:15:0x0025, B:18:0x002e, B:19:0x003d, B:23:0x005c, B:25:0x006b, B:26:0x0095, B:28:0x009b, B:30:0x00aa, B:32:0x00b2, B:34:0x00bb, B:35:0x00c1, B:37:0x00c9, B:39:0x00cd, B:20:0x0042, B:22:0x004c), top: B:62:0x0005, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x00aa A[Catch: all -> 0x00dd, IOException -> 0x00df, TryCatch #0 {IOException -> 0x00df, blocks: (B:3:0x0005, B:5:0x000b, B:6:0x000e, B:7:0x0012, B:13:0x001f, B:15:0x0025, B:18:0x002e, B:19:0x003d, B:23:0x005c, B:25:0x006b, B:26:0x0095, B:28:0x009b, B:30:0x00aa, B:32:0x00b2, B:34:0x00bb, B:35:0x00c1, B:37:0x00c9, B:39:0x00cd, B:20:0x0042, B:22:0x004c), top: B:62:0x0005, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00bb A[Catch: all -> 0x00dd, IOException -> 0x00df, EDGE_INSN: B:34:0x00bb->B:36:0x00c7 BREAK  A[LOOP:2: B:29:0x00a8->B:35:0x00c1], TryCatch #0 {IOException -> 0x00df, blocks: (B:3:0x0005, B:5:0x000b, B:6:0x000e, B:7:0x0012, B:13:0x001f, B:15:0x0025, B:18:0x002e, B:19:0x003d, B:23:0x005c, B:25:0x006b, B:26:0x0095, B:28:0x009b, B:30:0x00aa, B:32:0x00b2, B:34:0x00bb, B:35:0x00c1, B:37:0x00c9, B:39:0x00cd, B:20:0x0042, B:22:0x004c), top: B:62:0x0005, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00c1 A[Catch: all -> 0x00dd, IOException -> 0x00df, LOOP:2: B:29:0x00a8->B:35:0x00c1, LOOP_END, TryCatch #0 {IOException -> 0x00df, blocks: (B:3:0x0005, B:5:0x000b, B:6:0x000e, B:7:0x0012, B:13:0x001f, B:15:0x0025, B:18:0x002e, B:19:0x003d, B:23:0x005c, B:25:0x006b, B:26:0x0095, B:28:0x009b, B:30:0x00aa, B:32:0x00b2, B:34:0x00bb, B:35:0x00c1, B:37:0x00c9, B:39:0x00cd, B:20:0x0042, B:22:0x004c), top: B:62:0x0005, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x00d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x009b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x00b2 A[SYNTHETIC] */
    public void d() {
        j jVar;
        String str;
        char[] cArrA;
        a aVar;
        byte[] bArr;
        int i2;
        byte[] bArr2;
        int i3;
        int i4;
        j jVar2;
        int i5;
        j jVar3;
        int i6;
        PipedInputStream pipedInputStream = this.c;
        try {
            try {
                byte[] bArr3 = new byte[4];
                j jVar4 = this.b;
                if (jVar4 != null) {
                    jVar4.a(this);
                }
                byte[] bArr4 = new byte[4];
                boolean z = false;
                while (!this.d) {
                    if (z) {
                        System.arraycopy(bArr3, 1, bArr3, 0, 3);
                        int i7 = pipedInputStream.read(bArr3, 3, 1);
                        if (i7 <= 0) {
                            str = "doParserFrame:read end ret=" + i7;
                            Log.e(a, str);
                            break;
                        }
                        cArrA = a(bArr3);
                        aVar = new a();
                        if (a(cArrA)) {
                            aVar.a = g(cArrA);
                            aVar.b = i(cArrA);
                            aVar.d = d(cArrA);
                            aVar.c = f(cArrA);
                            aVar.e = c(cArrA);
                            aVar.f = e(cArrA);
                            aVar.g = b(cArrA);
                        }
                        if (aVar.a()) {
                            int i8 = aVar.f;
                            bArr = new byte[i8];
                            i2 = i8 - 4;
                            bArr2 = new byte[i8];
                            System.arraycopy(bArr3, 0, bArr, 0, 4);
                            i3 = 0;
                            i4 = 4;
                            while (i2 != i3) {
                                i5 = pipedInputStream.read(bArr2, 0, i2 - i3);
                                if (i5 < 0) {
                                    Log.e(a, "doParserFrame:read end frame data miss ");
                                    jVar3 = this.b;
                                    if (jVar3 != null) {
                                        break;
                                    }
                                    jVar3.a(this, "frame  misss ");
                                    break;
                                }
                                i3 += i5;
                                System.arraycopy(bArr2, 0, bArr, i4, i5);
                                i4 += i5;
                            }
                            if (i2 != i3) {
                            }
                        } else {
                            z = true;
                        }
                    } else {
                        int i9 = 0;
                        int i10 = 0;
                        do {
                            i6 = pipedInputStream.read(bArr4, 0, 4 - i9);
                            if (i6 <= 0) {
                                break;
                            }
                            i9 += i6;
                            System.arraycopy(bArr4, 0, bArr3, i10, i6);
                            i10 += i6;
                        } while (i9 != 4);
                        if (i6 <= 0) {
                            str = "doParserFrame:read end ret=" + i6;
                            Log.e(a, str);
                            break;
                        }
                        cArrA = a(bArr3);
                        aVar = new a();
                        if (a(cArrA)) {
                            aVar.a = g(cArrA);
                            aVar.b = i(cArrA);
                            aVar.d = d(cArrA);
                            aVar.c = f(cArrA);
                            aVar.e = c(cArrA);
                            aVar.f = e(cArrA);
                            aVar.g = b(cArrA);
                        }
                        if (aVar.a()) {
                            int i11 = aVar.f;
                            bArr = new byte[i11];
                            i2 = i11 - 4;
                            bArr2 = new byte[i11];
                            System.arraycopy(bArr3, 0, bArr, 0, 4);
                            i3 = 0;
                            i4 = 4;
                            while (i2 != i3) {
                                i5 = pipedInputStream.read(bArr2, 0, i2 - i3);
                                if (i5 < 0) {
                                    Log.e(a, "doParserFrame:read end frame data miss ");
                                    jVar3 = this.b;
                                    if (jVar3 != null) {
                                        break;
                                    }
                                    jVar3.a(this, "frame  misss ");
                                    break;
                                }
                                i3 += i5;
                                System.arraycopy(bArr2, 0, bArr, i4, i5);
                                i4 += i5;
                            }
                            if (i2 != i3 && (jVar2 = this.b) != null) {
                                jVar2.a(this, aVar, bArr);
                            }
                        } else {
                            z = true;
                        }
                    }
                }
                jVar = this.b;
                if (jVar == null) {
                    return;
                }
            } catch (IOException e2) {
                if (e2 instanceof InterruptedIOException) {
                    Log.e(a, "InterruptedIOException");
                } else {
                    Log.e(a, "doParserFrame", e2);
                    j jVar5 = this.b;
                    if (jVar5 != null) {
                        jVar5.a(this, e2.getMessage());
                    }
                }
                jVar = this.b;
                if (jVar == null) {
                    return;
                }
            }
            jVar.b(this);
        } catch (Throwable th) {
            j jVar6 = this.b;
            if (jVar6 != null) {
                jVar6.b(this);
            }
            throw th;
        }
    }

    private static int e(char[] cArr) {
        if (g(cArr) == e) {
            return ((int) Math.floor(((c(cArr) / 8.0f) * d(cArr)) / f(cArr))) + (cArr[9] == '1' ? 4 : 0);
        }
        return ((int) Math.floor(((c(cArr) / 8.0f) * d(cArr)) / f(cArr))) + (cArr[9] == '1' ? 1 : 0);
    }

    private static int f(char[] cArr) {
        if (cArr[20] == '0' && cArr[19] == '0') {
            if (cArr[11] == '0' && cArr[10] == '0') {
                return 11025;
            }
            if (cArr[11] == '0' && cArr[10] == '1') {
                return 12000;
            }
            return (cArr[11] == '1' && cArr[10] == '0') ? 8000 : -1;
        }
        if (cArr[20] == '1' && cArr[19] == '0') {
            if (cArr[11] == '0' && cArr[10] == '0') {
                return 22050;
            }
            if (cArr[11] == '0' && cArr[10] == '1') {
                return 24000;
            }
            return (cArr[11] == '1' && cArr[10] == '0') ? 16000 : -1;
        }
        if (cArr[20] == '1' && cArr[19] == '1') {
            if (cArr[11] == '0' && cArr[10] == '0') {
                return 44100;
            }
            if (cArr[11] == '0' && cArr[10] == '1') {
                return OpusUtil.SAMPLE_RATE;
            }
            if (cArr[11] == '1' && cArr[10] == '0') {
                return 32000;
            }
        }
        return -1;
    }

    private static String g(char[] cArr) {
        if (cArr[18] == '0' && cArr[17] == '1') {
            return g;
        }
        if (cArr[18] == '1' && cArr[17] == '0') {
            return f;
        }
        return (cArr[18] == '1' && cArr[17] == '1') ? e : n;
    }

    private static String h(char[] cArr) {
        return cArr[16] == '0' ? m : l;
    }

    private static String i(char[] cArr) {
        if (cArr[20] == '0' && cArr[19] == '0') {
            return h;
        }
        if (cArr[20] == '1' && cArr[19] == '0') {
            return i;
        }
        return (cArr[20] == '1' && cArr[19] == '1') ? j : k;
    }

    @Override // com.xiaomi.ai.streamplayer.i
    public void a() {
        super.a();
        this.v.start();
    }

    @Override // com.xiaomi.ai.streamplayer.i
    public void b() {
        super.b();
        this.d = true;
        this.v.interrupt();
    }
}
