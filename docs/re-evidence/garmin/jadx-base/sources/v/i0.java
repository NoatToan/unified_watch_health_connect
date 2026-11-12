package v;

import android.media.CamcorderProfile;
import android.media.EncoderProfiles;
import android.os.Build;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.CamcorderProfileResolutionQuirk;
import androidx.camera.camera2.internal.compat.quirk.InvalidVideoProfilesQuirk;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class i0 implements androidx.camera.core.impl.e1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f173839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f173840d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f173841e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f173842f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final androidx.camera.core.impl.i2 f173843g;

    public static class a {
        private a() {
        }

        public static EncoderProfiles a(int i14, String str) {
            return CamcorderProfile.getAll(str, i14);
        }
    }

    public i0(String str, androidx.camera.core.impl.i2 i2Var) {
        boolean z14;
        int i14;
        this.f173840d = str;
        try {
            i14 = Integer.parseInt(str);
            z14 = true;
        } catch (NumberFormatException unused) {
            z14 = false;
            i14 = -1;
        }
        this.f173839c = z14;
        this.f173841e = i14;
        this.f173843g = i2Var;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003a  */
    /* JADX WARN: Code duplicated, block: B:31:0x007d  */
    /* JADX WARN: Code duplicated, block: B:33:0x008b  */
    /* JADX WARN: Code duplicated, block: B:35:0x008f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0092  */
    /* JADX WARN: Code duplicated, block: B:37:0x0095  */
    /* JADX WARN: Code duplicated, block: B:38:0x0098  */
    /* JADX WARN: Code duplicated, block: B:39:0x009b  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ab A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:46:0x00af  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:53:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:54:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:58:0x00db  */
    /* JADX WARN: Code duplicated, block: B:59:0x00de  */
    /* JADX WARN: Code duplicated, block: B:64:0x010b  */
    /* JADX WARN: Code duplicated, block: B:91:0x0183  */
    /* JADX WARN: Code duplicated, block: B:96:0x0073 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // androidx.camera.core.impl.e1
    public final androidx.camera.core.impl.f1 a(int i14) {
        CamcorderProfile camcorderProfile;
        int i15;
        String str;
        int i16;
        int i17;
        String str2;
        androidx.camera.core.impl.j jVarE;
        boolean zContains;
        androidx.camera.core.impl.f1 f1VarA;
        androidx.camera.core.impl.f1 f1Var = null;
        if (!this.f173839c || !CamcorderProfile.hasProfile(this.f173841e, i14)) {
            return null;
        }
        if (this.f173842f.containsKey(Integer.valueOf(i14))) {
            return (androidx.camera.core.impl.f1) this.f173842f.get(Integer.valueOf(i14));
        }
        int i18 = Build.VERSION.SDK_INT;
        if (i18 < 31) {
            try {
                camcorderProfile = CamcorderProfile.get(this.f173841e, i14);
            } catch (RuntimeException unused) {
                camcorderProfile = null;
            }
            if (camcorderProfile != null) {
                int i19 = camcorderProfile.duration;
                int i24 = camcorderProfile.fileFormat;
                ArrayList arrayList = new ArrayList();
                i15 = camcorderProfile.audioCodec;
                switch (i15) {
                    case 1:
                        str = MimeTypes.AUDIO_AMR_NB;
                        break;
                    case 2:
                        str = MimeTypes.AUDIO_AMR_WB;
                        break;
                    case 3:
                    case 4:
                    case 5:
                        str = MimeTypes.AUDIO_AAC;
                        break;
                    case 6:
                        str = MimeTypes.AUDIO_VORBIS;
                        break;
                    case 7:
                        str = MimeTypes.AUDIO_OPUS;
                        break;
                    default:
                        str = "audio/none";
                        break;
                }
                String str3 = str;
                int i25 = camcorderProfile.audioBitRate;
                int i26 = camcorderProfile.audioSampleRate;
                int i27 = camcorderProfile.audioChannels;
                if (i15 != 3) {
                    i16 = 5;
                    if (i15 != 4) {
                        if (i15 != 5) {
                            i16 = -1;
                        } else {
                            i16 = 39;
                        }
                    }
                } else {
                    i16 = 2;
                }
                arrayList.add(new androidx.camera.core.impl.i(i15, str3, i25, i26, i27, i16));
                ArrayList arrayList2 = new ArrayList();
                i17 = camcorderProfile.videoCodec;
                switch (i17) {
                    case 1:
                        str2 = MimeTypes.VIDEO_H263;
                        break;
                    case 2:
                        str2 = MimeTypes.VIDEO_H264;
                        break;
                    case 3:
                        str2 = MimeTypes.VIDEO_MP4V;
                        break;
                    case 4:
                        str2 = MimeTypes.VIDEO_VP8;
                        break;
                    case 5:
                        str2 = MimeTypes.VIDEO_H265;
                        break;
                    case 6:
                        str2 = MimeTypes.VIDEO_VP9;
                        break;
                    case 7:
                        str2 = MimeTypes.VIDEO_DOLBY_VISION;
                        break;
                    case 8:
                        str2 = MimeTypes.VIDEO_AV1;
                        break;
                    default:
                        str2 = "video/none";
                        break;
                }
                arrayList2.add(new androidx.camera.core.impl.k(i17, str2, camcorderProfile.videoBitRate, camcorderProfile.videoFrameRate, camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight, -1, 8, 0, 0));
                jVarE = androidx.camera.core.impl.f1.b.e(i19, i24, arrayList, arrayList2);
            } else {
                jVarE = null;
            }
        } else {
            EncoderProfiles encoderProfilesA = a.a(i14, this.f173840d);
            if (encoderProfilesA == null) {
                jVarE = null;
            } else if (x.c.f188202a.b(InvalidVideoProfilesQuirk.class) != null) {
                camcorderProfile = CamcorderProfile.get(this.f173841e, i14);
                if (camcorderProfile != null) {
                    int i110 = camcorderProfile.duration;
                    int i28 = camcorderProfile.fileFormat;
                    ArrayList arrayList3 = new ArrayList();
                    i15 = camcorderProfile.audioCodec;
                    switch (i15) {
                        case 1:
                            str = MimeTypes.AUDIO_AMR_NB;
                            break;
                        case 2:
                            str = MimeTypes.AUDIO_AMR_WB;
                            break;
                        case 3:
                        case 4:
                        case 5:
                            str = MimeTypes.AUDIO_AAC;
                            break;
                        case 6:
                            str = MimeTypes.AUDIO_VORBIS;
                            break;
                        case 7:
                            str = MimeTypes.AUDIO_OPUS;
                            break;
                        default:
                            str = "audio/none";
                            break;
                    }
                    String str4 = str;
                    int i29 = camcorderProfile.audioBitRate;
                    int i210 = camcorderProfile.audioSampleRate;
                    int i211 = camcorderProfile.audioChannels;
                    if (i15 != 3) {
                        i16 = 5;
                        if (i15 != 4) {
                            if (i15 != 5) {
                                i16 = -1;
                            } else {
                                i16 = 39;
                            }
                        }
                    } else {
                        i16 = 2;
                    }
                    arrayList3.add(new androidx.camera.core.impl.i(i15, str4, i29, i210, i211, i16));
                    ArrayList arrayList4 = new ArrayList();
                    i17 = camcorderProfile.videoCodec;
                    switch (i17) {
                        case 1:
                            str2 = MimeTypes.VIDEO_H263;
                            break;
                        case 2:
                            str2 = MimeTypes.VIDEO_H264;
                            break;
                        case 3:
                            str2 = MimeTypes.VIDEO_MP4V;
                            break;
                        case 4:
                            str2 = MimeTypes.VIDEO_VP8;
                            break;
                        case 5:
                            str2 = MimeTypes.VIDEO_H265;
                            break;
                        case 6:
                            str2 = MimeTypes.VIDEO_VP9;
                            break;
                        case 7:
                            str2 = MimeTypes.VIDEO_DOLBY_VISION;
                            break;
                        case 8:
                            str2 = MimeTypes.VIDEO_AV1;
                            break;
                        default:
                            str2 = "video/none";
                            break;
                    }
                    arrayList4.add(new androidx.camera.core.impl.k(i17, str2, camcorderProfile.videoBitRate, camcorderProfile.videoFrameRate, camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight, -1, 8, 0, 0));
                    jVarE = androidx.camera.core.impl.f1.b.e(i110, i28, arrayList3, arrayList4);
                } else {
                    jVarE = null;
                }
            } else {
                try {
                    if (i18 >= 33) {
                        jVarE = i0.b.a(encoderProfilesA);
                    } else {
                        if (i18 < 31) {
                            throw new RuntimeException("Unable to call from(EncoderProfiles) on API " + i18 + ". Version 31 or higher required.");
                        }
                        jVarE = i0.a.a(encoderProfilesA);
                    }
                } catch (NullPointerException unused2) {
                    camcorderProfile = CamcorderProfile.get(this.f173841e, i14);
                    if (camcorderProfile != null) {
                        int i111 = camcorderProfile.duration;
                        int i212 = camcorderProfile.fileFormat;
                        ArrayList arrayList5 = new ArrayList();
                        i15 = camcorderProfile.audioCodec;
                        switch (i15) {
                            case 1:
                                str = MimeTypes.AUDIO_AMR_NB;
                                break;
                            case 2:
                                str = MimeTypes.AUDIO_AMR_WB;
                                break;
                            case 3:
                            case 4:
                            case 5:
                                str = MimeTypes.AUDIO_AAC;
                                break;
                            case 6:
                                str = MimeTypes.AUDIO_VORBIS;
                                break;
                            case 7:
                                str = MimeTypes.AUDIO_OPUS;
                                break;
                            default:
                                str = "audio/none";
                                break;
                        }
                        String str5 = str;
                        int i213 = camcorderProfile.audioBitRate;
                        int i214 = camcorderProfile.audioSampleRate;
                        int i215 = camcorderProfile.audioChannels;
                        if (i15 != 3) {
                            i16 = 5;
                            if (i15 != 4) {
                                if (i15 != 5) {
                                    i16 = -1;
                                } else {
                                    i16 = 39;
                                }
                            }
                        } else {
                            i16 = 2;
                        }
                        arrayList5.add(new androidx.camera.core.impl.i(i15, str5, i213, i214, i215, i16));
                        ArrayList arrayList6 = new ArrayList();
                        i17 = camcorderProfile.videoCodec;
                        switch (i17) {
                            case 1:
                                str2 = MimeTypes.VIDEO_H263;
                                break;
                            case 2:
                                str2 = MimeTypes.VIDEO_H264;
                                break;
                            case 3:
                                str2 = MimeTypes.VIDEO_MP4V;
                                break;
                            case 4:
                                str2 = MimeTypes.VIDEO_VP8;
                                break;
                            case 5:
                                str2 = MimeTypes.VIDEO_H265;
                                break;
                            case 6:
                                str2 = MimeTypes.VIDEO_VP9;
                                break;
                            case 7:
                                str2 = MimeTypes.VIDEO_DOLBY_VISION;
                                break;
                            case 8:
                                str2 = MimeTypes.VIDEO_AV1;
                                break;
                            default:
                                str2 = "video/none";
                                break;
                        }
                        arrayList6.add(new androidx.camera.core.impl.k(i17, str2, camcorderProfile.videoBitRate, camcorderProfile.videoFrameRate, camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight, -1, 8, 0, 0));
                        jVarE = androidx.camera.core.impl.f1.b.e(i111, i212, arrayList5, arrayList6);
                    } else {
                        jVarE = null;
                    }
                }
            }
        }
        if (jVarE == null) {
            f1Var = jVarE;
        } else {
            CamcorderProfileResolutionQuirk camcorderProfileResolutionQuirk = (CamcorderProfileResolutionQuirk) this.f173843g.b(CamcorderProfileResolutionQuirk.class);
            if (camcorderProfileResolutionQuirk == null) {
                zContains = true;
            } else {
                List<androidx.camera.core.impl.f1.c> list = jVarE.f5579d;
                if (list.isEmpty()) {
                    zContains = true;
                } else {
                    androidx.camera.core.impl.f1.c cVar = list.get(0);
                    if (camcorderProfileResolutionQuirk.f5376b == null) {
                        Size[] sizeArrA = camcorderProfileResolutionQuirk.f5375a.a(34);
                        List<Size> listAsList = sizeArrA != null ? Arrays.asList((Size[]) sizeArrA.clone()) : Collections.EMPTY_LIST;
                        camcorderProfileResolutionQuirk.f5376b = listAsList;
                        Objects.toString(listAsList);
                    }
                    zContains = new ArrayList(camcorderProfileResolutionQuirk.f5376b).contains(cVar.j());
                }
            }
            if (zContains) {
                f1Var = jVarE;
            } else if (i14 == 1) {
                Iterator<Integer> it = androidx.camera.core.impl.e1.f5539b.iterator();
                while (it.hasNext()) {
                    f1VarA = a(it.next().intValue());
                    if (f1VarA != null) {
                        f1Var = f1VarA;
                    }
                }
            } else if (i14 == 0) {
                for (int size = androidx.camera.core.impl.e1.f5539b.size() - 1; size >= 0; size--) {
                    f1VarA = a(size);
                    if (f1VarA != null) {
                        f1Var = f1VarA;
                    }
                }
            }
        }
        this.f173842f.put(Integer.valueOf(i14), f1Var);
        return f1Var;
    }

    @Override // androidx.camera.core.impl.e1
    public final boolean b(int i14) {
        return this.f173839c && a(i14) != null;
    }
}
