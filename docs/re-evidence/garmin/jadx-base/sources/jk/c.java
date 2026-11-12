package jk;

import com.google.android.exoplayer2.audio.WavUtil;

/* JADX INFO: loaded from: classes7.dex */
public class c extends p {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public j.c f99000m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final byte f99001n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final byte f99002o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final byte[] f99003p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f99004q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f99005r;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f99006a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f99007b;

        static {
            int[] iArr = new int[j.f.values().length];
            f99007b = iArr;
            try {
                iArr[j.f.FAIL_CRC_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f99007b[j.f.FAIL_DEVICE_TRANSMISSION_LOST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f99007b[j.f.FAIL_INVALID_RESPONSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f99007b[j.f.FAIL_NO_RESPONSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f99007b[j.f.FAIL_REJECTED_INCORRECT_CRC.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f99007b[j.f.FAIL_REJECTED_INVALID_REQUEST.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f99007b[j.f.FAIL_REJECTED_NOT_READY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f99007b[j.f.FAIL_REJECTED_FILE_DOES_NOT_EXIST.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f99007b[j.f.FAIL_REJECTED_FILE_NOT_READABLE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f99007b[j.f.FAIL_OTHER.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f99007b[j.f.SUCCESS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            int[] iArr2 = new int[j.EnumC1907j.values().length];
            f99006a = iArr2;
            try {
                iArr2[j.EnumC1907j.FAIL_INVALID_RESPONSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f99006a[j.EnumC1907j.FAIL_NO_RESPONSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f99006a[j.EnumC1907j.FAIL_REJECTED_BAD_CRC.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f99006a[j.EnumC1907j.FAIL_REJECTED_FILE_DOES_NOT_EXIST.ordinal()] = 4;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f99006a[j.EnumC1907j.FAIL_REJECTED_FILE_NOT_WRITEABLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f99006a[j.EnumC1907j.FAIL_REJECTED_INVALID_REQUEST.ordinal()] = 6;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f99006a[j.EnumC1907j.FAIL_REJECTED_NOT_ENOUGH_SPACE.ordinal()] = 7;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f99006a[j.EnumC1907j.FAIL_REJECTED_NOT_READY.ordinal()] = 8;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f99006a[j.EnumC1907j.FAIL_REJECTED_OFFSET_OUT_OF_RANGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f99006a[j.EnumC1907j.FAIL_TOO_MANY_RETRIES.ordinal()] = 10;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f99006a[j.EnumC1907j.FAIL_UPLOAD_NOT_ENABLED.ordinal()] = 11;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f99006a[j.EnumC1907j.FAIL_OTHER.ordinal()] = 12;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f99006a[j.EnumC1907j.SUCCESS.ordinal()] = 13;
            } catch (NoSuchFieldError unused24) {
            }
        }
    }

    public c(j.k kVar, byte b14, byte b15, byte[] bArr, boolean z14, boolean z15) {
        super(kVar);
        this.f99001n = b14;
        this.f99002o = b15;
        this.f99004q = z14;
        this.f99005r = z15;
        this.f99003p = bArr;
    }

    @Override // ok.e
    public final void a(bk.l lVar, dk.a aVar) {
    }

    @Override // ok.e
    public final void c() {
        e();
        this.f99000m = new j.c();
        byte[] bArr = this.f99003p;
        byte[] bArr2 = new byte[bArr.length + 4];
        byte b14 = this.f99002o;
        bArr2[0] = b14;
        byte b15 = this.f99001n;
        bArr2[3] = b15;
        System.arraycopy(bArr, 0, bArr2, 4, bArr.length);
        q qVar = new q(this.f99181l, null, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE, 0L, bArr2, 7500, this.f99004q);
        ((j) this.f132437e).getClass();
        r(qVar, null);
        j.EnumC1907j enumC1907j = qVar.B;
        switch (a.f99006a[enumC1907j.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                this.f99000m.f99081a = j.d.FAIL_COMMAND_NOT_SENT;
                return;
            case 12:
                break;
            case 13:
                j.c cVar = this.f99000m;
                cVar.f99082b = null;
                j.d dVar = j.d.SUCCESS;
                cVar.f99081a = dVar;
                if (this.f99005r) {
                    e eVar = new e(this.f99181l, null, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE, 0);
                    r(eVar, null);
                    j.f fVar = eVar.I;
                    switch (a.f99007b[fVar.ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            this.f99000m.f99081a = j.d.FAIL_RESPONSE_DOWNLOAD_ERROR;
                            return;
                        case 8:
                        case 9:
                            this.f99000m.f99081a = j.d.SUCCESS_NO_RESPONSE;
                            return;
                        case 10:
                            break;
                        case 11:
                            byte[] bArr3 = eVar.f99018p;
                            if (bArr3[3] != b15) {
                                this.f99000m.f99081a = j.d.SUCCESS_NO_RESPONSE;
                                int i14 = qk.b.f145071a;
                                return;
                            }
                            if (bArr3[0] == 2) {
                                if (bArr3[4] != b14) {
                                    this.f99000m.f99081a = j.d.SUCCESS_NO_RESPONSE;
                                    return;
                                }
                                byte b16 = bArr3[6];
                                if (b16 == 0) {
                                    this.f99000m.f99081a = dVar;
                                } else if (b16 == 1) {
                                    this.f99000m.f99081a = j.d.FAIL_COMMAND_FAILURE;
                                } else if (b16 == 2) {
                                    this.f99000m.f99081a = j.d.FAIL_COMMAND_REJECTED;
                                } else if (b16 != 3) {
                                    int i15 = qk.b.f145071a;
                                    this.f99000m.f99081a = j.d.FAIL_COMMAND_FAILURE;
                                } else {
                                    this.f99000m.f99081a = j.d.FAIL_COMMAND_NOT_SUPPORTED;
                                }
                                this.f99000m.f99082b = bArr3;
                                return;
                            }
                            return;
                        default:
                            fVar.toString();
                            int i16 = qk.b.f145071a;
                            break;
                    }
                    this.f99000m.f99081a = j.d.FAIL_OTHER;
                    return;
                }
                return;
            default:
                enumC1907j.toString();
                int i17 = qk.b.f145071a;
                break;
        }
        this.f99000m.f99081a = j.d.FAIL_OTHER;
    }

    @Override // ok.e
    public final String f() {
        return "ANT-FS Host command pipe task";
    }

    @Override // jk.p
    public final boolean s(j.h hVar) {
        return hVar == j.h.TRANSPORT_IDLE;
    }
}
