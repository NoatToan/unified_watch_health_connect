package i1;

import android.util.Size;
import androidx.camera.core.impl.e1;
import androidx.camera.core.impl.f1;
import androidx.camera.core.impl.i;
import androidx.camera.core.impl.k;
import androidx.camera.core.impl.k0;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.firebase.messaging.l;
import g1.f0;
import h62.j;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import o13.m;
import o13.t;
import p005kotlin.Metadata;
import p13.w;
import z0.u;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u000bB%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Li1/a;", "Landroidx/camera/core/impl/e1;", "Landroidx/camera/core/impl/k0;", "cameraInfo", "", "Lz0/u;", "targetQualities", "Lg1/f0$a;", "videoEncoderInfoFinder", "<init>", "(Landroidx/camera/core/impl/k0;Ljava/util/List;Lg1/f0$a;)V", "a", "camera-video_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a implements e1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k0 f86973c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<u> f86974d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f0.a f86975e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f86976f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f86977g;

    static {
        new C1726a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(k0 k0Var, List<? extends u> list, f0.a aVar) {
        k0Var.getClass();
        list.getClass();
        aVar.getClass();
        this.f86973c = k0Var;
        this.f86974d = list;
        this.f86975e = aVar;
        this.f86976f = m.b(new j(this, 23));
        this.f86977g = new LinkedHashMap();
    }

    public static k c(a aVar, int i14, int i15, int i16) {
        return new k(2, MimeTypes.VIDEO_H264, i16, 30, i14, i15, -1, 8, 0, 0);
    }

    @Override // androidx.camera.core.impl.e1
    public final f1 a(int i14) {
        return d(i14);
    }

    @Override // androidx.camera.core.impl.e1
    public final boolean b(int i14) {
        return d(i14) != null;
    }

    public final f1 d(int i14) {
        int i15;
        Object next;
        int i16;
        k kVarC;
        u uVar;
        Integer numValueOf = Integer.valueOf(i14);
        LinkedHashMap linkedHashMap = this.f86977g;
        if (linkedHashMap.containsKey(numValueOf)) {
            return (f1) linkedHashMap.get(Integer.valueOf(i14));
        }
        Iterator<T> it = this.f86974d.iterator();
        do {
            if (!it.hasNext()) {
                i15 = i14;
                next = null;
                break;
            }
            next = it.next();
            uVar = (u) next;
            uVar.getClass();
            i15 = i14;
        } while (((u.b) uVar).d() != i15);
        u.b bVar = next instanceof u.b ? (u.b) next : null;
        if (bVar != null) {
            Iterator<Size> it3 = bVar.c().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    kVarC = null;
                    break;
                }
                Size next2 = it3.next();
                if (((List) this.f86976f.getValue()).contains(next2)) {
                    int width = next2.getWidth();
                    int height = next2.getHeight();
                    if (bVar.equals(u.f200711d)) {
                        i16 = 40000000;
                    } else if (bVar.equals(u.f200710c)) {
                        i16 = 10000000;
                    } else if (bVar.equals(u.f200709b)) {
                        i16 = 4000000;
                    } else {
                        if (!bVar.equals(u.f200708a)) {
                            l.j(bVar, "Undefined bitrate for quality: ");
                            return null;
                        }
                        i16 = 2000000;
                    }
                    kVarC = c(this, width, height, i16);
                    f0 f0VarFind = this.f86975e.find(kVarC.f5581b);
                    if (f0VarFind != null && f0VarFind.b(width, height)) {
                        Integer num = (Integer) f0VarFind.c().clamp(Integer.valueOf(i16));
                        if (num == null || num.intValue() != i16) {
                            num.getClass();
                            kVarC = c(this, width, height, num.intValue());
                        }
                    } else {
                        kVarC = null;
                    }
                    if (kVarC != null) {
                        break;
                    }
                }
            }
        } else {
            kVarC = null;
            break;
        }
        androidx.camera.core.impl.j jVarE = kVarC != null ? f1.b.e(60, 2, w.c(new i(3, MimeTypes.AUDIO_AAC, 96000, 44100, 1, 2)), w.c(kVarC)) : null;
        linkedHashMap.put(Integer.valueOf(i15), jVarE);
        return jVarE;
    }

    /* JADX INFO: renamed from: i1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0006R\u0014\u0010\u0016\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0016\u0010\u000bR\u0014\u0010\u0017\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0006R\u0014\u0010\u0018\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0006R\u0014\u0010\u0019\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0006R\u0014\u0010\u001a\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0006¨\u0006\u001b"}, d2 = {"Li1/a$a;", "", "<init>", "()V", "", "DEFAULT_DURATION_SECONDS", "I", "DEFAULT_OUTPUT_FORMAT", "DEFAULT_VIDEO_CODEC", "", "DEFAULT_VIDEO_MIME_TYPE", "Ljava/lang/String;", "DEFAULT_VIDEO_FRAME_RATE", "DEFAULT_VIDEO_PROFILE", "DEFAULT_VIDEO_BIT_DEPTH", "DEFAULT_VIDEO_CHROMA_SUBSAMPLING", "DEFAULT_VIDEO_HDR_FORMAT", "DEFAULT_VIDEO_BITRATE_UHD", "DEFAULT_VIDEO_BITRATE_FHD", "DEFAULT_VIDEO_BITRATE_HD", "DEFAULT_VIDEO_BITRATE_SD", "DEFAULT_AUDIO_CODEC", "DEFAULT_AUDIO_MIME_TYPE", "DEFAULT_AUDIO_BITRATE", "DEFAULT_AUDIO_SAMPLE_RATE", "DEFAULT_AUDIO_CHANNELS", "DEFAULT_AUDIO_PROFILE", "camera-video_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C1726a {
        public /* synthetic */ C1726a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C1726a() {
        }
    }
}
