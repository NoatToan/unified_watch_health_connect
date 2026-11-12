package com.ta.utdid2.a.a;

import android.annotation.SuppressLint;
import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.tsmclient.smartcard.terminal.APDUConstants;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ boolean f10684a = true;

    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f10685a;

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        public byte[] f2a;
    }

    /* JADX INFO: renamed from: com.ta.utdid2.a.a.b$b, reason: collision with other inner class name */
    public static class C0337b extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final int[] f10686a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final int[] f10687b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        private final int[] c;
        private int state;
        private int value;

        public C0337b(int i, byte[] bArr) {
            ((a) this).f2a = bArr;
            this.c = (i & 8) == 0 ? f10686a : f10687b;
            this.state = 0;
            this.value = 0;
        }

        /* JADX WARN: Code duplicated, block: B:42:0x00c0  */
        public boolean a(byte[] bArr, int i, int i2, boolean z) {
            int i3 = this.state;
            if (i3 == 6) {
                return false;
            }
            int i4 = i2 + i;
            int i5 = this.value;
            byte[] bArr2 = ((a) this).f2a;
            int[] iArr = this.c;
            int i6 = 0;
            int i7 = i5;
            int i8 = i3;
            int i9 = i;
            while (i9 < i4) {
                if (i8 == 0) {
                    while (true) {
                        int i10 = i9 + 4;
                        if (i10 > i4 || (i7 = (iArr[bArr[i9] & 255] << 18) | (iArr[bArr[i9 + 1] & 255] << 12) | (iArr[bArr[i9 + 2] & 255] << 6) | iArr[bArr[i9 + 3] & 255]) < 0) {
                            break;
                        }
                        bArr2[i6 + 2] = (byte) i7;
                        bArr2[i6 + 1] = (byte) (i7 >> 8);
                        bArr2[i6] = (byte) (i7 >> 16);
                        i6 += 3;
                        i9 = i10;
                    }
                    if (i9 >= i4) {
                        break;
                    }
                }
                int i11 = i9 + 1;
                int i12 = iArr[bArr[i9] & 255];
                if (i8 != 0) {
                    if (i8 != 1) {
                        if (i8 != 2) {
                            if (i8 != 3) {
                                if (i8 != 4) {
                                    if (i8 == 5 && i12 != -1) {
                                        this.state = 6;
                                        return false;
                                    }
                                } else if (i12 == -2) {
                                    i8++;
                                } else if (i12 != -1) {
                                    this.state = 6;
                                    return false;
                                }
                            } else if (i12 >= 0) {
                                int i13 = i12 | (i7 << 6);
                                bArr2[i6 + 2] = (byte) i13;
                                bArr2[i6 + 1] = (byte) (i13 >> 8);
                                bArr2[i6] = (byte) (i13 >> 16);
                                i6 += 3;
                                i7 = i13;
                                i8 = 0;
                            } else if (i12 == -2) {
                                bArr2[i6 + 1] = (byte) (i7 >> 2);
                                bArr2[i6] = (byte) (i7 >> 10);
                                i6 += 2;
                                i8 = 5;
                            } else if (i12 != -1) {
                                this.state = 6;
                                return false;
                            }
                        } else if (i12 >= 0) {
                            i12 |= i7 << 6;
                            i8++;
                            i7 = i12;
                        } else if (i12 == -2) {
                            bArr2[i6] = (byte) (i7 >> 4);
                            i6++;
                            i8 = 4;
                        } else if (i12 != -1) {
                            this.state = 6;
                            return false;
                        }
                    } else if (i12 >= 0) {
                        i12 |= i7 << 6;
                        i8++;
                        i7 = i12;
                    } else if (i12 != -1) {
                        this.state = 6;
                        return false;
                    }
                } else if (i12 >= 0) {
                    i8++;
                    i7 = i12;
                } else if (i12 != -1) {
                    this.state = 6;
                    return false;
                }
                i9 = i11;
            }
            if (!z) {
                this.state = i8;
                this.value = i7;
                ((a) this).f10685a = i6;
                return true;
            }
            if (i8 == 1) {
                this.state = 6;
                return false;
            }
            if (i8 == 2) {
                bArr2[i6] = (byte) (i7 >> 4);
                i6++;
            } else if (i8 == 3) {
                int i14 = i6 + 1;
                bArr2[i6] = (byte) (i7 >> 10);
                i6 += 2;
                bArr2[i14] = (byte) (i7 >> 2);
            } else if (i8 == 4) {
                this.state = 6;
                return false;
            }
            this.state = i8;
            ((a) this).f10685a = i6;
            return true;
        }
    }

    public static class c extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ boolean f10688a = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final byte[] f10689b = {HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, SettingsModule.VALUE_TYPE_FLAG, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, APDUConstants.TAG_MORE_DATA, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, HMProSyncDataBaseProfile.DATA_TYPE_HIGH_LOW_HR, 51, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_CORRECT_PPG, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_CHARACTERISTIC, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_MEASURE_PPG, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_MEASURE_RESULT, HMProSyncDataBaseProfile.DATA_TYPE_SLEEP_BREATH_RATE_DATA, HMProSyncDataBaseProfile.DATA_TYPE_SLEEP_BREATH_RATE_EVENT, HMProSyncDataBaseProfile.DATA_SPO2_OSA_EVENT_YORK, HMProSyncDataBaseProfile.DATA_TYPE_BODY_TEMPERATURE_SINGLE};
        private static final byte[] c = {HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, SettingsModule.VALUE_TYPE_FLAG, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, APDUConstants.TAG_MORE_DATA, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, HMProSyncDataBaseProfile.DATA_TYPE_HIGH_LOW_HR, 51, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_CORRECT_PPG, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_CHARACTERISTIC, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_MEASURE_PPG, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_MEASURE_RESULT, HMProSyncDataBaseProfile.DATA_TYPE_SLEEP_BREATH_RATE_DATA, HMProSyncDataBaseProfile.DATA_TYPE_SLEEP_BREATH_RATE_EVENT, 45, 95};

        /* JADX INFO: renamed from: b, reason: collision with other field name */
        int f3b;

        /* JADX INFO: renamed from: b, reason: collision with other field name */
        public final boolean f4b;

        /* JADX INFO: renamed from: c, reason: collision with other field name */
        public final boolean f5c;
        private int count;
        public final boolean d;

        /* JADX INFO: renamed from: d, reason: collision with other field name */
        private final byte[] f6d;
        private final byte[] e;

        public c(int i, byte[] bArr) {
            ((a) this).f2a = bArr;
            this.f4b = (i & 1) == 0;
            boolean z = (i & 2) == 0;
            this.f5c = z;
            this.d = (i & 4) != 0;
            this.e = (i & 8) == 0 ? f10689b : c;
            this.f6d = new byte[2];
            this.f3b = 0;
            this.count = z ? 19 : -1;
        }

        /* JADX WARN: Code duplicated, block: B:101:0x00d4 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:12:0x0050  */
        /* JADX WARN: Code duplicated, block: B:27:0x0094  */
        /* JADX WARN: Code duplicated, block: B:31:0x00d8  */
        /* JADX WARN: Code duplicated, block: B:32:0x00dd A[EDGE_INSN: B:32:0x00dd->B:22:0x008a BREAK  A[LOOP:0: B:25:0x0090->B:33:0x00e3]] */
        /* JADX WARN: Code duplicated, block: B:33:0x00e3 A[LOOP:0: B:25:0x0090->B:33:0x00e3, LOOP_END] */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        public boolean a(byte[] r19, int r20, int r21, boolean r22) {
            /*
                Method dump skipped, instruction units count: 515
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ta.utdid2.a.a.b.c.a(byte[], int, int, boolean):boolean");
        }
    }

    private b() {
    }

    public static byte[] decode(String str, int i) {
        return decode(str.getBytes(), i);
    }

    public static byte[] encode(byte[] bArr, int i) {
        return encode(bArr, 0, bArr.length, i);
    }

    public static String encodeToString(byte[] bArr, int i) {
        try {
            return new String(encode(bArr, i), "US-ASCII");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public static byte[] decode(byte[] bArr, int i) {
        return decode(bArr, 0, bArr.length, i);
    }

    @SuppressLint({"Assert"})
    public static byte[] encode(byte[] bArr, int i, int i2, int i3) {
        c cVar = new c(i3, null);
        int i4 = (i2 / 3) * 4;
        if (!cVar.f4b) {
            int i5 = i2 % 3;
            if (i5 == 1) {
                i4 += 2;
            } else if (i5 == 2) {
                i4 += 3;
            }
        } else if (i2 % 3 > 0) {
            i4 += 4;
        }
        if (cVar.f5c && i2 > 0) {
            i4 += (((i2 - 1) / 57) + 1) * (cVar.d ? 2 : 1);
        }
        ((a) cVar).f2a = new byte[i4];
        cVar.a(bArr, i, i2, true);
        if (f10684a || ((a) cVar).f10685a == i4) {
            return ((a) cVar).f2a;
        }
        throw new AssertionError();
    }

    public static byte[] decode(byte[] bArr, int i, int i2, int i3) {
        C0337b c0337b = new C0337b(i3, new byte[(i2 * 3) / 4]);
        if (c0337b.a(bArr, i, i2, true)) {
            int i4 = ((a) c0337b).f10685a;
            byte[] bArr2 = ((a) c0337b).f2a;
            if (i4 == bArr2.length) {
                return bArr2;
            }
            byte[] bArr3 = new byte[i4];
            System.arraycopy(bArr2, 0, bArr3, 0, i4);
            return bArr3;
        }
        throw new IllegalArgumentException("bad base-64");
    }
}
